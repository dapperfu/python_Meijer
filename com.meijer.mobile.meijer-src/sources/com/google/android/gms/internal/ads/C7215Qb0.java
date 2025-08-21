package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Qb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7215Qb0 {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f70428a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f70429b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f70430c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private AbstractAsyncTaskC7181Pb0 f70431d = null;

    public final void a(AbstractAsyncTaskC7181Pb0 abstractAsyncTaskC7181Pb0) {
        this.f70431d = null;
        c();
    }

    private final void c() {
        AbstractAsyncTaskC7181Pb0 abstractAsyncTaskC7181Pb0 = (AbstractAsyncTaskC7181Pb0) this.f70430c.poll();
        this.f70431d = abstractAsyncTaskC7181Pb0;
        if (abstractAsyncTaskC7181Pb0 != null) {
            abstractAsyncTaskC7181Pb0.executeOnExecutor(this.f70429b, new Object[0]);
        }
    }

    public C7215Qb0() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f70428a = linkedBlockingQueue;
        this.f70429b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void b(AbstractAsyncTaskC7181Pb0 abstractAsyncTaskC7181Pb0) {
        abstractAsyncTaskC7181Pb0.b(this);
        this.f70430c.add(abstractAsyncTaskC7181Pb0);
        if (this.f70431d == null) {
            c();
        }
    }
}
