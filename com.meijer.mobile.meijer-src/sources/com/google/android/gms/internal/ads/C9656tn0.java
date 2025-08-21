package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9656tn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f79461a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8272gp0 f79462b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7845cp0 f79463c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9765uo0 f79464d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9338qo0 f79465e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f79466f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f79461a = et0B;
        f79462b = AbstractC8272gp0.b(new InterfaceC8058ep0() { // from class: com.google.android.gms.internal.ads.pn0
            @Override // com.google.android.gms.internal.ads.InterfaceC8058ep0
            public final Ap0 a(Qk0 qk0) {
                return C9656tn0.d((Nl0) qk0);
            }
        }, Nl0.class, C9981wp0.class);
        f79463c = AbstractC7845cp0.b(new InterfaceC7632ap0() { // from class: com.google.android.gms.internal.ads.qn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7632ap0
            public final Qk0 a(Ap0 ap0) {
                return C9656tn0.b((C9981wp0) ap0);
            }
        }, et0B, C9981wp0.class);
        f79464d = AbstractC9765uo0.b(new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.rn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C9656tn0.c((El0) ck0, uk0);
            }
        }, El0.class, C9874vp0.class);
        f79465e = AbstractC9338qo0.b(new InterfaceC9124oo0() { // from class: com.google.android.gms.internal.ads.sn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9124oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C9656tn0.a((C9874vp0) ap0, uk0);
            }
        }, et0B, C9874vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f79462b);
        xo0.h(f79463c);
        xo0.g(f79464d);
        xo0.f(f79465e);
    }

    private static Es0 g(Ll0 ll0) throws GeneralSecurityException {
        if (Ll0.f69260b.equals(ll0)) {
            return Es0.TINK;
        }
        if (Ll0.f69261c.equals(ll0)) {
            return Es0.CRUNCHY;
        }
        if (Ll0.f69262d.equals(ll0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ll0)));
    }

    public static /* synthetic */ El0 a(C9874vp0 c9874vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9874vp0.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C9878vr0 c9878vr0E0 = C9878vr0.e0(c9874vp0.d(), C9350qu0.a());
                if (c9878vr0E0.b0() == 0) {
                    Kl0 kl0C = Nl0.c();
                    kl0C.b(c9878vr0E0.f0().k());
                    kl0C.a(12);
                    kl0C.c(16);
                    kl0C.d(f(c9874vp0.c()));
                    Nl0 nl0E = kl0C.e();
                    Cl0 cl0A = El0.a();
                    cl0A.c(nl0E);
                    cl0A.b(Ft0.b(c9878vr0E0.f0().a(), uk0));
                    cl0A.a(c9874vp0.e());
                    return cl0A.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
    }

    public static /* synthetic */ Nl0 b(C9981wp0 c9981wp0) throws GeneralSecurityException {
        if (c9981wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C10199yr0 c10199yr0F0 = C10199yr0.f0(c9981wp0.c().h0(), C9350qu0.a());
                if (c10199yr0F0.c0() == 0) {
                    Kl0 kl0C = Nl0.c();
                    kl0C.b(c10199yr0F0.b0());
                    kl0C.a(12);
                    kl0C.c(16);
                    kl0C.d(f(c9981wp0.c().g0()));
                    return kl0C.e();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c9981wp0.c().i0())));
    }

    public static /* synthetic */ C9874vp0 c(El0 el0, Uk0 uk0) {
        C9664tr0 c9664tr0C0 = C9878vr0.c0();
        byte[] bArrD = el0.d().d(uk0);
        c9664tr0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9874vp0.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C9878vr0) c9664tr0C0.p()).a(), Xr0.SYMMETRIC, g(el0.b().d()), el0.e());
    }

    public static /* synthetic */ C9981wp0 d(Nl0 nl0) {
        C7745bs0 c7745bs0B0 = C7957ds0.b0();
        c7745bs0B0.v("type.googleapis.com/google.crypto.tink.AesGcmKey");
        C9985wr0 c9985wr0D0 = C10199yr0.d0();
        c9985wr0D0.u(nl0.b());
        c7745bs0B0.w(((C10199yr0) c9985wr0D0.p()).a());
        c7745bs0B0.u(g(nl0.d()));
        return C9981wp0.b((C7957ds0) c7745bs0B0.p());
    }

    private static Ll0 f(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                    }
                } else {
                    return Ll0.f69262d;
                }
            }
            return Ll0.f69261c;
        }
        return Ll0.f69260b;
    }
}
