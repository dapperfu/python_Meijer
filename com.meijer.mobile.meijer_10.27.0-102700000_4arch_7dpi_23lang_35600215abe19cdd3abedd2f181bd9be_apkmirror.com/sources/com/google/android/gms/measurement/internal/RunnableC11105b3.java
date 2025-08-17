package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.b3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11105b3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85359a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85360b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85361c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f85362d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85363e;

    RunnableC11105b3(BinderC11281z3 binderC11281z3, String str, String str2, String str3, long j10) {
        this.f85359a = str;
        this.f85360b = str2;
        this.f85361c = str3;
        this.f85362d = j10;
        Objects.requireNonNull(binderC11281z3);
        this.f85363e = binderC11281z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f85359a;
        if (str == null) {
            BinderC11281z3 binderC11281z3 = this.f85363e;
            binderC11281z3.A9().r0(this.f85360b, null);
        } else {
            E4 e42 = new E4(this.f85361c, str, this.f85362d);
            BinderC11281z3 binderC11281z32 = this.f85363e;
            binderC11281z32.A9().r0(this.f85360b, e42);
        }
    }
}
