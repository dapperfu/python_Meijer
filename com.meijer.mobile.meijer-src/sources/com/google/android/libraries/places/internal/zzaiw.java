package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzaiw implements zzbai {
    CONTENT_UNDEFINED(0),
    PHOTO(1),
    ADDRESS(2),
    RATING(3),
    TYPE(4),
    PRICE(5),
    ACCESSIBILITY(6),
    MAPS_LINK(7),
    DIRECTIONS_LINK(8),
    OPEN_NOW_STATUS(9),
    SUMMARY(10),
    OPENING_HOURS(11),
    WEBSITE(12),
    PHONE_NUMBER(13),
    TYPE_SPECIFIC_HIGHLIGHTS(14),
    REVIEWS(15),
    PLUS_CODE(16),
    FEATURES(17);

    private final int zzs;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzs);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        return this.zzs;
    }

    zzaiw(int i10) {
        this.zzs = i10;
    }
}
