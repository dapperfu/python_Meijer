package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlay;
import com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.batch.capture.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13033e implements BarcodeBatchDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120447a;

    public C13033e(BarcodeBatchDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f120447a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerListener
    public final void onAdvancedOverlayDeserializationFinished(BarcodeBatchDeserializer deserializer, BarcodeBatchAdvancedOverlay overlay, JsonValue json) {
        BarcodeBatchDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f120447a.get();
        if (barcodeBatchDeserializer == null || (listener = barcodeBatchDeserializer.getListener()) == null) {
            return;
        }
        listener.onAdvancedOverlayDeserializationFinished(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerListener
    public final void onAdvancedOverlayDeserializationStarted(BarcodeBatchDeserializer deserializer, BarcodeBatchAdvancedOverlay overlay, JsonValue json) {
        BarcodeBatchDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f120447a.get();
        if (barcodeBatchDeserializer == null || (listener = barcodeBatchDeserializer.getListener()) == null) {
            return;
        }
        listener.onAdvancedOverlayDeserializationStarted(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerListener
    public final void onBasicOverlayDeserializationFinished(BarcodeBatchDeserializer deserializer, BarcodeBatchBasicOverlay overlay, JsonValue json) {
        BarcodeBatchDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f120447a.get();
        if (barcodeBatchDeserializer == null || (listener = barcodeBatchDeserializer.getListener()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationFinished(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerListener
    public final void onBasicOverlayDeserializationStarted(BarcodeBatchDeserializer deserializer, BarcodeBatchBasicOverlay overlay, JsonValue json) {
        BarcodeBatchDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f120447a.get();
        if (barcodeBatchDeserializer == null || (listener = barcodeBatchDeserializer.getListener()) == null) {
            return;
        }
        listener.onBasicOverlayDeserializationStarted(deserializer, overlay, json);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerListener
    public final void onModeDeserializationFinished(BarcodeBatchDeserializer deserializer, BarcodeBatch mode, JsonValue json) {
        BarcodeBatchDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f120447a.get();
        if (barcodeBatchDeserializer == null || (listener = barcodeBatchDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerListener
    public final void onModeDeserializationStarted(BarcodeBatchDeserializer deserializer, BarcodeBatch mode, JsonValue json) {
        BarcodeBatchDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f120447a.get();
        if (barcodeBatchDeserializer == null || (listener = barcodeBatchDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodeBatchDeserializer deserializer, BarcodeBatchSettings settings, JsonValue json) {
        BarcodeBatchDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f120447a.get();
        if (barcodeBatchDeserializer == null || (listener = barcodeBatchDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodeBatchDeserializer deserializer, BarcodeBatchSettings settings, JsonValue json) {
        BarcodeBatchDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeBatchDeserializer barcodeBatchDeserializer = (BarcodeBatchDeserializer) this.f120447a.get();
        if (barcodeBatchDeserializer == null || (listener = barcodeBatchDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}
