package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Q2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f85177a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ T2 f85178b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f85178b.f84868a.a().m().b(this.f85177a, th2);
    }

    public Q2(T2 t22, String str) {
        Objects.requireNonNull(t22);
        this.f85178b = t22;
        com.google.android.gms.common.internal.r.l(str);
        this.f85177a = str;
    }
}
