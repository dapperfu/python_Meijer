package com.google.android.gms.ads;

import Ec.j;
import Mc.A;
import Mc.C4124i1;
import Mc.InterfaceC4098a;
import Qc.p;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8554kg;
import com.google.android.gms.internal.ads.C8659lf;

/* loaded from: classes4.dex */
public abstract class BaseAdView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final C4124i1 f64545a;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        Ec.e adSize;
        int iB;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e10) {
                p.e("Unable to retrieve ad size.", e10);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int iD = adSize.d(context);
                iB = adSize.b(context);
                measuredWidth = iD;
            } else {
                iB = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            measuredWidth = childAt.getMeasuredWidth();
            iB = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(iB, getSuggestedMinimumHeight()), i11));
    }

    public boolean b() {
        return this.f64545a.a();
    }

    public void c(final c cVar) {
        r.e("#008 Must be called on the main UI thread.");
        C8659lf.a(getContext());
        if (((Boolean) C8554kg.f75690f.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76275bb)).booleanValue()) {
                Qc.c.f29937b.execute(new Runnable() { // from class: com.google.android.gms.ads.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f64561a;
                        try {
                            baseAdView.f64545a.q(cVar.f64555a);
                        } catch (IllegalStateException e10) {
                            C7142Rn.c(baseAdView.getContext()).b(e10, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f64545a.q(cVar.f64555a);
    }

    public Ec.c getAdListener() {
        return this.f64545a.e();
    }

    public Ec.e getAdSize() {
        return this.f64545a.f();
    }

    public String getAdUnitId() {
        return this.f64545a.n();
    }

    public j getOnPaidEventListener() {
        this.f64545a.g();
        return null;
    }

    public Ec.p getResponseInfo() {
        return this.f64545a.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(Ec.c cVar) {
        this.f64545a.u(cVar);
        if (cVar == 0) {
            this.f64545a.t(null);
            return;
        }
        if (cVar instanceof InterfaceC4098a) {
            this.f64545a.t((InterfaceC4098a) cVar);
        }
        if (cVar instanceof Fc.c) {
            this.f64545a.y((Fc.c) cVar);
        }
    }

    public void setAdUnitId(String str) {
        this.f64545a.x(str);
    }

    public void setOnPaidEventListener(j jVar) {
        this.f64545a.A(jVar);
    }

    protected BaseAdView(Context context, int i10) {
        super(context);
        this.f64545a = new C4124i1(this, i10);
    }

    public void a() {
        C8659lf.a(getContext());
        if (((Boolean) C8554kg.f75689e.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76233Ya)).booleanValue()) {
                Qc.c.f29937b.execute(new Runnable() { // from class: com.google.android.gms.ads.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f64559a;
                        try {
                            baseAdView.f64545a.o();
                        } catch (IllegalStateException e10) {
                            C7142Rn.c(baseAdView.getContext()).b(e10, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f64545a.o();
    }

    public void d() {
        C8659lf.a(getContext());
        if (((Boolean) C8554kg.f75691g.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76247Za)).booleanValue()) {
                Qc.c.f29937b.execute(new Runnable() { // from class: com.google.android.gms.ads.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f64560a;
                        try {
                            baseAdView.f64545a.r();
                        } catch (IllegalStateException e10) {
                            C7142Rn.c(baseAdView.getContext()).b(e10, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f64545a.r();
    }

    public void e() {
        C8659lf.a(getContext());
        if (((Boolean) C8554kg.f75692h.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76219Xa)).booleanValue()) {
                Qc.c.f29937b.execute(new Runnable() { // from class: com.google.android.gms.ads.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f64558a;
                        try {
                            baseAdView.f64545a.s();
                        } catch (IllegalStateException e10) {
                            C7142Rn.c(baseAdView.getContext()).b(e10, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f64545a.s();
    }

    public void setAdSize(Ec.e eVar) {
        this.f64545a.v(eVar);
    }
}
