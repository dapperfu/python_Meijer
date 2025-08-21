package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f64639a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f64640b;

    /* renamed from: c, reason: collision with root package name */
    final Map<X6.e, c> f64641c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<o<?>> f64642d;

    /* renamed from: e, reason: collision with root package name */
    private o.a f64643e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f64644f;

    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC1254a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC1255a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f64645a;

            RunnableC1255a(Runnable runnable) {
                this.f64645a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f64645a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC1255a(runnable), "glide-active-resources");
        }

        ThreadFactoryC1254a() {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC1254a()));
    }

    synchronized void a(X6.e eVar, o<?> oVar) {
        c cVarPut = this.f64641c.put(eVar, new c(eVar, oVar, this.f64642d, this.f64639a));
        if (cVarPut != null) {
            cVarPut.a();
        }
    }

    void c(c cVar) {
        Z6.c<?> cVar2;
        synchronized (this) {
            this.f64641c.remove(cVar.f64648a);
            if (cVar.f64649b && (cVar2 = cVar.f64650c) != null) {
                this.f64643e.b(cVar.f64648a, new o<>(cVar2, true, false, cVar.f64648a, this.f64643e));
            }
        }
    }

    synchronized void d(X6.e eVar) {
        c cVarRemove = this.f64641c.remove(eVar);
        if (cVarRemove != null) {
            cVarRemove.a();
        }
    }

    synchronized o<?> e(X6.e eVar) {
        c cVar = this.f64641c.get(eVar);
        if (cVar == null) {
            return null;
        }
        o<?> oVar = cVar.get();
        if (oVar == null) {
            c(cVar);
        }
        return oVar;
    }

    void f(o.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f64643e = aVar;
            }
        }
    }

    static final class c extends WeakReference<o<?>> {

        /* renamed from: a, reason: collision with root package name */
        final X6.e f64648a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f64649b;

        /* renamed from: c, reason: collision with root package name */
        Z6.c<?> f64650c;

        void a() {
            this.f64650c = null;
            clear();
        }

        c(X6.e eVar, o<?> oVar, ReferenceQueue<? super o<?>> referenceQueue, boolean z10) {
            Z6.c<?> cVar;
            super(oVar, referenceQueue);
            this.f64648a = (X6.e) r7.k.d(eVar);
            if (oVar.e() && z10) {
                cVar = (Z6.c) r7.k.d(oVar.d());
            } else {
                cVar = null;
            }
            this.f64650c = cVar;
            this.f64649b = oVar.e();
        }
    }

    void b() {
        while (!this.f64644f) {
            try {
                c((c) this.f64642d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    a(boolean z10, Executor executor) {
        this.f64641c = new HashMap();
        this.f64642d = new ReferenceQueue<>();
        this.f64639a = z10;
        this.f64640b = executor;
        executor.execute(new b());
    }
}
