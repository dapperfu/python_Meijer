package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.q20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9135q20 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    final String f77696a;

    /* renamed from: b, reason: collision with root package name */
    final int f77697b;

    /* synthetic */ C9135q20(String str, int i10, C9028p20 c9028p20) {
        this.f77696a = str;
        this.f77697b = i10;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AB ab2 = (AB) obj;
        if (((Boolean) Mc.A.c().a(C8659lf.f76442na)).booleanValue()) {
            if (!TextUtils.isEmpty(this.f77696a)) {
                ab2.f65088a.putString("topics", this.f77696a);
            }
            int i10 = this.f77697b;
            if (i10 != -1) {
                ab2.f65088a.putInt("atps", i10);
            }
        }
    }
}
