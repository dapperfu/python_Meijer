package com.radiusnetworks.flybuy.api.mapbox.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"latitude", "", "Lcom/radiusnetworks/flybuy/api/mapbox/model/GetSearchBoxRetrieveResponse;", "getLatitude", "(Lcom/radiusnetworks/flybuy/api/mapbox/model/GetSearchBoxRetrieveResponse;)Ljava/lang/Double;", "longitude", "getLongitude", "api_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetSearchBoxRetrieveResponseKt {
    public static final Double getLatitude(GetSearchBoxRetrieveResponse getSearchBoxRetrieveResponse) {
        SearchBoxFeature searchBoxFeature;
        SearchBoxProperties properties;
        SearchBoxCoordinates coordinates;
        Intrinsics.j(getSearchBoxRetrieveResponse, "<this>");
        List<SearchBoxFeature> features = getSearchBoxRetrieveResponse.getFeatures();
        if (features == null || (searchBoxFeature = (SearchBoxFeature) CollectionsKt.s0(features)) == null || (properties = searchBoxFeature.getProperties()) == null || (coordinates = properties.getCoordinates()) == null) {
            return null;
        }
        return Double.valueOf(coordinates.getLatitude());
    }

    public static final Double getLongitude(GetSearchBoxRetrieveResponse getSearchBoxRetrieveResponse) {
        SearchBoxFeature searchBoxFeature;
        SearchBoxProperties properties;
        SearchBoxCoordinates coordinates;
        Intrinsics.j(getSearchBoxRetrieveResponse, "<this>");
        List<SearchBoxFeature> features = getSearchBoxRetrieveResponse.getFeatures();
        if (features == null || (searchBoxFeature = (SearchBoxFeature) CollectionsKt.s0(features)) == null || (properties = searchBoxFeature.getProperties()) == null || (coordinates = properties.getCoordinates()) == null) {
            return null;
        }
        return Double.valueOf(coordinates.getLongitude());
    }
}
