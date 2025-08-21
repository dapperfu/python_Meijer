package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.k00, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8614k00 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f76390a;

    /* renamed from: b, reason: collision with root package name */
    private final String f76391b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f76392c;

    /* synthetic */ C8614k00(String str, String str2, Bundle bundle, C8721l00 c8721l00) {
        this.f76390a = str;
        this.f76391b = str2;
        this.f76392c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        bundle.putString("consent_string", this.f76390a);
        bundle.putString("fc_consent", this.f76391b);
        Bundle bundle2 = this.f76392c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
