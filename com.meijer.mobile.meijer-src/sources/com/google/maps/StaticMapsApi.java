package com.google.maps;

import com.google.maps.model.Size;

/* loaded from: classes8.dex */
public class StaticMapsApi {
    public static StaticMapsRequest newRequest(GeoApiContext geoApiContext, Size size) {
        return new StaticMapsRequest(geoApiContext).size(size);
    }

    private StaticMapsApi() {
    }
}
