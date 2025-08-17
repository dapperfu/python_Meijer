package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.fullstory.instrumentation.FSDraw;

/* loaded from: classes.dex */
class d extends Drawable implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private float f47703a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f47705c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f47706d;

    /* renamed from: e, reason: collision with root package name */
    private float f47707e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f47710h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f47711i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f47712j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47708f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f47709g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f47713k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f47704b = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f47710h = colorStateList;
        this.f47704b.setColor(colorStateList.getColorForState(getState(), this.f47710h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f47705c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f47706d.set(rect);
        if (this.f47708f) {
            this.f47706d.inset((int) Math.ceil(e.a(this.f47707e, this.f47703a, this.f47709g)), (int) Math.ceil(e.b(this.f47707e, this.f47703a, this.f47709g)));
            this.f47705c.set(this.f47706d);
        }
    }

    public ColorStateList b() {
        return this.f47710h;
    }

    float c() {
        return this.f47707e;
    }

    public float d() {
        return this.f47703a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f47704b;
        if (this.f47711i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f47711i);
            z10 = true;
        }
        RectF rectF = this.f47705c;
        float f10 = this.f47703a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f47707e && this.f47708f == z10 && this.f47709g == z11) {
            return;
        }
        this.f47707e = f10;
        this.f47708f = z10;
        this.f47709g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f47706d, this.f47703a);
    }

    void h(float f10) {
        if (f10 == this.f47703a) {
            return;
        }
        this.f47703a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f47712j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f47710h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f47710h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f47704b.getColor();
        if (z10) {
            this.f47704b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f47712j;
        if (colorStateList2 == null || (mode = this.f47713k) == null) {
            return z10;
        }
        this.f47711i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f47704b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f47704b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f47712j = colorStateList;
        this.f47711i = a(colorStateList, this.f47713k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f47713k = mode;
        this.f47711i = a(this.f47712j, mode);
        invalidateSelf();
    }

    d(ColorStateList colorStateList, float f10) {
        this.f47703a = f10;
        e(colorStateList);
        this.f47705c = new RectF();
        this.f47706d = new Rect();
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }
}
