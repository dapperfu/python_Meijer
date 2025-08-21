package io.reactivex;

import cv.C13558a;

/* loaded from: classes10.dex */
public abstract class f<T> implements lw.a<T> {

    /* renamed from: a, reason: collision with root package name */
    static final int f138877a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    protected abstract void h(lw.b<? super T> bVar);

    public static int b() {
        return f138877a;
    }

    @Override // lw.a
    public final void a(lw.b<? super T> bVar) {
        if (bVar instanceof g) {
            g((g) bVar);
        } else {
            Nu.b.e(bVar, "s is null");
            g(new Yu.a(bVar));
        }
    }

    public final f<T> d(int i10, boolean z10, boolean z11) {
        Nu.b.f(i10, "capacity");
        return C13558a.m(new Ru.c(this, i10, z11, z10, Nu.a.f22736c));
    }

    public final f<T> e() {
        return C13558a.m(new Ru.d(this));
    }

    public final f<T> f() {
        return C13558a.m(new Ru.f(this));
    }

    public final void g(g<? super T> gVar) {
        Nu.b.e(gVar, "s is null");
        try {
            lw.b<? super T> bVarA = C13558a.A(this, gVar);
            Nu.b.e(bVarA, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            h(bVarA);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Ku.a.b(th2);
            C13558a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final f<T> c() {
        return d(b(), false, true);
    }
}
