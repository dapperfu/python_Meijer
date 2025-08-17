package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7475aZ implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final C9459t40 f72444a;

    C7475aZ(C9459t40 c9459t40) {
        this.f72444a = c9459t40;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        C9459t40 c9459t40 = this.f72444a;
        if (c9459t40 == null) {
            return Mj0.h(new ZY(null));
        }
        String strA = c9459t40.a();
        return com.google.android.gms.common.util.r.a(strA) ? Mj0.h(new ZY(null)) : Mj0.h(new ZY(strA));
    }
}
