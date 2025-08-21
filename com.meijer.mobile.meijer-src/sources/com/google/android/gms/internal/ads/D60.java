package com.google.android.gms.internal.ads;

import Oc.C4447y;

/* loaded from: classes6.dex */
final class D60 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9133ot f66994a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8394hx f66995b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ R90 f66996c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9835vS f66997d;

    D60(InterfaceC9133ot interfaceC9133ot, C8394hx c8394hx, R90 r90, C9835vS c9835vS) {
        this.f66994a = interfaceC9133ot;
        this.f66995b = c8394hx;
        this.f66996c = r90;
        this.f66997d = c9835vS;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        Z50 z50E = this.f66994a.e();
        if (z50E != null && !z50E.f72878i0) {
            Sc.v vVar = z50E.f72908x0;
            if (((Boolean) Oc.A.c().a(C8784lf.f77016U9)).booleanValue() && this.f66995b != null && C8394hx.j(str)) {
                this.f66995b.i(str, this.f66996c, C4447y.e(), vVar);
                return;
            } else {
                this.f66996c.d(str, vVar, null);
                return;
            }
        }
        C7773c60 c7773c60F = this.f66994a.f();
        if (c7773c60F == null) {
            Nc.v.s().x(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jA = Nc.v.c().a();
        boolean zA = Nc.v.s().a(this.f66994a.getContext());
        boolean z10 = false;
        boolean z11 = ((Boolean) Oc.A.c().a(C8784lf.f77138d6)).booleanValue() && z50E != null && z50E.f72853S;
        if (z50E != null && z50E.f72868d0 != null) {
            z10 = true;
        }
        this.f66997d.d(new C10049xS(jA, c7773c60F.f73943b, str, (zA || z11 || z10) ? 2 : 1));
    }
}
