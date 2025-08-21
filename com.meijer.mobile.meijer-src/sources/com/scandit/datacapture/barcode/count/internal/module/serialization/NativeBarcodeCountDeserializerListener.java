package com.scandit.datacapture.barcode.count.internal.module.serialization;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountDeserializerListener {
    public abstract void onBasicOverlayDeserializationFinished(NativeBarcodeCountDeserializer nativeBarcodeCountDeserializer, NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeJsonValue nativeJsonValue);

    public abstract void onBasicOverlayDeserializationStarted(NativeBarcodeCountDeserializer nativeBarcodeCountDeserializer, NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeJsonValue nativeJsonValue);

    public abstract void onModeDeserializationFinished(NativeBarcodeCountDeserializer nativeBarcodeCountDeserializer, NativeBarcodeCount nativeBarcodeCount, NativeJsonValue nativeJsonValue);

    public abstract void onModeDeserializationStarted(NativeBarcodeCountDeserializer nativeBarcodeCountDeserializer, NativeBarcodeCount nativeBarcodeCount, NativeJsonValue nativeJsonValue);

    public abstract void onSettingsDeserializationFinished(NativeBarcodeCountDeserializer nativeBarcodeCountDeserializer, NativeBarcodeCountSettings nativeBarcodeCountSettings, NativeJsonValue nativeJsonValue);

    public abstract void onSettingsDeserializationStarted(NativeBarcodeCountDeserializer nativeBarcodeCountDeserializer, NativeBarcodeCountSettings nativeBarcodeCountSettings, NativeJsonValue nativeJsonValue);
}
