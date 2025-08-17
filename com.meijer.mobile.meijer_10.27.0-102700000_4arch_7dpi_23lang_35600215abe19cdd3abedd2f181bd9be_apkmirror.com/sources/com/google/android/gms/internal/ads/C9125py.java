package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.py, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9125py extends AbstractC8804my {

    /* renamed from: j, reason: collision with root package name */
    private final Context f77666j;

    /* renamed from: k, reason: collision with root package name */
    private final View f77667k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC9008ot f77668l;

    /* renamed from: m, reason: collision with root package name */
    private final C7435a60 f77669m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC10089yz f77670n;

    /* renamed from: o, reason: collision with root package name */
    private final II f77671o;

    /* renamed from: p, reason: collision with root package name */
    private final C8413jG f77672p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC7738cy0 f77673q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f77674r;

    /* renamed from: s, reason: collision with root package name */
    private Mc.d2 f77675s;

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final View k() {
        return this.f77667k;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final C7435a60 n() {
        return this.f77669m;
    }

    public static /* synthetic */ void q(C9125py c9125py) {
        InterfaceC6830Ih interfaceC6830IhE = c9125py.f77671o.e();
        if (interfaceC6830IhE == null) {
            return;
        }
        try {
            interfaceC6830IhE.D1((Mc.V) c9125py.f77673q.zzb(), com.google.android.gms.dynamic.d.F2(c9125py.f77666j));
        } catch (RemoteException e10) {
            Qc.p.e("RemoteException when notifyAdLoad is called", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.C6577Az
    public final void b() {
        this.f77674r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.oy
            @Override // java.lang.Runnable
            public final void run() {
                C9125py.q(this.f77451a);
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final int i() {
        return this.f65377a.f75749b.f75337b.f73105d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final int j() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76020J7)).booleanValue() && this.f65378b.f72034g0) {
            if (!((Boolean) Mc.A.c().a(C8659lf.f76034K7)).booleanValue()) {
                return 0;
            }
        }
        return this.f65377a.f75749b.f75337b.f73104c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final Mc.Y0 l() {
        try {
            return this.f77670n.zza();
        } catch (zzfcq unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final C7435a60 m() {
        Mc.d2 d2Var = this.f77675s;
        if (d2Var != null) {
            return A60.b(d2Var);
        }
        Z50 z50 = this.f65378b;
        if (z50.f72026c0) {
            for (String str : z50.f72021a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f77667k;
            return new C7435a60(view.getWidth(), view.getHeight(), false);
        }
        return (C7435a60) this.f65378b.f72055r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final void o() {
        this.f77672p.zza();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8804my
    public final void p(ViewGroup viewGroup, Mc.d2 d2Var) {
        InterfaceC9008ot interfaceC9008ot;
        if (viewGroup == null || (interfaceC9008ot = this.f77668l) == null) {
            return;
        }
        interfaceC9008ot.n0(C8368iu.c(d2Var));
        viewGroup.setMinimumHeight(d2Var.f19215c);
        viewGroup.setMinimumWidth(d2Var.f19218f);
        this.f77675s = d2Var;
    }

    C9125py(C10196zz c10196zz, Context context, C7435a60 c7435a60, View view, InterfaceC9008ot interfaceC9008ot, InterfaceC10089yz interfaceC10089yz, II ii2, C8413jG c8413jG, InterfaceC7738cy0 interfaceC7738cy0, Executor executor) {
        super(c10196zz);
        this.f77666j = context;
        this.f77667k = view;
        this.f77668l = interfaceC9008ot;
        this.f77669m = c7435a60;
        this.f77670n = interfaceC10089yz;
        this.f77671o = ii2;
        this.f77672p = c8413jG;
        this.f77673q = interfaceC7738cy0;
        this.f77674r = executor;
    }
}
