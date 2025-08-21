package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.selection.capture.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13405f implements BarcodeSelectionDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124763a;

    public C13405f(BarcodeSelectionDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f124763a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onBasicOverlayDeserializationFinished(BarcodeSelectionDeserializer deserializer, BarcodeSelectionBasicOverlay overlay, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124763a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getListener()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationFinished(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onBasicOverlayDeserializationStarted(BarcodeSelectionDeserializer deserializer, BarcodeSelectionBasicOverlay overlay, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124763a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getListener()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationStarted(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onModeDeserializationFinished(BarcodeSelectionDeserializer deserializer, BarcodeSelection mode, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124763a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onModeDeserializationStarted(BarcodeSelectionDeserializer deserializer, BarcodeSelection mode, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124763a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodeSelectionDeserializer deserializer, BarcodeSelectionSettings settings, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124763a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodeSelectionDeserializer deserializer, BarcodeSelectionSettings settings, JsonValue json) {
        BarcodeSelectionDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.f124763a.get();
        if (barcodeSelectionDeserializer == null || (listener = barcodeSelectionDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}
