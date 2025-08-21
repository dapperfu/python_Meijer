package com.scandit.datacapture.barcode.selection.internal.module.serialization;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAutoSelectionStrategy;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeManualSelectionStrategy;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection;
import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayStyle;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeSelectionDeserializerHelper {
    public abstract void applySettings(NativeBarcodeSelection nativeBarcodeSelection, NativeBarcodeSelectionSettings nativeBarcodeSelectionSettings);

    public abstract void changeBasicOverlayAddedToView(NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlay, NativeDataCaptureView nativeDataCaptureView, boolean z10);

    public abstract NativeAimerSelection createAimerSelection();

    public abstract NativeAutoSelectionStrategy createAutoSelectionStrategy();

    public abstract NativeBarcodeSelectionBasicOverlay createBasicOverlay(NativeBarcodeSelection nativeBarcodeSelection, BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle);

    public abstract NativeManualSelectionStrategy createManualSelectionStrategy();

    public abstract NativeBarcodeSelection createMode(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract NativeCameraSettings createRecommendedCameraSettings();

    public abstract NativeBarcodeSelectionSettings createSettings();

    public abstract NativeTapSelection createTapSelection();

    public abstract void updateBasicOverlayFromJson(NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlay, NativeJsonValue nativeJsonValue);

    public abstract void updateModeFromJson(NativeBarcodeSelection nativeBarcodeSelection, NativeJsonValue nativeJsonValue);

    public abstract void updateSettingsFromJson(NativeBarcodeSelectionSettings nativeBarcodeSelectionSettings, NativeJsonValue nativeJsonValue);
}
