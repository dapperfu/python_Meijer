package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements DataCaptureContextDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f125048a;

    public a(DataCaptureContextDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f125048a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerListener
    public final void onContextDeserializationFinished(DataCaptureContextDeserializer deserializer, DataCaptureContext dataCaptureContext, JsonValue json) {
        DataCaptureContextDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(json, "json");
        DataCaptureContextDeserializer dataCaptureContextDeserializer = (DataCaptureContextDeserializer) this.f125048a.get();
        if (dataCaptureContextDeserializer == null || (listener = dataCaptureContextDeserializer.getListener()) == null) {
            return;
        }
        listener.onContextDeserializationFinished(deserializer, dataCaptureContext, json);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerListener
    public final void onContextDeserializationStarted(DataCaptureContextDeserializer deserializer, DataCaptureContext dataCaptureContext, JsonValue json) {
        DataCaptureContextDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(json, "json");
        DataCaptureContextDeserializer dataCaptureContextDeserializer = (DataCaptureContextDeserializer) this.f125048a.get();
        if (dataCaptureContextDeserializer == null || (listener = dataCaptureContextDeserializer.getListener()) == null) {
            return;
        }
        listener.onContextDeserializationStarted(deserializer, dataCaptureContext, json);
    }
}
