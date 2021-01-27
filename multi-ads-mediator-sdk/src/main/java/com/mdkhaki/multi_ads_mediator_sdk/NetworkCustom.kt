package com.mdkhaki.multi_ads_mediator_sdk

class NetworkCustom(tapsellAds: Boolean = true, unityAds: Boolean = true, chartBoostAds: Boolean = true) {
    var tapsellAds = false
    var unityAds = false
    var chartBoostAds = false

    init {
        this.tapsellAds = tapsellAds
        this.unityAds = unityAds
        this.chartBoostAds = chartBoostAds
    }
}