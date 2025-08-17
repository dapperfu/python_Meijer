package com.google.maps.model;

import com.google.maps.internal.StringJoin;
import java.util.Locale;

/* loaded from: classes7.dex */
public enum TransitRoutingPreference implements StringJoin.UrlValue {
    LESS_WALKING,
    FEWER_TRANSFERS;

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}
