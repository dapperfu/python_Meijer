package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.j10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8384j10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f75318a;

    public C8384j10(Bundle bundle) {
        this.f75318a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.f75318a;
        AB ab2 = (AB) obj;
        if (bundle != null) {
            ab2.f65089b.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.f75318a;
        AB ab2 = (AB) obj;
        if (bundle != null) {
            ab2.f65088a.putAll(bundle);
        }
    }
}
