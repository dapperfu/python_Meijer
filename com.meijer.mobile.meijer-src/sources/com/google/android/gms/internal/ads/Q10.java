package com.google.android.gms.internal.ads;

import Rc.C5185e;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class Q10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f70321a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f70322b;

    Q10(Xj0 xj0, Context context) {
        this.f70321a = xj0;
        this.f70322b = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 37;
    }

    final /* synthetic */ P10 a() throws Exception {
        return new P10(C5185e.b(this.f70322b, (String) Oc.A.c().a(C8784lf.f77054X5)));
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f70321a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.O10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f69829a.a();
            }
        });
    }
}
