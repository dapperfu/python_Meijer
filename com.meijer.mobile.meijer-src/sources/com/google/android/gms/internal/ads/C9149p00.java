package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.p00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9149p00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f78309a;

    public C9149p00(Xj0 xj0) {
        this.f78309a = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f78309a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.o00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C9256q00(Nc.v.w().b(), Nc.v.w().m());
            }
        });
    }
}
