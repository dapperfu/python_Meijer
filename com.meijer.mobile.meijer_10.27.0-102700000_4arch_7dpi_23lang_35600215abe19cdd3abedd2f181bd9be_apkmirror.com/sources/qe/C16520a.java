package qe;

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

/* renamed from: qe.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16520a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f157196i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f157197j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f157198k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f157199l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f157200a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f157201b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f157202c;

    /* renamed from: d, reason: collision with root package name */
    private int f157203d;

    /* renamed from: e, reason: collision with root package name */
    private int f157204e;

    /* renamed from: f, reason: collision with root package name */
    private int f157205f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f157206g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f157207h;

    public C16520a() {
        this(-16777216);
    }

    public C16520a(int i10) {
        this.f157206g = new Path();
        Paint paint = new Paint();
        this.f157207h = paint;
        this.f157200a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f157201b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f157202c = new Paint(paint2);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f157206g;
        if (z10) {
            int[] iArr = f157198k;
            iArr[0] = 0;
            iArr[1] = this.f157205f;
            iArr[2] = this.f157204e;
            iArr[3] = this.f157203d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f157198k;
            iArr2[0] = 0;
            iArr2[1] = this.f157203d;
            iArr2[2] = this.f157204e;
            iArr2[3] = this.f157205f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f157199l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f157201b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f157198k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f157207h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f157201b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f157196i;
        iArr[0] = this.f157205f;
        iArr[1] = this.f157204e;
        iArr[2] = this.f157203d;
        Paint paint = this.f157202c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f157197j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f157202c);
        canvas.restore();
    }

    public Paint c() {
        return this.f157200a;
    }

    public void d(int i10) {
        this.f157203d = c.k(i10, 68);
        this.f157204e = c.k(i10, 20);
        this.f157205f = c.k(i10, 0);
        this.f157200a.setColor(this.f157203d);
    }
}
