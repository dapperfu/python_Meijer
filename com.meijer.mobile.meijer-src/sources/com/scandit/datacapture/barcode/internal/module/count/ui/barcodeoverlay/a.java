package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.H;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f122456a;

    /* renamed from: b, reason: collision with root package name */
    public List f122457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        this.f122456a = paint;
        this.f122457b = CollectionsKt.m();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        for (H h10 : this.f122457b) {
            Brush brush = h10.f122330b;
            int fillColor = brush != null ? brush.getFillColor() : 0;
            if (fillColor != 0) {
                this.f122456a.setColor(fillColor);
                canvas.drawPath(h10.f122329a, this.f122456a);
            }
        }
    }
}
