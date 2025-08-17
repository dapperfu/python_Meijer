package com.radiusnetworks.flybuy.api.mapbox.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/radiusnetworks/flybuy/api/mapbox/model/SearchBoxCoordinates;", "", "latitude", "", "longitude", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SearchBoxCoordinates {
    private final double latitude;
    private final double longitude;

    public SearchBoxCoordinates(double d10, double d11) {
        this.latitude = d10;
        this.longitude = d11;
    }

    public static /* synthetic */ SearchBoxCoordinates copy$default(SearchBoxCoordinates searchBoxCoordinates, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = searchBoxCoordinates.latitude;
        }
        if ((i10 & 2) != 0) {
            d11 = searchBoxCoordinates.longitude;
        }
        return searchBoxCoordinates.copy(d10, d11);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final SearchBoxCoordinates copy(double latitude, double longitude) {
        return new SearchBoxCoordinates(latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchBoxCoordinates)) {
            return false;
        }
        SearchBoxCoordinates searchBoxCoordinates = (SearchBoxCoordinates) other;
        return Double.compare(this.latitude, searchBoxCoordinates.latitude) == 0 && Double.compare(this.longitude, searchBoxCoordinates.longitude) == 0;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
    }

    public String toString() {
        return "SearchBoxCoordinates(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }
}
