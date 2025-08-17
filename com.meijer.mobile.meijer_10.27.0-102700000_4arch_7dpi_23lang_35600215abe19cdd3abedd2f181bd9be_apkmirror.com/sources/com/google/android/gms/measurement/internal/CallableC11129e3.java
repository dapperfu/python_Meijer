package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11129e3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85529a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85530b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85531c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85532d;

    CallableC11129e3(BinderC11281z3 binderC11281z3, String str, String str2, String str3) {
        this.f85529a = str;
        this.f85530b = str2;
        this.f85531c = str3;
        Objects.requireNonNull(binderC11281z3);
        this.f85532d = binderC11281z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11281z3 binderC11281z3 = this.f85532d;
        binderC11281z3.A9().C();
        return binderC11281z3.A9().D0().B0(this.f85529a, this.f85530b, this.f85531c);
    }
}
