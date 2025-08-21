package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.yn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10191yn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f81114a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8272gp0 f81115b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7845cp0 f81116c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9765uo0 f81117d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9338qo0 f81118e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f81119f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f81114a = et0B;
        f81115b = AbstractC8272gp0.b(new InterfaceC8058ep0() { // from class: com.google.android.gms.internal.ads.un0
            @Override // com.google.android.gms.internal.ads.InterfaceC8058ep0
            public final Ap0 a(Qk0 qk0) {
                return C10191yn0.d((Yl0) qk0);
            }
        }, Yl0.class, C9981wp0.class);
        f81116c = AbstractC7845cp0.b(new InterfaceC7632ap0() { // from class: com.google.android.gms.internal.ads.vn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7632ap0
            public final Qk0 a(Ap0 ap0) {
                return C10191yn0.b((C9981wp0) ap0);
            }
        }, et0B, C9981wp0.class);
        f81117d = AbstractC9765uo0.b(new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.wn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C10191yn0.c((Ql0) ck0, uk0);
            }
        }, Ql0.class, C9874vp0.class);
        f81118e = AbstractC9338qo0.b(new InterfaceC9124oo0() { // from class: com.google.android.gms.internal.ads.xn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9124oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C10191yn0.a((C9874vp0) ap0, uk0);
            }
        }, et0B, C9874vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f81115b);
        xo0.h(f81116c);
        xo0.g(f81117d);
        xo0.f(f81118e);
    }

    private static Es0 g(Wl0 wl0) throws GeneralSecurityException {
        if (Wl0.f71996b.equals(wl0)) {
            return Es0.TINK;
        }
        if (Wl0.f71997c.equals(wl0)) {
            return Es0.CRUNCHY;
        }
        if (Wl0.f71998d.equals(wl0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(wl0)));
    }

    public static /* synthetic */ Ql0 a(C9874vp0 c9874vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9874vp0.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                Br0 br0E0 = Br0.e0(c9874vp0.d(), C9350qu0.a());
                if (br0E0.b0() == 0) {
                    Vl0 vl0C = Yl0.c();
                    vl0C.a(br0E0.f0().k());
                    vl0C.b(f(c9874vp0.c()));
                    Yl0 yl0C = vl0C.c();
                    Ol0 ol0A = Ql0.a();
                    ol0A.c(yl0C);
                    ol0A.b(Ft0.b(br0E0.f0().a(), uk0));
                    ol0A.a(c9874vp0.e());
                    return ol0A.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
    }

    public static /* synthetic */ Yl0 b(C9981wp0 c9981wp0) throws GeneralSecurityException {
        if (c9981wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                Er0 er0F0 = Er0.f0(c9981wp0.c().h0(), C9350qu0.a());
                if (er0F0.c0() == 0) {
                    Vl0 vl0C = Yl0.c();
                    vl0C.a(er0F0.b0());
                    vl0C.b(f(c9981wp0.c().g0()));
                    return vl0C.c();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(c9981wp0.c().i0())));
    }

    public static /* synthetic */ C9874vp0 c(Ql0 ql0, Uk0 uk0) {
        C10306zr0 c10306zr0C0 = Br0.c0();
        byte[] bArrD = ql0.d().d(uk0);
        c10306zr0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9874vp0.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((Br0) c10306zr0C0.p()).a(), Xr0.SYMMETRIC, g(ql0.b().d()), ql0.e());
    }

    public static /* synthetic */ C9981wp0 d(Yl0 yl0) {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        Cr0 cr0D0 = Er0.d0();
        cr0D0.u(yl0.b());
        c7745bs0B0.w(((Er0) cr0D0.p()).a());
        c7745bs0B0.u(g(yl0.d()));
        return C9981wp0.b((C7957ds0) c7745bs0B0.p());
    }

    private static Wl0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                    }
                } else {
                    return Wl0.f71998d;
                }
            }
            return Wl0.f71997c;
        }
        return Wl0.f71996b;
    }
}
