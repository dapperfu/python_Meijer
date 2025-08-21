package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7799cL implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z50 f73994a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7773c60 f73995b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8394hx f73996c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8440iL f73997d;

    C7799cL(C8440iL c8440iL, Z50 z50, C7773c60 c7773c60, C8394hx c8394hx) {
        this.f73994a = z50;
        this.f73995b = c7773c60;
        this.f73996c = c8394hx;
        this.f73997d = c8440iL;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        interfaceC9133ot.S(this.f73994a, this.f73995b);
        InterfaceC8281gu interfaceC8281guZzN = interfaceC9133ot.zzN();
        if (((Boolean) Oc.A.c().a(C8784lf.f77072Y9)).booleanValue() && interfaceC8281guZzN != null) {
            C8394hx c8394hx = this.f73996c;
            C8440iL c8440iL = this.f73997d;
            interfaceC8281guZzN.V(c8394hx, c8440iL.f75793i, c8440iL.f75794j);
            C8394hx c8394hx2 = this.f73996c;
            C8440iL c8440iL2 = this.f73997d;
            interfaceC8281guZzN.M0(c8394hx2, c8440iL2.f75793i, c8440iL2.f75788d);
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f76977Rc)).booleanValue() || interfaceC8281guZzN == null) {
            return;
        }
        interfaceC8281guZzN.j0(this.f73994a);
    }
}
