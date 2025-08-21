package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ba0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC6704Ba0 extends AbstractBinderC8484ip {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8369hk0 f66398a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC7844cp f66399b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6738Ca0 f66400c;

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void zze(int i10) {
    }

    BinderC6704Ba0(C6738Ca0 c6738Ca0, C8369hk0 c8369hk0, InterfaceC7844cp interfaceC7844cp) {
        this.f66398a = c8369hk0;
        this.f66399b = interfaceC7844cp;
        this.f66400c = c6738Ca0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void zzg() {
        T90.a(this.f66399b, this.f66398a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8590jp
    public final void b(Oc.W0 w02) {
        Sc.p.g("Failed to load rewarded ad with error: " + w02.T().toString() + ", adUnitId: " + this.f66400c.f81087e.f23332a);
        this.f66400c.a(w02);
    }
}
