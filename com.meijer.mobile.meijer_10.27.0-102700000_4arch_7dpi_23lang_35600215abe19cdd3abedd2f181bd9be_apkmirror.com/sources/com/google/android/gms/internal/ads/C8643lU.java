package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.lU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8643lU implements InterfaceC9377sH {

    /* renamed from: a, reason: collision with root package name */
    private final Context f75828a;

    /* renamed from: b, reason: collision with root package name */
    private final Qc.a f75829b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f75830c;

    /* renamed from: d, reason: collision with root package name */
    private final Z50 f75831d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9008ot f75832e;

    /* renamed from: f, reason: collision with root package name */
    private final C9570u60 f75833f;

    /* renamed from: g, reason: collision with root package name */
    private final C7171Si f75834g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f75835h;

    /* renamed from: i, reason: collision with root package name */
    private final GS f75836i;

    /* renamed from: j, reason: collision with root package name */
    private final C9812wN f75837j;

    @Override // com.google.android.gms.internal.ads.InterfaceC9377sH
    public final void a(boolean z10, Context context, C8833nC c8833nC) throws NumberFormatException {
        GG gg2 = (GG) Mj0.q(this.f75830c);
        this.f75832e.L0(true);
        boolean zE = this.f75835h ? this.f75834g.e(false) : false;
        Lc.v.t();
        Lc.l lVar = new Lc.l(zE, Pc.D0.j(this.f75828a), this.f75835h ? this.f75834g.d() : false, this.f75835h ? this.f75834g.a() : 0.0f, -1, z10, this.f75831d.f72009O, false);
        if (c8833nC != null) {
            c8833nC.zzf();
        }
        Lc.v.m();
        C8203hH c8203hHJ = gg2.j();
        InterfaceC9008ot interfaceC9008ot = this.f75832e;
        Z50 z50 = this.f75831d;
        Qc.a aVar = this.f75829b;
        int i10 = z50.f72011Q;
        String str = z50.f71996B;
        C7755d60 c7755d60 = z50.f72057s;
        Oc.o.a(context, new AdOverlayInfoParcel(null, c8203hHJ, null, interfaceC9008ot, i10, aVar, str, lVar, c7755d60.f73364b, c7755d60.f73363a, this.f75833f.f78740f, c8833nC, z50.b() ? this.f75836i : null, this.f75832e.zzr()), true, this.f75837j);
    }

    C8643lU(Context context, Qc.a aVar, com.google.common.util.concurrent.q qVar, Z50 z50, InterfaceC9008ot interfaceC9008ot, C9570u60 c9570u60, boolean z10, C7171Si c7171Si, GS gs2, C9812wN c9812wN) {
        this.f75828a = context;
        this.f75829b = aVar;
        this.f75830c = qVar;
        this.f75831d = z50;
        this.f75832e = interfaceC9008ot;
        this.f75833f = c9570u60;
        this.f75834g = c7171Si;
        this.f75835h = z10;
        this.f75836i = gs2;
        this.f75837j = c9812wN;
    }
}
