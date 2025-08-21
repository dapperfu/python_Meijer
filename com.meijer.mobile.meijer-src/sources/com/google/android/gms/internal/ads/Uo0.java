package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class Uo0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Uo0 f71539b = new Uo0();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f71540a = new AtomicReference(new C9233pp0(new C8805lp0(null), null));

    public static Uo0 a() {
        return f71539b;
    }

    public final synchronized void e(AbstractC8698kp0 abstractC8698kp0) throws GeneralSecurityException {
        C8805lp0 c8805lp0 = new C8805lp0((C9233pp0) this.f71540a.get(), null);
        c8805lp0.a(abstractC8698kp0);
        this.f71540a.set(new C9233pp0(c8805lp0, null));
    }

    public final synchronized void f(InterfaceC9767up0 interfaceC9767up0) throws GeneralSecurityException {
        C8805lp0 c8805lp0 = new C8805lp0((C9233pp0) this.f71540a.get(), null);
        c8805lp0.b(interfaceC9767up0);
        this.f71540a.set(new C9233pp0(c8805lp0, null));
    }

    public final Class b(Class cls) throws GeneralSecurityException {
        return ((C9233pp0) this.f71540a.get()).a(cls);
    }

    public final Object c(Ck0 ck0, Class cls) throws GeneralSecurityException {
        return ((C9233pp0) this.f71540a.get()).b(ck0, cls);
    }

    public final Object d(C9660tp0 c9660tp0, Class cls) throws GeneralSecurityException {
        return ((C9233pp0) this.f71540a.get()).c(c9660tp0, cls);
    }

    Uo0() {
    }
}
