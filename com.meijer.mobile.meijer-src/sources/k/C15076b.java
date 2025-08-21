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
import d2.C13595a;
import i.C14578a;
import i.C14586i;
import i.C14587j;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C15076b extends Drawable implements FSDraw {

    /* renamed from: m, reason: collision with root package name */
    private static final float f141306m = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    private final Paint f141307a;

    /* renamed from: b, reason: collision with root package name */
    private float f141308b;

    /* renamed from: c, reason: collision with root package name */
    private float f141309c;

    /* renamed from: d, reason: collision with root package name */
    private float f141310d;

    /* renamed from: e, reason: collision with root package name */
    private float f141311e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f141312f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f141313g;

    /* renamed from: h, reason: collision with root package name */
    private final int f141314h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f141315i;

    /* renamed from: j, reason: collision with root package name */
    private float f141316j;

    /* renamed from: k, reason: collision with root package name */
    private float f141317k;

    /* renamed from: l, reason: collision with root package name */
    private int f141318l;

    private static float a(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void b(float f10) {
        if (this.f141307a.getStrokeWidth() != f10) {
            this.f141307a.setStrokeWidth(f10);
            this.f141317k = (float) ((f10 / 2.0f) * Math.cos(f141306m));
            invalidateSelf();
        }
    }

    public void c(int i10) {
        if (i10 != this.f141307a.getColor()) {
            this.f141307a.setColor(i10);
            invalidateSelf();
        }
    }

    public void d(float f10) {
        if (f10 != this.f141311e) {
            this.f141311e = f10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f141318l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? C13595a.f(this) == 0 : C13595a.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f141308b;
        float fA = a(this.f141309c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f141316j);
        float fA2 = a(this.f141309c, this.f141310d, this.f141316j);
        float fRound = Math.round(a(0.0f, this.f141317k, this.f141316j));
        float fA3 = a(0.0f, f141306m, this.f141316j);
        float fA4 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f141316j);
        double d10 = fA;
        double d11 = fA3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(d10 * Math.sin(d11));
        this.f141313g.rewind();
        float fA5 = a(this.f141311e + this.f141307a.getStrokeWidth(), -this.f141317k, this.f141316j);
        float f11 = (-fA2) / 2.0f;
        this.f141313g.moveTo(f11 + fRound, 0.0f);
        this.f141313g.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        this.f141313g.moveTo(f11, fA5);
        this.f141313g.rLineTo(fRound2, fRound3);
        this.f141313g.moveTo(f11, -fA5);
        this.f141313g.rLineTo(fRound2, -fRound3);
        this.f141313g.close();
        canvas.save();
        float strokeWidth = this.f141307a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (r5 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + this.f141311e);
        if (this.f141312f) {
            canvas.rotate(fA4 * (this.f141315i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f141313g, this.f141307a);
        canvas.restore();
    }

    public void e(float f10) {
        if (this.f141316j != f10) {
            this.f141316j = f10;
            invalidateSelf();
        }
    }

    public void f(boolean z10) {
        if (this.f141312f != z10) {
            this.f141312f = z10;
            invalidateSelf();
        }
    }

    public void g(boolean z10) {
        if (this.f141315i != z10) {
            this.f141315i = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f141314h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f141314h;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f141307a.getAlpha()) {
            this.f141307a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f141307a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C15076b(Context context) {
        Paint paint = new Paint();
        this.f141307a = paint;
        this.f141313g = new Path();
        this.f141315i = false;
        this.f141318l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C14587j.f136553Z0, C14578a.f136262B, C14586i.f136437b);
        c(typedArrayObtainStyledAttributes.getColor(C14587j.f136573d1, 0));
        b(typedArrayObtainStyledAttributes.getDimension(C14587j.f136593h1, 0.0f));
        f(typedArrayObtainStyledAttributes.getBoolean(C14587j.f136588g1, true));
        d(Math.round(typedArrayObtainStyledAttributes.getDimension(C14587j.f136583f1, 0.0f)));
        this.f141314h = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14587j.f136578e1, 0);
        this.f141309c = Math.round(typedArrayObtainStyledAttributes.getDimension(C14587j.f136568c1, 0.0f));
        this.f141308b = Math.round(typedArrayObtainStyledAttributes.getDimension(C14587j.f136558a1, 0.0f));
        this.f141310d = typedArrayObtainStyledAttributes.getDimension(C14587j.f136563b1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
