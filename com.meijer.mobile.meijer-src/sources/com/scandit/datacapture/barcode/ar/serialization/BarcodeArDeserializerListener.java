package com.scandit.datacapture.barcode.ar.serialization;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializerListener;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodeArDeserializer.class, value = NativeBarcodeArDeserializerListener.class)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializerListener;", "", "onModeDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArDeserializer;", "mode", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onModeDeserializationStarted", "onSettingsDeserializationFinished", "settings", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "onSettingsDeserializationStarted", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeArDeserializerListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onModeDeserializationFinished(BarcodeArDeserializerListener barcodeArDeserializerListener, BarcodeArDeserializer deserializer, BarcodeAr mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationStarted(BarcodeArDeserializerListener barcodeArDeserializerListener, BarcodeArDeserializer deserializer, BarcodeAr mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationFinished(BarcodeArDeserializerListener barcodeArDeserializerListener, BarcodeArDeserializer deserializer, BarcodeArSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationStarted(BarcodeArDeserializerListener barcodeArDeserializerListener, BarcodeArDeserializer deserializer, BarcodeArSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }
    }

    @ProxyFunction
    void onModeDeserializationFinished(BarcodeArDeserializer deserializer, BarcodeAr mode, JsonValue json);

    @ProxyFunction
    void onModeDeserializationStarted(BarcodeArDeserializer deserializer, BarcodeAr mode, JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationFinished(BarcodeArDeserializer deserializer, BarcodeArSettings settings, JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationStarted(BarcodeArDeserializer deserializer, BarcodeArSettings settings, JsonValue json);
}
