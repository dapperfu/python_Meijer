package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.capture.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13041e implements BarcodeCaptureDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120574a;

    public C13041e(BarcodeCaptureDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f120574a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onModeDeserializationFinished(BarcodeCaptureDeserializer deserializer, BarcodeCapture mode, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120574a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onModeDeserializationStarted(BarcodeCaptureDeserializer deserializer, BarcodeCapture mode, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120574a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onOverlayDeserializationFinished(BarcodeCaptureDeserializer deserializer, BarcodeCaptureOverlay overlay, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120574a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getListener()) == null) {
            return;
        }
        listener.onOverlayDeserializationFinished(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onOverlayDeserializationStarted(BarcodeCaptureDeserializer deserializer, BarcodeCaptureOverlay overlay, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120574a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getListener()) == null) {
            return;
        }
        listener.onOverlayDeserializationStarted(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodeCaptureDeserializer deserializer, BarcodeCaptureSettings settings, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120574a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodeCaptureDeserializer deserializer, BarcodeCaptureSettings settings, JsonValue json) {
        BarcodeCaptureDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.f120574a.get();
        if (barcodeCaptureDeserializer == null || (listener = barcodeCaptureDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}
