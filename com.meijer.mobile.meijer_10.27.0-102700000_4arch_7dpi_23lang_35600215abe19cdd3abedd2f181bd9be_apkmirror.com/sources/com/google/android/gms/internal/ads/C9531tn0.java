package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9531tn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f78621a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8147gp0 f78622b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7720cp0 f78623c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9640uo0 f78624d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9213qo0 f78625e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f78626f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f78621a = et0B;
        f78622b = AbstractC8147gp0.b(new InterfaceC7933ep0() { // from class: com.google.android.gms.internal.ads.pn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7933ep0
            public final Ap0 a(Qk0 qk0) {
                return C9531tn0.d((Nl0) qk0);
            }
        }, Nl0.class, C9856wp0.class);
        f78623c = AbstractC7720cp0.b(new InterfaceC7507ap0() { // from class: com.google.android.gms.internal.ads.qn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7507ap0
            public final Qk0 a(Ap0 ap0) {
                return C9531tn0.b((C9856wp0) ap0);
            }
        }, et0B, C9856wp0.class);
        f78624d = AbstractC9640uo0.b(new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.rn0
            @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C9531tn0.c((El0) ck0, uk0);
            }
        }, El0.class, C9749vp0.class);
        f78625e = AbstractC9213qo0.b(new InterfaceC8999oo0() { // from class: com.google.android.gms.internal.ads.sn0
            @Override // com.google.android.gms.internal.ads.InterfaceC8999oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C9531tn0.a((C9749vp0) ap0, uk0);
            }
        }, et0B, C9749vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f78622b);
        xo0.h(f78623c);
        xo0.g(f78624d);
        xo0.f(f78625e);
    }

    private static Es0 g(Ll0 ll0) throws GeneralSecurityException {
        if (Ll0.f68420b.equals(ll0)) {
            return Es0.TINK;
        }
        if (Ll0.f68421c.equals(ll0)) {
            return Es0.CRUNCHY;
        }
        if (Ll0.f68422d.equals(ll0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ll0)));
    }

    public static /* synthetic */ El0 a(C9749vp0 c9749vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9749vp0.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C9753vr0 c9753vr0E0 = C9753vr0.e0(c9749vp0.d(), C9225qu0.a());
                if (c9753vr0E0.b0() == 0) {
                    Kl0 kl0C = Nl0.c();
                    kl0C.b(c9753vr0E0.f0().k());
                    kl0C.a(12);
                    kl0C.c(16);
                    kl0C.d(f(c9749vp0.c()));
                    Nl0 nl0E = kl0C.e();
                    Cl0 cl0A = El0.a();
                    cl0A.c(nl0E);
                    cl0A.b(Ft0.b(c9753vr0E0.f0().a(), uk0));
                    cl0A.a(c9749vp0.e());
                    return cl0A.d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
    }

    public static /* synthetic */ Nl0 b(C9856wp0 c9856wp0) throws GeneralSecurityException {
        if (c9856wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C10074yr0 c10074yr0F0 = C10074yr0.f0(c9856wp0.c().h0(), C9225qu0.a());
                if (c10074yr0F0.c0() == 0) {
                    Kl0 kl0C = Nl0.c();
                    kl0C.b(c10074yr0F0.b0());
                    kl0C.a(12);
                    kl0C.c(16);
                    kl0C.d(f(c9856wp0.c().g0()));
                    return kl0C.e();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c9856wp0.c().i0())));
    }

    public static /* synthetic */ C9749vp0 c(El0 el0, Uk0 uk0) {
        C9539tr0 c9539tr0C0 = C9753vr0.c0();
        byte[] bArrD = el0.d().d(uk0);
        c9539tr0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        return C9749vp0.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C9753vr0) c9539tr0C0.p()).a(), Xr0.SYMMETRIC, g(el0.b().d()), el0.e());
    }

    public static /* synthetic */ C9856wp0 d(Nl0 nl0) {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v("type.googleapis.com/google.crypto.tink.AesGcmKey");
        C9860wr0 c9860wr0D0 = C10074yr0.d0();
        c9860wr0D0.u(nl0.b());
        c7620bs0B0.w(((C10074yr0) c9860wr0D0.p()).a());
        c7620bs0B0.u(g(nl0.d()));
        return C9856wp0.b((C7832ds0) c7620bs0B0.p());
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
                    return Ll0.f68422d;
                }
            }
            return Ll0.f68421c;
        }
        return Ll0.f68420b;
    }
}
