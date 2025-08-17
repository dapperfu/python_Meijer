package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7683cU implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7790dU f73187a;

    C7683cU(C7790dU c7790dU) {
        this.f73187a = c7790dU;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Mc.W0 w0A = this.f73187a.f73410a.d().a(th2);
        this.f73187a.f73413d.g0(w0A);
        R60.b(w0A.f19159a, th2, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* synthetic */ void zzb(Object obj) {
        ((AbstractC8804my) obj).b();
    }
}
