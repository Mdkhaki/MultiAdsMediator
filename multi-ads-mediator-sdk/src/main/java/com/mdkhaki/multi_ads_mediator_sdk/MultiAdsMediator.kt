package com.mdkhaki.multi_ads_mediator_sdk

import android.app.Application
import ir.tapsell.sdk.Tapsell
import java.util.*

class MultiAdsMediator {
    private fun test(application: Application, appID: String, networks: Arrays) {
        initialize(application, appID, NetworkCustom(tapsellAds = true,unityAds = true,chartBoostAds = true))
    }

    companion object {
        fun initialize(application: Application?, appID: String?, networkCustom: NetworkCustom) {
            if (networkCustom.tapsellAds) {
                Tapsell.initialize(application, appID)
            }
        }
    }
}