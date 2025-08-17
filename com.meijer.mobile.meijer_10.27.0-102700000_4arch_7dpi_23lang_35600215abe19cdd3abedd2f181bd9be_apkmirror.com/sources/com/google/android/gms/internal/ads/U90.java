package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class U90 extends AbstractBinderC9615uc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8244hk0 f70552a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Mc.J1 f70553b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V90 f70554c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9722vc
    public final void zzb(int i10) {
    }

    U90(V90 v90, C8244hk0 c8244hk0, Mc.J1 j12) {
        this.f70552a = c8244hk0;
        this.f70553b = j12;
        this.f70554c = v90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9722vc
    public final void T0(InterfaceC9401sc interfaceC9401sc) {
        T90.a(interfaceC9401sc, this.f70552a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9722vc
    public final void P8(Mc.W0 w02) {
        Qc.p.g("Failed to load app open ad with error parcel: " + w02.T().toString() + " for ad unit: " + this.f70553b.f19145a);
        this.f70554c.a(w02);
    }
}
