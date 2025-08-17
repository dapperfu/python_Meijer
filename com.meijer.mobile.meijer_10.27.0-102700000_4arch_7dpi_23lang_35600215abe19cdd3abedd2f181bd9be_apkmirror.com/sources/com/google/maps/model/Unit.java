package com.google.maps.model;

import com.google.maps.internal.StringJoin;
import java.util.Locale;

/* loaded from: classes7.dex */
public enum Unit implements StringJoin.UrlValue {
    METRIC,
    IMPERIAL;

    @Override // java.lang.Enum
    public String toString() {
        return toUrlValue();
    }

    @Override // com.google.maps.internal.StringJoin.UrlValue
    public String toUrlValue() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}
