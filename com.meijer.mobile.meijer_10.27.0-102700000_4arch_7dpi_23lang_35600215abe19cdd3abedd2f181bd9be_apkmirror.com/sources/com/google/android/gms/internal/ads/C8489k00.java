package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.k00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8489k00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f75550a;

    /* renamed from: b, reason: collision with root package name */
    private final String f75551b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f75552c;

    /* synthetic */ C8489k00(String str, String str2, Bundle bundle, C8596l00 c8596l00) {
        this.f75550a = str;
        this.f75551b = str2;
        this.f75552c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        bundle.putString("consent_string", this.f75550a);
        bundle.putString("fc_consent", this.f75551b);
        Bundle bundle2 = this.f75552c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
