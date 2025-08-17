package com.scandit.datacapture.barcode.count.serialization;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyleExtensionKt;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements BarcodeCountDeserializerHelper, DataCaptureDeserializerHelper {
    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerHelper
    public final void updateBasicOverlayFromJson(BarcodeCountBasicOverlay overlay, JsonValue json) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerHelper
    public final void updateModeFromJson(BarcodeCount mode, JsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerHelper
    public final void updateSettingsFromJson(BarcodeCountSettings settings, JsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerHelper
    public final void applySettings(BarcodeCount mode, BarcodeCountSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        BarcodeCount.applySettings$default(mode, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerHelper
    public final void changeBasicOverlayAddedToView(BarcodeCountBasicOverlay overlay, DataCaptureView view, boolean z10) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(view, "view");
        if (!z10) {
            view.removeOverlay(overlay);
            return;
        }
        ViewParent parent = overlay.getParent();
        Intrinsics.h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(overlay);
        view.addOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerHelper
    public final BarcodeCountBasicOverlay createBasicOverlay(BarcodeCount mode, BarcodeCountViewStyle style) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(style, "style");
        return BarcodeCountBasicOverlay.INSTANCE.newInstance(null, mode, BarcodeCountViewStyleExtensionKt.toOverlayStyle(style));
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerHelper
    public final BarcodeCount createMode(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        return BarcodeCount.INSTANCE.forDataCaptureContext(dataCaptureContext, new BarcodeCountSettings());
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerHelper
    public final BarcodeCountSettings createSettings() {
        return new BarcodeCountSettings();
    }
}
