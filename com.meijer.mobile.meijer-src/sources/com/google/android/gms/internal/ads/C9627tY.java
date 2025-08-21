package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.tY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9627tY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Oc.j2 f79430a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f79431b;

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        if (((Boolean) Oc.A.c().a(C8784lf.f77305p5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f79431b);
        }
        Oc.j2 j2Var = this.f79430a;
        if (j2Var != null) {
            int i10 = j2Var.f23481a;
            if (i10 == 1) {
                bundle.putString("avo", "p");
            } else if (i10 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }

    public C9627tY(Oc.j2 j2Var, boolean z10) {
        this.f79430a = j2Var;
        this.f79431b = z10;
    }
}
