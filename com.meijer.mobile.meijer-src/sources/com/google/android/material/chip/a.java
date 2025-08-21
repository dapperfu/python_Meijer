package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import c2.c;
import ce.l;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.gms.common.api.a;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import com.medallia.digital.mobilesdk.l3;
import d2.C13595a;
import de.C13668h;
import ge.C14353a;
import j.C14879a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import ke.C15121a;
import m2.C15655a;
import qe.C16634c;
import qe.C16635d;
import re.C16896b;
import te.C17234h;

/* loaded from: classes4.dex */
public class a extends C17234h implements Drawable.Callback, q.b, FSDraw {

    /* renamed from: J0, reason: collision with root package name */
    private static final int[] f87553J0 = {R.attr.state_enabled};

    /* renamed from: K0, reason: collision with root package name */
    private static final ShapeDrawable f87554K0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f87555A;

    /* renamed from: A0, reason: collision with root package name */
    private PorterDuff.Mode f87556A0;

    /* renamed from: B, reason: collision with root package name */
    private float f87557B;

    /* renamed from: B0, reason: collision with root package name */
    private int[] f87558B0;

    /* renamed from: C, reason: collision with root package name */
    private float f87559C;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f87560C0;

    /* renamed from: D, reason: collision with root package name */
    private ColorStateList f87561D;

    /* renamed from: D0, reason: collision with root package name */
    private ColorStateList f87562D0;

    /* renamed from: E, reason: collision with root package name */
    private float f87563E;

    /* renamed from: E0, reason: collision with root package name */
    private WeakReference<InterfaceC1274a> f87564E0;

    /* renamed from: F, reason: collision with root package name */
    private ColorStateList f87565F;

    /* renamed from: F0, reason: collision with root package name */
    private TextUtils.TruncateAt f87566F0;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f87567G;

    /* renamed from: G0, reason: collision with root package name */
    private boolean f87568G0;

    /* renamed from: H, reason: collision with root package name */
    private boolean f87569H;

    /* renamed from: H0, reason: collision with root package name */
    private int f87570H0;

    /* renamed from: I, reason: collision with root package name */
    private Drawable f87571I;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f87572I0;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f87573J;

    /* renamed from: K, reason: collision with root package name */
    private float f87574K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f87575L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f87576M;

    /* renamed from: N, reason: collision with root package name */
    private Drawable f87577N;

    /* renamed from: O, reason: collision with root package name */
    private Drawable f87578O;

    /* renamed from: P, reason: collision with root package name */
    private ColorStateList f87579P;

    /* renamed from: Q, reason: collision with root package name */
    private float f87580Q;

    /* renamed from: R, reason: collision with root package name */
    private CharSequence f87581R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f87582S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f87583T;

    /* renamed from: U, reason: collision with root package name */
    private Drawable f87584U;

    /* renamed from: V, reason: collision with root package name */
    private ColorStateList f87585V;

    /* renamed from: W, reason: collision with root package name */
    private C13668h f87586W;

    /* renamed from: X, reason: collision with root package name */
    private C13668h f87587X;

    /* renamed from: Y, reason: collision with root package name */
    private float f87588Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f87589Z;

    /* renamed from: a0, reason: collision with root package name */
    private float f87590a0;

    /* renamed from: b0, reason: collision with root package name */
    private float f87591b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f87592c0;

    /* renamed from: d0, reason: collision with root package name */
    private float f87593d0;

    /* renamed from: e0, reason: collision with root package name */
    private float f87594e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f87595f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Context f87596g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Paint f87597h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Paint f87598i0;

    /* renamed from: j0, reason: collision with root package name */
    private final Paint.FontMetrics f87599j0;

    /* renamed from: k0, reason: collision with root package name */
    private final RectF f87600k0;

    /* renamed from: l0, reason: collision with root package name */
    private final PointF f87601l0;

    /* renamed from: m0, reason: collision with root package name */
    private final Path f87602m0;

    /* renamed from: n0, reason: collision with root package name */
    private final q f87603n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f87604o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f87605p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f87606q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f87607r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f87608s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f87609t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f87610u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f87611v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f87612w0;

    /* renamed from: x0, reason: collision with root package name */
    private ColorFilter f87613x0;

    /* renamed from: y0, reason: collision with root package name */
    private PorterDuffColorFilter f87614y0;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f87615z;

    /* renamed from: z0, reason: collision with root package name */
    private ColorStateList f87616z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC1274a {
        void a();
    }

    private static boolean s1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public void U1(ColorStateList colorStateList) {
        this.f87575L = true;
        if (this.f87573J != colorStateList) {
            this.f87573J = colorStateList;
            if (T2()) {
                C13595a.o(this.f87571I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    Paint.Align y0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f87567G != null) {
            float fR0 = this.f87588Y + r0() + this.f87591b0;
            if (C13595a.f(this) == 0) {
                pointF.x = rect.left + fR0;
            } else {
                pointF.x = rect.right - fR0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - x0();
        }
        return align;
    }

    public static a A0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.z1(attributeSet, i10, i11);
        return aVar;
    }

    private void C0(Canvas canvas, Rect rect) {
        if (this.f87572I0) {
            return;
        }
        this.f87597h0.setColor(this.f87605p0);
        this.f87597h0.setStyle(Paint.Style.FILL);
        this.f87597h0.setColorFilter(q1());
        this.f87600k0.set(rect);
        canvas.drawRoundRect(this.f87600k0, N0(), N0(), this.f87597h0);
    }

    private void E0(Canvas canvas, Rect rect) {
        if (this.f87563E <= 0.0f || this.f87572I0) {
            return;
        }
        this.f87597h0.setColor(this.f87607r0);
        this.f87597h0.setStyle(Paint.Style.STROKE);
        if (!this.f87572I0) {
            this.f87597h0.setColorFilter(q1());
        }
        RectF rectF = this.f87600k0;
        float f10 = rect.left;
        float f11 = this.f87563E;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f87559C - (this.f87563E / 2.0f);
        canvas.drawRoundRect(this.f87600k0, f12, f12, this.f87597h0);
    }

    private void F0(Canvas canvas, Rect rect) {
        if (this.f87572I0) {
            return;
        }
        this.f87597h0.setColor(this.f87604o0);
        this.f87597h0.setStyle(Paint.Style.FILL);
        this.f87600k0.set(rect);
        canvas.drawRoundRect(this.f87600k0, N0(), N0(), this.f87597h0);
    }

    private void H0(Canvas canvas, Rect rect) {
        this.f87597h0.setColor(this.f87608s0);
        this.f87597h0.setStyle(Paint.Style.FILL);
        this.f87600k0.set(rect);
        if (!this.f87572I0) {
            canvas.drawRoundRect(this.f87600k0, N0(), N0(), this.f87597h0);
        } else {
            h(new RectF(rect), this.f87602m0);
            super.p(canvas, this.f87597h0, this.f87602m0, u());
        }
    }

    private void I0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f87598i0;
        if (paint != null) {
            paint.setColor(c.k(-16777216, l3.f93324d));
            canvas.drawRect(rect, this.f87598i0);
            if (T2() || S2()) {
                q0(rect, this.f87600k0);
                canvas.drawRect(this.f87600k0, this.f87598i0);
            }
            if (this.f87567G != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f87598i0);
            } else {
                canvas2 = canvas;
            }
            if (U2()) {
                t0(rect, this.f87600k0);
                canvas2.drawRect(this.f87600k0, this.f87598i0);
            }
            this.f87598i0.setColor(c.k(-65536, l3.f93324d));
            s0(rect, this.f87600k0);
            canvas2.drawRect(this.f87600k0, this.f87598i0);
            this.f87598i0.setColor(c.k(-16711936, l3.f93324d));
            u0(rect, this.f87600k0);
            canvas2.drawRect(this.f87600k0, this.f87598i0);
        }
    }

    private void J0(Canvas canvas, Rect rect) {
        if (this.f87567G != null) {
            Paint.Align alignY0 = y0(rect, this.f87601l0);
            w0(rect, this.f87600k0);
            if (this.f87603n0.e() != null) {
                this.f87603n0.g().drawableState = getState();
                this.f87603n0.n(this.f87596g0);
            }
            this.f87603n0.g().setTextAlign(alignY0);
            int iSave = 0;
            boolean z10 = Math.round(this.f87603n0.h(m1().toString())) > Math.round(this.f87600k0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f87600k0);
            }
            CharSequence charSequenceEllipsize = this.f87567G;
            if (z10 && this.f87566F0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f87603n0.g(), this.f87600k0.width(), this.f87566F0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f87601l0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f87603n0.g());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean S2() {
        return this.f87583T && this.f87584U != null && this.f87610u0;
    }

    private boolean T2() {
        return this.f87569H && this.f87571I != null;
    }

    private boolean U2() {
        return this.f87576M && this.f87577N != null;
    }

    private void V2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void W2() {
        this.f87562D0 = this.f87560C0 ? C16896b.d(this.f87565F) : null;
    }

    @TargetApi(21)
    private void X2() {
        this.f87578O = new RippleDrawable(C16896b.d(k1()), this.f87577N, f87554K0);
    }

    private float e1() {
        Drawable drawable = this.f87610u0 ? this.f87584U : this.f87571I;
        float fCeil = this.f87574K;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(x.d(this.f87596g0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float f1() {
        Drawable drawable = this.f87610u0 ? this.f87584U : this.f87571I;
        float f10 = this.f87574K;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void g2(ColorStateList colorStateList) {
        if (this.f87615z != colorStateList) {
            this.f87615z = colorStateList;
            onStateChange(getState());
        }
    }

    private void p0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C13595a.m(drawable, C13595a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f87577N) {
            if (drawable.isStateful()) {
                drawable.setState(b1());
            }
            C13595a.o(drawable, this.f87579P);
            return;
        }
        Drawable drawable2 = this.f87571I;
        if (drawable == drawable2 && this.f87575L) {
            C13595a.o(drawable2, this.f87573J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private ColorFilter q1() {
        ColorFilter colorFilter = this.f87613x0;
        return colorFilter != null ? colorFilter : this.f87614y0;
    }

    private static boolean w1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float x0() {
        this.f87603n0.g().getFontMetrics(this.f87599j0);
        Paint.FontMetrics fontMetrics = this.f87599j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean x1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean y1(C16635d c16635d) {
        return (c16635d == null || c16635d.i() == null || !c16635d.i().isStateful()) ? false : true;
    }

    private boolean z0() {
        return this.f87583T && this.f87584U != null && this.f87582S;
    }

    private void z1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = s.i(this.f87596g0, attributeSet, l.f62006P0, i10, i11, new int[0]);
        this.f87572I0 = typedArrayI.hasValue(l.f61828A1);
        g2(C16634c.a(this.f87596g0, typedArrayI, l.f62284n1));
        K1(C16634c.a(this.f87596g0, typedArrayI, l.f62128a1));
        Y1(typedArrayI.getDimension(l.f62224i1, 0.0f));
        if (typedArrayI.hasValue(l.f62140b1)) {
            M1(typedArrayI.getDimension(l.f62140b1, 0.0f));
        }
        c2(C16634c.a(this.f87596g0, typedArrayI, l.f62260l1));
        e2(typedArrayI.getDimension(l.f62272m1, 0.0f));
        D2(C16634c.a(this.f87596g0, typedArrayI, l.f62428z1));
        I2(typedArrayI.getText(l.f62061U0));
        C16635d c16635dG = C16634c.g(this.f87596g0, typedArrayI, l.f62017Q0);
        c16635dG.l(typedArrayI.getDimension(l.f62028R0, c16635dG.j()));
        J2(c16635dG);
        int i12 = typedArrayI.getInt(l.f62039S0, 0);
        if (i12 == 1) {
            v2(TextUtils.TruncateAt.START);
        } else if (i12 == 2) {
            v2(TextUtils.TruncateAt.MIDDLE);
        } else if (i12 == 3) {
            v2(TextUtils.TruncateAt.END);
        }
        X1(typedArrayI.getBoolean(l.f62212h1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            X1(typedArrayI.getBoolean(l.f62176e1, false));
        }
        Q1(C16634c.d(this.f87596g0, typedArrayI, l.f62164d1));
        if (typedArrayI.hasValue(l.f62200g1)) {
            U1(C16634c.a(this.f87596g0, typedArrayI, l.f62200g1));
        }
        S1(typedArrayI.getDimension(l.f62188f1, -1.0f));
        t2(typedArrayI.getBoolean(l.f62368u1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            t2(typedArrayI.getBoolean(l.f62308p1, false));
        }
        h2(C16634c.d(this.f87596g0, typedArrayI, l.f62296o1));
        r2(C16634c.a(this.f87596g0, typedArrayI, l.f62356t1));
        m2(typedArrayI.getDimension(l.f62332r1, 0.0f));
        C1(typedArrayI.getBoolean(l.f62072V0, false));
        J1(typedArrayI.getBoolean(l.f62116Z0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            J1(typedArrayI.getBoolean(l.f62094X0, false));
        }
        E1(C16634c.d(this.f87596g0, typedArrayI, l.f62083W0));
        if (typedArrayI.hasValue(l.f62105Y0)) {
            G1(C16634c.a(this.f87596g0, typedArrayI, l.f62105Y0));
        }
        G2(C13668h.b(this.f87596g0, typedArrayI, l.f61840B1));
        w2(C13668h.b(this.f87596g0, typedArrayI, l.f62392w1));
        a2(typedArrayI.getDimension(l.f62248k1, 0.0f));
        A2(typedArrayI.getDimension(l.f62416y1, 0.0f));
        y2(typedArrayI.getDimension(l.f62404x1, 0.0f));
        O2(typedArrayI.getDimension(l.f61864D1, 0.0f));
        L2(typedArrayI.getDimension(l.f61852C1, 0.0f));
        o2(typedArrayI.getDimension(l.f62344s1, 0.0f));
        j2(typedArrayI.getDimension(l.f62320q1, 0.0f));
        O1(typedArrayI.getDimension(l.f62152c1, 0.0f));
        C2(typedArrayI.getDimensionPixelSize(l.f62050T0, a.e.API_PRIORITY_OTHER));
        typedArrayI.recycle();
    }

    protected void A1() {
        InterfaceC1274a interfaceC1274a = this.f87564E0.get();
        if (interfaceC1274a != null) {
            interfaceC1274a.a();
        }
    }

    public void A2(float f10) {
        if (this.f87589Z != f10) {
            float fR0 = r0();
            this.f87589Z = f10;
            float fR02 = r0();
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    public void B2(int i10) {
        A2(this.f87596g0.getResources().getDimension(i10));
    }

    public void C1(boolean z10) {
        if (this.f87582S != z10) {
            this.f87582S = z10;
            float fR0 = r0();
            if (!z10 && this.f87610u0) {
                this.f87610u0 = false;
            }
            float fR02 = r0();
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    public void C2(int i10) {
        this.f87570H0 = i10;
    }

    public void D1(int i10) {
        C1(this.f87596g0.getResources().getBoolean(i10));
    }

    public void D2(ColorStateList colorStateList) {
        if (this.f87565F != colorStateList) {
            this.f87565F = colorStateList;
            W2();
            onStateChange(getState());
        }
    }

    public void E1(Drawable drawable) {
        if (this.f87584U != drawable) {
            float fR0 = r0();
            this.f87584U = drawable;
            float fR02 = r0();
            V2(this.f87584U);
            p0(this.f87584U);
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    public void E2(int i10) {
        D2(C14879a.a(this.f87596g0, i10));
    }

    public void F1(int i10) {
        E1(C14879a.b(this.f87596g0, i10));
    }

    void F2(boolean z10) {
        this.f87568G0 = z10;
    }

    public void G1(ColorStateList colorStateList) {
        if (this.f87585V != colorStateList) {
            this.f87585V = colorStateList;
            if (z0()) {
                C13595a.o(this.f87584U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void G2(C13668h c13668h) {
        this.f87586W = c13668h;
    }

    public void H1(int i10) {
        G1(C14879a.a(this.f87596g0, i10));
    }

    public void H2(int i10) {
        G2(C13668h.c(this.f87596g0, i10));
    }

    public void I1(int i10) {
        J1(this.f87596g0.getResources().getBoolean(i10));
    }

    public void I2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f87567G, charSequence)) {
            return;
        }
        this.f87567G = charSequence;
        this.f87603n0.m(true);
        invalidateSelf();
        A1();
    }

    public void J1(boolean z10) {
        if (this.f87583T != z10) {
            boolean zS2 = S2();
            this.f87583T = z10;
            boolean zS22 = S2();
            if (zS2 != zS22) {
                if (zS22) {
                    p0(this.f87584U);
                } else {
                    V2(this.f87584U);
                }
                invalidateSelf();
                A1();
            }
        }
    }

    public void J2(C16635d c16635d) {
        this.f87603n0.k(c16635d, this.f87596g0);
    }

    public Drawable K0() {
        return this.f87584U;
    }

    public void K1(ColorStateList colorStateList) {
        if (this.f87555A != colorStateList) {
            this.f87555A = colorStateList;
            onStateChange(getState());
        }
    }

    public void K2(int i10) {
        J2(new C16635d(this.f87596g0, i10));
    }

    public ColorStateList L0() {
        return this.f87585V;
    }

    public void L1(int i10) {
        K1(C14879a.a(this.f87596g0, i10));
    }

    public void L2(float f10) {
        if (this.f87592c0 != f10) {
            this.f87592c0 = f10;
            invalidateSelf();
            A1();
        }
    }

    public ColorStateList M0() {
        return this.f87555A;
    }

    @Deprecated
    public void M1(float f10) {
        if (this.f87559C != f10) {
            this.f87559C = f10;
            setShapeAppearanceModel(E().w(f10));
        }
    }

    public void M2(int i10) {
        L2(this.f87596g0.getResources().getDimension(i10));
    }

    public float N0() {
        return this.f87572I0 ? J() : this.f87559C;
    }

    @Deprecated
    public void N1(int i10) {
        M1(this.f87596g0.getResources().getDimension(i10));
    }

    public float O0() {
        return this.f87595f0;
    }

    public void O1(float f10) {
        if (this.f87595f0 != f10) {
            this.f87595f0 = f10;
            invalidateSelf();
            A1();
        }
    }

    public void O2(float f10) {
        if (this.f87591b0 != f10) {
            this.f87591b0 = f10;
            invalidateSelf();
            A1();
        }
    }

    public Drawable P0() {
        Drawable drawable = this.f87571I;
        if (drawable != null) {
            return C13595a.q(drawable);
        }
        return null;
    }

    public void P1(int i10) {
        O1(this.f87596g0.getResources().getDimension(i10));
    }

    public void P2(int i10) {
        O2(this.f87596g0.getResources().getDimension(i10));
    }

    public float Q0() {
        return this.f87574K;
    }

    public void Q2(boolean z10) {
        if (this.f87560C0 != z10) {
            this.f87560C0 = z10;
            W2();
            onStateChange(getState());
        }
    }

    public ColorStateList R0() {
        return this.f87573J;
    }

    public void R1(int i10) {
        Q1(C14879a.b(this.f87596g0, i10));
    }

    boolean R2() {
        return this.f87568G0;
    }

    public float S0() {
        return this.f87557B;
    }

    public void S1(float f10) {
        if (this.f87574K != f10) {
            float fR0 = r0();
            this.f87574K = f10;
            float fR02 = r0();
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    public float T0() {
        return this.f87588Y;
    }

    public void T1(int i10) {
        S1(this.f87596g0.getResources().getDimension(i10));
    }

    public ColorStateList U0() {
        return this.f87561D;
    }

    public float V0() {
        return this.f87563E;
    }

    public void V1(int i10) {
        U1(C14879a.a(this.f87596g0, i10));
    }

    public Drawable W0() {
        Drawable drawable = this.f87577N;
        if (drawable != null) {
            return C13595a.q(drawable);
        }
        return null;
    }

    public void W1(int i10) {
        X1(this.f87596g0.getResources().getBoolean(i10));
    }

    public CharSequence X0() {
        return this.f87581R;
    }

    public void X1(boolean z10) {
        if (this.f87569H != z10) {
            boolean zT2 = T2();
            this.f87569H = z10;
            boolean zT22 = T2();
            if (zT2 != zT22) {
                if (zT22) {
                    p0(this.f87571I);
                } else {
                    V2(this.f87571I);
                }
                invalidateSelf();
                A1();
            }
        }
    }

    public float Y0() {
        return this.f87594e0;
    }

    public void Y1(float f10) {
        if (this.f87557B != f10) {
            this.f87557B = f10;
            invalidateSelf();
            A1();
        }
    }

    public float Z0() {
        return this.f87580Q;
    }

    public void Z1(int i10) {
        Y1(this.f87596g0.getResources().getDimension(i10));
    }

    public float a1() {
        return this.f87593d0;
    }

    public void a2(float f10) {
        if (this.f87588Y != f10) {
            this.f87588Y = f10;
            invalidateSelf();
            A1();
        }
    }

    public int[] b1() {
        return this.f87558B0;
    }

    public void b2(int i10) {
        a2(this.f87596g0.getResources().getDimension(i10));
    }

    public ColorStateList c1() {
        return this.f87579P;
    }

    public void c2(ColorStateList colorStateList) {
        if (this.f87561D != colorStateList) {
            this.f87561D = colorStateList;
            if (this.f87572I0) {
                k0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d2(int i10) {
        c2(C14879a.a(this.f87596g0, i10));
    }

    public void e2(float f10) {
        if (this.f87563E != f10) {
            this.f87563E = f10;
            this.f87597h0.setStrokeWidth(f10);
            if (this.f87572I0) {
                super.l0(f10);
            }
            invalidateSelf();
        }
    }

    public void f2(int i10) {
        e2(this.f87596g0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt g1() {
        return this.f87566F0;
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f87612w0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f87613x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f87557B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f87588Y + r0() + this.f87591b0 + this.f87603n0.h(m1().toString()) + this.f87592c0 + v0() + this.f87595f0), this.f87570H0);
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f87572I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f87559C);
        } else {
            outline.setRoundRect(bounds, this.f87559C);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public C13668h h1() {
        return this.f87587X;
    }

    public float i1() {
        return this.f87590a0;
    }

    public void i2(CharSequence charSequence) {
        if (this.f87581R != charSequence) {
            this.f87581R = C15655a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (w1(this.f87615z) || w1(this.f87555A) || w1(this.f87561D)) {
            return true;
        }
        return (this.f87560C0 && w1(this.f87562D0)) || y1(this.f87603n0.e()) || z0() || x1(this.f87571I) || x1(this.f87584U) || w1(this.f87616z0);
    }

    public float j1() {
        return this.f87589Z;
    }

    public void j2(float f10) {
        if (this.f87594e0 != f10) {
            this.f87594e0 = f10;
            invalidateSelf();
            if (U2()) {
                A1();
            }
        }
    }

    public ColorStateList k1() {
        return this.f87565F;
    }

    public void k2(int i10) {
        j2(this.f87596g0.getResources().getDimension(i10));
    }

    public C13668h l1() {
        return this.f87586W;
    }

    public void l2(int i10) {
        h2(C14879a.b(this.f87596g0, i10));
    }

    public CharSequence m1() {
        return this.f87567G;
    }

    public void m2(float f10) {
        if (this.f87580Q != f10) {
            this.f87580Q = f10;
            invalidateSelf();
            if (U2()) {
                A1();
            }
        }
    }

    public C16635d n1() {
        return this.f87603n0.e();
    }

    public void n2(int i10) {
        m2(this.f87596g0.getResources().getDimension(i10));
    }

    public float o1() {
        return this.f87592c0;
    }

    public void o2(float f10) {
        if (this.f87593d0 != f10) {
            this.f87593d0 = f10;
            invalidateSelf();
            if (U2()) {
                A1();
            }
        }
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable, com.google.android.material.internal.q.b
    public boolean onStateChange(int[] iArr) {
        if (this.f87572I0) {
            super.onStateChange(iArr);
        }
        return B1(iArr, b1());
    }

    public float p1() {
        return this.f87591b0;
    }

    public void p2(int i10) {
        o2(this.f87596g0.getResources().getDimension(i10));
    }

    public boolean q2(int[] iArr) {
        if (Arrays.equals(this.f87558B0, iArr)) {
            return false;
        }
        this.f87558B0 = iArr;
        if (U2()) {
            return B1(getState(), iArr);
        }
        return false;
    }

    public boolean r1() {
        return this.f87560C0;
    }

    public void r2(ColorStateList colorStateList) {
        if (this.f87579P != colorStateList) {
            this.f87579P = colorStateList;
            if (U2()) {
                C13595a.o(this.f87577N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void s2(int i10) {
        r2(C14879a.a(this.f87596g0, i10));
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f87612w0 != i10) {
            this.f87612w0 = i10;
            invalidateSelf();
        }
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f87613x0 != colorFilter) {
            this.f87613x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f87616z0 != colorStateList) {
            this.f87616z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f87556A0 != mode) {
            this.f87556A0 = mode;
            this.f87614y0 = d.m(this, this.f87616z0, mode);
            invalidateSelf();
        }
    }

    public boolean t1() {
        return this.f87582S;
    }

    public void t2(boolean z10) {
        if (this.f87576M != z10) {
            boolean zU2 = U2();
            this.f87576M = z10;
            boolean zU22 = U2();
            if (zU2 != zU22) {
                if (zU22) {
                    p0(this.f87577N);
                } else {
                    V2(this.f87577N);
                }
                invalidateSelf();
                A1();
            }
        }
    }

    public boolean u1() {
        return x1(this.f87577N);
    }

    public void u2(InterfaceC1274a interfaceC1274a) {
        this.f87564E0 = new WeakReference<>(interfaceC1274a);
    }

    public boolean v1() {
        return this.f87576M;
    }

    public void v2(TextUtils.TruncateAt truncateAt) {
        this.f87566F0 = truncateAt;
    }

    public void w2(C13668h c13668h) {
        this.f87587X = c13668h;
    }

    public void x2(int i10) {
        w2(C13668h.c(this.f87596g0, i10));
    }

    public void y2(float f10) {
        if (this.f87590a0 != f10) {
            float fR0 = r0();
            this.f87590a0 = f10;
            float fR02 = r0();
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    public void z2(int i10) {
        y2(this.f87596g0.getResources().getDimension(i10));
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f87559C = -1.0f;
        this.f87597h0 = new Paint(1);
        this.f87599j0 = new Paint.FontMetrics();
        this.f87600k0 = new RectF();
        this.f87601l0 = new PointF();
        this.f87602m0 = new Path();
        this.f87612w0 = l3.f93323c;
        this.f87556A0 = PorterDuff.Mode.SRC_IN;
        this.f87564E0 = new WeakReference<>(null);
        Q(context);
        this.f87596g0 = context;
        q qVar = new q(this);
        this.f87603n0 = qVar;
        this.f87567G = "";
        qVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f87598i0 = null;
        int[] iArr = f87553J0;
        setState(iArr);
        q2(iArr);
        this.f87568G0 = true;
        if (C16896b.f159474a) {
            f87554K0.setTint(-1);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        if (S2()) {
            q0(rect, this.f87600k0);
            RectF rectF = this.f87600k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f87584U.setBounds(0, 0, (int) this.f87600k0.width(), (int) this.f87600k0.height());
            this.f87584U.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean B1(int[] iArr, int[] iArr2) {
        int colorForState;
        int colorForState2;
        boolean z10;
        boolean z11;
        int colorForState3;
        int colorForState4;
        int colorForState5;
        boolean z12;
        boolean z13;
        int colorForState6;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f87615z;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(iArr, this.f87604o0);
        } else {
            colorForState = 0;
        }
        int iL = l(colorForState);
        boolean state = true;
        if (this.f87604o0 != iL) {
            this.f87604o0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f87555A;
        if (colorStateList2 != null) {
            colorForState2 = colorStateList2.getColorForState(iArr, this.f87605p0);
        } else {
            colorForState2 = 0;
        }
        int iL2 = l(colorForState2);
        if (this.f87605p0 != iL2) {
            this.f87605p0 = iL2;
            zOnStateChange = true;
        }
        int i10 = C15121a.i(iL, iL2);
        if (this.f87606q0 != i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (x() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 | z11) {
            this.f87606q0 = i10;
            b0(ColorStateList.valueOf(i10));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f87561D;
        if (colorStateList3 != null) {
            colorForState3 = colorStateList3.getColorForState(iArr, this.f87607r0);
        } else {
            colorForState3 = 0;
        }
        if (this.f87607r0 != colorForState3) {
            this.f87607r0 = colorForState3;
            zOnStateChange = true;
        }
        if (this.f87562D0 != null && C16896b.e(iArr)) {
            colorForState4 = this.f87562D0.getColorForState(iArr, this.f87608s0);
        } else {
            colorForState4 = 0;
        }
        if (this.f87608s0 != colorForState4) {
            this.f87608s0 = colorForState4;
            if (this.f87560C0) {
                zOnStateChange = true;
            }
        }
        if (this.f87603n0.e() != null && this.f87603n0.e().i() != null) {
            colorForState5 = this.f87603n0.e().i().getColorForState(iArr, this.f87609t0);
        } else {
            colorForState5 = 0;
        }
        if (this.f87609t0 != colorForState5) {
            this.f87609t0 = colorForState5;
            zOnStateChange = true;
        }
        if (s1(getState(), R.attr.state_checked) && this.f87582S) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f87610u0 != z12 && this.f87584U != null) {
            float fR0 = r0();
            this.f87610u0 = z12;
            if (fR0 != r0()) {
                zOnStateChange = true;
                z13 = true;
            } else {
                z13 = false;
                zOnStateChange = true;
            }
        } else {
            z13 = false;
        }
        ColorStateList colorStateList4 = this.f87616z0;
        if (colorStateList4 != null) {
            colorForState6 = colorStateList4.getColorForState(iArr, this.f87611v0);
        } else {
            colorForState6 = 0;
        }
        if (this.f87611v0 != colorForState6) {
            this.f87611v0 = colorForState6;
            this.f87614y0 = d.m(this, this.f87616z0, this.f87556A0);
        } else {
            state = zOnStateChange;
        }
        if (x1(this.f87571I)) {
            state |= this.f87571I.setState(iArr);
        }
        if (x1(this.f87584U)) {
            state |= this.f87584U.setState(iArr);
        }
        if (x1(this.f87577N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f87577N.setState(iArr3);
        }
        if (C16896b.f159474a && x1(this.f87578O)) {
            state |= this.f87578O.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z13) {
            A1();
        }
        return state;
    }

    private void D0(Canvas canvas, Rect rect) {
        if (T2()) {
            q0(rect, this.f87600k0);
            RectF rectF = this.f87600k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f87571I.setBounds(0, 0, (int) this.f87600k0.width(), (int) this.f87600k0.height());
            this.f87571I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void G0(Canvas canvas, Rect rect) {
        if (U2()) {
            t0(rect, this.f87600k0);
            RectF rectF = this.f87600k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f87577N.setBounds(0, 0, (int) this.f87600k0.width(), (int) this.f87600k0.height());
            if (C16896b.f159474a) {
                this.f87578O.setBounds(this.f87577N.getBounds());
                this.f87578O.jumpToCurrentState();
                this.f87578O.draw(canvas);
            } else {
                this.f87577N.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (!T2() && !S2()) {
            return;
        }
        float f10 = this.f87588Y + this.f87589Z;
        float fF1 = f1();
        if (C13595a.f(this) == 0) {
            float f11 = rect.left + f10;
            rectF.left = f11;
            rectF.right = f11 + fF1;
        } else {
            float f12 = rect.right - f10;
            rectF.right = f12;
            rectF.left = f12 - fF1;
        }
        float fE1 = e1();
        float fExactCenterY = rect.exactCenterY() - (fE1 / 2.0f);
        rectF.top = fExactCenterY;
        rectF.bottom = fExactCenterY + fE1;
    }

    private void s0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (U2()) {
            float f10 = this.f87595f0 + this.f87594e0 + this.f87580Q + this.f87593d0 + this.f87592c0;
            if (C13595a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private void t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (U2()) {
            float f10 = this.f87595f0 + this.f87594e0;
            if (C13595a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f87580Q;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f87580Q;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f87580Q;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (U2()) {
            float f10 = this.f87595f0 + this.f87594e0 + this.f87580Q + this.f87593d0 + this.f87592c0;
            if (C13595a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void w0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f87567G != null) {
            float fR0 = this.f87588Y + r0() + this.f87591b0;
            float fV0 = this.f87595f0 + v0() + this.f87592c0;
            if (C13595a.f(this) == 0) {
                rectF.left = rect.left + fR0;
                rectF.right = rect.right - fV0;
            } else {
                rectF.left = rect.left + fV0;
                rectF.right = rect.right - fR0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void N2(float f10) {
        C16635d c16635dN1 = n1();
        if (c16635dN1 != null) {
            c16635dN1.l(f10);
            this.f87603n0.g().setTextSize(f10);
            a();
        }
    }

    public void Q1(Drawable drawable) {
        Drawable drawableMutate;
        Drawable drawableP0 = P0();
        if (drawableP0 != drawable) {
            float fR0 = r0();
            if (drawable != null) {
                drawableMutate = C13595a.r(drawable).mutate();
            } else {
                drawableMutate = null;
            }
            this.f87571I = drawableMutate;
            float fR02 = r0();
            V2(drawableP0);
            if (T2()) {
                p0(this.f87571I);
            }
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    @Override // com.google.android.material.internal.q.b
    public void a() {
        A1();
        invalidateSelf();
    }

    public void d1(RectF rectF) {
        u0(getBounds(), rectF);
    }

    @Override // te.C17234h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i10 = this.f87612w0;
            if (i10 < 255) {
                canvas2 = canvas;
                iA = C14353a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
            } else {
                canvas2 = canvas;
                iA = 0;
            }
            F0(canvas2, bounds);
            C0(canvas2, bounds);
            if (this.f87572I0) {
                super.draw(canvas2);
            }
            E0(canvas2, bounds);
            H0(canvas2, bounds);
            D0(canvas2, bounds);
            B0(canvas2, bounds);
            if (this.f87568G0) {
                J0(canvas2, bounds);
            }
            G0(canvas2, bounds);
            I0(canvas2, bounds);
            if (this.f87612w0 < 255) {
                canvas2.restoreToCount(iA);
            }
        }
    }

    public void h2(Drawable drawable) {
        Drawable drawableMutate;
        Drawable drawableW0 = W0();
        if (drawableW0 != drawable) {
            float fV0 = v0();
            if (drawable != null) {
                drawableMutate = C13595a.r(drawable).mutate();
            } else {
                drawableMutate = null;
            }
            this.f87577N = drawableMutate;
            if (C16896b.f159474a) {
                X2();
            }
            float fV02 = v0();
            V2(drawableW0);
            if (U2()) {
                p0(this.f87577N);
            }
            invalidateSelf();
            if (fV0 != fV02) {
                A1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (T2()) {
            zOnLayoutDirectionChanged |= C13595a.m(this.f87571I, i10);
        }
        if (S2()) {
            zOnLayoutDirectionChanged |= C13595a.m(this.f87584U, i10);
        }
        if (U2()) {
            zOnLayoutDirectionChanged |= C13595a.m(this.f87577N, i10);
        }
        if (zOnLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (T2()) {
            zOnLevelChange |= this.f87571I.setLevel(i10);
        }
        if (S2()) {
            zOnLevelChange |= this.f87584U.setLevel(i10);
        }
        if (U2()) {
            zOnLevelChange |= this.f87577N.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    float r0() {
        if (!T2() && !S2()) {
            return 0.0f;
        }
        return this.f87589Z + f1() + this.f87590a0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (T2()) {
            visible |= this.f87571I.setVisible(z10, z11);
        }
        if (S2()) {
            visible |= this.f87584U.setVisible(z10, z11);
        }
        if (U2()) {
            visible |= this.f87577N.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    float v0() {
        if (U2()) {
            return this.f87593d0 + this.f87580Q + this.f87594e0;
        }
        return 0.0f;
    }
}
