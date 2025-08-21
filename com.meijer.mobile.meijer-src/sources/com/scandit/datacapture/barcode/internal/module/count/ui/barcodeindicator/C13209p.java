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
/* loaded from: classes12.dex */
public final class C13209p extends Lambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13212t f122402a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13209p(C13212t c13212t) {
        super(3);
        this.f122402a = c13212t;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zA;
        TrackedBarcode trackedBarcode = (TrackedBarcode) obj;
        TrackedBarcode barcode = (TrackedBarcode) obj2;
        Intrinsics.j((Point) obj3, "<anonymous parameter 2>");
        boolean z10 = false;
        if (barcode != null) {
            C13212t c13212t = this.f122402a;
            if (trackedBarcode != null && trackedBarcode.getGlobalId$scandit_barcode_capture() == barcode.getGlobalId$scandit_barcode_capture()) {
                W status = c13212t.a(barcode, c13212t.d(barcode));
                if (AbstractC13199f.f122391a[status.ordinal()] == 1) {
                    BarcodeCountBrushHandler barcodeCountBrushHandler = c13212t.f122413e;
                    W w10 = W.f122368b;
                    Brush brushA = barcodeCountBrushHandler.a();
                    zA = !(brushA != null && Color.alpha(brushA.getFillColor()) == 0);
                } else if (((L) c13212t.f122426r.get(Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture()))) != null) {
                    NativeBarcodeCountBasicOverlayStyle style = c13212t.f122412d;
                    C13202i dotBrushProvider = new C13202i(c13212t.f122413e);
                    Intrinsics.j(style, "style");
                    Intrinsics.j(barcode, "barcode");
                    Intrinsics.j(status, "status");
                    Intrinsics.j(dotBrushProvider, "dotBrushProvider");
                    zA = AbstractC13197d.a(barcode, style, status, dotBrushProvider);
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
