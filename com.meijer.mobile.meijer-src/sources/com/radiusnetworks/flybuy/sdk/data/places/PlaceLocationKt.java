package com.radiusnetworks.flybuy.sdk.data.places;

import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxRetrieveResponse;
import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxRetrieveResponseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toCoordinate", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceLocation;", "Lcom/radiusnetworks/flybuy/api/mapbox/model/GetSearchBoxRetrieveResponse;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlaceLocationKt {
    public static final PlaceLocation toCoordinate(GetSearchBoxRetrieveResponse getSearchBoxRetrieveResponse) {
        Intrinsics.j(getSearchBoxRetrieveResponse, "<this>");
        Double latitude = GetSearchBoxRetrieveResponseKt.getLatitude(getSearchBoxRetrieveResponse);
        if (latitude == null) {
            return null;
        }
        double dDoubleValue = latitude.doubleValue();
        Double longitude = GetSearchBoxRetrieveResponseKt.getLongitude(getSearchBoxRetrieveResponse);
        if (longitude != null) {
            return new PlaceLocation(dDoubleValue, longitude.doubleValue());
        }
        return null;
    }
}
