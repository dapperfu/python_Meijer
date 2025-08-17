package com.scandit.datacapture.barcode.internal.module.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickDeserializerListener {
    public abstract void onModeDeserializationFinished(NativeBarcodePickDeserializer nativeBarcodePickDeserializer, NativeBarcodePick nativeBarcodePick, NativeJsonValue nativeJsonValue);

    public abstract void onModeDeserializationStarted(NativeBarcodePickDeserializer nativeBarcodePickDeserializer, NativeBarcodePick nativeBarcodePick, NativeJsonValue nativeJsonValue);

    public abstract void onSettingsDeserializationFinished(NativeBarcodePickDeserializer nativeBarcodePickDeserializer, NativeBarcodePickSettings nativeBarcodePickSettings, NativeJsonValue nativeJsonValue);

    public abstract void onSettingsDeserializationStarted(NativeBarcodePickDeserializer nativeBarcodePickDeserializer, NativeBarcodePickSettings nativeBarcodePickSettings, NativeJsonValue nativeJsonValue);
}
