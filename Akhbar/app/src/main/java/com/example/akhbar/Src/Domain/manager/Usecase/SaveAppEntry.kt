package com.example.akhbar.Src.Domain.manager.Usecase

import com.example.akhbar.Src.Domain.manager.LocalUserManager

class SaveAppEntry(  private  val localUserManager:LocalUserManager)
{
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}