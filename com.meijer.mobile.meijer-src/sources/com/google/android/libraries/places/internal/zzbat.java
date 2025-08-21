package com.google.android.libraries.places.internal;

import java.util.Map;

/* loaded from: classes6.dex */
final class zzbat implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzbav) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzbbl) {
            return ((zzbav) this.zza.getValue()).zza((zzbbl) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzbav zza() {
        return (zzbav) this.zza.getValue();
    }
}
