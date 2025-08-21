package com.scandit.datacapture.barcode.internal.module.find.serialization;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;

/* loaded from: classes12.dex */
public interface BarcodeFindDeserializerHelper extends DataCaptureDeserializerHelper {
    void a(BarcodeFind barcodeFind, BarcodeFindSettings barcodeFindSettings);

    void a(BarcodeFind barcodeFind, JsonValue jsonValue);

    void a(BarcodeFindSettings barcodeFindSettings, JsonValue jsonValue);

    BarcodeFind b();

    BarcodeFindSettings createSettings();
}
