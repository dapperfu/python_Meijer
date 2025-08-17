package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.fz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC8059fz implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f74207a;

    public /* synthetic */ RunnableC8059fz(AtomicReference atomicReference) {
        this.f74207a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8273hz.q(this.f74207a);
    }
}
