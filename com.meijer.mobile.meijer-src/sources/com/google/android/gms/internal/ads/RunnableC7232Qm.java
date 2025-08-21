package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.Qm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7232Qm implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AdOverlayInfoParcel f70481a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzbrw f70482b;

    RunnableC7232Qm(zzbrw zzbrwVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f70481a = adOverlayInfoParcel;
        this.f70482b = zzbrwVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        Nc.v.m();
        Qc.o.a(this.f70482b.f81419a, this.f70481a, true, null);
    }
}
