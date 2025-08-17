package com.google.android.material.snackbar;

import ae.C5597b;
import ae.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes4.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: J, reason: collision with root package name */
    private static final int[] f87560J;

    /* renamed from: K, reason: collision with root package name */
    private static final int[] f87561K;

    /* renamed from: H, reason: collision with root package name */
    private final AccessibilityManager f87562H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f87563I;

    public static class a extends BaseTransientBottomBar.r<Snackbar> {
        public void c(Snackbar snackbar, int i10) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Snackbar snackbar) {
        }
    }

    private static ViewGroup l0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static Snackbar r0(View view, CharSequence charSequence, int i10) {
        return s0(null, view, charSequence, i10);
    }

    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i10 = C5597b.f44506a0;
        f87560J = new int[]{i10};
        f87561K = new int[]{i10, C5597b.f44510c0};
    }

    private SnackbarContentLayout n0() {
        return (SnackbarContentLayout) this.f87506i.getChildAt(0);
    }

    private static boolean p0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f87561K);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public Snackbar w0(ColorStateList colorStateList) {
        this.f87506i.setBackgroundTintList(colorStateList);
        return this;
    }

    public Snackbar x0(PorterDuff.Mode mode) {
        this.f87506i.setBackgroundTintMode(mode);
        return this;
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        super(context, viewGroup, view, aVar);
        this.f87562H = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static /* synthetic */ void k0(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.B(1);
    }

    private Button m0() {
        return n0().getActionView();
    }

    private TextView o0() {
        return n0().getMessageView();
    }

    public static Snackbar q0(View view, int i10, int i11) {
        return r0(view, view.getResources().getText(i10), i11);
    }

    private static Snackbar s0(Context context, View view, CharSequence charSequence, int i10) {
        int i11;
        ViewGroup viewGroupL0 = l0(view);
        if (viewGroupL0 != null) {
            if (context == null) {
                context = viewGroupL0.getContext();
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            if (p0(context)) {
                i11 = h.f44712B;
            } else {
                i11 = h.f44717c;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate(i11, viewGroupL0, false);
            Snackbar snackbar = new Snackbar(context, viewGroupL0, snackbarContentLayout, snackbarContentLayout);
            snackbar.z0(charSequence);
            snackbar.Y(i10);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void A() {
        super.A();
    }

    public Snackbar A0(int i10) {
        o0().setTextColor(i10);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int F() {
        int i10;
        int iF = super.F();
        if (iF == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f87563I) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            return this.f87562H.getRecommendedTimeoutMillis(iF, i10 | 3);
        }
        if (this.f87563I && this.f87562H.isTouchExplorationEnabled()) {
            return -2;
        }
        return iF;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void c0() {
        super.c0();
    }

    public Snackbar t0(int i10, View.OnClickListener onClickListener) {
        return u0(E().getText(i10), onClickListener);
    }

    public Snackbar u0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button buttonM0 = m0();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.f87563I = true;
            buttonM0.setVisibility(0);
            buttonM0.setText(charSequence);
            buttonM0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar.k0(this.f87568a, onClickListener, view);
                }
            });
            return this;
        }
        buttonM0.setVisibility(8);
        buttonM0.setOnClickListener(null);
        this.f87563I = false;
        return this;
    }

    public Snackbar v0(int i10) {
        return w0(ColorStateList.valueOf(i10));
    }

    public Snackbar y0(int i10) {
        return z0(E().getText(i10));
    }

    public Snackbar z0(CharSequence charSequence) {
        o0().setText(charSequence);
        return this;
    }
}
