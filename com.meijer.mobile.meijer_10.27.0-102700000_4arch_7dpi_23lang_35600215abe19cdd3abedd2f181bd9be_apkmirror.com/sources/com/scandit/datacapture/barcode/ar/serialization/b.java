package com.scandit.datacapture.barcode.ar.serialization;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements BarcodeArDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120122a;

    public b(BarcodeArDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f120122a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerListener
    public final void onModeDeserializationFinished(BarcodeArDeserializer deserializer, BarcodeAr mode, JsonValue json) {
        BarcodeArDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeArDeserializer barcodeArDeserializer = (BarcodeArDeserializer) this.f120122a.get();
        if (barcodeArDeserializer == null || (listener = barcodeArDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerListener
    public final void onModeDeserializationStarted(BarcodeArDeserializer deserializer, BarcodeAr mode, JsonValue json) {
        BarcodeArDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        BarcodeArDeserializer barcodeArDeserializer = (BarcodeArDeserializer) this.f120122a.get();
        if (barcodeArDeserializer == null || (listener = barcodeArDeserializer.getListener()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodeArDeserializer deserializer, BarcodeArSettings settings, JsonValue json) {
        BarcodeArDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeArDeserializer barcodeArDeserializer = (BarcodeArDeserializer) this.f120122a.get();
        if (barcodeArDeserializer == null || (listener = barcodeArDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.ar.serialization.BarcodeArDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodeArDeserializer deserializer, BarcodeArSettings settings, JsonValue json) {
        BarcodeArDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        BarcodeArDeserializer barcodeArDeserializer = (BarcodeArDeserializer) this.f120122a.get();
        if (barcodeArDeserializer == null || (listener = barcodeArDeserializer.getListener()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}
