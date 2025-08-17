package com.google.android.gms.internal.ads;

import Pc.C4591v;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class JT implements InterfaceC8323iT {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7153Ry f67914a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f67915b;

    /* renamed from: c, reason: collision with root package name */
    private final UL f67916c;

    /* renamed from: d, reason: collision with root package name */
    private final C9570u60 f67917d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f67918e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9408sf0 f67919f;

    /* renamed from: g, reason: collision with root package name */
    private final C9171qN f67920g;

    public JT(AbstractC7153Ry abstractC7153Ry, Context context, Executor executor, UL ul2, C9570u60 c9570u60, InterfaceC9408sf0 interfaceC9408sf0, C9171qN c9171qN) {
        this.f67915b = context;
        this.f67914a = abstractC7153Ry;
        this.f67918e = executor;
        this.f67916c = ul2;
        this.f67917d = c9570u60;
        this.f67919f = interfaceC9408sf0;
        this.f67920g = c9171qN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(final C8608l60 c8608l60, final Z50 z50) {
        return Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.IT
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f67619a.c(c8608l60, z50, obj);
            }
        }, this.f67918e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        C7755d60 c7755d60 = z50.f72057s;
        return (c7755d60 == null || c7755d60.f73363a == null) ? false : true;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(C8608l60 c8608l60, Z50 z50, Object obj) throws Exception {
        AbstractC7593bf abstractC7593bf = C8659lf.f76420m2;
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f67920g.a().putLong(EnumC7889eN.RENDERING_WEBVIEW_CREATION_START.a(), Lc.v.c().a());
        }
        Mc.d2 d2VarA = A60.a(this.f67915b, z50.f72061u);
        final InterfaceC9008ot interfaceC9008otA = this.f67916c.a(d2VarA, z50, c8608l60.f75749b.f75337b);
        interfaceC9008otA.O(z50.f72017W);
        View viewA = (((Boolean) Mc.A.c().a(C8659lf.f76020J7)).booleanValue() && z50.f72034g0) ? zzcql.a(this.f67915b, interfaceC9008otA.zzF(), z50) : new zzdoz(this.f67915b, interfaceC9008otA.zzF(), (C4591v) this.f67919f.apply(z50));
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f67920g.a().putLong(EnumC7889eN.RENDERING_WEBVIEW_CREATION_END.a(), Lc.v.c().a());
        }
        final AbstractC8911ny abstractC8911nyA = this.f67914a.a(new C7154Rz(c8608l60, z50, null), new C9552ty(viewA, interfaceC9008otA, new InterfaceC10089yz() { // from class: com.google.android.gms.internal.ads.DT
            @Override // com.google.android.gms.internal.ads.InterfaceC10089yz
            public final Mc.Y0 zza() {
                return interfaceC9008otA.zzq();
            }
        }, A60.b(d2VarA)));
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            this.f67920g.a().putLong(EnumC7889eN.RENDERING_AD_COMPONENT_CREATION_END.a(), Lc.v.c().a());
        }
        abstractC8911nyA.j().i(interfaceC9008otA, false, null, this.f67920g.a());
        C9367sC c9367sCB = abstractC8911nyA.b();
        InterfaceC9581uC interfaceC9581uC = new InterfaceC9581uC() { // from class: com.google.android.gms.internal.ads.ET
            @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
            public final void zzr() {
                InterfaceC9008ot interfaceC9008ot = interfaceC9008otA;
                if (interfaceC9008ot.zzN() != null) {
                    interfaceC9008ot.zzN().zzs();
                }
            }
        };
        Xj0 xj0 = C6908Kq.f68180g;
        c9367sCB.H0(interfaceC9581uC, xj0);
        String strB = z50.f72057s.f73363a;
        if (((Boolean) Mc.A.c().a(C8659lf.f76325f5)).booleanValue() && abstractC8911nyA.k().e(true)) {
            strB = C7414Zt.b(strB, C7414Zt.a(z50));
        }
        abstractC8911nyA.j();
        com.google.common.util.concurrent.q qVarJ = TL.j(interfaceC9008otA, z50.f72057s.f73364b, strB, this.f67920g.a());
        if (z50.f72007M) {
            qVarJ.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.FT
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC9008otA.w();
                }
            }, this.f67918e);
        }
        qVarJ.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.GT
            @Override // java.lang.Runnable
            public final void run() {
                this.f67200a.d(interfaceC9008otA);
            }
        }, this.f67918e);
        return Mj0.m(qVarJ, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.HT
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj2) {
                return abstractC8911nyA.h();
            }
        }, xj0);
    }

    final /* synthetic */ void d(InterfaceC9008ot interfaceC9008ot) {
        interfaceC9008ot.I();
        C9570u60 c9570u60 = this.f67917d;
        BinderC7114Qt binderC7114QtZzq = interfaceC9008ot.zzq();
        Mc.R1 r12 = c9570u60.f78735a;
        if (r12 != null && binderC7114QtZzq != null) {
            binderC7114QtZzq.F9(r12);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76489r1)).booleanValue() && !interfaceC9008ot.isAttachedToWindow()) {
            interfaceC9008ot.onPause();
            interfaceC9008ot.Q(true);
        }
    }
}
