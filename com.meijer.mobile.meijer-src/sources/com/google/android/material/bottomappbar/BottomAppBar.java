package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import ce.C6502a;
import ce.C6503b;
import ce.k;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.x;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d2.C13595a;
import de.C13661a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pe.i;
import te.C17234h;
import te.C17235i;
import w2.AbstractC17821a;

/* loaded from: classes4.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: t0, reason: collision with root package name */
    private static final int f87162t0 = k.f61822w;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f87163u0 = C6503b.f61502I;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f87164v0 = C6503b.f61512S;

    /* renamed from: U, reason: collision with root package name */
    private Integer f87165U;

    /* renamed from: V, reason: collision with root package name */
    private final C17234h f87166V;

    /* renamed from: W, reason: collision with root package name */
    private Animator f87167W;

    /* renamed from: a0, reason: collision with root package name */
    private Animator f87168a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f87169b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f87170c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f87171d0;

    /* renamed from: e0, reason: collision with root package name */
    private final int f87172e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f87173f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f87174g0;

    /* renamed from: h0, reason: collision with root package name */
    private final boolean f87175h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f87176i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f87177j0;

    /* renamed from: k0, reason: collision with root package name */
    private ArrayList<g> f87178k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f87179l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f87180m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f87181n0;

    /* renamed from: o0, reason: collision with root package name */
    private Behavior f87182o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f87183p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f87184q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f87185r0;

    /* renamed from: s0, reason: collision with root package name */
    AnimatorListenerAdapter f87186s0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m, reason: collision with root package name */
        private final Rect f87187m;

        /* renamed from: n, reason: collision with root package name */
        private WeakReference<BottomAppBar> f87188n;

        /* renamed from: o, reason: collision with root package name */
        private int f87189o;

        /* renamed from: p, reason: collision with root package name */
        private final View.OnLayoutChangeListener f87190p;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f87188n.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f87187m);
                    int iHeight = Behavior.this.f87187m.height();
                    bottomAppBar.G0(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f87187m)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f87189o == 0) {
                    if (bottomAppBar.f87171d0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(ce.d.f61607a0) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (x.k(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f87172e0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f87172e0;
                    }
                }
                bottomAppBar.E0();
            }
        }

        public Behavior() {
            this.f87190p = new a();
            this.f87187m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f87188n = new WeakReference<>(bottomAppBar);
            View viewV0 = bottomAppBar.v0();
            if (viewV0 != null && !ViewCompat.S(viewV0)) {
                BottomAppBar.J0(bottomAppBar, viewV0);
                this.f87189o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewV0.getLayoutParams())).bottomMargin;
                if (viewV0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewV0;
                    if (bottomAppBar.f87171d0 == 0 && bottomAppBar.f87175h0) {
                        ViewCompat.u0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C6502a.f61491b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C6502a.f61490a);
                    }
                    bottomAppBar.n0(floatingActionButton);
                }
                viewV0.addOnLayoutChangeListener(this.f87190p);
                bottomAppBar.E0();
            }
            coordinatorLayout.K(bottomAppBar, i10);
            return super.p(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public boolean E(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            if (bottomAppBar.getHideOnScroll() && super.E(coordinatorLayout, bottomAppBar, view, view2, i10, i11)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f87190p = new a();
            this.f87187m = new Rect();
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.s0();
            BottomAppBar.this.f87167W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.t0();
        }
    }

    class b extends FloatingActionButton.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f87193a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.s0();
            }
        }

        b(int i10) {
            this.f87193a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.x0(this.f87193a));
            floatingActionButton.s(new a());
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.s0();
            BottomAppBar.this.f87180m0 = false;
            BottomAppBar.this.f87168a0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.t0();
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f87197a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f87198b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f87199c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f87200d;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f87197a = true;
        }

        d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f87198b = actionMenuView;
            this.f87199c = i10;
            this.f87200d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f87197a) {
                return;
            }
            boolean z10 = BottomAppBar.this.f87179l0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.C0(bottomAppBar.f87179l0);
            BottomAppBar.this.I0(this.f87198b, this.f87199c, this.f87200d, z10);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f87202a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f87203b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f87204c;

        e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f87202a = actionMenuView;
            this.f87203b = i10;
            this.f87204c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f87202a.setTranslationX(BottomAppBar.this.w0(r0, this.f87203b, this.f87204c));
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f87186s0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonU0 = BottomAppBar.this.u0();
            if (floatingActionButtonU0 != null) {
                floatingActionButtonU0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class h extends AbstractC17821a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f87207c;

        /* renamed from: d, reason: collision with root package name */
        boolean f87208d;

        class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }

            a() {
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f87207c = parcel.readInt();
            this.f87208d = parcel.readInt() != 0;
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f87207c);
            parcel.writeInt(this.f87208d ? 1 : 0);
        }
    }

    private void H0(ActionMenuView actionMenuView, int i10, boolean z10) {
        I0(actionMenuView, i10, z10, false);
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    boolean G0(int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().g()) {
            return false;
        }
        getTopEdgeTreatment().m(f10);
        this.f87166V.invalidateSelf();
        return true;
    }

    public void setFabAlignmentMode(int i10) {
        F0(i10, 0);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    private void A0(int i10) {
        if (this.f87169b0 == i10 || !ViewCompat.S(this)) {
            return;
        }
        Animator animator = this.f87167W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f87170c0 == 1) {
            q0(i10, arrayList);
        } else {
            p0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(i.g(getContext(), f87164v0, C13661a.f128350a));
        this.f87167W = animatorSet;
        animatorSet.addListener(new a());
        this.f87167W.start();
    }

    private Drawable B0(Drawable drawable) {
        if (drawable == null || this.f87165U == null) {
            return drawable;
        }
        Drawable drawableR = C13595a.r(drawable.mutate());
        C13595a.n(drawableR, this.f87165U.intValue());
        return drawableR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        e eVar = new e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f87183p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return x0(this.f87169b0);
    }

    private float getFabTranslationY() {
        if (this.f87171d0 == 1) {
            return -getTopEdgeTreatment().c();
        }
        return v0() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f87185r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f87184q0;
    }

    private com.google.android.material.bottomappbar.b getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.b) this.f87166V.E().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f87186s0);
        floatingActionButton.f(new f());
        floatingActionButton.g(null);
    }

    private void o0() {
        Animator animator = this.f87168a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f87167W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        ArrayList<g> arrayList;
        int i10 = this.f87177j0 - 1;
        this.f87177j0 = i10;
        if (i10 != 0 || (arrayList = this.f87178k0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        ArrayList<g> arrayList;
        int i10 = this.f87177j0;
        this.f87177j0 = i10 + 1;
        if (i10 != 0 || (arrayList = this.f87178k0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public void C0(int i10) {
        if (i10 != 0) {
            this.f87179l0 = 0;
            getMenu().clear();
            x(i10);
        }
    }

    public void F0(int i10, int i11) {
        this.f87179l0 = i11;
        this.f87180m0 = true;
        z0(i10, this.f87181n0);
        A0(i10);
        this.f87169b0 = i10;
    }

    public ColorStateList getBackgroundTint() {
        return this.f87166V.I();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f87182o0 == null) {
            this.f87182o0 = new Behavior();
        }
        return this.f87182o0;
    }

    public int getFabAlignmentMode() {
        return this.f87169b0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f87173f0;
    }

    public int getFabAnchorMode() {
        return this.f87171d0;
    }

    public int getFabAnimationMode() {
        return this.f87170c0;
    }

    public boolean getHideOnScroll() {
        return this.f87176i0;
    }

    public int getMenuAlignmentMode() {
        return this.f87174g0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.f87169b0 = hVar.f87207c;
        this.f87181n0 = hVar.f87208d;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C13595a.o(this.f87166V, colorStateList);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.f87166V.a0(f10);
        getBehavior().M(this, this.f87166V.D() - this.f87166V.C());
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f87173f0 != i10) {
            this.f87173f0 = i10;
            E0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f87171d0 = i10;
        E0();
        View viewV0 = v0();
        if (viewV0 != null) {
            J0(this, viewV0);
            viewV0.requestLayout();
            this.f87166V.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f87170c0 = i10;
    }

    public void setHideOnScroll(boolean z10) {
        this.f87176i0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f87174g0 != i10) {
            this.f87174g0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                H0(actionMenuView, this.f87169b0, y0());
            }
        }
    }

    protected int w0(ActionMenuView actionMenuView, int i10, boolean z10) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.f87174g0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zK = x.k(this);
        int measuredWidth = zK ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f46161a & 8388615) == 8388611) {
                measuredWidth = zK ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zK ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zK ? this.f87184q0 : -this.f87185r0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(ce.d.f61644t);
            if (!zK) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    private void D0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f87168a0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!y0()) {
                H0(actionMenuView, 0, false);
            } else {
                H0(actionMenuView, this.f87169b0, this.f87181n0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        float f10;
        getTopEdgeTreatment().n(getFabTranslationX());
        C17234h c17234h = this.f87166V;
        if (this.f87181n0 && y0() && this.f87171d0 == 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        c17234h.c0(f10);
        View viewV0 = v0();
        if (viewV0 != null) {
            viewV0.setTranslationY(getFabTranslationY());
            viewV0.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f53858d = 17;
        int i10 = bottomAppBar.f87171d0;
        if (i10 == 1) {
            fVar.f53858d = 17 | 48;
        }
        if (i10 == 0) {
            fVar.f53858d |= 80;
        }
    }

    private int getFabAlignmentAnimationDuration() {
        return i.f(getContext(), f87163u0, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
    }

    private void q0(int i10, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(u0(), "translationX", x0(i10));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private void r0(int i10, boolean z10, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            animatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - w0(actionMenuView, i10, z10)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat.addListener(new d(actionMenuView, i10, z10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
                list.add(animatorSet);
                return;
            }
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton u0() {
        View viewV0 = v0();
        if (viewV0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewV0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View v0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).t(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float x0(int i10) {
        int i11;
        int measuredWidth;
        boolean zK = x.k(this);
        int i12 = 1;
        if (i10 == 1) {
            View viewV0 = v0();
            if (zK) {
                i11 = this.f87185r0;
            } else {
                i11 = this.f87184q0;
            }
            if (this.f87173f0 != -1 && viewV0 != null) {
                measuredWidth = (viewV0.getMeasuredWidth() / 2) + this.f87173f0;
            } else {
                measuredWidth = this.f87172e0;
            }
            int measuredWidth2 = (getMeasuredWidth() / 2) - (i11 + measuredWidth);
            if (zK) {
                i12 = -1;
            }
            return measuredWidth2 * i12;
        }
        return 0.0f;
    }

    private boolean y0() {
        FloatingActionButton floatingActionButtonU0 = u0();
        if (floatingActionButtonU0 != null && floatingActionButtonU0.p()) {
            return true;
        }
        return false;
    }

    private void z0(int i10, boolean z10) {
        if (!ViewCompat.S(this)) {
            this.f87180m0 = false;
            C0(this.f87179l0);
            return;
        }
        Animator animator = this.f87168a0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!y0()) {
            i10 = 0;
            z10 = false;
        }
        r0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f87168a0 = animatorSet;
        animatorSet.addListener(new c());
        this.f87168a0.start();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C17235i.f(this, this.f87166V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            o0();
            E0();
            final View viewV0 = v0();
            if (viewV0 != null && ViewCompat.S(viewV0)) {
                viewV0.post(new Runnable() { // from class: com.google.android.material.bottomappbar.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewV0.requestLayout();
                    }
                });
            }
        }
        D0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f87207c = this.f87169b0;
        hVar.f87208d = this.f87181n0;
        return hVar;
    }

    protected void p0(int i10, List<Animator> list) {
        FloatingActionButton floatingActionButtonU0 = u0();
        if (floatingActionButtonU0 != null && !floatingActionButtonU0.o()) {
            t0();
            floatingActionButtonU0.m(new b(i10));
        }
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().i(f10);
            this.f87166V.invalidateSelf();
            E0();
        }
    }

    void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().j(f10);
            this.f87166V.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().k(f10);
            this.f87166V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().l(f10);
            this.f87166V.invalidateSelf();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(B0(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f87165U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
