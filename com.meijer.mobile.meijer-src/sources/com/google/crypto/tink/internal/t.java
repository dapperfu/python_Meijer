package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    private static t f89070b = new t();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<C> f89071a = new AtomicReference<>(C.c().c());

    public synchronized <KeyT extends Ke.j, PrimitiveT> void d(B<KeyT, PrimitiveT> b10) throws GeneralSecurityException {
        this.f89071a.set(C.d(this.f89071a.get()).d(b10).c());
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void e(F<InputPrimitiveT, WrapperPrimitiveT> f10) throws GeneralSecurityException {
        this.f89071a.set(C.d(this.f89071a.get()).e(f10).c());
    }

    public static t c() {
        return f89070b;
    }

    public <WrapperPrimitiveT> Class<?> a(Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return this.f89071a.get().e(cls);
    }

    public <KeyT extends Ke.j, PrimitiveT> PrimitiveT b(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (PrimitiveT) this.f89071a.get().f(keyt, cls);
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT f(D<InputPrimitiveT> d10, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return (WrapperPrimitiveT) this.f89071a.get().g(d10, cls);
    }

    t() {
    }
}
