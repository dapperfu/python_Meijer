package com.scandit.datacapture.core.source.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = FrameSourceDeserializer.class, value = NativeFrameSourceDeserializerListener.class)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "", "onCameraSettingsDeserializationFinished", "", "deserializer", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "settings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "onCameraSettingsDeserializationStarted", "onFrameSourceDeserializationFinished", "frameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "onFrameSourceDeserializationStarted", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FrameSourceDeserializerListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onCameraSettingsDeserializationFinished(FrameSourceDeserializerListener frameSourceDeserializerListener, FrameSourceDeserializer deserializer, CameraSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onCameraSettingsDeserializationStarted(FrameSourceDeserializerListener frameSourceDeserializerListener, FrameSourceDeserializer deserializer, CameraSettings settings, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(settings, "settings");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onFrameSourceDeserializationFinished(FrameSourceDeserializerListener frameSourceDeserializerListener, FrameSourceDeserializer deserializer, FrameSource frameSource, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(frameSource, "frameSource");
            Intrinsics.j(json, "json");
        }

        @ProxyFunction
        public static void onFrameSourceDeserializationStarted(FrameSourceDeserializerListener frameSourceDeserializerListener, FrameSourceDeserializer deserializer, FrameSource frameSource, JsonValue json) {
            Intrinsics.j(deserializer, "deserializer");
            Intrinsics.j(frameSource, "frameSource");
            Intrinsics.j(json, "json");
        }
    }

    @ProxyFunction
    void onCameraSettingsDeserializationFinished(FrameSourceDeserializer deserializer, CameraSettings settings, JsonValue json);

    @ProxyFunction
    void onCameraSettingsDeserializationStarted(FrameSourceDeserializer deserializer, CameraSettings settings, JsonValue json);

    @ProxyFunction
    void onFrameSourceDeserializationFinished(FrameSourceDeserializer deserializer, FrameSource frameSource, JsonValue json);

    @ProxyFunction
    void onFrameSourceDeserializationStarted(FrameSourceDeserializer deserializer, FrameSource frameSource, JsonValue json);
}
