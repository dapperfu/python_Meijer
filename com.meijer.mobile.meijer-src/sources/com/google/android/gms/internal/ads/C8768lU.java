package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.lU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8768lU implements InterfaceC9502sH {

    /* renamed from: a, reason: collision with root package name */
    private final Context f76668a;

    /* renamed from: b, reason: collision with root package name */
    private final Sc.a f76669b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f76670c;

    /* renamed from: d, reason: collision with root package name */
    private final Z50 f76671d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9133ot f76672e;

    /* renamed from: f, reason: collision with root package name */
    private final C9695u60 f76673f;

    /* renamed from: g, reason: collision with root package name */
    private final C7296Si f76674g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f76675h;

    /* renamed from: i, reason: collision with root package name */
    private final GS f76676i;

    /* renamed from: j, reason: collision with root package name */
    private final C9937wN f76677j;

    @Override // com.google.android.gms.internal.ads.InterfaceC9502sH
    public final void a(boolean z10, Context context, C8958nC c8958nC) throws NumberFormatException {
        GG gg2 = (GG) Mj0.q(this.f76670c);
        this.f76672e.K0(true);
        boolean zE = this.f76675h ? this.f76674g.e(false) : false;
        Nc.v.t();
        Nc.l lVar = new Nc.l(zE, Rc.D0.j(this.f76668a), this.f76675h ? this.f76674g.d() : false, this.f76675h ? this.f76674g.a() : 0.0f, -1, z10, this.f76671d.f72849O, false);
        if (c8958nC != null) {
            c8958nC.zzf();
        }
        Nc.v.m();
        C8328hH c8328hHJ = gg2.j();
        InterfaceC9133ot interfaceC9133ot = this.f76672e;
        Z50 z50 = this.f76671d;
        Sc.a aVar = this.f76669b;
        int i10 = z50.f72851Q;
        String str = z50.f72836B;
        C7880d60 c7880d60 = z50.f72897s;
        Qc.o.a(context, new AdOverlayInfoParcel(null, c8328hHJ, null, interfaceC9133ot, i10, aVar, str, lVar, c7880d60.f74204b, c7880d60.f74203a, this.f76673f.f79580f, c8958nC, z50.b() ? this.f76676i : null, this.f76672e.zzr()), true, this.f76677j);
    }

    C8768lU(Context context, Sc.a aVar, com.google.common.util.concurrent.q qVar, Z50 z50, InterfaceC9133ot interfaceC9133ot, C9695u60 c9695u60, boolean z10, C7296Si c7296Si, GS gs2, C9937wN c9937wN) {
        this.f76668a = context;
        this.f76669b = aVar;
        this.f76670c = qVar;
        this.f76671d = z50;
        this.f76672e = interfaceC9133ot;
        this.f76673f = c9695u60;
        this.f76674g = c7296Si;
        this.f76675h = z10;
        this.f76676i = gs2;
        this.f76677j = c9937wN;
    }
}
