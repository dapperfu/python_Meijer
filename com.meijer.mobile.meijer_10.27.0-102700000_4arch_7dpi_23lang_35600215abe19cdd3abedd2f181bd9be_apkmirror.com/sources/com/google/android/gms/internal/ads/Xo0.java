package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class Xo0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Xo0 f71408b = (Xo0) zzgnt.a(new Gp0() { // from class: com.google.android.gms.internal.ads.Vo0
        @Override // com.google.android.gms.internal.ads.Gp0
        public final Object zza() throws GeneralSecurityException {
            Xo0 xo0 = new Xo0();
            xo0.g(new C9319ro0(C9961xo0.class, C9749vp0.class, new InterfaceC9426so0() { // from class: com.google.android.gms.internal.ads.Wo0
                @Override // com.google.android.gms.internal.ads.InterfaceC9426so0
                public final Ap0 a(Ck0 ck0, Uk0 uk0) {
                    return ((C9961xo0) ck0).a(uk0);
                }
            }));
            return xo0;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f71409a = new AtomicReference(new Fp0(new Bp0(), null));

    public static Xo0 c() {
        return f71408b;
    }

    public final synchronized void f(AbstractC9213qo0 abstractC9213qo0) throws GeneralSecurityException {
        Bp0 bp0 = new Bp0((Fp0) this.f71409a.get());
        bp0.a(abstractC9213qo0);
        this.f71409a.set(new Fp0(bp0, null));
    }

    public final synchronized void g(AbstractC9640uo0 abstractC9640uo0) throws GeneralSecurityException {
        Bp0 bp0 = new Bp0((Fp0) this.f71409a.get());
        bp0.b(abstractC9640uo0);
        this.f71409a.set(new Fp0(bp0, null));
    }

    public final synchronized void h(AbstractC7720cp0 abstractC7720cp0) throws GeneralSecurityException {
        Bp0 bp0 = new Bp0((Fp0) this.f71409a.get());
        bp0.c(abstractC7720cp0);
        this.f71409a.set(new Fp0(bp0, null));
    }

    public final synchronized void i(AbstractC8147gp0 abstractC8147gp0) throws GeneralSecurityException {
        Bp0 bp0 = new Bp0((Fp0) this.f71409a.get());
        bp0.d(abstractC8147gp0);
        this.f71409a.set(new Fp0(bp0, null));
    }

    public final Ck0 a(Ap0 ap0, Uk0 uk0) throws GeneralSecurityException {
        return ((Fp0) this.f71409a.get()).a(ap0, uk0);
    }

    public final Qk0 b(Ap0 ap0) throws GeneralSecurityException {
        return ((Fp0) this.f71409a.get()).b(ap0);
    }

    public final Ap0 d(Ck0 ck0, Class cls, Uk0 uk0) throws GeneralSecurityException {
        return ((Fp0) this.f71409a.get()).c(ck0, cls, uk0);
    }

    public final Ap0 e(Qk0 qk0, Class cls) throws GeneralSecurityException {
        return ((Fp0) this.f71409a.get()).d(qk0, cls);
    }

    public final boolean j(Ap0 ap0) {
        return ((Fp0) this.f71409a.get()).i(ap0);
    }

    public final boolean k(Ap0 ap0) {
        return ((Fp0) this.f71409a.get()).j(ap0);
    }
}
