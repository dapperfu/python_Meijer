package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.serialization.NativeBarcodeTrackingDeserializerListener;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodeBatchDeserializer.class, value = NativeBarcodeTrackingDeserializerListener.class)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializerListener;", "", "onAdvancedOverlayDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchDeserializer;", "overlay", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onAdvancedOverlayDeserializationStarted", "onBasicOverlayDeserializationFinished", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "onBasicOverlayDeserializationStarted", "onModeDeserializationFinished", "mode", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "onModeDeserializationStarted", "onSettingsDeserializationFinished", "settings", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "onSettingsDeserializationStarted", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeBatchDeserializerListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onAdvancedOverlayDeserializationFinished(BarcodeBatchDeserializerListener barcodeBatchDeserializerListener, BarcodeBatchDeserializer deserializer, BarcodeBatchAdvancedOverlay overlay, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onAdvancedOverlayDeserializationStarted(BarcodeBatchDeserializerListener barcodeBatchDeserializerListener, BarcodeBatchDeserializer deserializer, BarcodeBatchAdvancedOverlay overlay, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onBasicOverlayDeserializationFinished(BarcodeBatchDeserializerListener barcodeBatchDeserializerListener, BarcodeBatchDeserializer deserializer, BarcodeBatchBasicOverlay overlay, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onBasicOverlayDeserializationStarted(BarcodeBatchDeserializerListener barcodeBatchDeserializerListener, BarcodeBatchDeserializer deserializer, BarcodeBatchBasicOverlay overlay, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationFinished(BarcodeBatchDeserializerListener barcodeBatchDeserializerListener, BarcodeBatchDeserializer deserializer, BarcodeBatch mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationStarted(BarcodeBatchDeserializerListener barcodeBatchDeserializerListener, BarcodeBatchDeserializer deserializer, BarcodeBatch mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationFinished(BarcodeBatchDeserializerListener barcodeBatchDeserializerListener, BarcodeBatchDeserializer deserializer, BarcodeBatchSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationStarted(BarcodeBatchDeserializerListener barcodeBatchDeserializerListener, BarcodeBatchDeserializer deserializer, BarcodeBatchSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }
    }

    @ProxyFunction
    void onAdvancedOverlayDeserializationFinished(BarcodeBatchDeserializer deserializer, BarcodeBatchAdvancedOverlay overlay, JsonValue json);

    @ProxyFunction
    void onAdvancedOverlayDeserializationStarted(BarcodeBatchDeserializer deserializer, BarcodeBatchAdvancedOverlay overlay, JsonValue json);

    @ProxyFunction
    void onBasicOverlayDeserializationFinished(BarcodeBatchDeserializer deserializer, BarcodeBatchBasicOverlay overlay, JsonValue json);

    @ProxyFunction
    void onBasicOverlayDeserializationStarted(BarcodeBatchDeserializer deserializer, BarcodeBatchBasicOverlay overlay, JsonValue json);

    @ProxyFunction
    void onModeDeserializationFinished(BarcodeBatchDeserializer deserializer, BarcodeBatch mode, JsonValue json);

    @ProxyFunction
    void onModeDeserializationStarted(BarcodeBatchDeserializer deserializer, BarcodeBatch mode, JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationFinished(BarcodeBatchDeserializer deserializer, BarcodeBatchSettings settings, JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationStarted(BarcodeBatchDeserializer deserializer, BarcodeBatchSettings settings, JsonValue json);
}
