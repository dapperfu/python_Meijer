package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class Z3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f86172a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86173b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86174c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f86175d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86176e;

    Z3(C11393x4 c11393x4, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f86172a = atomicReference;
        this.f86173b = str2;
        this.f86174c = str3;
        this.f86175d = z10;
        Objects.requireNonNull(c11393x4);
        this.f86176e = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f86176e.f85708a.H().e0(this.f86172a, null, this.f86173b, this.f86174c, this.f86175d);
    }
}
