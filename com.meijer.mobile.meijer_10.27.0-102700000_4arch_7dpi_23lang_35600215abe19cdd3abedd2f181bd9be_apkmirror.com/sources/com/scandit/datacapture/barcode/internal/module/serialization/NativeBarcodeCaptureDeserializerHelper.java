package com.scandit.datacapture.barcode.internal.module.serialization;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.ui.overlay.NativeBarcodeCaptureOverlayStyle;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeCaptureDeserializerHelper {
    public abstract void applySettings(NativeBarcodeCapture nativeBarcodeCapture, NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings);

    public abstract void changeOverlayAddedToView(NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay, NativeDataCaptureView nativeDataCaptureView, boolean z10);

    public abstract NativeBarcodeCapture createMode(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract NativeBarcodeCaptureOverlay createOverlay(NativeBarcodeCapture nativeBarcodeCapture, NativeBarcodeCaptureOverlayStyle nativeBarcodeCaptureOverlayStyle);

    public abstract NativeCameraSettings createRecommendedCameraSettings();

    public abstract NativeBarcodeCaptureSettings createSettings();

    public abstract void updateModeFromJson(NativeBarcodeCapture nativeBarcodeCapture, NativeJsonValue nativeJsonValue);

    public abstract void updateOverlayFromJson(NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay, NativeJsonValue nativeJsonValue);

    public abstract void updateSettingsFromJson(NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings, NativeJsonValue nativeJsonValue);
}
