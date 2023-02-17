package com.game.egypt.quiz.egypetblitz.deadcat.app.cas.game

import android.app.Application
import com.onesignal.OneSignal
import org.json.JSONObject

class inits : Application() {

    override fun onCreate() {
        super.onCreate()
        try {
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
            OneSignal.initWithContext(this)
            OneSignal.setAppId(key.on)
            OneSignal.setExternalUserId(id!!, object :
                OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(jsonObject: JSONObject) {

                }

                override fun onFailure(externalIdError: OneSignal.ExternalIdError) {


                }
            })
        } catch (e: Exception) {

        }
    }
}