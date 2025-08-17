package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.mn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8783mn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f76885a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8147gp0 f76886b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7720cp0 f76887c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9640uo0 f76888d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9213qo0 f76889e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f76890f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f76885a = et0B;
        f76886b = AbstractC8147gp0.b(new InterfaceC7933ep0() { // from class: com.google.android.gms.internal.ads.hn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7933ep0
            public final Ap0 a(Qk0 qk0) {
                return C8783mn0.d((Bl0) qk0);
            }
        }, Bl0.class, C9856wp0.class);
        f76887c = AbstractC7720cp0.b(new InterfaceC7507ap0() { // from class: com.google.android.gms.internal.ads.in0
            @Override // com.google.android.gms.internal.ads.InterfaceC7507ap0
            public final Qk0 a(Ap0 ap0) {
                return C8783mn0.b((C9856wp0) ap0);
            }
        }, et0B, C9856wp0.class);
        f76888d = AbstractC9640uo0.b(new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.jn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C8783mn0.c((C9634ul0) ck0, uk0);
            }
        }, C9634ul0.class, C9749vp0.class);
        f76889e = AbstractC9213qo0.b(new InterfaceC8999oo0() { // from class: com.google.android.gms.internal.ads.ln0
            @Override // com.google.android.gms.internal.ads.InterfaceC8999oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C8783mn0.a((C9749vp0) ap0, uk0);
            }
        }, et0B, C9749vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f76886b);
        xo0.h(f76887c);
        xo0.g(f76888d);
        xo0.f(f76889e);
    }

    private static Es0 h(C10169zl0 c10169zl0) throws GeneralSecurityException {
        if (C10169zl0.f80467b.equals(c10169zl0)) {
            return Es0.TINK;
        }
        if (C10169zl0.f80468c.equals(c10169zl0)) {
            return Es0.CRUNCHY;
        }
        if (C10169zl0.f80469d.equals(c10169zl0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c10169zl0)));
    }

    public static /* synthetic */ C9634ul0 a(C9749vp0 c9749vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9749vp0.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C8791mr0 c8791mr0E0 = C8791mr0.e0(c9749vp0.d(), C9225qu0.a());
                if (c8791mr0E0.b0() == 0) {
                    C10062yl0 c10062yl0D = Bl0.d();
                    c10062yl0D.b(c8791mr0E0.g0().k());
                    c10062yl0D.a(c8791mr0E0.f0().b0());
                    c10062yl0D.c(16);
                    c10062yl0D.d(f(c9749vp0.c()));
                    Bl0 bl0E = c10062yl0D.e();
                    C9420sl0 c9420sl0A = C9634ul0.a();
                    c9420sl0A.c(bl0E);
                    c9420sl0A.b(Ft0.b(c8791mr0E0.g0().a(), uk0));
                    c9420sl0A.a(c9749vp0.e());
                    return c9420sl0A.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    public static /* synthetic */ Bl0 b(C9856wp0 c9856wp0) throws GeneralSecurityException {
        if (c9856wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C9112pr0 c9112pr0E0 = C9112pr0.e0(c9856wp0.c().h0(), C9225qu0.a());
                C10062yl0 c10062yl0D = Bl0.d();
                c10062yl0D.b(c9112pr0E0.b0());
                c10062yl0D.a(c9112pr0E0.f0().b0());
                c10062yl0D.c(16);
                c10062yl0D.d(f(c9856wp0.c().g0()));
                return c10062yl0D.e();
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(c9856wp0.c().i0())));
    }

    public static /* synthetic */ C9749vp0 c(C9634ul0 c9634ul0, Uk0 uk0) {
        C8577kr0 c8577kr0C0 = C8791mr0.c0();
        c8577kr0C0.v(g(c9634ul0.b()));
        byte[] bArrD = c9634ul0.d().d(uk0);
        c8577kr0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9749vp0.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C8791mr0) c8577kr0C0.p()).a(), Xr0.SYMMETRIC, h(c9634ul0.b().e()), c9634ul0.e());
    }

    public static /* synthetic */ C9856wp0 d(Bl0 bl0) {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v("type.googleapis.com/google.crypto.tink.AesEaxKey");
        C8898nr0 c8898nr0C0 = C9112pr0.c0();
        c8898nr0C0.v(g(bl0));
        c8898nr0C0.u(bl0.c());
        c7620bs0B0.w(((C9112pr0) c8898nr0C0.p()).a());
        c7620bs0B0.u(h(bl0.e()));
        return C9856wp0.b((C7832ds0) c7620bs0B0.p());
    }

    private static C10169zl0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                    }
                } else {
                    return C10169zl0.f80469d;
                }
            }
            return C10169zl0.f80468c;
        }
        return C10169zl0.f80467b;
    }

    private static C9432sr0 g(Bl0 bl0) throws GeneralSecurityException {
        C9219qr0 c9219qr0C0 = C9432sr0.c0();
        c9219qr0C0.u(bl0.b());
        return (C9432sr0) c9219qr0C0.p();
    }
}
