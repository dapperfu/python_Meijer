package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.j10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8509j10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f76158a;

    public C8509j10(Bundle bundle) {
        this.f76158a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.f76158a;
        AB ab2 = (AB) obj;
        if (bundle != null) {
            ab2.f65929b.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.f76158a;
        AB ab2 = (AB) obj;
        if (bundle != null) {
            ab2.f65928a.putAll(bundle);
        }
    }
}
