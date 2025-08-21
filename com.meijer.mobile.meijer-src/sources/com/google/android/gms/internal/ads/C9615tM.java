package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.tM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9615tM implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f79398a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f79399b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f79400c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f79401d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10213yy0 f79402e;

    public C9615tM(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04, InterfaceC10213yy0 interfaceC10213yy05) {
        this.f79398a = interfaceC10213yy0;
        this.f79399b = interfaceC10213yy02;
        this.f79400c = interfaceC10213yy03;
        this.f79401d = interfaceC10213yy04;
        this.f79402e = interfaceC10213yy05;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = ((C9990wu) this.f79398a).a();
        final String strZzb = ((XP) this.f79399b).zzb();
        Sc.a aVarA = ((C7037Ku) this.f79400c).a();
        final EnumC8247gd enumC8247gd = (EnumC8247gd) this.f79401d.zzb();
        final String str = (String) this.f79402e.zzb();
        C7517Zc c7517Zc = new C7517Zc(new C8140fd(contextA));
        C6947Id c6947IdH0 = C6981Jd.h0();
        c6947IdH0.u(aVarA.f34480b);
        c6947IdH0.w(aVarA.f34481c);
        c6947IdH0.v(true != aVarA.f34482d ? 2 : 0);
        final C6981Jd c6981JdP = c6947IdH0.p();
        c7517Zc.b(new InterfaceC7484Yc() { // from class: com.google.android.gms.internal.ads.sM
            @Override // com.google.android.gms.internal.ads.InterfaceC7484Yc
            public final void a(C6949Ie c6949Ie) {
                C8461id c8461idH = c6949Ie.E().H();
                c8461idH.u(enumC8247gd);
                c6949Ie.u(c8461idH);
                C6677Ae c6677AeH = c6949Ie.F().H();
                c6677AeH.u(strZzb);
                c6677AeH.v(c6981JdP);
                c6949Ie.w(c6677AeH);
                c6949Ie.x(str);
            }
        });
        return c7517Zc;
    }
}
