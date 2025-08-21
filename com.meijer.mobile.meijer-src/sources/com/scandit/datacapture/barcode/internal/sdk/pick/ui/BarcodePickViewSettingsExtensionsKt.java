package com.scandit.datacapture.barcode.internal.sdk.pick.ui;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¨\u0006\b"}, d2 = {"_getProperty", "", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "key", "", "_setProperty", "", "value", "scandit-barcode-capture"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BarcodePickViewSettingsExtensionsKt {
    public static final Object _getProperty(BarcodePickViewSettings barcodePickViewSettings, String key) {
        Intrinsics.j(barcodePickViewSettings, "<this>");
        Intrinsics.j(key, "key");
        if (Intrinsics.e(key, "draw_debug_info")) {
            return Boolean.valueOf(barcodePickViewSettings.getDrawDebugInfo());
        }
        return null;
    }

    public static final void _setProperty(BarcodePickViewSettings barcodePickViewSettings, String key, Object obj) {
        Intrinsics.j(barcodePickViewSettings, "<this>");
        Intrinsics.j(key, "key");
        if (Intrinsics.e(key, "draw_debug_info") && (obj instanceof Boolean)) {
            barcodePickViewSettings.setDrawDebugInfo$scandit_barcode_capture(((Boolean) obj).booleanValue());
        }
    }
}
