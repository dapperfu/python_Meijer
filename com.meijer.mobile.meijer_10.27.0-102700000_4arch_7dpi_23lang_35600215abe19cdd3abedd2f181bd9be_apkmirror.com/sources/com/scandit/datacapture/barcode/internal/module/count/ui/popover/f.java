package com.scandit.datacapture.barcode.internal.module.count.ui.popover;

import android.content.Context;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountNotInListActionSettings;
import com.scandit.datacapture.barcode.internal.module.ui.popover.LinearPopoverButtonViewSettings;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes11.dex */
public final class f {
    public static final Map a(Context context, BarcodeCountNotInListActionSettings barcodeCountNotInListActionSettings, NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme, g gVar) {
        int i10;
        Lazy lazy = h.f121764f;
        Pair pairA = TuplesKt.a(new LinearPopoverButtonViewSettings(0, FS.Resources_getDrawable(context, R.drawable.sc_count_popup_reject), barcodeCountNotInListActionSettings.getRejectButtonText(), barcodeCountNotInListActionSettings.getRejectButtonContentDescription(), 0.0f, 0, null, false, false, 1008), new c(gVar));
        int i11 = b.f121763a[nativeBarcodeCountBasicOverlayColorScheme.ordinal()];
        if (i11 == 1) {
            i10 = R.drawable.sc_count_popup_accept;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = R.drawable.sc_count_popup_accept_alt;
        }
        return MapsKt.o(pairA, TuplesKt.a(new LinearPopoverButtonViewSettings(1, FS.Resources_getDrawable(context, i10), barcodeCountNotInListActionSettings.getAcceptButtonText(), barcodeCountNotInListActionSettings.getAcceptButtonContentDescription(), 0.0f, 0, null, false, false, 1008), new d(gVar)), TuplesKt.a(new LinearPopoverButtonViewSettings(2, FS.Resources_getDrawable(context, R.drawable.sc_count_popup_cancel), barcodeCountNotInListActionSettings.getCancelButtonText(), barcodeCountNotInListActionSettings.getCancelButtonContentDescription(), 0.0f, 0, null, false, false, 1008), new e(gVar)));
    }
}
