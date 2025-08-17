package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements BarcodePickDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123619a;

    public b(BarcodePickDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f123619a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerListener
    public final void onModeDeserializationFinished(BarcodePickDeserializer deserializer, BarcodePick mode, JsonValue json) {
        BarcodePickDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f123619a.get();
        if (barcodePickDeserializer == null || (listener = barcodePickDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerListener
    public final void onModeDeserializationStarted(BarcodePickDeserializer deserializer, BarcodePick mode, JsonValue json) {
        BarcodePickDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f123619a.get();
        if (barcodePickDeserializer == null || (listener = barcodePickDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodePickDeserializer deserializer, BarcodePickSettings settings, JsonValue json) {
        BarcodePickDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f123619a.get();
        if (barcodePickDeserializer == null || (listener = barcodePickDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodePickDeserializer deserializer, BarcodePickSettings settings, JsonValue json) {
        BarcodePickDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f123619a.get();
        if (barcodePickDeserializer == null || (listener = barcodePickDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}
