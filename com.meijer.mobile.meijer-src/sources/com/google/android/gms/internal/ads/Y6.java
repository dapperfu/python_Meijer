package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class Y6 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f72322a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f72323b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue f72324c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue f72325d;

    /* renamed from: e, reason: collision with root package name */
    private final H6 f72326e;

    /* renamed from: f, reason: collision with root package name */
    private final Q6 f72327f;

    /* renamed from: g, reason: collision with root package name */
    private final R6[] f72328g;

    /* renamed from: h, reason: collision with root package name */
    private J6 f72329h;

    /* renamed from: i, reason: collision with root package name */
    private final List f72330i;

    /* renamed from: j, reason: collision with root package name */
    private final List f72331j;

    /* renamed from: k, reason: collision with root package name */
    private final O6 f72332k;

    public Y6(H6 h62, Q6 q62, int i10) {
        O6 o62 = new O6(new Handler(Looper.getMainLooper()));
        this.f72322a = new AtomicInteger();
        this.f72323b = new HashSet();
        this.f72324c = new PriorityBlockingQueue();
        this.f72325d = new PriorityBlockingQueue();
        this.f72330i = new ArrayList();
        this.f72331j = new ArrayList();
        this.f72326e = h62;
        this.f72327f = q62;
        this.f72328g = new R6[4];
        this.f72332k = o62;
    }

    final void b(V6 v62) {
        synchronized (this.f72323b) {
            this.f72323b.remove(v62);
        }
        synchronized (this.f72330i) {
            try {
                Iterator it = this.f72330i.iterator();
                while (it.hasNext()) {
                    ((X6) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c(v62, 5);
    }

    final void c(V6 v62, int i10) {
        synchronized (this.f72331j) {
            try {
                Iterator it = this.f72331j.iterator();
                while (it.hasNext()) {
                    ((W6) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        J6 j62 = this.f72329h;
        if (j62 != null) {
            j62.b();
        }
        R6[] r6Arr = this.f72328g;
        for (int i10 = 0; i10 < 4; i10++) {
            R6 r62 = r6Arr[i10];
            if (r62 != null) {
                r62.a();
            }
        }
        J6 j63 = new J6(this.f72324c, this.f72325d, this.f72326e, this.f72332k);
        this.f72329h = j63;
        j63.start();
        for (int i11 = 0; i11 < 4; i11++) {
            R6 r63 = new R6(this.f72325d, this.f72327f, this.f72326e, this.f72332k);
            this.f72328g[i11] = r63;
            r63.start();
        }
    }

    public final V6 a(V6 v62) {
        v62.l(this);
        synchronized (this.f72323b) {
            this.f72323b.add(v62);
        }
        v62.m(this.f72322a.incrementAndGet());
        v62.z("add-to-queue");
        c(v62, 0);
        this.f72324c.add(v62);
        return v62;
    }
}
