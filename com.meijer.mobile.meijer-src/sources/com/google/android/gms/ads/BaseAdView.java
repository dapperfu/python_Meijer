package com.google.android.gms.ads;

import Gc.j;
import Oc.A;
import Oc.C4402i1;
import Oc.InterfaceC4376a;
import Sc.p;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8679kg;
import com.google.android.gms.internal.ads.C8784lf;

/* loaded from: classes4.dex */
public abstract class BaseAdView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final C4402i1 f65385a;

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
        Gc.e adSize;
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
        return this.f65385a.a();
    }

    public void c(final c cVar) {
        r.e("#008 Must be called on the main UI thread.");
        C8784lf.a(getContext());
        if (((Boolean) C8679kg.f76530f.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77115bb)).booleanValue()) {
                Sc.c.f34487b.execute(new Runnable() { // from class: com.google.android.gms.ads.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f65401a;
                        try {
                            baseAdView.f65385a.q(cVar.f65395a);
                        } catch (IllegalStateException e10) {
                            C7267Rn.c(baseAdView.getContext()).b(e10, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f65385a.q(cVar.f65395a);
    }

    public Gc.c getAdListener() {
        return this.f65385a.e();
    }

    public Gc.e getAdSize() {
        return this.f65385a.f();
    }

    public String getAdUnitId() {
        return this.f65385a.n();
    }

    public j getOnPaidEventListener() {
        this.f65385a.g();
        return null;
    }

    public Gc.p getResponseInfo() {
        return this.f65385a.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(Gc.c cVar) {
        this.f65385a.u(cVar);
        if (cVar == 0) {
            this.f65385a.t(null);
            return;
        }
        if (cVar instanceof InterfaceC4376a) {
            this.f65385a.t((InterfaceC4376a) cVar);
        }
        if (cVar instanceof Hc.c) {
            this.f65385a.y((Hc.c) cVar);
        }
    }

    public void setAdUnitId(String str) {
        this.f65385a.x(str);
    }

    public void setOnPaidEventListener(j jVar) {
        this.f65385a.A(jVar);
    }

    protected BaseAdView(Context context, int i10) {
        super(context);
        this.f65385a = new C4402i1(this, i10);
    }

    public void a() {
        C8784lf.a(getContext());
        if (((Boolean) C8679kg.f76529e.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77073Ya)).booleanValue()) {
                Sc.c.f34487b.execute(new Runnable() { // from class: com.google.android.gms.ads.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f65399a;
                        try {
                            baseAdView.f65385a.o();
                        } catch (IllegalStateException e10) {
                            C7267Rn.c(baseAdView.getContext()).b(e10, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f65385a.o();
    }

    public void d() {
        C8784lf.a(getContext());
        if (((Boolean) C8679kg.f76531g.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77087Za)).booleanValue()) {
                Sc.c.f34487b.execute(new Runnable() { // from class: com.google.android.gms.ads.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f65400a;
                        try {
                            baseAdView.f65385a.r();
                        } catch (IllegalStateException e10) {
                            C7267Rn.c(baseAdView.getContext()).b(e10, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f65385a.r();
    }

    public void e() {
        C8784lf.a(getContext());
        if (((Boolean) C8679kg.f76532h.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77059Xa)).booleanValue()) {
                Sc.c.f34487b.execute(new Runnable() { // from class: com.google.android.gms.ads.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f65398a;
                        try {
                            baseAdView.f65385a.s();
                        } catch (IllegalStateException e10) {
                            C7267Rn.c(baseAdView.getContext()).b(e10, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f65385a.s();
    }

    public void setAdSize(Gc.e eVar) {
        this.f65385a.v(eVar);
    }
}
