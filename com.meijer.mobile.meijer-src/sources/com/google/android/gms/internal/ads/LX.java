package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class LX implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f69219a;

    /* renamed from: b, reason: collision with root package name */
    private final C9695u60 f69220b;

    LX(com.google.android.gms.common.util.f fVar, C9695u60 c9695u60) {
        this.f69219a = fVar;
        this.f69220b = c9695u60;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.h(new MX(this.f69220b, this.f69219a.a()));
    }
}
