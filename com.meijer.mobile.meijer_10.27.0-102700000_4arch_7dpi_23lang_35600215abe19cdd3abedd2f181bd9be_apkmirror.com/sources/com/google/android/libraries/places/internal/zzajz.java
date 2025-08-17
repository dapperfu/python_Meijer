package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzajz implements zzbai {
    POSITION_UNDEFINED(0),
    POSITION_TOP(1),
    POSITION_BOTTOM(2);

    private final int zzd;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        return this.zzd;
    }

    zzajz(int i10) {
        this.zzd = i10;
    }
}
