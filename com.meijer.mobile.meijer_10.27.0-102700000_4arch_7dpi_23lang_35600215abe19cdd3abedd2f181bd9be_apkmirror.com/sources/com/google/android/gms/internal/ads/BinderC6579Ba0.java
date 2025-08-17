package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ba0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC6579Ba0 extends AbstractBinderC8359ip {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8244hk0 f65558a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC7719cp f65559b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6613Ca0 f65560c;

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void zze(int i10) {
    }

    BinderC6579Ba0(C6613Ca0 c6613Ca0, C8244hk0 c8244hk0, InterfaceC7719cp interfaceC7719cp) {
        this.f65558a = c8244hk0;
        this.f65559b = interfaceC7719cp;
        this.f65560c = c6613Ca0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void zzg() {
        T90.a(this.f65559b, this.f65558a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void b(Mc.W0 w02) {
        Qc.p.g("Failed to load rewarded ad with error: " + w02.T().toString() + ", adUnitId: " + this.f65560c.f80247e.f19145a);
        this.f65560c.a(w02);
    }
}
