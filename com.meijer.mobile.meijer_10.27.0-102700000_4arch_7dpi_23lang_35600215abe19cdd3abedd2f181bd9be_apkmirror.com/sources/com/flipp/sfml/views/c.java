package com.flipp.sfml.views;

import Ra.y;
import Sa.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.flipp.sfml.views.ZoomScrollView;
import com.fullstory.instrumentation.FSDraw;

/* loaded from: classes4.dex */
public class c extends BitmapDrawable implements c.a, ZoomScrollView.f, FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private y f64321a;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f64323c;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f64322b = new RectF();

    /* renamed from: d, reason: collision with root package name */
    private float f64324d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private RectF f64325e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    private RectF f64326f = new RectF();

    @Override // Sa.c.a
    public void a() {
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void c() {
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private boolean d() {
        float fWidth = this.f64325e.width();
        float fHeight = this.f64325e.height();
        RectF rectF = this.f64326f;
        RectF rectF2 = this.f64325e;
        return rectF.intersect(rectF2.left - fWidth, rectF2.top - fHeight, rectF2.right + fWidth, rectF2.bottom + fHeight);
    }

    @Override // Sa.c.a
    public void b(Bitmap bitmap) {
        this.f64323c = bitmap;
        invalidateSelf();
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void e(boolean z10, boolean z11, float f10, float f11, float f12, float f13) {
        this.f64325e.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    public float f() {
        y yVar = this.f64321a;
        if (yVar == null) {
            return 0.0f;
        }
        return yVar.h();
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void g(float f10) {
        if (this.f64324d == f10) {
            return;
        }
        this.f64324d = f10;
        invalidateSelf();
    }

    public float h() {
        y yVar = this.f64321a;
        if (yVar == null) {
            return 0.0f;
        }
        return yVar.i();
    }

    public void j(y yVar) {
        this.f64321a = yVar;
        this.f64323c = null;
    }

    public void k(RectF rectF) {
        this.f64326f.set(rectF);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!d()) {
            this.f64323c = null;
            return;
        }
        Bitmap bitmap = this.f64323c;
        if (bitmap == null) {
            i();
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, getBounds(), (Paint) null);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) f();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) h();
    }

    protected void i() {
        y yVar;
        if (d() && (yVar = this.f64321a) != null && !TextUtils.isEmpty(yVar.k())) {
            ((Sa.c) Qa.c.c(Sa.c.class)).b(this.f64321a.k(), this);
        }
    }
}
