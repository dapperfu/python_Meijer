package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11153h3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85595a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85596b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85597c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85598d;

    CallableC11153h3(BinderC11281z3 binderC11281z3, String str, String str2, String str3) {
        this.f85595a = str;
        this.f85596b = str2;
        this.f85597c = str3;
        Objects.requireNonNull(binderC11281z3);
        this.f85598d = binderC11281z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11281z3 binderC11281z3 = this.f85598d;
        binderC11281z3.A9().C();
        return binderC11281z3.A9().D0().F0(this.f85595a, this.f85596b, this.f85597c);
    }
}
