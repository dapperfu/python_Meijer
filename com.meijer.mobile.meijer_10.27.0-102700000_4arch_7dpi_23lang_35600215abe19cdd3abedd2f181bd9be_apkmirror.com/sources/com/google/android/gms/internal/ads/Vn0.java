package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Vn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f70922a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8147gp0 f70923b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7720cp0 f70924c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9640uo0 f70925d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9213qo0 f70926e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f70927f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f70922a = et0B;
        f70923b = AbstractC8147gp0.b(new InterfaceC7933ep0() { // from class: com.google.android.gms.internal.ads.Rn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7933ep0
            public final Ap0 a(Qk0 qk0) {
                return Vn0.d((Um0) qk0);
            }
        }, Um0.class, C9856wp0.class);
        f70924c = AbstractC7720cp0.b(new InterfaceC7507ap0() { // from class: com.google.android.gms.internal.ads.Sn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7507ap0
            public final Qk0 a(Ap0 ap0) {
                return Vn0.b((C9856wp0) ap0);
            }
        }, et0B, C9856wp0.class);
        f70925d = AbstractC9640uo0.b(new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.Tn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return Vn0.c((Pm0) ck0, uk0);
            }
        }, Pm0.class, C9749vp0.class);
        f70926e = AbstractC9213qo0.b(new InterfaceC8999oo0() { // from class: com.google.android.gms.internal.ads.Un0
            @Override // com.google.android.gms.internal.ads.InterfaceC8999oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return Vn0.a((C9749vp0) ap0, uk0);
            }
        }, et0B, C9749vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f70923b);
        xo0.h(f70924c);
        xo0.g(f70925d);
        xo0.f(f70926e);
    }

    private static Es0 g(Tm0 tm0) throws GeneralSecurityException {
        if (Objects.equals(tm0, Tm0.f70458b)) {
            return Es0.TINK;
        }
        if (Objects.equals(tm0, Tm0.f70459c)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(tm0.toString()));
    }

    public static /* synthetic */ Pm0 a(C9749vp0 c9749vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9749vp0.f().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                Ks0 ks0E0 = Ks0.e0(c9749vp0.d(), C9225qu0.a());
                if (ks0E0.b0() == 0) {
                    if (ks0E0.g0().k() == 32) {
                        return Pm0.a(Um0.d(f(c9749vp0.c()), ks0E0.f0().b0()), Ft0.b(ks0E0.g0().a(), uk0), c9749vp0.e());
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing XAesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
    }

    public static /* synthetic */ Um0 b(C9856wp0 c9856wp0) throws GeneralSecurityException {
        if (c9856wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                Ns0 ns0E0 = Ns0.e0(c9856wp0.c().h0(), C9225qu0.a());
                if (ns0E0.b0() == 0) {
                    return Um0.d(f(c9856wp0.c().g0()), ns0E0.f0().b0());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c9856wp0.c().i0())));
    }

    public static /* synthetic */ C9749vp0 c(Pm0 pm0, Uk0 uk0) {
        Is0 is0C0 = Ks0.c0();
        byte[] bArrD = pm0.d().d(uk0);
        is0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        Os0 os0C0 = Rs0.c0();
        os0C0.u(pm0.b().b());
        is0C0.v((Rs0) os0C0.p());
        return C9749vp0.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((Ks0) is0C0.p()).a(), Xr0.SYMMETRIC, g(pm0.b().c()), pm0.e());
    }

    public static /* synthetic */ C9856wp0 d(Um0 um0) {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        Ls0 ls0C0 = Ns0.c0();
        Os0 os0C0 = Rs0.c0();
        os0C0.u(um0.b());
        ls0C0.u((Rs0) os0C0.p());
        c7620bs0B0.w(((Ns0) ls0C0.p()).a());
        c7620bs0B0.u(g(um0.c()));
        return C9856wp0.b((C7832ds0) c7620bs0B0.p());
    }

    private static Tm0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                return Tm0.f70459c;
            }
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
        }
        return Tm0.f70458b;
    }
}
