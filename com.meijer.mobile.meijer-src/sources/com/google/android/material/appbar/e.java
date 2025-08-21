package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import h2.C14442a;
import java.util.List;
import p2.r;

/* loaded from: classes4.dex */
abstract class e extends f<View> {

    /* renamed from: d, reason: collision with root package name */
    final Rect f87116d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f87117e;

    /* renamed from: f, reason: collision with root package name */
    private int f87118f;

    /* renamed from: g, reason: collision with root package name */
    private int f87119g;

    public e() {
        this.f87116d = new Rect();
        this.f87117e = new Rect();
        this.f87118f = 0;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    abstract View L(List<View> list);

    float N(View view) {
        return 1.0f;
    }

    protected boolean T() {
        return false;
    }

    final int M(View view) {
        if (this.f87119g == 0) {
            return 0;
        }
        float fN = N(view);
        int i10 = this.f87119g;
        return C14442a.b((int) (fN * i10), 0, i10);
    }

    public final int O() {
        return this.f87119g;
    }

    final int Q() {
        return this.f87118f;
    }

    public final void S(int i10) {
        this.f87119g = i10;
    }

    @Override // com.google.android.material.appbar.f
    protected void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View viewL = L(coordinatorLayout.s(view));
        if (viewL != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f87116d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewL.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewL.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            j lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.w(coordinatorLayout) && !ViewCompat.w(view)) {
                rect.left += lastWindowInsets.k();
                rect.right -= lastWindowInsets.l();
            }
            Rect rect2 = this.f87117e;
            r.a(R(fVar.f53857c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int iM = M(viewL);
            view.layout(rect2.left, rect2.top - iM, rect2.right, rect2.bottom - iM);
            this.f87118f = rect2.top - viewL.getBottom();
            return;
        }
        super.J(coordinatorLayout, view, i10);
        this.f87118f = 0;
    }

    int P(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View viewL;
        int i14;
        j lastWindowInsets;
        int i15 = view.getLayoutParams().height;
        if ((i15 == -1 || i15 == -2) && (viewL = L(coordinatorLayout.s(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                if (ViewCompat.w(viewL) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.m() + lastWindowInsets.j();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int iP = size + P(viewL);
            int measuredHeight = viewL.getMeasuredHeight();
            if (T()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                iP -= measuredHeight;
            }
            if (i15 == -1) {
                i14 = 1073741824;
            } else {
                i14 = Integer.MIN_VALUE;
            }
            coordinatorLayout.L(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iP, i14), i13);
            return true;
        }
        return false;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87116d = new Rect();
        this.f87117e = new Rect();
        this.f87118f = 0;
    }
}
