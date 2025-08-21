package com.scandit.datacapture.barcode.internal.module.serialization;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCaptureDeserializerListener {
    public abstract void onModeDeserializationFinished(NativeBarcodeCaptureDeserializer nativeBarcodeCaptureDeserializer, NativeBarcodeCapture nativeBarcodeCapture, NativeJsonValue nativeJsonValue);

    public abstract void onModeDeserializationStarted(NativeBarcodeCaptureDeserializer nativeBarcodeCaptureDeserializer, NativeBarcodeCapture nativeBarcodeCapture, NativeJsonValue nativeJsonValue);

    public abstract void onOverlayDeserializationFinished(NativeBarcodeCaptureDeserializer nativeBarcodeCaptureDeserializer, NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay, NativeJsonValue nativeJsonValue);

    public abstract void onOverlayDeserializationStarted(NativeBarcodeCaptureDeserializer nativeBarcodeCaptureDeserializer, NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay, NativeJsonValue nativeJsonValue);

    public abstract void onSettingsDeserializationFinished(NativeBarcodeCaptureDeserializer nativeBarcodeCaptureDeserializer, NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings, NativeJsonValue nativeJsonValue);

    public abstract void onSettingsDeserializationStarted(NativeBarcodeCaptureDeserializer nativeBarcodeCaptureDeserializer, NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings, NativeJsonValue nativeJsonValue);
}
