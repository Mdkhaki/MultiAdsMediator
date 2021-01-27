package com.mdkhaki.multi_ads_mediator_sdk;

public class NetworkCustom {
    public boolean tapsellAds = false;
    public boolean unityAds = false;
    public boolean chartBoostAds = false;

    public NetworkCustom(boolean tapsellAds, boolean unityAds, boolean chartBoostAds) {
        this.tapsellAds = tapsellAds;
        this.unityAds = unityAds;
        this.chartBoostAds = chartBoostAds;
    }

    public boolean isTapsellAds() {
        return tapsellAds;
    }

    public void setTapsellAds(boolean tapsellAds) {
        this.tapsellAds = tapsellAds;
    }

    public boolean isUnityAds() {
        return unityAds;
    }

    public void setUnityAds(boolean unityAds) {
        this.unityAds = unityAds;
    }

    public boolean isChartBoostAds() {
        return chartBoostAds;
    }

    public void setChartBoostAds(boolean chartBoostAds) {
        this.chartBoostAds = chartBoostAds;
    }
}
