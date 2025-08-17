package com.google.maps.model;

import com.google.maps.internal.StringJoin;
import java.util.Locale;

/* loaded from: classes7.dex */
public enum TravelMode implements StringJoin.UrlValue {
    DRIVING,
    WALKING,
    BICYCLING,
    TRANSIT,
    UNKNOWN;

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        if (this != UNKNOWN) {
            return name().toLowerCase(Locale.ENGLISH);
        }
        throw new UnsupportedOperationException("Shouldn't use TravelMode.UNKNOWN in a request.");
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}
