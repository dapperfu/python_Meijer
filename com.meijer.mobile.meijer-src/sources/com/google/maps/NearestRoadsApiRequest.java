package com.google.maps;

import com.google.maps.RoadsApi;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.StringJoin;
import com.google.maps.model.LatLng;
import com.google.maps.model.SnappedPoint;

/* loaded from: classes8.dex */
public class NearestRoadsApiRequest extends PendingResultBase<SnappedPoint[], NearestRoadsApiRequest, RoadsApi.RoadsResponse> {
    private static final ApiConfig NEAREST_ROADS_API_CONFIG = new ApiConfig("/v1/nearestRoads").hostName("https://roads.googleapis.com").supportsClientId(false).fieldNamingPolicy(com.google.gson.c.f90258a);

    public NearestRoadsApiRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, NEAREST_ROADS_API_CONFIG, RoadsApi.RoadsResponse.class);
    }

    public NearestRoadsApiRequest points(LatLng... latLngArr) {
        return param("points", StringJoin.join('|', (StringJoin.UrlValue[]) latLngArr));
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase channel(String str) {
        return super.channel(str);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase custom(String str, String str2) {
        return super.custom(str, str2);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase experienceIds(String[] strArr) {
        return super.experienceIds(strArr);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase header(String str, String str2) {
        return super.header(str, str2);
    }

    @Override // com.google.maps.PendingResultBase
    protected void validateRequest() {
        if (params().containsKey("points")) {
        } else {
            throw new IllegalArgumentException("Request must contain 'path");
        }
    }
}
