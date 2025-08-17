package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.tM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9490tM implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f78558a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f78559b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f78560c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f78561d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10088yy0 f78562e;

    public C9490tM(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04, InterfaceC10088yy0 interfaceC10088yy05) {
        this.f78558a = interfaceC10088yy0;
        this.f78559b = interfaceC10088yy02;
        this.f78560c = interfaceC10088yy03;
        this.f78561d = interfaceC10088yy04;
        this.f78562e = interfaceC10088yy05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = ((C9865wu) this.f78558a).a();
        final String strZzb = ((XP) this.f78559b).zzb();
        Qc.a aVarA = ((C6912Ku) this.f78560c).a();
        final EnumC8122gd enumC8122gd = (EnumC8122gd) this.f78561d.zzb();
        final String str = (String) this.f78562e.zzb();
        C7392Zc c7392Zc = new C7392Zc(new C8015fd(contextA));
        C6822Id c6822IdH0 = C6856Jd.h0();
        c6822IdH0.u(aVarA.f29930b);
        c6822IdH0.w(aVarA.f29931c);
        c6822IdH0.v(true != aVarA.f29932d ? 2 : 0);
        final C6856Jd c6856JdP = c6822IdH0.p();
        c7392Zc.b(new InterfaceC7359Yc() { // from class: com.google.android.gms.internal.ads.sM
            @Override // com.google.android.gms.internal.ads.InterfaceC7359Yc
            public final void a(C6824Ie c6824Ie) {
                C8336id c8336idH = c6824Ie.E().H();
                c8336idH.u(enumC8122gd);
                c6824Ie.u(c8336idH);
                C6552Ae c6552AeH = c6824Ie.F().H();
                c6552AeH.u(strZzb);
                c6552AeH.v(c6856JdP);
                c6824Ie.w(c6552AeH);
                c6824Ie.x(str);
            }
        });
        return c7392Zc;
    }
}
