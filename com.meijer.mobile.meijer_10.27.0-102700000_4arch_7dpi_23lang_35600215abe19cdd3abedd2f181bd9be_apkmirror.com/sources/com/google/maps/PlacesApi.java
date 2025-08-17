package com.google.maps;

import com.google.maps.FindPlaceFromTextRequest;
import com.google.maps.PlaceAutocompleteRequest;
import com.google.maps.model.LatLng;
import com.google.maps.model.PlaceType;

/* loaded from: classes7.dex */
public class PlacesApi {
    public static PlaceDetailsRequest placeDetails(GeoApiContext geoApiContext, String str, PlaceAutocompleteRequest.SessionToken sessionToken) {
        PlaceDetailsRequest placeDetailsRequest = new PlaceDetailsRequest(geoApiContext);
        placeDetailsRequest.placeId(str);
        placeDetailsRequest.sessionToken(sessionToken);
        return placeDetailsRequest;
    }

    public static TextSearchRequest textSearchQuery(GeoApiContext geoApiContext, String str) {
        TextSearchRequest textSearchRequest = new TextSearchRequest(geoApiContext);
        textSearchRequest.query(str);
        return textSearchRequest;
    }

    public static FindPlaceFromTextRequest findPlaceFromText(GeoApiContext geoApiContext, String str, FindPlaceFromTextRequest.InputType inputType) {
        FindPlaceFromTextRequest findPlaceFromTextRequest = new FindPlaceFromTextRequest(geoApiContext);
        findPlaceFromTextRequest.input(str).inputType(inputType);
        return findPlaceFromTextRequest;
    }

    public static NearbySearchRequest nearbySearchNextPage(GeoApiContext geoApiContext, String str) {
        NearbySearchRequest nearbySearchRequest = new NearbySearchRequest(geoApiContext);
        nearbySearchRequest.pageToken(str);
        return nearbySearchRequest;
    }

    public static NearbySearchRequest nearbySearchQuery(GeoApiContext geoApiContext, LatLng latLng) {
        NearbySearchRequest nearbySearchRequest = new NearbySearchRequest(geoApiContext);
        nearbySearchRequest.location(latLng);
        return nearbySearchRequest;
    }

    public static PhotoRequest photo(GeoApiContext geoApiContext, String str) {
        PhotoRequest photoRequest = new PhotoRequest(geoApiContext);
        photoRequest.photoReference(str);
        return photoRequest;
    }

    public static PlaceAutocompleteRequest placeAutocomplete(GeoApiContext geoApiContext, String str, PlaceAutocompleteRequest.SessionToken sessionToken) {
        PlaceAutocompleteRequest placeAutocompleteRequest = new PlaceAutocompleteRequest(geoApiContext);
        placeAutocompleteRequest.input(str);
        placeAutocompleteRequest.sessionToken(sessionToken);
        return placeAutocompleteRequest;
    }

    public static QueryAutocompleteRequest queryAutocomplete(GeoApiContext geoApiContext, String str) {
        QueryAutocompleteRequest queryAutocompleteRequest = new QueryAutocompleteRequest(geoApiContext);
        queryAutocompleteRequest.input(str);
        return queryAutocompleteRequest;
    }

    public static TextSearchRequest textSearchNextPage(GeoApiContext geoApiContext, String str) {
        TextSearchRequest textSearchRequest = new TextSearchRequest(geoApiContext);
        textSearchRequest.pageToken(str);
        return textSearchRequest;
    }

    private PlacesApi() {
    }

    public static TextSearchRequest textSearchQuery(GeoApiContext geoApiContext, String str, LatLng latLng) {
        TextSearchRequest textSearchRequest = new TextSearchRequest(geoApiContext);
        textSearchRequest.query(str);
        textSearchRequest.location(latLng);
        return textSearchRequest;
    }

    public static PlaceDetailsRequest placeDetails(GeoApiContext geoApiContext, String str) {
        PlaceDetailsRequest placeDetailsRequest = new PlaceDetailsRequest(geoApiContext);
        placeDetailsRequest.placeId(str);
        return placeDetailsRequest;
    }

    public static TextSearchRequest textSearchQuery(GeoApiContext geoApiContext, PlaceType placeType) {
        TextSearchRequest textSearchRequest = new TextSearchRequest(geoApiContext);
        textSearchRequest.type(placeType);
        return textSearchRequest;
    }
}
