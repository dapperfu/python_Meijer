package com.scandit.datacapture.barcode.internal.module.ar.serialization;

import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeAr;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeArDeserializerHelper {
    public abstract void applySettings(NativeBarcodeAr nativeBarcodeAr, NativeBarcodeArSettings nativeBarcodeArSettings);

    public abstract NativeBarcodeAr createMode(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract NativeBarcodeArSettings createSettings();

    public abstract void updateModeFromJson(NativeBarcodeAr nativeBarcodeAr, NativeJsonValue nativeJsonValue);

    public abstract void updateSettingsFromJson(NativeBarcodeArSettings nativeBarcodeArSettings, NativeJsonValue nativeJsonValue);
}
