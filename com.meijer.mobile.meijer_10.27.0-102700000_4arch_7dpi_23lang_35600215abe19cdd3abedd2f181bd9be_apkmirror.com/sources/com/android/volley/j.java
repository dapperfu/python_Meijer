package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f62927a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<i<?>> f62928b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<i<?>> f62929c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<i<?>> f62930d;

    /* renamed from: e, reason: collision with root package name */
    private final com.android.volley.a f62931e;

    /* renamed from: f, reason: collision with root package name */
    private final f f62932f;

    /* renamed from: g, reason: collision with root package name */
    private final l f62933g;

    /* renamed from: h, reason: collision with root package name */
    private final g[] f62934h;

    /* renamed from: i, reason: collision with root package name */
    private com.android.volley.b f62935i;

    /* renamed from: j, reason: collision with root package name */
    private final List<b> f62936j;

    /* renamed from: k, reason: collision with root package name */
    private final List<a> f62937k;

    public interface a {
        void a(i<?> iVar, int i10);
    }

    @Deprecated
    public interface b<T> {
        void a(i<T> iVar);
    }

    public j(com.android.volley.a aVar, f fVar, int i10, l lVar) {
        this.f62927a = new AtomicInteger();
        this.f62928b = new HashSet();
        this.f62929c = new PriorityBlockingQueue<>();
        this.f62930d = new PriorityBlockingQueue<>();
        this.f62936j = new ArrayList();
        this.f62937k = new ArrayList();
        this.f62931e = aVar;
        this.f62932f = fVar;
        this.f62934h = new g[i10];
        this.f62933g = lVar;
    }

    <T> void c(i<T> iVar) {
        synchronized (this.f62928b) {
            this.f62928b.remove(iVar);
        }
        synchronized (this.f62936j) {
            try {
                Iterator<b> it = this.f62936j.iterator();
                while (it.hasNext()) {
                    it.next().a(iVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(iVar, 5);
    }

    public int d() {
        return this.f62927a.incrementAndGet();
    }

    void e(i<?> iVar, int i10) {
        synchronized (this.f62937k) {
            try {
                Iterator<a> it = this.f62937k.iterator();
                while (it.hasNext()) {
                    it.next().a(iVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    <T> void f(i<T> iVar) {
        this.f62930d.add(iVar);
    }

    public void h() {
        com.android.volley.b bVar = this.f62935i;
        if (bVar != null) {
            bVar.e();
        }
        for (g gVar : this.f62934h) {
            if (gVar != null) {
                gVar.g();
            }
        }
    }

    public <T> i<T> a(i<T> iVar) {
        iVar.setRequestQueue(this);
        synchronized (this.f62928b) {
            this.f62928b.add(iVar);
        }
        iVar.setSequence(d());
        iVar.addMarker("add-to-queue");
        e(iVar, 0);
        b(iVar);
        return iVar;
    }

    <T> void b(i<T> iVar) {
        if (!iVar.shouldCache()) {
            f(iVar);
        } else {
            this.f62929c.add(iVar);
        }
    }

    public void g() {
        h();
        com.android.volley.b bVar = new com.android.volley.b(this.f62929c, this.f62930d, this.f62931e, this.f62933g);
        this.f62935i = bVar;
        bVar.start();
        for (int i10 = 0; i10 < this.f62934h.length; i10++) {
            g gVar = new g(this.f62930d, this.f62932f, this.f62931e, this.f62933g);
            this.f62934h[i10] = gVar;
            gVar.start();
        }
    }

    public j(com.android.volley.a aVar, f fVar, int i10) {
        this(aVar, fVar, i10, new d(new Handler(Looper.getMainLooper())));
    }

    public j(com.android.volley.a aVar, f fVar) {
        this(aVar, fVar, 4);
    }
}
