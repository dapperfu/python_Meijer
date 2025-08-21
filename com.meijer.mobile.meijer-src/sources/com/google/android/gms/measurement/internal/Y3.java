package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class Y3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f86158a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86159b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86160c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86161d;

    Y3(C11393x4 c11393x4, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f86158a = atomicReference;
        this.f86159b = str2;
        this.f86160c = str3;
        Objects.requireNonNull(c11393x4);
        this.f86161d = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f86161d.f85708a.H().c0(this.f86158a, null, this.f86159b, this.f86160c);
    }
}
