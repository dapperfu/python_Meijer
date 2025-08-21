package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import ce.C6503b;
import ce.k;
import ce.l;
import com.google.android.material.internal.s;
import com.google.android.material.internal.t;
import d2.C13595a;
import te.C17234h;
import te.C17235i;
import we.C17867a;

/* loaded from: classes4.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: c0, reason: collision with root package name */
    private static final int f87092c0 = k.f61798K;

    /* renamed from: d0, reason: collision with root package name */
    private static final ImageView.ScaleType[] f87093d0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: U, reason: collision with root package name */
    private Integer f87094U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f87095V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f87096W;

    /* renamed from: a0, reason: collision with root package name */
    private ImageView.ScaleType f87097a0;

    /* renamed from: b0, reason: collision with root package name */
    private Boolean f87098b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61555r0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87092c0;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f62264l5, i10, i11, new int[0]);
        if (typedArrayI.hasValue(l.f62300o5)) {
            setNavigationIconTint(typedArrayI.getColor(l.f62300o5, -1));
        }
        this.f87095V = typedArrayI.getBoolean(l.f62324q5, false);
        this.f87096W = typedArrayI.getBoolean(l.f62312p5, false);
        int i12 = typedArrayI.getInt(l.f62288n5, -1);
        if (i12 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f87093d0;
            if (i12 < scaleTypeArr.length) {
                this.f87097a0 = scaleTypeArr[i12];
            }
        }
        if (typedArrayI.hasValue(l.f62276m5)) {
            this.f87098b0 = Boolean.valueOf(typedArrayI.getBoolean(l.f62276m5, false));
        }
        typedArrayI.recycle();
        T(context2);
    }

    private void V() {
        if (this.f87095V || this.f87096W) {
            TextView textViewG = t.g(this);
            TextView textViewE = t.e(this);
            if (textViewG == null && textViewE == null) {
                return;
            }
            Pair<Integer, Integer> pairS = S(textViewG, textViewE);
            if (this.f87095V && textViewG != null) {
                U(textViewG, pairS);
            }
            if (!this.f87096W || textViewE == null) {
                return;
            }
            U(textViewE, pairS);
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable == null || this.f87094U == null) {
            return drawable;
        }
        Drawable drawableR = C13595a.r(drawable.mutate());
        C13595a.n(drawableR, this.f87094U.intValue());
        return drawableR;
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f87097a0;
    }

    public Integer getNavigationIconTint() {
        return this.f87094U;
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f87098b0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f87098b0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f87097a0 != scaleType) {
            this.f87097a0 = scaleType;
            requestLayout();
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f87096W != z10) {
            this.f87096W = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f87095V != z10) {
            this.f87095V = z10;
            requestLayout();
        }
    }

    private Pair<Integer, Integer> S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context) {
        ColorStateList colorStateListF;
        Drawable background = getBackground();
        if (background == null) {
            colorStateListF = ColorStateList.valueOf(0);
        } else {
            colorStateListF = com.google.android.material.drawable.d.f(background);
        }
        if (colorStateListF != null) {
            C17234h c17234h = new C17234h();
            c17234h.b0(colorStateListF);
            c17234h.Q(context);
            c17234h.a0(ViewCompat.u(this));
            ViewCompat.q0(this, c17234h);
        }
    }

    private void U(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void X() {
        ImageView imageViewC = t.c(this);
        if (imageViewC != null) {
            Boolean bool = this.f87098b0;
            if (bool != null) {
                imageViewC.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f87097a0;
            if (scaleType != null) {
                imageViewC.setScaleType(scaleType);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C17235i.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        V();
        X();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C17235i.d(this, f10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f87094U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.f;
        if (z10) {
            ((androidx.appcompat.view.menu.f) menu).i0();
        }
        super.x(i10);
        if (z10) {
            ((androidx.appcompat.view.menu.f) menu).h0();
        }
    }
}
