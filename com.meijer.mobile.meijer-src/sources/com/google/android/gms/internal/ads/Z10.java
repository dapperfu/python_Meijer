package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class Z10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f72800a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f72801b;

    Z10(Context context, Xj0 xj0) {
        this.f72800a = context;
        this.f72801b = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 59;
    }

    final /* synthetic */ C7552a20 a() throws Exception {
        Context context = this.f72800a;
        return new C7552a20(C7356Ue.b(context), C7356Ue.a(context));
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return ((Boolean) C8039eg.f74755b.e()).booleanValue() ? this.f72801b.k0(new Callable() { // from class: com.google.android.gms.internal.ads.Y10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f72300a.a();
            }
        }) : Mj0.h(new C7552a20(-1, -1));
    }
}
