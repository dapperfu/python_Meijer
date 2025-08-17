package com.google.maps;

import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.ApiResponse;
import com.google.maps.model.LatLng;
import com.google.maps.model.PlaceType;
import com.google.maps.model.PlacesSearchResponse;
import com.google.maps.model.PlacesSearchResult;
import com.google.maps.model.PriceLevel;
import com.google.maps.model.RankBy;

/* loaded from: classes7.dex */
public class TextSearchRequest extends PendingResultBase<PlacesSearchResponse, TextSearchRequest, Response> {
    static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/place/textsearch/json").fieldNamingPolicy(com.google.gson.c.f89420e);

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

    public TextSearchRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, API_CONFIG, Response.class);
    }

    public TextSearchRequest location(LatLng latLng) {
        return param("location", latLng);
    }

    public TextSearchRequest maxPrice(PriceLevel priceLevel) {
        return param("maxprice", priceLevel);
    }

    public TextSearchRequest minPrice(PriceLevel priceLevel) {
        return param("minprice", priceLevel);
    }

    public TextSearchRequest name(String str) {
        return param("name", str);
    }

    public TextSearchRequest openNow(boolean z10) {
        return param("opennow", String.valueOf(z10));
    }

    public TextSearchRequest pageToken(String str) {
        return param("pagetoken", str);
    }

    public TextSearchRequest query(String str) {
        return param("query", str);
    }

    public TextSearchRequest rankby(RankBy rankBy) {
        return param("rankby", rankBy);
    }

    public TextSearchRequest region(String str) {
        return param("region", str);
    }

    public TextSearchRequest type(PlaceType placeType) {
        return param("type", placeType);
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

    public TextSearchRequest radius(int i10) {
        if (i10 <= 50000) {
            return param("radius", String.valueOf(i10));
        }
        throw new IllegalArgumentException("The maximum allowed radius is 50,000 meters.");
    }

    @Override // com.google.maps.PendingResultBase
    protected void validateRequest() {
        if (!params().containsKey("pagetoken")) {
            if (!params().containsKey("query") && !params().containsKey("type")) {
                throw new IllegalArgumentException("Request must contain 'query' or a 'pageToken'. If a 'type' is specified 'query' becomes optional.");
            }
            if (params().containsKey("location") && !params().containsKey("radius")) {
                throw new IllegalArgumentException("Request must contain 'radius' parameter when it contains a 'location' parameter.");
            }
        }
    }
}
