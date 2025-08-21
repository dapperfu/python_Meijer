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

/* loaded from: classes12.dex */
public final class j extends Drawable implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f126286a;

    /* renamed from: b, reason: collision with root package name */
    public final float f126287b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f126288c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f126289d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f126290e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f126291f;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public j(Bitmap bitmap, float f10) {
        Intrinsics.j(bitmap, "bitmap");
        this.f126286a = bitmap;
        this.f126287b = f10;
        this.f126288c = new RectF(f10, f10, bitmap.getWidth(), bitmap.getHeight());
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
        this.f126289d = bitmapCreateBitmap;
        this.f126290e = new RectF(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        this.f126291f = new Paint(3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        canvas.drawBitmap(this.f126289d, (Rect) null, this.f126290e, this.f126291f);
        canvas.drawBitmap(this.f126286a, (Rect) null, this.f126288c, this.f126291f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f126289d.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f126289d.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.j(bounds, "bounds");
        super.onBoundsChange(bounds);
        float width = this.f126289d.getWidth() / bounds.width();
        float height = this.f126289d.getHeight() / bounds.height();
        this.f126290e.set(bounds);
        RectF rectF = this.f126288c;
        rectF.set(bounds);
        float f10 = this.f126287b;
        rectF.inset(width * f10, f10 * height);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f126291f.getAlpha() != i10) {
            this.f126291f.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f126291f.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
