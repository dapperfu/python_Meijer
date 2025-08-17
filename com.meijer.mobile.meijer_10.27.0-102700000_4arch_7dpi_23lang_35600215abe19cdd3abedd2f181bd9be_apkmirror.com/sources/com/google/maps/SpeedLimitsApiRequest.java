package com.google.maps;

import com.google.maps.RoadsApi;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.StringJoin;
import com.google.maps.model.LatLng;
import com.google.maps.model.SnappedSpeedLimitResult;

/* loaded from: classes7.dex */
public class SpeedLimitsApiRequest extends PendingResultBase<SnappedSpeedLimitResult, SpeedLimitsApiRequest, RoadsApi.SpeedLimitsResponse> {
    private static final ApiConfig SPEEDS_API_CONFIG = new ApiConfig("/v1/speedLimits").hostName("https://roads.googleapis.com").supportsClientId(false).fieldNamingPolicy(com.google.gson.c.f89416a);

    public SpeedLimitsApiRequest placeIds(String... strArr) {
        for (String str : strArr) {
            paramAddToList("placeId", str);
        }
        return this;
    }

    public SpeedLimitsApiRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, SPEEDS_API_CONFIG, RoadsApi.SpeedLimitsResponse.class);
    }

    public SpeedLimitsApiRequest path(LatLng... latLngArr) {
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
        if (!params().containsKey("path") && !params().containsKey("placeId")) {
            throw new IllegalArgumentException("Request must contain either 'path' or 'placeId'");
        }
    }
}
