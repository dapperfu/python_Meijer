package com.meijer.mobile.serverapi.response.gasstation;

import com.meijer.mobile.storeinfo.api.model.StoreInfo;

/* loaded from: classes12.dex */
public class GasStationAndRewardsResponse {
    public GasStationAmenitiesResponse gasStationAmenitiesResponse;
    public StoreInfo storesResponse;

    public GasStationAndRewardsResponse(StoreInfo storeInfo, GasStationAmenitiesResponse gasStationAmenitiesResponse) {
        this.storesResponse = storeInfo;
        this.gasStationAmenitiesResponse = gasStationAmenitiesResponse;
    }
}
