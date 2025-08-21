package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewCompat;
import ce.C6503b;
import ce.j;
import ce.k;
import ce.l;
import com.fullstory.FS;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;
import com.google.android.material.internal.i;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import de.C13668h;
import java.util.List;
import q2.y;
import qe.AbstractC16637f;
import qe.C16635d;
import re.C16896b;
import te.C17235i;
import te.C17239m;
import te.InterfaceC17242p;
import we.C17867a;
import x2.AbstractC18058a;

/* loaded from: classes4.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC1274a, InterfaceC17242p, i<Chip> {

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.material.chip.a f87520e;

    /* renamed from: f, reason: collision with root package name */
    private InsetDrawable f87521f;

    /* renamed from: g, reason: collision with root package name */
    private RippleDrawable f87522g;

    /* renamed from: h, reason: collision with root package name */
    private View.OnClickListener f87523h;

    /* renamed from: i, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f87524i;

    /* renamed from: j, reason: collision with root package name */
    private i.a<Chip> f87525j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f87526k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f87527l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f87528m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f87529n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f87530o;

    /* renamed from: p, reason: collision with root package name */
    private int f87531p;

    /* renamed from: q, reason: collision with root package name */
    private int f87532q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f87533r;

    /* renamed from: s, reason: collision with root package name */
    private final c f87534s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f87535t;

    /* renamed from: u, reason: collision with root package name */
    private final Rect f87536u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f87537v;

    /* renamed from: w, reason: collision with root package name */
    private final AbstractC16637f f87538w;

    /* renamed from: x, reason: collision with root package name */
    private static final int f87517x = k.f61788A;

    /* renamed from: y, reason: collision with root package name */
    private static final Rect f87518y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f87519z = {R.attr.state_selected};

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f87516A = {R.attr.state_checkable};

    class a extends AbstractC16637f {
        @Override // qe.AbstractC16637f
        public void a(int i10) {
        }

        a() {
        }

        @Override // qe.AbstractC16637f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f87520e.R2() ? Chip.this.f87520e.m1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f87520e != null) {
                Chip.this.f87520e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends AbstractC18058a {
        @Override // x2.AbstractC18058a
        protected void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f87523h != null) {
                list.add(1);
            }
        }

        @Override // x2.AbstractC18058a
        protected void P(int i10, y yVar) {
            if (i10 != 1) {
                yVar.t0("");
                yVar.l0(Chip.f87518y);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                yVar.t0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                yVar.t0(Chip.this.getContext().getString(j.f61778q, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            yVar.l0(Chip.this.getCloseIconTouchBoundsInt());
            yVar.b(y.a.f157841i);
            yVar.x0(Chip.this.isEnabled());
        }

        @Override // x2.AbstractC18058a
        protected void Q(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f87529n = z10;
                Chip.this.refreshDrawableState();
            }
        }

        c(Chip chip) {
            super(chip);
        }

        @Override // x2.AbstractC18058a
        protected int B(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // x2.AbstractC18058a
        protected boolean L(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // x2.AbstractC18058a
        protected void O(y yVar) {
            yVar.n0(Chip.this.r());
            yVar.q0(Chip.this.isClickable());
            yVar.p0(Chip.this.getAccessibilityClassName());
            yVar.X0(Chip.this.getText());
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61536i);
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.I1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.W1(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    public void setTextAppearance(C16635d c16635d) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.J2(c16635d);
        }
        B();
    }

    public boolean t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f87523h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f87535t) {
            this.f87534s.W(1, 1);
        }
        return z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87517x;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f87536u = new Rect();
        this.f87537v = new RectF();
        this.f87538w = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarA0 = com.google.android.material.chip.a.A0(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(aVarA0);
        aVarA0.a0(ViewCompat.u(this));
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f62006P0, i10, i11, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(l.f61828A1);
        typedArrayI.recycle();
        this.f87534s = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f87526k);
        setText(aVarA0.m1());
        setEllipsize(aVarA0.g1());
        B();
        if (!this.f87520e.R2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f87532q);
        }
        this.f87531p = ViewCompat.z(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: je.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip.b(this.f140411a, compoundButton, z10);
            }
        });
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            FS.log_w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            FS.log_w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z10) {
        i.a<Chip> aVar = chip.f87525j;
        if (aVar != null) {
            aVar.a(chip, z10);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f87524i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f87537v.setEmpty();
        if (n() && this.f87523h != null) {
            this.f87520e.d1(this.f87537v);
        }
        return this.f87537v;
    }

    private C16635d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.n1();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f87520e;
        return (aVar == null || aVar.W0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = s.i(context, attributeSet, l.f62006P0, i10, f87517x, new int[0]);
        this.f87530o = typedArrayI.getBoolean(l.f62380v1, false);
        this.f87532q = (int) Math.ceil(typedArrayI.getDimension(l.f62236j1, (float) Math.ceil(x.d(getContext(), 48))));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f87521f = new InsetDrawable((Drawable) this.f87520e, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f87528m != z10) {
            this.f87528m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f87527l != z10) {
            this.f87527l = z10;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.f87521f != null) {
            this.f87521f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.u2(null);
        }
    }

    private void y() {
        if (C16896b.f159474a) {
            z();
            return;
        }
        this.f87520e.Q2(true);
        ViewCompat.q0(this, getBackgroundDrawable());
        A();
        m();
    }

    private void z() {
        this.f87522g = new RippleDrawable(C16896b.d(this.f87520e.k1()), getBackgroundDrawable(), null);
        this.f87520e.Q2(false);
        ViewCompat.q0(this, this.f87522g);
        A();
    }

    @Override // com.google.android.material.chip.a.InterfaceC1274a
    public void a() {
        l(this.f87532q);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f87535t ? super.dispatchHoverEvent(motionEvent) : this.f87534s.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f87535t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f87534s.w(keyEvent) || this.f87534s.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f87533r)) {
            return this.f87533r;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).i()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f87521f;
        return insetDrawable == null ? this.f87520e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.N0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f87520e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.T0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.V0();
        }
        return 0.0f;
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.a1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.g1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f87535t && (this.f87534s.A() == 1 || this.f87534s.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C13668h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.h1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.i1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.j1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    public C17239m getShapeAppearanceModel() {
        return this.f87520e.E();
    }

    public C13668h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.l1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.o1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            return aVar.p1();
        }
        return 0.0f;
    }

    public boolean l(int i10) {
        this.f87532q = i10;
        if (!v()) {
            if (this.f87521f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f87520e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f87520e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f87521f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f87521f != null) {
            Rect rect = new Rect();
            this.f87521f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f87519z);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f87516A);
        }
        return iArrOnCreateDrawableState;
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f87520e;
        return aVar != null && aVar.t1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f87520e;
        return aVar != null && aVar.v1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f87533r = charSequence;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        FS.log_w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        FS.log_w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        FS.log_w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        FS.log_w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.C1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.D1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar == null) {
            this.f87526k = z10;
        } else if (aVar.t1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.E1(drawable);
        }
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.G1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.H1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.K1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.M1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f87520e;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f87520e = aVar;
            aVar.F2(false);
            j(this.f87520e);
            l(this.f87532q);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.O1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.P1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.Q1(drawable);
        }
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.R1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.S1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.U1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.Y1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.Z1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.a2(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.b2(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.c2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.d2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.e2(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.f2(i10);
        }
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.h2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.i2(charSequence);
        }
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.j2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.k2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.l2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.m2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.n2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.o2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.p2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.r2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.s2(i10);
        }
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.t2(z10);
        }
        x();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f87520e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.v2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f87530o = z10;
        l(this.f87532q);
    }

    public void setHideMotionSpec(C13668h c13668h) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.w2(c13668h);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.x2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.y2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.z2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.A2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.B2(i10);
        }
    }

    @Override // com.google.android.material.internal.i
    public void setInternalOnCheckedChangeListener(i.a<Chip> aVar) {
        this.f87525j = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f87520e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f87524i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f87523h = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.D2(colorStateList);
        }
        if (this.f87520e.r1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.E2(i10);
            if (this.f87520e.r1()) {
                return;
            }
            z();
        }
    }

    @Override // te.InterfaceC17242p
    public void setShapeAppearanceModel(C17239m c17239m) {
        this.f87520e.setShapeAppearanceModel(c17239m);
    }

    public void setShowMotionSpec(C13668h c13668h) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.G2(c13668h);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.H2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.R2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f87520e;
        if (aVar2 != null) {
            aVar2.I2(charSequence);
        }
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.L2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.M2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.O2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.P2(i10);
        }
    }

    public boolean v() {
        return this.f87530o;
    }

    private void A() {
        com.google.android.material.chip.a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f87520e) != null) {
            int iO0 = (int) (aVar.O0() + this.f87520e.o1() + this.f87520e.v0());
            int iT0 = (int) (this.f87520e.T0() + this.f87520e.p1() + this.f87520e.r0());
            if (this.f87521f != null) {
                Rect rect = new Rect();
                this.f87521f.getPadding(rect);
                iT0 += rect.left;
                iO0 += rect.right;
            }
            ViewCompat.B0(this, iT0, getPaddingTop(), iO0, getPaddingBottom());
        }
    }

    private void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C16635d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f87538w);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f87536u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f87536u;
    }

    private void j(com.google.android.material.chip.a aVar) {
        aVar.u2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] k() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f87529n) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f87528m) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f87527l) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f87529n) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f87528m) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f87527l) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f87521f && this.f87520e.getCallback() == null) {
            this.f87520e.setCallback(this.f87521f);
        }
    }

    private void x() {
        if (n() && s() && this.f87523h != null) {
            ViewCompat.m0(this, this.f87534s);
            this.f87535t = true;
        } else {
            ViewCompat.m0(this, null);
            this.f87535t = false;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        boolean zQ2;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null && aVar.u1()) {
            zQ2 = this.f87520e.q2(k());
        } else {
            zQ2 = false;
        }
        if (zQ2) {
            invalidate();
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C17235i.f(this, this.f87520e);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f87535t) {
            this.f87534s.K(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iG;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            y yVarG1 = y.g1(accessibilityNodeInfo);
            if (chipGroup.c()) {
                iG = chipGroup.g(this);
            } else {
                iG = -1;
            }
            yVarG1.s0(y.f.a(chipGroup.b(this), 1, iG, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f87531p != i10) {
            this.f87531p = i10;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f87527l
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f87527l
            if (r0 == 0) goto L35
            r5.t()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f87522g) {
            FS.log_w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f87522g) {
            FS.log_w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.J1(z10);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.X1(z10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.a0(f10);
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            FS.log_w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.C2(i10);
        }
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.N2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        B();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.K2(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f87520e;
        if (aVar != null) {
            aVar.K2(i10);
        }
        B();
    }
}
