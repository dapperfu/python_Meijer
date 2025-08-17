package com.google.android.material.button;

import ae.C5597b;
import ae.k;
import ae.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import d2.C13462a;
import j.C14791a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import oe.C16026c;
import re.C16761i;
import re.C16765m;
import re.InterfaceC16768p;
import ue.C17250a;
import w2.AbstractC17751a;

/* loaded from: classes4.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC16768p {

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f86484o = {R.attr.state_checkable};

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f86485p = {R.attr.state_checked};

    /* renamed from: q, reason: collision with root package name */
    private static final int f86486q = k.f44808x;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.material.button.a f86487a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<a> f86488b;

    /* renamed from: c, reason: collision with root package name */
    private b f86489c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuff.Mode f86490d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f86491e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f86492f;

    /* renamed from: g, reason: collision with root package name */
    private String f86493g;

    /* renamed from: h, reason: collision with root package name */
    private int f86494h;

    /* renamed from: i, reason: collision with root package name */
    private int f86495i;

    /* renamed from: j, reason: collision with root package name */
    private int f86496j;

    /* renamed from: k, reason: collision with root package name */
    private int f86497k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f86498l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f86499m;

    /* renamed from: n, reason: collision with root package name */
    private int f86500n;

    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    static class c extends AbstractC17751a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f86501c;

        class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }

            a() {
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }

        private void b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f86501c = z10;
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f86501c ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44481C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f86486q;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f86488b = new LinkedHashSet<>();
        this.f86498l = false;
        this.f86499m = false;
        Context context2 = getContext();
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f44839C3, i10, i11, new int[0]);
        this.f86497k = typedArrayI.getDimensionPixelSize(l.f44994P3, 0);
        this.f86490d = x.l(typedArrayI.getInt(l.f45027S3, -1), PorterDuff.Mode.SRC_IN);
        this.f86491e = C16026c.a(getContext(), typedArrayI, l.f45016R3);
        this.f86492f = C16026c.d(getContext(), typedArrayI, l.f44971N3);
        this.f86500n = typedArrayI.getInteger(l.f44983O3, 1);
        this.f86494h = typedArrayI.getDimensionPixelSize(l.f45005Q3, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, C16765m.e(context2, attributeSet, i10, i11).m());
        this.f86487a = aVar;
        aVar.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f86497k);
        h(this.f86492f != null);
    }

    private boolean b() {
        int i10 = this.f86500n;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.f86500n;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.f86500n;
        return i10 == 16 || i10 == 32;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f86487a;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void h(boolean z10) {
        Drawable drawable = this.f86492f;
        if (drawable != null) {
            Drawable drawableMutate = C13462a.r(drawable).mutate();
            this.f86492f = drawableMutate;
            C13462a.o(drawableMutate, this.f86491e);
            PorterDuff.Mode mode = this.f86490d;
            if (mode != null) {
                C13462a.p(this.f86492f, mode);
            }
            int intrinsicWidth = this.f86494h;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f86492f.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f86494h;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f86492f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f86492f;
            int i10 = this.f86495i;
            int i11 = this.f86496j;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f86492f.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] drawableArrA = androidx.core.widget.k.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.f86492f) && ((!b() || drawable5 == this.f86492f) && (!d() || drawable4 == this.f86492f))) {
            return;
        }
        g();
    }

    private void i(int i10, int i11) {
        if (this.f86492f == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f86495i = 0;
                if (this.f86500n == 16) {
                    this.f86496j = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f86494h;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f86492f.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f86497k) - getPaddingBottom()) / 2);
                if (this.f86496j != iMax) {
                    this.f86496j = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f86496j = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f86500n;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f86495i = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f86494h;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f86492f.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - ViewCompat.D(this)) - intrinsicWidth) - this.f86497k) - ViewCompat.E(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f86500n == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f86495i != textLayoutWidth) {
            this.f86495i = textLayoutWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f86487a;
        return aVar != null && aVar.p();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f86493g)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f86493g;
    }

    public Drawable getIcon() {
        return this.f86492f;
    }

    public int getIconGravity() {
        return this.f86500n;
    }

    public int getIconPadding() {
        return this.f86497k;
    }

    public int getIconSize() {
        return this.f86494h;
    }

    public ColorStateList getIconTint() {
        return this.f86491e;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f86490d;
    }

    public int getInsetBottom() {
        return this.f86487a.c();
    }

    public int getInsetTop() {
        return this.f86487a.d();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f86498l;
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f86484o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f86485p);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f86501c);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f86487a.q()) {
            toggle();
        }
        return super.performClick();
    }

    void setA11yClassName(String str) {
        this.f86493g = str;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? C14791a.b(getContext(), i10) : null);
    }

    public void setIcon(Drawable drawable) {
        if (this.f86492f != drawable) {
            this.f86492f = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f86500n != i10) {
            this.f86500n = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f86497k != i10) {
            this.f86497k = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? C14791a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f86494h != i10) {
            this.f86494h = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f86491e != colorStateList) {
            this.f86491e = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f86490d != mode) {
            this.f86490d = mode;
            h(false);
        }
    }

    public void setInsetBottom(int i10) {
        this.f86487a.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f86487a.x(i10);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f86489c = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f86489c;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f86487a.F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f86498l);
    }

    private boolean e() {
        if (ViewCompat.z(this) == 1) {
            return true;
        }
        return false;
    }

    private void g() {
        if (c()) {
            androidx.core.widget.k.j(this, this.f86492f, null, null, null);
        } else if (b()) {
            androidx.core.widget.k.j(this, null, null, this.f86492f, null);
        } else if (d()) {
            androidx.core.widget.k.j(this, null, this.f86492f, null, null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f86487a.b();
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f86487a.h();
        }
        return null;
    }

    public C16765m getShapeAppearanceModel() {
        if (f()) {
            return this.f86487a.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f86487a.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f86487a.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (f()) {
            return this.f86487a.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (f()) {
            return this.f86487a.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            C16761i.f(this, this.f86487a.f());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f86501c = this.f86498l;
        return cVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f86492f != null) {
            if (this.f86492f.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f86487a.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable != getBackground()) {
                FS.log_w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f86487a.t();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f86487a.u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f86498l != z10) {
            this.f86498l = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f86498l);
            }
            if (!this.f86499m) {
                this.f86499m = true;
                Iterator<a> it = this.f86488b.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f86498l);
                }
                this.f86499m = false;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f86487a.v(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f86487a.f().a0(f10);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(C14791a.a(getContext(), i10));
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f86487a.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(C14791a.a(getContext(), i10));
        }
    }

    @Override // re.InterfaceC16768p
    public void setShapeAppearanceModel(C16765m c16765m) {
        if (f()) {
            this.f86487a.z(c16765m);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f86487a.A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f86487a.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(C14791a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f86487a.C(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f86487a.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f86487a.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }
}
