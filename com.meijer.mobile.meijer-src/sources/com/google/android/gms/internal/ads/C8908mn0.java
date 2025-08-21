package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.mn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8908mn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f77725a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8272gp0 f77726b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7845cp0 f77727c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9765uo0 f77728d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9338qo0 f77729e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f77730f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f77725a = et0B;
        f77726b = AbstractC8272gp0.b(new InterfaceC8058ep0() { // from class: com.google.android.gms.internal.ads.hn0
            @Override // com.google.android.gms.internal.ads.InterfaceC8058ep0
            public final Ap0 a(Qk0 qk0) {
                return C8908mn0.d((Bl0) qk0);
            }
        }, Bl0.class, C9981wp0.class);
        f77727c = AbstractC7845cp0.b(new InterfaceC7632ap0() { // from class: com.google.android.gms.internal.ads.in0
            @Override // com.google.android.gms.internal.ads.InterfaceC7632ap0
            public final Qk0 a(Ap0 ap0) {
                return C8908mn0.b((C9981wp0) ap0);
            }
        }, et0B, C9981wp0.class);
        f77728d = AbstractC9765uo0.b(new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.jn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C8908mn0.c((C9759ul0) ck0, uk0);
            }
        }, C9759ul0.class, C9874vp0.class);
        f77729e = AbstractC9338qo0.b(new InterfaceC9124oo0() { // from class: com.google.android.gms.internal.ads.ln0
            @Override // com.google.android.gms.internal.ads.InterfaceC9124oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C8908mn0.a((C9874vp0) ap0, uk0);
            }
        }, et0B, C9874vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f77726b);
        xo0.h(f77727c);
        xo0.g(f77728d);
        xo0.f(f77729e);
    }

    private static Es0 h(C10294zl0 c10294zl0) throws GeneralSecurityException {
        if (C10294zl0.f81307b.equals(c10294zl0)) {
            return Es0.TINK;
        }
        if (C10294zl0.f81308c.equals(c10294zl0)) {
            return Es0.CRUNCHY;
        }
        if (C10294zl0.f81309d.equals(c10294zl0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c10294zl0)));
    }

    public static /* synthetic */ C9759ul0 a(C9874vp0 c9874vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9874vp0.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C8916mr0 c8916mr0E0 = C8916mr0.e0(c9874vp0.d(), C9350qu0.a());
                if (c8916mr0E0.b0() == 0) {
                    C10187yl0 c10187yl0D = Bl0.d();
                    c10187yl0D.b(c8916mr0E0.g0().k());
                    c10187yl0D.a(c8916mr0E0.f0().b0());
                    c10187yl0D.c(16);
                    c10187yl0D.d(f(c9874vp0.c()));
                    Bl0 bl0E = c10187yl0D.e();
                    C9545sl0 c9545sl0A = C9759ul0.a();
                    c9545sl0A.c(bl0E);
                    c9545sl0A.b(Ft0.b(c8916mr0E0.g0().a(), uk0));
                    c9545sl0A.a(c9874vp0.e());
                    return c9545sl0A.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    public static /* synthetic */ Bl0 b(C9981wp0 c9981wp0) throws GeneralSecurityException {
        if (c9981wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C9237pr0 c9237pr0E0 = C9237pr0.e0(c9981wp0.c().h0(), C9350qu0.a());
                C10187yl0 c10187yl0D = Bl0.d();
                c10187yl0D.b(c9237pr0E0.b0());
                c10187yl0D.a(c9237pr0E0.f0().b0());
                c10187yl0D.c(16);
                c10187yl0D.d(f(c9981wp0.c().g0()));
                return c10187yl0D.e();
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(c9981wp0.c().i0())));
    }

    public static /* synthetic */ C9874vp0 c(C9759ul0 c9759ul0, Uk0 uk0) {
        C8702kr0 c8702kr0C0 = C8916mr0.c0();
        c8702kr0C0.v(g(c9759ul0.b()));
        byte[] bArrD = c9759ul0.d().d(uk0);
        c8702kr0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9874vp0.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C8916mr0) c8702kr0C0.p()).a(), Xr0.SYMMETRIC, h(c9759ul0.b().e()), c9759ul0.e());
    }

    public static /* synthetic */ C9981wp0 d(Bl0 bl0) {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v("type.googleapis.com/google.crypto.tink.AesEaxKey");
        C9023nr0 c9023nr0C0 = C9237pr0.c0();
        c9023nr0C0.v(g(bl0));
        c9023nr0C0.u(bl0.c());
        c7745bs0B0.w(((C9237pr0) c9023nr0C0.p()).a());
        c7745bs0B0.u(h(bl0.e()));
        return C9981wp0.b((C7957ds0) c7745bs0B0.p());
    }

    private static C10294zl0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                    }
                } else {
                    return C10294zl0.f81309d;
                }
            }
            return C10294zl0.f81308c;
        }
        return C10294zl0.f81307b;
    }

    private static C9557sr0 g(Bl0 bl0) throws GeneralSecurityException {
        C9344qr0 c9344qr0C0 = C9557sr0.c0();
        c9344qr0C0.u(bl0.b());
        return (C9557sr0) c9344qr0C0.p();
    }
}
