package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Jq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f67974a;

    /* renamed from: b, reason: collision with root package name */
    private static final C8464jo0 f67975b;

    /* renamed from: c, reason: collision with root package name */
    private static final C8464jo0 f67976c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC8147gp0 f67977d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC7720cp0 f67978e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC9640uo0 f67979f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC9213qo0 f67980g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f67981h = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f67974a = et0B;
        C8252ho0 c8252ho0A = C8464jo0.a();
        c8252ho0A.a(Es0.RAW, C8256hq0.f74792e);
        c8252ho0A.a(Es0.TINK, C8256hq0.f74789b);
        c8252ho0A.a(Es0.LEGACY, C8256hq0.f74791d);
        c8252ho0A.a(Es0.CRUNCHY, C8256hq0.f74790c);
        f67975b = c8252ho0A.b();
        C8252ho0 c8252ho0A2 = C8464jo0.a();
        c8252ho0A2.a(Lr0.SHA1, C8149gq0.f74404b);
        c8252ho0A2.a(Lr0.SHA224, C8149gq0.f74405c);
        c8252ho0A2.a(Lr0.SHA256, C8149gq0.f74406d);
        c8252ho0A2.a(Lr0.SHA384, C8149gq0.f74407e);
        c8252ho0A2.a(Lr0.SHA512, C8149gq0.f74408f);
        f67976c = c8252ho0A2.b();
        f67977d = AbstractC8147gp0.b(new InterfaceC7933ep0() { // from class: com.google.android.gms.internal.ads.Fq0
            @Override // com.google.android.gms.internal.ads.InterfaceC7933ep0
            public final Ap0 a(Qk0 qk0) {
                return Jq0.b((C8468jq0) qk0);
            }
        }, C8468jq0.class, C9856wp0.class);
        f67978e = AbstractC7720cp0.b(new InterfaceC7507ap0() { // from class: com.google.android.gms.internal.ads.Gq0
            @Override // com.google.android.gms.internal.ads.InterfaceC7507ap0
            public final Qk0 a(Ap0 ap0) {
                return Jq0.d((C9856wp0) ap0);
            }
        }, et0B, C9856wp0.class);
        f67979f = AbstractC9640uo0.b(new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.Hq0
            @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return Jq0.a((Zp0) ck0, uk0);
            }
        }, Zp0.class, C9749vp0.class);
        f67980g = AbstractC9213qo0.b(new InterfaceC8999oo0() { // from class: com.google.android.gms.internal.ads.Iq0
            @Override // com.google.android.gms.internal.ads.InterfaceC8999oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return Jq0.c((C9749vp0) ap0, uk0);
            }
        }, et0B, C9749vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f67977d);
        xo0.h(f67978e);
        xo0.g(f67979f);
        xo0.f(f67980g);
    }

    public static /* synthetic */ C9749vp0 a(Zp0 zp0, Uk0 uk0) {
        Mr0 mr0C0 = Pr0.c0();
        mr0C0.v(f(zp0.b()));
        byte[] bArrD = zp0.d().d(uk0);
        mr0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9749vp0.a("type.googleapis.com/google.crypto.tink.HmacKey", ((Pr0) mr0C0.p()).a(), Xr0.SYMMETRIC, (Es0) f67975b.b(zp0.b().g()), zp0.e());
    }

    public static /* synthetic */ C9856wp0 b(C8468jq0 c8468jq0) {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v("type.googleapis.com/google.crypto.tink.HmacKey");
        Qr0 qr0D0 = Sr0.d0();
        qr0D0.v(f(c8468jq0));
        qr0D0.u(c8468jq0.c());
        c7620bs0B0.w(((Sr0) qr0D0.p()).a());
        c7620bs0B0.u((Es0) f67975b.b(c8468jq0.g()));
        return C9856wp0.b((C7832ds0) c7620bs0B0.p());
    }

    public static /* synthetic */ Zp0 c(C9749vp0 c9749vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9749vp0.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                Pr0 pr0F0 = Pr0.f0(c9749vp0.d(), C9225qu0.a());
                if (pr0F0.b0() == 0) {
                    C8042fq0 c8042fq0E = C8468jq0.e();
                    c8042fq0E.b(pr0F0.h0().k());
                    c8042fq0E.c(pr0F0.g0().b0());
                    c8042fq0E.a((C8149gq0) f67976c.c(pr0F0.g0().c0()));
                    c8042fq0E.d((C8256hq0) f67975b.c(c9749vp0.c()));
                    C8468jq0 c8468jq0E = c8042fq0E.e();
                    Xp0 xp0A = Zp0.a();
                    xp0A.c(c8468jq0E);
                    xp0A.b(Ft0.b(pr0F0.h0().a(), uk0));
                    xp0A.a(c9749vp0.e());
                    return xp0A.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ C8468jq0 d(C9856wp0 c9856wp0) throws GeneralSecurityException {
        if (c9856wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                Sr0 sr0G0 = Sr0.g0(c9856wp0.c().h0(), C9225qu0.a());
                if (sr0G0.c0() == 0) {
                    C8042fq0 c8042fq0E = C8468jq0.e();
                    c8042fq0E.b(sr0G0.b0());
                    c8042fq0E.c(sr0G0.h0().b0());
                    c8042fq0E.a((C8149gq0) f67976c.c(sr0G0.h0().c0()));
                    c8042fq0E.d((C8256hq0) f67975b.c(c9856wp0.c().g0()));
                    return c8042fq0E.e();
                }
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + sr0G0.c0());
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(c9856wp0.c().i0())));
    }

    private static Vr0 f(C8468jq0 c8468jq0) throws GeneralSecurityException {
        Tr0 tr0D0 = Vr0.d0();
        tr0D0.v(c8468jq0.b());
        tr0D0.u((Lr0) f67976c.b(c8468jq0.f()));
        return (Vr0) tr0D0.p();
    }
}
