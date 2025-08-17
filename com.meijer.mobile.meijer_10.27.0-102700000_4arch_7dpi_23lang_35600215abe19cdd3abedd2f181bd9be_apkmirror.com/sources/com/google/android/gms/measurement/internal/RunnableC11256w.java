package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11256w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3 f85932a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC11263x f85933b;

    RunnableC11256w(AbstractC11263x abstractC11263x, C3 c32) {
        this.f85932a = c32;
        Objects.requireNonNull(abstractC11263x);
        this.f85933b = abstractC11263x;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C3 c32 = this.f85932a;
        c32.c();
        if (C11133f.a()) {
            c32.b().r(this);
            return;
        }
        AbstractC11263x abstractC11263x = this.f85933b;
        boolean zC = abstractC11263x.c();
        abstractC11263x.e(0L);
        if (zC) {
            abstractC11263x.a();
        }
    }
}
