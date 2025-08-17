package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.oW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8966oW implements Lc.g {

    /* renamed from: a, reason: collision with root package name */
    private Lc.g f77384a;

    public final synchronized void a(Lc.g gVar) {
        this.f77384a = gVar;
    }

    @Override // Lc.g
    public final synchronized void zza(View view) {
        Lc.g gVar = this.f77384a;
        if (gVar != null) {
            gVar.zza(view);
        }
    }

    @Override // Lc.g
    public final synchronized void zzb() {
        Lc.g gVar = this.f77384a;
        if (gVar != null) {
            gVar.zzb();
        }
    }

    @Override // Lc.g
    public final synchronized void zzc() {
        Lc.g gVar = this.f77384a;
        if (gVar != null) {
            gVar.zzc();
        }
    }
}
