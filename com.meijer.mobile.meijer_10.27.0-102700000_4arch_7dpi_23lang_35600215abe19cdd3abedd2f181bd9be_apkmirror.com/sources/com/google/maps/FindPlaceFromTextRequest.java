package com.google.maps;

import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.ApiResponse;
import com.google.maps.internal.StringJoin;
import com.google.maps.model.FindPlaceFromText;
import com.google.maps.model.LatLng;
import com.google.maps.model.PlacesSearchResult;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import io.constructor.data.local.PreferencesHelper;

/* loaded from: classes7.dex */
public class FindPlaceFromTextRequest extends PendingResultBase<FindPlaceFromText, FindPlaceFromTextRequest, Response> {
    static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/place/findplacefromtext/json").fieldNamingPolicy(com.google.gson.c.f89420e).supportsClientId(false);

    public enum FieldMask implements StringJoin.UrlValue {
        BUSINESS_STATUS("business_status"),
        FORMATTED_ADDRESS("formatted_address"),
        GEOMETRY("geometry"),
        ICON(BarcodePickDeserializer.FIELD_ICON),
        ID(PreferencesHelper.PREF_ID),
        NAME("name"),
        OPENING_HOURS("opening_hours"),
        PERMANENTLY_CLOSED("permanently_closed"),
        PHOTOS("photos"),
        PLACE_ID("place_id"),
        PRICE_LEVEL("price_level"),
        RATING("rating"),
        TYPES("types");

        private final String field;

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            return this.field;
        }

        FieldMask(String str) {
            this.field = str;
        }
    }

    public enum InputType implements StringJoin.UrlValue {
        TEXT_QUERY("textquery"),
        PHONE_NUMBER("phonenumber");

        private final String inputType;

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            return this.inputType;
        }

        InputType(String str) {
            this.inputType = str;
        }
    }

    public interface LocationBias extends StringJoin.UrlValue {
    }

    public static class LocationBiasCircular implements LocationBias {
        private final LatLng center;
        private final int radius;

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            return "circle:" + this.radius + "@" + this.center.toUrlValue();
        }

        public LocationBiasCircular(LatLng latLng, int i10) {
            this.center = latLng;
            this.radius = i10;
        }
    }

    public static class LocationBiasIP implements LocationBias {
        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            return "ipbias";
        }
    }

    public static class LocationBiasPoint implements LocationBias {
        private final LatLng point;

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            return "point:" + this.point.toUrlValue();
        }

        public LocationBiasPoint(LatLng latLng) {
            this.point = latLng;
        }
    }

    public static class LocationBiasRectangular implements LocationBias {
        private final LatLng northEast;
        private final LatLng southWest;

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            return "rectangle:" + this.southWest.toUrlValue() + "|" + this.northEast.toUrlValue();
        }

        public LocationBiasRectangular(LatLng latLng, LatLng latLng2) {
            this.southWest = latLng;
            this.northEast = latLng2;
        }
    }

    public static class Response implements ApiResponse<FindPlaceFromText> {
        public PlacesSearchResult[] candidates;
        public String errorMessage;
        public String status;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.maps.internal.ApiResponse
        public FindPlaceFromText getResult() {
            FindPlaceFromText findPlaceFromText = new FindPlaceFromText();
            findPlaceFromText.candidates = this.candidates;
            return findPlaceFromText;
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

    public FindPlaceFromTextRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, API_CONFIG, Response.class);
    }

    public FindPlaceFromTextRequest fields(FieldMask... fieldMaskArr) {
        return param("fields", StringJoin.join(',', (StringJoin.UrlValue[]) fieldMaskArr));
    }

    public FindPlaceFromTextRequest input(String str) {
        return param("input", str);
    }

    public FindPlaceFromTextRequest inputType(InputType inputType) {
        return param("inputtype", inputType);
    }

    public FindPlaceFromTextRequest locationBias(LocationBias locationBias) {
        return param("locationbias", locationBias);
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
            if (params().containsKey("inputtype")) {
                return;
            } else {
                throw new IllegalArgumentException("Request must contain 'inputType'.");
            }
        }
        throw new IllegalArgumentException("Request must contain 'input'.");
    }
}
