package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.bo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7612bo0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f72869a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8147gp0 f72870b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7720cp0 f72871c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9640uo0 f72872d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9213qo0 f72873e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f72874f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f72869a = et0B;
        f72870b = AbstractC8147gp0.b(new InterfaceC7933ep0() { // from class: com.google.android.gms.internal.ads.Xn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7933ep0
            public final Ap0 a(Qk0 qk0) {
                return C7612bo0.d((C7610bn0) qk0);
            }
        }, C7610bn0.class, C9856wp0.class);
        f72871c = AbstractC7720cp0.b(new InterfaceC7507ap0() { // from class: com.google.android.gms.internal.ads.Yn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7507ap0
            public final Qk0 a(Ap0 ap0) {
                return C7612bo0.b((C9856wp0) ap0);
            }
        }, et0B, C9856wp0.class);
        f72872d = AbstractC9640uo0.b(new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.Zn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C7612bo0.c((Vm0) ck0, uk0);
            }
        }, Vm0.class, C9749vp0.class);
        f72873e = AbstractC9213qo0.b(new InterfaceC8999oo0() { // from class: com.google.android.gms.internal.ads.ao0
            @Override // com.google.android.gms.internal.ads.InterfaceC8999oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C7612bo0.a((C9749vp0) ap0, uk0);
            }
        }, et0B, C9749vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f72870b);
        xo0.h(f72871c);
        xo0.g(f72872d);
        xo0.f(f72873e);
    }

    private static Es0 g(C7503an0 c7503an0) throws GeneralSecurityException {
        if (C7503an0.f72492b.equals(c7503an0)) {
            return Es0.TINK;
        }
        if (C7503an0.f72493c.equals(c7503an0)) {
            return Es0.CRUNCHY;
        }
        if (C7503an0.f72494d.equals(c7503an0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c7503an0.toString()));
    }

    public static /* synthetic */ Vm0 a(C9749vp0 c9749vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9749vp0.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                Us0 us0E0 = Us0.e0(c9749vp0.d(), C9225qu0.a());
                if (us0E0.b0() == 0) {
                    return Vm0.a(f(c9749vp0.c()), Ft0.b(us0E0.f0().a(), uk0), c9749vp0.e());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ C7610bn0 b(C9856wp0 c9856wp0) throws GeneralSecurityException {
        if (c9856wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (Xs0.e0(c9856wp0.c().h0(), C9225qu0.a()).b0() == 0) {
                    return C7610bn0.c(f(c9856wp0.c().g0()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c9856wp0.c().i0())));
    }

    public static /* synthetic */ C9749vp0 c(Vm0 vm0, Uk0 uk0) {
        Ss0 ss0C0 = Us0.c0();
        byte[] bArrD = vm0.d().d(uk0);
        ss0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9749vp0.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((Us0) ss0C0.p()).a(), Xr0.SYMMETRIC, g(vm0.b().b()), vm0.e());
    }

    public static /* synthetic */ C9856wp0 d(C7610bn0 c7610bn0) {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        c7620bs0B0.w(Xs0.d0().a());
        c7620bs0B0.u(g(c7610bn0.b()));
        return C9856wp0.b((C7832ds0) c7620bs0B0.p());
    }

    private static C7503an0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                    }
                } else {
                    return C7503an0.f72494d;
                }
            }
            return C7503an0.f72493c;
        }
        return C7503an0.f72492b;
    }
}
