package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class X90 extends Oc.J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8369hk0 f72106a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Oc.V f72107b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y90 f72108c;

    X90(Y90 y90, C8369hk0 c8369hk0, Oc.V v10) {
        this.f72106a = c8369hk0;
        this.f72107b = v10;
        this.f72108c = y90;
    }

    @Override // Oc.K
    public final void zzc() {
        T90.a(this.f72107b, this.f72106a);
    }

    @Override // Oc.K
    public final void k0(Oc.W0 w02) {
        Sc.p.g("Failed to load interstitial ad with error: " + w02.T().toString() + " for ad unit: " + this.f72108c.f81087e.f23332a);
        this.f72108c.a(w02);
    }
}
