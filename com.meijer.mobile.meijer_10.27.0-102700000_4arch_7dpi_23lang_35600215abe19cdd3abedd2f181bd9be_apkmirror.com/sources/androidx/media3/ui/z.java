package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import c3.C6350a;
import d3.C13466a;
import h4.C14351a;
import java.util.Objects;

/* loaded from: classes4.dex */
final class z {

    /* renamed from: A, reason: collision with root package name */
    private int f57620A;

    /* renamed from: B, reason: collision with root package name */
    private int f57621B;

    /* renamed from: C, reason: collision with root package name */
    private int f57622C;

    /* renamed from: D, reason: collision with root package name */
    private int f57623D;

    /* renamed from: E, reason: collision with root package name */
    private StaticLayout f57624E;

    /* renamed from: F, reason: collision with root package name */
    private StaticLayout f57625F;

    /* renamed from: G, reason: collision with root package name */
    private int f57626G;

    /* renamed from: H, reason: collision with root package name */
    private int f57627H;

    /* renamed from: I, reason: collision with root package name */
    private int f57628I;

    /* renamed from: J, reason: collision with root package name */
    private Rect f57629J;

    /* renamed from: a, reason: collision with root package name */
    private final float f57630a;

    /* renamed from: b, reason: collision with root package name */
    private final float f57631b;

    /* renamed from: c, reason: collision with root package name */
    private final float f57632c;

    /* renamed from: d, reason: collision with root package name */
    private final float f57633d;

    /* renamed from: e, reason: collision with root package name */
    private final float f57634e;

    /* renamed from: f, reason: collision with root package name */
    private final TextPaint f57635f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f57636g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f57637h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f57638i;

    /* renamed from: j, reason: collision with root package name */
    private Layout.Alignment f57639j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f57640k;

    /* renamed from: l, reason: collision with root package name */
    private float f57641l;

    /* renamed from: m, reason: collision with root package name */
    private int f57642m;

    /* renamed from: n, reason: collision with root package name */
    private int f57643n;

    /* renamed from: o, reason: collision with root package name */
    private float f57644o;

    /* renamed from: p, reason: collision with root package name */
    private int f57645p;

    /* renamed from: q, reason: collision with root package name */
    private float f57646q;

    /* renamed from: r, reason: collision with root package name */
    private float f57647r;

    /* renamed from: s, reason: collision with root package name */
    private int f57648s;

    /* renamed from: t, reason: collision with root package name */
    private int f57649t;

    /* renamed from: u, reason: collision with root package name */
    private int f57650u;

    /* renamed from: v, reason: collision with root package name */
    private int f57651v;

    /* renamed from: w, reason: collision with root package name */
    private int f57652w;

    /* renamed from: x, reason: collision with root package name */
    private float f57653x;

    /* renamed from: y, reason: collision with root package name */
    private float f57654y;

    /* renamed from: z, reason: collision with root package name */
    private float f57655z;

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f57640k, (Rect) null, this.f57629J, this.f57637h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        C13466a.e(this.f57629J);
        C13466a.e(this.f57640k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.f57624E;
        StaticLayout staticLayout2 = this.f57625F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f57626G, this.f57627H);
        if (Color.alpha(this.f57650u) > 0) {
            this.f57636g.setColor(this.f57650u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f57628I, 0.0f, staticLayout.getWidth() + this.f57628I, staticLayout.getHeight(), this.f57636g);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f57652w;
        if (i10 == 1) {
            this.f57635f.setStrokeJoin(Paint.Join.ROUND);
            this.f57635f.setStrokeWidth(this.f57630a);
            this.f57635f.setColor(this.f57651v);
            this.f57635f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f57635f;
            float f10 = this.f57631b;
            float f11 = this.f57632c;
            textPaint.setShadowLayer(f10, f11, f11, this.f57651v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f57651v;
            int i12 = z10 ? this.f57651v : -1;
            float f12 = this.f57631b / 2.0f;
            this.f57635f.setColor(this.f57648s);
            this.f57635f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f57635f.setShadowLayer(this.f57631b, f13, f13, i11);
            staticLayout2.draw(canvas2);
            this.f57635f.setShadowLayer(this.f57631b, f12, f12, i12);
        }
        this.f57635f.setColor(this.f57648s);
        this.f57635f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f57635f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f57640k
            int r1 = r7.f57622C
            int r2 = r7.f57620A
            int r1 = r1 - r2
            int r3 = r7.f57623D
            int r4 = r7.f57621B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f57644o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f57641l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f57646q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f57647r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f57645p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f57643n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f57629J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.z.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.z.g():void");
    }

    public void b(C6350a c6350a, C14351a c14351a, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = c6350a.f61394d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(c6350a.f61391a)) {
            return;
        } else {
            i14 = c6350a.f61402l ? c6350a.f61403m : c14351a.f134353c;
        }
        if (a(this.f57638i, c6350a.f61391a) && Objects.equals(this.f57639j, c6350a.f61392b) && this.f57640k == c6350a.f61394d && this.f57641l == c6350a.f61395e && this.f57642m == c6350a.f61396f && Integer.valueOf(this.f57643n).equals(Integer.valueOf(c6350a.f61397g)) && this.f57644o == c6350a.f61398h && Integer.valueOf(this.f57645p).equals(Integer.valueOf(c6350a.f61399i)) && this.f57646q == c6350a.f61400j && this.f57647r == c6350a.f61401k && this.f57648s == c14351a.f134351a && this.f57649t == c14351a.f134352b && this.f57650u == i14 && this.f57652w == c14351a.f134354d && this.f57651v == c14351a.f134355e && Objects.equals(this.f57635f.getTypeface(), c14351a.f134356f) && this.f57653x == f10 && this.f57654y == f11 && this.f57655z == f12 && this.f57620A == i10 && this.f57621B == i11 && this.f57622C == i12 && this.f57623D == i13) {
            d(canvas, z10);
            return;
        }
        this.f57638i = c6350a.f61391a;
        this.f57639j = c6350a.f61392b;
        this.f57640k = c6350a.f61394d;
        this.f57641l = c6350a.f61395e;
        this.f57642m = c6350a.f61396f;
        this.f57643n = c6350a.f61397g;
        this.f57644o = c6350a.f61398h;
        this.f57645p = c6350a.f61399i;
        this.f57646q = c6350a.f61400j;
        this.f57647r = c6350a.f61401k;
        this.f57648s = c14351a.f134351a;
        this.f57649t = c14351a.f134352b;
        this.f57650u = i14;
        this.f57652w = c14351a.f134354d;
        this.f57651v = c14351a.f134355e;
        this.f57635f.setTypeface(c14351a.f134356f);
        this.f57653x = f10;
        this.f57654y = f11;
        this.f57655z = f12;
        this.f57620A = i10;
        this.f57621B = i11;
        this.f57622C = i12;
        this.f57623D = i13;
        if (z10) {
            C13466a.e(this.f57638i);
            g();
        } else {
            C13466a.e(this.f57640k);
            f();
        }
        d(canvas, z10);
    }

    public z(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f57634e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f57633d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f57630a = fRound;
        this.f57631b = fRound;
        this.f57632c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f57635f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f57636g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f57637h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }
}
