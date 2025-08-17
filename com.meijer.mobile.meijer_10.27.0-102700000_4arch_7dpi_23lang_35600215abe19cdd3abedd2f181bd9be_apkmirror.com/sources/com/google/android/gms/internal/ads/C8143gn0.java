package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.gn0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8143gn0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Et0 f74395a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8147gp0 f74396b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC7720cp0 f74397c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC9640uo0 f74398d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC9213qo0 f74399e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f74400f = 0;

    static {
        Et0 et0B = Hp0.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f74395a = et0B;
        f74396b = AbstractC8147gp0.b(new InterfaceC7933ep0() { // from class: com.google.android.gms.internal.ads.cn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7933ep0
            public final Ap0 a(Qk0 qk0) {
                return C8143gn0.d((C9313rl0) qk0);
            }
        }, C9313rl0.class, C9856wp0.class);
        f74397c = AbstractC7720cp0.b(new InterfaceC7507ap0() { // from class: com.google.android.gms.internal.ads.dn0
            @Override // com.google.android.gms.internal.ads.InterfaceC7507ap0
            public final Qk0 a(Ap0 ap0) {
                return C8143gn0.b((C9856wp0) ap0);
            }
        }, et0B, C9856wp0.class);
        f74398d = AbstractC9640uo0.b(new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.en0
            @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
            public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                return C8143gn0.c((C8352il0) ck0, uk0);
            }
        }, C8352il0.class, C9749vp0.class);
        f74399e = AbstractC9213qo0.b(new InterfaceC8999oo0() { // from class: com.google.android.gms.internal.ads.fn0
            @Override // com.google.android.gms.internal.ads.InterfaceC8999oo0
            public final Ck0 a(Ap0 ap0, Uk0 uk0) {
                return C8143gn0.a((C9749vp0) ap0, uk0);
            }
        }, et0B, C9749vp0.class);
    }

    public static void e(Xo0 xo0) throws GeneralSecurityException {
        xo0.i(f74396b);
        xo0.h(f74397c);
        xo0.g(f74398d);
        xo0.f(f74399e);
    }

    private static Es0 i(C9100pl0 c9100pl0) throws GeneralSecurityException {
        if (C9100pl0.f77636b.equals(c9100pl0)) {
            return Es0.TINK;
        }
        if (C9100pl0.f77637c.equals(c9100pl0)) {
            return Es0.CRUNCHY;
        }
        if (C9100pl0.f77638d.equals(c9100pl0)) {
            return Es0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c9100pl0)));
    }

    public static /* synthetic */ C8352il0 a(C9749vp0 c9749vp0, Uk0 uk0) throws GeneralSecurityException {
        if (c9749vp0.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                Xq0 xq0E0 = Xq0.e0(c9749vp0.d(), C9225qu0.a());
                if (xq0E0.b0() == 0) {
                    if (xq0E0.f0().b0() == 0) {
                        if (xq0E0.g0().b0() == 0) {
                            C8886nl0 c8886nl0F = C9313rl0.f();
                            c8886nl0F.a(xq0E0.f0().g0().k());
                            c8886nl0F.c(xq0E0.g0().h0().k());
                            c8886nl0F.d(xq0E0.f0().f0().b0());
                            c8886nl0F.e(xq0E0.g0().g0().b0());
                            c8886nl0F.b(f(xq0E0.g0().g0().c0()));
                            c8886nl0F.f(g(c9749vp0.c()));
                            C9313rl0 c9313rl0G = c8886nl0F.g();
                            C8032fl0 c8032fl0A = C8352il0.a();
                            c8032fl0A.d(c9313rl0G);
                            c8032fl0A.a(Ft0.b(xq0E0.f0().g0().a(), uk0));
                            c8032fl0A.b(Ft0.b(xq0E0.g0().h0().a(), uk0));
                            c8032fl0A.c(c9749vp0.e());
                            return c8032fl0A.e();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ C9313rl0 b(C9856wp0 c9856wp0) throws GeneralSecurityException {
        if (c9856wp0.c().i0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C7511ar0 c7511ar0D0 = C7511ar0.d0(c9856wp0.c().h0(), C9225qu0.a());
                if (c7511ar0D0.f0().c0() == 0) {
                    C8886nl0 c8886nl0F = C9313rl0.f();
                    c8886nl0F.a(c7511ar0D0.e0().b0());
                    c8886nl0F.c(c7511ar0D0.f0().b0());
                    c8886nl0F.d(c7511ar0D0.e0().f0().b0());
                    c8886nl0F.e(c7511ar0D0.f0().h0().b0());
                    c8886nl0F.b(f(c7511ar0D0.f0().h0().c0()));
                    c8886nl0F.f(g(c9856wp0.c().g0()));
                    return c8886nl0F.g();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg e10) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c9856wp0.c().i0())));
    }

    public static /* synthetic */ C9749vp0 c(C8352il0 c8352il0, Uk0 uk0) {
        Vq0 vq0C0 = Xq0.c0();
        C7618br0 c7618br0C0 = C7830dr0.c0();
        C8258hr0 c8258hr0C0 = C8470jr0.c0();
        c8258hr0C0.u(c8352il0.b().d());
        c7618br0C0.v((C8470jr0) c8258hr0C0.p());
        byte[] bArrD = c8352il0.d().d(uk0);
        c7618br0C0.u(Zt0.z(bArrD, 0, bArrD.length));
        vq0C0.u((C7830dr0) c7618br0C0.p());
        Mr0 mr0C0 = Pr0.c0();
        mr0C0.v(h(c8352il0.b()));
        byte[] bArrD2 = c8352il0.e().d(uk0);
        mr0C0.u(Zt0.z(bArrD2, 0, bArrD2.length));
        vq0C0.v((Pr0) mr0C0.p());
        return C9749vp0.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((Xq0) vq0C0.p()).a(), Xr0.SYMMETRIC, i(c8352il0.b().h()), c8352il0.f());
    }

    public static /* synthetic */ C9856wp0 d(C9313rl0 c9313rl0) {
        C7620bs0 c7620bs0B0 = C7832ds0.b0();
        c7620bs0B0.v("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        Yq0 yq0B0 = C7511ar0.b0();
        C7937er0 c7937er0C0 = C8151gr0.c0();
        C8258hr0 c8258hr0C0 = C8470jr0.c0();
        c8258hr0C0.u(c9313rl0.d());
        c7937er0C0.v((C8470jr0) c8258hr0C0.p());
        c7937er0C0.u(c9313rl0.b());
        yq0B0.u((C8151gr0) c7937er0C0.p());
        Qr0 qr0D0 = Sr0.d0();
        qr0D0.v(h(c9313rl0));
        qr0D0.u(c9313rl0.c());
        yq0B0.v((Sr0) qr0D0.p());
        c7620bs0B0.w(((C7511ar0) yq0B0.p()).a());
        c7620bs0B0.u(i(c9313rl0.h()));
        return C9856wp0.b((C7832ds0) c7620bs0B0.p());
    }

    private static C8993ol0 f(Lr0 lr0) throws GeneralSecurityException {
        int iOrdinal = lr0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return C8993ol0.f77420c;
                        }
                        throw new GeneralSecurityException("Unable to parse HashType: " + lr0.zza());
                    }
                    return C8993ol0.f77423f;
                }
                return C8993ol0.f77421d;
            }
            return C8993ol0.f77422e;
        }
        return C8993ol0.f77419b;
    }

    private static C9100pl0 g(Es0 es0) throws GeneralSecurityException {
        int iOrdinal = es0.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + es0.zza());
                    }
                } else {
                    return C9100pl0.f77638d;
                }
            }
            return C9100pl0.f77637c;
        }
        return C9100pl0.f77636b;
    }

    private static Vr0 h(C9313rl0 c9313rl0) throws GeneralSecurityException {
        Lr0 lr0;
        Tr0 tr0D0 = Vr0.d0();
        tr0D0.v(c9313rl0.e());
        C8993ol0 c8993ol0G = c9313rl0.g();
        if (C8993ol0.f77419b.equals(c8993ol0G)) {
            lr0 = Lr0.SHA1;
        } else if (C8993ol0.f77420c.equals(c8993ol0G)) {
            lr0 = Lr0.SHA224;
        } else if (C8993ol0.f77421d.equals(c8993ol0G)) {
            lr0 = Lr0.SHA256;
        } else if (C8993ol0.f77422e.equals(c8993ol0G)) {
            lr0 = Lr0.SHA384;
        } else if (C8993ol0.f77423f.equals(c8993ol0G)) {
            lr0 = Lr0.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(c8993ol0G)));
        }
        tr0D0.u(lr0);
        return (Vr0) tr0D0.p();
    }
}
