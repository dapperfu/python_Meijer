package com.google.android.gms.internal.ads;

import Z.C5603a;
import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.tH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9609tH implements PC, Qc.p, InterfaceC9706uC {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79370a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9133ot f79371b;

    /* renamed from: c, reason: collision with root package name */
    private final Z50 f79372c;

    /* renamed from: d, reason: collision with root package name */
    private final Sc.a f79373d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC8247gd f79374e;

    /* renamed from: f, reason: collision with root package name */
    private final C7701bT f79375f;

    /* renamed from: g, reason: collision with root package name */
    C7914dT f79376g;

    @Override // Qc.p
    public final void K1() {
    }

    @Override // Qc.p
    public final void Z3(int i10) {
        this.f79376g = null;
    }

    @Override // Qc.p
    public final void c2() {
    }

    @Override // Qc.p
    public final void m6() {
    }

    @Override // Qc.p
    public final void o7() {
    }

    private final boolean a() {
        return ((Boolean) Oc.A.c().a(C8784lf.f77165f5)).booleanValue() && this.f79375f.d();
    }

    @Override // Qc.p
    public final void I2() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77235k5)).booleanValue() || this.f79371b == null) {
            return;
        }
        if (this.f79376g != null || a()) {
            if (this.f79376g != null) {
                this.f79371b.L("onSdkImpression", new C5603a());
            } else {
                this.f79375f.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        EnumC7594aT enumC7594aT;
        ZS zs2;
        EnumC8247gd enumC8247gd;
        if ((((Boolean) Oc.A.c().a(C8784lf.f77277n5)).booleanValue() || (enumC8247gd = this.f79374e) == EnumC8247gd.REWARD_BASED_VIDEO_AD || enumC8247gd == EnumC8247gd.INTERSTITIAL || enumC8247gd == EnumC8247gd.APP_OPEN) && this.f79372c.f72854T && this.f79371b != null) {
            if (Nc.v.b().c(this.f79370a)) {
                if (a()) {
                    this.f79375f.c();
                    return;
                }
                Sc.a aVar = this.f79373d;
                String str = aVar.f34480b + "." + aVar.f34481c;
                C10016x60 c10016x60 = this.f79372c.f72856V;
                String strA = c10016x60.a();
                if (c10016x60.c() == 1) {
                    zs2 = ZS.VIDEO;
                    enumC7594aT = EnumC7594aT.DEFINED_BY_JAVASCRIPT;
                } else {
                    enumC7594aT = this.f79372c.f72859Y == 2 ? EnumC7594aT.UNSPECIFIED : EnumC7594aT.BEGIN_TO_RENDER;
                    zs2 = ZS.HTML_DISPLAY;
                }
                this.f79376g = Nc.v.b().j(str, this.f79371b.zzG(), "", "javascript", strA, enumC7594aT, zs2, this.f79372c.f72884l0);
                View viewZzF = this.f79371b.zzF();
                C7914dT c7914dT = this.f79376g;
                if (c7914dT != null) {
                    AbstractC6874Ga0 abstractC6874Ga0A = c7914dT.a();
                    if (((Boolean) Oc.A.c().a(C8784lf.f77151e5)).booleanValue()) {
                        Nc.v.b().h(abstractC6874Ga0A, this.f79371b.zzG());
                        Iterator it = this.f79371b.y().iterator();
                        while (it.hasNext()) {
                            Nc.v.b().i(abstractC6874Ga0A, (View) it.next());
                        }
                    } else {
                        Nc.v.b().h(abstractC6874Ga0A, viewZzF);
                    }
                    this.f79371b.r0(this.f79376g);
                    Nc.v.b().b(abstractC6874Ga0A);
                    this.f79371b.L("onSdkLoaded", new C5603a());
                }
            }
        }
    }

    public C9609tH(Context context, InterfaceC9133ot interfaceC9133ot, Z50 z50, Sc.a aVar, EnumC8247gd enumC8247gd, C7701bT c7701bT) {
        this.f79370a = context;
        this.f79371b = interfaceC9133ot;
        this.f79372c = z50;
        this.f79373d = aVar;
        this.f79374e = enumC8247gd;
        this.f79375f = c7701bT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final void zzr() {
        if (a()) {
            this.f79375f.b();
            return;
        }
        if (this.f79376g != null && this.f79371b != null) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77235k5)).booleanValue()) {
                this.f79371b.L("onSdkImpression", new C5603a());
            }
        }
    }
}
