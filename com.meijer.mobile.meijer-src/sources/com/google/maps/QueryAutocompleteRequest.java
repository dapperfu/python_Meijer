package com.google.maps;

import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.ApiResponse;
import com.google.maps.model.AutocompletePrediction;
import com.google.maps.model.LatLng;

/* loaded from: classes8.dex */
public class QueryAutocompleteRequest extends PendingResultBase<AutocompletePrediction[], QueryAutocompleteRequest, Response> {
    static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/place/queryautocomplete/json").fieldNamingPolicy(com.google.gson.c.f90262e);

    public static class Response implements ApiResponse<AutocompletePrediction[]> {
        public String errorMessage;
        public AutocompletePrediction[] predictions;
        public String status;

        @Override // com.google.maps.internal.ApiResponse
        public AutocompletePrediction[] getResult() {
            return this.predictions;
        }

        @Override // com.google.maps.internal.ApiResponse
        public boolean successful() {
            return "OK".equals(this.status) || "ZERO_RESULTS".equals(this.status);
        }

        @Override // com.google.maps.internal.ApiResponse
        public ApiException getError() {
            if (successful()) {
                return null;
            }
            return ApiException.from(this.status, this.errorMessage);
        }
    }

    protected QueryAutocompleteRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, API_CONFIG, Response.class);
    }

    public QueryAutocompleteRequest input(String str) {
        return param("input", str);
    }

    public QueryAutocompleteRequest location(LatLng latLng) {
        return param("location", latLng);
    }

    public QueryAutocompleteRequest offset(int i10) {
        return param("offset", String.valueOf(i10));
    }

    public QueryAutocompleteRequest radius(int i10) {
        return param("radius", String.valueOf(i10));
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
        if (params().containsKey("input")) {
        } else {
            throw new IllegalArgumentException("Request must contain 'input'.");
        }
    }
}
