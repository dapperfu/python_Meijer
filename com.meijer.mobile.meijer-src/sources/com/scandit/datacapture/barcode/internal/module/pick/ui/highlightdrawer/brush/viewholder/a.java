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

/* loaded from: classes12.dex */
public final class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.a f123544a;

    /* renamed from: b, reason: collision with root package name */
    public final j f123545b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f123546c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f123547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.a drawData, j drawSettings, Paint tapPaint, Paint boundingBoxPaint) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(drawData, "drawData");
        Intrinsics.j(drawSettings, "drawSettings");
        Intrinsics.j(tapPaint, "tapPaint");
        Intrinsics.j(boundingBoxPaint, "boundingBoxPaint");
        this.f123544a = drawData;
        this.f123545b = drawSettings;
        this.f123546c = tapPaint;
        this.f123547d = boundingBoxPaint;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.a aVar = this.f123544a;
        if (this.f123545b.f123518a) {
            v vVar = aVar.f123502c;
            if (vVar != null) {
                canvas.drawPath(vVar.f123543b, this.f123546c);
            }
            canvas.drawPath(aVar.f123503d.f123543b, this.f123547d);
        }
        m mVar = aVar.f123500a;
        if (mVar != null) {
            if (mVar.f123614c.isEmpty()) {
                canvas.drawPath(aVar.f123501b.f123543b, mVar.f123612a);
            } else {
                for (l lVar : mVar.f123614c) {
                    Path path = aVar.f123501b.f123543b;
                    Paint paint = mVar.f123612a;
                    paint.setShadowLayer(lVar.f123609a, 0.0f, lVar.f123610b, lVar.f123611c);
                    canvas.drawPath(path, paint);
                    paint.clearShadowLayer();
                }
            }
            canvas.drawPath(aVar.f123501b.f123543b, mVar.f123613b);
        }
        Drawable drawable = aVar.f123506g;
        if (drawable != null) {
            Quadrilateral quadrilateral = aVar.f123501b.f123542a;
            Point center = QuadrilateralUtilsKt.getCenter(aVar.f123503d.f123542a);
            j jVar = this.f123545b;
            float fJ = jVar.f123520c;
            float f10 = jVar.f123521d;
            float f11 = jVar.f123522e;
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
