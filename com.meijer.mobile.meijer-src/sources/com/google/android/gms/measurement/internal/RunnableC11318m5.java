package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11318m5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC11346q5 f86532a;

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86532a.f86623c;
        X2 x22 = c11387w5.f85708a;
        Context contextZzaY = x22.zzaY();
        x22.c();
        c11387w5.I(new ComponentName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementService"));
    }

    RunnableC11318m5(ServiceConnectionC11346q5 serviceConnectionC11346q5) {
        Objects.requireNonNull(serviceConnectionC11346q5);
        this.f86532a = serviceConnectionC11346q5;
    }
}
