package com.google.android.material.checkbox;

import Q0.C5046a;
import Q0.C5047b;
import ae.C5597b;
import ae.e;
import ae.f;
import ae.j;
import ae.k;
import ae.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.M;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import d2.C13462a;
import ie.C14718a;
import j.C14791a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import oe.C16026c;
import ue.C17250a;

/* loaded from: classes4.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f86649A;

    /* renamed from: B, reason: collision with root package name */
    private static final int[][] f86650B;

    /* renamed from: C, reason: collision with root package name */
    @SuppressLint({"DiscouragedApi"})
    private static final int f86651C;

    /* renamed from: y, reason: collision with root package name */
    private static final int f86652y = k.f44774B;

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f86653z = {C5597b.f44520h0};

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet<c> f86654e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedHashSet<b> f86655f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f86656g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f86657h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f86658i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f86659j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f86660k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f86661l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f86662m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f86663n;

    /* renamed from: o, reason: collision with root package name */
    ColorStateList f86664o;

    /* renamed from: p, reason: collision with root package name */
    ColorStateList f86665p;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f86666q;

    /* renamed from: r, reason: collision with root package name */
    private int f86667r;

    /* renamed from: s, reason: collision with root package name */
    private int[] f86668s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f86669t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f86670u;

    /* renamed from: v, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f86671v;

    /* renamed from: w, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.c f86672w;

    /* renamed from: x, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f86673x;

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f86664o;
            if (colorStateList != null) {
                C13462a.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f86664o;
            if (colorStateList != null) {
                C13462a.n(drawable, colorStateList.getColorForState(materialCheckBox.f86668s, MaterialCheckBox.this.f86664o.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a(MaterialCheckBox materialCheckBox, int i10);
    }

    public interface c {
        void a(MaterialCheckBox materialCheckBox, boolean z10);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f86675a;

        class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }

            a() {
            }
        }

        /* synthetic */ d(Parcel parcel, a aVar) {
            this(parcel);
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        private String a() {
            int i10 = this.f86675a;
            return i10 != 1 ? i10 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        private d(Parcel parcel) {
            super(parcel);
            this.f86675a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f86675a));
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44517g);
    }

    private void i() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f86653z);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f86649A);
        }
        this.f86668s = com.google.android.material.drawable.d.e(iArrOnCreateDrawableState);
        i();
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C14791a.b(getContext(), i10));
    }

    static {
        int i10 = C5597b.f44518g0;
        f86649A = new int[]{i10};
        f86650B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f86651C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f86652y;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f86654e = new LinkedHashSet<>();
        this.f86655f = new LinkedHashSet<>();
        this.f86672w = androidx.vectordrawable.graphics.drawable.c.a(getContext(), e.f44649g);
        this.f86673x = new a();
        Context context2 = getContext();
        this.f86661l = androidx.core.widget.c.a(this);
        this.f86664o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        M mJ = s.j(context2, attributeSet, l.f44912I4, i10, i11, new int[0]);
        this.f86662m = mJ.g(l.f44948L4);
        if (this.f86661l != null && s.g(context2) && c(mJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f86661l = C14791a.b(context2, e.f44648f);
            this.f86663n = true;
            if (this.f86662m == null) {
                this.f86662m = C14791a.b(context2, e.f44650h);
            }
        }
        this.f86665p = C16026c.b(context2, mJ, l.f44960M4);
        this.f86666q = x.l(mJ.k(l.f44972N4, -1), PorterDuff.Mode.SRC_IN);
        this.f86657h = mJ.a(l.f45028S4, false);
        this.f86658i = mJ.a(l.f44984O4, true);
        this.f86659j = mJ.a(l.f45017R4, false);
        this.f86660k = mJ.p(l.f45006Q4);
        if (mJ.s(l.f44995P4)) {
            setCheckedState(mJ.k(l.f44995P4, 0));
        }
        mJ.x();
        e();
    }

    private boolean c(M m10) {
        return m10.n(l.f44924J4, 0) == f86651C && m10.n(l.f44936K4, 0) == 0;
    }

    private void e() {
        this.f86661l = com.google.android.material.drawable.d.c(this.f86661l, this.f86664o, androidx.core.widget.c.c(this));
        this.f86662m = com.google.android.material.drawable.d.c(this.f86662m, this.f86665p, this.f86666q);
        g();
        h();
        super.setButtonDrawable(com.google.android.material.drawable.d.a(this.f86661l, this.f86662m));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f86670u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f86663n) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f86672w;
            if (cVar2 != null) {
                cVar2.f(this.f86673x);
                this.f86672w.b(this.f86673x);
            }
            Drawable drawable = this.f86661l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f86672w) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(f.f44685d, f.f44680Z, cVar, false);
            ((AnimatedStateListDrawable) this.f86661l).addTransition(f.f44693l, f.f44680Z, this.f86672w, false);
        }
    }

    private String getButtonStateDescription() {
        int i10 = this.f86667r;
        return i10 == 1 ? getResources().getString(j.f44760n) : i10 == 0 ? getResources().getString(j.f44762p) : getResources().getString(j.f44761o);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f86656g == null) {
            int[][] iArr = f86650B;
            int[] iArr2 = new int[iArr.length];
            int iD = C14718a.d(this, C5597b.f44525k);
            int iD2 = C14718a.d(this, C5597b.f44529m);
            int iD3 = C14718a.d(this, C5597b.f44541s);
            int iD4 = C14718a.d(this, C5597b.f44533o);
            iArr2[0] = C14718a.j(iD3, iD2, 1.0f);
            iArr2[1] = C14718a.j(iD3, iD, 1.0f);
            iArr2[2] = C14718a.j(iD3, iD4, 0.54f);
            iArr2[3] = C14718a.j(iD3, iD4, 0.38f);
            iArr2[4] = C14718a.j(iD3, iD4, 0.38f);
            this.f86656g = new ColorStateList(iArr, iArr2);
        }
        return this.f86656g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f86664o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f86661l;
        if (drawable != null && (colorStateList2 = this.f86664o) != null) {
            C13462a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f86662m;
        if (drawable2 == null || (colorStateList = this.f86665p) == null) {
            return;
        }
        C13462a.o(drawable2, colorStateList);
    }

    public boolean d() {
        return this.f86659j;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f86661l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f86662m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f86665p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f86666q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f86664o;
    }

    public int getCheckedState() {
        return this.f86667r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f86660k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f86667r == 1;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f86658i || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (x.k(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            C13462a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f86675a);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f86661l = drawable;
        this.f86663n = false;
        e();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f86662m = drawable;
        e();
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f86665p == colorStateList) {
            return;
        }
        this.f86665p = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f86666q == mode) {
            return;
        }
        this.f86666q = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f86664o == colorStateList) {
            return;
        }
        this.f86664o = colorStateList;
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f86658i = z10;
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f86667r != i10) {
            this.f86667r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (this.f86669t) {
                return;
            }
            this.f86669t = true;
            LinkedHashSet<b> linkedHashSet = this.f86655f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f86667r);
                }
            }
            if (this.f86667r != 2 && (onCheckedChangeListener = this.f86671v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = C5047b.a(getContext().getSystemService(C5046a.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f86669t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f86660k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f86659j == z10) {
            return;
        }
        this.f86659j = z10;
        refreshDrawableState();
        Iterator<c> it = this.f86654e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f86659j);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f86671v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f86670u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f86657h = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f86657h && this.f86664o == null && this.f86665p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f86660k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f86675a = getCheckedState();
        return dVar;
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(C14791a.b(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        i();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
