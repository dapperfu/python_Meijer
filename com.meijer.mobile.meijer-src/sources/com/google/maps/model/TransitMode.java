package com.google.maps.model;

import com.google.maps.internal.StringJoin;
import java.util.Locale;

/* loaded from: classes8.dex */
public enum TransitMode implements StringJoin.UrlValue {
    BUS,
    SUBWAY,
    TRAIN,
    TRAM,
    RAIL;

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}
