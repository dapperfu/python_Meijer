package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.fz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC8184fz implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f75047a;

    public /* synthetic */ RunnableC8184fz(AtomicReference atomicReference) {
        this.f75047a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8398hz.q(this.f75047a);
    }
}
