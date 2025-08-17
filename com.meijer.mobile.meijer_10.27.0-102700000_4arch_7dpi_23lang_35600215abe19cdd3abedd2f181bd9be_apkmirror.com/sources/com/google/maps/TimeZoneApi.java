package com.google.maps;

import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.ApiResponse;
import com.google.maps.model.LatLng;
import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* loaded from: classes7.dex */
public class TimeZoneApi {
    private static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/timezone/json").fieldNamingPolicy(com.google.gson.c.f89416a);

    private static class Response implements ApiResponse<TimeZone> {
        public String errorMessage;
        public String status;
        private String timeZoneId;

        @Override // com.google.maps.internal.ApiResponse
        public TimeZone getResult() {
            String str = this.timeZoneId;
            if (str == null) {
                return null;
            }
            return DesugarTimeZone.getTimeZone(str);
        }

        @Override // com.google.maps.internal.ApiResponse
        public boolean successful() {
            return "OK".equals(this.status);
        }

        private Response() {
        }

        @Override // com.google.maps.internal.ApiResponse
        public ApiException getError() {
            if (successful()) {
                return null;
            }
            return ApiException.from(this.status, this.errorMessage);
        }
    }

    public static PendingResult<TimeZone> getTimeZone(GeoApiContext geoApiContext, LatLng latLng) {
        return geoApiContext.get(API_CONFIG, Response.class, "location", latLng.toString(), "timestamp", "0");
    }

    private TimeZoneApi() {
    }
}
