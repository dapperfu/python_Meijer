package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class U90 extends AbstractBinderC9740uc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8369hk0 f71392a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Oc.J1 f71393b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V90 f71394c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9847vc
    public final void zzb(int i10) {
    }

    U90(V90 v90, C8369hk0 c8369hk0, Oc.J1 j12) {
        this.f71392a = c8369hk0;
        this.f71393b = j12;
        this.f71394c = v90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9847vc
    public final void U0(InterfaceC9526sc interfaceC9526sc) {
        T90.a(interfaceC9526sc, this.f71392a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9847vc
    public final void z2(Oc.W0 w02) {
        Sc.p.g("Failed to load app open ad with error parcel: " + w02.T().toString() + " for ad unit: " + this.f71393b.f23332a);
        this.f71394c.a(w02);
    }
}
