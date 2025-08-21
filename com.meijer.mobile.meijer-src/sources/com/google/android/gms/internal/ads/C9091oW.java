package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.oW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9091oW implements Nc.g {

    /* renamed from: a, reason: collision with root package name */
    private Nc.g f78224a;

    public final synchronized void a(Nc.g gVar) {
        this.f78224a = gVar;
    }

    @Override // Nc.g
    public final synchronized void zza(View view) {
        Nc.g gVar = this.f78224a;
        if (gVar != null) {
            gVar.zza(view);
        }
    }

    @Override // Nc.g
    public final synchronized void zzb() {
        Nc.g gVar = this.f78224a;
        if (gVar != null) {
            gVar.zzb();
        }
    }

    @Override // Nc.g
    public final synchronized void zzc() {
        Nc.g gVar = this.f78224a;
        if (gVar != null) {
            gVar.zzc();
        }
    }
}
