package com.example.akhbar.Src.Data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import com.example.akhbar.Src.Domain.manager.LocalUserManager
import com.example.akhbar.Src.Util.Constants.USER_SETTINGS
import kotlinx.coroutines.flow.Flow
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
//import androidx.datastore.preferences.core.preferencesDatastore
import androidx.datastore.preferences.preferencesDataStore
import com.example.akhbar.Src.Util.Constants
import kotlinx.coroutines.flow.map
import kotlin.math.cos


class LocaluserManagerImplementation (
    private val  context:Context
    ):LocalUserManager{
    override suspend fun saveAppEntry() {
        context.datastore.edit { settings->
            settings[PreferenceKeys.APP_ENTRY]
        }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.datastore.data.map { preferences->
            preferences[PreferenceKeys.APP_ENTRY]?:false
        }
    }

}
// ******* both the lines achieve the same goal , the first one is updated one
//private val Context.datastore by preferencesDataStore(name = USER_SETTINGS)
//private val  Context.datastore:DataStore<Preferences>by preferenceDataStore(name =USER_SETTINGS)
private val Context.datastore by preferencesDataStore(name = USER_SETTINGS)
//private val Context.datastore: DataStore<Preferences> by preferencesDataStore(name = USER_SETTINGS)
private object   PreferenceKeys{
    val APP_ENTRY= booleanPreferencesKey(name = Constants.APP_ENTRY)
}