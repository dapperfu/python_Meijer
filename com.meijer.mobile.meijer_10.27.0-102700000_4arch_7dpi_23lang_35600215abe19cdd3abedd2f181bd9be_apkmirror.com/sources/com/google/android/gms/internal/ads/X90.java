package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class X90 extends Mc.J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8244hk0 f71266a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Mc.V f71267b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y90 f71268c;

    X90(Y90 y90, C8244hk0 c8244hk0, Mc.V v10) {
        this.f71266a = c8244hk0;
        this.f71267b = v10;
        this.f71268c = y90;
    }

    @Override // Mc.K
    public final void zzc() {
        T90.a(this.f71267b, this.f71266a);
    }

    @Override // Mc.K
    public final void M0(Mc.W0 w02) {
        Qc.p.g("Failed to load interstitial ad with error: " + w02.T().toString() + " for ad unit: " + this.f71268c.f80247e.f19145a);
        this.f71268c.a(w02);
    }
}
