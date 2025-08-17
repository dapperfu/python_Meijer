package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11145g3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85578a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85579b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85580c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85581d;

    CallableC11145g3(BinderC11281z3 binderC11281z3, String str, String str2, String str3) {
        this.f85578a = str;
        this.f85579b = str2;
        this.f85580c = str3;
        Objects.requireNonNull(binderC11281z3);
        this.f85581d = binderC11281z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11281z3 binderC11281z3 = this.f85581d;
        binderC11281z3.A9().C();
        return binderC11281z3.A9().D0().F0(this.f85578a, this.f85579b, this.f85580c);
    }
}
