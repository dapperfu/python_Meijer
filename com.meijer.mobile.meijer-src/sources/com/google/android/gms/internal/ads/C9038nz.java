package com.google.android.gms.internal.ads;

import Z.C5603a;
import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.nz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9038nz implements PC, InterfaceC9706uC {

    /* renamed from: a, reason: collision with root package name */
    private final Context f78109a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9133ot f78110b;

    /* renamed from: c, reason: collision with root package name */
    private final Z50 f78111c;

    /* renamed from: d, reason: collision with root package name */
    private final Sc.a f78112d;

    /* renamed from: e, reason: collision with root package name */
    private C7914dT f78113e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f78114f;

    /* renamed from: g, reason: collision with root package name */
    private final C7701bT f78115g;

    private final synchronized void a() {
        EnumC7594aT enumC7594aT;
        ZS zs2;
        try {
            if (this.f78111c.f72854T && this.f78110b != null) {
                if (Nc.v.b().c(this.f78109a)) {
                    Sc.a aVar = this.f78112d;
                    String str = aVar.f34480b + "." + aVar.f34481c;
                    C10016x60 c10016x60 = this.f78111c.f72856V;
                    String strA = c10016x60.a();
                    if (c10016x60.c() == 1) {
                        zs2 = ZS.VIDEO;
                        enumC7594aT = EnumC7594aT.DEFINED_BY_JAVASCRIPT;
                    } else {
                        Z50 z50 = this.f78111c;
                        ZS zs3 = ZS.HTML_DISPLAY;
                        enumC7594aT = z50.f72869e == 1 ? EnumC7594aT.ONE_PIXEL : EnumC7594aT.BEGIN_TO_RENDER;
                        zs2 = zs3;
                    }
                    this.f78113e = Nc.v.b().j(str, this.f78110b.zzG(), "", "javascript", strA, enumC7594aT, zs2, this.f78111c.f72884l0);
                    View viewZzF = this.f78110b.zzF();
                    C7914dT c7914dT = this.f78113e;
                    if (c7914dT != null) {
                        AbstractC6874Ga0 abstractC6874Ga0A = c7914dT.a();
                        if (((Boolean) Oc.A.c().a(C8784lf.f77151e5)).booleanValue()) {
                            Nc.v.b().h(abstractC6874Ga0A, this.f78110b.zzG());
                            Iterator it = this.f78110b.y().iterator();
                            while (it.hasNext()) {
                                Nc.v.b().i(abstractC6874Ga0A, (View) it.next());
                            }
                        } else {
                            Nc.v.b().h(abstractC6874Ga0A, viewZzF);
                        }
                        this.f78110b.r0(this.f78113e);
                        Nc.v.b().b(abstractC6874Ga0A);
                        this.f78114f = true;
                        this.f78110b.L("onSdkLoaded", new C5603a());
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final synchronized void zzr() {
        InterfaceC9133ot interfaceC9133ot;
        if (b()) {
            this.f78115g.b();
            return;
        }
        if (!this.f78114f) {
            a();
        }
        if (!this.f78111c.f72854T || this.f78113e == null || (interfaceC9133ot = this.f78110b) == null) {
            return;
        }
        interfaceC9133ot.L("onSdkImpression", new C5603a());
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final synchronized void zzs() {
        if (b()) {
            this.f78115g.c();
        } else {
            if (this.f78114f) {
                return;
            }
            a();
        }
    }

    private final boolean b() {
        return ((Boolean) Oc.A.c().a(C8784lf.f77165f5)).booleanValue() && this.f78115g.d();
    }

    public C9038nz(Context context, InterfaceC9133ot interfaceC9133ot, Z50 z50, Sc.a aVar, C7701bT c7701bT) {
        this.f78109a = context;
        this.f78110b = interfaceC9133ot;
        this.f78111c = z50;
        this.f78112d = aVar;
        this.f78115g = c7701bT;
    }
}
