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
import be.C6230a;
import com.fullstory.FS;
import h2.C14329a;
import ie.C14718a;
import oe.C16024a;
import oe.C16027d;
import oe.C16031h;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f87116t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static final Paint f87117u0 = null;

    /* renamed from: A, reason: collision with root package name */
    private Typeface f87118A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f87119B;

    /* renamed from: C, reason: collision with root package name */
    private Typeface f87120C;

    /* renamed from: D, reason: collision with root package name */
    private C16024a f87121D;

    /* renamed from: E, reason: collision with root package name */
    private C16024a f87122E;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f87124G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f87125H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f87126I;

    /* renamed from: K, reason: collision with root package name */
    private boolean f87128K;

    /* renamed from: L, reason: collision with root package name */
    private Bitmap f87129L;

    /* renamed from: M, reason: collision with root package name */
    private Paint f87130M;

    /* renamed from: N, reason: collision with root package name */
    private float f87131N;

    /* renamed from: O, reason: collision with root package name */
    private float f87132O;

    /* renamed from: P, reason: collision with root package name */
    private float f87133P;

    /* renamed from: Q, reason: collision with root package name */
    private float f87134Q;

    /* renamed from: R, reason: collision with root package name */
    private float f87135R;

    /* renamed from: S, reason: collision with root package name */
    private int f87136S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f87137T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f87138U;

    /* renamed from: V, reason: collision with root package name */
    private final TextPaint f87139V;

    /* renamed from: W, reason: collision with root package name */
    private final TextPaint f87140W;

    /* renamed from: X, reason: collision with root package name */
    private TimeInterpolator f87141X;

    /* renamed from: Y, reason: collision with root package name */
    private TimeInterpolator f87142Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f87143Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f87144a;

    /* renamed from: a0, reason: collision with root package name */
    private float f87145a0;

    /* renamed from: b, reason: collision with root package name */
    private float f87146b;

    /* renamed from: b0, reason: collision with root package name */
    private float f87147b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f87148c;

    /* renamed from: c0, reason: collision with root package name */
    private ColorStateList f87149c0;

    /* renamed from: d, reason: collision with root package name */
    private float f87150d;

    /* renamed from: d0, reason: collision with root package name */
    private float f87151d0;

    /* renamed from: e, reason: collision with root package name */
    private float f87152e;

    /* renamed from: e0, reason: collision with root package name */
    private float f87153e0;

    /* renamed from: f, reason: collision with root package name */
    private int f87154f;

    /* renamed from: f0, reason: collision with root package name */
    private float f87155f0;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f87156g;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f87157g0;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f87158h;

    /* renamed from: h0, reason: collision with root package name */
    private float f87159h0;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f87160i;

    /* renamed from: i0, reason: collision with root package name */
    private float f87161i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f87163j0;

    /* renamed from: k0, reason: collision with root package name */
    private StaticLayout f87165k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f87167l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f87169m0;

    /* renamed from: n, reason: collision with root package name */
    private ColorStateList f87170n;

    /* renamed from: n0, reason: collision with root package name */
    private float f87171n0;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f87172o;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f87173o0;

    /* renamed from: p, reason: collision with root package name */
    private int f87174p;

    /* renamed from: q, reason: collision with root package name */
    private float f87176q;

    /* renamed from: r, reason: collision with root package name */
    private float f87178r;

    /* renamed from: s, reason: collision with root package name */
    private float f87180s;

    /* renamed from: t, reason: collision with root package name */
    private float f87182t;

    /* renamed from: u, reason: collision with root package name */
    private float f87183u;

    /* renamed from: v, reason: collision with root package name */
    private float f87184v;

    /* renamed from: w, reason: collision with root package name */
    private Typeface f87185w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f87186x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f87187y;

    /* renamed from: z, reason: collision with root package name */
    private Typeface f87188z;

    /* renamed from: j, reason: collision with root package name */
    private int f87162j = 16;

    /* renamed from: k, reason: collision with root package name */
    private int f87164k = 16;

    /* renamed from: l, reason: collision with root package name */
    private float f87166l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f87168m = 15.0f;

    /* renamed from: F, reason: collision with root package name */
    private TextUtils.TruncateAt f87123F = TextUtils.TruncateAt.END;

    /* renamed from: J, reason: collision with root package name */
    private boolean f87127J = true;

    /* renamed from: p0, reason: collision with root package name */
    private int f87175p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    private float f87177q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    private float f87179r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    private int f87181s0 = o.f87247n;

    class a implements C16024a.InterfaceC2386a {
        a() {
        }

        @Override // oe.C16024a.InterfaceC2386a
        public void a(Typeface typeface) {
            b.this.l0(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.b$b, reason: collision with other inner class name */
    class C1271b implements C16024a.InterfaceC2386a {
        C1271b() {
        }

        @Override // oe.C16024a.InterfaceC2386a
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
        return (StaticLayout) o2.i.g(o.b(this.f87124G, this.f87139V, (int) f10).d(this.f87123F).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : M()).f(false).i(i10).h(this.f87177q0, this.f87179r0).e(this.f87181s0).j(null).a());
    }

    private int x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f87137T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void a0() {
        b0(false);
    }

    public void y0(float f10) {
        float fA = C14329a.a(f10, 0.0f, 1.0f);
        if (fA != this.f87146b) {
            this.f87146b = fA;
            c();
        }
    }

    private Layout.Alignment M() {
        int iB = p2.r.b(this.f87162j, this.f87126I ? 1 : 0) & 7;
        return iB != 1 ? iB != 5 ? this.f87126I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f87126I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private boolean O0() {
        if (this.f87175p0 > 1) {
            return (!this.f87126I || this.f87148c) && !this.f87128K;
        }
        return false;
    }

    private void P(TextPaint textPaint) {
        textPaint.setTextSize(this.f87168m);
        textPaint.setTypeface(this.f87185w);
        textPaint.setLetterSpacing(this.f87159h0);
    }

    private void Q(TextPaint textPaint) {
        textPaint.setTextSize(this.f87166l);
        textPaint.setTypeface(this.f87188z);
        textPaint.setLetterSpacing(this.f87161i0);
    }

    private void S(float f10) {
        if (this.f87148c) {
            this.f87160i.set(f10 < this.f87152e ? this.f87156g : this.f87158h);
            return;
        }
        this.f87160i.left = X(this.f87156g.left, this.f87158h.left, f10, this.f87141X);
        this.f87160i.top = X(this.f87176q, this.f87178r, f10, this.f87141X);
        this.f87160i.right = X(this.f87156g.right, this.f87158h.right, f10, this.f87141X);
        this.f87160i.bottom = X(this.f87156g.bottom, this.f87158h.bottom, f10, this.f87141X);
    }

    private boolean U() {
        return ViewCompat.z(this.f87144a) == 1;
    }

    private boolean W(CharSequence charSequence, boolean z10) {
        return (z10 ? m2.t.f149792d : m2.t.f149791c).isRtl(charSequence, 0, charSequence.length());
    }

    private static float X(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return C6230a.a(f10, f11, f12);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.f87125H;
        if (charSequence != null && (staticLayout = this.f87165k0) != null) {
            this.f87173o0 = TextUtils.ellipsize(charSequence, this.f87139V, staticLayout.getWidth(), this.f87123F);
        }
        CharSequence charSequence2 = this.f87173o0;
        float fZ = 0.0f;
        if (charSequence2 != null) {
            this.f87167l0 = Z(this.f87139V, charSequence2);
        } else {
            this.f87167l0 = 0.0f;
        }
        int iB = p2.r.b(this.f87164k, this.f87126I ? 1 : 0);
        int i10 = iB & 112;
        if (i10 == 48) {
            this.f87178r = this.f87158h.top;
        } else if (i10 != 80) {
            this.f87178r = this.f87158h.centerY() - ((this.f87139V.descent() - this.f87139V.ascent()) / 2.0f);
        } else {
            this.f87178r = this.f87158h.bottom + this.f87139V.ascent();
        }
        int i11 = iB & 8388615;
        if (i11 == 1) {
            this.f87182t = this.f87158h.centerX() - (this.f87167l0 / 2.0f);
        } else if (i11 != 5) {
            this.f87182t = this.f87158h.left;
        } else {
            this.f87182t = this.f87158h.right - this.f87167l0;
        }
        i(0.0f, z10);
        float height = this.f87165k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f87165k0;
        if (staticLayout2 == null || this.f87175p0 <= 1) {
            CharSequence charSequence3 = this.f87125H;
            if (charSequence3 != null) {
                fZ = Z(this.f87139V, charSequence3);
            }
        } else {
            fZ = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f87165k0;
        this.f87174p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int iB2 = p2.r.b(this.f87162j, this.f87126I ? 1 : 0);
        int i12 = iB2 & 112;
        if (i12 == 48) {
            this.f87176q = this.f87156g.top;
        } else if (i12 != 80) {
            this.f87176q = this.f87156g.centerY() - (height / 2.0f);
        } else {
            this.f87176q = (this.f87156g.bottom - height) + this.f87139V.descent();
        }
        int i13 = iB2 & 8388615;
        if (i13 == 1) {
            this.f87180s = this.f87156g.centerX() - (fZ / 2.0f);
        } else if (i13 != 5) {
            this.f87180s = this.f87156g.left;
        } else {
            this.f87180s = this.f87156g.right - fZ;
        }
        j();
        C0(this.f87146b);
    }

    private void c() {
        g(this.f87146b);
    }

    private static boolean c0(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private float d(float f10) {
        float f11 = this.f87152e;
        return f10 <= f11 ? C6230a.b(1.0f, 0.0f, this.f87150d, f11, f10) : C6230a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f87150d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private void h0(float f10) {
        this.f87169m0 = f10;
        ViewCompat.d0(this.f87144a);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.f87124G == null) {
            return;
        }
        float fWidth = this.f87158h.width();
        float fWidth2 = this.f87156g.width();
        if (T(f10, 1.0f)) {
            f11 = this.f87168m;
            f12 = this.f87159h0;
            this.f87131N = 1.0f;
            typeface = this.f87185w;
        } else {
            float f13 = this.f87166l;
            float f14 = this.f87161i0;
            Typeface typeface2 = this.f87188z;
            if (T(f10, 0.0f)) {
                this.f87131N = 1.0f;
            } else {
                this.f87131N = X(this.f87166l, this.f87168m, f10, this.f87142Y) / this.f87166l;
            }
            float f15 = this.f87168m / this.f87166l;
            fWidth = (z10 || this.f87148c || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        if (fWidth > 0.0f) {
            boolean z11 = this.f87132O != f11;
            boolean z12 = this.f87163j0 != f12;
            boolean z13 = this.f87120C != typeface;
            StaticLayout staticLayout = this.f87165k0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.f87138U;
            this.f87132O = f11;
            this.f87163j0 = f12;
            this.f87120C = typeface;
            this.f87138U = false;
            this.f87139V.setLinearText(this.f87131N != 1.0f);
            z = z14;
        }
        if (this.f87125H == null || z) {
            this.f87139V.setTextSize(this.f87132O);
            this.f87139V.setTypeface(this.f87120C);
            this.f87139V.setLetterSpacing(this.f87163j0);
            this.f87126I = f(this.f87124G);
            StaticLayout staticLayoutK = k(O0() ? this.f87175p0 : 1, fWidth, this.f87126I);
            this.f87165k0 = staticLayoutK;
            this.f87125H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.f87129L;
        if (bitmap != null) {
            FS.bitmap_recycle(bitmap);
            this.f87129L = null;
        }
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.f87139V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f87148c) {
            this.f87139V.setAlpha((int) (this.f87171n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f87139V;
                textPaint.setShadowLayer(this.f87133P, this.f87134Q, this.f87135R, C14718a.a(this.f87136S, textPaint.getAlpha()));
            }
            this.f87165k0.draw(canvas);
        }
        if (!this.f87148c) {
            this.f87139V.setAlpha((int) (this.f87169m0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f87139V;
            textPaint2.setShadowLayer(this.f87133P, this.f87134Q, this.f87135R, C14718a.a(this.f87136S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f87165k0.getLineBaseline(0);
        CharSequence charSequence = this.f87173o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f87139V);
        if (i10 >= 31) {
            this.f87139V.setShadowLayer(this.f87133P, this.f87134Q, this.f87135R, this.f87136S);
        }
        if (this.f87148c) {
            return;
        }
        String strTrim = this.f87173o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f87139V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f87165k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.f87139V);
    }

    private boolean m0(Typeface typeface) {
        C16024a c16024a = this.f87122E;
        if (c16024a != null) {
            c16024a.c();
        }
        if (this.f87187y == typeface) {
            return false;
        }
        this.f87187y = typeface;
        Typeface typefaceB = C16031h.b(this.f87144a.getContext().getResources().getConfiguration(), typeface);
        this.f87186x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f87187y;
        }
        this.f87185w = typefaceB;
        return true;
    }

    private void n() {
        if (this.f87129L != null || this.f87156g.isEmpty() || TextUtils.isEmpty(this.f87125H)) {
            return;
        }
        g(0.0f);
        int width = this.f87165k0.getWidth();
        int height = this.f87165k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f87129L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f87165k0.draw(new Canvas(this.f87129L));
        if (this.f87130M == null) {
            this.f87130M = new Paint(3);
        }
    }

    private float s(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f87167l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f87126I ? this.f87158h.left : this.f87158h.right - this.f87167l0 : this.f87126I ? this.f87158h.right - this.f87167l0 : this.f87158h.left;
    }

    private void s0(float f10) {
        this.f87171n0 = f10;
        ViewCompat.d0(this.f87144a);
    }

    private float t(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f87167l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f87126I ? rectF.left + this.f87167l0 : this.f87158h.right : this.f87126I ? this.f87158h.right : rectF.left + this.f87167l0;
    }

    private boolean x0(Typeface typeface) {
        C16024a c16024a = this.f87121D;
        if (c16024a != null) {
            c16024a.c();
        }
        if (this.f87119B == typeface) {
            return false;
        }
        this.f87119B = typeface;
        Typeface typefaceB = C16031h.b(this.f87144a.getContext().getResources().getConfiguration(), typeface);
        this.f87118A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f87119B;
        }
        this.f87188z = typefaceB;
        return true;
    }

    private int y() {
        return x(this.f87170n);
    }

    public float A() {
        Q(this.f87140W);
        return (-this.f87140W.ascent()) + this.f87140W.descent();
    }

    public void A0(float f10) {
        this.f87150d = f10;
        this.f87152e = e();
    }

    public int B() {
        return this.f87162j;
    }

    public void B0(int i10) {
        this.f87181s0 = i10;
    }

    public float C() {
        Q(this.f87140W);
        return -this.f87140W.ascent();
    }

    public float D() {
        return this.f87166l;
    }

    public void D0(float f10) {
        this.f87177q0 = f10;
    }

    public Typeface E() {
        Typeface typeface = this.f87188z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void E0(float f10) {
        this.f87179r0 = f10;
    }

    public float F() {
        return this.f87146b;
    }

    public void F0(int i10) {
        if (i10 != this.f87175p0) {
            this.f87175p0 = i10;
            j();
            a0();
        }
    }

    public float G() {
        return this.f87152e;
    }

    public void G0(TimeInterpolator timeInterpolator) {
        this.f87141X = timeInterpolator;
        a0();
    }

    public int H() {
        return this.f87181s0;
    }

    public void H0(boolean z10) {
        this.f87127J = z10;
    }

    public int I() {
        StaticLayout staticLayout = this.f87165k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public final boolean I0(int[] iArr) {
        this.f87137T = iArr;
        if (!V()) {
            return false;
        }
        a0();
        return true;
    }

    public float J() {
        return this.f87165k0.getSpacingAdd();
    }

    public void J0(p pVar) {
        if (pVar != null) {
            b0(true);
        }
    }

    public float K() {
        return this.f87165k0.getSpacingMultiplier();
    }

    public void K0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f87124G, charSequence)) {
            this.f87124G = charSequence;
            this.f87125H = null;
            j();
            a0();
        }
    }

    public int L() {
        return this.f87175p0;
    }

    public void L0(TimeInterpolator timeInterpolator) {
        this.f87142Y = timeInterpolator;
        a0();
    }

    public void M0(TextUtils.TruncateAt truncateAt) {
        this.f87123F = truncateAt;
        a0();
    }

    public TimeInterpolator N() {
        return this.f87141X;
    }

    public CharSequence O() {
        return this.f87124G;
    }

    public TextUtils.TruncateAt R() {
        return this.f87123F;
    }

    public final boolean V() {
        ColorStateList colorStateList = this.f87172o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f87170n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void Y(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f87187y;
            if (typeface != null) {
                this.f87186x = C16031h.b(configuration, typeface);
            }
            Typeface typeface2 = this.f87119B;
            if (typeface2 != null) {
                this.f87118A = C16031h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f87186x;
            if (typeface3 == null) {
                typeface3 = this.f87187y;
            }
            this.f87185w = typeface3;
            Typeface typeface4 = this.f87118A;
            if (typeface4 == null) {
                typeface4 = this.f87119B;
            }
            this.f87188z = typeface4;
            b0(true);
        }
    }

    public void b0(boolean z10) {
        if ((this.f87144a.getHeight() <= 0 || this.f87144a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void d0(ColorStateList colorStateList) {
        if (this.f87172o == colorStateList && this.f87170n == colorStateList) {
            return;
        }
        this.f87172o = colorStateList;
        this.f87170n = colorStateList;
        a0();
    }

    public void e0(int i10, int i11, int i12, int i13) {
        if (c0(this.f87158h, i10, i11, i12, i13)) {
            return;
        }
        this.f87158h.set(i10, i11, i12, i13);
        this.f87138U = true;
    }

    public void f0(Rect rect) {
        e0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g0(int i10) {
        C16027d c16027d = new C16027d(this.f87144a.getContext(), i10);
        if (c16027d.i() != null) {
            this.f87172o = c16027d.i();
        }
        if (c16027d.j() != 0.0f) {
            this.f87168m = c16027d.j();
        }
        ColorStateList colorStateList = c16027d.f153394c;
        if (colorStateList != null) {
            this.f87149c0 = colorStateList;
        }
        this.f87145a0 = c16027d.f153399h;
        this.f87147b0 = c16027d.f153400i;
        this.f87143Z = c16027d.f153401j;
        this.f87159h0 = c16027d.f153403l;
        C16024a c16024a = this.f87122E;
        if (c16024a != null) {
            c16024a.c();
        }
        this.f87122E = new C16024a(new a(), c16027d.e());
        c16027d.h(this.f87144a.getContext(), this.f87122E);
        a0();
    }

    public void i0(ColorStateList colorStateList) {
        if (this.f87172o != colorStateList) {
            this.f87172o = colorStateList;
            a0();
        }
    }

    public void j0(int i10) {
        if (this.f87164k != i10) {
            this.f87164k = i10;
            a0();
        }
    }

    public void k0(float f10) {
        if (this.f87168m != f10) {
            this.f87168m = f10;
            a0();
        }
    }

    public void n0(int i10) {
        this.f87154f = i10;
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f87126I = f(this.f87124G);
        rectF.left = Math.max(s(i10, i11), this.f87158h.left);
        rectF.top = this.f87158h.top;
        rectF.right = Math.min(t(rectF, i10, i11), this.f87158h.right);
        rectF.bottom = this.f87158h.top + r();
    }

    public void o0(int i10, int i11, int i12, int i13) {
        if (c0(this.f87156g, i10, i11, i12, i13)) {
            return;
        }
        this.f87156g.set(i10, i11, i12, i13);
        this.f87138U = true;
    }

    public ColorStateList p() {
        return this.f87172o;
    }

    public void p0(Rect rect) {
        o0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public int q() {
        return this.f87164k;
    }

    public void q0(float f10) {
        if (this.f87161i0 != f10) {
            this.f87161i0 = f10;
            a0();
        }
    }

    public float r() {
        P(this.f87140W);
        return -this.f87140W.ascent();
    }

    public void r0(int i10) {
        C16027d c16027d = new C16027d(this.f87144a.getContext(), i10);
        if (c16027d.i() != null) {
            this.f87170n = c16027d.i();
        }
        if (c16027d.j() != 0.0f) {
            this.f87166l = c16027d.j();
        }
        ColorStateList colorStateList = c16027d.f153394c;
        if (colorStateList != null) {
            this.f87157g0 = colorStateList;
        }
        this.f87153e0 = c16027d.f153399h;
        this.f87155f0 = c16027d.f153400i;
        this.f87151d0 = c16027d.f153401j;
        this.f87161i0 = c16027d.f153403l;
        C16024a c16024a = this.f87121D;
        if (c16024a != null) {
            c16024a.c();
        }
        this.f87121D = new C16024a(new C1271b(), c16027d.e());
        c16027d.h(this.f87144a.getContext(), this.f87121D);
        a0();
    }

    public void t0(ColorStateList colorStateList) {
        if (this.f87170n != colorStateList) {
            this.f87170n = colorStateList;
            a0();
        }
    }

    public float u() {
        return this.f87168m;
    }

    public void u0(int i10) {
        if (this.f87162j != i10) {
            this.f87162j = i10;
            a0();
        }
    }

    public Typeface v() {
        Typeface typeface = this.f87185w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void v0(float f10) {
        if (this.f87166l != f10) {
            this.f87166l = f10;
            a0();
        }
    }

    public int w() {
        return x(this.f87172o);
    }

    public int z() {
        return this.f87174p;
    }

    public void z0(boolean z10) {
        this.f87148c = z10;
    }

    public b(View view) {
        this.f87144a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f87139V = textPaint;
        this.f87140W = new TextPaint(textPaint);
        this.f87158h = new Rect();
        this.f87156g = new Rect();
        this.f87160i = new RectF();
        this.f87152e = e();
        Y(view.getContext().getResources().getConfiguration());
    }

    private void C0(float f10) {
        boolean z10;
        h(f10);
        if (f87116t0 && this.f87131N != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f87128K = z10;
        if (z10) {
            n();
        }
        ViewCompat.d0(this.f87144a);
    }

    private boolean f(CharSequence charSequence) {
        boolean zU = U();
        if (this.f87127J) {
            return W(charSequence, zU);
        }
        return zU;
    }

    private void g(float f10) {
        float f11;
        S(f10);
        if (this.f87148c) {
            if (f10 < this.f87152e) {
                this.f87183u = this.f87180s;
                this.f87184v = this.f87176q;
                C0(0.0f);
                f11 = 0.0f;
            } else {
                this.f87183u = this.f87182t;
                this.f87184v = this.f87178r - Math.max(0, this.f87154f);
                C0(1.0f);
                f11 = 1.0f;
            }
        } else {
            this.f87183u = X(this.f87180s, this.f87182t, f10, this.f87141X);
            this.f87184v = X(this.f87176q, this.f87178r, f10, this.f87141X);
            C0(f10);
            f11 = f10;
        }
        TimeInterpolator timeInterpolator = C6230a.f60116b;
        h0(1.0f - X(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        s0(X(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f87172o != this.f87170n) {
            this.f87139V.setColor(a(y(), w(), f11));
        } else {
            this.f87139V.setColor(w());
        }
        int i10 = Build.VERSION.SDK_INT;
        float f12 = this.f87159h0;
        float f13 = this.f87161i0;
        if (f12 != f13) {
            this.f87139V.setLetterSpacing(X(f13, f12, f10, timeInterpolator));
        } else {
            this.f87139V.setLetterSpacing(f12);
        }
        this.f87133P = X(this.f87151d0, this.f87143Z, f10, null);
        this.f87134Q = X(this.f87153e0, this.f87145a0, f10, null);
        this.f87135R = X(this.f87155f0, this.f87147b0, f10, null);
        int iA = a(x(this.f87157g0), x(this.f87149c0), f10);
        this.f87136S = iA;
        this.f87139V.setShadowLayer(this.f87133P, this.f87134Q, this.f87135R, iA);
        if (this.f87148c) {
            this.f87139V.setAlpha((int) (d(f10) * this.f87139V.getAlpha()));
            if (i10 >= 31) {
                TextPaint textPaint = this.f87139V;
                textPaint.setShadowLayer(this.f87133P, this.f87134Q, this.f87135R, C14718a.a(this.f87136S, textPaint.getAlpha()));
            }
        }
        ViewCompat.d0(this.f87144a);
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
        if (this.f87125H != null && this.f87160i.width() > 0.0f && this.f87160i.height() > 0.0f) {
            this.f87139V.setTextSize(this.f87132O);
            float f10 = this.f87183u;
            float f11 = this.f87184v;
            if (this.f87128K && this.f87129L != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f12 = this.f87131N;
            if (f12 != 1.0f && !this.f87148c) {
                canvas.scale(f12, f12, f10, f11);
            }
            if (z10) {
                canvas.drawBitmap(this.f87129L, f10, f11, this.f87130M);
                canvas.restoreToCount(iSave);
                return;
            }
            if (O0() && (!this.f87148c || this.f87146b > this.f87152e)) {
                m(canvas, this.f87183u - this.f87165k0.getLineStart(0), f11);
            } else {
                canvas.translate(f10, f11);
                this.f87165k0.draw(canvas);
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
