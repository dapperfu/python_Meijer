package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.z10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10095z10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f80341a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f80342b;

    public C10095z10(String str, Bundle bundle) {
        this.f80341a = str;
        this.f80342b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        ab2.f65088a.putString("rtb", this.f80341a);
        if (this.f80342b.isEmpty()) {
            return;
        }
        ab2.f65088a.putBundle("adapter_initialization_status", this.f80342b);
    }
}
