package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11193m5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC11221q5 f85692a;

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85692a.f85783c;
        X2 x22 = c11262w5.f84868a;
        Context contextZzaY = x22.zzaY();
        x22.c();
        c11262w5.I(new ComponentName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementService"));
    }

    RunnableC11193m5(ServiceConnectionC11221q5 serviceConnectionC11221q5) {
        Objects.requireNonNull(serviceConnectionC11221q5);
        this.f85692a = serviceConnectionC11221q5;
    }
}
