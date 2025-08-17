package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7674cL implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z50 f73154a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7648c60 f73155b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8269hx f73156c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8315iL f73157d;

    C7674cL(C8315iL c8315iL, Z50 z50, C7648c60 c7648c60, C8269hx c8269hx) {
        this.f73154a = z50;
        this.f73155b = c7648c60;
        this.f73156c = c8269hx;
        this.f73157d = c8315iL;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        interfaceC9008ot.S(this.f73154a, this.f73155b);
        InterfaceC8156gu interfaceC8156guZzN = interfaceC9008ot.zzN();
        if (((Boolean) Mc.A.c().a(C8659lf.f76232Y9)).booleanValue() && interfaceC8156guZzN != null) {
            C8269hx c8269hx = this.f73156c;
            C8315iL c8315iL = this.f73157d;
            interfaceC8156guZzN.V(c8269hx, c8315iL.f74953i, c8315iL.f74954j);
            C8269hx c8269hx2 = this.f73156c;
            C8315iL c8315iL2 = this.f73157d;
            interfaceC8156guZzN.N0(c8269hx2, c8315iL2.f74953i, c8315iL2.f74948d);
        }
        if (!((Boolean) Mc.A.c().a(C8659lf.f76137Rc)).booleanValue() || interfaceC8156guZzN == null) {
            return;
        }
        interfaceC8156guZzN.j0(this.f73154a);
    }
}
