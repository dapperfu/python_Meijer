package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.qd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC10987qd implements E0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private static final F0 f84663h = new F0() { // from class: com.google.android.gms.internal.pal.pd
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f84665a;

    public static EnumC10987qd a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i10 == 1) {
            return SYMMETRIC;
        }
        if (i10 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i10 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i10 != 4) {
            return null;
        }
        return REMOTE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f84665a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    EnumC10987qd(int i10) {
        this.f84665a = i10;
    }
}
