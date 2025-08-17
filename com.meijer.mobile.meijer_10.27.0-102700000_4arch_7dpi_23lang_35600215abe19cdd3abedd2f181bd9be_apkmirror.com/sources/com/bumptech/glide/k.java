package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import h7.C14383c;
import j7.InterfaceC14872b;
import j7.InterfaceC14873c;
import j7.p;
import j7.q;
import j7.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m7.C15572g;
import m7.InterfaceC15569d;
import m7.InterfaceC15571f;

/* loaded from: classes4.dex */
public class k implements ComponentCallbacks2, j7.l {

    /* renamed from: m, reason: collision with root package name */
    private static final C15572g f63728m = C15572g.r0(Bitmap.class).P();

    /* renamed from: n, reason: collision with root package name */
    private static final C15572g f63729n = C15572g.r0(C14383c.class).P();

    /* renamed from: o, reason: collision with root package name */
    private static final C15572g f63730o = C15572g.s0(X6.a.f39159c).Y(g.LOW).i0(true);

    /* renamed from: a, reason: collision with root package name */
    protected final com.bumptech.glide.b f63731a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f63732b;

    /* renamed from: c, reason: collision with root package name */
    final j7.j f63733c;

    /* renamed from: d, reason: collision with root package name */
    private final q f63734d;

    /* renamed from: e, reason: collision with root package name */
    private final p f63735e;

    /* renamed from: f, reason: collision with root package name */
    private final s f63736f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f63737g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC14872b f63738h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC15571f<Object>> f63739i;

    /* renamed from: j, reason: collision with root package name */
    private C15572g f63740j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f63741k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f63742l;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f63733c.b(kVar);
        }
    }

    private class b implements InterfaceC14872b.a {

        /* renamed from: a, reason: collision with root package name */
        private final q f63744a;

        b(q qVar) {
            this.f63744a = qVar;
        }

        @Override // j7.InterfaceC14872b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (k.this) {
                    this.f63744a.e();
                }
            }
        }
    }

    public k(com.bumptech.glide.b bVar, j7.j jVar, p pVar, Context context) {
        this(bVar, jVar, pVar, new q(), bVar.g(), context);
    }

    private synchronized void e() {
        try {
            Iterator<com.bumptech.glide.request.target.j<?>> it = this.f63736f.b().iterator();
            while (it.hasNext()) {
                d(it.next());
            }
            this.f63736f.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized C15572g g() {
        return this.f63740j;
    }

    public synchronized void j() {
        this.f63734d.c();
    }

    public synchronized void k() {
        j();
        Iterator<k> it = this.f63735e.a().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    public synchronized void l() {
        this.f63734d.d();
    }

    public synchronized void m() {
        this.f63734d.f();
    }

    protected synchronized void n(C15572g c15572g) {
        this.f63740j = c15572g.clone().b();
    }

    synchronized void o(com.bumptech.glide.request.target.j<?> jVar, InterfaceC15569d interfaceC15569d) {
        this.f63736f.c(jVar);
        this.f63734d.g(interfaceC15569d);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // j7.l
    public synchronized void onDestroy() {
        this.f63736f.onDestroy();
        e();
        this.f63734d.b();
        this.f63733c.a(this);
        this.f63733c.a(this.f63738h);
        p7.l.v(this.f63737g);
        this.f63731a.s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // j7.l
    public synchronized void onStart() {
        m();
        this.f63736f.onStart();
    }

    @Override // j7.l
    public synchronized void onStop() {
        try {
            this.f63736f.onStop();
            if (this.f63742l) {
                e();
            } else {
                l();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean p(com.bumptech.glide.request.target.j<?> jVar) {
        InterfaceC15569d request = jVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f63734d.a(request)) {
            return false;
        }
        this.f63736f.d(jVar);
        jVar.setRequest(null);
        return true;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f63734d + ", treeNode=" + this.f63735e + "}";
    }

    public <ResourceType> j<ResourceType> a(Class<ResourceType> cls) {
        return new j<>(this.f63731a, this, cls, this.f63732b);
    }

    public j<Bitmap> b() {
        return a(Bitmap.class).a(f63728m);
    }

    public j<Drawable> c() {
        return a(Drawable.class);
    }

    public void d(com.bumptech.glide.request.target.j<?> jVar) {
        if (jVar == null) {
            return;
        }
        q(jVar);
    }

    List<InterfaceC15571f<Object>> f() {
        return this.f63739i;
    }

    <T> l<?, T> h(Class<T> cls) {
        return this.f63731a.i().e(cls);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f63741k) {
            k();
        }
    }

    private void q(com.bumptech.glide.request.target.j<?> jVar) {
        boolean zP = p(jVar);
        InterfaceC15569d request = jVar.getRequest();
        if (!zP && !this.f63731a.p(jVar) && request != null) {
            jVar.setRequest(null);
            request.clear();
        }
    }

    public j<Drawable> i(String str) {
        return c().G0(str);
    }

    k(com.bumptech.glide.b bVar, j7.j jVar, p pVar, q qVar, InterfaceC14873c interfaceC14873c, Context context) {
        this.f63736f = new s();
        a aVar = new a();
        this.f63737g = aVar;
        this.f63731a = bVar;
        this.f63733c = jVar;
        this.f63735e = pVar;
        this.f63734d = qVar;
        this.f63732b = context;
        InterfaceC14872b interfaceC14872bA = interfaceC14873c.a(context.getApplicationContext(), new b(qVar));
        this.f63738h = interfaceC14872bA;
        bVar.o(this);
        if (p7.l.q()) {
            p7.l.u(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(interfaceC14872bA);
        this.f63739i = new CopyOnWriteArrayList<>(bVar.i().c());
        n(bVar.i().d());
    }
}
