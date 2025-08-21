package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9849vd implements Ku0 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: h, reason: collision with root package name */
    private static final Lu0<EnumC9849vd> f79939h = new Lu0<EnumC9849vd>() { // from class: com.google.android.gms.internal.ads.vd.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f79941a;

    public static EnumC9849vd a(int i10) {
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
        return C9956wd.f80349a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f79941a;
    }

    EnumC9849vd(int i10) {
        this.f79941a = i10;
    }
}
