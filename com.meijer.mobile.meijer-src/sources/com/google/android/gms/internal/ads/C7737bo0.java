package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.bo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7737bo0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f73709a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8272gp0 f73710b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7845cp0 f73711c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9765uo0 f73712d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9338qo0 f73713e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f73714f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f73709a = et0B;
        f73710b = AbstractC8272gp0.b(new InterfaceC8058ep0() { // from class: com.google.android.gms.internal.ads.Xn0
            @Override // com.google.android.gms.internal.ads.InterfaceC8058ep0
            public final Ap0 a(Qk0 qk0) {
                return C7737bo0.d((C7735bn0) qk0);
            }
        }, C7735bn0.class, C9981wp0.class);
        f73711c = AbstractC7845cp0.b(new InterfaceC7632ap0() { // from class: com.google.android.gms.internal.ads.Yn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7632ap0
            public final Qk0 a(Ap0 ap0) {
                return C7737bo0.b((C9981wp0) ap0);
            }
        }, et0B, C9981wp0.class);
        f73712d = AbstractC9765uo0.b(new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.Zn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C7737bo0.c((Vm0) ck0, uk0);
            }
        }, Vm0.class, C9874vp0.class);
        f73713e = AbstractC9338qo0.b(new InterfaceC9124oo0() { // from class: com.google.android.gms.internal.ads.ao0
            @Override // com.google.android.gms.internal.ads.InterfaceC9124oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C7737bo0.a((C9874vp0) ap0, uk0);
            }
        }, et0B, C9874vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f73710b);
        xo0.h(f73711c);
        xo0.g(f73712d);
        xo0.f(f73713e);
    }

    private static Es0 g(C7628an0 c7628an0) throws GeneralSecurityException {
        if (C7628an0.f73332b.equals(c7628an0)) {
            return Es0.TINK;
        }
        if (C7628an0.f73333c.equals(c7628an0)) {
            return Es0.CRUNCHY;
        }
        if (C7628an0.f73334d.equals(c7628an0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c7628an0.toString()));
    }

    public static /* synthetic */ Vm0 a(C9874vp0 c9874vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9874vp0.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                Us0 us0E0 = Us0.e0(c9874vp0.d(), C9350qu0.a());
                if (us0E0.b0() == 0) {
                    return Vm0.a(f(c9874vp0.c()), Ft0.b(us0E0.f0().a(), uk0), c9874vp0.e());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ C7735bn0 b(C9981wp0 c9981wp0) throws GeneralSecurityException {
        if (c9981wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (Xs0.e0(c9981wp0.c().h0(), C9350qu0.a()).b0() == 0) {
                    return C7735bn0.c(f(c9981wp0.c().g0()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c9981wp0.c().i0())));
    }

    public static /* synthetic */ C9874vp0 c(Vm0 vm0, Uk0 uk0) {
        Ss0 ss0C0 = Us0.c0();
        byte[] bArrD = vm0.d().d(uk0);
        ss0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9874vp0.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((Us0) ss0C0.p()).a(), Xr0.SYMMETRIC, g(vm0.b().b()), vm0.e());
    }

    public static /* synthetic */ C9981wp0 d(C7735bn0 c7735bn0) {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        c7745bs0B0.w(Xs0.d0().a());
        c7745bs0B0.u(g(c7735bn0.b()));
        return C9981wp0.b((C7957ds0) c7745bs0B0.p());
    }

    private static C7628an0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                    }
                } else {
                    return C7628an0.f73334d;
                }
            }
            return C7628an0.f73333c;
        }
        return C7628an0.f73332b;
    }
}
