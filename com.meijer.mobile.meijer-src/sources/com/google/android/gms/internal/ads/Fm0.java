package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Fm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f67687a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8272gp0 f67688b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7845cp0 f67689c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9765uo0 f67690d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9338qo0 f67691e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f67692f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f67687a = et0B;
        f67688b = AbstractC8272gp0.b(new InterfaceC8058ep0() { // from class: com.google.android.gms.internal.ads.Bm0
            @Override // com.google.android.gms.internal.ads.InterfaceC8058ep0
            public final Ap0 a(Qk0 qk0) {
                return Fm0.d((Am0) qk0);
            }
        }, Am0.class, C9981wp0.class);
        f67689c = AbstractC7845cp0.b(new InterfaceC7632ap0() { // from class: com.google.android.gms.internal.ads.Cm0
            @Override // com.google.android.gms.internal.ads.InterfaceC7632ap0
            public final Qk0 a(Ap0 ap0) {
                return Fm0.b((C9981wp0) ap0);
            }
        }, et0B, C9981wp0.class);
        f67690d = AbstractC9765uo0.b(new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.Dm0
            @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return Fm0.c((C9868vm0) ck0, uk0);
            }
        }, C9868vm0.class, C9874vp0.class);
        f67691e = AbstractC9338qo0.b(new InterfaceC9124oo0() { // from class: com.google.android.gms.internal.ads.Em0
            @Override // com.google.android.gms.internal.ads.InterfaceC9124oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return Fm0.a((C9874vp0) ap0, uk0);
            }
        }, et0B, C9874vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f67688b);
        xo0.h(f67689c);
        xo0.g(f67690d);
        xo0.f(f67691e);
    }

    private static Es0 h(C10189ym0 c10189ym0) throws GeneralSecurityException {
        if (C10189ym0.f81111b.equals(c10189ym0)) {
            return Es0.TINK;
        }
        if (C10189ym0.f81112c.equals(c10189ym0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c10189ym0)));
    }

    public static /* synthetic */ C9868vm0 a(C9874vp0 c9874vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9874vp0.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                As0 as0E0 = As0.e0(c9874vp0.d(), C9350qu0.a());
                if (as0E0.b0() == 0) {
                    return C9868vm0.a(f(as0E0.f0(), c9874vp0.c()), c9874vp0.e());
                }
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(as0E0));
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ Am0 b(C9981wp0 c9981wp0) throws GeneralSecurityException {
        if (c9981wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return f(Ds0.f0(c9981wp0.c().h0(), C9350qu0.a()), c9981wp0.c().g0());
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c9981wp0.c().i0())));
    }

    public static /* synthetic */ C9874vp0 c(C9868vm0 c9868vm0, Uk0 uk0) {
        C10201ys0 c10201ys0C0 = As0.c0();
        c10201ys0C0.u(g(c9868vm0.b()));
        return C9874vp0.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((As0) c10201ys0C0.p()).a(), Xr0.REMOTE, h(c9868vm0.b().c()), c9868vm0.d());
    }

    public static /* synthetic */ C9981wp0 d(Am0 am0) {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        c7745bs0B0.w(g(am0).a());
        c7745bs0B0.u(h(am0.c()));
        return C9981wp0.b((C7957ds0) c7745bs0B0.p());
    }

    private static Am0 f(Ds0 ds0, Es0 es0) throws GeneralSecurityException {
        C10082xm0 c10082xm0;
        C10189ym0 c10189ym0;
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v(ds0.b0().i0());
        c7745bs0B0.w(ds0.b0().h0());
        c7745bs0B0.u(Es0.RAW);
        Qk0 qk0A = Wk0.a(((C7957ds0) c7745bs0B0.p()).j());
        if (qk0A instanceof Nl0) {
            c10082xm0 = C10082xm0.f80704b;
        } else if (qk0A instanceof C8052em0) {
            c10082xm0 = C10082xm0.f80706d;
        } else if (qk0A instanceof C7735bn0) {
            c10082xm0 = C10082xm0.f80705c;
        } else if (qk0A instanceof C9438rl0) {
            c10082xm0 = C10082xm0.f80707e;
        } else if (qk0A instanceof Bl0) {
            c10082xm0 = C10082xm0.f80708f;
        } else if (qk0A instanceof Yl0) {
            c10082xm0 = C10082xm0.f80709g;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(qk0A.toString()));
        }
        C9975wm0 c9975wm0 = new C9975wm0(null);
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                c10189ym0 = C10189ym0.f81112c;
            } else {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
            }
        } else {
            c10189ym0 = C10189ym0.f81111b;
        }
        c9975wm0.d(c10189ym0);
        c9975wm0.c(ds0.g0());
        c9975wm0.a((AbstractC7624al0) qk0A);
        c9975wm0.b(c10082xm0);
        return c9975wm0.e();
    }

    private static Ds0 g(Am0 am0) throws GeneralSecurityException {
        try {
            C7957ds0 c7957ds0F0 = C7957ds0.f0(Wk0.b(am0.b()), C9350qu0.a());
            Bs0 bs0C0 = Ds0.c0();
            bs0C0.v(am0.d());
            bs0C0.u(c7957ds0F0);
            return (Ds0) bs0C0.p();
        } catch (zzgyg e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }
}
