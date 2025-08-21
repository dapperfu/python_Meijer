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
    private float f47927a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f47929c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f47930d;

    /* renamed from: e, reason: collision with root package name */
    private float f47931e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f47934h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f47935i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f47936j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47932f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f47933g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f47937k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f47928b = new Paint(5);

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
        this.f47934h = colorStateList;
        this.f47928b.setColor(colorStateList.getColorForState(getState(), this.f47934h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f47929c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f47930d.set(rect);
        if (this.f47932f) {
            this.f47930d.inset((int) Math.ceil(e.a(this.f47931e, this.f47927a, this.f47933g)), (int) Math.ceil(e.b(this.f47931e, this.f47927a, this.f47933g)));
            this.f47929c.set(this.f47930d);
        }
    }

    public ColorStateList b() {
        return this.f47934h;
    }

    float c() {
        return this.f47931e;
    }

    public float d() {
        return this.f47927a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f47928b;
        if (this.f47935i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f47935i);
            z10 = true;
        }
        RectF rectF = this.f47929c;
        float f10 = this.f47927a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f47931e && this.f47932f == z10 && this.f47933g == z11) {
            return;
        }
        this.f47931e = f10;
        this.f47932f = z10;
        this.f47933g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f47930d, this.f47927a);
    }

    void h(float f10) {
        if (f10 == this.f47927a) {
            return;
        }
        this.f47927a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f47936j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f47934h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f47934h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f47928b.getColor();
        if (z10) {
            this.f47928b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f47936j;
        if (colorStateList2 == null || (mode = this.f47937k) == null) {
            return z10;
        }
        this.f47935i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f47928b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f47928b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f47936j = colorStateList;
        this.f47935i = a(colorStateList, this.f47937k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f47937k = mode;
        this.f47935i = a(this.f47936j, mode);
        invalidateSelf();
    }

    d(ColorStateList colorStateList, float f10) {
        this.f47927a = f10;
        e(colorStateList);
        this.f47929c = new RectF();
        this.f47930d = new Rect();
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
