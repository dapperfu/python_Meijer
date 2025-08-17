package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    private static t f88230b = new t();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<C> f88231a = new AtomicReference<>(C.c().c());

    public synchronized <KeyT extends Ie.j, PrimitiveT> void d(B<KeyT, PrimitiveT> b10) throws GeneralSecurityException {
        this.f88231a.set(C.d(this.f88231a.get()).d(b10).c());
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void e(F<InputPrimitiveT, WrapperPrimitiveT> f10) throws GeneralSecurityException {
        this.f88231a.set(C.d(this.f88231a.get()).e(f10).c());
    }

    public static t c() {
        return f88230b;
    }

    public <WrapperPrimitiveT> Class<?> a(Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return this.f88231a.get().e(cls);
    }

    public <KeyT extends Ie.j, PrimitiveT> PrimitiveT b(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (PrimitiveT) this.f88231a.get().f(keyt, cls);
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT f(D<InputPrimitiveT> d10, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return (WrapperPrimitiveT) this.f88231a.get().g(d10, cls);
    }

    t() {
    }
}
