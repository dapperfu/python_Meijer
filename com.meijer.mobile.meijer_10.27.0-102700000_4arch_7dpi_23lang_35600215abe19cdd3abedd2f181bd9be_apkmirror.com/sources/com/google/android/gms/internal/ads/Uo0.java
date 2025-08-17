package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class Uo0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Uo0 f70699b = new Uo0();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f70700a = new AtomicReference(new C9108pp0(new C8680lp0(null), null));

    public static Uo0 a() {
        return f70699b;
    }

    public final synchronized void e(AbstractC8573kp0 abstractC8573kp0) throws GeneralSecurityException {
        C8680lp0 c8680lp0 = new C8680lp0((C9108pp0) this.f70700a.get(), null);
        c8680lp0.a(abstractC8573kp0);
        this.f70700a.set(new C9108pp0(c8680lp0, null));
    }

    public final synchronized void f(InterfaceC9642up0 interfaceC9642up0) throws GeneralSecurityException {
        C8680lp0 c8680lp0 = new C8680lp0((C9108pp0) this.f70700a.get(), null);
        c8680lp0.b(interfaceC9642up0);
        this.f70700a.set(new C9108pp0(c8680lp0, null));
    }

    public final Class b(Class cls) throws GeneralSecurityException {
        return ((C9108pp0) this.f70700a.get()).a(cls);
    }

    public final Object c(Ck0 ck0, Class cls) throws GeneralSecurityException {
        return ((C9108pp0) this.f70700a.get()).b(ck0, cls);
    }

    public final Object d(C9535tp0 c9535tp0, Class cls) throws GeneralSecurityException {
        return ((C9108pp0) this.f70700a.get()).c(c9535tp0, cls);
    }

    Uo0() {
    }
}
