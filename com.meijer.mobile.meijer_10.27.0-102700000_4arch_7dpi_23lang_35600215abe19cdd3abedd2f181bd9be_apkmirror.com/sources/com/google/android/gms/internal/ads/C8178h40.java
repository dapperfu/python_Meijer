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
public final class C8178h40 implements InterfaceC9715vX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f74585a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f74586b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC9010ou f74587c;

    /* renamed from: d, reason: collision with root package name */
    private final C7899eX f74588d;

    /* renamed from: e, reason: collision with root package name */
    private final C8327iX f74589e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f74590f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC6758Gf f74591g;

    /* renamed from: h, reason: collision with root package name */
    private final C9583uD f74592h;

    /* renamed from: i, reason: collision with root package name */
    private final Z80 f74593i;

    /* renamed from: j, reason: collision with root package name */
    private final DE f74594j;

    /* renamed from: k, reason: collision with root package name */
    private final C9356s60 f74595k;

    /* renamed from: l, reason: collision with root package name */
    private com.google.common.util.concurrent.q f74596l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f74597m;

    /* renamed from: n, reason: collision with root package name */
    private Mc.W0 f74598n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC9608uX f74599o;

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        this.f74596l = null;
        final Mc.W0 w02 = this.f74598n;
        this.f74598n = null;
        if (((Boolean) Mc.A.c().a(C8659lf.f76258a8)).booleanValue() && w02 != null) {
            this.f74586b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.c40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73090a.i(w02);
                }
            });
        }
        InterfaceC9608uX interfaceC9608uX = this.f74599o;
        if (interfaceC9608uX != null) {
            interfaceC9608uX.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9715vX
    public final boolean a(Mc.Y1 y12, String str, C9501tX c9501tX, InterfaceC9608uX interfaceC9608uX) throws JSONException, RemoteException {
        AbstractC7153Ry abstractC7153RyZzk;
        if (str == null) {
            Qc.p.d("Ad unit ID should not be null for banner ad.");
            this.f74586b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.e40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73761a.j();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76091O8)).booleanValue() && y12.f19172f) {
                this.f74587c.s().p(true);
            }
            Bundle bundleA = C8103gN.a(new Pair(EnumC7889eN.PUBLIC_API_CALL.a(), Long.valueOf(y12.f19192z)), new Pair(EnumC7889eN.DYNAMITE_ENTER.a(), Long.valueOf(Lc.v.c().a())));
            C9356s60 c9356s60 = this.f74595k;
            c9356s60.P(str);
            c9356s60.h(y12);
            c9356s60.a(bundleA);
            Context context = this.f74585a;
            C9570u60 c9570u60J = c9356s60.j();
            K80 k80B = J80.b(context, V80.f(c9570u60J), 3, y12);
            W80 w80F = null;
            if (!((Boolean) C9409sg.f78285d.e()).booleanValue() || !this.f74595k.D().f19223k) {
                if (((Boolean) Mc.A.c().a(C8659lf.f76258a8)).booleanValue()) {
                    InterfaceC7119Qy interfaceC7119QyL = this.f74587c.l();
                    GB gb2 = new GB();
                    gb2.f(this.f74585a);
                    gb2.k(c9570u60J);
                    interfaceC7119QyL.e(gb2.l());
                    XE xe2 = new XE();
                    xe2.m(this.f74588d, this.f74586b);
                    xe2.n(this.f74588d, this.f74586b);
                    interfaceC7119QyL.m(xe2.q());
                    interfaceC7119QyL.g(new C8645lW(this.f74591g));
                    interfaceC7119QyL.c(new BH(II.f67591h, null));
                    interfaceC7119QyL.l(new C9447sz(this.f74592h, this.f74594j));
                    interfaceC7119QyL.d(new C8483jy(this.f74590f));
                    abstractC7153RyZzk = interfaceC7119QyL.zzh();
                } else {
                    InterfaceC7119Qy interfaceC7119QyL2 = this.f74587c.l();
                    GB gb3 = new GB();
                    gb3.f(this.f74585a);
                    gb3.k(c9570u60J);
                    interfaceC7119QyL2.e(gb3.l());
                    XE xe3 = new XE();
                    xe3.m(this.f74588d, this.f74586b);
                    xe3.d(this.f74588d, this.f74586b);
                    xe3.d(this.f74589e, this.f74586b);
                    xe3.o(this.f74588d, this.f74586b);
                    xe3.g(this.f74588d, this.f74586b);
                    xe3.h(this.f74588d, this.f74586b);
                    xe3.i(this.f74588d, this.f74586b);
                    xe3.e(this.f74588d, this.f74586b);
                    xe3.n(this.f74588d, this.f74586b);
                    xe3.l(this.f74588d, this.f74586b);
                    interfaceC7119QyL2.m(xe3.q());
                    interfaceC7119QyL2.g(new C8645lW(this.f74591g));
                    interfaceC7119QyL2.c(new BH(II.f67591h, null));
                    interfaceC7119QyL2.l(new C9447sz(this.f74592h, this.f74594j));
                    interfaceC7119QyL2.d(new C8483jy(this.f74590f));
                    abstractC7153RyZzk = interfaceC7119QyL2.zzh();
                }
                if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
                    w80F = abstractC7153RyZzk.f();
                    w80F.i(3);
                    w80F.b(y12.f19182p);
                    w80F.f(y12.f19179m);
                }
                this.f74599o = interfaceC9608uX;
                C8082gA c8082gAD = abstractC7153RyZzk.d();
                com.google.common.util.concurrent.q qVarH = c8082gAD.h(c8082gAD.i());
                this.f74596l = qVarH;
                Mj0.r(qVarH, new C7964f40(this, w80F, k80B, abstractC7153RyZzk), this.f74586b);
                return true;
            }
            C7899eX c7899eX = this.f74588d;
            if (c7899eX != null) {
                c7899eX.g0(V60.d(7, null, null));
            }
        } else if (!this.f74595k.s()) {
            this.f74597m = true;
        }
        return false;
    }

    public final ViewGroup b() {
        return this.f74590f;
    }

    public final C9356s60 e() {
        return this.f74595k;
    }

    public final void o(InterfaceC6758Gf interfaceC6758Gf) {
        this.f74591g = interfaceC6758Gf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        synchronized (this) {
            try {
                com.google.common.util.concurrent.q qVar = this.f74596l;
                if (qVar != null && qVar.isDone()) {
                    try {
                        AbstractC8804my abstractC8804my = (AbstractC8804my) this.f74596l.get();
                        this.f74596l = null;
                        this.f74590f.removeAllViews();
                        if (abstractC8804my.k() != null) {
                            ViewParent parent = abstractC8804my.k().getParent();
                            if (parent instanceof ViewGroup) {
                                Qc.p.g("Banner view provided from " + (abstractC8804my.c() != null ? abstractC8804my.c().zzg() : "") + " already has a parent view. Removing its old parent.");
                                ((ViewGroup) parent).removeView(abstractC8804my.k());
                            }
                        }
                        AbstractC7593bf abstractC7593bf = C8659lf.f76258a8;
                        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
                            C8409jE c8409jEE = abstractC8804my.e();
                            c8409jEE.a(this.f74588d);
                            c8409jEE.c(this.f74589e);
                        }
                        this.f74590f.addView(abstractC8804my.k());
                        InterfaceC9608uX interfaceC9608uX = this.f74599o;
                        if (interfaceC9608uX != null) {
                            interfaceC9608uX.zzb(abstractC8804my);
                        }
                        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
                            Executor executor = this.f74586b;
                            final C7899eX c7899eX = this.f74588d;
                            Objects.requireNonNull(c7899eX);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.d40
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c7899eX.zzs();
                                }
                            });
                        }
                        if (abstractC8804my.i() >= 0) {
                            this.f74597m = false;
                            this.f74592h.R0(abstractC8804my.i());
                            this.f74592h.S0(abstractC8804my.j());
                        } else {
                            this.f74597m = true;
                            this.f74592h.R0(abstractC8804my.j());
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        s();
                        Pc.p0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f74597m = true;
                        this.f74592h.zza();
                    } catch (ExecutionException e11) {
                        e = e11;
                        s();
                        Pc.p0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f74597m = true;
                        this.f74592h.zza();
                    }
                } else if (this.f74596l != null) {
                    Pc.p0.k("Show timer went off but there is an ongoing ad request.");
                    this.f74597m = true;
                } else {
                    Pc.p0.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f74597m = true;
                    this.f74592h.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void i(Mc.W0 w02) {
        this.f74588d.g0(w02);
    }

    final /* synthetic */ void j() {
        this.f74588d.g0(V60.d(6, null, null));
    }

    public final void k() {
        this.f74592h.R0(this.f74594j.a());
    }

    public final void l() {
        this.f74592h.S0(this.f74594j.b());
    }

    public final void m(Mc.E e10) {
        this.f74589e.a(e10);
    }

    public final void n(InterfaceC8942oD interfaceC8942oD) {
        this.f74592h.H0(interfaceC8942oD, this.f74586b);
    }

    public final boolean r() {
        Object parent = this.f74590f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        Lc.v.t();
        return Pc.D0.w(view, view.getContext());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9715vX
    public final boolean zza() {
        com.google.common.util.concurrent.q qVar = this.f74596l;
        return (qVar == null || qVar.isDone()) ? false : true;
    }

    public C8178h40(Context context, Executor executor, Mc.d2 d2Var, AbstractC9010ou abstractC9010ou, C7899eX c7899eX, C8327iX c8327iX, C9356s60 c9356s60, DE de2) {
        this.f74585a = context;
        this.f74586b = executor;
        this.f74587c = abstractC9010ou;
        this.f74588d = c7899eX;
        this.f74589e = c8327iX;
        this.f74595k = c9356s60;
        this.f74592h = abstractC9010ou.m();
        this.f74593i = abstractC9010ou.F();
        this.f74590f = new FrameLayout(context);
        this.f74594j = de2;
        c9356s60.O(d2Var);
        this.f74597m = true;
        this.f74598n = null;
        this.f74599o = null;
    }
}
