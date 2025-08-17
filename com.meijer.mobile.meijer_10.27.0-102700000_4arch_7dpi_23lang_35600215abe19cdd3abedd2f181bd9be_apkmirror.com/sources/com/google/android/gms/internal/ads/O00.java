package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class O00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f68988a;

    public O00(Bundle bundle) {
        this.f68988a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        Bundle bundleA = H60.a(bundle, "device");
        bundleA.putBundle("android_mem_info", this.f68988a);
        bundle.putBundle("device", bundleA);
    }
}
