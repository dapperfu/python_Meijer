package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11225r3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85831a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f85832b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85833c;

    CallableC11225r3(BinderC11281z3 binderC11281z3, B6 b62, Bundle bundle) {
        this.f85831a = b62;
        this.f85832b = bundle;
        Objects.requireNonNull(binderC11281z3);
        this.f85833c = binderC11281z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11281z3 binderC11281z3 = this.f85833c;
        binderC11281z3.A9().C();
        return binderC11281z3.A9().o0(this.f85831a, this.f85832b);
    }
}
