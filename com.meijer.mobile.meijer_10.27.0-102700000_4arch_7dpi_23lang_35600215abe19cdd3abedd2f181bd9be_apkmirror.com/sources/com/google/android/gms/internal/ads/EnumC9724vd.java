package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9724vd implements Ku0 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: h, reason: collision with root package name */
    private static final Lu0<EnumC9724vd> f79099h = new Lu0<EnumC9724vd>() { // from class: com.google.android.gms.internal.ads.vd.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f79101a;

    public static EnumC9724vd a(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED;
        }
        if (i10 == 1) {
            return CONNECTING;
        }
        if (i10 == 2) {
            return CONNECTED;
        }
        if (i10 == 3) {
            return DISCONNECTING;
        }
        if (i10 == 4) {
            return DISCONNECTED;
        }
        if (i10 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static Mu0 b() {
        return C9831wd.f79509a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f79101a;
    }

    EnumC9724vd(int i10) {
        this.f79101a = i10;
    }
}
