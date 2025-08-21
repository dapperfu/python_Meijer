package com.google.android.material.checkbox;

import Q0.C4644a;
import Q0.C4645b;
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
import ce.C6503b;
import ce.e;
import ce.f;
import ce.j;
import ce.k;
import ce.l;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import d2.C13595a;
import j.C14879a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ke.C15121a;
import qe.C16634c;
import we.C17867a;

/* loaded from: classes4.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f87489A;

    /* renamed from: B, reason: collision with root package name */
    private static final int[][] f87490B;

    /* renamed from: C, reason: collision with root package name */
    @SuppressLint({"DiscouragedApi"})
    private static final int f87491C;

    /* renamed from: y, reason: collision with root package name */
    private static final int f87492y = k.f61789B;

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f87493z = {C6503b.f61535h0};

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet<c> f87494e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedHashSet<b> f87495f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f87496g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f87497h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f87498i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f87499j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f87500k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f87501l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f87502m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f87503n;

    /* renamed from: o, reason: collision with root package name */
    ColorStateList f87504o;

    /* renamed from: p, reason: collision with root package name */
    ColorStateList f87505p;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f87506q;

    /* renamed from: r, reason: collision with root package name */
    private int f87507r;

    /* renamed from: s, reason: collision with root package name */
    private int[] f87508s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f87509t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f87510u;

    /* renamed from: v, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f87511v;

    /* renamed from: w, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.c f87512w;

    /* renamed from: x, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f87513x;

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f87504o;
            if (colorStateList != null) {
                C13595a.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f87504o;
            if (colorStateList != null) {
                C13595a.n(drawable, colorStateList.getColorForState(materialCheckBox.f87508s, MaterialCheckBox.this.f87504o.getDefaultColor()));
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
        int f87515a;

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
            int i10 = this.f87515a;
            return i10 != 1 ? i10 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        private d(Parcel parcel) {
            super(parcel);
            this.f87515a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f87515a));
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61532g);
    }

    private void i() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f87493z);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f87489A);
        }
        this.f87508s = com.google.android.material.drawable.d.e(iArrOnCreateDrawableState);
        i();
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C14879a.b(getContext(), i10));
    }

    static {
        int i10 = C6503b.f61533g0;
        f87489A = new int[]{i10};
        f87490B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f87491C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87492y;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f87494e = new LinkedHashSet<>();
        this.f87495f = new LinkedHashSet<>();
        this.f87512w = androidx.vectordrawable.graphics.drawable.c.a(getContext(), e.f61664g);
        this.f87513x = new a();
        Context context2 = getContext();
        this.f87501l = androidx.core.widget.c.a(this);
        this.f87504o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        M mJ = s.j(context2, attributeSet, l.f61927I4, i10, i11, new int[0]);
        this.f87502m = mJ.g(l.f61963L4);
        if (this.f87501l != null && s.g(context2) && c(mJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f87501l = C14879a.b(context2, e.f61663f);
            this.f87503n = true;
            if (this.f87502m == null) {
                this.f87502m = C14879a.b(context2, e.f61665h);
            }
        }
        this.f87505p = C16634c.b(context2, mJ, l.f61975M4);
        this.f87506q = x.l(mJ.k(l.f61987N4, -1), PorterDuff.Mode.SRC_IN);
        this.f87497h = mJ.a(l.f62043S4, false);
        this.f87498i = mJ.a(l.f61999O4, true);
        this.f87499j = mJ.a(l.f62032R4, false);
        this.f87500k = mJ.p(l.f62021Q4);
        if (mJ.s(l.f62010P4)) {
            setCheckedState(mJ.k(l.f62010P4, 0));
        }
        mJ.x();
        e();
    }

    private boolean c(M m10) {
        return m10.n(l.f61939J4, 0) == f87491C && m10.n(l.f61951K4, 0) == 0;
    }

    private void e() {
        this.f87501l = com.google.android.material.drawable.d.c(this.f87501l, this.f87504o, androidx.core.widget.c.c(this));
        this.f87502m = com.google.android.material.drawable.d.c(this.f87502m, this.f87505p, this.f87506q);
        g();
        h();
        super.setButtonDrawable(com.google.android.material.drawable.d.a(this.f87501l, this.f87502m));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f87510u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f87503n) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f87512w;
            if (cVar2 != null) {
                cVar2.f(this.f87513x);
                this.f87512w.b(this.f87513x);
            }
            Drawable drawable = this.f87501l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f87512w) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(f.f61700d, f.f61695Z, cVar, false);
            ((AnimatedStateListDrawable) this.f87501l).addTransition(f.f61708l, f.f61695Z, this.f87512w, false);
        }
    }

    private String getButtonStateDescription() {
        int i10 = this.f87507r;
        return i10 == 1 ? getResources().getString(j.f61775n) : i10 == 0 ? getResources().getString(j.f61777p) : getResources().getString(j.f61776o);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f87496g == null) {
            int[][] iArr = f87490B;
            int[] iArr2 = new int[iArr.length];
            int iD = C15121a.d(this, C6503b.f61540k);
            int iD2 = C15121a.d(this, C6503b.f61544m);
            int iD3 = C15121a.d(this, C6503b.f61556s);
            int iD4 = C15121a.d(this, C6503b.f61548o);
            iArr2[0] = C15121a.j(iD3, iD2, 1.0f);
            iArr2[1] = C15121a.j(iD3, iD, 1.0f);
            iArr2[2] = C15121a.j(iD3, iD4, 0.54f);
            iArr2[3] = C15121a.j(iD3, iD4, 0.38f);
            iArr2[4] = C15121a.j(iD3, iD4, 0.38f);
            this.f87496g = new ColorStateList(iArr, iArr2);
        }
        return this.f87496g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f87504o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f87501l;
        if (drawable != null && (colorStateList2 = this.f87504o) != null) {
            C13595a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f87502m;
        if (drawable2 == null || (colorStateList = this.f87505p) == null) {
            return;
        }
        C13595a.o(drawable2, colorStateList);
    }

    public boolean d() {
        return this.f87499j;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f87501l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f87502m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f87505p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f87506q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f87504o;
    }

    public int getCheckedState() {
        return this.f87507r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f87500k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f87507r == 1;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f87498i || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
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
            C13595a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
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
        setCheckedState(dVar.f87515a);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f87501l = drawable;
        this.f87503n = false;
        e();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f87502m = drawable;
        e();
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f87505p == colorStateList) {
            return;
        }
        this.f87505p = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f87506q == mode) {
            return;
        }
        this.f87506q = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f87504o == colorStateList) {
            return;
        }
        this.f87504o = colorStateList;
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f87498i = z10;
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f87507r != i10) {
            this.f87507r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (this.f87509t) {
                return;
            }
            this.f87509t = true;
            LinkedHashSet<b> linkedHashSet = this.f87495f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f87507r);
                }
            }
            if (this.f87507r != 2 && (onCheckedChangeListener = this.f87511v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = C4645b.a(getContext().getSystemService(C4644a.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f87509t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f87500k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f87499j == z10) {
            return;
        }
        this.f87499j = z10;
        refreshDrawableState();
        Iterator<c> it = this.f87494e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f87499j);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f87511v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f87510u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f87497h = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f87497h && this.f87504o == null && this.f87505p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f87500k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f87515a = getCheckedState();
        return dVar;
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(C14879a.b(getContext(), i10));
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
