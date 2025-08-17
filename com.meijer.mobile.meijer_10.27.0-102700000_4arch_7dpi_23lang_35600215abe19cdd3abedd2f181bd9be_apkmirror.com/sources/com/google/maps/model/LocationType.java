package com.google.maps.model;

import com.google.maps.internal.StringJoin;

/* loaded from: classes7.dex */
public enum LocationType implements StringJoin.UrlValue {
    ROOFTOP,
    RANGE_INTERPOLATED,
    GEOMETRIC_CENTER,
    APPROXIMATE,
    UNKNOWN;

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        if (this != UNKNOWN) {
            return name();
        }
        throw new UnsupportedOperationException("Shouldn't use LocationType.UNKNOWN in a request.");
    }
}
