package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
final class P10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f70077a;

    public P10(Bundle bundle) {
        this.f70077a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AB ab2 = (AB) obj;
        if (this.f70077a.isEmpty()) {
            return;
        }
        ab2.f65929b.putBundle("shared_pref", this.f70077a);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        if (this.f70077a.isEmpty()) {
            return;
        }
        ab2.f65928a.putBundle("shared_pref", this.f70077a);
    }
}
