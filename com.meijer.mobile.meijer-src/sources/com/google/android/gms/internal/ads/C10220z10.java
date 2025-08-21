package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.z10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10220z10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f81181a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f81182b;

    public C10220z10(String str, Bundle bundle) {
        this.f81181a = str;
        this.f81182b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        ab2.f65928a.putString("rtb", this.f81181a);
        if (this.f81182b.isEmpty()) {
            return;
        }
        ab2.f65928a.putBundle("adapter_initialization_status", this.f81182b);
    }
}
