package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11154h4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11270y f85599a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85600b;

    RunnableC11154h4(C11268x4 c11268x4, C11270y c11270y) {
        this.f85599a = c11270y;
        Objects.requireNonNull(c11268x4);
        this.f85600b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C11268x4 c11268x4 = this.f85600b;
        X2 x22 = c11268x4.f84868a;
        E2 e2V = x22.v();
        X2 x23 = e2V.f84868a;
        e2V.f();
        C11270y c11270yS = e2V.s();
        C11270y c11270y = this.f85599a;
        if (!E3.u(c11270y.b(), c11270yS.b())) {
            x22.a().s().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c11270y.b()));
            return;
        }
        SharedPreferences.Editor editorEdit = e2V.n().edit();
        editorEdit.putString("dma_consent_settings", c11270y.e());
        editorEdit.apply();
        x22.a().u().b("Setting DMA consent(FE)", c11270y);
        X2 x24 = c11268x4.f84868a;
        if (x24.H().B()) {
            x24.H().Y();
        } else {
            x24.H().W(false);
        }
    }
}
