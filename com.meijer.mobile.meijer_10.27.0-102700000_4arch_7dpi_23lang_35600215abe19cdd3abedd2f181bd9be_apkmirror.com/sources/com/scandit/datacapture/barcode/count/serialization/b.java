package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements BarcodeCountDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120740a;

    public b(BarcodeCountDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f120740a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onBasicOverlayDeserializationFinished(BarcodeCountDeserializer deserializer, BarcodeCountBasicOverlay overlay, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f120740a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getListener()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationFinished(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onBasicOverlayDeserializationStarted(BarcodeCountDeserializer deserializer, BarcodeCountBasicOverlay overlay, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f120740a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getListener()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationStarted(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onModeDeserializationFinished(BarcodeCountDeserializer deserializer, BarcodeCount mode, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f120740a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onModeDeserializationStarted(BarcodeCountDeserializer deserializer, BarcodeCount mode, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f120740a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodeCountDeserializer deserializer, BarcodeCountSettings settings, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f120740a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodeCountDeserializer deserializer, BarcodeCountSettings settings, JsonValue json) {
        BarcodeCountDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.f120740a.get();
        if (barcodeCountDeserializer == null || (listener = barcodeCountDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}
