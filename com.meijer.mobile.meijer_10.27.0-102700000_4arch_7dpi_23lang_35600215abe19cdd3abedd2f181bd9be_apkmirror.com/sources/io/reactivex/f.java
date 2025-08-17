package io.reactivex;

import cv.C13425a;
import gv.C14313a;

/* loaded from: classes9.dex */
public abstract class f<T> implements pw.a<T> {

    /* renamed from: a, reason: collision with root package name */
    static final int f138235a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    protected abstract void h(pw.b<? super T> bVar);

    public static int b() {
        return f138235a;
    }

    @Override // pw.a
    public final void a(pw.b<? super T> bVar) {
        if (bVar instanceof g) {
            g((g) bVar);
        } else {
            Ru.b.e(bVar, "s is null");
            g(new C13425a(bVar));
        }
    }

    public final f<T> d(int i10, boolean z10, boolean z11) {
        Ru.b.f(i10, "capacity");
        return C14313a.m(new Vu.c(this, i10, z11, z10, Ru.a.f33002c));
    }

    public final f<T> e() {
        return C14313a.m(new Vu.d(this));
    }

    public final f<T> f() {
        return C14313a.m(new Vu.f(this));
    }

    public final void g(g<? super T> gVar) {
        Ru.b.e(gVar, "s is null");
        try {
            pw.b<? super T> bVarA = C14313a.A(this, gVar);
            Ru.b.e(bVarA, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            h(bVarA);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Ou.a.b(th2);
            C14313a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final f<T> c() {
        return d(b(), false, true);
    }
}
