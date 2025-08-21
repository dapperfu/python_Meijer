package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.qI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9291qI implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f78602a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9504sI f78603b;

    C9291qI(C9504sI c9504sI, View view) {
        this.f78602a = view;
        this.f78603b = c9504sI;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77263m5)).booleanValue()) {
            Nc.v.s().w(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f78603b.M(this.f78602a, (C7914dT) obj);
    }
}
