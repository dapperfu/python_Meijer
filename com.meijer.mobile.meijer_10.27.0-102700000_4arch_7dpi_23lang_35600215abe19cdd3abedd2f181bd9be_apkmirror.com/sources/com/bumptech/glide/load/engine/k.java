package com.bumptech.glide.load.engine;

import a7.ExecutorServiceC5584a;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import m7.InterfaceC15573h;
import p7.C16268e;
import q7.C16480a;

/* loaded from: classes4.dex */
class k<R> implements h.b<R>, C16480a.f {

    /* renamed from: z, reason: collision with root package name */
    private static final c f63928z = new c();

    /* renamed from: a, reason: collision with root package name */
    final e f63929a;

    /* renamed from: b, reason: collision with root package name */
    private final q7.c f63930b;

    /* renamed from: c, reason: collision with root package name */
    private final o.a f63931c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.f<k<?>> f63932d;

    /* renamed from: e, reason: collision with root package name */
    private final c f63933e;

    /* renamed from: f, reason: collision with root package name */
    private final l f63934f;

    /* renamed from: g, reason: collision with root package name */
    private final ExecutorServiceC5584a f63935g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorServiceC5584a f63936h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorServiceC5584a f63937i;

    /* renamed from: j, reason: collision with root package name */
    private final ExecutorServiceC5584a f63938j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f63939k;

    /* renamed from: l, reason: collision with root package name */
    private V6.e f63940l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f63941m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f63942n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f63943o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f63944p;

    /* renamed from: q, reason: collision with root package name */
    private X6.c<?> f63945q;

    /* renamed from: r, reason: collision with root package name */
    V6.a f63946r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f63947s;

    /* renamed from: t, reason: collision with root package name */
    GlideException f63948t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f63949u;

    /* renamed from: v, reason: collision with root package name */
    o<?> f63950v;

    /* renamed from: w, reason: collision with root package name */
    private h<R> f63951w;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f63952x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f63953y;

    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC15573h f63954a;

        a(InterfaceC15573h interfaceC15573h) {
            this.f63954a = interfaceC15573h;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f63954a.g()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f63929a.e(this.f63954a)) {
                            k.this.f(this.f63954a);
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
        private final InterfaceC15573h f63956a;

        b(InterfaceC15573h interfaceC15573h) {
            this.f63956a = interfaceC15573h;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f63956a.g()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f63929a.e(this.f63956a)) {
                            k.this.f63950v.b();
                            k.this.g(this.f63956a);
                            k.this.r(this.f63956a);
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
        public <R> o<R> a(X6.c<R> cVar, boolean z10, V6.e eVar, o.a aVar) {
            return new o<>(cVar, z10, true, eVar, aVar);
        }

        c() {
        }
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC15573h f63958a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f63959b;

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f63958a.equals(((d) obj).f63958a);
            }
            return false;
        }

        public int hashCode() {
            return this.f63958a.hashCode();
        }

        d(InterfaceC15573h interfaceC15573h, Executor executor) {
            this.f63958a = interfaceC15573h;
            this.f63959b = executor;
        }
    }

    static final class e implements Iterable<d> {

        /* renamed from: a, reason: collision with root package name */
        private final List<d> f63960a;

        e() {
            this(new ArrayList(2));
        }

        e(List<d> list) {
            this.f63960a = list;
        }

        private static d h(InterfaceC15573h interfaceC15573h) {
            return new d(interfaceC15573h, C16268e.a());
        }

        void a(InterfaceC15573h interfaceC15573h, Executor executor) {
            this.f63960a.add(new d(interfaceC15573h, executor));
        }

        void clear() {
            this.f63960a.clear();
        }

        boolean e(InterfaceC15573h interfaceC15573h) {
            return this.f63960a.contains(h(interfaceC15573h));
        }

        e f() {
            return new e(new ArrayList(this.f63960a));
        }

        boolean isEmpty() {
            return this.f63960a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f63960a.iterator();
        }

        void k(InterfaceC15573h interfaceC15573h) {
            this.f63960a.remove(h(interfaceC15573h));
        }

        int size() {
            return this.f63960a.size();
        }
    }

    k(ExecutorServiceC5584a executorServiceC5584a, ExecutorServiceC5584a executorServiceC5584a2, ExecutorServiceC5584a executorServiceC5584a3, ExecutorServiceC5584a executorServiceC5584a4, l lVar, o.a aVar, o2.f<k<?>> fVar) {
        this(executorServiceC5584a, executorServiceC5584a2, executorServiceC5584a3, executorServiceC5584a4, lVar, aVar, fVar, f63928z);
    }

    private synchronized void q() {
        if (this.f63940l == null) {
            throw new IllegalArgumentException();
        }
        this.f63929a.clear();
        this.f63940l = null;
        this.f63950v = null;
        this.f63945q = null;
        this.f63949u = false;
        this.f63952x = false;
        this.f63947s = false;
        this.f63953y = false;
        this.f63951w.M(false);
        this.f63951w = null;
        this.f63948t = null;
        this.f63946r = null;
        this.f63932d.a(this);
    }

    synchronized void a(InterfaceC15573h interfaceC15573h, Executor executor) {
        try {
            this.f63930b.c();
            this.f63929a.a(interfaceC15573h, executor);
            if (this.f63947s) {
                k(1);
                executor.execute(new b(interfaceC15573h));
            } else if (this.f63949u) {
                k(1);
                executor.execute(new a(interfaceC15573h));
            } else {
                p7.k.a(!this.f63952x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void b(X6.c<R> cVar, V6.a aVar, boolean z10) {
        synchronized (this) {
            this.f63945q = cVar;
            this.f63946r = aVar;
            this.f63953y = z10;
        }
        o();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void c(GlideException glideException) {
        synchronized (this) {
            this.f63948t = glideException;
        }
        n();
    }

    void i() {
        o<?> oVar;
        synchronized (this) {
            try {
                this.f63930b.c();
                p7.k.a(m(), "Not yet complete!");
                int iDecrementAndGet = this.f63939k.decrementAndGet();
                p7.k.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    oVar = this.f63950v;
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
        p7.k.a(m(), "Not yet complete!");
        if (this.f63939k.getAndAdd(i10) == 0 && (oVar = this.f63950v) != null) {
            oVar.b();
        }
    }

    synchronized k<R> l(V6.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f63940l = eVar;
        this.f63941m = z10;
        this.f63942n = z11;
        this.f63943o = z12;
        this.f63944p = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f63930b.c();
                if (this.f63952x) {
                    q();
                    return;
                }
                if (this.f63929a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f63949u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f63949u = true;
                V6.e eVar = this.f63940l;
                e eVarF = this.f63929a.f();
                k(eVarF.size() + 1);
                this.f63934f.b(this, eVar, null);
                Iterator<d> it = eVarF.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f63959b.execute(new a(next.f63958a));
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
                this.f63930b.c();
                if (this.f63952x) {
                    this.f63945q.a();
                    q();
                    return;
                }
                if (this.f63929a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f63947s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f63950v = this.f63933e.a(this.f63945q, this.f63941m, this.f63940l, this.f63931c);
                this.f63947s = true;
                e eVarF = this.f63929a.f();
                k(eVarF.size() + 1);
                this.f63934f.b(this, this.f63940l, this.f63950v);
                Iterator<d> it = eVarF.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f63959b.execute(new b(next.f63958a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    synchronized void r(InterfaceC15573h interfaceC15573h) {
        try {
            this.f63930b.c();
            this.f63929a.k(interfaceC15573h);
            if (this.f63929a.isEmpty()) {
                h();
                if (this.f63947s || this.f63949u) {
                    if (this.f63939k.get() == 0) {
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
            this.f63951w = hVar;
            (hVar.T() ? this.f63935g : j()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    k(ExecutorServiceC5584a executorServiceC5584a, ExecutorServiceC5584a executorServiceC5584a2, ExecutorServiceC5584a executorServiceC5584a3, ExecutorServiceC5584a executorServiceC5584a4, l lVar, o.a aVar, o2.f<k<?>> fVar, c cVar) {
        this.f63929a = new e();
        this.f63930b = q7.c.a();
        this.f63939k = new AtomicInteger();
        this.f63935g = executorServiceC5584a;
        this.f63936h = executorServiceC5584a2;
        this.f63937i = executorServiceC5584a3;
        this.f63938j = executorServiceC5584a4;
        this.f63934f = lVar;
        this.f63931c = aVar;
        this.f63932d = fVar;
        this.f63933e = cVar;
    }

    private ExecutorServiceC5584a j() {
        return this.f63942n ? this.f63937i : this.f63943o ? this.f63938j : this.f63936h;
    }

    private boolean m() {
        return this.f63949u || this.f63947s || this.f63952x;
    }

    @Override // q7.C16480a.f
    public q7.c e() {
        return this.f63930b;
    }

    void f(InterfaceC15573h interfaceC15573h) {
        try {
            interfaceC15573h.c(this.f63948t);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void g(InterfaceC15573h interfaceC15573h) {
        try {
            interfaceC15573h.b(this.f63950v, this.f63946r, this.f63953y);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    boolean p() {
        return this.f63944p;
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void d(h<?> hVar) {
        j().execute(hVar);
    }

    void h() {
        if (m()) {
            return;
        }
        this.f63952x = true;
        this.f63951w.m();
        this.f63934f.c(this, this.f63940l);
    }
}
