package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzawi implements zzbai {
    SECONDARY_HOURS_TYPE_UNSPECIFIED(0),
    DRIVE_THROUGH(1),
    HAPPY_HOUR(2),
    DELIVERY(3),
    TAKEOUT(4),
    KITCHEN(5),
    BREAKFAST(6),
    LUNCH(7),
    DINNER(8),
    BRUNCH(9),
    PICKUP(10),
    ACCESS(11),
    SENIOR_HOURS(12),
    ONLINE_SERVICE_HOURS(13),
    UNRECOGNIZED(-1);

    private final int zzp;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzp);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzp;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    zzawi(int i10) {
        this.zzp = i10;
    }
}
