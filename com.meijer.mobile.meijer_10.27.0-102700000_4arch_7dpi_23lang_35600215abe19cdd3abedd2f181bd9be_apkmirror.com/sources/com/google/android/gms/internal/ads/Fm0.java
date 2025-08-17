package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Fm0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f66847a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8147gp0 f66848b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7720cp0 f66849c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9640uo0 f66850d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9213qo0 f66851e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f66852f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f66847a = et0B;
        f66848b = AbstractC8147gp0.b(new InterfaceC7933ep0() { // from class: com.google.android.gms.internal.ads.Bm0
            @Override // com.google.android.gms.internal.ads.InterfaceC7933ep0
            public final Ap0 a(Qk0 qk0) {
                return Fm0.d((Am0) qk0);
            }
        }, Am0.class, C9856wp0.class);
        f66849c = AbstractC7720cp0.b(new InterfaceC7507ap0() { // from class: com.google.android.gms.internal.ads.Cm0
            @Override // com.google.android.gms.internal.ads.InterfaceC7507ap0
            public final Qk0 a(Ap0 ap0) {
                return Fm0.b((C9856wp0) ap0);
            }
        }, et0B, C9856wp0.class);
        f66850d = AbstractC9640uo0.b(new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.Dm0
            @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return Fm0.c((C9743vm0) ck0, uk0);
            }
        }, C9743vm0.class, C9749vp0.class);
        f66851e = AbstractC9213qo0.b(new InterfaceC8999oo0() { // from class: com.google.android.gms.internal.ads.Em0
            @Override // com.google.android.gms.internal.ads.InterfaceC8999oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return Fm0.a((C9749vp0) ap0, uk0);
            }
        }, et0B, C9749vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f66848b);
        xo0.h(f66849c);
        xo0.g(f66850d);
        xo0.f(f66851e);
    }

    private static Es0 h(C10064ym0 c10064ym0) throws GeneralSecurityException {
        if (C10064ym0.f80271b.equals(c10064ym0)) {
            return Es0.TINK;
        }
        if (C10064ym0.f80272c.equals(c10064ym0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c10064ym0)));
    }

    public static /* synthetic */ C9743vm0 a(C9749vp0 c9749vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9749vp0.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                As0 as0E0 = As0.e0(c9749vp0.d(), C9225qu0.a());
                if (as0E0.b0() == 0) {
                    return C9743vm0.a(f(as0E0.f0(), c9749vp0.c()), c9749vp0.e());
                }
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(as0E0));
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ Am0 b(C9856wp0 c9856wp0) throws GeneralSecurityException {
        if (c9856wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return f(Ds0.f0(c9856wp0.c().h0(), C9225qu0.a()), c9856wp0.c().g0());
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c9856wp0.c().i0())));
    }

    public static /* synthetic */ C9749vp0 c(C9743vm0 c9743vm0, Uk0 uk0) {
        C10076ys0 c10076ys0C0 = As0.c0();
        c10076ys0C0.u(g(c9743vm0.b()));
        return C9749vp0.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((As0) c10076ys0C0.p()).a(), Xr0.REMOTE, h(c9743vm0.b().c()), c9743vm0.d());
    }

    public static /* synthetic */ C9856wp0 d(Am0 am0) {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        c7620bs0B0.w(g(am0).a());
        c7620bs0B0.u(h(am0.c()));
        return C9856wp0.b((C7832ds0) c7620bs0B0.p());
    }

    private static Am0 f(Ds0 ds0, Es0 es0) throws GeneralSecurityException {
        C9957xm0 c9957xm0;
        C10064ym0 c10064ym0;
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v(ds0.b0().i0());
        c7620bs0B0.w(ds0.b0().h0());
        c7620bs0B0.u(Es0.RAW);
        Qk0 qk0A = Wk0.a(((C7832ds0) c7620bs0B0.p()).j());
        if (qk0A instanceof Nl0) {
            c9957xm0 = C9957xm0.f79864b;
        } else if (qk0A instanceof C7927em0) {
            c9957xm0 = C9957xm0.f79866d;
        } else if (qk0A instanceof C7610bn0) {
            c9957xm0 = C9957xm0.f79865c;
        } else if (qk0A instanceof C9313rl0) {
            c9957xm0 = C9957xm0.f79867e;
        } else if (qk0A instanceof Bl0) {
            c9957xm0 = C9957xm0.f79868f;
        } else if (qk0A instanceof Yl0) {
            c9957xm0 = C9957xm0.f79869g;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(qk0A.toString()));
        }
        C9850wm0 c9850wm0 = new C9850wm0(null);
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                c10064ym0 = C10064ym0.f80272c;
            } else {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
            }
        } else {
            c10064ym0 = C10064ym0.f80271b;
        }
        c9850wm0.d(c10064ym0);
        c9850wm0.c(ds0.g0());
        c9850wm0.a((AbstractC7499al0) qk0A);
        c9850wm0.b(c9957xm0);
        return c9850wm0.e();
    }

    private static Ds0 g(Am0 am0) throws GeneralSecurityException {
        try {
            C7832ds0 c7832ds0F0 = C7832ds0.f0(Wk0.b(am0.b()), C9225qu0.a());
            Bs0 bs0C0 = Ds0.c0();
            bs0C0.v(am0.d());
            bs0C0.u(c7832ds0F0);
            return (Ds0) bs0C0.p();
        } catch (zzgyg e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }
}
