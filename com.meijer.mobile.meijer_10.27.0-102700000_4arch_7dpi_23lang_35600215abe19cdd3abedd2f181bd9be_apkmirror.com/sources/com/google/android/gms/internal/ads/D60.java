package com.google.android.gms.internal.ads;

import Mc.C4169y;

/* loaded from: classes6.dex */
final class D60 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9008ot f66154a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8269hx f66155b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ R90 f66156c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9710vS f66157d;

    D60(InterfaceC9008ot interfaceC9008ot, C8269hx c8269hx, R90 r90, C9710vS c9710vS) {
        this.f66154a = interfaceC9008ot;
        this.f66155b = c8269hx;
        this.f66156c = r90;
        this.f66157d = c9710vS;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        Z50 z50E = this.f66154a.e();
        if (z50E != null && !z50E.f72038i0) {
            Qc.v vVar = z50E.f72068x0;
            if (((Boolean) Mc.A.c().a(C8659lf.f76176U9)).booleanValue() && this.f66155b != null && C8269hx.j(str)) {
                this.f66155b.i(str, this.f66156c, C4169y.e(), vVar);
                return;
            } else {
                this.f66156c.d(str, vVar, null);
                return;
            }
        }
        C7648c60 c7648c60H = this.f66154a.h();
        if (c7648c60H == null) {
            Lc.v.s().x(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jA = Lc.v.c().a();
        boolean zA = Lc.v.s().a(this.f66154a.getContext());
        boolean z10 = false;
        boolean z11 = ((Boolean) Mc.A.c().a(C8659lf.f76298d6)).booleanValue() && z50E != null && z50E.f72013S;
        if (z50E != null && z50E.f72028d0 != null) {
            z10 = true;
        }
        this.f66157d.d(new C9924xS(jA, c7648c60H.f73103b, str, (zA || z11 || z10) ? 2 : 1));
    }
}
