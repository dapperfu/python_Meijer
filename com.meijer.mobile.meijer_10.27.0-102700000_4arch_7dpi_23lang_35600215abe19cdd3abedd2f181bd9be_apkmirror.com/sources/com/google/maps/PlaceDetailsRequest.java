package com.google.maps;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.maps.PlaceAutocompleteRequest;
import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.ApiResponse;
import com.google.maps.internal.StringJoin;
import com.google.maps.model.PlaceDetails;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import io.constructor.data.local.PreferencesHelper;

/* loaded from: classes7.dex */
public class PlaceDetailsRequest extends PendingResultBase<PlaceDetails, PlaceDetailsRequest, Response> {
    static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/place/details/json").fieldNamingPolicy(com.google.gson.c.f89420e);

    public enum FieldMask implements StringJoin.UrlValue {
        ADDRESS_COMPONENT("address_component"),
        ADR_ADDRESS("adr_address"),
        ALT_ID("alt_id"),
        BUSINESS_STATUS("business_status"),
        FORMATTED_ADDRESS("formatted_address"),
        FORMATTED_PHONE_NUMBER("formatted_phone_number"),
        GEOMETRY("geometry"),
        GEOMETRY_LOCATION("geometry/location"),
        GEOMETRY_LOCATION_LAT("geometry/location/lat"),
        GEOMETRY_LOCATION_LNG("geometry/location/lng"),
        GEOMETRY_VIEWPORT("geometry/viewport"),
        GEOMETRY_VIEWPORT_NORTHEAST("geometry/viewport/northeast"),
        GEOMETRY_VIEWPORT_NORTHEAST_LAT("geometry/viewport/northeast/lat"),
        GEOMETRY_VIEWPORT_NORTHEAST_LNG("geometry/viewport/northeast/lng"),
        GEOMETRY_VIEWPORT_SOUTHWEST("geometry/viewport/southwest"),
        GEOMETRY_VIEWPORT_SOUTHWEST_LAT("geometry/viewport/southwest/lat"),
        GEOMETRY_VIEWPORT_SOUTHWEST_LNG("geometry/viewport/southwest/lng"),
        ICON(BarcodePickDeserializer.FIELD_ICON),
        ID(PreferencesHelper.PREF_ID),
        INTERNATIONAL_PHONE_NUMBER("international_phone_number"),
        NAME("name"),
        OPENING_HOURS("opening_hours"),
        PERMANENTLY_CLOSED("permanently_closed"),
        USER_RATINGS_TOTAL("user_ratings_total"),
        PHOTOS("photos"),
        PLACE_ID("place_id"),
        PLUS_CODE(PlaceTypes.PLUS_CODE),
        PRICE_LEVEL("price_level"),
        RATING("rating"),
        REFERENCE("reference"),
        REVIEW("review"),
        SCOPE("scope"),
        TYPES("types"),
        URL("url"),
        UTC_OFFSET("utc_offset"),
        VICINITY("vicinity"),
        WEBSITE("website");

        private final String field;

        @Override // com.google.maps.internal.StringJoin.UrlValue
        public String toUrlValue() {
            return this.field;
        }

        FieldMask(String str) {
            this.field = str;
        }
    }

    public static class Response implements ApiResponse<PlaceDetails> {
        public String errorMessage;
        public String[] htmlAttributions;
        public PlaceDetails result;
        public String status;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.maps.internal.ApiResponse
        public PlaceDetails getResult() {
            PlaceDetails placeDetails = this.result;
            if (placeDetails != null) {
                placeDetails.htmlAttributions = this.htmlAttributions;
            }
            return placeDetails;
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

    public PlaceDetailsRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, API_CONFIG, Response.class);
    }

    public PlaceDetailsRequest fields(FieldMask... fieldMaskArr) {
        return param("fields", StringJoin.join(',', (StringJoin.UrlValue[]) fieldMaskArr));
    }

    public PlaceDetailsRequest placeId(String str) {
        return param("placeid", str);
    }

    public PlaceDetailsRequest region(String str) {
        return param("region", str);
    }

    public PlaceDetailsRequest sessionToken(PlaceAutocompleteRequest.SessionToken sessionToken) {
        return param("sessiontoken", sessionToken);
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
        if (params().containsKey("placeid")) {
        } else {
            throw new IllegalArgumentException("Request must contain 'placeId'.");
        }
    }
}
