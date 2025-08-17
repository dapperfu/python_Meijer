package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class EY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    final String f66480a;

    /* renamed from: b, reason: collision with root package name */
    final int f66481b;

    public EY(String str, int i10) {
        this.f66480a = str;
        this.f66481b = i10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        if (TextUtils.isEmpty(this.f66480a) || this.f66481b == -1) {
            return;
        }
        Bundle bundleA = H60.a(bundle, "pii");
        bundle.putBundle("pii", bundleA);
        bundleA.putString("pvid", this.f66480a);
        bundleA.putInt("pvid_s", this.f66481b);
    }
}
