package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11171j5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentName f85646a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC11221q5 f85647b;

    RunnableC11171j5(ServiceConnectionC11221q5 serviceConnectionC11221q5, ComponentName componentName) {
        this.f85646a = componentName;
        Objects.requireNonNull(serviceConnectionC11221q5);
        this.f85647b = serviceConnectionC11221q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85647b.f85783c.I(this.f85646a);
    }
}
