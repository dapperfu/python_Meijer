package com.google.android.gms.internal.ads;

import Rc.C5212v;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class JT implements InterfaceC8448iT {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7278Ry f68754a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f68755b;

    /* renamed from: c, reason: collision with root package name */
    private final UL f68756c;

    /* renamed from: d, reason: collision with root package name */
    private final C9695u60 f68757d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f68758e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9533sf0 f68759f;

    /* renamed from: g, reason: collision with root package name */
    private final C9296qN f68760g;

    public JT(AbstractC7278Ry abstractC7278Ry, Context context, Executor executor, UL ul2, C9695u60 c9695u60, InterfaceC9533sf0 interfaceC9533sf0, C9296qN c9296qN) {
        this.f68755b = context;
        this.f68754a = abstractC7278Ry;
        this.f68758e = executor;
        this.f68756c = ul2;
        this.f68757d = c9695u60;
        this.f68759f = interfaceC9533sf0;
        this.f68760g = c9296qN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(final C8733l60 c8733l60, final Z50 z50) {
        return Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.IT
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f68459a.c(c8733l60, z50, obj);
            }
        }, this.f68758e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        C7880d60 c7880d60 = z50.f72897s;
        return (c7880d60 == null || c7880d60.f74203a == null) ? false : true;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(C8733l60 c8733l60, Z50 z50, Object obj) throws Exception {
        AbstractC7718bf abstractC7718bf = C8784lf.f77260m2;
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f68760g.a().putLong(EnumC8014eN.RENDERING_WEBVIEW_CREATION_START.a(), Nc.v.c().a());
        }
        Oc.d2 d2VarA = A60.a(this.f68755b, z50.f72901u);
        final InterfaceC9133ot interfaceC9133otA = this.f68756c.a(d2VarA, z50, c8733l60.f76589b.f76177b);
        interfaceC9133otA.O(z50.f72857W);
        View viewA = (((Boolean) Oc.A.c().a(C8784lf.f76860J7)).booleanValue() && z50.f72874g0) ? zzcql.a(this.f68755b, interfaceC9133otA.zzF(), z50) : new zzdoz(this.f68755b, interfaceC9133otA.zzF(), (C5212v) this.f68759f.apply(z50));
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f68760g.a().putLong(EnumC8014eN.RENDERING_WEBVIEW_CREATION_END.a(), Nc.v.c().a());
        }
        final AbstractC9036ny abstractC9036nyA = this.f68754a.a(new C7279Rz(c8733l60, z50, null), new C9677ty(viewA, interfaceC9133otA, new InterfaceC10214yz() { // from class: com.google.android.gms.internal.ads.DT
            @Override // com.google.android.gms.internal.ads.InterfaceC10214yz
            public final Oc.Y0 zza() {
                return interfaceC9133otA.zzq();
            }
        }, A60.b(d2VarA)));
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            this.f68760g.a().putLong(EnumC8014eN.RENDERING_AD_COMPONENT_CREATION_END.a(), Nc.v.c().a());
        }
        abstractC9036nyA.j().i(interfaceC9133otA, false, null, this.f68760g.a());
        C9492sC c9492sCB = abstractC9036nyA.b();
        InterfaceC9706uC interfaceC9706uC = new InterfaceC9706uC() { // from class: com.google.android.gms.internal.ads.ET
            @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
            public final void zzr() {
                InterfaceC9133ot interfaceC9133ot = interfaceC9133otA;
                if (interfaceC9133ot.zzN() != null) {
                    interfaceC9133ot.zzN().zzs();
                }
            }
        };
        Xj0 xj0 = C7033Kq.f69020g;
        c9492sCB.G0(interfaceC9706uC, xj0);
        String strB = z50.f72897s.f74203a;
        if (((Boolean) Oc.A.c().a(C8784lf.f77165f5)).booleanValue() && abstractC9036nyA.k().e(true)) {
            strB = C7539Zt.b(strB, C7539Zt.a(z50));
        }
        abstractC9036nyA.j();
        com.google.common.util.concurrent.q qVarJ = TL.j(interfaceC9133otA, z50.f72897s.f74204b, strB, this.f68760g.a());
        if (z50.f72847M) {
            qVarJ.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.FT
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC9133otA.w();
                }
            }, this.f68758e);
        }
        qVarJ.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.GT
            @Override // java.lang.Runnable
            public final void run() {
                this.f68040a.d(interfaceC9133otA);
            }
        }, this.f68758e);
        return Mj0.m(qVarJ, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.HT
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj2) {
                return abstractC9036nyA.h();
            }
        }, xj0);
    }

    final /* synthetic */ void d(InterfaceC9133ot interfaceC9133ot) {
        interfaceC9133ot.I();
        C9695u60 c9695u60 = this.f68757d;
        BinderC7239Qt binderC7239QtZzq = interfaceC9133ot.zzq();
        Oc.R1 r12 = c9695u60.f79575a;
        if (r12 != null && binderC7239QtZzq != null) {
            binderC7239QtZzq.F9(r12);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77329r1)).booleanValue() && !interfaceC9133ot.isAttachedToWindow()) {
            interfaceC9133ot.onPause();
            interfaceC9133ot.Q(true);
        }
    }
}
