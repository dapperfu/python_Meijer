package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import de.C13661a;
import h2.C14442a;
import ke.C15121a;
import qe.C16632a;
import qe.C16635d;
import qe.C16639h;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f87956t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static final Paint f87957u0 = null;

    /* renamed from: A, reason: collision with root package name */
    private Typeface f87958A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f87959B;

    /* renamed from: C, reason: collision with root package name */
    private Typeface f87960C;

    /* renamed from: D, reason: collision with root package name */
    private C16632a f87961D;

    /* renamed from: E, reason: collision with root package name */
    private C16632a f87962E;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f87964G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f87965H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f87966I;

    /* renamed from: K, reason: collision with root package name */
    private boolean f87968K;

    /* renamed from: L, reason: collision with root package name */
    private Bitmap f87969L;

    /* renamed from: M, reason: collision with root package name */
    private Paint f87970M;

    /* renamed from: N, reason: collision with root package name */
    private float f87971N;

    /* renamed from: O, reason: collision with root package name */
    private float f87972O;

    /* renamed from: P, reason: collision with root package name */
    private float f87973P;

    /* renamed from: Q, reason: collision with root package name */
    private float f87974Q;

    /* renamed from: R, reason: collision with root package name */
    private float f87975R;

    /* renamed from: S, reason: collision with root package name */
    private int f87976S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f87977T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f87978U;

    /* renamed from: V, reason: collision with root package name */
    private final TextPaint f87979V;

    /* renamed from: W, reason: collision with root package name */
    private final TextPaint f87980W;

    /* renamed from: X, reason: collision with root package name */
    private TimeInterpolator f87981X;

    /* renamed from: Y, reason: collision with root package name */
    private TimeInterpolator f87982Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f87983Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f87984a;

    /* renamed from: a0, reason: collision with root package name */
    private float f87985a0;

    /* renamed from: b, reason: collision with root package name */
    private float f87986b;

    /* renamed from: b0, reason: collision with root package name */
    private float f87987b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f87988c;

    /* renamed from: c0, reason: collision with root package name */
    private ColorStateList f87989c0;

    /* renamed from: d, reason: collision with root package name */
    private float f87990d;

    /* renamed from: d0, reason: collision with root package name */
    private float f87991d0;

    /* renamed from: e, reason: collision with root package name */
    private float f87992e;

    /* renamed from: e0, reason: collision with root package name */
    private float f87993e0;

    /* renamed from: f, reason: collision with root package name */
    private int f87994f;

    /* renamed from: f0, reason: collision with root package name */
    private float f87995f0;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f87996g;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f87997g0;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f87998h;

    /* renamed from: h0, reason: collision with root package name */
    private float f87999h0;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f88000i;

    /* renamed from: i0, reason: collision with root package name */
    private float f88001i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f88003j0;

    /* renamed from: k0, reason: collision with root package name */
    private StaticLayout f88005k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f88007l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f88009m0;

    /* renamed from: n, reason: collision with root package name */
    private ColorStateList f88010n;

    /* renamed from: n0, reason: collision with root package name */
    private float f88011n0;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f88012o;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f88013o0;

    /* renamed from: p, reason: collision with root package name */
    private int f88014p;

    /* renamed from: q, reason: collision with root package name */
    private float f88016q;

    /* renamed from: r, reason: collision with root package name */
    private float f88018r;

    /* renamed from: s, reason: collision with root package name */
    private float f88020s;

    /* renamed from: t, reason: collision with root package name */
    private float f88022t;

    /* renamed from: u, reason: collision with root package name */
    private float f88023u;

    /* renamed from: v, reason: collision with root package name */
    private float f88024v;

    /* renamed from: w, reason: collision with root package name */
    private Typeface f88025w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f88026x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f88027y;

    /* renamed from: z, reason: collision with root package name */
    private Typeface f88028z;

    /* renamed from: j, reason: collision with root package name */
    private int f88002j = 16;

    /* renamed from: k, reason: collision with root package name */
    private int f88004k = 16;

    /* renamed from: l, reason: collision with root package name */
    private float f88006l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f88008m = 15.0f;

    /* renamed from: F, reason: collision with root package name */
    private TextUtils.TruncateAt f87963F = TextUtils.TruncateAt.END;

    /* renamed from: J, reason: collision with root package name */
    private boolean f87967J = true;

    /* renamed from: p0, reason: collision with root package name */
    private int f88015p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    private float f88017q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    private float f88019r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    private int f88021s0 = o.f88087n;

    class a implements C16632a.InterfaceC2462a {
        a() {
        }

        @Override // qe.C16632a.InterfaceC2462a
        public void a(Typeface typeface) {
            b.this.l0(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.b$b, reason: collision with other inner class name */
    class C1280b implements C16632a.InterfaceC2462a {
        C1280b() {
        }

        @Override // qe.C16632a.InterfaceC2462a
        public void a(Typeface typeface) {
            b.this.w0(typeface);
        }
    }

    private static boolean T(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private float Z(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void h(float f10) {
        i(f10, false);
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        return (StaticLayout) o2.i.g(o.b(this.f87964G, this.f87979V, (int) f10).d(this.f87963F).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : M()).f(false).i(i10).h(this.f88017q0, this.f88019r0).e(this.f88021s0).j(null).a());
    }

    private int x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f87977T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void a0() {
        b0(false);
    }

    public void y0(float f10) {
        float fA = C14442a.a(f10, 0.0f, 1.0f);
        if (fA != this.f87986b) {
            this.f87986b = fA;
            c();
        }
    }

    private Layout.Alignment M() {
        int iB = p2.r.b(this.f88002j, this.f87966I ? 1 : 0) & 7;
        return iB != 1 ? iB != 5 ? this.f87966I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f87966I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private boolean O0() {
        if (this.f88015p0 > 1) {
            return (!this.f87966I || this.f87988c) && !this.f87968K;
        }
        return false;
    }

    private void P(TextPaint textPaint) {
        textPaint.setTextSize(this.f88008m);
        textPaint.setTypeface(this.f88025w);
        textPaint.setLetterSpacing(this.f87999h0);
    }

    private void Q(TextPaint textPaint) {
        textPaint.setTextSize(this.f88006l);
        textPaint.setTypeface(this.f88028z);
        textPaint.setLetterSpacing(this.f88001i0);
    }

    private void S(float f10) {
        if (this.f87988c) {
            this.f88000i.set(f10 < this.f87992e ? this.f87996g : this.f87998h);
            return;
        }
        this.f88000i.left = X(this.f87996g.left, this.f87998h.left, f10, this.f87981X);
        this.f88000i.top = X(this.f88016q, this.f88018r, f10, this.f87981X);
        this.f88000i.right = X(this.f87996g.right, this.f87998h.right, f10, this.f87981X);
        this.f88000i.bottom = X(this.f87996g.bottom, this.f87998h.bottom, f10, this.f87981X);
    }

    private boolean U() {
        return ViewCompat.z(this.f87984a) == 1;
    }

    private boolean W(CharSequence charSequence, boolean z10) {
        return (z10 ? m2.t.f150534d : m2.t.f150533c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float X(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return C13661a.a(f10, f11, f12);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.f87965H;
        if (charSequence != null && (staticLayout = this.f88005k0) != null) {
            this.f88013o0 = TextUtils.ellipsize(charSequence, this.f87979V, staticLayout.getWidth(), this.f87963F);
        }
        CharSequence charSequence2 = this.f88013o0;
        float fZ = 0.0f;
        if (charSequence2 != null) {
            this.f88007l0 = Z(this.f87979V, charSequence2);
        } else {
            this.f88007l0 = 0.0f;
        }
        int iB = p2.r.b(this.f88004k, this.f87966I ? 1 : 0);
        int i10 = iB & 112;
        if (i10 == 48) {
            this.f88018r = this.f87998h.top;
        } else if (i10 != 80) {
            this.f88018r = this.f87998h.centerY() - ((this.f87979V.descent() - this.f87979V.ascent()) / 2.0f);
        } else {
            this.f88018r = this.f87998h.bottom + this.f87979V.ascent();
        }
        int i11 = iB & 8388615;
        if (i11 == 1) {
            this.f88022t = this.f87998h.centerX() - (this.f88007l0 / 2.0f);
        } else if (i11 != 5) {
            this.f88022t = this.f87998h.left;
        } else {
            this.f88022t = this.f87998h.right - this.f88007l0;
        }
        i(0.0f, z10);
        float height = this.f88005k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f88005k0;
        if (staticLayout2 == null || this.f88015p0 <= 1) {
            CharSequence charSequence3 = this.f87965H;
            if (charSequence3 != null) {
                fZ = Z(this.f87979V, charSequence3);
            }
        } else {
            fZ = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f88005k0;
        this.f88014p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int iB2 = p2.r.b(this.f88002j, this.f87966I ? 1 : 0);
        int i12 = iB2 & 112;
        if (i12 == 48) {
            this.f88016q = this.f87996g.top;
        } else if (i12 != 80) {
            this.f88016q = this.f87996g.centerY() - (height / 2.0f);
        } else {
            this.f88016q = (this.f87996g.bottom - height) + this.f87979V.descent();
        }
        int i13 = iB2 & 8388615;
        if (i13 == 1) {
            this.f88020s = this.f87996g.centerX() - (fZ / 2.0f);
        } else if (i13 != 5) {
            this.f88020s = this.f87996g.left;
        } else {
            this.f88020s = this.f87996g.right - fZ;
        }
        j();
        C0(this.f87986b);
    }

    private void c() {
        g(this.f87986b);
    }

    private static boolean c0(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private float d(float f10) {
        float f11 = this.f87992e;
        return f10 <= f11 ? C13661a.b(1.0f, 0.0f, this.f87990d, f11, f10) : C13661a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f87990d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private void h0(float f10) {
        this.f88009m0 = f10;
        ViewCompat.d0(this.f87984a);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.f87964G == null) {
            return;
        }
        float fWidth = this.f87998h.width();
        float fWidth2 = this.f87996g.width();
        if (T(f10, 1.0f)) {
            f11 = this.f88008m;
            f12 = this.f87999h0;
            this.f87971N = 1.0f;
            typeface = this.f88025w;
        } else {
            float f13 = this.f88006l;
            float f14 = this.f88001i0;
            Typeface typeface2 = this.f88028z;
            if (T(f10, 0.0f)) {
                this.f87971N = 1.0f;
            } else {
                this.f87971N = X(this.f88006l, this.f88008m, f10, this.f87982Y) / this.f88006l;
            }
            float f15 = this.f88008m / this.f88006l;
            fWidth = (z10 || this.f87988c || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        if (fWidth > 0.0f) {
            boolean z11 = this.f87972O != f11;
            boolean z12 = this.f88003j0 != f12;
            boolean z13 = this.f87960C != typeface;
            StaticLayout staticLayout = this.f88005k0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.f87978U;
            this.f87972O = f11;
            this.f88003j0 = f12;
            this.f87960C = typeface;
            this.f87978U = false;
            this.f87979V.setLinearText(this.f87971N != 1.0f);
            z = z14;
        }
        if (this.f87965H == null || z) {
            this.f87979V.setTextSize(this.f87972O);
            this.f87979V.setTypeface(this.f87960C);
            this.f87979V.setLetterSpacing(this.f88003j0);
            this.f87966I = f(this.f87964G);
            StaticLayout staticLayoutK = k(O0() ? this.f88015p0 : 1, fWidth, this.f87966I);
            this.f88005k0 = staticLayoutK;
            this.f87965H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.f87969L;
        if (bitmap != null) {
            FS.bitmap_recycle(bitmap);
            this.f87969L = null;
        }
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.f87979V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f87988c) {
            this.f87979V.setAlpha((int) (this.f88011n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f87979V;
                textPaint.setShadowLayer(this.f87973P, this.f87974Q, this.f87975R, C15121a.a(this.f87976S, textPaint.getAlpha()));
            }
            this.f88005k0.draw(canvas);
        }
        if (!this.f87988c) {
            this.f87979V.setAlpha((int) (this.f88009m0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f87979V;
            textPaint2.setShadowLayer(this.f87973P, this.f87974Q, this.f87975R, C15121a.a(this.f87976S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f88005k0.getLineBaseline(0);
        CharSequence charSequence = this.f88013o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f87979V);
        if (i10 >= 31) {
            this.f87979V.setShadowLayer(this.f87973P, this.f87974Q, this.f87975R, this.f87976S);
        }
        if (this.f87988c) {
            return;
        }
        String strTrim = this.f88013o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f87979V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f88005k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.f87979V);
    }

    private boolean m0(Typeface typeface) {
        C16632a c16632a = this.f87962E;
        if (c16632a != null) {
            c16632a.c();
        }
        if (this.f88027y == typeface) {
            return false;
        }
        this.f88027y = typeface;
        Typeface typefaceB = C16639h.b(this.f87984a.getContext().getResources().getConfiguration(), typeface);
        this.f88026x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f88027y;
        }
        this.f88025w = typefaceB;
        return true;
    }

    private void n() {
        if (this.f87969L != null || this.f87996g.isEmpty() || TextUtils.isEmpty(this.f87965H)) {
            return;
        }
        g(0.0f);
        int width = this.f88005k0.getWidth();
        int height = this.f88005k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f87969L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f88005k0.draw(new Canvas(this.f87969L));
        if (this.f87970M == null) {
            this.f87970M = new Paint(3);
        }
    }

    private float s(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f88007l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f87966I ? this.f87998h.left : this.f87998h.right - this.f88007l0 : this.f87966I ? this.f87998h.right - this.f88007l0 : this.f87998h.left;
    }

    private void s0(float f10) {
        this.f88011n0 = f10;
        ViewCompat.d0(this.f87984a);
    }

    private float t(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f88007l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f87966I ? rectF.left + this.f88007l0 : this.f87998h.right : this.f87966I ? this.f87998h.right : rectF.left + this.f88007l0;
    }

    private boolean x0(Typeface typeface) {
        C16632a c16632a = this.f87961D;
        if (c16632a != null) {
            c16632a.c();
        }
        if (this.f87959B == typeface) {
            return false;
        }
        this.f87959B = typeface;
        Typeface typefaceB = C16639h.b(this.f87984a.getContext().getResources().getConfiguration(), typeface);
        this.f87958A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f87959B;
        }
        this.f88028z = typefaceB;
        return true;
    }

    private int y() {
        return x(this.f88010n);
    }

    public float A() {
        Q(this.f87980W);
        return (-this.f87980W.ascent()) + this.f87980W.descent();
    }

    public void A0(float f10) {
        this.f87990d = f10;
        this.f87992e = e();
    }

    public int B() {
        return this.f88002j;
    }

    public void B0(int i10) {
        this.f88021s0 = i10;
    }

    public float C() {
        Q(this.f87980W);
        return -this.f87980W.ascent();
    }

    public float D() {
        return this.f88006l;
    }

    public void D0(float f10) {
        this.f88017q0 = f10;
    }

    public Typeface E() {
        Typeface typeface = this.f88028z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void E0(float f10) {
        this.f88019r0 = f10;
    }

    public float F() {
        return this.f87986b;
    }

    public void F0(int i10) {
        if (i10 != this.f88015p0) {
            this.f88015p0 = i10;
            j();
            a0();
        }
    }

    public float G() {
        return this.f87992e;
    }

    public void G0(TimeInterpolator timeInterpolator) {
        this.f87981X = timeInterpolator;
        a0();
    }

    public int H() {
        return this.f88021s0;
    }

    public void H0(boolean z10) {
        this.f87967J = z10;
    }

    public int I() {
        StaticLayout staticLayout = this.f88005k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public final boolean I0(int[] iArr) {
        this.f87977T = iArr;
        if (!V()) {
            return false;
        }
        a0();
        return true;
    }

    public float J() {
        return this.f88005k0.getSpacingAdd();
    }

    public void J0(p pVar) {
        if (pVar != null) {
            b0(true);
        }
    }

    public float K() {
        return this.f88005k0.getSpacingMultiplier();
    }

    public void K0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f87964G, charSequence)) {
            this.f87964G = charSequence;
            this.f87965H = null;
            j();
            a0();
        }
    }

    public int L() {
        return this.f88015p0;
    }

    public void L0(TimeInterpolator timeInterpolator) {
        this.f87982Y = timeInterpolator;
        a0();
    }

    public void M0(TextUtils.TruncateAt truncateAt) {
        this.f87963F = truncateAt;
        a0();
    }

    public TimeInterpolator N() {
        return this.f87981X;
    }

    public CharSequence O() {
        return this.f87964G;
    }

    public TextUtils.TruncateAt R() {
        return this.f87963F;
    }

    public final boolean V() {
        ColorStateList colorStateList = this.f88012o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f88010n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void Y(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f88027y;
            if (typeface != null) {
                this.f88026x = C16639h.b(configuration, typeface);
            }
            Typeface typeface2 = this.f87959B;
            if (typeface2 != null) {
                this.f87958A = C16639h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f88026x;
            if (typeface3 == null) {
                typeface3 = this.f88027y;
            }
            this.f88025w = typeface3;
            Typeface typeface4 = this.f87958A;
            if (typeface4 == null) {
                typeface4 = this.f87959B;
            }
            this.f88028z = typeface4;
            b0(true);
        }
    }

    public void b0(boolean z10) {
        if ((this.f87984a.getHeight() <= 0 || this.f87984a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void d0(ColorStateList colorStateList) {
        if (this.f88012o == colorStateList && this.f88010n == colorStateList) {
            return;
        }
        this.f88012o = colorStateList;
        this.f88010n = colorStateList;
        a0();
    }

    public void e0(int i10, int i11, int i12, int i13) {
        if (c0(this.f87998h, i10, i11, i12, i13)) {
            return;
        }
        this.f87998h.set(i10, i11, i12, i13);
        this.f87978U = true;
    }

    public void f0(Rect rect) {
        e0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g0(int i10) {
        C16635d c16635d = new C16635d(this.f87984a.getContext(), i10);
        if (c16635d.i() != null) {
            this.f88012o = c16635d.i();
        }
        if (c16635d.j() != 0.0f) {
            this.f88008m = c16635d.j();
        }
        ColorStateList colorStateList = c16635d.f158246c;
        if (colorStateList != null) {
            this.f87989c0 = colorStateList;
        }
        this.f87985a0 = c16635d.f158251h;
        this.f87987b0 = c16635d.f158252i;
        this.f87983Z = c16635d.f158253j;
        this.f87999h0 = c16635d.f158255l;
        C16632a c16632a = this.f87962E;
        if (c16632a != null) {
            c16632a.c();
        }
        this.f87962E = new C16632a(new a(), c16635d.e());
        c16635d.h(this.f87984a.getContext(), this.f87962E);
        a0();
    }

    public void i0(ColorStateList colorStateList) {
        if (this.f88012o != colorStateList) {
            this.f88012o = colorStateList;
            a0();
        }
    }

    public void j0(int i10) {
        if (this.f88004k != i10) {
            this.f88004k = i10;
            a0();
        }
    }

    public void k0(float f10) {
        if (this.f88008m != f10) {
            this.f88008m = f10;
            a0();
        }
    }

    public void n0(int i10) {
        this.f87994f = i10;
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f87966I = f(this.f87964G);
        rectF.left = Math.max(s(i10, i11), this.f87998h.left);
        rectF.top = this.f87998h.top;
        rectF.right = Math.min(t(rectF, i10, i11), this.f87998h.right);
        rectF.bottom = this.f87998h.top + r();
    }

    public void o0(int i10, int i11, int i12, int i13) {
        if (c0(this.f87996g, i10, i11, i12, i13)) {
            return;
        }
        this.f87996g.set(i10, i11, i12, i13);
        this.f87978U = true;
    }

    public ColorStateList p() {
        return this.f88012o;
    }

    public void p0(Rect rect) {
        o0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public int q() {
        return this.f88004k;
    }

    public void q0(float f10) {
        if (this.f88001i0 != f10) {
            this.f88001i0 = f10;
            a0();
        }
    }

    public float r() {
        P(this.f87980W);
        return -this.f87980W.ascent();
    }

    public void r0(int i10) {
        C16635d c16635d = new C16635d(this.f87984a.getContext(), i10);
        if (c16635d.i() != null) {
            this.f88010n = c16635d.i();
        }
        if (c16635d.j() != 0.0f) {
            this.f88006l = c16635d.j();
        }
        ColorStateList colorStateList = c16635d.f158246c;
        if (colorStateList != null) {
            this.f87997g0 = colorStateList;
        }
        this.f87993e0 = c16635d.f158251h;
        this.f87995f0 = c16635d.f158252i;
        this.f87991d0 = c16635d.f158253j;
        this.f88001i0 = c16635d.f158255l;
        C16632a c16632a = this.f87961D;
        if (c16632a != null) {
            c16632a.c();
        }
        this.f87961D = new C16632a(new C1280b(), c16635d.e());
        c16635d.h(this.f87984a.getContext(), this.f87961D);
        a0();
    }

    public void t0(ColorStateList colorStateList) {
        if (this.f88010n != colorStateList) {
            this.f88010n = colorStateList;
            a0();
        }
    }

    public float u() {
        return this.f88008m;
    }

    public void u0(int i10) {
        if (this.f88002j != i10) {
            this.f88002j = i10;
            a0();
        }
    }

    public Typeface v() {
        Typeface typeface = this.f88025w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void v0(float f10) {
        if (this.f88006l != f10) {
            this.f88006l = f10;
            a0();
        }
    }

    public int w() {
        return x(this.f88012o);
    }

    public int z() {
        return this.f88014p;
    }

    public void z0(boolean z10) {
        this.f87988c = z10;
    }

    public b(View view) {
        this.f87984a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f87979V = textPaint;
        this.f87980W = new TextPaint(textPaint);
        this.f87998h = new Rect();
        this.f87996g = new Rect();
        this.f88000i = new RectF();
        this.f87992e = e();
        Y(view.getContext().getResources().getConfiguration());
    }

    private void C0(float f10) {
        boolean z10;
        h(f10);
        if (f87956t0 && this.f87971N != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f87968K = z10;
        if (z10) {
            n();
        }
        ViewCompat.d0(this.f87984a);
    }

    private boolean f(CharSequence charSequence) {
        boolean zU = U();
        if (this.f87967J) {
            return W(charSequence, zU);
        }
        return zU;
    }

    private void g(float f10) {
        float f11;
        S(f10);
        if (this.f87988c) {
            if (f10 < this.f87992e) {
                this.f88023u = this.f88020s;
                this.f88024v = this.f88016q;
                C0(0.0f);
                f11 = 0.0f;
            } else {
                this.f88023u = this.f88022t;
                this.f88024v = this.f88018r - Math.max(0, this.f87994f);
                C0(1.0f);
                f11 = 1.0f;
            }
        } else {
            this.f88023u = X(this.f88020s, this.f88022t, f10, this.f87981X);
            this.f88024v = X(this.f88016q, this.f88018r, f10, this.f87981X);
            C0(f10);
            f11 = f10;
        }
        TimeInterpolator timeInterpolator = C13661a.f128351b;
        h0(1.0f - X(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        s0(X(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f88012o != this.f88010n) {
            this.f87979V.setColor(a(y(), w(), f11));
        } else {
            this.f87979V.setColor(w());
        }
        int i10 = Build.VERSION.SDK_INT;
        float f12 = this.f87999h0;
        float f13 = this.f88001i0;
        if (f12 != f13) {
            this.f87979V.setLetterSpacing(X(f13, f12, f10, timeInterpolator));
        } else {
            this.f87979V.setLetterSpacing(f12);
        }
        this.f87973P = X(this.f87991d0, this.f87983Z, f10, null);
        this.f87974Q = X(this.f87993e0, this.f87985a0, f10, null);
        this.f87975R = X(this.f87995f0, this.f87987b0, f10, null);
        int iA = a(x(this.f87997g0), x(this.f87989c0), f10);
        this.f87976S = iA;
        this.f87979V.setShadowLayer(this.f87973P, this.f87974Q, this.f87975R, iA);
        if (this.f87988c) {
            this.f87979V.setAlpha((int) (d(f10) * this.f87979V.getAlpha()));
            if (i10 >= 31) {
                TextPaint textPaint = this.f87979V;
                textPaint.setShadowLayer(this.f87973P, this.f87974Q, this.f87975R, C15121a.a(this.f87976S, textPaint.getAlpha()));
            }
        }
        ViewCompat.d0(this.f87984a);
    }

    public void N0(Typeface typeface) {
        boolean zM0 = m0(typeface);
        boolean zX0 = x0(typeface);
        if (!zM0 && !zX0) {
            return;
        }
        a0();
    }

    public void l(Canvas canvas) {
        boolean z10;
        int iSave = canvas.save();
        if (this.f87965H != null && this.f88000i.width() > 0.0f && this.f88000i.height() > 0.0f) {
            this.f87979V.setTextSize(this.f87972O);
            float f10 = this.f88023u;
            float f11 = this.f88024v;
            if (this.f87968K && this.f87969L != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f12 = this.f87971N;
            if (f12 != 1.0f && !this.f87988c) {
                canvas.scale(f12, f12, f10, f11);
            }
            if (z10) {
                canvas.drawBitmap(this.f87969L, f10, f11, this.f87970M);
                canvas.restoreToCount(iSave);
                return;
            }
            if (O0() && (!this.f87988c || this.f87986b > this.f87992e)) {
                m(canvas, this.f88023u - this.f88005k0.getLineStart(0), f11);
            } else {
                canvas.translate(f10, f11);
                this.f88005k0.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public void l0(Typeface typeface) {
        if (m0(typeface)) {
            a0();
        }
    }

    public void w0(Typeface typeface) {
        if (x0(typeface)) {
            a0();
        }
    }
}
