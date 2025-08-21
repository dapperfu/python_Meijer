package com.google.maps.model;

import com.google.maps.internal.StringJoin;
import java.util.Locale;

/* loaded from: classes8.dex */
public enum TrafficModel implements StringJoin.UrlValue {
    BEST_GUESS,
    OPTIMISTIC,
    PESSIMISTIC;

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        return toString();
    }
}
