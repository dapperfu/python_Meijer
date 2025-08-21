package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.gn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8268gn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f75235a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8272gp0 f75236b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7845cp0 f75237c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9765uo0 f75238d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9338qo0 f75239e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f75240f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f75235a = et0B;
        f75236b = AbstractC8272gp0.b(new InterfaceC8058ep0() { // from class: com.google.android.gms.internal.ads.cn0
            @Override // com.google.android.gms.internal.ads.InterfaceC8058ep0
            public final Ap0 a(Qk0 qk0) {
                return C8268gn0.d((C9438rl0) qk0);
            }
        }, C9438rl0.class, C9981wp0.class);
        f75237c = AbstractC7845cp0.b(new InterfaceC7632ap0() { // from class: com.google.android.gms.internal.ads.dn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7632ap0
            public final Qk0 a(Ap0 ap0) {
                return C8268gn0.b((C9981wp0) ap0);
            }
        }, et0B, C9981wp0.class);
        f75238d = AbstractC9765uo0.b(new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.en0
            @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C8268gn0.c((C8477il0) ck0, uk0);
            }
        }, C8477il0.class, C9874vp0.class);
        f75239e = AbstractC9338qo0.b(new InterfaceC9124oo0() { // from class: com.google.android.gms.internal.ads.fn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9124oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C8268gn0.a((C9874vp0) ap0, uk0);
            }
        }, et0B, C9874vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f75236b);
        xo0.h(f75237c);
        xo0.g(f75238d);
        xo0.f(f75239e);
    }

    private static Es0 i(C9225pl0 c9225pl0) throws GeneralSecurityException {
        if (C9225pl0.f78476b.equals(c9225pl0)) {
            return Es0.TINK;
        }
        if (C9225pl0.f78477c.equals(c9225pl0)) {
            return Es0.CRUNCHY;
        }
        if (C9225pl0.f78478d.equals(c9225pl0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c9225pl0)));
    }

    public static /* synthetic */ C8477il0 a(C9874vp0 c9874vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9874vp0.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                Xq0 xq0E0 = Xq0.e0(c9874vp0.d(), C9350qu0.a());
                if (xq0E0.b0() == 0) {
                    if (xq0E0.f0().b0() == 0) {
                        if (xq0E0.g0().b0() == 0) {
                            C9011nl0 c9011nl0F = C9438rl0.f();
                            c9011nl0F.a(xq0E0.f0().g0().k());
                            c9011nl0F.c(xq0E0.g0().h0().k());
                            c9011nl0F.d(xq0E0.f0().f0().b0());
                            c9011nl0F.e(xq0E0.g0().g0().b0());
                            c9011nl0F.b(f(xq0E0.g0().g0().c0()));
                            c9011nl0F.f(g(c9874vp0.c()));
                            C9438rl0 c9438rl0G = c9011nl0F.g();
                            C8157fl0 c8157fl0A = C8477il0.a();
                            c8157fl0A.d(c9438rl0G);
                            c8157fl0A.a(Ft0.b(xq0E0.f0().g0().a(), uk0));
                            c8157fl0A.b(Ft0.b(xq0E0.g0().h0().a(), uk0));
                            c8157fl0A.c(c9874vp0.e());
                            return c8157fl0A.e();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ C9438rl0 b(C9981wp0 c9981wp0) throws GeneralSecurityException {
        if (c9981wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C7636ar0 c7636ar0D0 = C7636ar0.d0(c9981wp0.c().h0(), C9350qu0.a());
                if (c7636ar0D0.f0().c0() == 0) {
                    C9011nl0 c9011nl0F = C9438rl0.f();
                    c9011nl0F.a(c7636ar0D0.e0().b0());
                    c9011nl0F.c(c7636ar0D0.f0().b0());
                    c9011nl0F.d(c7636ar0D0.e0().f0().b0());
                    c9011nl0F.e(c7636ar0D0.f0().h0().b0());
                    c9011nl0F.b(f(c7636ar0D0.f0().h0().c0()));
                    c9011nl0F.f(g(c9981wp0.c().g0()));
                    return c9011nl0F.g();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c9981wp0.c().i0())));
    }

    public static /* synthetic */ C9874vp0 c(C8477il0 c8477il0, Uk0 uk0) {
        Vq0 vq0C0 = Xq0.c0();
        C7743br0 c7743br0C0 = C7955dr0.c0();
        C8383hr0 c8383hr0C0 = C8595jr0.c0();
        c8383hr0C0.u(c8477il0.b().d());
        c7743br0C0.v((C8595jr0) c8383hr0C0.p());
        byte[] bArrD = c8477il0.d().d(uk0);
        c7743br0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        vq0C0.u((C7955dr0) c7743br0C0.p());
        Mr0 mr0C0 = Pr0.c0();
        mr0C0.v(h(c8477il0.b()));
        byte[] bArrD2 = c8477il0.e().d(uk0);
        mr0C0.u(Zt0.z(bArrD2, 0, bArrD2.length));
        vq0C0.v((Pr0) mr0C0.p());
        return C9874vp0.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((Xq0) vq0C0.p()).a(), Xr0.SYMMETRIC, i(c8477il0.b().h()), c8477il0.f());
    }

    public static /* synthetic */ C9981wp0 d(C9438rl0 c9438rl0) {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        Yq0 yq0B0 = C7636ar0.b0();
        C8062er0 c8062er0C0 = C8276gr0.c0();
        C8383hr0 c8383hr0C0 = C8595jr0.c0();
        c8383hr0C0.u(c9438rl0.d());
        c8062er0C0.v((C8595jr0) c8383hr0C0.p());
        c8062er0C0.u(c9438rl0.b());
        yq0B0.u((C8276gr0) c8062er0C0.p());
        Qr0 qr0D0 = Sr0.d0();
        qr0D0.v(h(c9438rl0));
        qr0D0.u(c9438rl0.c());
        yq0B0.v((Sr0) qr0D0.p());
        c7745bs0B0.w(((C7636ar0) yq0B0.p()).a());
        c7745bs0B0.u(i(c9438rl0.h()));
        return C9981wp0.b((C7957ds0) c7745bs0B0.p());
    }

    private static C9118ol0 f(Lr0 lr0) throws GeneralSecurityException {
        int iOrdinal = lr0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return C9118ol0.f78260c;
                        }
                        throw new GeneralSecurityException("Unable to parse HashType: " + lr0.zza());
                    }
                    return C9118ol0.f78263f;
                }
                return C9118ol0.f78261d;
            }
            return C9118ol0.f78262e;
        }
        return C9118ol0.f78259b;
    }

    private static C9225pl0 g(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                    }
                } else {
                    return C9225pl0.f78478d;
                }
            }
            return C9225pl0.f78477c;
        }
        return C9225pl0.f78476b;
    }

    private static Vr0 h(C9438rl0 c9438rl0) throws GeneralSecurityException {
        Lr0 lr0;
        Tr0 tr0D0 = Vr0.d0();
        tr0D0.v(c9438rl0.e());
        C9118ol0 c9118ol0G = c9438rl0.g();
        if (C9118ol0.f78259b.equals(c9118ol0G)) {
            lr0 = Lr0.SHA1;
        } else if (C9118ol0.f78260c.equals(c9118ol0G)) {
            lr0 = Lr0.SHA224;
        } else if (C9118ol0.f78261d.equals(c9118ol0G)) {
            lr0 = Lr0.SHA256;
        } else if (C9118ol0.f78262e.equals(c9118ol0G)) {
            lr0 = Lr0.SHA384;
        } else if (C9118ol0.f78263f.equals(c9118ol0G)) {
            lr0 = Lr0.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(c9118ol0G)));
        }
        tr0D0.u(lr0);
        return (Vr0) tr0D0.p();
    }
}
