package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzajw implements zzbai {
    UNDEFINED(0),
    SEARCH_BY_TEXT_REQUEST(1),
    SEARCH_NEARBY_REQUEST(2);

    private final int zzd;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        return this.zzd;
    }

    zzajw(int i10) {
        this.zzd = i10;
    }
}
