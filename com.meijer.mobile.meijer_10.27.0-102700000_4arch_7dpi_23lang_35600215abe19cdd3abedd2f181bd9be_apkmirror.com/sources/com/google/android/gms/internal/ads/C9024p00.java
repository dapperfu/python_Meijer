package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.p00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9024p00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f77469a;

    public C9024p00(Xj0 xj0) {
        this.f77469a = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f77469a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.o00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C9131q00(Lc.v.w().b(), Lc.v.w().m());
            }
        });
    }
}
