package com.google.android.gms.internal.ads;

import Z.C5503a;
import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.nz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8913nz implements PC, InterfaceC9581uC {

    /* renamed from: a, reason: collision with root package name */
    private final Context f77269a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9008ot f77270b;

    /* renamed from: c, reason: collision with root package name */
    private final Z50 f77271c;

    /* renamed from: d, reason: collision with root package name */
    private final Qc.a f77272d;

    /* renamed from: e, reason: collision with root package name */
    private C7789dT f77273e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f77274f;

    /* renamed from: g, reason: collision with root package name */
    private final C7576bT f77275g;

    private final synchronized void a() {
        EnumC7469aT enumC7469aT;
        ZS zs2;
        try {
            if (this.f77271c.f72014T && this.f77270b != null) {
                if (Lc.v.b().b(this.f77269a)) {
                    Qc.a aVar = this.f77272d;
                    String str = aVar.f29930b + "." + aVar.f29931c;
                    C9891x60 c9891x60 = this.f77271c.f72016V;
                    String strA = c9891x60.a();
                    if (c9891x60.c() == 1) {
                        zs2 = ZS.VIDEO;
                        enumC7469aT = EnumC7469aT.DEFINED_BY_JAVASCRIPT;
                    } else {
                        Z50 z50 = this.f77271c;
                        ZS zs3 = ZS.HTML_DISPLAY;
                        enumC7469aT = z50.f72029e == 1 ? EnumC7469aT.ONE_PIXEL : EnumC7469aT.BEGIN_TO_RENDER;
                        zs2 = zs3;
                    }
                    this.f77273e = Lc.v.b().j(str, this.f77270b.zzG(), "", "javascript", strA, enumC7469aT, zs2, this.f77271c.f72044l0);
                    View viewZzF = this.f77270b.zzF();
                    C7789dT c7789dT = this.f77273e;
                    if (c7789dT != null) {
                        AbstractC6749Ga0 abstractC6749Ga0A = c7789dT.a();
                        if (((Boolean) Mc.A.c().a(C8659lf.f76311e5)).booleanValue()) {
                            Lc.v.b().h(abstractC6749Ga0A, this.f77270b.zzG());
                            Iterator it = this.f77270b.y().iterator();
                            while (it.hasNext()) {
                                Lc.v.b().i(abstractC6749Ga0A, (View) it.next());
                            }
                        } else {
                            Lc.v.b().h(abstractC6749Ga0A, viewZzF);
                        }
                        this.f77270b.t0(this.f77273e);
                        Lc.v.b().a(abstractC6749Ga0A);
                        this.f77274f = true;
                        this.f77270b.L("onSdkLoaded", new C5503a());
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final synchronized void zzr() {
        InterfaceC9008ot interfaceC9008ot;
        if (b()) {
            this.f77275g.b();
            return;
        }
        if (!this.f77274f) {
            a();
        }
        if (!this.f77271c.f72014T || this.f77273e == null || (interfaceC9008ot = this.f77270b) == null) {
            return;
        }
        interfaceC9008ot.L("onSdkImpression", new C5503a());
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final synchronized void zzs() {
        if (b()) {
            this.f77275g.c();
        } else {
            if (this.f77274f) {
                return;
            }
            a();
        }
    }

    private final boolean b() {
        return ((Boolean) Mc.A.c().a(C8659lf.f76325f5)).booleanValue() && this.f77275g.d();
    }

    public C8913nz(Context context, InterfaceC9008ot interfaceC9008ot, Z50 z50, Qc.a aVar, C7576bT c7576bT) {
        this.f77269a = context;
        this.f77270b = interfaceC9008ot;
        this.f77271c = z50;
        this.f77272d = aVar;
        this.f77275g = c7576bT;
    }
}
