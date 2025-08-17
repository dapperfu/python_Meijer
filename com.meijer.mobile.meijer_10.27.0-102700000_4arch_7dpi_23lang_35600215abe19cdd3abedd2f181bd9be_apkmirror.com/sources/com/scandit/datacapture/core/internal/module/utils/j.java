package com.scandit.datacapture.core.internal.module.utils;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j extends Drawable implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f125334a;

    /* renamed from: b, reason: collision with root package name */
    public final float f125335b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f125336c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f125337d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f125338e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f125339f;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public j(Bitmap bitmap, float f10) {
        Intrinsics.j(bitmap, "bitmap");
        this.f125334a = bitmap;
        this.f125335b = f10;
        this.f125336c = new RectF(f10, f10, bitmap.getWidth(), bitmap.getHeight());
        int i10 = (int) (2 * f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() + i10, bitmap.getHeight() + i10, Bitmap.Config.ARGB_8888);
        Intrinsics.i(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setColor(1073741824);
        paint.setMaskFilter(new BlurMaskFilter(f10, BlurMaskFilter.Blur.OUTER));
        Bitmap bitmapExtractAlpha = bitmap.extractAlpha();
        Intrinsics.i(bitmapExtractAlpha, "extractAlpha(...)");
        canvas.drawBitmap(bitmapExtractAlpha, f10, f10, paint);
        FS.bitmap_recycle(bitmapExtractAlpha);
        this.f125337d = bitmapCreateBitmap;
        this.f125338e = new RectF(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        this.f125339f = new Paint(3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        canvas.drawBitmap(this.f125337d, (Rect) null, this.f125338e, this.f125339f);
        canvas.drawBitmap(this.f125334a, (Rect) null, this.f125336c, this.f125339f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f125337d.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f125337d.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.j(bounds, "bounds");
        super.onBoundsChange(bounds);
        float width = this.f125337d.getWidth() / bounds.width();
        float height = this.f125337d.getHeight() / bounds.height();
        this.f125338e.set(bounds);
        RectF rectF = this.f125336c;
        rectF.set(bounds);
        float f10 = this.f125335b;
        rectF.inset(width * f10, f10 * height);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f125339f.getAlpha() != i10) {
            this.f125339f.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f125339f.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
