package com.google.android.material.floatingactionbutton;

import ae.k;
import ae.l;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C5629e;
import androidx.appcompat.widget.C5633i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import be.C6237h;
import be.InterfaceC6240k;
import com.fullstory.FS;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import d2.C13462a;
import java.util.List;
import le.InterfaceC15403a;
import o2.i;
import qe.InterfaceC16521b;
import re.C16765m;
import re.InterfaceC16768p;
import te.C17092a;

/* loaded from: classes4.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements InterfaceC15403a, InterfaceC16768p, CoordinatorLayout.b {

    /* renamed from: q, reason: collision with root package name */
    private static final int f86956q = k.f44797m;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f86957b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f86958c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f86959d;

    /* renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f86960e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f86961f;

    /* renamed from: g, reason: collision with root package name */
    private int f86962g;

    /* renamed from: h, reason: collision with root package name */
    private int f86963h;

    /* renamed from: i, reason: collision with root package name */
    private int f86964i;

    /* renamed from: j, reason: collision with root package name */
    private int f86965j;

    /* renamed from: k, reason: collision with root package name */
    boolean f86966k;

    /* renamed from: l, reason: collision with root package name */
    final Rect f86967l;

    /* renamed from: m, reason: collision with root package name */
    private final Rect f86968m;

    /* renamed from: n, reason: collision with root package name */
    private final C5633i f86969n;

    /* renamed from: o, reason: collision with root package name */
    private final le.b f86970o;

    /* renamed from: p, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.a f86971p;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        private Rect f86972a;

        /* renamed from: b, reason: collision with root package name */
        private b f86973b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f86974c;

        public BaseBehavior() {
            this.f86974c = true;
        }

        private void K(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f86967l;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i10 = 0;
            int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i10 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i10 = -rect.top;
            }
            if (i10 != 0) {
                ViewCompat.Y(floatingActionButton, i10);
            }
            if (i11 != 0) {
                ViewCompat.X(floatingActionButton, i11);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f86967l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!J(view)) {
                return false;
            }
            P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout.f fVar) {
            if (fVar.f53638h == 0) {
                fVar.f53638h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f44958M2);
            this.f86974c = typedArrayObtainStyledAttributes.getBoolean(l.f44970N2, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean J(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean N(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.f86974c || fVar.e() != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        private boolean O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!N(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f86972a == null) {
                this.f86972a = new Rect();
            }
            Rect rect = this.f86972a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.n(this.f86973b, false);
                return true;
            }
            floatingActionButton.t(this.f86973b, false);
            return true;
        }

        private boolean P(View view, FloatingActionButton floatingActionButton) {
            if (!N(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.n(this.f86973b, false);
                return true;
            }
            floatingActionButton.t(this.f86973b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List<View> listS = coordinatorLayout.s(floatingActionButton);
            int size = listS.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listS.get(i11);
                if (view instanceof AppBarLayout) {
                    if (O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (J(view) && P(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.K(floatingActionButton, i10);
            K(coordinatorLayout, floatingActionButton);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: L */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: M */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.p(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void k(CoordinatorLayout.f fVar) {
            super.k(fVar);
        }
    }

    class a implements a.k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f86975a;

        a(b bVar) {
            this.f86975a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void a() {
            this.f86975a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void b() {
            this.f86975a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements InterfaceC16521b {
        c() {
        }

        @Override // qe.InterfaceC16521b
        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f86967l.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f86964i, i11 + FloatingActionButton.this.f86964i, i12 + FloatingActionButton.this.f86964i, i13 + FloatingActionButton.this.f86964i);
        }

        @Override // qe.InterfaceC16521b
        public boolean b() {
            return FloatingActionButton.this.f86966k;
        }

        @Override // qe.InterfaceC16521b
        public void c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    class d<T extends FloatingActionButton> implements a.j {
        @Override // com.google.android.material.floatingactionbutton.a.j
        public void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void b() {
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        d(InterfaceC6240k<T> interfaceC6240k) {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            throw null;
        }
    }

    public void m(b bVar) {
        n(bVar, true);
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setSize(int i10) {
        this.f86963h = 0;
        if (i10 != this.f86962g) {
            this.f86962g = i10;
            requestLayout();
        }
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.f86971p == null) {
            this.f86971p = h();
        }
        return this.f86971p;
    }

    private com.google.android.material.floatingactionbutton.a h() {
        return new com.google.android.material.floatingactionbutton.b(this, new c());
    }

    private int k(int i10) {
        int i11 = this.f86963h;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(ae.d.f44597d) : resources.getDimensionPixelSize(ae.d.f44595c) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    private void q(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f86967l;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private a.k u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // le.InterfaceC15403a
    public boolean c() {
        return this.f86970o.c();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f86957b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f86958c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public int getCustomSize() {
        return this.f86963h;
    }

    public int getExpandedComponentIdHint() {
        return this.f86970o.b();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f86961f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f86961f;
    }

    public int getSize() {
        return this.f86962g;
    }

    int getSizeDimension() {
        return k(this.f86962g);
    }

    public ColorStateList getSupportImageTintList() {
        return this.f86959d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f86960e;
    }

    public boolean getUseCompatPadding() {
        return this.f86966k;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C17092a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C17092a c17092a = (C17092a) parcelable;
        super.onRestoreInstanceState(c17092a.a());
        this.f86970o.d((Bundle) i.g(c17092a.f161633c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        FS.log_i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        FS.log_i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        FS.log_i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f86957b != colorStateList) {
            this.f86957b = colorStateList;
            getImpl().K(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f86958c != mode) {
            this.f86958c = mode;
            getImpl().L(mode);
        }
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f86963h) {
            this.f86963h = i10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f86970o.g(i10);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f86969n.i(i10);
        r();
    }

    public void setMaxImageSize(int i10) {
        this.f86965j = i10;
        getImpl().R(i10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f86961f != colorStateList) {
            this.f86961f = colorStateList;
            getImpl().T(this.f86961f);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f86959d != colorStateList) {
            this.f86959d = colorStateList;
            r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f86960e != mode) {
            this.f86960e = mode;
            r();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f86966k != z10) {
            this.f86966k = z10;
            getImpl().B();
        }
    }

    private void l(Rect rect) {
        j(rect);
        int i10 = -this.f86971p.v();
        rect.inset(i10, i10);
    }

    private void r() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f86959d;
        if (colorStateList == null) {
            C13462a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f86960e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C5629e.e(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().D(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(InterfaceC6240k<? extends FloatingActionButton> interfaceC6240k) {
        getImpl().g(new d(interfaceC6240k));
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public C6237h getHideMotionSpec() {
        return getImpl().o();
    }

    public C16765m getShapeAppearanceModel() {
        return (C16765m) i.g(getImpl().t());
    }

    public C6237h getShowMotionSpec() {
        return getImpl().u();
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!ViewCompat.S(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        q(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        q(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().z();
    }

    void n(b bVar, boolean z10) {
        getImpl().w(u(bVar), z10);
    }

    public boolean o() {
        return getImpl().x();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().A();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().C();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f86964i = (sizeDimension - this.f86965j) / 2;
        getImpl().d0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f86967l;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        C17092a c17092a = new C17092a(parcelableOnSaveInstanceState);
        c17092a.f161633c.put("expandableWidgetHelper", this.f86970o.e());
        return c17092a;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            l(this.f86968m);
            if (!this.f86968m.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return getImpl().y();
    }

    public void setCompatElevation(float f10) {
        getImpl().M(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().P(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().S(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().e0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().n()) {
            getImpl().N(z10);
            requestLayout();
        }
    }

    public void setHideMotionSpec(C6237h c6237h) {
        getImpl().O(c6237h);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C6237h.c(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().c0();
            if (this.f86959d != null) {
                r();
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().H();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().H();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().U(z10);
    }

    @Override // re.InterfaceC16768p
    public void setShapeAppearanceModel(C16765m c16765m) {
        getImpl().V(c16765m);
    }

    public void setShowMotionSpec(C6237h c6237h) {
        getImpl().W(c6237h);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C6237h.c(getContext(), i10));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().I();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().I();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().I();
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    void t(b bVar, boolean z10) {
        getImpl().a0(u(bVar), z10);
    }
}
