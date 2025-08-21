package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.S;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import b2.C6327h;
import d2.C13595a;
import i.C14578a;

/* loaded from: classes4.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements k.a {

    /* renamed from: G, reason: collision with root package name */
    private static final int[] f87927G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    private FrameLayout f87928A;

    /* renamed from: B, reason: collision with root package name */
    private androidx.appcompat.view.menu.h f87929B;

    /* renamed from: C, reason: collision with root package name */
    private ColorStateList f87930C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f87931D;

    /* renamed from: E, reason: collision with root package name */
    private Drawable f87932E;

    /* renamed from: F, reason: collision with root package name */
    private final androidx.core.view.a f87933F;

    /* renamed from: v, reason: collision with root package name */
    private int f87934v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f87935w;

    /* renamed from: x, reason: collision with root package name */
    boolean f87936x;

    /* renamed from: y, reason: collision with root package name */
    boolean f87937y;

    /* renamed from: z, reason: collision with root package name */
    private final CheckedTextView f87938z;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, q2.y yVar) {
            super.g(view, yVar);
            yVar.n0(NavigationMenuItemView.this.f87936x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return false;
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f87931D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C13595a.r(drawable).mutate();
                C13595a.o(drawable, this.f87930C);
            }
            int i10 = this.f87934v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f87935w) {
            if (this.f87932E == null) {
                Drawable drawableF = C6327h.f(getResources(), ce.e.f61669l, getContext().getTheme());
                this.f87932E = drawableF;
                if (drawableF != null) {
                    int i11 = this.f87934v;
                    drawableF.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f87932E;
        }
        androidx.core.widget.k.j(this.f87938z, drawable, null, null, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f87937y = true;
        a aVar = new a();
        this.f87933F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ce.h.f61740k, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(ce.d.f61614e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ce.f.f61706j);
        this.f87938z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.m0(checkedTextView, aVar);
    }

    private StateListDrawable A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C14578a.f136301w, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f87927G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.f87929B.getTitle() == null && this.f87929B.getIcon() == null && this.f87929B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f87928A == null) {
                this.f87928A = (FrameLayout) ((ViewStub) findViewById(ce.f.f61705i)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f87928A.removeAllViews();
            this.f87928A.addView(view);
        }
    }

    public void B(androidx.appcompat.view.menu.h hVar, boolean z10) throws Resources.NotFoundException {
        this.f87937y = z10;
        b(hVar, 0);
    }

    public void C() {
        FrameLayout frameLayout = this.f87928A;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f87938z.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void b(androidx.appcompat.view.menu.h hVar, int i10) throws Resources.NotFoundException {
        this.f87929B = hVar;
        if (hVar.getItemId() > 0) {
            setId(hVar.getItemId());
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ViewCompat.q0(this, A());
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.getTitle());
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.getContentDescription());
        S.a(this, hVar.getTooltipText());
        z();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.h getItemData() {
        return this.f87929B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.h hVar = this.f87929B;
        if (hVar != null && hVar.isCheckable() && this.f87929B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f87927G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setIconPadding(int i10) {
        this.f87938z.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f87934v = i10;
    }

    void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f87930C = colorStateList;
        this.f87931D = colorStateList != null;
        androidx.appcompat.view.menu.h hVar = this.f87929B;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f87938z.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f87935w = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.k.p(this.f87938z, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f87938z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f87938z.setText(charSequence);
    }

    private void z() {
        if (D()) {
            this.f87938z.setVisibility(8);
            FrameLayout frameLayout = this.f87928A;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f87928A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f87938z.setVisibility(0);
        FrameLayout frameLayout2 = this.f87928A;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f87928A.setLayoutParams(aVar2);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f87936x != z10) {
            this.f87936x = z10;
            this.f87933F.l(this.f87938z, RecyclerView.m.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z10) {
        int i10;
        refreshDrawableState();
        this.f87938z.setChecked(z10);
        CheckedTextView checkedTextView = this.f87938z;
        Typeface typeface = checkedTextView.getTypeface();
        if (z10 && this.f87937y) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        checkedTextView.setTypeface(typeface, i10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }
}
