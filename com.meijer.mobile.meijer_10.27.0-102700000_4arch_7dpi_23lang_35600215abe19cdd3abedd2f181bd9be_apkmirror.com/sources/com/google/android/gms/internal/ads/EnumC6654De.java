package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.De, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC6654De implements Ku0 {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);


    /* renamed from: e, reason: collision with root package name */
    private static final Lu0<EnumC6654De> f66267e = new Lu0<EnumC6654De>() { // from class: com.google.android.gms.internal.ads.De.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f66269a;

    public static EnumC6654De a(int i10) {
        if (i10 == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i10 == 1) {
            return IOS;
        }
        if (i10 != 2) {
            return null;
        }
        return ANDROID;
    }

    public static Mu0 b() {
        return C6688Ee.f66493a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f66269a;
    }

    EnumC6654De(int i10) {
        this.f66269a = i10;
    }
}
