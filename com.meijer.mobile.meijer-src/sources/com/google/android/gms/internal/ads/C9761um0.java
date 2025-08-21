package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.um0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9761um0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f79749a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8272gp0 f79750b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7845cp0 f79751c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9765uo0 f79752d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9338qo0 f79753e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f79754f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f79749a = et0B;
        f79750b = AbstractC8272gp0.b(new InterfaceC8058ep0() { // from class: com.google.android.gms.internal.ads.qm0
            @Override // com.google.android.gms.internal.ads.InterfaceC8058ep0
            public final Ap0 a(Qk0 qk0) {
                return C9761um0.d((C9227pm0) qk0);
            }
        }, C9227pm0.class, C9981wp0.class);
        f79751c = AbstractC7845cp0.b(new InterfaceC7632ap0() { // from class: com.google.android.gms.internal.ads.rm0
            @Override // com.google.android.gms.internal.ads.InterfaceC7632ap0
            public final Qk0 a(Ap0 ap0) {
                return C9761um0.b((C9981wp0) ap0);
            }
        }, et0B, C9981wp0.class);
        f79752d = AbstractC9765uo0.b(new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.sm0
            @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C9761um0.c((C9013nm0) ck0, uk0);
            }
        }, C9013nm0.class, C9874vp0.class);
        f79753e = AbstractC9338qo0.b(new InterfaceC9124oo0() { // from class: com.google.android.gms.internal.ads.tm0
            @Override // com.google.android.gms.internal.ads.InterfaceC9124oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C9761um0.a((C9874vp0) ap0, uk0);
            }
        }, et0B, C9874vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f79750b);
        xo0.h(f79751c);
        xo0.g(f79752d);
        xo0.f(f79753e);
    }

    private static Es0 g(C9120om0 c9120om0) throws GeneralSecurityException {
        if (C9120om0.f78265b.equals(c9120om0)) {
            return Es0.TINK;
        }
        if (C9120om0.f78266c.equals(c9120om0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c9120om0.toString()));
    }

    public static /* synthetic */ C9013nm0 a(C9874vp0 c9874vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9874vp0.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                C9773us0 c9773us0E0 = C9773us0.e0(c9874vp0.d(), C9350qu0.a());
                if (c9773us0E0.b0() == 0) {
                    return C9013nm0.a(C9227pm0.c(c9773us0E0.f0().f0(), f(c9874vp0.c())), c9874vp0.e());
                }
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(c9773us0E0));
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ C9227pm0 b(C9981wp0 c9981wp0) throws GeneralSecurityException {
        if (c9981wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return C9227pm0.c(C10094xs0.e0(c9981wp0.c().h0(), C9350qu0.a()).f0(), f(c9981wp0.c().g0()));
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c9981wp0.c().i0())));
    }

    public static /* synthetic */ C9874vp0 c(C9013nm0 c9013nm0, Uk0 uk0) {
        C9559ss0 c9559ss0C0 = C9773us0.c0();
        C9880vs0 c9880vs0B0 = C10094xs0.b0();
        c9880vs0B0.u(c9013nm0.b().d());
        c9559ss0C0.u((C10094xs0) c9880vs0B0.p());
        return C9874vp0.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C9773us0) c9559ss0C0.p()).a(), Xr0.REMOTE, g(c9013nm0.b().b()), c9013nm0.d());
    }

    public static /* synthetic */ C9981wp0 d(C9227pm0 c9227pm0) {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        C9880vs0 c9880vs0B0 = C10094xs0.b0();
        c9880vs0B0.u(c9227pm0.d());
        c7745bs0B0.w(((C10094xs0) c9880vs0B0.p()).a());
        c7745bs0B0.u(g(c9227pm0.b()));
        return C9981wp0.b((C7957ds0) c7745bs0B0.p());
    }

    private static C9120om0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                return C9120om0.f78266c;
            }
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
        }
        return C9120om0.f78265b;
    }
}
