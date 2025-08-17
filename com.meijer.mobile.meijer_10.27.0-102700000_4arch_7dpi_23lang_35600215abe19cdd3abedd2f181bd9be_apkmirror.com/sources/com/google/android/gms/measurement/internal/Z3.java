package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class Z3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85332a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85333b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85334c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f85335d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85336e;

    Z3(C11268x4 c11268x4, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f85332a = atomicReference;
        this.f85333b = str2;
        this.f85334c = str3;
        this.f85335d = z10;
        Objects.requireNonNull(c11268x4);
        this.f85336e = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85336e.f84868a.H().e0(this.f85332a, null, this.f85333b, this.f85334c, this.f85335d);
    }
}
