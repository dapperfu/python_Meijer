package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import j7.C14961c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l7.InterfaceC15471b;
import l7.InterfaceC15472c;
import l7.p;
import l7.q;
import l7.s;
import o7.C16082g;
import o7.InterfaceC16079d;
import o7.InterfaceC16081f;

/* loaded from: classes4.dex */
public class k implements ComponentCallbacks2, l7.l {

    /* renamed from: m, reason: collision with root package name */
    private static final C16082g f64568m = C16082g.q0(Bitmap.class).P();

    /* renamed from: n, reason: collision with root package name */
    private static final C16082g f64569n = C16082g.q0(C14961c.class).P();

    /* renamed from: o, reason: collision with root package name */
    private static final C16082g f64570o = C16082g.s0(Z6.a.f43637c).Y(g.LOW).i0(true);

    /* renamed from: a, reason: collision with root package name */
    protected final com.bumptech.glide.b f64571a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f64572b;

    /* renamed from: c, reason: collision with root package name */
    final l7.j f64573c;

    /* renamed from: d, reason: collision with root package name */
    private final q f64574d;

    /* renamed from: e, reason: collision with root package name */
    private final p f64575e;

    /* renamed from: f, reason: collision with root package name */
    private final s f64576f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f64577g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC15471b f64578h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC16081f<Object>> f64579i;

    /* renamed from: j, reason: collision with root package name */
    private C16082g f64580j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f64581k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f64582l;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f64573c.b(kVar);
        }
    }

    private class b implements InterfaceC15471b.a {

        /* renamed from: a, reason: collision with root package name */
        private final q f64584a;

        b(q qVar) {
            this.f64584a = qVar;
        }

        @Override // l7.InterfaceC15471b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (k.this) {
                    this.f64584a.e();
                }
            }
        }
    }

    public k(com.bumptech.glide.b bVar, l7.j jVar, p pVar, Context context) {
        this(bVar, jVar, pVar, new q(), bVar.g(), context);
    }

    private synchronized void e() {
        try {
            Iterator<com.bumptech.glide.request.target.j<?>> it = this.f64576f.b().iterator();
            while (it.hasNext()) {
                d(it.next());
            }
            this.f64576f.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized C16082g g() {
        return this.f64580j;
    }

    public synchronized void j() {
        this.f64574d.c();
    }

    public synchronized void k() {
        j();
        Iterator<k> it = this.f64575e.a().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    public synchronized void l() {
        this.f64574d.d();
    }

    public synchronized void m() {
        this.f64574d.f();
    }

    protected synchronized void n(C16082g c16082g) {
        this.f64580j = c16082g.clone().b();
    }

    synchronized void o(com.bumptech.glide.request.target.j<?> jVar, InterfaceC16079d interfaceC16079d) {
        this.f64576f.c(jVar);
        this.f64574d.g(interfaceC16079d);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // l7.l
    public synchronized void onDestroy() {
        this.f64576f.onDestroy();
        e();
        this.f64574d.b();
        this.f64573c.a(this);
        this.f64573c.a(this.f64578h);
        r7.l.v(this.f64577g);
        this.f64571a.s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // l7.l
    public synchronized void onStart() {
        m();
        this.f64576f.onStart();
    }

    @Override // l7.l
    public synchronized void onStop() {
        try {
            this.f64576f.onStop();
            if (this.f64582l) {
                e();
            } else {
                l();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean p(com.bumptech.glide.request.target.j<?> jVar) {
        InterfaceC16079d request = jVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f64574d.a(request)) {
            return false;
        }
        this.f64576f.d(jVar);
        jVar.setRequest(null);
        return true;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f64574d + ", treeNode=" + this.f64575e + "}";
    }

    public <ResourceType> j<ResourceType> a(Class<ResourceType> cls) {
        return new j<>(this.f64571a, this, cls, this.f64572b);
    }

    public j<Bitmap> b() {
        return a(Bitmap.class).a(f64568m);
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

    List<InterfaceC16081f<Object>> f() {
        return this.f64579i;
    }

    <T> l<?, T> h(Class<T> cls) {
        return this.f64571a.i().e(cls);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f64581k) {
            k();
        }
    }

    private void q(com.bumptech.glide.request.target.j<?> jVar) {
        boolean zP = p(jVar);
        InterfaceC16079d request = jVar.getRequest();
        if (!zP && !this.f64571a.p(jVar) && request != null) {
            jVar.setRequest(null);
            request.clear();
        }
    }

    public j<Drawable> i(String str) {
        return c().G0(str);
    }

    k(com.bumptech.glide.b bVar, l7.j jVar, p pVar, q qVar, InterfaceC15472c interfaceC15472c, Context context) {
        this.f64576f = new s();
        a aVar = new a();
        this.f64577g = aVar;
        this.f64571a = bVar;
        this.f64573c = jVar;
        this.f64575e = pVar;
        this.f64574d = qVar;
        this.f64572b = context;
        InterfaceC15471b interfaceC15471bA = interfaceC15472c.a(context.getApplicationContext(), new b(qVar));
        this.f64578h = interfaceC15471bA;
        bVar.o(this);
        if (r7.l.q()) {
            r7.l.u(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(interfaceC15471bA);
        this.f64579i = new CopyOnWriteArrayList<>(bVar.i().c());
        n(bVar.i().d());
    }
}
