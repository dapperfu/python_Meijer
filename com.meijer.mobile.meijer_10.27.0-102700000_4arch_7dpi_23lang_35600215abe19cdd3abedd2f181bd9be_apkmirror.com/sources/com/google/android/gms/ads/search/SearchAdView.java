package com.google.android.gms.ads.search;

import Ec.c;
import Ec.e;
import Mc.C4124i1;
import Qc.p;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public final class SearchAdView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final C4124i1 f64681a;

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
        e adSize;
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

    public c getAdListener() {
        return this.f64681a.e();
    }

    public e getAdSize() {
        return this.f64681a.f();
    }

    public String getAdUnitId() {
        return this.f64681a.n();
    }

    public void setAdListener(c cVar) {
        this.f64681a.u(cVar);
    }

    public void setAdUnitId(String str) {
        this.f64681a.x(str);
    }

    public void setAdSize(e eVar) {
        this.f64681a.v(eVar);
    }
}
