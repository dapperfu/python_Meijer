package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.j;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.v;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.l;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.m;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public final class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.a f122592a;

    /* renamed from: b, reason: collision with root package name */
    public final j f122593b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f122594c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f122595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.a drawData, j drawSettings, Paint tapPaint, Paint boundingBoxPaint) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(drawData, "drawData");
        Intrinsics.j(drawSettings, "drawSettings");
        Intrinsics.j(tapPaint, "tapPaint");
        Intrinsics.j(boundingBoxPaint, "boundingBoxPaint");
        this.f122592a = drawData;
        this.f122593b = drawSettings;
        this.f122594c = tapPaint;
        this.f122595d = boundingBoxPaint;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.a aVar = this.f122592a;
        if (this.f122593b.f122566a) {
            v vVar = aVar.f122550c;
            if (vVar != null) {
                canvas.drawPath(vVar.f122591b, this.f122594c);
            }
            canvas.drawPath(aVar.f122551d.f122591b, this.f122595d);
        }
        m mVar = aVar.f122548a;
        if (mVar != null) {
            if (mVar.f122662c.isEmpty()) {
                canvas.drawPath(aVar.f122549b.f122591b, mVar.f122660a);
            } else {
                for (l lVar : mVar.f122662c) {
                    Path path = aVar.f122549b.f122591b;
                    Paint paint = mVar.f122660a;
                    paint.setShadowLayer(lVar.f122657a, 0.0f, lVar.f122658b, lVar.f122659c);
                    canvas.drawPath(path, paint);
                    paint.clearShadowLayer();
                }
            }
            canvas.drawPath(aVar.f122549b.f122591b, mVar.f122661b);
        }
        Drawable drawable = aVar.f122554g;
        if (drawable != null) {
            Quadrilateral quadrilateral = aVar.f122549b.f122590a;
            Point center = QuadrilateralUtilsKt.getCenter(aVar.f122551d.f122590a);
            j jVar = this.f122593b;
            float fJ = jVar.f122568c;
            float f10 = jVar.f122569d;
            float f11 = jVar.f122570e;
            float f12 = 2;
            if (Math.min(QuadrilateralUtilsKt.getWidth(quadrilateral), QuadrilateralUtilsKt.getHeight(quadrilateral)) < (f11 * f12) + fJ) {
                fJ = RangesKt.j(RangesKt.e((float) Math.floor((fJ / r3) * r2), f10), fJ);
            }
            float f13 = fJ / f12;
            drawable.setBounds((int) (center.getX() - f13), (int) (center.getY() - f13), (int) (center.getX() + f13), (int) (center.getY() + f13));
            drawable.draw(canvas);
        }
    }
}
