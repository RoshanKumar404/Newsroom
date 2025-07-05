package com.example.akhbar.Src.Domain.manager.Usecase

import com.example.akhbar.Src.Domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry( private  val localUserManager:LocalUserManager
 ){
    suspend operator  fun invoke():Flow<Boolean>{
        return localUserManager.readAppEntry()
    }
 }

