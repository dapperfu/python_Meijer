package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.pY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9200pY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f78439a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f78440b;

    public C9200pY(String str, boolean z10) {
        this.f78439a = str;
        this.f78440b = z10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.f78439a;
        AB ab2 = (AB) obj;
        if (str != null) {
            Bundle bundleA = H60.a(ab2.f65928a, "pii");
            bundleA.putString("afai", str);
            bundleA.putBoolean("is_afai_lat", this.f78440b);
        }
    }
}
