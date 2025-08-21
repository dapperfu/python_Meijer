package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11323n3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f86558a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86559b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86560c;

    RunnableC11323n3(BinderC11406z3 binderC11406z3, G g10, String str) {
        this.f86558a = g10;
        this.f86559b = str;
        Objects.requireNonNull(binderC11406z3);
        this.f86560c = binderC11406z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11406z3 binderC11406z3 = this.f86560c;
        binderC11406z3.A9().C();
        binderC11406z3.A9().g(this.f86558a, this.f86559b);
    }
}
