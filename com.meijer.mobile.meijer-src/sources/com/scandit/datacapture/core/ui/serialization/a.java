package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements DataCaptureViewDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f127105a;

    public a(DataCaptureViewDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f127105a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerListener
    public final void onViewDeserializationFinished(DataCaptureViewDeserializer deserializer, DataCaptureView view, JsonValue json) {
        DataCaptureViewDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(view, "view");
        Intrinsics.j(json, "json");
        DataCaptureViewDeserializer dataCaptureViewDeserializer = (DataCaptureViewDeserializer) this.f127105a.get();
        if (dataCaptureViewDeserializer == null || (listener = dataCaptureViewDeserializer.getListener()) == null) {
            return;
        }
        listener.onViewDeserializationFinished(deserializer, view, json);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerListener
    public final void onViewDeserializationStarted(DataCaptureViewDeserializer deserializer, DataCaptureView view, JsonValue json) {
        DataCaptureViewDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(view, "view");
        Intrinsics.j(json, "json");
        DataCaptureViewDeserializer dataCaptureViewDeserializer = (DataCaptureViewDeserializer) this.f127105a.get();
        if (dataCaptureViewDeserializer == null || (listener = dataCaptureViewDeserializer.getListener()) == null) {
            return;
        }
        listener.onViewDeserializationStarted(deserializer, view, json);
    }
}
