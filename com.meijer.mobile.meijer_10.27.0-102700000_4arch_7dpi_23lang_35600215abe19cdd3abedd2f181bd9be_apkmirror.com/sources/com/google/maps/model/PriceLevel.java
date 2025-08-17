package com.google.maps.model;

import com.google.maps.internal.StringJoin;

/* loaded from: classes7.dex */
public enum PriceLevel implements StringJoin.UrlValue {
    FREE("0"),
    INEXPENSIVE("1"),
    MODERATE("2"),
    EXPENSIVE("3"),
    VERY_EXPENSIVE("4"),
    UNKNOWN("Unknown");

    private final String priceLevel;

    @Override // java.lang.Enum
    public String toString() {
        return this.priceLevel;
    }

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        if (this != UNKNOWN) {
            return this.priceLevel;
        }
        throw new UnsupportedOperationException("Shouldn't use PriceLevel.UNKNOWN in a request.");
    }

    PriceLevel(String str) {
        this.priceLevel = str;
    }
}
