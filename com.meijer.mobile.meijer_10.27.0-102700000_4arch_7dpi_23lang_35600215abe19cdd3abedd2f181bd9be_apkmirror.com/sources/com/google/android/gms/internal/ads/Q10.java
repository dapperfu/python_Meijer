package com.google.android.gms.internal.ads;

import Pc.C4564e;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class Q10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f69481a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f69482b;

    Q10(Xj0 xj0, Context context) {
        this.f69481a = xj0;
        this.f69482b = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 37;
    }

    final /* synthetic */ P10 a() throws Exception {
        return new P10(C4564e.b(this.f69482b, (String) Mc.A.c().a(C8659lf.f76214X5)));
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f69481a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.O10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68989a.a();
            }
        });
    }
}
