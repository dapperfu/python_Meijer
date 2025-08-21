package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Jq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f68814a;

    /* renamed from: b, reason: collision with root package name */
    private static final C8589jo0 f68815b;

    /* renamed from: c, reason: collision with root package name */
    private static final C8589jo0 f68816c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC8272gp0 f68817d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC7845cp0 f68818e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC9765uo0 f68819f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC9338qo0 f68820g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f68821h = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f68814a = et0B;
        C8377ho0 c8377ho0A = C8589jo0.a();
        c8377ho0A.a(Es0.RAW, C8381hq0.f75632e);
        c8377ho0A.a(Es0.TINK, C8381hq0.f75629b);
        c8377ho0A.a(Es0.LEGACY, C8381hq0.f75631d);
        c8377ho0A.a(Es0.CRUNCHY, C8381hq0.f75630c);
        f68815b = c8377ho0A.b();
        C8377ho0 c8377ho0A2 = C8589jo0.a();
        c8377ho0A2.a(Lr0.SHA1, C8274gq0.f75244b);
        c8377ho0A2.a(Lr0.SHA224, C8274gq0.f75245c);
        c8377ho0A2.a(Lr0.SHA256, C8274gq0.f75246d);
        c8377ho0A2.a(Lr0.SHA384, C8274gq0.f75247e);
        c8377ho0A2.a(Lr0.SHA512, C8274gq0.f75248f);
        f68816c = c8377ho0A2.b();
        f68817d = AbstractC8272gp0.b(new InterfaceC8058ep0() { // from class: com.google.android.gms.internal.ads.Fq0
            @Override // com.google.android.gms.internal.ads.InterfaceC8058ep0
            public final Ap0 a(Qk0 qk0) {
                return Jq0.b((C8593jq0) qk0);
            }
        }, C8593jq0.class, C9981wp0.class);
        f68818e = AbstractC7845cp0.b(new InterfaceC7632ap0() { // from class: com.google.android.gms.internal.ads.Gq0
            @Override // com.google.android.gms.internal.ads.InterfaceC7632ap0
            public final Qk0 a(Ap0 ap0) {
                return Jq0.d((C9981wp0) ap0);
            }
        }, et0B, C9981wp0.class);
        f68819f = AbstractC9765uo0.b(new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.Hq0
            @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return Jq0.a((Zp0) ck0, uk0);
            }
        }, Zp0.class, C9874vp0.class);
        f68820g = AbstractC9338qo0.b(new InterfaceC9124oo0() { // from class: com.google.android.gms.internal.ads.Iq0
            @Override // com.google.android.gms.internal.ads.InterfaceC9124oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return Jq0.c((C9874vp0) ap0, uk0);
            }
        }, et0B, C9874vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f68817d);
        xo0.h(f68818e);
        xo0.g(f68819f);
        xo0.f(f68820g);
    }

    public static /* synthetic */ C9874vp0 a(Zp0 zp0, Uk0 uk0) {
        Mr0 mr0C0 = Pr0.c0();
        mr0C0.v(f(zp0.b()));
        byte[] bArrD = zp0.d().d(uk0);
        mr0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9874vp0.a("type.googleapis.com/google.crypto.tink.HmacKey", ((Pr0) mr0C0.p()).a(), Xr0.SYMMETRIC, (Es0) f68815b.b(zp0.b().g()), zp0.e());
    }

    public static /* synthetic */ C9981wp0 b(C8593jq0 c8593jq0) {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v("type.googleapis.com/google.crypto.tink.HmacKey");
        Qr0 qr0D0 = Sr0.d0();
        qr0D0.v(f(c8593jq0));
        qr0D0.u(c8593jq0.c());
        c7745bs0B0.w(((Sr0) qr0D0.p()).a());
        c7745bs0B0.u((Es0) f68815b.b(c8593jq0.g()));
        return C9981wp0.b((C7957ds0) c7745bs0B0.p());
    }

    public static /* synthetic */ Zp0 c(C9874vp0 c9874vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9874vp0.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                Pr0 pr0F0 = Pr0.f0(c9874vp0.d(), C9350qu0.a());
                if (pr0F0.b0() == 0) {
                    C8167fq0 c8167fq0E = C8593jq0.e();
                    c8167fq0E.b(pr0F0.h0().k());
                    c8167fq0E.c(pr0F0.g0().b0());
                    c8167fq0E.a((C8274gq0) f68816c.c(pr0F0.g0().c0()));
                    c8167fq0E.d((C8381hq0) f68815b.c(c9874vp0.c()));
                    C8593jq0 c8593jq0E = c8167fq0E.e();
                    Xp0 xp0A = Zp0.a();
                    xp0A.c(c8593jq0E);
                    xp0A.b(Ft0.b(pr0F0.h0().a(), uk0));
                    xp0A.a(c9874vp0.e());
                    return xp0A.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ C8593jq0 d(C9981wp0 c9981wp0) throws GeneralSecurityException {
        if (c9981wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                Sr0 sr0G0 = Sr0.g0(c9981wp0.c().h0(), C9350qu0.a());
                if (sr0G0.c0() == 0) {
                    C8167fq0 c8167fq0E = C8593jq0.e();
                    c8167fq0E.b(sr0G0.b0());
                    c8167fq0E.c(sr0G0.h0().b0());
                    c8167fq0E.a((C8274gq0) f68816c.c(sr0G0.h0().c0()));
                    c8167fq0E.d((C8381hq0) f68815b.c(c9981wp0.c().g0()));
                    return c8167fq0E.e();
                }
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + sr0G0.c0());
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(c9981wp0.c().i0())));
    }

    private static Vr0 f(C8593jq0 c8593jq0) throws GeneralSecurityException {
        Tr0 tr0D0 = Vr0.d0();
        tr0D0.v(c8593jq0.b());
        tr0D0.u((Lr0) f68816c.b(c8593jq0.f()));
        return (Vr0) tr0D0.p();
    }
}
