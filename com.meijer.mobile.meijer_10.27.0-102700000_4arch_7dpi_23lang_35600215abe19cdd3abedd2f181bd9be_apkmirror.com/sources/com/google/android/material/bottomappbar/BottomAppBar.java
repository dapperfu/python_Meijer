package com.google.android.material.bottomappbar;

import ae.C5596a;
import ae.C5597b;
import ae.k;
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
import be.C6230a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.x;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d2.C13462a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ne.i;
import re.C16760h;
import re.C16761i;
import w2.AbstractC17751a;

/* loaded from: classes4.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: t0, reason: collision with root package name */
    private static final int f86322t0 = k.f44807w;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f86323u0 = C5597b.f44487I;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f86324v0 = C5597b.f44497S;

    /* renamed from: U, reason: collision with root package name */
    private Integer f86325U;

    /* renamed from: V, reason: collision with root package name */
    private final C16760h f86326V;

    /* renamed from: W, reason: collision with root package name */
    private Animator f86327W;

    /* renamed from: a0, reason: collision with root package name */
    private Animator f86328a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f86329b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f86330c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f86331d0;

    /* renamed from: e0, reason: collision with root package name */
    private final int f86332e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f86333f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f86334g0;

    /* renamed from: h0, reason: collision with root package name */
    private final boolean f86335h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f86336i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f86337j0;

    /* renamed from: k0, reason: collision with root package name */
    private ArrayList<g> f86338k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f86339l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f86340m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f86341n0;

    /* renamed from: o0, reason: collision with root package name */
    private Behavior f86342o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f86343p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f86344q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f86345r0;

    /* renamed from: s0, reason: collision with root package name */
    AnimatorListenerAdapter f86346s0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m, reason: collision with root package name */
        private final Rect f86347m;

        /* renamed from: n, reason: collision with root package name */
        private WeakReference<BottomAppBar> f86348n;

        /* renamed from: o, reason: collision with root package name */
        private int f86349o;

        /* renamed from: p, reason: collision with root package name */
        private final View.OnLayoutChangeListener f86350p;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f86348n.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f86347m);
                    int iHeight = Behavior.this.f86347m.height();
                    bottomAppBar.G0(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f86347m)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f86349o == 0) {
                    if (bottomAppBar.f86331d0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(ae.d.f44592a0) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (x.k(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f86332e0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f86332e0;
                    }
                }
                bottomAppBar.E0();
            }
        }

        public Behavior() {
            this.f86350p = new a();
            this.f86347m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f86348n = new WeakReference<>(bottomAppBar);
            View viewV0 = bottomAppBar.v0();
            if (viewV0 != null && !ViewCompat.S(viewV0)) {
                BottomAppBar.J0(bottomAppBar, viewV0);
                this.f86349o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewV0.getLayoutParams())).bottomMargin;
                if (viewV0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewV0;
                    if (bottomAppBar.f86331d0 == 0 && bottomAppBar.f86335h0) {
                        ViewCompat.u0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C5596a.f44476b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C5596a.f44475a);
                    }
                    bottomAppBar.n0(floatingActionButton);
                }
                viewV0.addOnLayoutChangeListener(this.f86350p);
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
            this.f86350p = new a();
            this.f86347m = new Rect();
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.s0();
            BottomAppBar.this.f86327W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.t0();
        }
    }

    class b extends FloatingActionButton.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f86353a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.s0();
            }
        }

        b(int i10) {
            this.f86353a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.x0(this.f86353a));
            floatingActionButton.s(new a());
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.s0();
            BottomAppBar.this.f86340m0 = false;
            BottomAppBar.this.f86328a0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.t0();
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f86357a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f86358b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f86359c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f86360d;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f86357a = true;
        }

        d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f86358b = actionMenuView;
            this.f86359c = i10;
            this.f86360d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f86357a) {
                return;
            }
            boolean z10 = BottomAppBar.this.f86339l0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.C0(bottomAppBar.f86339l0);
            BottomAppBar.this.I0(this.f86358b, this.f86359c, this.f86360d, z10);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f86362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f86363b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f86364c;

        e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f86362a = actionMenuView;
            this.f86363b = i10;
            this.f86364c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f86362a.setTranslationX(BottomAppBar.this.w0(r0, this.f86363b, this.f86364c));
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f86346s0.onAnimationStart(animator);
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

    static class h extends AbstractC17751a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f86367c;

        /* renamed from: d, reason: collision with root package name */
        boolean f86368d;

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
            this.f86367c = parcel.readInt();
            this.f86368d = parcel.readInt() != 0;
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f86367c);
            parcel.writeInt(this.f86368d ? 1 : 0);
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
        this.f86326V.invalidateSelf();
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
        if (this.f86329b0 == i10 || !ViewCompat.S(this)) {
            return;
        }
        Animator animator = this.f86327W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f86330c0 == 1) {
            q0(i10, arrayList);
        } else {
            p0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(i.g(getContext(), f86324v0, C6230a.f60115a));
        this.f86327W = animatorSet;
        animatorSet.addListener(new a());
        this.f86327W.start();
    }

    private Drawable B0(Drawable drawable) {
        if (drawable == null || this.f86325U == null) {
            return drawable;
        }
        Drawable drawableR = C13462a.r(drawable.mutate());
        C13462a.n(drawableR, this.f86325U.intValue());
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
        return this.f86343p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return x0(this.f86329b0);
    }

    private float getFabTranslationY() {
        if (this.f86331d0 == 1) {
            return -getTopEdgeTreatment().c();
        }
        return v0() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f86345r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f86344q0;
    }

    private com.google.android.material.bottomappbar.b getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.b) this.f86326V.E().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f86346s0);
        floatingActionButton.f(new f());
        floatingActionButton.g(null);
    }

    private void o0() {
        Animator animator = this.f86328a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f86327W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        ArrayList<g> arrayList;
        int i10 = this.f86337j0 - 1;
        this.f86337j0 = i10;
        if (i10 != 0 || (arrayList = this.f86338k0) == null) {
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
        int i10 = this.f86337j0;
        this.f86337j0 = i10 + 1;
        if (i10 != 0 || (arrayList = this.f86338k0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public void C0(int i10) {
        if (i10 != 0) {
            this.f86339l0 = 0;
            getMenu().clear();
            x(i10);
        }
    }

    public void F0(int i10, int i11) {
        this.f86339l0 = i11;
        this.f86340m0 = true;
        z0(i10, this.f86341n0);
        A0(i10);
        this.f86329b0 = i10;
    }

    public ColorStateList getBackgroundTint() {
        return this.f86326V.I();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f86342o0 == null) {
            this.f86342o0 = new Behavior();
        }
        return this.f86342o0;
    }

    public int getFabAlignmentMode() {
        return this.f86329b0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f86333f0;
    }

    public int getFabAnchorMode() {
        return this.f86331d0;
    }

    public int getFabAnimationMode() {
        return this.f86330c0;
    }

    public boolean getHideOnScroll() {
        return this.f86336i0;
    }

    public int getMenuAlignmentMode() {
        return this.f86334g0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.f86329b0 = hVar.f86367c;
        this.f86341n0 = hVar.f86368d;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C13462a.o(this.f86326V, colorStateList);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.f86326V.a0(f10);
        getBehavior().M(this, this.f86326V.D() - this.f86326V.C());
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f86333f0 != i10) {
            this.f86333f0 = i10;
            E0();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f86331d0 = i10;
        E0();
        View viewV0 = v0();
        if (viewV0 != null) {
            J0(this, viewV0);
            viewV0.requestLayout();
            this.f86326V.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f86330c0 = i10;
    }

    public void setHideOnScroll(boolean z10) {
        this.f86336i0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f86334g0 != i10) {
            this.f86334g0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                H0(actionMenuView, this.f86329b0, y0());
            }
        }
    }

    protected int w0(ActionMenuView actionMenuView, int i10, boolean z10) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.f86334g0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zK = x.k(this);
        int measuredWidth = zK ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f45937a & 8388615) == 8388611) {
                measuredWidth = zK ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zK ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zK ? this.f86344q0 : -this.f86345r0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(ae.d.f44629t);
            if (!zK) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    private void D0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f86328a0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!y0()) {
                H0(actionMenuView, 0, false);
            } else {
                H0(actionMenuView, this.f86329b0, this.f86341n0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        float f10;
        getTopEdgeTreatment().n(getFabTranslationX());
        C16760h c16760h = this.f86326V;
        if (this.f86341n0 && y0() && this.f86331d0 == 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        c16760h.c0(f10);
        View viewV0 = v0();
        if (viewV0 != null) {
            viewV0.setTranslationY(getFabTranslationY());
            viewV0.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f53634d = 17;
        int i10 = bottomAppBar.f86331d0;
        if (i10 == 1) {
            fVar.f53634d = 17 | 48;
        }
        if (i10 == 0) {
            fVar.f53634d |= 80;
        }
    }

    private int getFabAlignmentAnimationDuration() {
        return i.f(getContext(), f86323u0, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
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
                i11 = this.f86345r0;
            } else {
                i11 = this.f86344q0;
            }
            if (this.f86333f0 != -1 && viewV0 != null) {
                measuredWidth = (viewV0.getMeasuredWidth() / 2) + this.f86333f0;
            } else {
                measuredWidth = this.f86332e0;
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
            this.f86340m0 = false;
            C0(this.f86339l0);
            return;
        }
        Animator animator = this.f86328a0;
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
        this.f86328a0 = animatorSet;
        animatorSet.addListener(new c());
        this.f86328a0.start();
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
        C16761i.f(this, this.f86326V);
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
        hVar.f86367c = this.f86329b0;
        hVar.f86368d = this.f86341n0;
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
            this.f86326V.invalidateSelf();
            E0();
        }
    }

    void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().j(f10);
            this.f86326V.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().k(f10);
            this.f86326V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().l(f10);
            this.f86326V.invalidateSelf();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(B0(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f86325U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
