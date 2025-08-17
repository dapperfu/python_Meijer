package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Bq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f65600a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8147gp0 f65601b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7720cp0 f65602c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9640uo0 f65603d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9213qo0 f65604e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f65605f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f65600a = et0B;
        f65601b = AbstractC8147gp0.b(new InterfaceC7933ep0() { // from class: com.google.android.gms.internal.ads.xq0
            @Override // com.google.android.gms.internal.ads.InterfaceC7933ep0
            public final Ap0 a(Qk0 qk0) {
                return Bq0.b((Sp0) qk0);
            }
        }, Sp0.class, C9856wp0.class);
        f65602c = AbstractC7720cp0.b(new InterfaceC7507ap0() { // from class: com.google.android.gms.internal.ads.yq0
            @Override // com.google.android.gms.internal.ads.InterfaceC7507ap0
            public final Qk0 a(Ap0 ap0) {
                return Bq0.d((C9856wp0) ap0);
            }
        }, et0B, C9856wp0.class);
        f65603d = AbstractC9640uo0.b(new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.zq0
            @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return Bq0.a((Kp0) ck0, uk0);
            }
        }, Kp0.class, C9749vp0.class);
        f65604e = AbstractC9213qo0.b(new InterfaceC8999oo0() { // from class: com.google.android.gms.internal.ads.Aq0
            @Override // com.google.android.gms.internal.ads.InterfaceC8999oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return Bq0.c((C9749vp0) ap0, uk0);
            }
        }, et0B, C9749vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f65601b);
        xo0.h(f65602c);
        xo0.g(f65603d);
        xo0.f(f65604e);
    }

    private static Es0 h(Qp0 qp0) throws GeneralSecurityException {
        if (Qp0.f69659b.equals(qp0)) {
            return Es0.TINK;
        }
        if (Qp0.f69660c.equals(qp0)) {
            return Es0.CRUNCHY;
        }
        if (Qp0.f69662e.equals(qp0)) {
            return Es0.RAW;
        }
        if (Qp0.f69661d.equals(qp0)) {
            return Es0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(qp0)));
    }

    public static /* synthetic */ C9749vp0 a(Kp0 kp0, Uk0 uk0) {
        Mq0 mq0C0 = Oq0.c0();
        mq0C0.v(g(kp0.b()));
        byte[] bArrD = kp0.d().d(uk0);
        mq0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9749vp0.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((Oq0) mq0C0.p()).a(), Xr0.SYMMETRIC, h(kp0.b().f()), kp0.e());
    }

    public static /* synthetic */ C9856wp0 b(Sp0 sp0) {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v("type.googleapis.com/google.crypto.tink.AesCmacKey");
        Pq0 pq0C0 = Rq0.c0();
        pq0C0.v(g(sp0));
        pq0C0.u(sp0.c());
        c7620bs0B0.w(((Rq0) pq0C0.p()).a());
        c7620bs0B0.u(h(sp0.f()));
        return C9856wp0.b((C7832ds0) c7620bs0B0.p());
    }

    public static /* synthetic */ Kp0 c(C9749vp0 c9749vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9749vp0.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                Oq0 oq0E0 = Oq0.e0(c9749vp0.d(), C9225qu0.a());
                if (oq0E0.b0() == 0) {
                    Pp0 pp0E = Sp0.e();
                    pp0E.a(oq0E0.g0().k());
                    pp0E.b(oq0E0.f0().b0());
                    pp0E.c(f(c9749vp0.c()));
                    Sp0 sp0D = pp0E.d();
                    Ip0 ip0A = Kp0.a();
                    ip0A.c(sp0D);
                    ip0A.a(Ft0.b(oq0E0.g0().a(), uk0));
                    ip0A.b(c9749vp0.e());
                    return ip0A.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ Sp0 d(C9856wp0 c9856wp0) throws GeneralSecurityException {
        if (c9856wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                Rq0 rq0E0 = Rq0.e0(c9856wp0.c().h0(), C9225qu0.a());
                Pp0 pp0E = Sp0.e();
                pp0E.a(rq0E0.b0());
                pp0E.b(rq0E0.f0().b0());
                pp0E.c(f(c9856wp0.c().g0()));
                return pp0E.d();
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(c9856wp0.c().i0())));
    }

    private static Qp0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        return Qp0.f69660c;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                }
                return Qp0.f69662e;
            }
            return Qp0.f69661d;
        }
        return Qp0.f69659b;
    }

    private static Uq0 g(Sp0 sp0) {
        Sq0 sq0C0 = Uq0.c0();
        sq0C0.u(sp0.b());
        return (Uq0) sq0C0.p();
    }
}
