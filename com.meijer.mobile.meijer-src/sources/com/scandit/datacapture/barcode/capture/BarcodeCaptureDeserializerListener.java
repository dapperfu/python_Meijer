package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodeCaptureDeserializer.class, value = NativeBarcodeCaptureDeserializerListener.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListener;", "", "onModeDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;", "mode", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onModeDeserializationStarted", "onOverlayDeserializationFinished", "overlay", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlay;", "onOverlayDeserializationStarted", "onSettingsDeserializationFinished", "settings", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "onSettingsDeserializationStarted", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeCaptureDeserializerListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onModeDeserializationFinished(BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, BarcodeCaptureDeserializer deserializer, BarcodeCapture mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onModeDeserializationStarted(BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, BarcodeCaptureDeserializer deserializer, BarcodeCapture mode, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(mode, "mode");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onOverlayDeserializationFinished(BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, BarcodeCaptureDeserializer deserializer, BarcodeCaptureOverlay overlay, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onOverlayDeserializationStarted(BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, BarcodeCaptureDeserializer deserializer, BarcodeCaptureOverlay overlay, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationFinished(BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, BarcodeCaptureDeserializer deserializer, BarcodeCaptureSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onSettingsDeserializationStarted(BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, BarcodeCaptureDeserializer deserializer, BarcodeCaptureSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }
    }

    @ProxyFunction
    void onModeDeserializationFinished(BarcodeCaptureDeserializer deserializer, BarcodeCapture mode, JsonValue json);

    @ProxyFunction
    void onModeDeserializationStarted(BarcodeCaptureDeserializer deserializer, BarcodeCapture mode, JsonValue json);

    @ProxyFunction
    void onOverlayDeserializationFinished(BarcodeCaptureDeserializer deserializer, BarcodeCaptureOverlay overlay, JsonValue json);

    @ProxyFunction
    void onOverlayDeserializationStarted(BarcodeCaptureDeserializer deserializer, BarcodeCaptureOverlay overlay, JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationFinished(BarcodeCaptureDeserializer deserializer, BarcodeCaptureSettings settings, JsonValue json);

    @ProxyFunction
    void onSettingsDeserializationStarted(BarcodeCaptureDeserializer deserializer, BarcodeCaptureSettings settings, JsonValue json);
}
