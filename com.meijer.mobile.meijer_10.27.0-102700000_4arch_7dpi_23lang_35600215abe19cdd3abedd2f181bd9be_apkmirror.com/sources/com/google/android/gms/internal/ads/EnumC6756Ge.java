package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ge, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC6756Ge implements Ku0 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);


    /* renamed from: e, reason: collision with root package name */
    private static final Lu0<EnumC6756Ge> f67259e = new Lu0<EnumC6756Ge>() { // from class: com.google.android.gms.internal.ads.Ge.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f67261a;

    public static EnumC6756Ge a(int i10) {
        if (i10 == 0) {
            return ENUM_FALSE;
        }
        if (i10 == 1) {
            return ENUM_TRUE;
        }
        if (i10 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static Mu0 b() {
        return C6790He.f67480a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f67261a;
    }

    EnumC6756Ge(int i10) {
        this.f67261a = i10;
    }
}
