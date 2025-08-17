package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.i10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8279i10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f74866a;

    C8279i10(Bundle bundle) {
        this.f74866a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.h(new C8384j10(this.f74866a));
    }
}
