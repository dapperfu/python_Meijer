package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes6.dex */
public final class T60 {

    /* renamed from: a, reason: collision with root package name */
    private final Deque f71141a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    private final Callable f71142b;

    /* renamed from: c, reason: collision with root package name */
    private final Xj0 f71143c;

    public final synchronized com.google.common.util.concurrent.q a() {
        c(1);
        return (com.google.common.util.concurrent.q) this.f71141a.poll();
    }

    public final synchronized void b(com.google.common.util.concurrent.q qVar) {
        this.f71141a.addFirst(qVar);
    }

    public final synchronized void c(int i10) {
        int size = i10 - this.f71141a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f71141a.add(this.f71143c.k0(this.f71142b));
        }
    }

    public T60(Callable callable, Xj0 xj0) {
        this.f71142b = callable;
        this.f71143c = xj0;
    }
}
