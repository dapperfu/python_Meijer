package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11270g3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86418a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86419b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86420c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86421d;

    CallableC11270g3(BinderC11406z3 binderC11406z3, String str, String str2, String str3) {
        this.f86418a = str;
        this.f86419b = str2;
        this.f86420c = str3;
        Objects.requireNonNull(binderC11406z3);
        this.f86421d = binderC11406z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11406z3 binderC11406z3 = this.f86421d;
        binderC11406z3.A9().C();
        return binderC11406z3.A9().D0().F0(this.f86418a, this.f86419b, this.f86420c);
    }
}
