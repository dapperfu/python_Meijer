package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzaxc implements zzbai {
    PRICE_LEVEL_UNSPECIFIED(0),
    PRICE_LEVEL_FREE(1),
    PRICE_LEVEL_INEXPENSIVE(2),
    PRICE_LEVEL_MODERATE(3),
    PRICE_LEVEL_EXPENSIVE(4),
    PRICE_LEVEL_VERY_EXPENSIVE(5),
    UNRECOGNIZED(-1);

    private final int zzh;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    zzaxc(int i10) {
        this.zzh = i10;
    }
}
