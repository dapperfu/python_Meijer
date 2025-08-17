package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class DX implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f66250a;

    DX(Context context) {
        this.f66250a = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.h(new EX(Z1.b.a(this.f66250a, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
