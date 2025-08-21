package com.scandit.datacapture.barcode.internal.module.ar.serialization;

import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettings;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f implements BarcodeArViewSettingsDeserializer {
    @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.BarcodeArViewSettingsDeserializer
    public final void a(BarcodeArViewSettings settings, JsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        settings._updateFromJson(json);
    }
}
