package com.google.android.material.search;

import ae.C5597b;
import ae.d;
import ae.e;
import ae.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.t;
import d2.C13462a;
import ie.C14718a;
import re.C16760h;
import re.C16761i;
import w2.AbstractC17751a;

/* loaded from: classes4.dex */
public class SearchBar extends Toolbar {

    /* renamed from: j0, reason: collision with root package name */
    private static final int f87314j0 = k.f44803s;

    /* renamed from: U, reason: collision with root package name */
    private final TextView f87315U;

    /* renamed from: V, reason: collision with root package name */
    private final boolean f87316V;

    /* renamed from: W, reason: collision with root package name */
    private final boolean f87317W;

    /* renamed from: a0, reason: collision with root package name */
    private final Drawable f87318a0;

    /* renamed from: b0, reason: collision with root package name */
    private final boolean f87319b0;

    /* renamed from: c0, reason: collision with root package name */
    private final boolean f87320c0;

    /* renamed from: d0, reason: collision with root package name */
    private View f87321d0;

    /* renamed from: e0, reason: collision with root package name */
    private Integer f87322e0;

    /* renamed from: f0, reason: collision with root package name */
    private Drawable f87323f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f87324g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f87325h0;

    /* renamed from: i0, reason: collision with root package name */
    private C16760h f87326i0;

    static class a extends AbstractC17751a {
        public static final Parcelable.Creator<a> CREATOR = new C1273a();

        /* renamed from: c, reason: collision with root package name */
        String f87328c;

        /* renamed from: com.google.android.material.search.SearchBar$a$a, reason: collision with other inner class name */
        class C1273a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }

            C1273a() {
            }
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f87328c = parcel.readString();
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f87328c);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private int S(int i10, int i11) {
        return i10 == 0 ? i11 : i10;
    }

    public void setHint(CharSequence charSequence) {
        this.f87315U.setHint(charSequence);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.f87315U.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: h, reason: collision with root package name */
        private boolean f87327h;

        public ScrollingViewBehavior() {
            this.f87327h = false;
        }

        private void Y(AppBarLayout appBarLayout) throws Resources.NotFoundException {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.e
        protected boolean T() {
            return true;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f87327h = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            boolean zL = super.l(coordinatorLayout, view, view2);
            if (!this.f87327h && (view2 instanceof AppBarLayout)) {
                this.f87327h = true;
                Y((AppBarLayout) view2);
            }
            return zL;
        }
    }

    private void T() {
        View view = this.f87321d0;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i10 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f87321d0.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        U(this.f87321d0, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
    }

    private Drawable V(Drawable drawable) {
        int iD;
        if (!this.f87319b0 || drawable == null) {
            return drawable;
        }
        Integer num = this.f87322e0;
        if (num != null) {
            iD = num.intValue();
        } else {
            iD = C14718a.d(this, drawable == this.f87318a0 ? C5597b.f44535p : C5597b.f44533o);
        }
        Drawable drawableR = C13462a.r(drawable.mutate());
        C13462a.n(drawableR, iD);
        return drawableR;
    }

    private void W(int i10, int i11) {
        View view = this.f87321d0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    private void X() throws Resources.NotFoundException {
        if (this.f87317W && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(d.f44561A);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = S(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = S(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = S(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = S(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void Y() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z10 = getLayoutDirection() == 1;
        ImageButton imageButtonD = t.d(this);
        int width = (imageButtonD == null || !imageButtonD.isClickable()) ? 0 : z10 ? getWidth() - imageButtonD.getLeft() : imageButtonD.getRight();
        ActionMenuView actionMenuViewA = t.a(this);
        int right = actionMenuViewA != null ? z10 ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft() : 0;
        float f10 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f10, 0.0f, -width, 0.0f);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f87316V && this.f87321d0 == null && !(view instanceof ActionMenuView)) {
            this.f87321d0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public View getCenterView() {
        return this.f87321d0;
    }

    float getCompatElevation() {
        C16760h c16760h = this.f87326i0;
        return c16760h != null ? c16760h.w() : ViewCompat.u(this);
    }

    public float getCornerSize() {
        return this.f87326i0.J();
    }

    protected int getDefaultMarginVerticalResource() {
        return d.f44563B;
    }

    protected int getDefaultNavigationIconResource() {
        return e.f44645c;
    }

    public CharSequence getHint() {
        return this.f87315U.getHint();
    }

    int getMenuResId() {
        return this.f87324g0;
    }

    public int getStrokeColor() {
        return this.f87326i0.F().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f87326i0.H();
    }

    public CharSequence getText() {
        return this.f87315U.getText();
    }

    public TextView getTextView() {
        return this.f87315U;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText(aVar.f87328c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        CharSequence text = getText();
        aVar.f87328c = text == null ? null : text.toString();
        return aVar;
    }

    public void setCenterView(View view) {
        View view2 = this.f87321d0;
        if (view2 != null) {
            removeView(view2);
            this.f87321d0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f87325h0 = z10;
        Z();
    }

    public void setHint(int i10) {
        this.f87315U.setHint(i10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f87320c0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setText(int i10) {
        this.f87315U.setText(i10);
    }

    private void U(View view, int i10, int i11, int i12, int i13) {
        if (ViewCompat.z(this) == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    private void Z() {
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.f87325h0) {
                if (eVar.c() == 0) {
                    eVar.g(53);
                }
            } else if (eVar.c() == 53) {
                eVar.g(0);
            }
        }
    }

    private void setNavigationIconDecorative(boolean z10) {
        Drawable drawable;
        ImageButton imageButtonD = t.d(this);
        if (imageButtonD == null) {
            return;
        }
        imageButtonD.setClickable(!z10);
        imageButtonD.setFocusable(!z10);
        Drawable background = imageButtonD.getBackground();
        if (background != null) {
            this.f87323f0 = background;
        }
        if (z10) {
            drawable = null;
        } else {
            drawable = this.f87323f0;
        }
        imageButtonD.setBackgroundDrawable(drawable);
        Y();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        C16761i.f(this, this.f87326i0);
        X();
        Z();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        int i10 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (i10 >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        T();
        Y();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        W(i10, i11);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C16760h c16760h = this.f87326i0;
        if (c16760h != null) {
            c16760h.a0(f10);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(V(drawable));
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f87326i0.k0(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            this.f87326i0.l0(f10);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof f;
        if (z10) {
            ((f) menu).i0();
        }
        super.x(i10);
        this.f87324g0 = i10;
        if (z10) {
            ((f) menu).h0();
        }
    }
}
