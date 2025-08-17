package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;
import le.InterfaceC15403a;

@Deprecated
/* loaded from: classes4.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a, reason: collision with root package name */
    private int f87983a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f87984a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87985b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15403a f87986c;

        a(View view, int i10, InterfaceC15403a interfaceC15403a) {
            this.f87984a = view;
            this.f87985b = i10;
            this.f87986c = interfaceC15403a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f87984a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f87983a == this.f87985b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC15403a interfaceC15403a = this.f87986c;
                expandableBehavior.L((View) interfaceC15403a, this.f87984a, interfaceC15403a.c(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f87983a = 0;
    }

    private boolean J(boolean z10) {
        if (!z10) {
            return this.f87983a == 1;
        }
        int i10 = this.f87983a;
        return i10 == 0 || i10 == 2;
    }

    protected abstract boolean L(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC15403a interfaceC15403a = (InterfaceC15403a) view2;
        if (!J(interfaceC15403a.c())) {
            return false;
        }
        this.f87983a = interfaceC15403a.c() ? 1 : 2;
        return L((View) interfaceC15403a, view, interfaceC15403a.c(), true);
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87983a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected InterfaceC15403a K(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listS = coordinatorLayout.s(view);
        int size = listS.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = listS.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (InterfaceC15403a) view2;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        InterfaceC15403a interfaceC15403aK;
        int i11;
        if (!ViewCompat.S(view) && (interfaceC15403aK = K(coordinatorLayout, view)) != null && J(interfaceC15403aK.c())) {
            if (interfaceC15403aK.c()) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f87983a = i11;
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, interfaceC15403aK));
            return false;
        }
        return false;
    }
}
