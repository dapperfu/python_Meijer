package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class Z10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f71960a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f71961b;

    Z10(Context context, Xj0 xj0) {
        this.f71960a = context;
        this.f71961b = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 59;
    }

    final /* synthetic */ C7427a20 a() throws Exception {
        Context context = this.f71960a;
        return new C7427a20(C7231Ue.b(context), C7231Ue.a(context));
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return ((Boolean) C7914eg.f73915b.e()).booleanValue() ? this.f71961b.i0(new Callable() { // from class: com.google.android.gms.internal.ads.Y10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f71460a.a();
            }
        }) : Mj0.h(new C7427a20(-1, -1));
    }
}
