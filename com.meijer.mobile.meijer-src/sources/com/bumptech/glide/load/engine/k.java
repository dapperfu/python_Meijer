package com.bumptech.glide.load.engine;

import c7.ExecutorServiceC6490a;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import o7.InterfaceC16083h;
import r7.C16872e;
import s7.C17028a;

/* loaded from: classes4.dex */
class k<R> implements h.b<R>, C17028a.f {

    /* renamed from: z, reason: collision with root package name */
    private static final c f64768z = new c();

    /* renamed from: a, reason: collision with root package name */
    final e f64769a;

    /* renamed from: b, reason: collision with root package name */
    private final s7.c f64770b;

    /* renamed from: c, reason: collision with root package name */
    private final o.a f64771c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.f<k<?>> f64772d;

    /* renamed from: e, reason: collision with root package name */
    private final c f64773e;

    /* renamed from: f, reason: collision with root package name */
    private final l f64774f;

    /* renamed from: g, reason: collision with root package name */
    private final ExecutorServiceC6490a f64775g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorServiceC6490a f64776h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorServiceC6490a f64777i;

    /* renamed from: j, reason: collision with root package name */
    private final ExecutorServiceC6490a f64778j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f64779k;

    /* renamed from: l, reason: collision with root package name */
    private X6.e f64780l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f64781m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f64782n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f64783o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f64784p;

    /* renamed from: q, reason: collision with root package name */
    private Z6.c<?> f64785q;

    /* renamed from: r, reason: collision with root package name */
    X6.a f64786r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f64787s;

    /* renamed from: t, reason: collision with root package name */
    GlideException f64788t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f64789u;

    /* renamed from: v, reason: collision with root package name */
    o<?> f64790v;

    /* renamed from: w, reason: collision with root package name */
    private h<R> f64791w;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f64792x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f64793y;

    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC16083h f64794a;

        a(InterfaceC16083h interfaceC16083h) {
            this.f64794a = interfaceC16083h;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f64794a.f()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f64769a.e(this.f64794a)) {
                            k.this.f(this.f64794a);
                        }
                        k.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC16083h f64796a;

        b(InterfaceC16083h interfaceC16083h) {
            this.f64796a = interfaceC16083h;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f64796a.f()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f64769a.e(this.f64796a)) {
                            k.this.f64790v.b();
                            k.this.g(this.f64796a);
                            k.this.r(this.f64796a);
                        }
                        k.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    static class c {
        public <R> o<R> a(Z6.c<R> cVar, boolean z10, X6.e eVar, o.a aVar) {
            return new o<>(cVar, z10, true, eVar, aVar);
        }

        c() {
        }
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC16083h f64798a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f64799b;

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f64798a.equals(((d) obj).f64798a);
            }
            return false;
        }

        public int hashCode() {
            return this.f64798a.hashCode();
        }

        d(InterfaceC16083h interfaceC16083h, Executor executor) {
            this.f64798a = interfaceC16083h;
            this.f64799b = executor;
        }
    }

    static final class e implements Iterable<d> {

        /* renamed from: a, reason: collision with root package name */
        private final List<d> f64800a;

        e() {
            this(new ArrayList(2));
        }

        e(List<d> list) {
            this.f64800a = list;
        }

        private static d h(InterfaceC16083h interfaceC16083h) {
            return new d(interfaceC16083h, C16872e.a());
        }

        void a(InterfaceC16083h interfaceC16083h, Executor executor) {
            this.f64800a.add(new d(interfaceC16083h, executor));
        }

        void clear() {
            this.f64800a.clear();
        }

        boolean e(InterfaceC16083h interfaceC16083h) {
            return this.f64800a.contains(h(interfaceC16083h));
        }

        e f() {
            return new e(new ArrayList(this.f64800a));
        }

        boolean isEmpty() {
            return this.f64800a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f64800a.iterator();
        }

        void k(InterfaceC16083h interfaceC16083h) {
            this.f64800a.remove(h(interfaceC16083h));
        }

        int size() {
            return this.f64800a.size();
        }
    }

    k(ExecutorServiceC6490a executorServiceC6490a, ExecutorServiceC6490a executorServiceC6490a2, ExecutorServiceC6490a executorServiceC6490a3, ExecutorServiceC6490a executorServiceC6490a4, l lVar, o.a aVar, o2.f<k<?>> fVar) {
        this(executorServiceC6490a, executorServiceC6490a2, executorServiceC6490a3, executorServiceC6490a4, lVar, aVar, fVar, f64768z);
    }

    private synchronized void q() {
        if (this.f64780l == null) {
            throw new IllegalArgumentException();
        }
        this.f64769a.clear();
        this.f64780l = null;
        this.f64790v = null;
        this.f64785q = null;
        this.f64789u = false;
        this.f64792x = false;
        this.f64787s = false;
        this.f64793y = false;
        this.f64791w.M(false);
        this.f64791w = null;
        this.f64788t = null;
        this.f64786r = null;
        this.f64772d.a(this);
    }

    synchronized void a(InterfaceC16083h interfaceC16083h, Executor executor) {
        try {
            this.f64770b.c();
            this.f64769a.a(interfaceC16083h, executor);
            if (this.f64787s) {
                k(1);
                executor.execute(new b(interfaceC16083h));
            } else if (this.f64789u) {
                k(1);
                executor.execute(new a(interfaceC16083h));
            } else {
                r7.k.a(!this.f64792x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void b(GlideException glideException) {
        synchronized (this) {
            this.f64788t = glideException;
        }
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void c(Z6.c<R> cVar, X6.a aVar, boolean z10) {
        synchronized (this) {
            this.f64785q = cVar;
            this.f64786r = aVar;
            this.f64793y = z10;
        }
        o();
    }

    void i() {
        o<?> oVar;
        synchronized (this) {
            try {
                this.f64770b.c();
                r7.k.a(m(), "Not yet complete!");
                int iDecrementAndGet = this.f64779k.decrementAndGet();
                r7.k.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    oVar = this.f64790v;
                    q();
                } else {
                    oVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (oVar != null) {
            oVar.f();
        }
    }

    synchronized void k(int i10) {
        o<?> oVar;
        r7.k.a(m(), "Not yet complete!");
        if (this.f64779k.getAndAdd(i10) == 0 && (oVar = this.f64790v) != null) {
            oVar.b();
        }
    }

    synchronized k<R> l(X6.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f64780l = eVar;
        this.f64781m = z10;
        this.f64782n = z11;
        this.f64783o = z12;
        this.f64784p = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f64770b.c();
                if (this.f64792x) {
                    q();
                    return;
                }
                if (this.f64769a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f64789u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f64789u = true;
                X6.e eVar = this.f64780l;
                e eVarF = this.f64769a.f();
                k(eVarF.size() + 1);
                this.f64774f.a(this, eVar, null);
                Iterator<d> it = eVarF.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f64799b.execute(new a(next.f64798a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.f64770b.c();
                if (this.f64792x) {
                    this.f64785q.a();
                    q();
                    return;
                }
                if (this.f64769a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f64787s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f64790v = this.f64773e.a(this.f64785q, this.f64781m, this.f64780l, this.f64771c);
                this.f64787s = true;
                e eVarF = this.f64769a.f();
                k(eVarF.size() + 1);
                this.f64774f.a(this, this.f64780l, this.f64790v);
                Iterator<d> it = eVarF.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f64799b.execute(new b(next.f64798a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    synchronized void r(InterfaceC16083h interfaceC16083h) {
        try {
            this.f64770b.c();
            this.f64769a.k(interfaceC16083h);
            if (this.f64769a.isEmpty()) {
                h();
                if (this.f64787s || this.f64789u) {
                    if (this.f64779k.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void s(h<R> hVar) {
        try {
            this.f64791w = hVar;
            (hVar.T() ? this.f64775g : j()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    k(ExecutorServiceC6490a executorServiceC6490a, ExecutorServiceC6490a executorServiceC6490a2, ExecutorServiceC6490a executorServiceC6490a3, ExecutorServiceC6490a executorServiceC6490a4, l lVar, o.a aVar, o2.f<k<?>> fVar, c cVar) {
        this.f64769a = new e();
        this.f64770b = s7.c.a();
        this.f64779k = new AtomicInteger();
        this.f64775g = executorServiceC6490a;
        this.f64776h = executorServiceC6490a2;
        this.f64777i = executorServiceC6490a3;
        this.f64778j = executorServiceC6490a4;
        this.f64774f = lVar;
        this.f64771c = aVar;
        this.f64772d = fVar;
        this.f64773e = cVar;
    }

    private ExecutorServiceC6490a j() {
        return this.f64782n ? this.f64777i : this.f64783o ? this.f64778j : this.f64776h;
    }

    private boolean m() {
        return this.f64789u || this.f64787s || this.f64792x;
    }

    @Override // s7.C17028a.f
    public s7.c e() {
        return this.f64770b;
    }

    void f(InterfaceC16083h interfaceC16083h) {
        try {
            interfaceC16083h.b(this.f64788t);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void g(InterfaceC16083h interfaceC16083h) {
        try {
            interfaceC16083h.c(this.f64790v, this.f64786r, this.f64793y);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    boolean p() {
        return this.f64784p;
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void d(h<?> hVar) {
        j().execute(hVar);
    }

    void h() {
        if (m()) {
            return;
        }
        this.f64792x = true;
        this.f64791w.b();
        this.f64774f.d(this, this.f64780l);
    }
}
