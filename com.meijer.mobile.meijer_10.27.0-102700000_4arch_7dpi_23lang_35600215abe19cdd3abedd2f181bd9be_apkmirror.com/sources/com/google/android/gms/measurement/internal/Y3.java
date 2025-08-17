package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class Y3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85318a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85319b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85320c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85321d;

    Y3(C11268x4 c11268x4, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f85318a = atomicReference;
        this.f85319b = str2;
        this.f85320c = str3;
        Objects.requireNonNull(c11268x4);
        this.f85321d = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85321d.f84868a.H().c0(this.f85318a, null, this.f85319b, this.f85320c);
    }
}
