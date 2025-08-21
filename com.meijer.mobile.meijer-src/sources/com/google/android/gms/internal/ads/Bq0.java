package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Bq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f66440a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8272gp0 f66441b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7845cp0 f66442c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9765uo0 f66443d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9338qo0 f66444e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f66445f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f66440a = et0B;
        f66441b = AbstractC8272gp0.b(new InterfaceC8058ep0() { // from class: com.google.android.gms.internal.ads.xq0
            @Override // com.google.android.gms.internal.ads.InterfaceC8058ep0
            public final Ap0 a(Qk0 qk0) {
                return Bq0.b((Sp0) qk0);
            }
        }, Sp0.class, C9981wp0.class);
        f66442c = AbstractC7845cp0.b(new InterfaceC7632ap0() { // from class: com.google.android.gms.internal.ads.yq0
            @Override // com.google.android.gms.internal.ads.InterfaceC7632ap0
            public final Qk0 a(Ap0 ap0) {
                return Bq0.d((C9981wp0) ap0);
            }
        }, et0B, C9981wp0.class);
        f66443d = AbstractC9765uo0.b(new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.zq0
            @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return Bq0.a((Kp0) ck0, uk0);
            }
        }, Kp0.class, C9874vp0.class);
        f66444e = AbstractC9338qo0.b(new InterfaceC9124oo0() { // from class: com.google.android.gms.internal.ads.Aq0
            @Override // com.google.android.gms.internal.ads.InterfaceC9124oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return Bq0.c((C9874vp0) ap0, uk0);
            }
        }, et0B, C9874vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f66441b);
        xo0.h(f66442c);
        xo0.g(f66443d);
        xo0.f(f66444e);
    }

    private static Es0 h(Qp0 qp0) throws GeneralSecurityException {
        if (Qp0.f70499b.equals(qp0)) {
            return Es0.TINK;
        }
        if (Qp0.f70500c.equals(qp0)) {
            return Es0.CRUNCHY;
        }
        if (Qp0.f70502e.equals(qp0)) {
            return Es0.RAW;
        }
        if (Qp0.f70501d.equals(qp0)) {
            return Es0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(qp0)));
    }

    public static /* synthetic */ C9874vp0 a(Kp0 kp0, Uk0 uk0) {
        Mq0 mq0C0 = Oq0.c0();
        mq0C0.v(g(kp0.b()));
        byte[] bArrD = kp0.d().d(uk0);
        mq0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9874vp0.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((Oq0) mq0C0.p()).a(), Xr0.SYMMETRIC, h(kp0.b().f()), kp0.e());
    }

    public static /* synthetic */ C9981wp0 b(Sp0 sp0) {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v("type.googleapis.com/google.crypto.tink.AesCmacKey");
        Pq0 pq0C0 = Rq0.c0();
        pq0C0.v(g(sp0));
        pq0C0.u(sp0.c());
        c7745bs0B0.w(((Rq0) pq0C0.p()).a());
        c7745bs0B0.u(h(sp0.f()));
        return C9981wp0.b((C7957ds0) c7745bs0B0.p());
    }

    public static /* synthetic */ Kp0 c(C9874vp0 c9874vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9874vp0.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                Oq0 oq0E0 = Oq0.e0(c9874vp0.d(), C9350qu0.a());
                if (oq0E0.b0() == 0) {
                    Pp0 pp0E = Sp0.e();
                    pp0E.a(oq0E0.g0().k());
                    pp0E.b(oq0E0.f0().b0());
                    pp0E.c(f(c9874vp0.c()));
                    Sp0 sp0D = pp0E.d();
                    Ip0 ip0A = Kp0.a();
                    ip0A.c(sp0D);
                    ip0A.a(Ft0.b(oq0E0.g0().a(), uk0));
                    ip0A.b(c9874vp0.e());
                    return ip0A.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ Sp0 d(C9981wp0 c9981wp0) throws GeneralSecurityException {
        if (c9981wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                Rq0 rq0E0 = Rq0.e0(c9981wp0.c().h0(), C9350qu0.a());
                Pp0 pp0E = Sp0.e();
                pp0E.a(rq0E0.b0());
                pp0E.b(rq0E0.f0().b0());
                pp0E.c(f(c9981wp0.c().g0()));
                return pp0E.d();
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(c9981wp0.c().i0())));
    }

    private static Qp0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        return Qp0.f70500c;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                }
                return Qp0.f70502e;
            }
            return Qp0.f70501d;
        }
        return Qp0.f70499b;
    }

    private static Uq0 g(Sp0 sp0) {
        Sq0 sq0C0 = Uq0.c0();
        sq0C0.u(sp0.b());
        return (Uq0) sq0C0.p();
    }
}
