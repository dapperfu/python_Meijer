package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7808cU implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7915dU f74027a;

    C7808cU(C7915dU c7915dU) {
        this.f74027a = c7915dU;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Oc.W0 w0A = this.f74027a.f74250a.d().a(th2);
        this.f74027a.f74253d.C(w0A);
        R60.b(w0A.f23346a, th2, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* synthetic */ void zzb(Object obj) {
        ((AbstractC8929my) obj).b();
    }
}
