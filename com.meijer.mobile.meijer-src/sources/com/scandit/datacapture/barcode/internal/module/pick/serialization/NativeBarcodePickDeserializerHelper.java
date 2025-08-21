package com.scandit.datacapture.barcode.internal.module.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodePickDeserializerHelper {
    public abstract void applySettings(NativeBarcodePick nativeBarcodePick, NativeBarcodePickSettings nativeBarcodePickSettings);

    public abstract NativeBarcodePickBasicOverlay createBasicOverlay(NativeBarcodePick nativeBarcodePick, NativeBarcodePickViewSettings nativeBarcodePickViewSettings);

    public abstract NativeBarcodePick createMode(NativeDataCaptureContext nativeDataCaptureContext, NativeProductProvider nativeProductProvider);

    public abstract NativeBarcodePickSettings createSettings();

    public abstract NativeBarcodePickViewSettings createViewSettings();

    public abstract void updateModeFromJson(NativeBarcodePick nativeBarcodePick, NativeJsonValue nativeJsonValue);

    public abstract void updateSettingsFromJson(NativeBarcodePickSettings nativeBarcodePickSettings, NativeJsonValue nativeJsonValue);

    public abstract void updateViewSettingsFromJson(NativeBarcodePickViewSettings nativeBarcodePickViewSettings, NativeJsonValue nativeJsonValue);
}
