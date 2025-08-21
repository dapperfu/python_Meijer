package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class Mk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8811ls0 f69545a;

    /* renamed from: b, reason: collision with root package name */
    private final List f69546b;

    /* renamed from: c, reason: collision with root package name */
    private final Bo0 f69547c;

    /* synthetic */ Mk0(C8811ls0 c8811ls0, List list, Bo0 bo0, Lk0 lk0) {
        this.f69545a = c8811ls0;
        this.f69546b = list;
        this.f69547c = bo0;
    }

    final C8811ls0 c() {
        return this.f69545a;
    }

    private Mk0(C8811ls0 c8811ls0, List list) {
        this.f69545a = c8811ls0;
        this.f69546b = list;
        this.f69547c = Bo0.f66422b;
    }

    public static final Mk0 b(Qk0 qk0) throws GeneralSecurityException {
        Jk0 jk0 = new Jk0();
        Hk0 hk0 = new Hk0(qk0, null);
        hk0.d();
        hk0.c();
        jk0.a(hk0);
        return jk0.b();
    }

    private final Object f(AbstractC8696ko0 abstractC8696ko0, Class cls, Class cls2) throws GeneralSecurityException {
        int i10 = Xk0.f72227a;
        C8811ls0 c8811ls0 = this.f69545a;
        int iC0 = c8811ls0.c0();
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (C8597js0 c8597js0 : c8811ls0.h0()) {
            if (c8597js0.k0() == 3) {
                if (!c8597js0.j0()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c8597js0.b0())));
                }
                if (c8597js0.f0() == Es0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c8597js0.b0())));
                }
                if (c8597js0.k0() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c8597js0.b0())));
                }
                if (c8597js0.b0() == iC0) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z11 &= c8597js0.c0().c0() == Xr0.ASYMMETRIC_PUBLIC;
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        C9340qp0 c9340qp0B = C9660tp0.b(cls2);
        c9340qp0B.c(this.f69547c);
        for (int i12 = 0; i12 < this.f69546b.size(); i12++) {
            C8597js0 c8597js0E0 = this.f69545a.e0(i12);
            if (c8597js0E0.k0() == 3) {
                Kk0 kk0 = (Kk0) this.f69546b.get(i12);
                if (kk0 == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i12 + " and type_url " + c8597js0E0.c0().g0() + " failed, unable to get primitive");
                }
                Ck0 ck0A = kk0.a();
                try {
                    Object objB = abstractC8696ko0.b(ck0A, cls2);
                    if (c8597js0E0.b0() == this.f69545a.c0()) {
                        c9340qp0B.b(objB, ck0A, c8597js0E0);
                    } else {
                        c9340qp0B.a(objB, ck0A, c8597js0E0);
                    }
                } catch (GeneralSecurityException e10) {
                    throw new GeneralSecurityException("Unable to get primitive " + cls2.toString() + " for key of type " + c8597js0E0.c0().g0() + ", see https://developers.google.com/tink/faq/registration_errors", e10);
                }
            }
        }
        return abstractC8696ko0.c(c9340qp0B.d(), cls);
    }

    private static List g(C8811ls0 c8811ls0) throws GeneralSecurityException {
        Ek0 ek0;
        ArrayList arrayList = new ArrayList(c8811ls0.b0());
        for (C8597js0 c8597js0 : c8811ls0.h0()) {
            int iB0 = c8597js0.b0();
            try {
                C9874vp0 c9874vp0A = C9874vp0.a(c8597js0.c0().g0(), c8597js0.c0().f0(), c8597js0.c0().c0(), c8597js0.f0(), c8597js0.f0() == Es0.RAW ? null : Integer.valueOf(c8597js0.b0()));
                Xo0 xo0C = Xo0.c();
                Uk0 uk0A = Uk0.a();
                Ck0 c10086xo0 = !xo0C.j(c9874vp0A) ? new C10086xo0(c9874vp0A, uk0A) : xo0C.a(c9874vp0A, uk0A);
                int iK0 = c8597js0.k0() - 2;
                if (iK0 == 1) {
                    ek0 = Ek0.f67343b;
                } else if (iK0 == 2) {
                    ek0 = Ek0.f67344c;
                } else {
                    if (iK0 != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    ek0 = Ek0.f67345d;
                }
                arrayList.add(new Kk0(c10086xo0, ek0, iB0, iB0 == c8811ls0.c0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(C8811ls0 c8811ls0) throws GeneralSecurityException {
        if (c8811ls0 == null || c8811ls0.b0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final Object d(C9971wk0 c9971wk0, Class cls) throws GeneralSecurityException {
        AbstractC8696ko0 abstractC8696ko0 = (AbstractC8696ko0) c9971wk0;
        Class clsA = abstractC8696ko0.a(cls);
        if (clsA != null) {
            return f(abstractC8696ko0, cls, clsA);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final String toString() {
        int i10 = Xk0.f72227a;
        C8918ms0 c8918ms0B0 = C9452rs0.b0();
        C8811ls0 c8811ls0 = this.f69545a;
        c8918ms0B0.v(c8811ls0.c0());
        for (C8597js0 c8597js0 : c8811ls0.h0()) {
            C9025ns0 c9025ns0B0 = C9239ps0.b0();
            c9025ns0B0.w(c8597js0.c0().g0());
            c9025ns0B0.x(c8597js0.k0());
            c9025ns0B0.v(c8597js0.f0());
            c9025ns0B0.u(c8597js0.b0());
            c8918ms0B0.u((C9239ps0) c9025ns0B0.p());
        }
        return ((C9452rs0) c8918ms0B0.p()).toString();
    }

    static final Mk0 a(C8811ls0 c8811ls0) throws GeneralSecurityException {
        h(c8811ls0);
        return new Mk0(c8811ls0, g(c8811ls0));
    }
}
