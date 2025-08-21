package com.scandit.datacapture.barcode.find.serialization;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializerListener;", "", "onModeDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindDeserializer;", "mode", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onModeDeserializationStarted", "onSettingsDeserializationFinished", "settings", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSettings;", "onSettingsDeserializationStarted", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeFindDeserializerListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onModeDeserializationFinished(BarcodeFindDeserializerListener barcodeFindDeserializerListener, BarcodeFindDeserializer deserializer, BarcodeFind mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        public static void onModeDeserializationStarted(BarcodeFindDeserializerListener barcodeFindDeserializerListener, BarcodeFindDeserializer deserializer, BarcodeFind mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        public static void onSettingsDeserializationFinished(BarcodeFindDeserializerListener barcodeFindDeserializerListener, BarcodeFindDeserializer deserializer, BarcodeFindSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }

        public static void onSettingsDeserializationStarted(BarcodeFindDeserializerListener barcodeFindDeserializerListener, BarcodeFindDeserializer deserializer, BarcodeFindSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }
    }

    void onModeDeserializationFinished(BarcodeFindDeserializer deserializer, BarcodeFind mode, JsonValue json);

    void onModeDeserializationStarted(BarcodeFindDeserializer deserializer, BarcodeFind mode, JsonValue json);

    void onSettingsDeserializationFinished(BarcodeFindDeserializer deserializer, BarcodeFindSettings settings, JsonValue json);

    void onSettingsDeserializationStarted(BarcodeFindDeserializer deserializer, BarcodeFindSettings settings, JsonValue json);
}
