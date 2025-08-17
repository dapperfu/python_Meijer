package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13067g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13079t f121441a;

    public C13067g(C13079t c13079t) {
        this.f121441a = c13079t;
    }

    public final Brush a(TrackedBarcode trackedBarcode) {
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        W wA = this.f121441a.a(trackedBarcode, N.f121399a);
        C13079t c13079t = this.f121441a;
        if (c13079t.f121460d == NativeBarcodeCountBasicOverlayStyle.DOT || c13079t.f121471o == NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE) {
            return c13079t.f121461e.a(trackedBarcode, wA);
        }
        int iOrdinal = wA.ordinal();
        return iOrdinal != 0 ? iOrdinal != 3 ? this.f121441a.f121461e.a(trackedBarcode, wA) : new Brush(-375738, 0, 0.0f) : new Brush(-13712946, 0, 0.0f);
    }
}
