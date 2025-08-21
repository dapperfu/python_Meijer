package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbeq implements zzbep {
    private final Object zza;

    private zzbeq(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final Object zzb() {
        return this.zza;
    }

    public static zzbep zza(Object obj) {
        if (obj != null) {
            return new zzbeq(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }
}
