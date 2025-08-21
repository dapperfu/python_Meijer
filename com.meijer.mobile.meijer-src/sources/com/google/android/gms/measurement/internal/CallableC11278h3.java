package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11278h3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86435a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86436b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86437c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86438d;

    CallableC11278h3(BinderC11406z3 binderC11406z3, String str, String str2, String str3) {
        this.f86435a = str;
        this.f86436b = str2;
        this.f86437c = str3;
        Objects.requireNonNull(binderC11406z3);
        this.f86438d = binderC11406z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11406z3 binderC11406z3 = this.f86438d;
        binderC11406z3.A9().C();
        return binderC11406z3.A9().D0().F0(this.f86435a, this.f86436b, this.f86437c);
    }
}
