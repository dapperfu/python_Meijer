package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.viewholder;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.j;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.g;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final a f122596a;

    /* renamed from: b, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.a f122597b;

    public c(View container, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.a initialDrawData, j drawSettings, Paint tapPaint, Paint boundingBoxPaint) {
        Intrinsics.j(container, "container");
        Intrinsics.j(initialDrawData, "initialDrawData");
        Intrinsics.j(drawSettings, "drawSettings");
        Intrinsics.j(tapPaint, "tapPaint");
        Intrinsics.j(boundingBoxPaint, "boundingBoxPaint");
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        this.f122596a = new a(context, initialDrawData, drawSettings, tapPaint, boundingBoxPaint);
        this.f122597b = initialDrawData;
    }

    public final void a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.a drawData) {
        Intrinsics.j(drawData, "drawData");
        BarcodePickState barcodePickState = this.f122597b.f122552e;
        this.f122597b = drawData;
        a aVar = this.f122596a;
        aVar.getClass();
        Intrinsics.j(drawData, "drawData");
        aVar.f122592a = drawData;
        aVar.invalidate();
        a aVar2 = this.f122596a;
        BarcodePickState barcodePickState2 = drawData.f122552e;
        Intrinsics.j(barcodePickState2, "<this>");
        aVar2.setElevation(PixelExtensionsKt.pxFromDp$default(g.f122652a[barcodePickState2.ordinal()] == 1 ? 6.0f : 5.0f, (Context) null, 1, (Object) null));
    }
}
