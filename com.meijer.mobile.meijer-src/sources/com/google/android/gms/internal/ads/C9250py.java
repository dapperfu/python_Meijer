package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.py, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9250py extends AbstractC8929my {

    /* renamed from: j, reason: collision with root package name */
    private final Context f78506j;

    /* renamed from: k, reason: collision with root package name */
    private final View f78507k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC9133ot f78508l;

    /* renamed from: m, reason: collision with root package name */
    private final C7560a60 f78509m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC10214yz f78510n;

    /* renamed from: o, reason: collision with root package name */
    private final II f78511o;

    /* renamed from: p, reason: collision with root package name */
    private final C8538jG f78512p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC7863cy0 f78513q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f78514r;

    /* renamed from: s, reason: collision with root package name */
    private Oc.d2 f78515s;

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final View k() {
        return this.f78507k;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final C7560a60 n() {
        return this.f78509m;
    }

    public static /* synthetic */ void q(C9250py c9250py) {
        InterfaceC6955Ih interfaceC6955IhE = c9250py.f78511o.e();
        if (interfaceC6955IhE == null) {
            return;
        }
        try {
            interfaceC6955IhE.P4((Oc.V) c9250py.f78513q.zzb(), com.google.android.gms.dynamic.d.I2(c9250py.f78506j));
        } catch (RemoteException e10) {
            Sc.p.e("RemoteException when notifyAdLoad is called", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.C6702Az
    public final void b() {
        this.f78514r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.oy
            @Override // java.lang.Runnable
            public final void run() {
                C9250py.q(this.f78291a);
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final int i() {
        return this.f66217a.f76589b.f76177b.f73945d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final int j() {
        if (((Boolean) Oc.A.c().a(C8784lf.f76860J7)).booleanValue() && this.f66218b.f72874g0) {
            if (!((Boolean) Oc.A.c().a(C8784lf.f76874K7)).booleanValue()) {
                return 0;
            }
        }
        return this.f66217a.f76589b.f76177b.f73944c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final Oc.Y0 l() {
        try {
            return this.f78510n.zza();
        } catch (zzfcq unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final C7560a60 m() {
        Oc.d2 d2Var = this.f78515s;
        if (d2Var != null) {
            return A60.b(d2Var);
        }
        Z50 z50 = this.f66218b;
        if (z50.f72866c0) {
            for (String str : z50.f72861a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f78507k;
            return new C7560a60(view.getWidth(), view.getHeight(), false);
        }
        return (C7560a60) this.f66218b.f72895r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final void o() {
        this.f78512p.zza();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8929my
    public final void p(ViewGroup viewGroup, Oc.d2 d2Var) {
        InterfaceC9133ot interfaceC9133ot;
        if (viewGroup == null || (interfaceC9133ot = this.f78508l) == null) {
            return;
        }
        interfaceC9133ot.n0(C8493iu.c(d2Var));
        viewGroup.setMinimumHeight(d2Var.f23402c);
        viewGroup.setMinimumWidth(d2Var.f23405f);
        this.f78515s = d2Var;
    }

    C9250py(C10321zz c10321zz, Context context, C7560a60 c7560a60, View view, InterfaceC9133ot interfaceC9133ot, InterfaceC10214yz interfaceC10214yz, II ii2, C8538jG c8538jG, InterfaceC7863cy0 interfaceC7863cy0, Executor executor) {
        super(c10321zz);
        this.f78506j = context;
        this.f78507k = view;
        this.f78508l = interfaceC9133ot;
        this.f78509m = c7560a60;
        this.f78510n = interfaceC10214yz;
        this.f78511o = ii2;
        this.f78512p = c8538jG;
        this.f78513q = interfaceC7863cy0;
        this.f78514r = executor;
    }
}
