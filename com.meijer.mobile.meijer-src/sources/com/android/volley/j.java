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
    private final AtomicInteger f63766a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<i<?>> f63767b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<i<?>> f63768c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<i<?>> f63769d;

    /* renamed from: e, reason: collision with root package name */
    private final com.android.volley.a f63770e;

    /* renamed from: f, reason: collision with root package name */
    private final f f63771f;

    /* renamed from: g, reason: collision with root package name */
    private final l f63772g;

    /* renamed from: h, reason: collision with root package name */
    private final g[] f63773h;

    /* renamed from: i, reason: collision with root package name */
    private com.android.volley.b f63774i;

    /* renamed from: j, reason: collision with root package name */
    private final List<b> f63775j;

    /* renamed from: k, reason: collision with root package name */
    private final List<a> f63776k;

    public interface a {
        void a(i<?> iVar, int i10);
    }

    @Deprecated
    public interface b<T> {
        void a(i<T> iVar);
    }

    public j(com.android.volley.a aVar, f fVar, int i10, l lVar) {
        this.f63766a = new AtomicInteger();
        this.f63767b = new HashSet();
        this.f63768c = new PriorityBlockingQueue<>();
        this.f63769d = new PriorityBlockingQueue<>();
        this.f63775j = new ArrayList();
        this.f63776k = new ArrayList();
        this.f63770e = aVar;
        this.f63771f = fVar;
        this.f63773h = new g[i10];
        this.f63772g = lVar;
    }

    <T> void c(i<T> iVar) {
        synchronized (this.f63767b) {
            this.f63767b.remove(iVar);
        }
        synchronized (this.f63775j) {
            try {
                Iterator<b> it = this.f63775j.iterator();
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
        return this.f63766a.incrementAndGet();
    }

    void e(i<?> iVar, int i10) {
        synchronized (this.f63776k) {
            try {
                Iterator<a> it = this.f63776k.iterator();
                while (it.hasNext()) {
                    it.next().a(iVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    <T> void f(i<T> iVar) {
        this.f63769d.add(iVar);
    }

    public void h() {
        com.android.volley.b bVar = this.f63774i;
        if (bVar != null) {
            bVar.e();
        }
        for (g gVar : this.f63773h) {
            if (gVar != null) {
                gVar.g();
            }
        }
    }

    public <T> i<T> a(i<T> iVar) {
        iVar.setRequestQueue(this);
        synchronized (this.f63767b) {
            this.f63767b.add(iVar);
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
            this.f63768c.add(iVar);
        }
    }

    public void g() {
        h();
        com.android.volley.b bVar = new com.android.volley.b(this.f63768c, this.f63769d, this.f63770e, this.f63772g);
        this.f63774i = bVar;
        bVar.start();
        for (int i10 = 0; i10 < this.f63773h.length; i10++) {
            g gVar = new g(this.f63769d, this.f63771f, this.f63770e, this.f63772g);
            this.f63773h[i10] = gVar;
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
