package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7600aZ implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final C9584t40 f73284a;

    C7600aZ(C9584t40 c9584t40) {
        this.f73284a = c9584t40;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        C9584t40 c9584t40 = this.f73284a;
        if (c9584t40 == null) {
            return Mj0.h(new ZY(null));
        }
        String strA = c9584t40.a();
        return com.google.android.gms.common.util.r.a(strA) ? Mj0.h(new ZY(null)) : Mj0.h(new ZY(strA));
    }
}
