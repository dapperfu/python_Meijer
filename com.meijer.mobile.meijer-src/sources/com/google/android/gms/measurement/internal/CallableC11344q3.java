package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11344q3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86617a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f86618b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86619c;

    CallableC11344q3(BinderC11406z3 binderC11406z3, B6 b62, Bundle bundle) {
        this.f86617a = b62;
        this.f86618b = bundle;
        Objects.requireNonNull(binderC11406z3);
        this.f86619c = binderC11406z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11406z3 binderC11406z3 = this.f86619c;
        binderC11406z3.A9().C();
        return binderC11406z3.A9().o0(this.f86617a, this.f86618b);
    }
}
