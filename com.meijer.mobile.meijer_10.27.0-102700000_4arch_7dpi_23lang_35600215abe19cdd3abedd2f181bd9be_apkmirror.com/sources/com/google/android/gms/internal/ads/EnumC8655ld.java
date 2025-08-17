package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ld, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC8655ld implements Ku0 {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);


    /* renamed from: f, reason: collision with root package name */
    private static final Lu0<EnumC8655ld> f75883f = new Lu0<EnumC8655ld>() { // from class: com.google.android.gms.internal.ads.ld.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f75885a;

    public static EnumC8655ld a(int i10) {
        if (i10 == 0) {
            return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return TWO_G;
        }
        if (i10 == 2) {
            return THREE_G;
        }
        if (i10 != 4) {
            return null;
        }
        return LTE;
    }

    public static Mu0 b() {
        return C8762md.f76838a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f75885a;
    }

    EnumC8655ld(int i10) {
        this.f75885a = i10;
    }
}
