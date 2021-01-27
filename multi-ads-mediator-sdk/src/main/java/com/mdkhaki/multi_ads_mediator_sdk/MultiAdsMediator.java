package com.mdkhaki.multi_ads_mediator_sdk;

import android.app.Application;

import java.util.Arrays;

import ir.tapsell.sdk.Tapsell;

public class MultiAdsMediator {

    private void test(Application application, String appID, Arrays networks) {

        initialize(application, appID, new NetworkCustom(true, true,true));
    }

    public static void initialize(Application application, String appID, NetworkCustom networkCustom) {

        if (networkCustom.tapsellAds) {
            Tapsell.initialize(application, appID);
        }
    }

}
