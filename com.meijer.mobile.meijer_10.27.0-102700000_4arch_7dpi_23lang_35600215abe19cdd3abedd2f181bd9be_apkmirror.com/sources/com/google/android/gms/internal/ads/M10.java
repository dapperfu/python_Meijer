package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class M10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f68484a;

    M10(R40 r40) {
        this.f68484a = r40 != null;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.h(new K10(this.f68484a, null));
    }
}
