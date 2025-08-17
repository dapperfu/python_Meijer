package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.Qm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7107Qm implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AdOverlayInfoParcel f69641a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzbrw f69642b;

    RunnableC7107Qm(zzbrw zzbrwVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f69641a = adOverlayInfoParcel;
        this.f69642b = zzbrwVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        Lc.v.m();
        Oc.o.a(this.f69642b.f80579a, this.f69641a, true, null);
    }
}
