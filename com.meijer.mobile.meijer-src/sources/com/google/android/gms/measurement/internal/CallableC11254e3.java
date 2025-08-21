package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11254e3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86369a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86370b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86371c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86372d;

    CallableC11254e3(BinderC11406z3 binderC11406z3, String str, String str2, String str3) {
        this.f86369a = str;
        this.f86370b = str2;
        this.f86371c = str3;
        Objects.requireNonNull(binderC11406z3);
        this.f86372d = binderC11406z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11406z3 binderC11406z3 = this.f86372d;
        binderC11406z3.A9().C();
        return binderC11406z3.A9().D0().B0(this.f86369a, this.f86370b, this.f86371c);
    }
}
