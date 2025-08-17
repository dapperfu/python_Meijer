package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Fn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f66853a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8147gp0 f66854b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7720cp0 f66855c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9640uo0 f66856d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9213qo0 f66857e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f66858f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f66853a = et0B;
        f66854b = AbstractC8147gp0.b(new InterfaceC7933ep0() { // from class: com.google.android.gms.internal.ads.Bn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7933ep0
            public final Ap0 a(Qk0 qk0) {
                return Fn0.d((C7927em0) qk0);
            }
        }, C7927em0.class, C9856wp0.class);
        f66855c = AbstractC7720cp0.b(new InterfaceC7507ap0() { // from class: com.google.android.gms.internal.ads.Cn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7507ap0
            public final Qk0 a(Ap0 ap0) {
                return Fn0.b((C9856wp0) ap0);
            }
        }, et0B, C9856wp0.class);
        f66856d = AbstractC9640uo0.b(new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.Dn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return Fn0.c((Zl0) ck0, uk0);
            }
        }, Zl0.class, C9749vp0.class);
        f66857e = AbstractC9213qo0.b(new InterfaceC8999oo0() { // from class: com.google.android.gms.internal.ads.En0
            @Override // com.google.android.gms.internal.ads.InterfaceC8999oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return Fn0.a((C9749vp0) ap0, uk0);
            }
        }, et0B, C9749vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f66854b);
        xo0.h(f66855c);
        xo0.g(f66856d);
        xo0.f(f66857e);
    }

    private static Es0 g(C7821dm0 c7821dm0) throws GeneralSecurityException {
        if (C7821dm0.f73475b.equals(c7821dm0)) {
            return Es0.TINK;
        }
        if (C7821dm0.f73476c.equals(c7821dm0)) {
            return Es0.CRUNCHY;
        }
        if (C7821dm0.f73477d.equals(c7821dm0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c7821dm0.toString()));
    }

    public static /* synthetic */ Zl0 a(C9749vp0 c9749vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9749vp0.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                Hr0 hr0E0 = Hr0.e0(c9749vp0.d(), C9225qu0.a());
                if (hr0E0.b0() == 0) {
                    return Zl0.a(f(c9749vp0.c()), Ft0.b(hr0E0.f0().a(), uk0), c9749vp0.e());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ C7927em0 b(C9856wp0 c9856wp0) throws GeneralSecurityException {
        if (c9856wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                Kr0.d0(c9856wp0.c().h0(), C9225qu0.a());
                return C7927em0.c(f(c9856wp0.c().g0()));
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c9856wp0.c().i0())));
    }

    public static /* synthetic */ C9749vp0 c(Zl0 zl0, Uk0 uk0) {
        Fr0 fr0C0 = Hr0.c0();
        byte[] bArrD = zl0.d().d(uk0);
        fr0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9749vp0.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((Hr0) fr0C0.p()).a(), Xr0.SYMMETRIC, g(zl0.b().b()), zl0.e());
    }

    public static /* synthetic */ C9856wp0 d(C7927em0 c7927em0) {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        c7620bs0B0.w(Kr0.c0().a());
        c7620bs0B0.u(g(c7927em0.b()));
        return C9856wp0.b((C7832ds0) c7620bs0B0.p());
    }

    private static C7821dm0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                    }
                } else {
                    return C7821dm0.f73477d;
                }
            }
            return C7821dm0.f73476c;
        }
        return C7821dm0.f73475b;
    }
}
