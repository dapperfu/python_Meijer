package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.b3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11230b3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86199a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86200b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86201c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f86202d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86203e;

    RunnableC11230b3(BinderC11406z3 binderC11406z3, String str, String str2, String str3, long j10) {
        this.f86199a = str;
        this.f86200b = str2;
        this.f86201c = str3;
        this.f86202d = j10;
        Objects.requireNonNull(binderC11406z3);
        this.f86203e = binderC11406z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f86199a;
        if (str == null) {
            BinderC11406z3 binderC11406z3 = this.f86203e;
            binderC11406z3.A9().r0(this.f86200b, null);
        } else {
            E4 e42 = new E4(this.f86201c, str, this.f86202d);
            BinderC11406z3 binderC11406z32 = this.f86203e;
            binderC11406z32.A9().r0(this.f86200b, e42);
        }
    }
}
