package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public enum Xr0 implements Ku0 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    private final int f71425a;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f71425a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    Xr0(int i10) {
        this.f71425a = i10;
    }
}
