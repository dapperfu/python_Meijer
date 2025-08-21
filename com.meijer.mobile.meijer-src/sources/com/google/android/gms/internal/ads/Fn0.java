package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Fn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f67693a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8272gp0 f67694b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7845cp0 f67695c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9765uo0 f67696d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9338qo0 f67697e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f67698f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f67693a = et0B;
        f67694b = AbstractC8272gp0.b(new InterfaceC8058ep0() { // from class: com.google.android.gms.internal.ads.Bn0
            @Override // com.google.android.gms.internal.ads.InterfaceC8058ep0
            public final Ap0 a(Qk0 qk0) {
                return Fn0.d((C8052em0) qk0);
            }
        }, C8052em0.class, C9981wp0.class);
        f67695c = AbstractC7845cp0.b(new InterfaceC7632ap0() { // from class: com.google.android.gms.internal.ads.Cn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7632ap0
            public final Qk0 a(Ap0 ap0) {
                return Fn0.b((C9981wp0) ap0);
            }
        }, et0B, C9981wp0.class);
        f67696d = AbstractC9765uo0.b(new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.Dn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return Fn0.c((Zl0) ck0, uk0);
            }
        }, Zl0.class, C9874vp0.class);
        f67697e = AbstractC9338qo0.b(new InterfaceC9124oo0() { // from class: com.google.android.gms.internal.ads.En0
            @Override // com.google.android.gms.internal.ads.InterfaceC9124oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return Fn0.a((C9874vp0) ap0, uk0);
            }
        }, et0B, C9874vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f67694b);
        xo0.h(f67695c);
        xo0.g(f67696d);
        xo0.f(f67697e);
    }

    private static Es0 g(C7946dm0 c7946dm0) throws GeneralSecurityException {
        if (C7946dm0.f74315b.equals(c7946dm0)) {
            return Es0.TINK;
        }
        if (C7946dm0.f74316c.equals(c7946dm0)) {
            return Es0.CRUNCHY;
        }
        if (C7946dm0.f74317d.equals(c7946dm0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c7946dm0.toString()));
    }

    public static /* synthetic */ Zl0 a(C9874vp0 c9874vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9874vp0.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                Hr0 hr0E0 = Hr0.e0(c9874vp0.d(), C9350qu0.a());
                if (hr0E0.b0() == 0) {
                    return Zl0.a(f(c9874vp0.c()), Ft0.b(hr0E0.f0().a(), uk0), c9874vp0.e());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ C8052em0 b(C9981wp0 c9981wp0) throws GeneralSecurityException {
        if (c9981wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                Kr0.d0(c9981wp0.c().h0(), C9350qu0.a());
                return C8052em0.c(f(c9981wp0.c().g0()));
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c9981wp0.c().i0())));
    }

    public static /* synthetic */ C9874vp0 c(Zl0 zl0, Uk0 uk0) {
        Fr0 fr0C0 = Hr0.c0();
        byte[] bArrD = zl0.d().d(uk0);
        fr0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9874vp0.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((Hr0) fr0C0.p()).a(), Xr0.SYMMETRIC, g(zl0.b().b()), zl0.e());
    }

    public static /* synthetic */ C9981wp0 d(C8052em0 c8052em0) {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        c7745bs0B0.w(Kr0.c0().a());
        c7745bs0B0.u(g(c8052em0.b()));
        return C9981wp0.b((C7957ds0) c7745bs0B0.p());
    }

    private static C7946dm0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                    }
                } else {
                    return C7946dm0.f74317d;
                }
            }
            return C7946dm0.f74316c;
        }
        return C7946dm0.f74315b;
    }
}
