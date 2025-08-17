package com.google.maps;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.maps.GeocodingApi;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.StringJoin;
import com.google.maps.model.AddressType;
import com.google.maps.model.ComponentFilter;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import com.google.maps.model.LocationType;

/* loaded from: classes7.dex */
public class GeocodingApiRequest extends PendingResultBase<GeocodingResult[], GeocodingApiRequest, GeocodingApi.Response> {
    private static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/geocode/json");

    public GeocodingApiRequest bounds(LatLng latLng, LatLng latLng2) {
        return param("bounds", StringJoin.join('|', latLng, latLng2));
    }

    public GeocodingApiRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, API_CONFIG, GeocodingApi.Response.class);
    }

    public GeocodingApiRequest address(String str) {
        return param(PlaceTypes.ADDRESS, str);
    }

    public GeocodingApiRequest components(ComponentFilter... componentFilterArr) {
        return param("components", StringJoin.join('|', (StringJoin.UrlValue[]) componentFilterArr));
    }

    public GeocodingApiRequest latlng(LatLng latLng) {
        return param("latlng", latLng);
    }

    public GeocodingApiRequest locationType(LocationType... locationTypeArr) {
        return param("location_type", StringJoin.join('|', (StringJoin.UrlValue[]) locationTypeArr));
    }

    public GeocodingApiRequest place(String str) {
        return param("place_id", str);
    }

    public GeocodingApiRequest region(String str) {
        return param("region", str);
    }

    public GeocodingApiRequest resultType(AddressType... addressTypeArr) {
        return param("result_type", StringJoin.join('|', (StringJoin.UrlValue[]) addressTypeArr));
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
        if (params().containsKey("latlng") && params().containsKey(PlaceTypes.ADDRESS) && params().containsKey("place_id")) {
            throw new IllegalArgumentException("Request must contain only one of 'address', 'latlng' or 'place_id'.");
        }
        if (!params().containsKey("latlng") && !params().containsKey(PlaceTypes.ADDRESS) && !params().containsKey("components") && !params().containsKey("place_id")) {
            throw new IllegalArgumentException("Request must contain at least one of 'address', 'latlng', 'place_id' and 'components'.");
        }
    }
}
