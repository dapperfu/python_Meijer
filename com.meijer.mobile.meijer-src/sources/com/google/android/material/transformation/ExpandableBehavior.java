package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;
import ne.InterfaceC15937a;

@Deprecated
/* loaded from: classes4.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a, reason: collision with root package name */
    private int f88823a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f88824a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f88825b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15937a f88826c;

        a(View view, int i10, InterfaceC15937a interfaceC15937a) {
            this.f88824a = view;
            this.f88825b = i10;
            this.f88826c = interfaceC15937a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f88824a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f88823a == this.f88825b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC15937a interfaceC15937a = this.f88826c;
                expandableBehavior.L((View) interfaceC15937a, this.f88824a, interfaceC15937a.c(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f88823a = 0;
    }

    private boolean J(boolean z10) {
        if (!z10) {
            return this.f88823a == 1;
        }
        int i10 = this.f88823a;
        return i10 == 0 || i10 == 2;
    }

    protected abstract boolean L(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC15937a interfaceC15937a = (InterfaceC15937a) view2;
        if (!J(interfaceC15937a.c())) {
            return false;
        }
        this.f88823a = interfaceC15937a.c() ? 1 : 2;
        return L((View) interfaceC15937a, view, interfaceC15937a.c(), true);
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88823a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected InterfaceC15937a K(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listS = coordinatorLayout.s(view);
        int size = listS.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = listS.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (InterfaceC15937a) view2;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        InterfaceC15937a interfaceC15937aK;
        int i11;
        if (!ViewCompat.S(view) && (interfaceC15937aK = K(coordinatorLayout, view)) != null && J(interfaceC15937aK.c())) {
            if (interfaceC15937aK.c()) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f88823a = i11;
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, interfaceC15937aK));
            return false;
        }
        return false;
    }
}
