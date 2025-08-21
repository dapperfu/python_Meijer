package com.scandit.datacapture.barcode.count.internal.module.serialization;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountDeserializerHelper {
    public abstract void applySettings(NativeBarcodeCount nativeBarcodeCount, NativeBarcodeCountSettings nativeBarcodeCountSettings);

    public abstract void changeBasicOverlayAddedToView(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeDataCaptureView nativeDataCaptureView, boolean z10);

    public abstract NativeBarcodeCountBasicOverlay createBasicOverlay(NativeBarcodeCount nativeBarcodeCount, NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyle);

    public abstract NativeBarcodeCount createMode(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract NativeBarcodeCountSettings createSettings();

    public abstract void updateBasicOverlayFromJson(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeJsonValue nativeJsonValue);

    public abstract void updateModeFromJson(NativeBarcodeCount nativeBarcodeCount, NativeJsonValue nativeJsonValue);

    public abstract void updateSettingsFromJson(NativeBarcodeCountSettings nativeBarcodeCountSettings, NativeJsonValue nativeJsonValue);
}
