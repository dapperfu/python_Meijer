package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11279h4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11395y f86439a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86440b;

    RunnableC11279h4(C11393x4 c11393x4, C11395y c11395y) {
        this.f86439a = c11395y;
        Objects.requireNonNull(c11393x4);
        this.f86440b = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C11393x4 c11393x4 = this.f86440b;
        X2 x22 = c11393x4.f85708a;
        E2 e2V = x22.v();
        X2 x23 = e2V.f85708a;
        e2V.f();
        C11395y c11395yS = e2V.s();
        C11395y c11395y = this.f86439a;
        if (!E3.u(c11395y.b(), c11395yS.b())) {
            x22.a().s().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c11395y.b()));
            return;
        }
        SharedPreferences.Editor editorEdit = e2V.n().edit();
        editorEdit.putString("dma_consent_settings", c11395y.e());
        editorEdit.apply();
        x22.a().u().b("Setting DMA consent(FE)", c11395y);
        X2 x24 = c11393x4.f85708a;
        if (x24.H().B()) {
            x24.H().Y();
        } else {
            x24.H().W(false);
        }
    }
}
