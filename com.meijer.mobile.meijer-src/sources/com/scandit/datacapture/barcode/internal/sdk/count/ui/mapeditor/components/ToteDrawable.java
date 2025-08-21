package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\u00020\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u000f8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u0012¨\u0006!"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/ToteDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "bounds", "", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Outline;", "outline", "getOutline", "(Landroid/graphics/Outline;)V", "color", "getToteColor", "setToteColor", "toteColor", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ToteDrawable extends Drawable implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private final float f124454a;

    /* renamed from: b, reason: collision with root package name */
    private final float f124455b;

    /* renamed from: c, reason: collision with root package name */
    private final float f124456c;

    /* renamed from: d, reason: collision with root package name */
    private final float f124457d;

    /* renamed from: e, reason: collision with root package name */
    private final float f124458e;

    /* renamed from: f, reason: collision with root package name */
    private final Path f124459f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f124460g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f124461h;

    /* renamed from: i, reason: collision with root package name */
    private final Paint f124462i;

    /* renamed from: j, reason: collision with root package name */
    private final Drawable f124463j;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public ToteDrawable(Context context) {
        Intrinsics.j(context, "context");
        this.f124454a = PixelExtensionsKt.pxFromDp(16.0f, context);
        this.f124455b = PixelExtensionsKt.pxFromDp(4.0f, context);
        this.f124456c = PixelExtensionsKt.pxFromDp(80.0f, context);
        this.f124457d = PixelExtensionsKt.pxFromDp(20.0f, context);
        this.f124458e = PixelExtensionsKt.pxFromDp(10.0f, context);
        this.f124459f = new Path();
        this.f124460g = new Path();
        Paint paint = new Paint();
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f124461h = paint;
        Paint paint2 = new Paint();
        paint2.setColor(BinsView.DEFAULT_TOTE_BACKGROUND_COLOR);
        paint2.setStyle(style);
        this.f124462i = paint2;
        Drawable drawableResources_getDrawable = FS.Resources_getDrawable(context, R.drawable.sc_map_editor_grab);
        if (drawableResources_getDrawable != null) {
            drawableResources_getDrawable.setBounds(0, 0, drawableResources_getDrawable.getIntrinsicWidth(), drawableResources_getDrawable.getIntrinsicHeight());
            drawableResources_getDrawable.setTint(MapEditorUtils.INSTANCE.uiElementColorOnBackground(getToteColor()));
        } else {
            drawableResources_getDrawable = null;
        }
        this.f124463j = drawableResources_getDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.i(bounds, "getBounds(...)");
        float f10 = this.f124454a;
        canvas.drawRect(f10, 0.0f, f10 + (bounds.width() - (this.f124454a * 2.0f)), bounds.height() / 2.0f, this.f124461h);
        canvas.drawPath(this.f124459f, this.f124462i);
        Drawable drawable = this.f124463j;
        if (drawable != null) {
            Rect bounds2 = drawable.getBounds();
            Intrinsics.i(bounds2, "getBounds(...)");
            float fWidth = bounds.width() - bounds2.width();
            float f11 = this.f124458e;
            canvas.save();
            canvas.translate(fWidth - f11, f11);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Intrinsics.j(outline, "outline");
        outline.setRoundRect(0, 0, getBounds().width(), getBounds().height(), this.f124454a);
    }

    public final int getToteColor() {
        return this.f124462i.getColor();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.j(bounds, "bounds");
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        this.f124459f.rewind();
        float f10 = (fWidth - this.f124456c) / 2.0f;
        this.f124459f.moveTo(f10 - this.f124455b, 0.0f);
        this.f124459f.lineTo(f10, this.f124457d);
        this.f124459f.lineTo(this.f124456c + f10, this.f124457d);
        this.f124459f.lineTo(f10 + this.f124456c + this.f124455b, 0.0f);
        float f11 = this.f124454a * 2;
        float f12 = fWidth - f11;
        this.f124459f.arcTo(f12, 0.0f, fWidth, f11, 270.0f, 90.0f, false);
        float f13 = fHeight - f11;
        this.f124459f.arcTo(f12, f13, fWidth, fHeight, 0.0f, 90.0f, false);
        this.f124459f.arcTo(0.0f, f13, f11, fHeight, 90.0f, 90.0f, false);
        this.f124459f.arcTo(0.0f, 0.0f, f11, f11, 180.0f, 80.0f, false);
        this.f124459f.close();
        this.f124460g.rewind();
        Path path = this.f124460g;
        float f14 = this.f124454a;
        path.addRoundRect(0.0f, 0.0f, fWidth, fHeight, new float[]{f14, f14, f14, f14, f14, f14, f14, f14}, Path.Direction.CW);
    }

    public final void setToteColor(int i10) {
        this.f124462i.setColor(i10);
        Drawable drawable = this.f124463j;
        if (drawable != null) {
            drawable.setTint(MapEditorUtils.INSTANCE.uiElementColorOnBackground(i10));
        }
        invalidateSelf();
    }
}
