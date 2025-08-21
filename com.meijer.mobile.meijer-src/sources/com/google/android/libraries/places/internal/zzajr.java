package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzajr implements zzbai {
    CONTENT_UNDEFINED(0),
    PHOTO(1),
    ADDRESS(2),
    RATING(3),
    TYPE(4),
    PRICE(5),
    ACCESSIBILITY(6),
    OPEN_NOW_STATUS(7);

    private final int zzi;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        return this.zzi;
    }

    zzajr(int i10) {
        this.zzi = i10;
    }
}
