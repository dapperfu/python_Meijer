package com.google.android.gms.internal.ads;

import Z.C5503a;
import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.tH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9484tH implements PC, Oc.p, InterfaceC9581uC {

    /* renamed from: a, reason: collision with root package name */
    private final Context f78530a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9008ot f78531b;

    /* renamed from: c, reason: collision with root package name */
    private final Z50 f78532c;

    /* renamed from: d, reason: collision with root package name */
    private final Qc.a f78533d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC8122gd f78534e;

    /* renamed from: f, reason: collision with root package name */
    private final C7576bT f78535f;

    /* renamed from: g, reason: collision with root package name */
    C7789dT f78536g;

    @Override // Oc.p
    public final void A1() {
    }

    @Override // Oc.p
    public final void N3(int i10) {
        this.f78536g = null;
    }

    @Override // Oc.p
    public final void W5() {
    }

    @Override // Oc.p
    public final void b2() {
    }

    @Override // Oc.p
    public final void d7() {
    }

    private final boolean a() {
        return ((Boolean) Mc.A.c().a(C8659lf.f76325f5)).booleanValue() && this.f78535f.d();
    }

    @Override // Oc.p
    public final void F2() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76395k5)).booleanValue() || this.f78531b == null) {
            return;
        }
        if (this.f78536g != null || a()) {
            if (this.f78536g != null) {
                this.f78531b.L("onSdkImpression", new C5503a());
            } else {
                this.f78535f.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        EnumC7469aT enumC7469aT;
        ZS zs2;
        EnumC8122gd enumC8122gd;
        if ((((Boolean) Mc.A.c().a(C8659lf.f76437n5)).booleanValue() || (enumC8122gd = this.f78534e) == EnumC8122gd.REWARD_BASED_VIDEO_AD || enumC8122gd == EnumC8122gd.INTERSTITIAL || enumC8122gd == EnumC8122gd.APP_OPEN) && this.f78532c.f72014T && this.f78531b != null) {
            if (Lc.v.b().b(this.f78530a)) {
                if (a()) {
                    this.f78535f.c();
                    return;
                }
                Qc.a aVar = this.f78533d;
                String str = aVar.f29930b + "." + aVar.f29931c;
                C9891x60 c9891x60 = this.f78532c.f72016V;
                String strA = c9891x60.a();
                if (c9891x60.c() == 1) {
                    zs2 = ZS.VIDEO;
                    enumC7469aT = EnumC7469aT.DEFINED_BY_JAVASCRIPT;
                } else {
                    enumC7469aT = this.f78532c.f72019Y == 2 ? EnumC7469aT.UNSPECIFIED : EnumC7469aT.BEGIN_TO_RENDER;
                    zs2 = ZS.HTML_DISPLAY;
                }
                this.f78536g = Lc.v.b().j(str, this.f78531b.zzG(), "", "javascript", strA, enumC7469aT, zs2, this.f78532c.f72044l0);
                View viewZzF = this.f78531b.zzF();
                C7789dT c7789dT = this.f78536g;
                if (c7789dT != null) {
                    AbstractC6749Ga0 abstractC6749Ga0A = c7789dT.a();
                    if (((Boolean) Mc.A.c().a(C8659lf.f76311e5)).booleanValue()) {
                        Lc.v.b().h(abstractC6749Ga0A, this.f78531b.zzG());
                        Iterator it = this.f78531b.y().iterator();
                        while (it.hasNext()) {
                            Lc.v.b().i(abstractC6749Ga0A, (View) it.next());
                        }
                    } else {
                        Lc.v.b().h(abstractC6749Ga0A, viewZzF);
                    }
                    this.f78531b.t0(this.f78536g);
                    Lc.v.b().a(abstractC6749Ga0A);
                    this.f78531b.L("onSdkLoaded", new C5503a());
                }
            }
        }
    }

    public C9484tH(Context context, InterfaceC9008ot interfaceC9008ot, Z50 z50, Qc.a aVar, EnumC8122gd enumC8122gd, C7576bT c7576bT) {
        this.f78530a = context;
        this.f78531b = interfaceC9008ot;
        this.f78532c = z50;
        this.f78533d = aVar;
        this.f78534e = enumC8122gd;
        this.f78535f = c7576bT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final void zzr() {
        if (a()) {
            this.f78535f.b();
            return;
        }
        if (this.f78536g != null && this.f78531b != null) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76395k5)).booleanValue()) {
                this.f78531b.L("onSdkImpression", new C5503a());
            }
        }
    }
}
