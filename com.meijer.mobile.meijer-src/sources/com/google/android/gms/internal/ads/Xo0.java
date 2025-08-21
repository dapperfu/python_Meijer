package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class Xo0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Xo0 f72248b = (Xo0) zzgnt.a(new Gp0() { // from class: com.google.android.gms.internal.ads.Vo0
        @Override // com.google.android.gms.internal.ads.Gp0
        public final Object zza() throws GeneralSecurityException {
            Xo0 xo0 = new Xo0();
            xo0.g(new C9444ro0(C10086xo0.class, C9874vp0.class, new InterfaceC9551so0() { // from class: com.google.android.gms.internal.ads.Wo0
                @Override // com.google.android.gms.internal.ads.InterfaceC9551so0
                public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                    return ((C10086xo0) ck0).a(uk0);
                }
            }));
            return xo0;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f72249a = new AtomicReference(new Fp0(new Bp0(), null));

    public static Xo0 c() {
        return f72248b;
    }

    public final synchronized void f(AbstractC9338qo0 abstractC9338qo0) throws GeneralSecurityException {
        Bp0 bp0 = new Bp0((Fp0) this.f72249a.get());
        bp0.a(abstractC9338qo0);
        this.f72249a.set(new Fp0(bp0, null));
    }

    public final synchronized void g(AbstractC9765uo0 abstractC9765uo0) throws GeneralSecurityException {
        Bp0 bp0 = new Bp0((Fp0) this.f72249a.get());
        bp0.b(abstractC9765uo0);
        this.f72249a.set(new Fp0(bp0, null));
    }

    public final synchronized void h(AbstractC7845cp0 abstractC7845cp0) throws GeneralSecurityException {
        Bp0 bp0 = new Bp0((Fp0) this.f72249a.get());
        bp0.c(abstractC7845cp0);
        this.f72249a.set(new Fp0(bp0, null));
    }

    public final synchronized void i(AbstractC8272gp0 abstractC8272gp0) throws GeneralSecurityException {
        Bp0 bp0 = new Bp0((Fp0) this.f72249a.get());
        bp0.d(abstractC8272gp0);
        this.f72249a.set(new Fp0(bp0, null));
    }

    public final Ck0 a(Ap0 ap0, Uk0 uk0) throws GeneralSecurityException {
        return ((Fp0) this.f72249a.get()).a(ap0, uk0);
    }

    public final Qk0 b(Ap0 ap0) throws GeneralSecurityException {
        return ((Fp0) this.f72249a.get()).b(ap0);
    }

    public final Ap0 d(Ck0 ck0, Class cls, Uk0 uk0) throws GeneralSecurityException {
        return ((Fp0) this.f72249a.get()).c(ck0, cls, uk0);
    }

    public final Ap0 e(Qk0 qk0, Class cls) throws GeneralSecurityException {
        return ((Fp0) this.f72249a.get()).d(qk0, cls);
    }

    public final boolean j(Ap0 ap0) {
        return ((Fp0) this.f72249a.get()).i(ap0);
    }

    public final boolean k(Ap0 ap0) {
        return ((Fp0) this.f72249a.get()).j(ap0);
    }
}
