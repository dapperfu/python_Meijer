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
    private final boolean f63799a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f63800b;

    /* renamed from: c, reason: collision with root package name */
    final Map<V6.e, c> f63801c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<o<?>> f63802d;

    /* renamed from: e, reason: collision with root package name */
    private o.a f63803e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f63804f;

    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    class ThreadFactoryC1245a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        class RunnableC1246a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f63805a;

            RunnableC1246a(Runnable runnable) {
                this.f63805a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f63805a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC1246a(runnable), "glide-active-resources");
        }

        ThreadFactoryC1245a() {
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
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC1245a()));
    }

    synchronized void a(V6.e eVar, o<?> oVar) {
        c cVarPut = this.f63801c.put(eVar, new c(eVar, oVar, this.f63802d, this.f63799a));
        if (cVarPut != null) {
            cVarPut.a();
        }
    }

    void c(c cVar) {
        X6.c<?> cVar2;
        synchronized (this) {
            this.f63801c.remove(cVar.f63808a);
            if (cVar.f63809b && (cVar2 = cVar.f63810c) != null) {
                this.f63803e.a(cVar.f63808a, new o<>(cVar2, true, false, cVar.f63808a, this.f63803e));
            }
        }
    }

    synchronized void d(V6.e eVar) {
        c cVarRemove = this.f63801c.remove(eVar);
        if (cVarRemove != null) {
            cVarRemove.a();
        }
    }

    synchronized o<?> e(V6.e eVar) {
        c cVar = this.f63801c.get(eVar);
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
                this.f63803e = aVar;
            }
        }
    }

    static final class c extends WeakReference<o<?>> {

        /* renamed from: a, reason: collision with root package name */
        final V6.e f63808a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f63809b;

        /* renamed from: c, reason: collision with root package name */
        X6.c<?> f63810c;

        void a() {
            this.f63810c = null;
            clear();
        }

        c(V6.e eVar, o<?> oVar, ReferenceQueue<? super o<?>> referenceQueue, boolean z10) {
            X6.c<?> cVar;
            super(oVar, referenceQueue);
            this.f63808a = (V6.e) p7.k.d(eVar);
            if (oVar.e() && z10) {
                cVar = (X6.c) p7.k.d(oVar.d());
            } else {
                cVar = null;
            }
            this.f63810c = cVar;
            this.f63809b = oVar.e();
        }
    }

    void b() {
        while (!this.f63804f) {
            try {
                c((c) this.f63802d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    a(boolean z10, Executor executor) {
        this.f63801c = new HashMap();
        this.f63802d = new ReferenceQueue<>();
        this.f63799a = z10;
        this.f63800b = executor;
        executor.execute(new b());
    }
}
