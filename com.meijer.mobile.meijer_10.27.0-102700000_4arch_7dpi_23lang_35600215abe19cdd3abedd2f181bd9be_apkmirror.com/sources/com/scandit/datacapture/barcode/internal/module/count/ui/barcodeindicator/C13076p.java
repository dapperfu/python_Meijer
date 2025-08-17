package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.graphics.Color;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13076p extends Lambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13079t f121450a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13076p(C13079t c13079t) {
        super(3);
        this.f121450a = c13079t;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zA;
        TrackedBarcode trackedBarcode = (TrackedBarcode) obj;
        TrackedBarcode barcode = (TrackedBarcode) obj2;
        Intrinsics.j((Point) obj3, "<anonymous parameter 2>");
        boolean z10 = false;
        if (barcode != null) {
            C13079t c13079t = this.f121450a;
            if (trackedBarcode != null && trackedBarcode.getGlobalId$scandit_barcode_capture() == barcode.getGlobalId$scandit_barcode_capture()) {
                W status = c13079t.a(barcode, c13079t.d(barcode));
                if (AbstractC13066f.f121439a[status.ordinal()] == 1) {
                    BarcodeCountBrushHandler barcodeCountBrushHandler = c13079t.f121461e;
                    W w10 = W.f121416b;
                    Brush brushA = barcodeCountBrushHandler.a();
                    zA = !(brushA != null && Color.alpha(brushA.getFillColor()) == 0);
                } else if (((L) c13079t.f121474r.get(Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture()))) != null) {
                    NativeBarcodeCountBasicOverlayStyle style = c13079t.f121460d;
                    C13069i dotBrushProvider = new C13069i(c13079t.f121461e);
                    Intrinsics.j(style, "style");
                    Intrinsics.j(barcode, "barcode");
                    Intrinsics.j(status, "status");
                    Intrinsics.j(dotBrushProvider, "dotBrushProvider");
                    zA = AbstractC13064d.a(barcode, style, status, dotBrushProvider);
                } else {
                    zA = false;
                }
                if (zA) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
