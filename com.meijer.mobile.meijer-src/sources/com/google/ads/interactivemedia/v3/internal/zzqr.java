package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* loaded from: classes4.dex */
abstract class zzqr implements Map.Entry {
    zzqr() {
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (zzqe.zza(getKey(), entry.getKey()) && zzqe.zza(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
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
