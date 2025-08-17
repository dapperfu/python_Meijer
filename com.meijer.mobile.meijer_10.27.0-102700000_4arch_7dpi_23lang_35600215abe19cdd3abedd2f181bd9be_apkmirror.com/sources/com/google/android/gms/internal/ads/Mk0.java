package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class Mk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8686ls0 f68705a;

    /* renamed from: b, reason: collision with root package name */
    private final List f68706b;

    /* renamed from: c, reason: collision with root package name */
    private final Bo0 f68707c;

    /* synthetic */ Mk0(C8686ls0 c8686ls0, List list, Bo0 bo0, Lk0 lk0) {
        this.f68705a = c8686ls0;
        this.f68706b = list;
        this.f68707c = bo0;
    }

    final C8686ls0 c() {
        return this.f68705a;
    }

    private Mk0(C8686ls0 c8686ls0, List list) {
        this.f68705a = c8686ls0;
        this.f68706b = list;
        this.f68707c = Bo0.f65582b;
    }

    public static final Mk0 b(Qk0 qk0) throws GeneralSecurityException {
        Jk0 jk0 = new Jk0();
        Hk0 hk0 = new Hk0(qk0, null);
        hk0.d();
        hk0.c();
        jk0.a(hk0);
        return jk0.b();
    }

    private final Object f(AbstractC8571ko0 abstractC8571ko0, Class cls, Class cls2) throws GeneralSecurityException {
        int i10 = Xk0.f71387a;
        C8686ls0 c8686ls0 = this.f68705a;
        int iC0 = c8686ls0.c0();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (C8472js0 c8472js0 : c8686ls0.h0()) {
            if (c8472js0.k0() == 3) {
                if (!c8472js0.j0()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c8472js0.b0())));
                }
                if (c8472js0.f0() == Es0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c8472js0.b0())));
                }
                if (c8472js0.k0() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c8472js0.b0())));
                }
                if (c8472js0.b0() == iC0) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z11 &= c8472js0.c0().c0() == Xr0.ASYMMETRIC_PUBLIC;
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        C9215qp0 c9215qp0B = C9535tp0.b(cls2);
        c9215qp0B.c(this.f68707c);
        for (int i12 = 0; i12 < this.f68706b.size(); i12++) {
            C8472js0 c8472js0E0 = this.f68705a.e0(i12);
            if (c8472js0E0.k0() == 3) {
                Kk0 kk0 = (Kk0) this.f68706b.get(i12);
                if (kk0 == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i12 + " and type_url " + c8472js0E0.c0().g0() + " failed, unable to get primitive");
                }
                Ck0 ck0A = kk0.a();
                try {
                    Object objB = abstractC8571ko0.b(ck0A, cls2);
                    if (c8472js0E0.b0() == this.f68705a.c0()) {
                        c9215qp0B.b(objB, ck0A, c8472js0E0);
                    } else {
                        c9215qp0B.a(objB, ck0A, c8472js0E0);
                    }
                } catch (GeneralSecurityException e10) {
                    throw new GeneralSecurityException("Unable to get primitive " + cls2.toString() + " for key of type " + c8472js0E0.c0().g0() + ", see https://developers.google.com/tink/faq/registration_errors", e10);
                }
            }
        }
        return abstractC8571ko0.c(c9215qp0B.d(), cls);
    }

    private static List g(C8686ls0 c8686ls0) throws GeneralSecurityException {
        Ek0 ek0;
        ArrayList arrayList = new ArrayList(c8686ls0.b0());
        for (C8472js0 c8472js0 : c8686ls0.h0()) {
            int iB0 = c8472js0.b0();
            try {
                C9749vp0 c9749vp0A = C9749vp0.a(c8472js0.c0().g0(), c8472js0.c0().f0(), c8472js0.c0().c0(), c8472js0.f0(), c8472js0.f0() == Es0.RAW ? null : Integer.valueOf(c8472js0.b0()));
                Xo0 xo0C = Xo0.c();
                Uk0 uk0A = Uk0.a();
                Ck0 c9961xo0 = !xo0C.j(c9749vp0A) ? new C9961xo0(c9749vp0A, uk0A) : xo0C.a(c9749vp0A, uk0A);
                int iK0 = c8472js0.k0() - 2;
                if (iK0 == 1) {
                    ek0 = Ek0.f66503b;
                } else if (iK0 == 2) {
                    ek0 = Ek0.f66504c;
                } else {
                    if (iK0 != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    ek0 = Ek0.f66505d;
                }
                arrayList.add(new Kk0(c9961xo0, ek0, iB0, iB0 == c8686ls0.c0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(C8686ls0 c8686ls0) throws GeneralSecurityException {
        if (c8686ls0 == null || c8686ls0.b0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final Object d(C9846wk0 c9846wk0, Class cls) throws GeneralSecurityException {
        AbstractC8571ko0 abstractC8571ko0 = (AbstractC8571ko0) c9846wk0;
        Class clsA = abstractC8571ko0.a(cls);
        if (clsA != null) {
            return f(abstractC8571ko0, cls, clsA);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final String toString() {
        int i10 = Xk0.f71387a;
        C8793ms0 c8793ms0B0 = C9327rs0.b0();
        C8686ls0 c8686ls0 = this.f68705a;
        c8793ms0B0.v(c8686ls0.c0());
        for (C8472js0 c8472js0 : c8686ls0.h0()) {
            C8900ns0 c8900ns0B0 = C9114ps0.b0();
            c8900ns0B0.w(c8472js0.c0().g0());
            c8900ns0B0.x(c8472js0.k0());
            c8900ns0B0.v(c8472js0.f0());
            c8900ns0B0.u(c8472js0.b0());
            c8793ms0B0.u((C9114ps0) c8900ns0B0.p());
        }
        return ((C9327rs0) c8793ms0B0.p()).toString();
    }

    static final Mk0 a(C8686ls0 c8686ls0) throws GeneralSecurityException {
        h(c8686ls0);
        return new Mk0(c8686ls0, g(c8686ls0));
    }
}
