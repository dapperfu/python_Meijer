package com.scandit.datacapture.core.source.serialization;

import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements FrameSourceDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f125930a;

    public a(FrameSourceDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f125930a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerListener
    public final void onCameraSettingsDeserializationFinished(FrameSourceDeserializer deserializer, CameraSettings settings, JsonValue json) {
        FrameSourceDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f125930a.get();
        if (frameSourceDeserializer == null || (listener = frameSourceDeserializer.getListener()) == null) {
            return;
        }
        listener.onCameraSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerListener
    public final void onCameraSettingsDeserializationStarted(FrameSourceDeserializer deserializer, CameraSettings settings, JsonValue json) {
        FrameSourceDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f125930a.get();
        if (frameSourceDeserializer == null || (listener = frameSourceDeserializer.getListener()) == null) {
            return;
        }
        listener.onCameraSettingsDeserializationStarted(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerListener
    public final void onFrameSourceDeserializationFinished(FrameSourceDeserializer deserializer, FrameSource frameSource, JsonValue json) {
        FrameSourceDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f125930a.get();
        if (frameSourceDeserializer == null || (listener = frameSourceDeserializer.getListener()) == null) {
            return;
        }
        listener.onFrameSourceDeserializationFinished(deserializer, frameSource, json);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerListener
    public final void onFrameSourceDeserializationStarted(FrameSourceDeserializer deserializer, FrameSource frameSource, JsonValue json) {
        FrameSourceDeserializerListener listener;
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f125930a.get();
        if (frameSourceDeserializer == null || (listener = frameSourceDeserializer.getListener()) == null) {
            return;
        }
        listener.onFrameSourceDeserializationStarted(deserializer, frameSource, json);
    }
}
