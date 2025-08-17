package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC8869nd implements Ku0 {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);


    /* renamed from: e, reason: collision with root package name */
    private static final Lu0<EnumC8869nd> f77109e = new Lu0<EnumC8869nd>() { // from class: com.google.android.gms.internal.ads.nd.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f77111a;

    public static EnumC8869nd a(int i10) {
        if (i10 == 0) {
            return NETWORKTYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return CELL;
        }
        if (i10 != 2) {
            return null;
        }
        return WIFI;
    }

    public static Mu0 b() {
        return C8976od.f77408a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f77111a;
    }

    EnumC8869nd(int i10) {
        this.f77111a = i10;
    }
}
