package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodePickDeserializer.class, value = NativeBarcodePickDeserializerListener.class)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;", "", "onModeDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "mode", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onModeDeserializationStarted", "onSettingsDeserializationFinished", "settings", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "onSettingsDeserializationStarted", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodePickDeserializerListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onModeDeserializationFinished(BarcodePickDeserializerListener barcodePickDeserializerListener, BarcodePickDeserializer deserializer, BarcodePick mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationStarted(BarcodePickDeserializerListener barcodePickDeserializerListener, BarcodePickDeserializer deserializer, BarcodePick mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationFinished(BarcodePickDeserializerListener barcodePickDeserializerListener, BarcodePickDeserializer deserializer, BarcodePickSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationStarted(BarcodePickDeserializerListener barcodePickDeserializerListener, BarcodePickDeserializer deserializer, BarcodePickSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }
    }

    @ProxyFunction
    void onModeDeserializationFinished(BarcodePickDeserializer deserializer, BarcodePick mode, JsonValue json);

    @ProxyFunction
    void onModeDeserializationStarted(BarcodePickDeserializer deserializer, BarcodePick mode, JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationFinished(BarcodePickDeserializer deserializer, BarcodePickSettings settings, JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationStarted(BarcodePickDeserializer deserializer, BarcodePickSettings settings, JsonValue json);
}
