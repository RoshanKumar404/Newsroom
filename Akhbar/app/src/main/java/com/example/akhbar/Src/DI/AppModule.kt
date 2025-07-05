package com.example.akhbar.Src.DI

import android.app.Application
import com.example.akhbar.Src.Data.manager.LocaluserManagerImplementation
import com.example.akhbar.Src.Domain.manager.LocalUserManager
import com.example.akhbar.Src.Domain.manager.Usecase.AppEntryuseCases
import com.example.akhbar.Src.Domain.manager.Usecase.ReadAppEntry
import com.example.akhbar.Src.Domain.manager.Usecase.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule{
    @Provides
    @Singleton
    fun provideLocalUsermanager(
        application: Application
    ):LocalUserManager=LocaluserManagerImplementation(application)



    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    )=AppEntryuseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

}
