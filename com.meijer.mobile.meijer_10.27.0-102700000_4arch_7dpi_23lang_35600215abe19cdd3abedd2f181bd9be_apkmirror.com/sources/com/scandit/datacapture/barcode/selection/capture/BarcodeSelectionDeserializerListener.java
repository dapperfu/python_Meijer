package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodeSelectionDeserializer.class, value = NativeBarcodeSelectionDeserializerListener.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;", "", "onBasicOverlayDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;", "overlay", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onBasicOverlayDeserializationStarted", "onModeDeserializationFinished", "mode", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "onModeDeserializationStarted", "onSettingsDeserializationFinished", "settings", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "onSettingsDeserializationStarted", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeSelectionDeserializerListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onBasicOverlayDeserializationFinished(BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, BarcodeSelectionDeserializer deserializer, BarcodeSelectionBasicOverlay overlay, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onBasicOverlayDeserializationStarted(BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, BarcodeSelectionDeserializer deserializer, BarcodeSelectionBasicOverlay overlay, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationFinished(BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, BarcodeSelectionDeserializer deserializer, BarcodeSelection mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationStarted(BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, BarcodeSelectionDeserializer deserializer, BarcodeSelection mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationFinished(BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, BarcodeSelectionDeserializer deserializer, BarcodeSelectionSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationStarted(BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, BarcodeSelectionDeserializer deserializer, BarcodeSelectionSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }
    }

    @ProxyFunction
    void onBasicOverlayDeserializationFinished(BarcodeSelectionDeserializer deserializer, BarcodeSelectionBasicOverlay overlay, JsonValue json);

    @ProxyFunction
    void onBasicOverlayDeserializationStarted(BarcodeSelectionDeserializer deserializer, BarcodeSelectionBasicOverlay overlay, JsonValue json);

    @ProxyFunction
    void onModeDeserializationFinished(BarcodeSelectionDeserializer deserializer, BarcodeSelection mode, JsonValue json);

    @ProxyFunction
    void onModeDeserializationStarted(BarcodeSelectionDeserializer deserializer, BarcodeSelection mode, JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationFinished(BarcodeSelectionDeserializer deserializer, BarcodeSelectionSettings settings, JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationStarted(BarcodeSelectionDeserializer deserializer, BarcodeSelectionSettings settings, JsonValue json);
}
