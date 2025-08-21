package com.google.maps;

import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.ApiResponse;
import com.google.maps.internal.StringJoin;
import com.google.maps.model.AutocompletePrediction;
import com.google.maps.model.ComponentFilter;
import com.google.maps.model.LatLng;
import com.google.maps.model.PlaceAutocompleteType;
import java.io.Serializable;
import java.util.UUID;

/* loaded from: classes8.dex */
public class PlaceAutocompleteRequest extends PendingResultBase<AutocompletePrediction[], PlaceAutocompleteRequest, Response> {
    static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/place/autocomplete/json").fieldNamingPolicy(com.google.gson.c.f90262e);

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

    public static final class SessionToken implements StringJoin.UrlValue, Serializable {
        private static final long serialVersionUID = 1;
        private UUID uuid;

        public SessionToken() {
            this.uuid = UUID.randomUUID();
        }

        public UUID getUUID() {
            return this.uuid;
        }

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            return this.uuid.toString();
        }

        public SessionToken(UUID uuid) {
            this.uuid = uuid;
        }

        public SessionToken(String str) {
            this.uuid = UUID.nameUUIDFromBytes(str.getBytes());
        }
    }

    protected PlaceAutocompleteRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, API_CONFIG, Response.class);
    }

    public PlaceAutocompleteRequest components(ComponentFilter... componentFilterArr) {
        return param("components", StringJoin.join('|', (StringJoin.UrlValue[]) componentFilterArr));
    }

    public PlaceAutocompleteRequest input(String str) {
        return param("input", str);
    }

    public PlaceAutocompleteRequest location(LatLng latLng) {
        return param("location", latLng);
    }

    public PlaceAutocompleteRequest offset(int i10) {
        return param("offset", String.valueOf(i10));
    }

    public PlaceAutocompleteRequest origin(LatLng latLng) {
        return param("origin", latLng);
    }

    public PlaceAutocompleteRequest radius(int i10) {
        return param("radius", String.valueOf(i10));
    }

    public PlaceAutocompleteRequest sessionToken(SessionToken sessionToken) {
        return param("sessiontoken", sessionToken);
    }

    public PlaceAutocompleteRequest strictBounds(boolean z10) {
        return param("strictbounds", Boolean.toString(z10));
    }

    public PlaceAutocompleteRequest types(PlaceAutocompleteType placeAutocompleteType) {
        return param("types", placeAutocompleteType);
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

    public PlaceAutocompleteRequest type(PlaceAutocompleteType placeAutocompleteType) {
        return types(placeAutocompleteType);
    }

    @Override // com.google.maps.PendingResultBase
    protected void validateRequest() {
        if (params().containsKey("input")) {
        } else {
            throw new IllegalArgumentException("Request must contain 'input'.");
        }
    }
}
