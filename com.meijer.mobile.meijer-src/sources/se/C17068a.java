package se;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import c2.c;

/* renamed from: se.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17068a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f160311i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f160312j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f160313k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f160314l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f160315a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f160316b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f160317c;

    /* renamed from: d, reason: collision with root package name */
    private int f160318d;

    /* renamed from: e, reason: collision with root package name */
    private int f160319e;

    /* renamed from: f, reason: collision with root package name */
    private int f160320f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f160321g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f160322h;

    public C17068a() {
        this(-16777216);
    }

    public C17068a(int i10) {
        this.f160321g = new Path();
        Paint paint = new Paint();
        this.f160322h = paint;
        this.f160315a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f160316b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f160317c = new Paint(paint2);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f160321g;
        if (z10) {
            int[] iArr = f160313k;
            iArr[0] = 0;
            iArr[1] = this.f160320f;
            iArr[2] = this.f160319e;
            iArr[3] = this.f160318d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f160313k;
            iArr2[0] = 0;
            iArr2[1] = this.f160318d;
            iArr2[2] = this.f160319e;
            iArr2[3] = this.f160320f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f160314l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f160316b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f160313k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f160322h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f160316b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f160311i;
        iArr[0] = this.f160320f;
        iArr[1] = this.f160319e;
        iArr[2] = this.f160318d;
        Paint paint = this.f160317c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f160312j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f160317c);
        canvas.restore();
    }

    public Paint c() {
        return this.f160315a;
    }

    public void d(int i10) {
        this.f160318d = c.k(i10, 68);
        this.f160319e = c.k(i10, 20);
        this.f160320f = c.k(i10, 0);
        this.f160315a.setColor(this.f160318d);
    }
}
