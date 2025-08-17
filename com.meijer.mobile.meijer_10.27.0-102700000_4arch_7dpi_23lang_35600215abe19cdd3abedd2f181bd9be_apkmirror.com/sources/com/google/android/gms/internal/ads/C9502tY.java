package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.tY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9502tY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Mc.j2 f78590a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f78591b;

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        if (((Boolean) Mc.A.c().a(C8659lf.f76465p5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f78591b);
        }
        Mc.j2 j2Var = this.f78590a;
        if (j2Var != null) {
            int i10 = j2Var.f19294a;
            if (i10 == 1) {
                bundle.putString("avo", "p");
            } else if (i10 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }

    public C9502tY(Mc.j2 j2Var, boolean z10) {
        this.f78590a = j2Var;
        this.f78591b = z10;
    }
}
