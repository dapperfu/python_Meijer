package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13200g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13212t f122393a;

    public C13200g(C13212t c13212t) {
        this.f122393a = c13212t;
    }

    public final Brush a(TrackedBarcode trackedBarcode) {
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        W wA = this.f122393a.a(trackedBarcode, N.f122351a);
        C13212t c13212t = this.f122393a;
        if (c13212t.f122412d == NativeBarcodeCountBasicOverlayStyle.DOT || c13212t.f122423o == NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE) {
            return c13212t.f122413e.a(trackedBarcode, wA);
        }
        int iOrdinal = wA.ordinal();
        return iOrdinal != 0 ? iOrdinal != 3 ? this.f122393a.f122413e.a(trackedBarcode, wA) : new Brush(-375738, 0, 0.0f) : new Brush(-13712946, 0, 0.0f);
    }
}
