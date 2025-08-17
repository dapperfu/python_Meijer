package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.hZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8222hZ implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f74744a;

    C8222hZ(Xj0 xj0) {
        this.f74744a = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f74744a.i0(new Callable(this) { // from class: com.google.android.gms.internal.ads.gZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C8329iZ(Lc.v.c().a() - Lc.v.s().j().zzg().a());
            }
        });
    }
}
