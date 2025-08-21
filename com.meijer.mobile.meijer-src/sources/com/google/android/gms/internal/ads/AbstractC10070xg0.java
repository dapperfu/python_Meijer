package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10070xg0 implements Map.Entry {
    AbstractC10070xg0() {
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (C6680Af0.a(getKey(), entry.getKey()) && C6680Af0.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode;
        Object key = getKey();
        Object value = getValue();
        int iHashCode2 = 0;
        if (key == null) {
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
        }
        if (value != null) {
            iHashCode2 = value.hashCode();
        }
        return iHashCode ^ iHashCode2;
    }

    public final String toString() {
        return String.valueOf(getKey()) + "=" + String.valueOf(getValue());
    }
}
