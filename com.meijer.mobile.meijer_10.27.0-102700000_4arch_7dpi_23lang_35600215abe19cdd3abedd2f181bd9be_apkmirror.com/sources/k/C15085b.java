package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.fullstory.instrumentation.FSDraw;
import d2.C13462a;
import i.C14575a;
import i.C14583i;
import i.C14584j;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C15085b extends Drawable implements FSDraw {

    /* renamed from: m, reason: collision with root package name */
    private static final float f141113m = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    private final Paint f141114a;

    /* renamed from: b, reason: collision with root package name */
    private float f141115b;

    /* renamed from: c, reason: collision with root package name */
    private float f141116c;

    /* renamed from: d, reason: collision with root package name */
    private float f141117d;

    /* renamed from: e, reason: collision with root package name */
    private float f141118e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f141119f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f141120g;

    /* renamed from: h, reason: collision with root package name */
    private final int f141121h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f141122i;

    /* renamed from: j, reason: collision with root package name */
    private float f141123j;

    /* renamed from: k, reason: collision with root package name */
    private float f141124k;

    /* renamed from: l, reason: collision with root package name */
    private int f141125l;

    private static float a(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void b(float f10) {
        if (this.f141114a.getStrokeWidth() != f10) {
            this.f141114a.setStrokeWidth(f10);
            this.f141124k = (float) ((f10 / 2.0f) * Math.cos(f141113m));
            invalidateSelf();
        }
    }

    public void c(int i10) {
        if (i10 != this.f141114a.getColor()) {
            this.f141114a.setColor(i10);
            invalidateSelf();
        }
    }

    public void d(float f10) {
        if (f10 != this.f141118e) {
            this.f141118e = f10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f141125l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? C13462a.f(this) == 0 : C13462a.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f141115b;
        float fA = a(this.f141116c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f141123j);
        float fA2 = a(this.f141116c, this.f141117d, this.f141123j);
        float fRound = Math.round(a(0.0f, this.f141124k, this.f141123j));
        float fA3 = a(0.0f, f141113m, this.f141123j);
        float fA4 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f141123j);
        double d10 = fA;
        double d11 = fA3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(d10 * Math.sin(d11));
        this.f141120g.rewind();
        float fA5 = a(this.f141118e + this.f141114a.getStrokeWidth(), -this.f141124k, this.f141123j);
        float f11 = (-fA2) / 2.0f;
        this.f141120g.moveTo(f11 + fRound, 0.0f);
        this.f141120g.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        this.f141120g.moveTo(f11, fA5);
        this.f141120g.rLineTo(fRound2, fRound3);
        this.f141120g.moveTo(f11, -fA5);
        this.f141120g.rLineTo(fRound2, -fRound3);
        this.f141120g.close();
        canvas.save();
        float strokeWidth = this.f141114a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (r5 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + this.f141118e);
        if (this.f141119f) {
            canvas.rotate(fA4 * (this.f141122i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f141120g, this.f141114a);
        canvas.restore();
    }

    public void e(float f10) {
        if (this.f141123j != f10) {
            this.f141123j = f10;
            invalidateSelf();
        }
    }

    public void f(boolean z10) {
        if (this.f141119f != z10) {
            this.f141119f = z10;
            invalidateSelf();
        }
    }

    public void g(boolean z10) {
        if (this.f141122i != z10) {
            this.f141122i = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f141121h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f141121h;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f141114a.getAlpha()) {
            this.f141114a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f141114a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C15085b(Context context) {
        Paint paint = new Paint();
        this.f141114a = paint;
        this.f141120g = new Path();
        this.f141122i = false;
        this.f141125l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C14584j.f136796Z0, C14575a.f136505B, C14583i.f136680b);
        c(typedArrayObtainStyledAttributes.getColor(C14584j.f136816d1, 0));
        b(typedArrayObtainStyledAttributes.getDimension(C14584j.f136836h1, 0.0f));
        f(typedArrayObtainStyledAttributes.getBoolean(C14584j.f136831g1, true));
        d(Math.round(typedArrayObtainStyledAttributes.getDimension(C14584j.f136826f1, 0.0f)));
        this.f141121h = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14584j.f136821e1, 0);
        this.f141116c = Math.round(typedArrayObtainStyledAttributes.getDimension(C14584j.f136811c1, 0.0f));
        this.f141115b = Math.round(typedArrayObtainStyledAttributes.getDimension(C14584j.f136801a1, 0.0f));
        this.f141117d = typedArrayObtainStyledAttributes.getDimension(C14584j.f136806b1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
