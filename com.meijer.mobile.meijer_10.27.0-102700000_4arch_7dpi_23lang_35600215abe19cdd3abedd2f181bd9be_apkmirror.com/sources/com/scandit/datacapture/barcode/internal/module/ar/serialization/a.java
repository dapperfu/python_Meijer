package com.scandit.datacapture.barcode.internal.module.ar.serialization;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeArFeedbackDeserializer;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements BarcodeArDeserializerHelper {
    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.BarcodeArDeserializerHelper
    public final void a(BarcodeArSettings settings, JsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.BarcodeArDeserializerHelper
    public final void a(BarcodeAr mode, BarcodeArSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        BarcodeAr.applySettings$default(mode, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.BarcodeArDeserializerHelper
    public final BarcodeAr createMode(DataCaptureContext context) {
        Intrinsics.j(context, "context");
        return new BarcodeAr(context, new BarcodeArSettings());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.BarcodeArDeserializerHelper
    public final BarcodeArSettings createSettings() {
        return new BarcodeArSettings();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.BarcodeArDeserializerHelper
    public final void a(BarcodeAr mode, JsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        if (json.contains("feedback")) {
            mode.setFeedback(BarcodeArFeedbackDeserializer.fromJson(json.requireByKey("feedback")));
        }
    }
}
