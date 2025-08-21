package com.google.maps.model;

import com.google.maps.internal.StringJoin;
import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes8.dex */
public class LatLng implements StringJoin.UrlValue, Serializable {
    private static final long serialVersionUID = 1;
    public double lat;
    public double lng;

    public LatLng(double d10, double d11) {
        this.lat = d10;
        this.lng = d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LatLng latLng = (LatLng) obj;
            if (Double.compare(latLng.lat, this.lat) == 0 && Double.compare(latLng.lng, this.lng) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.lat), Double.valueOf(this.lng));
    }

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        return String.format(Locale.ENGLISH, "%.8f,%.8f", Double.valueOf(this.lat), Double.valueOf(this.lng));
    }

    public String toString() {
        return toUrlValue();
    }

    public LatLng() {
    }
}
