package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class J00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f68587a;

    /* renamed from: b, reason: collision with root package name */
    private final ZO f68588b;

    J00(Xj0 xj0, ZO zo2) {
        this.f68587a = xj0;
        this.f68588b = zo2;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 23;
    }

    final /* synthetic */ K00 a() throws Exception {
        ZO zo2 = this.f68588b;
        String strD = zo2.d();
        boolean zS = zo2.s();
        boolean zL = Nc.v.w().l();
        ZO zo3 = this.f68588b;
        return new K00(strD, zS, zL, zo3.q(), zo3.t());
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f68587a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.I00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68369a.a();
            }
        });
    }
}
