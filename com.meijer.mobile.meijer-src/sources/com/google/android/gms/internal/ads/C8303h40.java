package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.h40, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8303h40 implements InterfaceC9840vX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f75425a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f75426b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC9135ou f75427c;

    /* renamed from: d, reason: collision with root package name */
    private final C8024eX f75428d;

    /* renamed from: e, reason: collision with root package name */
    private final C8452iX f75429e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f75430f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC6883Gf f75431g;

    /* renamed from: h, reason: collision with root package name */
    private final C9708uD f75432h;

    /* renamed from: i, reason: collision with root package name */
    private final Z80 f75433i;

    /* renamed from: j, reason: collision with root package name */
    private final DE f75434j;

    /* renamed from: k, reason: collision with root package name */
    private final C9481s60 f75435k;

    /* renamed from: l, reason: collision with root package name */
    private com.google.common.util.concurrent.q f75436l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f75437m;

    /* renamed from: n, reason: collision with root package name */
    private Oc.W0 f75438n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC9733uX f75439o;

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        this.f75436l = null;
        final Oc.W0 w02 = this.f75438n;
        this.f75438n = null;
        if (((Boolean) Oc.A.c().a(C8784lf.f77098a8)).booleanValue() && w02 != null) {
            this.f75426b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.c40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73930a.i(w02);
                }
            });
        }
        InterfaceC9733uX interfaceC9733uX = this.f75439o;
        if (interfaceC9733uX != null) {
            interfaceC9733uX.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9840vX
    public final boolean a(Oc.Y1 y12, String str, C9626tX c9626tX, InterfaceC9733uX interfaceC9733uX) throws JSONException, RemoteException {
        AbstractC7278Ry abstractC7278RyZzk;
        if (str == null) {
            Sc.p.d("Ad unit ID should not be null for banner ad.");
            this.f75426b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.e40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74601a.j();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f76931O8)).booleanValue() && y12.f23359f) {
                this.f75427c.s().p(true);
            }
            Bundle bundleA = C8228gN.a(new Pair(EnumC8014eN.PUBLIC_API_CALL.a(), Long.valueOf(y12.f23379z)), new Pair(EnumC8014eN.DYNAMITE_ENTER.a(), Long.valueOf(Nc.v.c().a())));
            C9481s60 c9481s60 = this.f75435k;
            c9481s60.P(str);
            c9481s60.h(y12);
            c9481s60.a(bundleA);
            Context context = this.f75425a;
            C9695u60 c9695u60J = c9481s60.j();
            K80 k80B = J80.b(context, V80.f(c9695u60J), 3, y12);
            W80 w80F = null;
            if (!((Boolean) C9534sg.f79125d.e()).booleanValue() || !this.f75435k.D().f23410k) {
                if (((Boolean) Oc.A.c().a(C8784lf.f77098a8)).booleanValue()) {
                    InterfaceC7244Qy interfaceC7244QyL = this.f75427c.l();
                    GB gb2 = new GB();
                    gb2.f(this.f75425a);
                    gb2.k(c9695u60J);
                    interfaceC7244QyL.e(gb2.l());
                    XE xe2 = new XE();
                    xe2.m(this.f75428d, this.f75426b);
                    xe2.n(this.f75428d, this.f75426b);
                    interfaceC7244QyL.m(xe2.q());
                    interfaceC7244QyL.g(new C8770lW(this.f75431g));
                    interfaceC7244QyL.c(new BH(II.f68431h, null));
                    interfaceC7244QyL.l(new C9572sz(this.f75432h, this.f75434j));
                    interfaceC7244QyL.d(new C8608jy(this.f75430f));
                    abstractC7278RyZzk = interfaceC7244QyL.zzh();
                } else {
                    InterfaceC7244Qy interfaceC7244QyL2 = this.f75427c.l();
                    GB gb3 = new GB();
                    gb3.f(this.f75425a);
                    gb3.k(c9695u60J);
                    interfaceC7244QyL2.e(gb3.l());
                    XE xe3 = new XE();
                    xe3.m(this.f75428d, this.f75426b);
                    xe3.d(this.f75428d, this.f75426b);
                    xe3.d(this.f75429e, this.f75426b);
                    xe3.o(this.f75428d, this.f75426b);
                    xe3.g(this.f75428d, this.f75426b);
                    xe3.h(this.f75428d, this.f75426b);
                    xe3.i(this.f75428d, this.f75426b);
                    xe3.e(this.f75428d, this.f75426b);
                    xe3.n(this.f75428d, this.f75426b);
                    xe3.l(this.f75428d, this.f75426b);
                    interfaceC7244QyL2.m(xe3.q());
                    interfaceC7244QyL2.g(new C8770lW(this.f75431g));
                    interfaceC7244QyL2.c(new BH(II.f68431h, null));
                    interfaceC7244QyL2.l(new C9572sz(this.f75432h, this.f75434j));
                    interfaceC7244QyL2.d(new C8608jy(this.f75430f));
                    abstractC7278RyZzk = interfaceC7244QyL2.zzh();
                }
                if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
                    w80F = abstractC7278RyZzk.f();
                    w80F.i(3);
                    w80F.b(y12.f23369p);
                    w80F.f(y12.f23366m);
                }
                this.f75439o = interfaceC9733uX;
                C8207gA c8207gAD = abstractC7278RyZzk.d();
                com.google.common.util.concurrent.q qVarH = c8207gAD.h(c8207gAD.i());
                this.f75436l = qVarH;
                Mj0.r(qVarH, new C8089f40(this, w80F, k80B, abstractC7278RyZzk), this.f75426b);
                return true;
            }
            C8024eX c8024eX = this.f75428d;
            if (c8024eX != null) {
                c8024eX.C(V60.d(7, null, null));
            }
        } else if (!this.f75435k.s()) {
            this.f75437m = true;
        }
        return false;
    }

    public final ViewGroup b() {
        return this.f75430f;
    }

    public final C9481s60 e() {
        return this.f75435k;
    }

    public final void o(InterfaceC6883Gf interfaceC6883Gf) {
        this.f75431g = interfaceC6883Gf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        synchronized (this) {
            try {
                com.google.common.util.concurrent.q qVar = this.f75436l;
                if (qVar != null && qVar.isDone()) {
                    try {
                        AbstractC8929my abstractC8929my = (AbstractC8929my) this.f75436l.get();
                        this.f75436l = null;
                        this.f75430f.removeAllViews();
                        if (abstractC8929my.k() != null) {
                            ViewParent parent = abstractC8929my.k().getParent();
                            if (parent instanceof ViewGroup) {
                                Sc.p.g("Banner view provided from " + (abstractC8929my.c() != null ? abstractC8929my.c().zzg() : "") + " already has a parent view. Removing its old parent.");
                                ((ViewGroup) parent).removeView(abstractC8929my.k());
                            }
                        }
                        AbstractC7718bf abstractC7718bf = C8784lf.f77098a8;
                        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
                            C8534jE c8534jEE = abstractC8929my.e();
                            c8534jEE.a(this.f75428d);
                            c8534jEE.c(this.f75429e);
                        }
                        this.f75430f.addView(abstractC8929my.k());
                        InterfaceC9733uX interfaceC9733uX = this.f75439o;
                        if (interfaceC9733uX != null) {
                            interfaceC9733uX.zzb(abstractC8929my);
                        }
                        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
                            Executor executor = this.f75426b;
                            final C8024eX c8024eX = this.f75428d;
                            Objects.requireNonNull(c8024eX);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.d40
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c8024eX.zzs();
                                }
                            });
                        }
                        if (abstractC8929my.i() >= 0) {
                            this.f75437m = false;
                            this.f75432h.R0(abstractC8929my.i());
                            this.f75432h.S0(abstractC8929my.j());
                        } else {
                            this.f75437m = true;
                            this.f75432h.R0(abstractC8929my.j());
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        s();
                        Rc.p0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f75437m = true;
                        this.f75432h.zza();
                    } catch (ExecutionException e11) {
                        e = e11;
                        s();
                        Rc.p0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f75437m = true;
                        this.f75432h.zza();
                    }
                } else if (this.f75436l != null) {
                    Rc.p0.k("Show timer went off but there is an ongoing ad request.");
                    this.f75437m = true;
                } else {
                    Rc.p0.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f75437m = true;
                    this.f75432h.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void i(Oc.W0 w02) {
        this.f75428d.C(w02);
    }

    final /* synthetic */ void j() {
        this.f75428d.C(V60.d(6, null, null));
    }

    public final void k() {
        this.f75432h.R0(this.f75434j.a());
    }

    public final void l() {
        this.f75432h.S0(this.f75434j.b());
    }

    public final void m(Oc.E e10) {
        this.f75429e.a(e10);
    }

    public final void n(InterfaceC9067oD interfaceC9067oD) {
        this.f75432h.G0(interfaceC9067oD, this.f75426b);
    }

    public final boolean r() {
        Object parent = this.f75430f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        Nc.v.t();
        return Rc.D0.w(view, view.getContext());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9840vX
    public final boolean zza() {
        com.google.common.util.concurrent.q qVar = this.f75436l;
        return (qVar == null || qVar.isDone()) ? false : true;
    }

    public C8303h40(Context context, Executor executor, Oc.d2 d2Var, AbstractC9135ou abstractC9135ou, C8024eX c8024eX, C8452iX c8452iX, C9481s60 c9481s60, DE de2) {
        this.f75425a = context;
        this.f75426b = executor;
        this.f75427c = abstractC9135ou;
        this.f75428d = c8024eX;
        this.f75429e = c8452iX;
        this.f75435k = c9481s60;
        this.f75432h = abstractC9135ou.m();
        this.f75433i = abstractC9135ou.F();
        this.f75430f = new FrameLayout(context);
        this.f75434j = de2;
        c9481s60.O(d2Var);
        this.f75437m = true;
        this.f75438n = null;
        this.f75439o = null;
    }
}
