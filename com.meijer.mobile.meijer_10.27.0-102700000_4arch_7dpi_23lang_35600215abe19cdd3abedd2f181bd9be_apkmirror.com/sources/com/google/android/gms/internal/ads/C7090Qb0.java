package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Qb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7090Qb0 {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f69588a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f69589b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f69590c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private AbstractAsyncTaskC7056Pb0 f69591d = null;

    public final void a(AbstractAsyncTaskC7056Pb0 abstractAsyncTaskC7056Pb0) {
        this.f69591d = null;
        c();
    }

    private final void c() {
        AbstractAsyncTaskC7056Pb0 abstractAsyncTaskC7056Pb0 = (AbstractAsyncTaskC7056Pb0) this.f69590c.poll();
        this.f69591d = abstractAsyncTaskC7056Pb0;
        if (abstractAsyncTaskC7056Pb0 != null) {
            abstractAsyncTaskC7056Pb0.executeOnExecutor(this.f69589b, new Object[0]);
        }
    }

    public C7090Qb0() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f69588a = linkedBlockingQueue;
        this.f69589b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void b(AbstractAsyncTaskC7056Pb0 abstractAsyncTaskC7056Pb0) {
        abstractAsyncTaskC7056Pb0.b(this);
        this.f69590c.add(abstractAsyncTaskC7056Pb0);
        if (this.f69591d == null) {
            c();
        }
    }
}
