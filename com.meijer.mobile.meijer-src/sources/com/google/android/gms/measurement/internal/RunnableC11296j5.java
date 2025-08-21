package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11296j5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentName f86486a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC11346q5 f86487b;

    RunnableC11296j5(ServiceConnectionC11346q5 serviceConnectionC11346q5, ComponentName componentName) {
        this.f86486a = componentName;
        Objects.requireNonNull(serviceConnectionC11346q5);
        this.f86487b = serviceConnectionC11346q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86487b.f86623c.I(this.f86486a);
    }
}
