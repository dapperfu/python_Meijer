package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzajb implements zzbai {
    VARIANT_UNDEFINED(0),
    VARIANT_COMPACT(1),
    VARIANT_FULL(2);

    private final int zzd;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        return this.zzd;
    }

    zzajb(int i10) {
        this.zzd = i10;
    }
}
