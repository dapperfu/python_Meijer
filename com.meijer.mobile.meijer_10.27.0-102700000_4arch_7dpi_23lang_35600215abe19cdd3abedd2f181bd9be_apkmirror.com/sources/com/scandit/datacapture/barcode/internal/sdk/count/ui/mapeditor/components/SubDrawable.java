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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\u00020\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u000f8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u0012¨\u0006!"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/SubDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "bounds", "", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Outline;", "outline", "getOutline", "(Landroid/graphics/Outline;)V", "color", "getSubColor", "setSubColor", "subColor", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SubDrawable extends Drawable implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private final float f123494a;

    /* renamed from: b, reason: collision with root package name */
    private final float f123495b;

    /* renamed from: c, reason: collision with root package name */
    private final Path f123496c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f123497d;

    /* renamed from: e, reason: collision with root package name */
    private final Drawable f123498e;

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

    public SubDrawable(Context context) {
        Intrinsics.j(context, "context");
        this.f123494a = PixelExtensionsKt.pxFromDp(12.0f, context);
        this.f123495b = PixelExtensionsKt.pxFromDp(10.0f, context);
        this.f123496c = new Path();
        Paint paint = new Paint();
        paint.setColor(BinsView.DEFAULT_SUB_BACKGROUND_COLOR);
        paint.setStyle(Paint.Style.FILL);
        this.f123497d = paint;
        Drawable drawableResources_getDrawable = FS.Resources_getDrawable(context, R.drawable.sc_map_editor_grab);
        if (drawableResources_getDrawable != null) {
            drawableResources_getDrawable.setBounds(0, 0, drawableResources_getDrawable.getIntrinsicWidth(), drawableResources_getDrawable.getIntrinsicHeight());
            drawableResources_getDrawable.setTint(MapEditorUtils.INSTANCE.uiElementColorOnBackground(getSubColor()));
        } else {
            drawableResources_getDrawable = null;
        }
        this.f123498e = drawableResources_getDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.i(bounds, "getBounds(...)");
        canvas.drawPath(this.f123496c, this.f123497d);
        Drawable drawable = this.f123498e;
        if (drawable != null) {
            Rect bounds2 = drawable.getBounds();
            Intrinsics.i(bounds2, "getBounds(...)");
            float fWidth = bounds.width() - bounds2.width();
            float f10 = this.f123495b;
            canvas.save();
            canvas.translate(fWidth - f10, f10);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Intrinsics.j(outline, "outline");
        outline.setRoundRect(0, 0, getBounds().width(), getBounds().height(), this.f123494a);
    }

    public final int getSubColor() {
        return this.f123497d.getColor();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.j(bounds, "bounds");
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        this.f123496c.rewind();
        Path path = this.f123496c;
        float f10 = this.f123494a;
        path.addRoundRect(0.0f, 0.0f, fWidth, fHeight, new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, Path.Direction.CW);
    }

    public final void setSubColor(int i10) {
        this.f123497d.setColor(i10);
        Drawable drawable = this.f123498e;
        if (drawable != null) {
            drawable.setTint(MapEditorUtils.INSTANCE.uiElementColorOnBackground(i10));
        }
        invalidateSelf();
    }
}
