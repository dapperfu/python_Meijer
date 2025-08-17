package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.fullstory.instrumentation.FSDraw;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/mapeditor/components/BinDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "bounds", "", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BinDrawable extends Drawable implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private final float f123448a;

    /* renamed from: b, reason: collision with root package name */
    private final float f123449b;

    /* renamed from: c, reason: collision with root package name */
    private final float f123450c;

    /* renamed from: d, reason: collision with root package name */
    private final float f123451d;

    /* renamed from: e, reason: collision with root package name */
    private final float f123452e;

    /* renamed from: f, reason: collision with root package name */
    private final Path f123453f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f123454g;

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

    public BinDrawable(Context context) {
        Intrinsics.j(context, "context");
        float fPxFromDp = PixelExtensionsKt.pxFromDp(1.0f, context);
        this.f123448a = fPxFromDp;
        this.f123449b = PixelExtensionsKt.pxFromDp(16.0f, context) - (fPxFromDp / 2.0f);
        this.f123450c = PixelExtensionsKt.pxFromDp(4.0f, context);
        this.f123451d = PixelExtensionsKt.pxFromDp(80.0f, context);
        this.f123452e = PixelExtensionsKt.pxFromDp(20.0f, context);
        this.f123453f = new Path();
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setStrokeWidth(fPxFromDp);
        paint.setStyle(Paint.Style.STROKE);
        float f10 = 2 * fPxFromDp;
        paint.setPathEffect(new DashPathEffect(new float[]{f10, f10}, 0.0f));
        this.f123454g = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        canvas.drawPath(this.f123453f, this.f123454g);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.j(bounds, "bounds");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        this.f123453f.rewind();
        Path path = this.f123453f;
        float f10 = this.f123448a / 2.0f;
        float f11 = iWidth;
        float f12 = iHeight - f10;
        float f13 = this.f123449b;
        path.addRoundRect(f10, f10, f11 - f10, f12, new float[]{f13, f13, f13, f13, f13, f13, f13, f13}, Path.Direction.CW);
        float f14 = (f11 - this.f123451d) / 2.0f;
        this.f123453f.moveTo(f14 - this.f123450c, this.f123448a);
        this.f123453f.lineTo(f14, this.f123452e);
        this.f123453f.lineTo(this.f123451d + f14, this.f123452e);
        this.f123453f.lineTo(f14 + this.f123451d + this.f123450c, this.f123448a);
    }
}
