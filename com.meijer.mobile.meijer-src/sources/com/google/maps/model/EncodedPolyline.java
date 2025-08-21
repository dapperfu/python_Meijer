package com.google.maps.model;

import com.google.maps.internal.PolylineEncoding;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes8.dex */
public class EncodedPolyline implements Serializable {
    private static final long serialVersionUID = 1;
    private final String points;

    public EncodedPolyline() {
        this.points = null;
    }

    public List<LatLng> decodePath() {
        return PolylineEncoding.decode(this.points);
    }

    public String getEncodedPath() {
        return this.points;
    }

    public String toString() {
        return String.format("[EncodedPolyline: %s]", this.points);
    }

    public EncodedPolyline(String str) {
        this.points = str;
    }

    public EncodedPolyline(List<LatLng> list) {
        this.points = PolylineEncoding.encode(list);
    }
}
