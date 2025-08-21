package com.google.maps;

import com.google.maps.errors.ApiError;
import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiResponse;
import com.google.maps.model.LatLng;
import com.google.maps.model.SnappedPoint;
import com.google.maps.model.SnappedSpeedLimitResult;
import com.google.maps.model.SpeedLimit;

/* loaded from: classes8.dex */
public class RoadsApi {
    static final String API_BASE_URL = "https://roads.googleapis.com";

    public static class RoadsResponse implements ApiResponse<SnappedPoint[]> {
        private ApiError error;
        private SnappedPoint[] snappedPoints;

        @Override // com.google.maps.internal.ApiResponse
        public ApiException getError() {
            ApiError apiError = this.error;
            return ApiException.from(apiError.status, apiError.message);
        }

        @Override // com.google.maps.internal.ApiResponse
        public SnappedPoint[] getResult() {
            return this.snappedPoints;
        }

        @Override // com.google.maps.internal.ApiResponse
        public boolean successful() {
            return this.error == null;
        }
    }

    public static class SpeedLimitsResponse implements ApiResponse<SnappedSpeedLimitResult> {
        private ApiError error;
        private SnappedPoint[] snappedPoints;
        private SpeedLimit[] speedLimits;

        @Override // com.google.maps.internal.ApiResponse
        public ApiException getError() {
            ApiError apiError = this.error;
            return ApiException.from(apiError.status, apiError.message);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.maps.internal.ApiResponse
        public SnappedSpeedLimitResult getResult() {
            SnappedSpeedLimitResult snappedSpeedLimitResult = new SnappedSpeedLimitResult();
            snappedSpeedLimitResult.snappedPoints = this.snappedPoints;
            snappedSpeedLimitResult.speedLimits = this.speedLimits;
            return snappedSpeedLimitResult;
        }

        @Override // com.google.maps.internal.ApiResponse
        public boolean successful() {
            return this.error == null;
        }
    }

    public static SnapToRoadsApiRequest snapToRoads(GeoApiContext geoApiContext, LatLng... latLngArr) {
        return snapToRoads(geoApiContext, false, latLngArr);
    }

    public static SpeedLimitsApiRequest speedLimits(GeoApiContext geoApiContext, LatLng... latLngArr) {
        return new SpeedLimitsApiRequest(geoApiContext).path(latLngArr);
    }

    public static NearestRoadsApiRequest nearestRoads(GeoApiContext geoApiContext, LatLng... latLngArr) {
        return new NearestRoadsApiRequest(geoApiContext).points(latLngArr);
    }

    public static SnapToRoadsApiRequest snapToRoads(GeoApiContext geoApiContext, boolean z10, LatLng... latLngArr) {
        return new SnapToRoadsApiRequest(geoApiContext).path(latLngArr).interpolate(z10);
    }

    public static SpeedLimitsApiRequest speedLimits(GeoApiContext geoApiContext, String... strArr) {
        return new SpeedLimitsApiRequest(geoApiContext).placeIds(strArr);
    }

    private RoadsApi() {
    }
}
