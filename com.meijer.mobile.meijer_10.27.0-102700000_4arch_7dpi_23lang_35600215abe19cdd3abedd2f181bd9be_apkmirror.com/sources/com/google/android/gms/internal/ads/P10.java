package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
final class P10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f69237a;

    public P10(Bundle bundle) {
        this.f69237a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AB ab2 = (AB) obj;
        if (this.f69237a.isEmpty()) {
            return;
        }
        ab2.f65089b.putBundle("shared_pref", this.f69237a);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        if (this.f69237a.isEmpty()) {
            return;
        }
        ab2.f65088a.putBundle("shared_pref", this.f69237a);
    }
}
