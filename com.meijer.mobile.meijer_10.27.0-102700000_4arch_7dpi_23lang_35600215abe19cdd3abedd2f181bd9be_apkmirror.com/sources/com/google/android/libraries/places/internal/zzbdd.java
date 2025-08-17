package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzbdd implements zzbai {
    WIDGET_TYPE_UNSPECIFIED(0),
    PLACE_DETAILS(1),
    PLACE_LIST(2),
    PLACE_AUTOCOMPLETE(3),
    ELEVATION(4),
    INTERNAL_PLACE_DETAILS(5),
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

    zzbdd(int i10) {
        this.zzh = i10;
    }
}
