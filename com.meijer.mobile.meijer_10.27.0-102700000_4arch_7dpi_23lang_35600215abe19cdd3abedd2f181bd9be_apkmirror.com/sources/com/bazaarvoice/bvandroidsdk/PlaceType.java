package com.bazaarvoice.bvandroidsdk;

@Deprecated
/* loaded from: classes4.dex */
public enum PlaceType {
    Geofence("geofence");

    private final String value;

    String getValue() {
        return this.value;
    }

    PlaceType(String str) {
        this.value = str;
    }
}
