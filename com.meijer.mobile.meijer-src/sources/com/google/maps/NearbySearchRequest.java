package com.google.maps;

import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.ApiResponse;
import com.google.maps.internal.StringJoin;
import com.google.maps.model.LatLng;
import com.google.maps.model.PlaceType;
import com.google.maps.model.PlacesSearchResponse;
import com.google.maps.model.PlacesSearchResult;
import com.google.maps.model.PriceLevel;
import com.google.maps.model.RankBy;

/* loaded from: classes8.dex */
public class NearbySearchRequest extends PendingResultBase<PlacesSearchResponse, NearbySearchRequest, Response> {
    static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/place/nearbysearch/json").fieldNamingPolicy(com.google.gson.c.f90262e);

    public static class Response implements ApiResponse<PlacesSearchResponse> {
        public String errorMessage;
        public String[] htmlAttributions;
        public String nextPageToken;
        public PlacesSearchResult[] results;
        public String status;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.maps.internal.ApiResponse
        public PlacesSearchResponse getResult() {
            PlacesSearchResponse placesSearchResponse = new PlacesSearchResponse();
            placesSearchResponse.htmlAttributions = this.htmlAttributions;
            placesSearchResponse.results = this.results;
            placesSearchResponse.nextPageToken = this.nextPageToken;
            return placesSearchResponse;
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

    public NearbySearchRequest type(PlaceType placeType) {
        return param("type", placeType);
    }

    public NearbySearchRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, API_CONFIG, Response.class);
    }

    public NearbySearchRequest keyword(String str) {
        return param("keyword", str);
    }

    public NearbySearchRequest location(LatLng latLng) {
        return param("location", latLng);
    }

    public NearbySearchRequest maxPrice(PriceLevel priceLevel) {
        return param("maxprice", priceLevel);
    }

    public NearbySearchRequest minPrice(PriceLevel priceLevel) {
        return param("minprice", priceLevel);
    }

    public NearbySearchRequest name(String str) {
        return param("name", str);
    }

    public NearbySearchRequest openNow(boolean z10) {
        return param("opennow", String.valueOf(z10));
    }

    public NearbySearchRequest pageToken(String str) {
        return param("pagetoken", str);
    }

    public NearbySearchRequest rankby(RankBy rankBy) {
        return param("rankby", rankBy);
    }

    @Deprecated
    public NearbySearchRequest type(PlaceType... placeTypeArr) {
        return param("type", StringJoin.join('|', (StringJoin.UrlValue[]) placeTypeArr));
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

    public NearbySearchRequest radius(int i10) {
        if (i10 <= 50000) {
            return param("radius", String.valueOf(i10));
        }
        throw new IllegalArgumentException("The maximum allowed radius is 50,000 meters.");
    }

    @Override // com.google.maps.PendingResultBase
    protected void validateRequest() {
        if (!params().containsKey("pagetoken")) {
            if (params().containsKey("rankby") && params().get("rankby").get(0).equals(RankBy.DISTANCE.toString()) && params().containsKey("radius")) {
                throw new IllegalArgumentException("Request must not contain radius with rankby=distance");
            }
            if (params().containsKey("rankby") && params().get("rankby").get(0).equals(RankBy.DISTANCE.toString()) && !params().containsKey("keyword") && !params().containsKey("name") && !params().containsKey("type")) {
                throw new IllegalArgumentException("With rankby=distance is specified, then one or more of keyword, name, or type is required");
            }
        }
    }
}
