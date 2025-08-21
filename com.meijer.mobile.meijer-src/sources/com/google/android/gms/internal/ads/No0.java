package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class No0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Mo0 f69787b = new Mo0() { // from class: com.google.android.gms.internal.ads.Lo0
        @Override // com.google.android.gms.internal.ads.Mo0
        public final Ck0 a(Qk0 qk0, Integer num) throws GeneralSecurityException {
            int i10 = No0.f69789d;
            C7957ds0 c7957ds0C = ((C10193yo0) qk0).b().c();
            Dk0 dk0B = C8803lo0.c().b(c7957ds0C.i0());
            if (!C8803lo0.c().e(c7957ds0C.i0())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            Zr0 zr0A = dk0B.a(c7957ds0C.h0());
            return new C10086xo0(C9874vp0.a(zr0A.g0(), zr0A.f0(), zr0A.c0(), c7957ds0C.g0(), num), Bk0.a());
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final No0 f69788c = e();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f69789d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f69790a = new HashMap();

    public static No0 b() {
        return f69788c;
    }

    private final synchronized Ck0 d(Qk0 qk0, Integer num) throws GeneralSecurityException {
        Mo0 mo0;
        mo0 = (Mo0) this.f69790a.get(qk0.getClass());
        if (mo0 == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + qk0.toString() + ": no key creator for this class was registered.");
        }
        return mo0.a(qk0, num);
    }

    public final synchronized void c(Mo0 mo0, Class cls) throws GeneralSecurityException {
        try {
            Mo0 mo02 = (Mo0) this.f69790a.get(cls);
            if (mo02 != null && !mo02.equals(mo0)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.f69790a.put(cls, mo0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static No0 e() {
        No0 no0 = new No0();
        try {
            no0.c(f69787b, C10193yo0.class);
            return no0;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    public final Ck0 a(Qk0 qk0, Integer num) throws GeneralSecurityException {
        return d(qk0, num);
    }
}
