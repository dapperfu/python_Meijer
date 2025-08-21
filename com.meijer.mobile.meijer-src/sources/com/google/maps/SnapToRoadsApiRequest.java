package com.google.maps;

import com.google.maps.RoadsApi;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.StringJoin;
import com.google.maps.model.LatLng;
import com.google.maps.model.SnappedPoint;

/* loaded from: classes8.dex */
public class SnapToRoadsApiRequest extends PendingResultBase<SnappedPoint[], SnapToRoadsApiRequest, RoadsApi.RoadsResponse> {
    private static final ApiConfig SNAP_TO_ROADS_API_CONFIG = new ApiConfig("/v1/snapToRoads").hostName("https://roads.googleapis.com").supportsClientId(false).fieldNamingPolicy(com.google.gson.c.f90258a);

    public SnapToRoadsApiRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, SNAP_TO_ROADS_API_CONFIG, RoadsApi.RoadsResponse.class);
    }

    public SnapToRoadsApiRequest interpolate(boolean z10) {
        return param("interpolate", String.valueOf(z10));
    }

    public SnapToRoadsApiRequest path(LatLng... latLngArr) {
        return param("path", StringJoin.join('|', (StringJoin.UrlValue[]) latLngArr));
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
        if (params().containsKey("path")) {
        } else {
            throw new IllegalArgumentException("Request must contain 'path");
        }
    }
}
