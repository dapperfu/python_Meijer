package com.google.android.material.button;

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
import ce.C6503b;
import ce.k;
import ce.l;
import com.fullstory.FS;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import d2.C13595a;
import j.C14879a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import qe.C16634c;
import te.C17235i;
import te.C17239m;
import te.InterfaceC17242p;
import w2.AbstractC17821a;
import we.C17867a;

/* loaded from: classes4.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC17242p {

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f87324o = {R.attr.state_checkable};

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f87325p = {R.attr.state_checked};

    /* renamed from: q, reason: collision with root package name */
    private static final int f87326q = k.f61823x;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.material.button.a f87327a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<a> f87328b;

    /* renamed from: c, reason: collision with root package name */
    private b f87329c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuff.Mode f87330d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f87331e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f87332f;

    /* renamed from: g, reason: collision with root package name */
    private String f87333g;

    /* renamed from: h, reason: collision with root package name */
    private int f87334h;

    /* renamed from: i, reason: collision with root package name */
    private int f87335i;

    /* renamed from: j, reason: collision with root package name */
    private int f87336j;

    /* renamed from: k, reason: collision with root package name */
    private int f87337k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f87338l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f87339m;

    /* renamed from: n, reason: collision with root package name */
    private int f87340n;

    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    static class c extends AbstractC17821a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f87341c;

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
            this.f87341c = z10;
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f87341c ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61496C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87326q;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f87328b = new LinkedHashSet<>();
        this.f87338l = false;
        this.f87339m = false;
        Context context2 = getContext();
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f61854C3, i10, i11, new int[0]);
        this.f87337k = typedArrayI.getDimensionPixelSize(l.f62009P3, 0);
        this.f87330d = x.l(typedArrayI.getInt(l.f62042S3, -1), PorterDuff.Mode.SRC_IN);
        this.f87331e = C16634c.a(getContext(), typedArrayI, l.f62031R3);
        this.f87332f = C16634c.d(getContext(), typedArrayI, l.f61986N3);
        this.f87340n = typedArrayI.getInteger(l.f61998O3, 1);
        this.f87334h = typedArrayI.getDimensionPixelSize(l.f62020Q3, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, C17239m.e(context2, attributeSet, i10, i11).m());
        this.f87327a = aVar;
        aVar.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f87337k);
        h(this.f87332f != null);
    }

    private boolean b() {
        int i10 = this.f87340n;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.f87340n;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.f87340n;
        return i10 == 16 || i10 == 32;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f87327a;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void h(boolean z10) {
        Drawable drawable = this.f87332f;
        if (drawable != null) {
            Drawable drawableMutate = C13595a.r(drawable).mutate();
            this.f87332f = drawableMutate;
            C13595a.o(drawableMutate, this.f87331e);
            PorterDuff.Mode mode = this.f87330d;
            if (mode != null) {
                C13595a.p(this.f87332f, mode);
            }
            int intrinsicWidth = this.f87334h;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f87332f.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f87334h;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f87332f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f87332f;
            int i10 = this.f87335i;
            int i11 = this.f87336j;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f87332f.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] drawableArrA = androidx.core.widget.k.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.f87332f) && ((!b() || drawable5 == this.f87332f) && (!d() || drawable4 == this.f87332f))) {
            return;
        }
        g();
    }

    private void i(int i10, int i11) {
        if (this.f87332f == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f87335i = 0;
                if (this.f87340n == 16) {
                    this.f87336j = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f87334h;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f87332f.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f87337k) - getPaddingBottom()) / 2);
                if (this.f87336j != iMax) {
                    this.f87336j = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f87336j = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f87340n;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f87335i = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f87334h;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f87332f.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - ViewCompat.D(this)) - intrinsicWidth) - this.f87337k) - ViewCompat.E(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f87340n == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f87335i != textLayoutWidth) {
            this.f87335i = textLayoutWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f87327a;
        return aVar != null && aVar.p();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f87333g)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f87333g;
    }

    public Drawable getIcon() {
        return this.f87332f;
    }

    public int getIconGravity() {
        return this.f87340n;
    }

    public int getIconPadding() {
        return this.f87337k;
    }

    public int getIconSize() {
        return this.f87334h;
    }

    public ColorStateList getIconTint() {
        return this.f87331e;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f87330d;
    }

    public int getInsetBottom() {
        return this.f87327a.c();
    }

    public int getInsetTop() {
        return this.f87327a.d();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f87338l;
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f87324o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f87325p);
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
        setChecked(cVar.f87341c);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f87327a.q()) {
            toggle();
        }
        return super.performClick();
    }

    void setA11yClassName(String str) {
        this.f87333g = str;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? C14879a.b(getContext(), i10) : null);
    }

    public void setIcon(Drawable drawable) {
        if (this.f87332f != drawable) {
            this.f87332f = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f87340n != i10) {
            this.f87340n = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f87337k != i10) {
            this.f87337k = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? C14879a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f87334h != i10) {
            this.f87334h = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f87331e != colorStateList) {
            this.f87331e = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f87330d != mode) {
            this.f87330d = mode;
            h(false);
        }
    }

    public void setInsetBottom(int i10) {
        this.f87327a.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f87327a.x(i10);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f87329c = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f87329c;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f87327a.F(z10);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f87338l);
    }

    private boolean e() {
        if (ViewCompat.z(this) == 1) {
            return true;
        }
        return false;
    }

    private void g() {
        if (c()) {
            androidx.core.widget.k.j(this, this.f87332f, null, null, null);
        } else if (b()) {
            androidx.core.widget.k.j(this, null, null, this.f87332f, null);
        } else if (d()) {
            androidx.core.widget.k.j(this, null, this.f87332f, null, null);
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
            return this.f87327a.b();
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f87327a.h();
        }
        return null;
    }

    public C17239m getShapeAppearanceModel() {
        if (f()) {
            return this.f87327a.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f87327a.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f87327a.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (f()) {
            return this.f87327a.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (f()) {
            return this.f87327a.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            C17235i.f(this, this.f87327a.f());
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
        cVar.f87341c = this.f87338l;
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
        if (this.f87332f != null) {
            if (this.f87332f.setState(getDrawableState())) {
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
            this.f87327a.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable != getBackground()) {
                FS.log_w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f87327a.t();
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
            this.f87327a.u(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f87338l != z10) {
            this.f87338l = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f87338l);
            }
            if (!this.f87339m) {
                this.f87339m = true;
                Iterator<a> it = this.f87328b.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f87338l);
                }
                this.f87339m = false;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f87327a.v(i10);
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
            this.f87327a.f().a0(f10);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(C14879a.a(getContext(), i10));
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f87327a.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(C14879a.a(getContext(), i10));
        }
    }

    @Override // te.InterfaceC17242p
    public void setShapeAppearanceModel(C17239m c17239m) {
        if (f()) {
            this.f87327a.z(c17239m);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f87327a.A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f87327a.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(C14879a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f87327a.C(i10);
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
            this.f87327a.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f87327a.E(mode);
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
