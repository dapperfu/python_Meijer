package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11262f3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86384a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86385b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86386c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86387d;

    CallableC11262f3(BinderC11406z3 binderC11406z3, String str, String str2, String str3) {
        this.f86384a = str;
        this.f86385b = str2;
        this.f86386c = str3;
        Objects.requireNonNull(binderC11406z3);
        this.f86387d = binderC11406z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11406z3 binderC11406z3 = this.f86387d;
        binderC11406z3.A9().C();
        return binderC11406z3.A9().D0().B0(this.f86384a, this.f86385b, this.f86386c);
    }
}
