package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzaju implements zzbai {
    ORIENTATION_UNDEFINED(0),
    ORIENTATION_VERTICAL(1),
    ORIENTATION_HORIZONTAL(2);

    private final int zzd;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        return this.zzd;
    }

    zzaju(int i10) {
        this.zzd = i10;
    }
}
