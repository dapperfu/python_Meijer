package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import g6.E;
import g6.InterfaceC14200A;
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
    public static Executor f62870e;

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC14200A<T>> f62871a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<InterfaceC14200A<Throwable>> f62872b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f62873c;

    /* renamed from: d, reason: collision with root package name */
    private volatile E<T> f62874d;

    public q(Callable<E<T>> callable) {
        this(callable, false);
    }

    private synchronized void f(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f62872b);
        if (arrayList.isEmpty()) {
            u6.g.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC14200A) it.next()).onResult(th2);
        }
    }

    private synchronized void i(T t10) {
        Iterator it = new ArrayList(this.f62871a).iterator();
        while (it.hasNext()) {
            ((InterfaceC14200A) it.next()).onResult(t10);
        }
    }

    public synchronized q<T> c(InterfaceC14200A<Throwable> interfaceC14200A) {
        try {
            E<T> e10 = this.f62874d;
            if (e10 != null && e10.a() != null) {
                interfaceC14200A.onResult(e10.a());
            }
            this.f62872b.add(interfaceC14200A);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized q<T> d(InterfaceC14200A<T> interfaceC14200A) {
        try {
            E<T> e10 = this.f62874d;
            if (e10 != null && e10.b() != null) {
                interfaceC14200A.onResult(e10.b());
            }
            this.f62871a.add(interfaceC14200A);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized q<T> j(InterfaceC14200A<Throwable> interfaceC14200A) {
        this.f62872b.remove(interfaceC14200A);
        return this;
    }

    public synchronized q<T> k(InterfaceC14200A<T> interfaceC14200A) {
        this.f62871a.remove(interfaceC14200A);
        return this;
    }

    private static class a<T> extends FutureTask<E<T>> {

        /* renamed from: a, reason: collision with root package name */
        private q<T> f62875a;

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f62875a.l(get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f62875a.l(new E(e10));
                }
            } finally {
                this.f62875a = null;
            }
        }

        a(q<T> qVar, Callable<E<T>> callable) {
            super(callable);
            this.f62875a = qVar;
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f62870e = new androidx.privacysandbox.ads.adservices.measurement.k();
        } else {
            f62870e = Executors.newCachedThreadPool(new u6.h());
        }
    }

    public q(T t10) {
        this.f62871a = new LinkedHashSet(1);
        this.f62872b = new LinkedHashSet(1);
        this.f62873c = new Handler(Looper.getMainLooper());
        this.f62874d = null;
        l(new E<>(t10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        E<T> e10 = this.f62874d;
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
        if (this.f62874d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f62874d = e10;
        g();
    }

    public E<T> e() {
        return this.f62874d;
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f62873c.post(new Runnable() { // from class: g6.F
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132875a.h();
                }
            });
        }
    }

    q(Callable<E<T>> callable, boolean z10) {
        this.f62871a = new LinkedHashSet(1);
        this.f62872b = new LinkedHashSet(1);
        this.f62873c = new Handler(Looper.getMainLooper());
        this.f62874d = null;
        if (z10) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th2) {
                l(new E<>(th2));
                return;
            }
        }
        f62870e.execute(new a(this, callable));
    }
}
