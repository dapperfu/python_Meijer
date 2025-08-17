package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.qI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9166qI implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f77762a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9379sI f77763b;

    C9166qI(C9379sI c9379sI, View view) {
        this.f77762a = view;
        this.f77763b = c9379sI;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76423m5)).booleanValue()) {
            Lc.v.s().w(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f77763b.M(this.f77762a, (C7789dT) obj);
    }
}
