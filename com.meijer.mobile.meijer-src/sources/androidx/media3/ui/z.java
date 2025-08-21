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
import c3.C6476a;
import d3.C13599a;
import h4.C14462a;
import java.util.Objects;

/* loaded from: classes4.dex */
final class z {

    /* renamed from: A, reason: collision with root package name */
    private int f57844A;

    /* renamed from: B, reason: collision with root package name */
    private int f57845B;

    /* renamed from: C, reason: collision with root package name */
    private int f57846C;

    /* renamed from: D, reason: collision with root package name */
    private int f57847D;

    /* renamed from: E, reason: collision with root package name */
    private StaticLayout f57848E;

    /* renamed from: F, reason: collision with root package name */
    private StaticLayout f57849F;

    /* renamed from: G, reason: collision with root package name */
    private int f57850G;

    /* renamed from: H, reason: collision with root package name */
    private int f57851H;

    /* renamed from: I, reason: collision with root package name */
    private int f57852I;

    /* renamed from: J, reason: collision with root package name */
    private Rect f57853J;

    /* renamed from: a, reason: collision with root package name */
    private final float f57854a;

    /* renamed from: b, reason: collision with root package name */
    private final float f57855b;

    /* renamed from: c, reason: collision with root package name */
    private final float f57856c;

    /* renamed from: d, reason: collision with root package name */
    private final float f57857d;

    /* renamed from: e, reason: collision with root package name */
    private final float f57858e;

    /* renamed from: f, reason: collision with root package name */
    private final TextPaint f57859f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f57860g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f57861h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f57862i;

    /* renamed from: j, reason: collision with root package name */
    private Layout.Alignment f57863j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f57864k;

    /* renamed from: l, reason: collision with root package name */
    private float f57865l;

    /* renamed from: m, reason: collision with root package name */
    private int f57866m;

    /* renamed from: n, reason: collision with root package name */
    private int f57867n;

    /* renamed from: o, reason: collision with root package name */
    private float f57868o;

    /* renamed from: p, reason: collision with root package name */
    private int f57869p;

    /* renamed from: q, reason: collision with root package name */
    private float f57870q;

    /* renamed from: r, reason: collision with root package name */
    private float f57871r;

    /* renamed from: s, reason: collision with root package name */
    private int f57872s;

    /* renamed from: t, reason: collision with root package name */
    private int f57873t;

    /* renamed from: u, reason: collision with root package name */
    private int f57874u;

    /* renamed from: v, reason: collision with root package name */
    private int f57875v;

    /* renamed from: w, reason: collision with root package name */
    private int f57876w;

    /* renamed from: x, reason: collision with root package name */
    private float f57877x;

    /* renamed from: y, reason: collision with root package name */
    private float f57878y;

    /* renamed from: z, reason: collision with root package name */
    private float f57879z;

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f57864k, (Rect) null, this.f57853J, this.f57861h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        C13599a.e(this.f57853J);
        C13599a.e(this.f57864k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.f57848E;
        StaticLayout staticLayout2 = this.f57849F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f57850G, this.f57851H);
        if (Color.alpha(this.f57874u) > 0) {
            this.f57860g.setColor(this.f57874u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f57852I, 0.0f, staticLayout.getWidth() + this.f57852I, staticLayout.getHeight(), this.f57860g);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f57876w;
        if (i10 == 1) {
            this.f57859f.setStrokeJoin(Paint.Join.ROUND);
            this.f57859f.setStrokeWidth(this.f57854a);
            this.f57859f.setColor(this.f57875v);
            this.f57859f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f57859f;
            float f10 = this.f57855b;
            float f11 = this.f57856c;
            textPaint.setShadowLayer(f10, f11, f11, this.f57875v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f57875v;
            int i12 = z10 ? this.f57875v : -1;
            float f12 = this.f57855b / 2.0f;
            this.f57859f.setColor(this.f57872s);
            this.f57859f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f57859f.setShadowLayer(this.f57855b, f13, f13, i11);
            staticLayout2.draw(canvas2);
            this.f57859f.setShadowLayer(this.f57855b, f12, f12, i12);
        }
        this.f57859f.setColor(this.f57872s);
        this.f57859f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.f57859f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
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
            android.graphics.Bitmap r0 = r7.f57864k
            int r1 = r7.f57846C
            int r2 = r7.f57844A
            int r1 = r1 - r2
            int r3 = r7.f57847D
            int r4 = r7.f57845B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f57868o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f57865l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f57870q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f57871r
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
            int r3 = r7.f57869p
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
            int r3 = r7.f57867n
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
            r7.f57853J = r4
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

    public void b(C6476a c6476a, C14462a c14462a, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10 = c6476a.f61193d == null;
        if (!z10) {
            i14 = -16777216;
        } else if (TextUtils.isEmpty(c6476a.f61190a)) {
            return;
        } else {
            i14 = c6476a.f61201l ? c6476a.f61202m : c14462a.f134824c;
        }
        if (a(this.f57862i, c6476a.f61190a) && Objects.equals(this.f57863j, c6476a.f61191b) && this.f57864k == c6476a.f61193d && this.f57865l == c6476a.f61194e && this.f57866m == c6476a.f61195f && Integer.valueOf(this.f57867n).equals(Integer.valueOf(c6476a.f61196g)) && this.f57868o == c6476a.f61197h && Integer.valueOf(this.f57869p).equals(Integer.valueOf(c6476a.f61198i)) && this.f57870q == c6476a.f61199j && this.f57871r == c6476a.f61200k && this.f57872s == c14462a.f134822a && this.f57873t == c14462a.f134823b && this.f57874u == i14 && this.f57876w == c14462a.f134825d && this.f57875v == c14462a.f134826e && Objects.equals(this.f57859f.getTypeface(), c14462a.f134827f) && this.f57877x == f10 && this.f57878y == f11 && this.f57879z == f12 && this.f57844A == i10 && this.f57845B == i11 && this.f57846C == i12 && this.f57847D == i13) {
            d(canvas, z10);
            return;
        }
        this.f57862i = c6476a.f61190a;
        this.f57863j = c6476a.f61191b;
        this.f57864k = c6476a.f61193d;
        this.f57865l = c6476a.f61194e;
        this.f57866m = c6476a.f61195f;
        this.f57867n = c6476a.f61196g;
        this.f57868o = c6476a.f61197h;
        this.f57869p = c6476a.f61198i;
        this.f57870q = c6476a.f61199j;
        this.f57871r = c6476a.f61200k;
        this.f57872s = c14462a.f134822a;
        this.f57873t = c14462a.f134823b;
        this.f57874u = i14;
        this.f57876w = c14462a.f134825d;
        this.f57875v = c14462a.f134826e;
        this.f57859f.setTypeface(c14462a.f134827f);
        this.f57877x = f10;
        this.f57878y = f11;
        this.f57879z = f12;
        this.f57844A = i10;
        this.f57845B = i11;
        this.f57846C = i12;
        this.f57847D = i13;
        if (z10) {
            C13599a.e(this.f57862i);
            g();
        } else {
            C13599a.e(this.f57864k);
            f();
        }
        d(canvas, z10);
    }

    public z(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f57858e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f57857d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f57854a = fRound;
        this.f57855b = fRound;
        this.f57856c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f57859f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f57860g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f57861h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }
}
