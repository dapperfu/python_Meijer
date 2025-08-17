package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class LX implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f68379a;

    /* renamed from: b, reason: collision with root package name */
    private final C9570u60 f68380b;

    LX(com.google.android.gms.common.util.f fVar, C9570u60 c9570u60) {
        this.f68379a = fVar;
        this.f68380b = c9570u60;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.h(new MX(this.f68380b, this.f68379a.a()));
    }
}
