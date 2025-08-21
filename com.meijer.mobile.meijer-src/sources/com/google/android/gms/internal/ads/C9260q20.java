package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.q20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9260q20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    final String f78536a;

    /* renamed from: b, reason: collision with root package name */
    final int f78537b;

    /* synthetic */ C9260q20(String str, int i10, C9153p20 c9153p20) {
        this.f78536a = str;
        this.f78537b = i10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        if (((Boolean) Oc.A.c().a(C8784lf.f77282na)).booleanValue()) {
            if (!TextUtils.isEmpty(this.f78536a)) {
                ab2.f65928a.putString("topics", this.f78536a);
            }
            int i10 = this.f78537b;
            if (i10 != -1) {
                ab2.f65928a.putInt("atps", i10);
            }
        }
    }
}
