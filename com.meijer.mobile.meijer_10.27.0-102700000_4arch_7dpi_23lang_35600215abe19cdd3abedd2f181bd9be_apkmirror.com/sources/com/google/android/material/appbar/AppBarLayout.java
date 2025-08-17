package com.google.android.material.appbar;

import ae.C5597b;
import ae.k;
import ae.l;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import be.C6230a;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.internal.s;
import d2.C13462a;
import h2.C14329a;
import ie.C14718a;
import j.C14791a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.i;
import oe.C16026c;
import p2.G;
import p2.InterfaceC16196B;
import q2.y;
import re.C16760h;
import re.C16761i;
import ue.C17250a;
import w2.AbstractC17751a;

/* loaded from: classes4.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b, FSDraw, FSDispatchDraw {

    /* renamed from: z, reason: collision with root package name */
    private static final int f86167z = k.f44794j;

    /* renamed from: a, reason: collision with root package name */
    private int f86168a;

    /* renamed from: b, reason: collision with root package name */
    private int f86169b;

    /* renamed from: c, reason: collision with root package name */
    private int f86170c;

    /* renamed from: d, reason: collision with root package name */
    private int f86171d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f86172e;

    /* renamed from: f, reason: collision with root package name */
    private int f86173f;

    /* renamed from: g, reason: collision with root package name */
    private j f86174g;

    /* renamed from: h, reason: collision with root package name */
    private List<b> f86175h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f86176i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f86177j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f86178k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f86179l;

    /* renamed from: m, reason: collision with root package name */
    private int f86180m;

    /* renamed from: n, reason: collision with root package name */
    private WeakReference<View> f86181n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f86182o;

    /* renamed from: p, reason: collision with root package name */
    private ValueAnimator f86183p;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f86184q;

    /* renamed from: r, reason: collision with root package name */
    private final List<f> f86185r;

    /* renamed from: s, reason: collision with root package name */
    private final long f86186s;

    /* renamed from: t, reason: collision with root package name */
    private final TimeInterpolator f86187t;

    /* renamed from: u, reason: collision with root package name */
    private int[] f86188u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f86189v;

    /* renamed from: w, reason: collision with root package name */
    private Integer f86190w;

    /* renamed from: x, reason: collision with root package name */
    private final float f86191x;

    /* renamed from: y, reason: collision with root package name */
    private Behavior f86192y;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.d<T> {

        /* renamed from: k, reason: collision with root package name */
        private int f86193k;

        /* renamed from: l, reason: collision with root package name */
        private int f86194l;

        /* renamed from: m, reason: collision with root package name */
        private ValueAnimator f86195m;

        /* renamed from: n, reason: collision with root package name */
        private c f86196n;

        /* renamed from: o, reason: collision with root package name */
        private WeakReference<View> f86197o;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f86198a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f86199b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f86198a = coordinatorLayout;
                this.f86199b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f86198a, this.f86199b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends androidx.core.view.a {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f86201d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f86202e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f86201d = appBarLayout;
                this.f86202e = coordinatorLayout;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.a
            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f86201d.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                }
                if (BaseBehavior.this.Q() != 0) {
                    View viewJ0 = BaseBehavior.this.j0(this.f86202e);
                    if (!viewJ0.canScrollVertically(-1)) {
                        this.f86201d.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f86201d.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.u(this.f86202e, this.f86201d, viewJ0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.core.view.a
            public void g(View view, y yVar) {
                View viewJ0;
                super.g(view, yVar);
                yVar.p0(ScrollView.class.getName());
                if (this.f86201d.getTotalScrollRange() != 0 && (viewJ0 = BaseBehavior.this.j0(this.f86202e)) != null && BaseBehavior.this.f0(this.f86201d)) {
                    if (BaseBehavior.this.Q() != (-this.f86201d.getTotalScrollRange())) {
                        yVar.b(y.a.f156736q);
                        yVar.R0(true);
                    }
                    if (BaseBehavior.this.Q() != 0) {
                        if (viewJ0.canScrollVertically(-1)) {
                            if ((-this.f86201d.getDownNestedPreScrollRange()) != 0) {
                                yVar.b(y.a.f156737r);
                                yVar.R0(true);
                                return;
                            }
                            return;
                        }
                        yVar.b(y.a.f156737r);
                        yVar.R0(true);
                    }
                }
            }
        }

        public BaseBehavior() {
        }

        private static boolean e0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        protected static class c extends AbstractC17751a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            boolean f86204c;

            /* renamed from: d, reason: collision with root package name */
            boolean f86205d;

            /* renamed from: e, reason: collision with root package name */
            int f86206e;

            /* renamed from: f, reason: collision with root package name */
            float f86207f;

            /* renamed from: g, reason: collision with root package name */
            boolean f86208g;

            class a implements Parcelable.ClassLoaderCreator<c> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public c[] newArray(int i10) {
                    return new c[i10];
                }

                a() {
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f86204c = parcel.readByte() != 0;
                this.f86205d = parcel.readByte() != 0;
                this.f86206e = parcel.readInt();
                this.f86207f = parcel.readFloat();
                this.f86208g = parcel.readByte() != 0;
            }

            @Override // w2.AbstractC17751a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f86204c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f86205d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f86206e);
                parcel.writeFloat(this.f86207f);
                parcel.writeByte(this.f86208g ? (byte) 1 : (byte) 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private int b0(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(T t10) {
            WeakReference<View> weakReference = this.f86197o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void u(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
            /*
                r6 = this;
                if (r11 == 0) goto L26
                if (r11 >= 0) goto L11
                int r10 = r8.getTotalScrollRange()
                int r10 = -r10
                int r13 = r8.getDownNestedPreScrollRange()
                int r13 = r13 + r10
            Le:
                r4 = r10
                r5 = r13
                goto L18
            L11:
                int r10 = r8.getUpNestedPreScrollRange()
                int r10 = -r10
                r13 = 0
                goto Le
            L18:
                if (r4 == r5) goto L26
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.S(r1, r2, r3, r4, r5)
                r12[r10] = r7
                goto L27
            L26:
                r2 = r8
            L27:
                boolean r7 = r2.q()
                if (r7 == 0) goto L34
                boolean r7 = r2.D(r9)
                r2.A(r7)
            L34:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t11;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t11 = t10;
                i15 = i13;
                iArr[1] = S(coordinatorLayout2, t11, i15, -t10.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t11 = t10;
                i15 = i13;
            }
            if (i15 == 0) {
                Y(coordinatorLayout2, t11);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (parcelable instanceof c) {
                w0((c) parcelable, true);
                super.B(coordinatorLayout, t10, this.f86196n.a());
            } else {
                super.B(coordinatorLayout, t10, parcelable);
                this.f86196n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.q() || d0(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f86195m) != null) {
                valueAnimator.cancel();
            }
            this.f86197o = null;
            this.f86194l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f86194l == 0 || i10 == 1) {
                A0(coordinatorLayout, t10);
                if (t10.q()) {
                    t10.A(t10.D(view));
                }
            }
            this.f86197o = new WeakReference<>(view);
        }

        void w0(c cVar, boolean z10) {
            if (this.f86196n == null || z10) {
                this.f86196n = cVar;
            }
        }

        private void A0(CoordinatorLayout coordinatorLayout, T t10) {
            int topInset = t10.getTopInset() + t10.getPaddingTop();
            int iQ = Q() - topInset;
            int iI0 = i0(t10, iQ);
            if (iI0 >= 0) {
                View childAt = t10.getChildAt(iI0);
                e eVar = (e) childAt.getLayoutParams();
                int iC = eVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iA = -childAt.getBottom();
                    if (iI0 == 0 && ViewCompat.w(t10) && ViewCompat.w(childAt)) {
                        topInset2 -= t10.getTopInset();
                    }
                    if (e0(iC, 2)) {
                        iA += ViewCompat.A(childAt);
                    } else if (e0(iC, 5)) {
                        int iA2 = ViewCompat.A(childAt) + iA;
                        if (iQ < iA2) {
                            topInset2 = iA2;
                        } else {
                            iA = iA2;
                        }
                    }
                    if (e0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        iA -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    Z(coordinatorLayout, t10, C14329a.b(b0(iQ, iA, topInset2) + topInset, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void B0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, boolean z10) {
            View viewH0 = h0(t10, i10);
            boolean zD = false;
            if (viewH0 != null) {
                int iC = ((e) viewH0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iA = ViewCompat.A(viewH0);
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewH0.getBottom() - iA) - t10.getTopInset()) : (-i10) >= (viewH0.getBottom() - iA) - t10.getTopInset()) {
                        zD = true;
                    }
                }
            }
            if (t10.q()) {
                zD = t10.D(g0(coordinatorLayout));
            }
            boolean zA = t10.A(zD);
            if (z10 || (zA && z0(coordinatorLayout, t10))) {
                if (t10.getBackground() != null) {
                    t10.getBackground().jumpToCurrentState();
                }
                if (t10.getForeground() != null) {
                    t10.getForeground().jumpToCurrentState();
                }
                if (t10.getStateListAnimator() != null) {
                    t10.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void Y(CoordinatorLayout coordinatorLayout, T t10) {
            if (!ViewCompat.N(coordinatorLayout)) {
                ViewCompat.m0(coordinatorLayout, new b(t10, coordinatorLayout));
            }
        }

        private void Z(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int height;
            int iAbs = Math.abs(Q() - i10);
            float fAbs = Math.abs(f10);
            if (fAbs > 0.0f) {
                height = Math.round((iAbs / fAbs) * 1000.0f) * 3;
            } else {
                height = (int) (((iAbs / t10.getHeight()) + 1.0f) * 150.0f);
            }
            a0(coordinatorLayout, t10, i10, height);
        }

        private void a0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int iQ = Q();
            if (iQ == i10) {
                ValueAnimator valueAnimator = this.f86195m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f86195m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f86195m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f86195m = valueAnimator3;
                valueAnimator3.setInterpolator(C6230a.f60119e);
                this.f86195m.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f86195m.setDuration(Math.min(i11, 600));
            this.f86195m.setIntValues(iQ, i10);
            this.f86195m.start();
        }

        private boolean d0(CoordinatorLayout coordinatorLayout, T t10, View view) {
            if (t10.m() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight()) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((e) appBarLayout.getChildAt(i10).getLayoutParams()).f86212a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof InterfaceC16196B) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View h0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (e0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int m0(T t10, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int topInset = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator interpolatorD = eVar.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD != null) {
                        int iC = eVar.c();
                        if ((iC & 1) != 0) {
                            topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                            if ((iC & 2) != 0) {
                                topInset -= ViewCompat.A(childAt);
                            }
                        }
                        if (ViewCompat.w(childAt)) {
                            topInset -= t10.getTopInset();
                        }
                        if (topInset > 0) {
                            float f10 = topInset;
                            return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                        }
                    }
                } else {
                    i11++;
                }
            }
            return i10;
        }

        private boolean z0(CoordinatorLayout coordinatorLayout, T t10) {
            List<View> listT = coordinatorLayout.t(t10);
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) listT.get(i10).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) cVarF).O() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.d
        int Q() {
            return I() + this.f86193k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(T t10) {
            return (-t10.getDownNestedScrollRange()) + t10.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(T t10) {
            return t10.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(CoordinatorLayout coordinatorLayout, T t10) {
            A0(coordinatorLayout, t10);
            if (t10.q()) {
                t10.A(t10.D(g0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, T t10, int i10) {
            boolean z10;
            int iRound;
            boolean zP = super.p(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            c cVar = this.f86196n;
            if (cVar != null && (pendingAction & 8) == 0) {
                if (cVar.f86204c) {
                    T(coordinatorLayout, t10, -t10.getTotalScrollRange());
                } else if (cVar.f86205d) {
                    T(coordinatorLayout, t10, 0);
                } else {
                    View childAt = t10.getChildAt(cVar.f86206e);
                    int i11 = -childAt.getBottom();
                    if (this.f86196n.f86208g) {
                        iRound = ViewCompat.A(childAt) + t10.getTopInset();
                    } else {
                        iRound = Math.round(childAt.getHeight() * this.f86196n.f86207f);
                    }
                    T(coordinatorLayout, t10, i11 + iRound);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i12 = -t10.getUpNestedPreScrollRange();
                    if (z10) {
                        Z(coordinatorLayout, t10, i12, 0.0f);
                    } else {
                        T(coordinatorLayout, t10, i12);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        Z(coordinatorLayout, t10, 0, 0.0f);
                    } else {
                        T(coordinatorLayout, t10, 0);
                    }
                }
            }
            t10.w();
            this.f86196n = null;
            K(C14329a.b(I(), -t10.getTotalScrollRange(), 0));
            B0(coordinatorLayout, t10, I(), 0, true);
            t10.s(I());
            Y(coordinatorLayout, t10);
            return zP;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t10.getLayoutParams())).height == -2) {
                coordinatorLayout.L(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
                return true;
            }
            return super.q(coordinatorLayout, t10, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable parcelableC = super.C(coordinatorLayout, t10);
            c cVarX0 = x0(parcelableC, t10);
            if (cVarX0 == null) {
                return parcelableC;
            }
            return cVarX0;
        }

        c x0(Parcelable parcelable, T t10) {
            boolean z10;
            boolean z11;
            int I10 = I();
            int childCount = t10.getChildCount();
            boolean z12 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + I10;
                if (childAt.getTop() + I10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC17751a.f165651b;
                    }
                    c cVar = new c(parcelable);
                    if (I10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f86205d = z10;
                    if (!z10 && (-I10) >= t10.getTotalScrollRange()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.f86204c = z11;
                    cVar.f86206e = i10;
                    if (bottom == ViewCompat.A(childAt) + t10.getTopInset()) {
                        z12 = true;
                    }
                    cVar.f86208g = z12;
                    cVar.f86207f = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            T t11;
            int iM0;
            int iQ = Q();
            int i13 = 0;
            if (i11 != 0 && iQ >= i11 && iQ <= i12) {
                int iB = C14329a.b(i10, i11, i12);
                if (iQ != iB) {
                    if (t10.k()) {
                        iM0 = m0(t10, iB);
                    } else {
                        iM0 = iB;
                    }
                    boolean zK = K(iM0);
                    int i14 = iQ - iB;
                    this.f86193k = iB - iM0;
                    int i15 = 1;
                    if (zK) {
                        while (i13 < t10.getChildCount()) {
                            e eVar = (e) t10.getChildAt(i13).getLayoutParams();
                            c cVarB = eVar.b();
                            if (cVarB != null && (eVar.c() & 1) != 0) {
                                cVarB.a(t10, t10.getChildAt(i13), I());
                            }
                            i13++;
                        }
                    }
                    if (!zK && t10.k()) {
                        coordinatorLayout.g(t10);
                    }
                    t10.s(I());
                    if (iB < iQ) {
                        i15 = -1;
                    }
                    coordinatorLayout2 = coordinatorLayout;
                    t11 = t10;
                    B0(coordinatorLayout2, t11, iB, i15, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t11 = t10;
                }
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t11 = t10;
                this.f86193k = 0;
            }
            Y(coordinatorLayout2, t11);
            return i13;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean K(int i10) {
            return super.K(i10);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.p(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.u(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.G(coordinatorLayout, appBarLayout, view, i10);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.e {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f45406y6);
            S(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45418z6, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        private void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.q()) {
                    appBarLayout.A(appBarLayout.D(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.e
        float N(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iV = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iV > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iV / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.e
        int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.m0(coordinatorLayout, null);
            }
        }

        private static int V(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).Q();
            }
            return 0;
        }

        private void W(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                ViewCompat.Y(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f86193k) + Q()) - M(view2));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutL = L(coordinatorLayout.s(view));
            if (appBarLayoutL != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f86276d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutL.x(false, !z10);
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.e
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.p(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.q(coordinatorLayout, view, i10, i11, i12, i13);
        }
    }

    class a implements G {
        a() {
        }

        @Override // p2.G
        public j onApplyWindowInsets(View view, j jVar) {
            return AppBarLayout.this.t(jVar);
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class d extends c {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f86210a = new Rect();

        /* renamed from: b, reason: collision with root package name */
        private final Rect f86211b = new Rect();

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f86210a, appBarLayout, view);
            float fAbs = this.f86210a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                ViewCompat.t0(view, null);
                view.setTranslationY(0.0f);
                view.setVisibility(0);
                return;
            }
            float fA = 1.0f - C14329a.a(Math.abs(fAbs / this.f86210a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f86210a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f86211b);
            this.f86211b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f86211b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            ViewCompat.t0(view, this.f86211b);
        }

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }
    }

    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        int f86212a;

        /* renamed from: b, reason: collision with root package name */
        private c f86213b;

        /* renamed from: c, reason: collision with root package name */
        Interpolator f86214c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f86212a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f45363v);
            this.f86212a = typedArrayObtainStyledAttributes.getInt(l.f45387x, 0);
            f(typedArrayObtainStyledAttributes.getInt(l.f45375w, 0));
            if (typedArrayObtainStyledAttributes.hasValue(l.f45399y)) {
                this.f86214c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(l.f45399y, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f86213b;
        }

        public int c() {
            return this.f86212a;
        }

        public Interpolator d() {
            return this.f86214c;
        }

        boolean e() {
            int i10 = this.f86212a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void g(int i10) {
            this.f86212a = i10;
        }

        public void f(int i10) {
            this.f86213b = a(i10);
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f86212a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f86212a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f86212a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f86212a = 1;
        }
    }

    public interface f {
        void a(float f10, int i10);
    }

    public interface g extends b<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44507b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fsSuperDispatchDraw_aa9023842e397e0aa4a95443d94686fc(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_aa9023842e397e0aa4a95443d94686fc(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_aa9023842e397e0aa4a95443d94686fc(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_aa9023842e397e0aa4a95443d94686fc(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void fsSuperDraw_aa9023842e397e0aa4a95443d94686fc(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f86180m = -1;
        if (view == null) {
            e();
        } else {
            this.f86181n = new WeakReference<>(view);
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    void w() {
        this.f86173f = 0;
    }

    public void x(boolean z10, boolean z11) {
        y(z10, z11, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int i11 = f86167z;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f86169b = -1;
        this.f86170c = -1;
        this.f86171d = -1;
        this.f86173f = 0;
        this.f86185r = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i12 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            h.a(this);
        }
        h.c(this, attributeSet, i10, i11);
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f45231k, i10, i11, new int[0]);
        ViewCompat.q0(this, __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayI, l.f45243l));
        ColorStateList colorStateListA = C16026c.a(context2, typedArrayI, l.f45315r);
        this.f86182o = colorStateListA != null;
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(getBackground());
        if (colorStateListF != null) {
            C16760h c16760h = new C16760h();
            c16760h.b0(colorStateListF);
            if (colorStateListA != null) {
                n(c16760h, colorStateListF, colorStateListA);
            } else {
                o(context2, c16760h);
            }
        }
        this.f86186s = i.f(context2, C5597b.f44489K, getResources().getInteger(ae.g.f44708a));
        this.f86187t = i.g(context2, C5597b.f44500V, C6230a.f60115a);
        if (typedArrayI.hasValue(l.f45291p)) {
            y(typedArrayI.getBoolean(l.f45291p, false), false, false);
        }
        if (typedArrayI.hasValue(l.f45279o)) {
            h.b(this, typedArrayI.getDimensionPixelSize(l.f45279o, 0));
        }
        if (i12 >= 26) {
            if (typedArrayI.hasValue(l.f45267n)) {
                setKeyboardNavigationCluster(typedArrayI.getBoolean(l.f45267n, false));
            }
            if (typedArrayI.hasValue(l.f45255m)) {
                setTouchscreenBlocksFocus(typedArrayI.getBoolean(l.f45255m, false));
            }
        }
        this.f86191x = getResources().getDimension(ae.d.f44591a);
        this.f86179l = typedArrayI.getBoolean(l.f45303q, false);
        this.f86180m = typedArrayI.getResourceId(l.f45327s, -1);
        setStatusBarForeground(__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayI, l.f45339t));
        typedArrayI.recycle();
        ViewCompat.A0(this, new a());
    }

    private boolean C() {
        return this.f86189v != null && getTopInset() > 0;
    }

    private void F(float f10, float f11) {
        ValueAnimator valueAnimator = this.f86183p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f86183p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f86186s);
        this.f86183p.setInterpolator(this.f86187t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f86184q;
        if (animatorUpdateListener != null) {
            this.f86183p.addUpdateListener(animatorUpdateListener);
        }
        this.f86183p.start();
    }

    private void e() {
        WeakReference<View> weakReference = this.f86181n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f86181n = null;
    }

    private Integer f() {
        Drawable drawable = this.f86189v;
        if (drawable instanceof C16760h) {
            return Integer.valueOf(((C16760h) drawable).A());
        }
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(drawable);
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private View g(View view) {
        int i10;
        if (this.f86181n == null && (i10 = this.f86180m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f86180m);
            }
            if (viewFindViewById != null) {
                this.f86181n = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f86181n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void p() {
        Behavior behavior = this.f86192y;
        BaseBehavior.c cVarX0 = (behavior == null || this.f86169b == -1 || this.f86173f != 0) ? null : behavior.x0(AbstractC17751a.f165651b, this);
        this.f86169b = -1;
        this.f86170c = -1;
        this.f86171d = -1;
        if (cVarX0 != null) {
            this.f86192y.w0(cVarX0, false);
        }
    }

    private void y(boolean z10, boolean z11, boolean z12) {
        this.f86173f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean z(boolean z10) {
        if (this.f86177j == z10) {
            return false;
        }
        this.f86177j = z10;
        refreshDrawableState();
        return true;
    }

    boolean A(boolean z10) {
        return B(z10, !this.f86176i);
    }

    boolean B(boolean z10, boolean z11) {
        if (!z11 || this.f86178k == z10) {
            return false;
        }
        this.f86178k = z10;
        refreshDrawableState();
        if (!r()) {
            return true;
        }
        if (this.f86182o) {
            F(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f86179l) {
            return true;
        }
        F(z10 ? 0.0f : this.f86191x, z10 ? this.f86191x : 0.0f);
        return true;
    }

    public void c(b bVar) {
        if (this.f86175h == null) {
            this.f86175h = new ArrayList();
        }
        if (bVar == null || this.f86175h.contains(bVar)) {
            return;
        }
        this.f86175h.add(bVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f86192y = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iA;
        int i10 = this.f86170c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = eVar.f86212a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        iA = ViewCompat.A(childAt);
                    } else if ((i12 & 2) != 0) {
                        iA = measuredHeight - ViewCompat.A(childAt);
                    } else {
                        iMin = i13 + measuredHeight;
                        if (childCount == 0 && ViewCompat.w(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + iA;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f86170c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f86171d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int iA = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i12 = eVar.f86212a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iA += measuredHeight;
                if ((i12 & 2) != 0) {
                    iA -= ViewCompat.A(childAt);
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, iA);
        this.f86171d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f86180m;
    }

    int getPendingAction() {
        return this.f86173f;
    }

    public Drawable getStatusBarForeground() {
        return this.f86189v;
    }

    final int getTopInset() {
        j jVar = this.f86174g;
        if (jVar != null) {
            return jVar.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f86169b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int iA = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = eVar.f86212a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iA += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i11 == 0 && ViewCompat.w(childAt)) {
                    iA -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    iA -= ViewCompat.A(childAt);
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, iA);
        this.f86169b = iMax;
        return iMax;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new e((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    boolean k() {
        return this.f86172e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f86188u == null) {
            this.f86188u = new int[4];
        }
        int[] iArr = this.f86188u;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f86177j;
        int i11 = C5597b.f44522i0;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f86178k) ? C5597b.f44524j0 : -C5597b.f44524j0;
        int i12 = C5597b.f44514e0;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f86178k) ? C5597b.f44512d0 : -C5597b.f44512d0;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    public boolean q() {
        return this.f86179l;
    }

    void s(int i10) {
        this.f86168a = i10;
        if (!willNotDraw()) {
            ViewCompat.d0(this);
        }
        List<b> list = this.f86175h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f86175h.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    public void setLiftOnScroll(boolean z10) {
        this.f86179l = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f86180m = i10;
        e();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f86176i = z10;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f86189v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f86189v = drawable != null ? drawable.mutate() : null;
            this.f86190w = f();
            Drawable drawable3 = this.f86189v;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f86189v.setState(getDrawableState());
                }
                C13462a.m(this.f86189v, ViewCompat.z(this));
                this.f86189v.setVisible(getVisibility() == 0, false);
                this.f86189v.setCallback(this);
            }
            G();
            ViewCompat.d0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void u(b bVar) {
        List<b> list = this.f86175h;
        if (list == null || bVar == null) {
            return;
        }
        list.remove(bVar);
    }

    private boolean E() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !ViewCompat.w(childAt)) {
                return true;
            }
        }
        return false;
    }

    private void G() {
        setWillNotDraw(!C());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, C16760h c16760h, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c16760h.a0(fFloatValue);
        Drawable drawable = appBarLayout.f86189v;
        if (drawable instanceof C16760h) {
            ((C16760h) drawable).a0(fFloatValue);
        }
        Iterator<f> it = appBarLayout.f86185r.iterator();
        while (it.hasNext()) {
            it.next().a(fFloatValue, c16760h.A());
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, C16760h c16760h, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int iJ = C14718a.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        c16760h.b0(ColorStateList.valueOf(iJ));
        if (appBarLayout.f86189v != null && (num2 = appBarLayout.f86190w) != null && num2.equals(num)) {
            C13462a.n(appBarLayout.f86189v, iJ);
        }
        if (!appBarLayout.f86185r.isEmpty()) {
            for (f fVar : appBarLayout.f86185r) {
                if (c16760h.x() != null) {
                    fVar.a(0.0f, iJ);
                }
            }
        }
    }

    private boolean l() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void n(final C16760h c16760h, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer numF = C14718a.f(getContext(), C5597b.f44541s);
        this.f86184q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f86259a, colorStateList, colorStateList2, c16760h, numF, valueAnimator);
            }
        };
        ViewCompat.q0(this, c16760h);
    }

    private void o(Context context, final C16760h c16760h) {
        c16760h.Q(context);
        this.f86184q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f86264a, c16760h, valueAnimator);
            }
        };
        ViewCompat.q0(this, c16760h);
    }

    private boolean r() {
        return getBackground() instanceof C16760h;
    }

    boolean D(View view) {
        View viewG = g(view);
        if (viewG != null) {
            view = viewG;
        }
        if (view != null) {
            if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void d(g gVar) {
        c(gVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        fsSuperDraw_aa9023842e397e0aa4a95443d94686fc(canvas);
        if (C()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f86168a);
            this.f86189v.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f86189v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public C16760h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C16760h) {
            return (C16760h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iA = ViewCompat.A(this);
        if (iA == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                iA = ViewCompat.A(getChildAt(childCount - 1));
            } else {
                iA = 0;
            }
            if (iA == 0) {
                return getHeight() / 3;
            }
        }
        return (iA * 2) + topInset;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean m() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C16761i.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (ViewCompat.w(this) && E()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.Y(getChildAt(childCount), topInset);
            }
        }
        p();
        this.f86172e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f86172e = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f86189v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f86176i) {
            if (!this.f86179l && !l()) {
                z11 = false;
            }
            z(z11);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && ViewCompat.w(this) && E()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = C14329a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        p();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C16761i.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        x(z10, ViewCompat.S(this));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(C14791a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) throws Resources.NotFoundException {
        h.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f86189v;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    j t(j jVar) {
        j jVar2;
        if (ViewCompat.w(this)) {
            jVar2 = jVar;
        } else {
            jVar2 = null;
        }
        if (!o2.c.a(this.f86174g, jVar2)) {
            this.f86174g = jVar2;
            G();
            requestLayout();
        }
        return jVar;
    }

    public void v(g gVar) {
        u(gVar);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f86189v) {
            return false;
        }
        return true;
    }
}
