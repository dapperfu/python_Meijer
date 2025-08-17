package com.google.android.material.chip;

import ae.l;
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
import be.C6237h;
import c2.c;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.gms.common.api.a;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import com.medallia.digital.mobilesdk.l3;
import d2.C13462a;
import ee.C13649a;
import ie.C14718a;
import j.C14791a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import m2.C15544a;
import oe.C16026c;
import oe.C16027d;
import pe.C16292b;
import re.C16760h;

/* loaded from: classes4.dex */
public class a extends C16760h implements Drawable.Callback, q.b, FSDraw {

    /* renamed from: J0, reason: collision with root package name */
    private static final int[] f86713J0 = {R.attr.state_enabled};

    /* renamed from: K0, reason: collision with root package name */
    private static final ShapeDrawable f86714K0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f86715A;

    /* renamed from: A0, reason: collision with root package name */
    private PorterDuff.Mode f86716A0;

    /* renamed from: B, reason: collision with root package name */
    private float f86717B;

    /* renamed from: B0, reason: collision with root package name */
    private int[] f86718B0;

    /* renamed from: C, reason: collision with root package name */
    private float f86719C;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f86720C0;

    /* renamed from: D, reason: collision with root package name */
    private ColorStateList f86721D;

    /* renamed from: D0, reason: collision with root package name */
    private ColorStateList f86722D0;

    /* renamed from: E, reason: collision with root package name */
    private float f86723E;

    /* renamed from: E0, reason: collision with root package name */
    private WeakReference<InterfaceC1265a> f86724E0;

    /* renamed from: F, reason: collision with root package name */
    private ColorStateList f86725F;

    /* renamed from: F0, reason: collision with root package name */
    private TextUtils.TruncateAt f86726F0;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f86727G;

    /* renamed from: G0, reason: collision with root package name */
    private boolean f86728G0;

    /* renamed from: H, reason: collision with root package name */
    private boolean f86729H;

    /* renamed from: H0, reason: collision with root package name */
    private int f86730H0;

    /* renamed from: I, reason: collision with root package name */
    private Drawable f86731I;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f86732I0;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f86733J;

    /* renamed from: K, reason: collision with root package name */
    private float f86734K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f86735L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f86736M;

    /* renamed from: N, reason: collision with root package name */
    private Drawable f86737N;

    /* renamed from: O, reason: collision with root package name */
    private Drawable f86738O;

    /* renamed from: P, reason: collision with root package name */
    private ColorStateList f86739P;

    /* renamed from: Q, reason: collision with root package name */
    private float f86740Q;

    /* renamed from: R, reason: collision with root package name */
    private CharSequence f86741R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f86742S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f86743T;

    /* renamed from: U, reason: collision with root package name */
    private Drawable f86744U;

    /* renamed from: V, reason: collision with root package name */
    private ColorStateList f86745V;

    /* renamed from: W, reason: collision with root package name */
    private C6237h f86746W;

    /* renamed from: X, reason: collision with root package name */
    private C6237h f86747X;

    /* renamed from: Y, reason: collision with root package name */
    private float f86748Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f86749Z;

    /* renamed from: a0, reason: collision with root package name */
    private float f86750a0;

    /* renamed from: b0, reason: collision with root package name */
    private float f86751b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f86752c0;

    /* renamed from: d0, reason: collision with root package name */
    private float f86753d0;

    /* renamed from: e0, reason: collision with root package name */
    private float f86754e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f86755f0;

    /* renamed from: g0, reason: collision with root package name */
    private final Context f86756g0;

    /* renamed from: h0, reason: collision with root package name */
    private final Paint f86757h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Paint f86758i0;

    /* renamed from: j0, reason: collision with root package name */
    private final Paint.FontMetrics f86759j0;

    /* renamed from: k0, reason: collision with root package name */
    private final RectF f86760k0;

    /* renamed from: l0, reason: collision with root package name */
    private final PointF f86761l0;

    /* renamed from: m0, reason: collision with root package name */
    private final Path f86762m0;

    /* renamed from: n0, reason: collision with root package name */
    private final q f86763n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f86764o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f86765p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f86766q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f86767r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f86768s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f86769t0;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f86770u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f86771v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f86772w0;

    /* renamed from: x0, reason: collision with root package name */
    private ColorFilter f86773x0;

    /* renamed from: y0, reason: collision with root package name */
    private PorterDuffColorFilter f86774y0;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f86775z;

    /* renamed from: z0, reason: collision with root package name */
    private ColorStateList f86776z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC1265a {
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
        this.f86735L = true;
        if (this.f86733J != colorStateList) {
            this.f86733J = colorStateList;
            if (T2()) {
                C13462a.o(this.f86731I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    Paint.Align y0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f86727G != null) {
            float fR0 = this.f86748Y + r0() + this.f86751b0;
            if (C13462a.f(this) == 0) {
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
        if (this.f86732I0) {
            return;
        }
        this.f86757h0.setColor(this.f86765p0);
        this.f86757h0.setStyle(Paint.Style.FILL);
        this.f86757h0.setColorFilter(q1());
        this.f86760k0.set(rect);
        canvas.drawRoundRect(this.f86760k0, N0(), N0(), this.f86757h0);
    }

    private void E0(Canvas canvas, Rect rect) {
        if (this.f86723E <= 0.0f || this.f86732I0) {
            return;
        }
        this.f86757h0.setColor(this.f86767r0);
        this.f86757h0.setStyle(Paint.Style.STROKE);
        if (!this.f86732I0) {
            this.f86757h0.setColorFilter(q1());
        }
        RectF rectF = this.f86760k0;
        float f10 = rect.left;
        float f11 = this.f86723E;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f86719C - (this.f86723E / 2.0f);
        canvas.drawRoundRect(this.f86760k0, f12, f12, this.f86757h0);
    }

    private void F0(Canvas canvas, Rect rect) {
        if (this.f86732I0) {
            return;
        }
        this.f86757h0.setColor(this.f86764o0);
        this.f86757h0.setStyle(Paint.Style.FILL);
        this.f86760k0.set(rect);
        canvas.drawRoundRect(this.f86760k0, N0(), N0(), this.f86757h0);
    }

    private void H0(Canvas canvas, Rect rect) {
        this.f86757h0.setColor(this.f86768s0);
        this.f86757h0.setStyle(Paint.Style.FILL);
        this.f86760k0.set(rect);
        if (!this.f86732I0) {
            canvas.drawRoundRect(this.f86760k0, N0(), N0(), this.f86757h0);
        } else {
            h(new RectF(rect), this.f86762m0);
            super.p(canvas, this.f86757h0, this.f86762m0, u());
        }
    }

    private void I0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f86758i0;
        if (paint != null) {
            paint.setColor(c.k(-16777216, l3.f92485d));
            canvas.drawRect(rect, this.f86758i0);
            if (T2() || S2()) {
                q0(rect, this.f86760k0);
                canvas.drawRect(this.f86760k0, this.f86758i0);
            }
            if (this.f86727G != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f86758i0);
            } else {
                canvas2 = canvas;
            }
            if (U2()) {
                t0(rect, this.f86760k0);
                canvas2.drawRect(this.f86760k0, this.f86758i0);
            }
            this.f86758i0.setColor(c.k(-65536, l3.f92485d));
            s0(rect, this.f86760k0);
            canvas2.drawRect(this.f86760k0, this.f86758i0);
            this.f86758i0.setColor(c.k(-16711936, l3.f92485d));
            u0(rect, this.f86760k0);
            canvas2.drawRect(this.f86760k0, this.f86758i0);
        }
    }

    private void J0(Canvas canvas, Rect rect) {
        if (this.f86727G != null) {
            Paint.Align alignY0 = y0(rect, this.f86761l0);
            w0(rect, this.f86760k0);
            if (this.f86763n0.e() != null) {
                this.f86763n0.g().drawableState = getState();
                this.f86763n0.n(this.f86756g0);
            }
            this.f86763n0.g().setTextAlign(alignY0);
            int iSave = 0;
            boolean z10 = Math.round(this.f86763n0.h(m1().toString())) > Math.round(this.f86760k0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f86760k0);
            }
            CharSequence charSequenceEllipsize = this.f86727G;
            if (z10 && this.f86726F0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f86763n0.g(), this.f86760k0.width(), this.f86726F0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f86761l0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f86763n0.g());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean S2() {
        return this.f86743T && this.f86744U != null && this.f86770u0;
    }

    private boolean T2() {
        return this.f86729H && this.f86731I != null;
    }

    private boolean U2() {
        return this.f86736M && this.f86737N != null;
    }

    private void V2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void W2() {
        this.f86722D0 = this.f86720C0 ? C16292b.d(this.f86725F) : null;
    }

    @TargetApi(21)
    private void X2() {
        this.f86738O = new RippleDrawable(C16292b.d(k1()), this.f86737N, f86714K0);
    }

    private float e1() {
        Drawable drawable = this.f86770u0 ? this.f86744U : this.f86731I;
        float fCeil = this.f86734K;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(x.d(this.f86756g0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float f1() {
        Drawable drawable = this.f86770u0 ? this.f86744U : this.f86731I;
        float f10 = this.f86734K;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void g2(ColorStateList colorStateList) {
        if (this.f86775z != colorStateList) {
            this.f86775z = colorStateList;
            onStateChange(getState());
        }
    }

    private void p0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C13462a.m(drawable, C13462a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f86737N) {
            if (drawable.isStateful()) {
                drawable.setState(b1());
            }
            C13462a.o(drawable, this.f86739P);
            return;
        }
        Drawable drawable2 = this.f86731I;
        if (drawable == drawable2 && this.f86735L) {
            C13462a.o(drawable2, this.f86733J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private ColorFilter q1() {
        ColorFilter colorFilter = this.f86773x0;
        return colorFilter != null ? colorFilter : this.f86774y0;
    }

    private static boolean w1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float x0() {
        this.f86763n0.g().getFontMetrics(this.f86759j0);
        Paint.FontMetrics fontMetrics = this.f86759j0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean x1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean y1(C16027d c16027d) {
        return (c16027d == null || c16027d.i() == null || !c16027d.i().isStateful()) ? false : true;
    }

    private boolean z0() {
        return this.f86743T && this.f86744U != null && this.f86742S;
    }

    private void z1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = s.i(this.f86756g0, attributeSet, l.f44991P0, i10, i11, new int[0]);
        this.f86732I0 = typedArrayI.hasValue(l.f44813A1);
        g2(C16026c.a(this.f86756g0, typedArrayI, l.f45269n1));
        K1(C16026c.a(this.f86756g0, typedArrayI, l.f45113a1));
        Y1(typedArrayI.getDimension(l.f45209i1, 0.0f));
        if (typedArrayI.hasValue(l.f45125b1)) {
            M1(typedArrayI.getDimension(l.f45125b1, 0.0f));
        }
        c2(C16026c.a(this.f86756g0, typedArrayI, l.f45245l1));
        e2(typedArrayI.getDimension(l.f45257m1, 0.0f));
        D2(C16026c.a(this.f86756g0, typedArrayI, l.f45413z1));
        I2(typedArrayI.getText(l.f45046U0));
        C16027d c16027dG = C16026c.g(this.f86756g0, typedArrayI, l.f45002Q0);
        c16027dG.l(typedArrayI.getDimension(l.f45013R0, c16027dG.j()));
        J2(c16027dG);
        int i12 = typedArrayI.getInt(l.f45024S0, 0);
        if (i12 == 1) {
            v2(TextUtils.TruncateAt.START);
        } else if (i12 == 2) {
            v2(TextUtils.TruncateAt.MIDDLE);
        } else if (i12 == 3) {
            v2(TextUtils.TruncateAt.END);
        }
        X1(typedArrayI.getBoolean(l.f45197h1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            X1(typedArrayI.getBoolean(l.f45161e1, false));
        }
        Q1(C16026c.d(this.f86756g0, typedArrayI, l.f45149d1));
        if (typedArrayI.hasValue(l.f45185g1)) {
            U1(C16026c.a(this.f86756g0, typedArrayI, l.f45185g1));
        }
        S1(typedArrayI.getDimension(l.f45173f1, -1.0f));
        t2(typedArrayI.getBoolean(l.f45353u1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            t2(typedArrayI.getBoolean(l.f45293p1, false));
        }
        h2(C16026c.d(this.f86756g0, typedArrayI, l.f45281o1));
        r2(C16026c.a(this.f86756g0, typedArrayI, l.f45341t1));
        m2(typedArrayI.getDimension(l.f45317r1, 0.0f));
        C1(typedArrayI.getBoolean(l.f45057V0, false));
        J1(typedArrayI.getBoolean(l.f45101Z0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            J1(typedArrayI.getBoolean(l.f45079X0, false));
        }
        E1(C16026c.d(this.f86756g0, typedArrayI, l.f45068W0));
        if (typedArrayI.hasValue(l.f45090Y0)) {
            G1(C16026c.a(this.f86756g0, typedArrayI, l.f45090Y0));
        }
        G2(C6237h.b(this.f86756g0, typedArrayI, l.f44825B1));
        w2(C6237h.b(this.f86756g0, typedArrayI, l.f45377w1));
        a2(typedArrayI.getDimension(l.f45233k1, 0.0f));
        A2(typedArrayI.getDimension(l.f45401y1, 0.0f));
        y2(typedArrayI.getDimension(l.f45389x1, 0.0f));
        O2(typedArrayI.getDimension(l.f44849D1, 0.0f));
        L2(typedArrayI.getDimension(l.f44837C1, 0.0f));
        o2(typedArrayI.getDimension(l.f45329s1, 0.0f));
        j2(typedArrayI.getDimension(l.f45305q1, 0.0f));
        O1(typedArrayI.getDimension(l.f45137c1, 0.0f));
        C2(typedArrayI.getDimensionPixelSize(l.f45035T0, a.e.API_PRIORITY_OTHER));
        typedArrayI.recycle();
    }

    protected void A1() {
        InterfaceC1265a interfaceC1265a = this.f86724E0.get();
        if (interfaceC1265a != null) {
            interfaceC1265a.a();
        }
    }

    public void A2(float f10) {
        if (this.f86749Z != f10) {
            float fR0 = r0();
            this.f86749Z = f10;
            float fR02 = r0();
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    public void B2(int i10) {
        A2(this.f86756g0.getResources().getDimension(i10));
    }

    public void C1(boolean z10) {
        if (this.f86742S != z10) {
            this.f86742S = z10;
            float fR0 = r0();
            if (!z10 && this.f86770u0) {
                this.f86770u0 = false;
            }
            float fR02 = r0();
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    public void C2(int i10) {
        this.f86730H0 = i10;
    }

    public void D1(int i10) {
        C1(this.f86756g0.getResources().getBoolean(i10));
    }

    public void D2(ColorStateList colorStateList) {
        if (this.f86725F != colorStateList) {
            this.f86725F = colorStateList;
            W2();
            onStateChange(getState());
        }
    }

    public void E1(Drawable drawable) {
        if (this.f86744U != drawable) {
            float fR0 = r0();
            this.f86744U = drawable;
            float fR02 = r0();
            V2(this.f86744U);
            p0(this.f86744U);
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    public void E2(int i10) {
        D2(C14791a.a(this.f86756g0, i10));
    }

    public void F1(int i10) {
        E1(C14791a.b(this.f86756g0, i10));
    }

    void F2(boolean z10) {
        this.f86728G0 = z10;
    }

    public void G1(ColorStateList colorStateList) {
        if (this.f86745V != colorStateList) {
            this.f86745V = colorStateList;
            if (z0()) {
                C13462a.o(this.f86744U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void G2(C6237h c6237h) {
        this.f86746W = c6237h;
    }

    public void H1(int i10) {
        G1(C14791a.a(this.f86756g0, i10));
    }

    public void H2(int i10) {
        G2(C6237h.c(this.f86756g0, i10));
    }

    public void I1(int i10) {
        J1(this.f86756g0.getResources().getBoolean(i10));
    }

    public void I2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f86727G, charSequence)) {
            return;
        }
        this.f86727G = charSequence;
        this.f86763n0.m(true);
        invalidateSelf();
        A1();
    }

    public void J1(boolean z10) {
        if (this.f86743T != z10) {
            boolean zS2 = S2();
            this.f86743T = z10;
            boolean zS22 = S2();
            if (zS2 != zS22) {
                if (zS22) {
                    p0(this.f86744U);
                } else {
                    V2(this.f86744U);
                }
                invalidateSelf();
                A1();
            }
        }
    }

    public void J2(C16027d c16027d) {
        this.f86763n0.k(c16027d, this.f86756g0);
    }

    public Drawable K0() {
        return this.f86744U;
    }

    public void K1(ColorStateList colorStateList) {
        if (this.f86715A != colorStateList) {
            this.f86715A = colorStateList;
            onStateChange(getState());
        }
    }

    public void K2(int i10) {
        J2(new C16027d(this.f86756g0, i10));
    }

    public ColorStateList L0() {
        return this.f86745V;
    }

    public void L1(int i10) {
        K1(C14791a.a(this.f86756g0, i10));
    }

    public void L2(float f10) {
        if (this.f86752c0 != f10) {
            this.f86752c0 = f10;
            invalidateSelf();
            A1();
        }
    }

    public ColorStateList M0() {
        return this.f86715A;
    }

    @Deprecated
    public void M1(float f10) {
        if (this.f86719C != f10) {
            this.f86719C = f10;
            setShapeAppearanceModel(E().w(f10));
        }
    }

    public void M2(int i10) {
        L2(this.f86756g0.getResources().getDimension(i10));
    }

    public float N0() {
        return this.f86732I0 ? J() : this.f86719C;
    }

    @Deprecated
    public void N1(int i10) {
        M1(this.f86756g0.getResources().getDimension(i10));
    }

    public float O0() {
        return this.f86755f0;
    }

    public void O1(float f10) {
        if (this.f86755f0 != f10) {
            this.f86755f0 = f10;
            invalidateSelf();
            A1();
        }
    }

    public void O2(float f10) {
        if (this.f86751b0 != f10) {
            this.f86751b0 = f10;
            invalidateSelf();
            A1();
        }
    }

    public Drawable P0() {
        Drawable drawable = this.f86731I;
        if (drawable != null) {
            return C13462a.q(drawable);
        }
        return null;
    }

    public void P1(int i10) {
        O1(this.f86756g0.getResources().getDimension(i10));
    }

    public void P2(int i10) {
        O2(this.f86756g0.getResources().getDimension(i10));
    }

    public float Q0() {
        return this.f86734K;
    }

    public void Q2(boolean z10) {
        if (this.f86720C0 != z10) {
            this.f86720C0 = z10;
            W2();
            onStateChange(getState());
        }
    }

    public ColorStateList R0() {
        return this.f86733J;
    }

    public void R1(int i10) {
        Q1(C14791a.b(this.f86756g0, i10));
    }

    boolean R2() {
        return this.f86728G0;
    }

    public float S0() {
        return this.f86717B;
    }

    public void S1(float f10) {
        if (this.f86734K != f10) {
            float fR0 = r0();
            this.f86734K = f10;
            float fR02 = r0();
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    public float T0() {
        return this.f86748Y;
    }

    public void T1(int i10) {
        S1(this.f86756g0.getResources().getDimension(i10));
    }

    public ColorStateList U0() {
        return this.f86721D;
    }

    public float V0() {
        return this.f86723E;
    }

    public void V1(int i10) {
        U1(C14791a.a(this.f86756g0, i10));
    }

    public Drawable W0() {
        Drawable drawable = this.f86737N;
        if (drawable != null) {
            return C13462a.q(drawable);
        }
        return null;
    }

    public void W1(int i10) {
        X1(this.f86756g0.getResources().getBoolean(i10));
    }

    public CharSequence X0() {
        return this.f86741R;
    }

    public void X1(boolean z10) {
        if (this.f86729H != z10) {
            boolean zT2 = T2();
            this.f86729H = z10;
            boolean zT22 = T2();
            if (zT2 != zT22) {
                if (zT22) {
                    p0(this.f86731I);
                } else {
                    V2(this.f86731I);
                }
                invalidateSelf();
                A1();
            }
        }
    }

    public float Y0() {
        return this.f86754e0;
    }

    public void Y1(float f10) {
        if (this.f86717B != f10) {
            this.f86717B = f10;
            invalidateSelf();
            A1();
        }
    }

    public float Z0() {
        return this.f86740Q;
    }

    public void Z1(int i10) {
        Y1(this.f86756g0.getResources().getDimension(i10));
    }

    public float a1() {
        return this.f86753d0;
    }

    public void a2(float f10) {
        if (this.f86748Y != f10) {
            this.f86748Y = f10;
            invalidateSelf();
            A1();
        }
    }

    public int[] b1() {
        return this.f86718B0;
    }

    public void b2(int i10) {
        a2(this.f86756g0.getResources().getDimension(i10));
    }

    public ColorStateList c1() {
        return this.f86739P;
    }

    public void c2(ColorStateList colorStateList) {
        if (this.f86721D != colorStateList) {
            this.f86721D = colorStateList;
            if (this.f86732I0) {
                k0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d2(int i10) {
        c2(C14791a.a(this.f86756g0, i10));
    }

    public void e2(float f10) {
        if (this.f86723E != f10) {
            this.f86723E = f10;
            this.f86757h0.setStrokeWidth(f10);
            if (this.f86732I0) {
                super.l0(f10);
            }
            invalidateSelf();
        }
    }

    public void f2(int i10) {
        e2(this.f86756g0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt g1() {
        return this.f86726F0;
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f86772w0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f86773x0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f86717B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f86748Y + r0() + this.f86751b0 + this.f86763n0.h(m1().toString()) + this.f86752c0 + v0() + this.f86755f0), this.f86730H0);
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f86732I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f86719C);
        } else {
            outline.setRoundRect(bounds, this.f86719C);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public C6237h h1() {
        return this.f86747X;
    }

    public float i1() {
        return this.f86750a0;
    }

    public void i2(CharSequence charSequence) {
        if (this.f86741R != charSequence) {
            this.f86741R = C15544a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (w1(this.f86775z) || w1(this.f86715A) || w1(this.f86721D)) {
            return true;
        }
        return (this.f86720C0 && w1(this.f86722D0)) || y1(this.f86763n0.e()) || z0() || x1(this.f86731I) || x1(this.f86744U) || w1(this.f86776z0);
    }

    public float j1() {
        return this.f86749Z;
    }

    public void j2(float f10) {
        if (this.f86754e0 != f10) {
            this.f86754e0 = f10;
            invalidateSelf();
            if (U2()) {
                A1();
            }
        }
    }

    public ColorStateList k1() {
        return this.f86725F;
    }

    public void k2(int i10) {
        j2(this.f86756g0.getResources().getDimension(i10));
    }

    public C6237h l1() {
        return this.f86746W;
    }

    public void l2(int i10) {
        h2(C14791a.b(this.f86756g0, i10));
    }

    public CharSequence m1() {
        return this.f86727G;
    }

    public void m2(float f10) {
        if (this.f86740Q != f10) {
            this.f86740Q = f10;
            invalidateSelf();
            if (U2()) {
                A1();
            }
        }
    }

    public C16027d n1() {
        return this.f86763n0.e();
    }

    public void n2(int i10) {
        m2(this.f86756g0.getResources().getDimension(i10));
    }

    public float o1() {
        return this.f86752c0;
    }

    public void o2(float f10) {
        if (this.f86753d0 != f10) {
            this.f86753d0 = f10;
            invalidateSelf();
            if (U2()) {
                A1();
            }
        }
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable, com.google.android.material.internal.q.b
    public boolean onStateChange(int[] iArr) {
        if (this.f86732I0) {
            super.onStateChange(iArr);
        }
        return B1(iArr, b1());
    }

    public float p1() {
        return this.f86751b0;
    }

    public void p2(int i10) {
        o2(this.f86756g0.getResources().getDimension(i10));
    }

    public boolean q2(int[] iArr) {
        if (Arrays.equals(this.f86718B0, iArr)) {
            return false;
        }
        this.f86718B0 = iArr;
        if (U2()) {
            return B1(getState(), iArr);
        }
        return false;
    }

    public boolean r1() {
        return this.f86720C0;
    }

    public void r2(ColorStateList colorStateList) {
        if (this.f86739P != colorStateList) {
            this.f86739P = colorStateList;
            if (U2()) {
                C13462a.o(this.f86737N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void s2(int i10) {
        r2(C14791a.a(this.f86756g0, i10));
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f86772w0 != i10) {
            this.f86772w0 = i10;
            invalidateSelf();
        }
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f86773x0 != colorFilter) {
            this.f86773x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f86776z0 != colorStateList) {
            this.f86776z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // re.C16760h, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f86716A0 != mode) {
            this.f86716A0 = mode;
            this.f86774y0 = d.m(this, this.f86776z0, mode);
            invalidateSelf();
        }
    }

    public boolean t1() {
        return this.f86742S;
    }

    public void t2(boolean z10) {
        if (this.f86736M != z10) {
            boolean zU2 = U2();
            this.f86736M = z10;
            boolean zU22 = U2();
            if (zU2 != zU22) {
                if (zU22) {
                    p0(this.f86737N);
                } else {
                    V2(this.f86737N);
                }
                invalidateSelf();
                A1();
            }
        }
    }

    public boolean u1() {
        return x1(this.f86737N);
    }

    public void u2(InterfaceC1265a interfaceC1265a) {
        this.f86724E0 = new WeakReference<>(interfaceC1265a);
    }

    public boolean v1() {
        return this.f86736M;
    }

    public void v2(TextUtils.TruncateAt truncateAt) {
        this.f86726F0 = truncateAt;
    }

    public void w2(C6237h c6237h) {
        this.f86747X = c6237h;
    }

    public void x2(int i10) {
        w2(C6237h.c(this.f86756g0, i10));
    }

    public void y2(float f10) {
        if (this.f86750a0 != f10) {
            float fR0 = r0();
            this.f86750a0 = f10;
            float fR02 = r0();
            invalidateSelf();
            if (fR0 != fR02) {
                A1();
            }
        }
    }

    public void z2(int i10) {
        y2(this.f86756g0.getResources().getDimension(i10));
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f86719C = -1.0f;
        this.f86757h0 = new Paint(1);
        this.f86759j0 = new Paint.FontMetrics();
        this.f86760k0 = new RectF();
        this.f86761l0 = new PointF();
        this.f86762m0 = new Path();
        this.f86772w0 = l3.f92484c;
        this.f86716A0 = PorterDuff.Mode.SRC_IN;
        this.f86724E0 = new WeakReference<>(null);
        Q(context);
        this.f86756g0 = context;
        q qVar = new q(this);
        this.f86763n0 = qVar;
        this.f86727G = "";
        qVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f86758i0 = null;
        int[] iArr = f86713J0;
        setState(iArr);
        q2(iArr);
        this.f86728G0 = true;
        if (C16292b.f155717a) {
            f86714K0.setTint(-1);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        if (S2()) {
            q0(rect, this.f86760k0);
            RectF rectF = this.f86760k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f86744U.setBounds(0, 0, (int) this.f86760k0.width(), (int) this.f86760k0.height());
            this.f86744U.draw(canvas);
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
        ColorStateList colorStateList = this.f86775z;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(iArr, this.f86764o0);
        } else {
            colorForState = 0;
        }
        int iL = l(colorForState);
        boolean state = true;
        if (this.f86764o0 != iL) {
            this.f86764o0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f86715A;
        if (colorStateList2 != null) {
            colorForState2 = colorStateList2.getColorForState(iArr, this.f86765p0);
        } else {
            colorForState2 = 0;
        }
        int iL2 = l(colorForState2);
        if (this.f86765p0 != iL2) {
            this.f86765p0 = iL2;
            zOnStateChange = true;
        }
        int i10 = C14718a.i(iL, iL2);
        if (this.f86766q0 != i10) {
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
            this.f86766q0 = i10;
            b0(ColorStateList.valueOf(i10));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f86721D;
        if (colorStateList3 != null) {
            colorForState3 = colorStateList3.getColorForState(iArr, this.f86767r0);
        } else {
            colorForState3 = 0;
        }
        if (this.f86767r0 != colorForState3) {
            this.f86767r0 = colorForState3;
            zOnStateChange = true;
        }
        if (this.f86722D0 != null && C16292b.e(iArr)) {
            colorForState4 = this.f86722D0.getColorForState(iArr, this.f86768s0);
        } else {
            colorForState4 = 0;
        }
        if (this.f86768s0 != colorForState4) {
            this.f86768s0 = colorForState4;
            if (this.f86720C0) {
                zOnStateChange = true;
            }
        }
        if (this.f86763n0.e() != null && this.f86763n0.e().i() != null) {
            colorForState5 = this.f86763n0.e().i().getColorForState(iArr, this.f86769t0);
        } else {
            colorForState5 = 0;
        }
        if (this.f86769t0 != colorForState5) {
            this.f86769t0 = colorForState5;
            zOnStateChange = true;
        }
        if (s1(getState(), R.attr.state_checked) && this.f86742S) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f86770u0 != z12 && this.f86744U != null) {
            float fR0 = r0();
            this.f86770u0 = z12;
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
        ColorStateList colorStateList4 = this.f86776z0;
        if (colorStateList4 != null) {
            colorForState6 = colorStateList4.getColorForState(iArr, this.f86771v0);
        } else {
            colorForState6 = 0;
        }
        if (this.f86771v0 != colorForState6) {
            this.f86771v0 = colorForState6;
            this.f86774y0 = d.m(this, this.f86776z0, this.f86716A0);
        } else {
            state = zOnStateChange;
        }
        if (x1(this.f86731I)) {
            state |= this.f86731I.setState(iArr);
        }
        if (x1(this.f86744U)) {
            state |= this.f86744U.setState(iArr);
        }
        if (x1(this.f86737N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f86737N.setState(iArr3);
        }
        if (C16292b.f155717a && x1(this.f86738O)) {
            state |= this.f86738O.setState(iArr2);
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
            q0(rect, this.f86760k0);
            RectF rectF = this.f86760k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f86731I.setBounds(0, 0, (int) this.f86760k0.width(), (int) this.f86760k0.height());
            this.f86731I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void G0(Canvas canvas, Rect rect) {
        if (U2()) {
            t0(rect, this.f86760k0);
            RectF rectF = this.f86760k0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f86737N.setBounds(0, 0, (int) this.f86760k0.width(), (int) this.f86760k0.height());
            if (C16292b.f155717a) {
                this.f86738O.setBounds(this.f86737N.getBounds());
                this.f86738O.jumpToCurrentState();
                this.f86738O.draw(canvas);
            } else {
                this.f86737N.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (!T2() && !S2()) {
            return;
        }
        float f10 = this.f86748Y + this.f86749Z;
        float fF1 = f1();
        if (C13462a.f(this) == 0) {
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
            float f10 = this.f86755f0 + this.f86754e0 + this.f86740Q + this.f86753d0 + this.f86752c0;
            if (C13462a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private void t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (U2()) {
            float f10 = this.f86755f0 + this.f86754e0;
            if (C13462a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f86740Q;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f86740Q;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f86740Q;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (U2()) {
            float f10 = this.f86755f0 + this.f86754e0 + this.f86740Q + this.f86753d0 + this.f86752c0;
            if (C13462a.f(this) == 0) {
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
        if (this.f86727G != null) {
            float fR0 = this.f86748Y + r0() + this.f86751b0;
            float fV0 = this.f86755f0 + v0() + this.f86752c0;
            if (C13462a.f(this) == 0) {
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
        C16027d c16027dN1 = n1();
        if (c16027dN1 != null) {
            c16027dN1.l(f10);
            this.f86763n0.g().setTextSize(f10);
            a();
        }
    }

    public void Q1(Drawable drawable) {
        Drawable drawableMutate;
        Drawable drawableP0 = P0();
        if (drawableP0 != drawable) {
            float fR0 = r0();
            if (drawable != null) {
                drawableMutate = C13462a.r(drawable).mutate();
            } else {
                drawableMutate = null;
            }
            this.f86731I = drawableMutate;
            float fR02 = r0();
            V2(drawableP0);
            if (T2()) {
                p0(this.f86731I);
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

    @Override // re.C16760h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i10 = this.f86772w0;
            if (i10 < 255) {
                canvas2 = canvas;
                iA = C13649a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
            } else {
                canvas2 = canvas;
                iA = 0;
            }
            F0(canvas2, bounds);
            C0(canvas2, bounds);
            if (this.f86732I0) {
                super.draw(canvas2);
            }
            E0(canvas2, bounds);
            H0(canvas2, bounds);
            D0(canvas2, bounds);
            B0(canvas2, bounds);
            if (this.f86728G0) {
                J0(canvas2, bounds);
            }
            G0(canvas2, bounds);
            I0(canvas2, bounds);
            if (this.f86772w0 < 255) {
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
                drawableMutate = C13462a.r(drawable).mutate();
            } else {
                drawableMutate = null;
            }
            this.f86737N = drawableMutate;
            if (C16292b.f155717a) {
                X2();
            }
            float fV02 = v0();
            V2(drawableW0);
            if (U2()) {
                p0(this.f86737N);
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
            zOnLayoutDirectionChanged |= C13462a.m(this.f86731I, i10);
        }
        if (S2()) {
            zOnLayoutDirectionChanged |= C13462a.m(this.f86744U, i10);
        }
        if (U2()) {
            zOnLayoutDirectionChanged |= C13462a.m(this.f86737N, i10);
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
            zOnLevelChange |= this.f86731I.setLevel(i10);
        }
        if (S2()) {
            zOnLevelChange |= this.f86744U.setLevel(i10);
        }
        if (U2()) {
            zOnLevelChange |= this.f86737N.setLevel(i10);
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
        return this.f86749Z + f1() + this.f86750a0;
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
            visible |= this.f86731I.setVisible(z10, z11);
        }
        if (S2()) {
            visible |= this.f86744U.setVisible(z10, z11);
        }
        if (U2()) {
            visible |= this.f86737N.setVisible(z10, z11);
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
            return this.f86753d0 + this.f86740Q + this.f86754e0;
        }
        return 0.0f;
    }
}
