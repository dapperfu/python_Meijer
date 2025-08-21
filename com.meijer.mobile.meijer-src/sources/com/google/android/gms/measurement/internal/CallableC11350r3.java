package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11350r3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86671a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f86672b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86673c;

    CallableC11350r3(BinderC11406z3 binderC11406z3, B6 b62, Bundle bundle) {
        this.f86671a = b62;
        this.f86672b = bundle;
        Objects.requireNonNull(binderC11406z3);
        this.f86673c = binderC11406z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11406z3 binderC11406z3 = this.f86673c;
        binderC11406z3.A9().C();
        return binderC11406z3.A9().o0(this.f86671a, this.f86672b);
    }
}
