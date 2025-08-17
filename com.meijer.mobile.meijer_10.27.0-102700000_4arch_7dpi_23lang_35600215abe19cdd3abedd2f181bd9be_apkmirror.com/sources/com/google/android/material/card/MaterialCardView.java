package com.google.android.material.card;

import ae.C5597b;
import ae.k;
import ae.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.fullstory.FS;
import com.google.android.material.internal.s;
import j.C14791a;
import re.C16761i;
import re.C16765m;
import re.InterfaceC16768p;
import ue.C17250a;

/* loaded from: classes4.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC16768p {

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f86543o = {R.attr.state_checkable};

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f86544p = {R.attr.state_checked};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f86545q = {C5597b.f44516f0};

    /* renamed from: r, reason: collision with root package name */
    private static final int f86546r = k.f44809y;

    /* renamed from: j, reason: collision with root package name */
    private final b f86547j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f86548k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f86549l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f86550m;

    /* renamed from: n, reason: collision with root package name */
    private a f86551n;

    public interface a {
        void a(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44484F);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f86547j.L(ColorStateList.valueOf(i10));
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f86547j.S(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f86546r;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f86549l = false;
        this.f86550m = false;
        this.f86548k = true;
        TypedArray typedArrayI = s.i(getContext(), attributeSet, l.f45392x4, i10, i11, new int[0]);
        b bVar = new b(this, attributeSet, i10, i11);
        this.f86547j = bVar;
        bVar.L(super.getCardBackgroundColor());
        bVar.b0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.I(typedArrayI);
        typedArrayI.recycle();
    }

    private void g() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f86547j.k();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f86547j.l().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f86547j.m();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f86547j.n();
    }

    public Drawable getCheckedIcon() {
        return this.f86547j.o();
    }

    public int getCheckedIconGravity() {
        return this.f86547j.p();
    }

    public int getCheckedIconMargin() {
        return this.f86547j.q();
    }

    public int getCheckedIconSize() {
        return this.f86547j.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f86547j.s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f86547j.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f86547j.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f86547j.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f86547j.C().top;
    }

    public float getProgress() {
        return this.f86547j.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f86547j.u();
    }

    public ColorStateList getRippleColor() {
        return this.f86547j.x();
    }

    public C16765m getShapeAppearanceModel() {
        return this.f86547j.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f86547j.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f86547j.A();
    }

    public int getStrokeWidth() {
        return this.f86547j.B();
    }

    public boolean h() {
        b bVar = this.f86547j;
        return bVar != null && bVar.F();
    }

    public boolean i() {
        return this.f86550m;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f86549l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (h()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f86543o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f86544p);
        }
        if (i()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f86545q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f86548k) {
            if (!this.f86547j.E()) {
                FS.log_i("MaterialCardView", "Setting a custom background is not supported.");
                this.f86547j.K(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f86547j.L(colorStateList);
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f86547j.M(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f86547j.N(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f86549l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f86547j.Q(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f86547j.p() != i10) {
            this.f86547j.R(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f86547j.S(i10);
    }

    public void setCheckedIconResource(int i10) {
        this.f86547j.Q(C14791a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f86547j.T(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f86547j.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f86547j.U(colorStateList);
    }

    public void setDragged(boolean z10) {
        if (this.f86550m != z10) {
            this.f86550m = z10;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f86551n = aVar;
    }

    public void setProgress(float f10) {
        this.f86547j.W(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f86547j.X(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.f86547j.X(C14791a.a(getContext(), i10));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f86547j.Z(colorStateList);
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        this.f86547j.a0(i10);
        invalidate();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    void j(int i10, int i11, int i12, int i13) {
        super.e(i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f86547j.f0();
        C16761i.f(this, this.f86547j.l());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f86547j.J(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f86547j.h0();
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        b bVar = this.f86547j;
        if (bVar != null) {
            bVar.f0();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f86547j.j0();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f86547j.j0();
        this.f86547j.g0();
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f86547j.V(f10);
    }

    @Override // re.InterfaceC16768p
    public void setShapeAppearanceModel(C16765m c16765m) {
        setClipToOutline(c16765m.u(getBoundsAsRectF()));
        this.f86547j.Y(c16765m);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f86547j.j0();
        this.f86547j.g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (h() && isEnabled()) {
            this.f86549l = !this.f86549l;
            refreshDrawableState();
            g();
            this.f86547j.P(this.f86549l, true);
            a aVar = this.f86551n;
            if (aVar != null) {
                aVar.a(this, this.f86549l);
            }
        }
    }
}
