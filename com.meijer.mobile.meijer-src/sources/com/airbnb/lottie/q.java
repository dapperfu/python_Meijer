package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import h6.E;
import h6.InterfaceC14469A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
public class q<T> {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f63709e;

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC14469A<T>> f63710a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<InterfaceC14469A<Throwable>> f63711b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f63712c;

    /* renamed from: d, reason: collision with root package name */
    private volatile E<T> f63713d;

    public q(Callable<E<T>> callable) {
        this(callable, false);
    }

    private synchronized void f(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f63711b);
        if (arrayList.isEmpty()) {
            v6.g.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC14469A) it.next()).onResult(th2);
        }
    }

    private synchronized void i(T t10) {
        Iterator it = new ArrayList(this.f63710a).iterator();
        while (it.hasNext()) {
            ((InterfaceC14469A) it.next()).onResult(t10);
        }
    }

    public synchronized q<T> c(InterfaceC14469A<Throwable> interfaceC14469A) {
        try {
            E<T> e10 = this.f63713d;
            if (e10 != null && e10.a() != null) {
                interfaceC14469A.onResult(e10.a());
            }
            this.f63711b.add(interfaceC14469A);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized q<T> d(InterfaceC14469A<T> interfaceC14469A) {
        try {
            E<T> e10 = this.f63713d;
            if (e10 != null && e10.b() != null) {
                interfaceC14469A.onResult(e10.b());
            }
            this.f63710a.add(interfaceC14469A);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized q<T> j(InterfaceC14469A<Throwable> interfaceC14469A) {
        this.f63711b.remove(interfaceC14469A);
        return this;
    }

    public synchronized q<T> k(InterfaceC14469A<T> interfaceC14469A) {
        this.f63710a.remove(interfaceC14469A);
        return this;
    }

    private static class a<T> extends FutureTask<E<T>> {

        /* renamed from: a, reason: collision with root package name */
        private q<T> f63714a;

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f63714a.l(get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f63714a.l(new E(e10));
                }
            } finally {
                this.f63714a = null;
            }
        }

        a(q<T> qVar, Callable<E<T>> callable) {
            super(callable);
            this.f63714a = qVar;
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f63709e = new androidx.privacysandbox.ads.adservices.measurement.k();
        } else {
            f63709e = Executors.newCachedThreadPool(new v6.h());
        }
    }

    public q(T t10) {
        this.f63710a = new LinkedHashSet(1);
        this.f63711b = new LinkedHashSet(1);
        this.f63712c = new Handler(Looper.getMainLooper());
        this.f63713d = null;
        l(new E<>(t10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        E<T> e10 = this.f63713d;
        if (e10 == null) {
            return;
        }
        if (e10.b() != null) {
            i(e10.b());
        } else {
            f(e10.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(E<T> e10) {
        if (this.f63713d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f63713d = e10;
        g();
    }

    public E<T> e() {
        return this.f63713d;
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f63712c.post(new Runnable() { // from class: h6.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135051a.h();
                }
            });
        }
    }

    q(Callable<E<T>> callable, boolean z10) {
        this.f63710a = new LinkedHashSet(1);
        this.f63711b = new LinkedHashSet(1);
        this.f63712c = new Handler(Looper.getMainLooper());
        this.f63713d = null;
        if (z10) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th2) {
                l(new E<>(th2));
                return;
            }
        }
        f63709e.execute(new a(this, callable));
    }
}
