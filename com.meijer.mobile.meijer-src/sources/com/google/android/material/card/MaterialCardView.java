package com.google.android.material.card;

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
import ce.C6503b;
import ce.k;
import ce.l;
import com.fullstory.FS;
import com.google.android.material.internal.s;
import j.C14879a;
import te.C17235i;
import te.C17239m;
import te.InterfaceC17242p;
import we.C17867a;

/* loaded from: classes4.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC17242p {

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f87383o = {R.attr.state_checkable};

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f87384p = {R.attr.state_checked};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f87385q = {C6503b.f61531f0};

    /* renamed from: r, reason: collision with root package name */
    private static final int f87386r = k.f61824y;

    /* renamed from: j, reason: collision with root package name */
    private final b f87387j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f87388k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f87389l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f87390m;

    /* renamed from: n, reason: collision with root package name */
    private a f87391n;

    public interface a {
        void a(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61499F);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f87387j.L(ColorStateList.valueOf(i10));
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f87387j.S(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87386r;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f87389l = false;
        this.f87390m = false;
        this.f87388k = true;
        TypedArray typedArrayI = s.i(getContext(), attributeSet, l.f62407x4, i10, i11, new int[0]);
        b bVar = new b(this, attributeSet, i10, i11);
        this.f87387j = bVar;
        bVar.L(super.getCardBackgroundColor());
        bVar.b0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.I(typedArrayI);
        typedArrayI.recycle();
    }

    private void g() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f87387j.k();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f87387j.l().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f87387j.m();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f87387j.n();
    }

    public Drawable getCheckedIcon() {
        return this.f87387j.o();
    }

    public int getCheckedIconGravity() {
        return this.f87387j.p();
    }

    public int getCheckedIconMargin() {
        return this.f87387j.q();
    }

    public int getCheckedIconSize() {
        return this.f87387j.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f87387j.s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f87387j.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f87387j.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f87387j.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f87387j.C().top;
    }

    public float getProgress() {
        return this.f87387j.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f87387j.u();
    }

    public ColorStateList getRippleColor() {
        return this.f87387j.x();
    }

    public C17239m getShapeAppearanceModel() {
        return this.f87387j.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f87387j.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f87387j.A();
    }

    public int getStrokeWidth() {
        return this.f87387j.B();
    }

    public boolean h() {
        b bVar = this.f87387j;
        return bVar != null && bVar.F();
    }

    public boolean i() {
        return this.f87390m;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f87389l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (h()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f87383o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f87384p);
        }
        if (i()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f87385q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f87388k) {
            if (!this.f87387j.E()) {
                FS.log_i("MaterialCardView", "Setting a custom background is not supported.");
                this.f87387j.K(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f87387j.L(colorStateList);
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f87387j.M(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f87387j.N(z10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f87389l != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f87387j.Q(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        if (this.f87387j.p() != i10) {
            this.f87387j.R(i10);
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f87387j.S(i10);
    }

    public void setCheckedIconResource(int i10) {
        this.f87387j.Q(C14879a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f87387j.T(i10);
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f87387j.T(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f87387j.U(colorStateList);
    }

    public void setDragged(boolean z10) {
        if (this.f87390m != z10) {
            this.f87390m = z10;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f87391n = aVar;
    }

    public void setProgress(float f10) {
        this.f87387j.W(f10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f87387j.X(colorStateList);
    }

    public void setRippleColorResource(int i10) {
        this.f87387j.X(C14879a.a(getContext(), i10));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f87387j.Z(colorStateList);
        invalidate();
    }

    public void setStrokeWidth(int i10) {
        this.f87387j.a0(i10);
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
        this.f87387j.f0();
        C17235i.f(this, this.f87387j.l());
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
        this.f87387j.J(getMeasuredWidth(), getMeasuredHeight());
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
        this.f87387j.h0();
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        b bVar = this.f87387j;
        if (bVar != null) {
            bVar.f0();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f87387j.j0();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f87387j.j0();
        this.f87387j.g0();
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f87387j.V(f10);
    }

    @Override // te.InterfaceC17242p
    public void setShapeAppearanceModel(C17239m c17239m) {
        setClipToOutline(c17239m.u(getBoundsAsRectF()));
        this.f87387j.Y(c17239m);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f87387j.j0();
        this.f87387j.g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (h() && isEnabled()) {
            this.f87389l = !this.f87389l;
            refreshDrawableState();
            g();
            this.f87387j.P(this.f87389l, true);
            a aVar = this.f87391n;
            if (aVar != null) {
                aVar.a(this, this.f87389l);
            }
        }
    }
}
