package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11381w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3 f86772a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC11388x f86773b;

    RunnableC11381w(AbstractC11388x abstractC11388x, C3 c32) {
        this.f86772a = c32;
        Objects.requireNonNull(abstractC11388x);
        this.f86773b = abstractC11388x;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C3 c32 = this.f86772a;
        c32.c();
        if (C11258f.a()) {
            c32.b().r(this);
            return;
        }
        AbstractC11388x abstractC11388x = this.f86773b;
        boolean zC = abstractC11388x.c();
        abstractC11388x.e(0L);
        if (zC) {
            abstractC11388x.a();
        }
    }
}
