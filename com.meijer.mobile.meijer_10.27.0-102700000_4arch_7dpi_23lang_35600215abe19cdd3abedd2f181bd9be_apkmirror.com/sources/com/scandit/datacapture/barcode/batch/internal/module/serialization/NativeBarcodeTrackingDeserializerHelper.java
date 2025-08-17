package com.scandit.datacapture.barcode.batch.internal.module.serialization;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeObjectTrackerScenario;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeTrackingDeserializerHelper {
    public abstract void applySettings(NativeBarcodeTracking nativeBarcodeTracking, NativeBarcodeTrackingSettings nativeBarcodeTrackingSettings);

    public abstract void changeAdvancedOverlayAddedToView(NativeBarcodeTrackingAdvancedOverlay nativeBarcodeTrackingAdvancedOverlay, NativeDataCaptureView nativeDataCaptureView, boolean z10);

    public abstract void changeBasicOverlayAddedToView(NativeBarcodeTrackingBasicOverlay nativeBarcodeTrackingBasicOverlay, NativeDataCaptureView nativeDataCaptureView, boolean z10);

    public abstract NativeBarcodeTrackingAdvancedOverlay createAdvancedOverlay(NativeBarcodeTracking nativeBarcodeTracking);

    public abstract NativeBarcodeTrackingBasicOverlay createBasicOverlay(NativeBarcodeTracking nativeBarcodeTracking, NativeBarcodeTrackingBasicOverlayStyle nativeBarcodeTrackingBasicOverlayStyle);

    public abstract NativeBarcodeTracking createMode(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract NativeCameraSettings createRecommendedCameraSettings();

    public abstract NativeBarcodeTrackingSettings createSettings();

    public abstract NativeBarcodeTrackingSettings createSettingsForScenario(NativeObjectTrackerScenario nativeObjectTrackerScenario);

    public abstract void updateAdvancedOverlayFromJson(NativeBarcodeTrackingAdvancedOverlay nativeBarcodeTrackingAdvancedOverlay, NativeJsonValue nativeJsonValue);

    public abstract void updateBasicOverlayFromJson(NativeBarcodeTrackingBasicOverlay nativeBarcodeTrackingBasicOverlay, NativeJsonValue nativeJsonValue);

    public abstract void updateModeFromJson(NativeBarcodeTracking nativeBarcodeTracking, NativeJsonValue nativeJsonValue);

    public abstract void updateSettingsFromJson(NativeBarcodeTrackingSettings nativeBarcodeTrackingSettings, NativeJsonValue nativeJsonValue);
}
