package com.scandit.datacapture.barcode.internal.module.ar.serialization;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;

/* loaded from: classes11.dex */
public interface BarcodeArDeserializerHelper extends DataCaptureDeserializerHelper {
    void a(BarcodeAr barcodeAr, BarcodeArSettings barcodeArSettings);

    void a(BarcodeAr barcodeAr, JsonValue jsonValue);

    void a(BarcodeArSettings barcodeArSettings, JsonValue jsonValue);

    BarcodeAr createMode(DataCaptureContext dataCaptureContext);

    BarcodeArSettings createSettings();
}
