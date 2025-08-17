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
    private final AtomicInteger f71482a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f71483b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue f71484c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue f71485d;

    /* renamed from: e, reason: collision with root package name */
    private final H6 f71486e;

    /* renamed from: f, reason: collision with root package name */
    private final Q6 f71487f;

    /* renamed from: g, reason: collision with root package name */
    private final R6[] f71488g;

    /* renamed from: h, reason: collision with root package name */
    private J6 f71489h;

    /* renamed from: i, reason: collision with root package name */
    private final List f71490i;

    /* renamed from: j, reason: collision with root package name */
    private final List f71491j;

    /* renamed from: k, reason: collision with root package name */
    private final O6 f71492k;

    public Y6(H6 h62, Q6 q62, int i10) {
        O6 o62 = new O6(new Handler(Looper.getMainLooper()));
        this.f71482a = new AtomicInteger();
        this.f71483b = new HashSet();
        this.f71484c = new PriorityBlockingQueue();
        this.f71485d = new PriorityBlockingQueue();
        this.f71490i = new ArrayList();
        this.f71491j = new ArrayList();
        this.f71486e = h62;
        this.f71487f = q62;
        this.f71488g = new R6[4];
        this.f71492k = o62;
    }

    final void b(V6 v62) {
        synchronized (this.f71483b) {
            this.f71483b.remove(v62);
        }
        synchronized (this.f71490i) {
            try {
                Iterator it = this.f71490i.iterator();
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
        synchronized (this.f71491j) {
            try {
                Iterator it = this.f71491j.iterator();
                while (it.hasNext()) {
                    ((W6) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        J6 j62 = this.f71489h;
        if (j62 != null) {
            j62.b();
        }
        R6[] r6Arr = this.f71488g;
        for (int i10 = 0; i10 < 4; i10++) {
            R6 r62 = r6Arr[i10];
            if (r62 != null) {
                r62.a();
            }
        }
        J6 j63 = new J6(this.f71484c, this.f71485d, this.f71486e, this.f71492k);
        this.f71489h = j63;
        j63.start();
        for (int i11 = 0; i11 < 4; i11++) {
            R6 r63 = new R6(this.f71485d, this.f71487f, this.f71486e, this.f71492k);
            this.f71488g[i11] = r63;
            r63.start();
        }
    }

    public final V6 a(V6 v62) {
        v62.l(this);
        synchronized (this.f71483b) {
            this.f71483b.add(v62);
        }
        v62.m(this.f71482a.incrementAndGet());
        v62.z("add-to-queue");
        c(v62, 0);
        this.f71484c.add(v62);
        return v62;
    }
}
