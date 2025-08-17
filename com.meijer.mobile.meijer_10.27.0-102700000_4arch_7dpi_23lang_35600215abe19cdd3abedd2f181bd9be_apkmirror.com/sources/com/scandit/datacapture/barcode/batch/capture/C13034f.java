package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlayStyle;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeObjectTrackerScenario;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.batch.capture.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13034f implements BarcodeBatchDeserializerHelper, DataCaptureDeserializerHelper {
    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final void updateAdvancedOverlayFromJson(BarcodeBatchAdvancedOverlay overlay, JsonValue json) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final void updateBasicOverlayFromJson(BarcodeBatchBasicOverlay overlay, JsonValue json) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final void updateModeFromJson(BarcodeBatch mode, JsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final void updateSettingsFromJson(BarcodeBatchSettings settings, JsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final void applySettings(BarcodeBatch mode, BarcodeBatchSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        BarcodeBatch.applySettings$default(mode, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final void changeAdvancedOverlayAddedToView(BarcodeBatchAdvancedOverlay overlay, DataCaptureView view, boolean z10) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(view, "view");
        if (z10) {
            view.addOverlay(overlay);
        } else {
            view.removeOverlay(overlay);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final void changeBasicOverlayAddedToView(BarcodeBatchBasicOverlay overlay, DataCaptureView view, boolean z10) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(view, "view");
        if (z10) {
            view.addOverlay(overlay);
        } else {
            view.removeOverlay(overlay);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final BarcodeBatchAdvancedOverlay createAdvancedOverlay(BarcodeBatch mode) {
        Intrinsics.j(mode, "mode");
        return BarcodeBatchAdvancedOverlay.INSTANCE.deserializerInstance$scandit_barcode_capture(mode, null);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final BarcodeBatchBasicOverlay createBasicOverlay(BarcodeBatch mode, BarcodeBatchBasicOverlayStyle style) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(style, "style");
        return BarcodeBatchBasicOverlay.INSTANCE.newInstance(mode, null, style);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final BarcodeBatch createMode(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        return BarcodeBatch.INSTANCE.forDataCaptureContext(dataCaptureContext, new BarcodeBatchSettings());
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final CameraSettings createRecommendedCameraSettings() {
        return BarcodeBatch.INSTANCE.createRecommendedCameraSettings();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final BarcodeBatchSettings createSettings() {
        return new BarcodeBatchSettings();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerHelper
    public final BarcodeBatchSettings createSettingsForScenario(NativeObjectTrackerScenario scenario) {
        Intrinsics.j(scenario, "scenario");
        return new BarcodeBatchSettings();
    }
}
