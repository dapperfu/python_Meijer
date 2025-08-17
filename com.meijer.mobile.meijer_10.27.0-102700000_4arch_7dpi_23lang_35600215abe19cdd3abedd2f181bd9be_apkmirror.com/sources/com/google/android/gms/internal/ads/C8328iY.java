package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.iY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8328iY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f74976a;

    C8328iY(Bundle bundle) {
        this.f74976a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        if (this.f74976a.isEmpty()) {
            return;
        }
        ab2.f65088a.putBundle("installed_adapter_data", this.f74976a);
    }
}
