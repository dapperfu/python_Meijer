package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.um0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9636um0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f78909a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8147gp0 f78910b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7720cp0 f78911c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9640uo0 f78912d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9213qo0 f78913e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f78914f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f78909a = et0B;
        f78910b = AbstractC8147gp0.b(new InterfaceC7933ep0() { // from class: com.google.android.gms.internal.ads.qm0
            @Override // com.google.android.gms.internal.ads.InterfaceC7933ep0
            public final Ap0 a(Qk0 qk0) {
                return C9636um0.d((C9102pm0) qk0);
            }
        }, C9102pm0.class, C9856wp0.class);
        f78911c = AbstractC7720cp0.b(new InterfaceC7507ap0() { // from class: com.google.android.gms.internal.ads.rm0
            @Override // com.google.android.gms.internal.ads.InterfaceC7507ap0
            public final Qk0 a(Ap0 ap0) {
                return C9636um0.b((C9856wp0) ap0);
            }
        }, et0B, C9856wp0.class);
        f78912d = AbstractC9640uo0.b(new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.sm0
            @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C9636um0.c((C8888nm0) ck0, uk0);
            }
        }, C8888nm0.class, C9749vp0.class);
        f78913e = AbstractC9213qo0.b(new InterfaceC8999oo0() { // from class: com.google.android.gms.internal.ads.tm0
            @Override // com.google.android.gms.internal.ads.InterfaceC8999oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C9636um0.a((C9749vp0) ap0, uk0);
            }
        }, et0B, C9749vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f78910b);
        xo0.h(f78911c);
        xo0.g(f78912d);
        xo0.f(f78913e);
    }

    private static Es0 g(C8995om0 c8995om0) throws GeneralSecurityException {
        if (C8995om0.f77425b.equals(c8995om0)) {
            return Es0.TINK;
        }
        if (C8995om0.f77426c.equals(c8995om0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c8995om0.toString()));
    }

    public static /* synthetic */ C8888nm0 a(C9749vp0 c9749vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9749vp0.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                C9648us0 c9648us0E0 = C9648us0.e0(c9749vp0.d(), C9225qu0.a());
                if (c9648us0E0.b0() == 0) {
                    return C8888nm0.a(C9102pm0.c(c9648us0E0.f0().f0(), f(c9749vp0.c())), c9749vp0.e());
                }
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(c9648us0E0));
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ C9102pm0 b(C9856wp0 c9856wp0) throws GeneralSecurityException {
        if (c9856wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return C9102pm0.c(C9969xs0.e0(c9856wp0.c().h0(), C9225qu0.a()).f0(), f(c9856wp0.c().g0()));
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c9856wp0.c().i0())));
    }

    public static /* synthetic */ C9749vp0 c(C8888nm0 c8888nm0, Uk0 uk0) {
        C9434ss0 c9434ss0C0 = C9648us0.c0();
        C9755vs0 c9755vs0B0 = C9969xs0.b0();
        c9755vs0B0.u(c8888nm0.b().d());
        c9434ss0C0.u((C9969xs0) c9755vs0B0.p());
        return C9749vp0.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C9648us0) c9434ss0C0.p()).a(), Xr0.REMOTE, g(c8888nm0.b().b()), c8888nm0.d());
    }

    public static /* synthetic */ C9856wp0 d(C9102pm0 c9102pm0) {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        C9755vs0 c9755vs0B0 = C9969xs0.b0();
        c9755vs0B0.u(c9102pm0.d());
        c7620bs0B0.w(((C9969xs0) c9755vs0B0.p()).a());
        c7620bs0B0.u(g(c9102pm0.b()));
        return C9856wp0.b((C7832ds0) c7620bs0B0.p());
    }

    private static C8995om0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                return C8995om0.f77426c;
            }
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
        }
        return C8995om0.f77425b;
    }
}
