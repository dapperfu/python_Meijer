package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11219q3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85777a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f85778b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85779c;

    CallableC11219q3(BinderC11281z3 binderC11281z3, B6 b62, Bundle bundle) {
        this.f85777a = b62;
        this.f85778b = bundle;
        Objects.requireNonNull(binderC11281z3);
        this.f85779c = binderC11281z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11281z3 binderC11281z3 = this.f85779c;
        binderC11281z3.A9().C();
        return binderC11281z3.A9().o0(this.f85777a, this.f85778b);
    }
}
