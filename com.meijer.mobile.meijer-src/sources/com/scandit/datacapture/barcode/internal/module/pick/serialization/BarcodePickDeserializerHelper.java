package com.scandit.datacapture.barcode.internal.module.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;

/* loaded from: classes12.dex */
public interface BarcodePickDeserializerHelper extends DataCaptureDeserializerHelper {
    BarcodePickBasicOverlay a(BarcodePick barcodePick, BarcodePickViewSettings barcodePickViewSettings);

    BarcodePick a(DataCaptureContext dataCaptureContext, BarcodePickProductProvider barcodePickProductProvider);

    BarcodePickViewSettings a();

    void a(BarcodePick barcodePick, BarcodePickSettings barcodePickSettings);

    void a(BarcodePick barcodePick, JsonValue jsonValue);

    void a(BarcodePickSettings barcodePickSettings, JsonValue jsonValue);

    void a(BarcodePickViewSettings barcodePickViewSettings, JsonValue jsonValue);

    BarcodePickSettings createSettings();
}
