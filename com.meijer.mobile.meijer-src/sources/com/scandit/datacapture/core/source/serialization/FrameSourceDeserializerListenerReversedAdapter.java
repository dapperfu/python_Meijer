package com.scandit.datacapture.core.source.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializerListener;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "_FrameSourceDeserializerListener", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "_FrameSourceDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;", "deserializer", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "frameSource", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onFrameSourceDeserializationStarted", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "settings", "onCameraSettingsDeserializationStarted", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onCameraSettingsDeserializationFinished", "onFrameSourceDeserializationFinished", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class FrameSourceDeserializerListenerReversedAdapter extends NativeFrameSourceDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final FrameSourceDeserializerListener f126876a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f126878c;

    public /* synthetic */ FrameSourceDeserializerListenerReversedAdapter(FrameSourceDeserializerListener frameSourceDeserializerListener, FrameSourceDeserializer frameSourceDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameSourceDeserializerListener, frameSourceDeserializer, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener
    public void onCameraSettingsDeserializationFinished(NativeFrameSourceDeserializer deserializer, NativeCameraSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f126878c.get();
        if (frameSourceDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeFrameSourceDeserializer.class), null, deserializer, new b(frameSourceDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            CameraSettings cameraSettingsConvert = CoreNativeTypeFactory.INSTANCE.convert(settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new c(json));
            this.f126876a.onCameraSettingsDeserializationFinished((FrameSourceDeserializer) orPut, cameraSettingsConvert, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener
    public void onCameraSettingsDeserializationStarted(NativeFrameSourceDeserializer deserializer, NativeCameraSettings settings, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f126878c.get();
        if (frameSourceDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeFrameSourceDeserializer.class), null, deserializer, new d(frameSourceDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            CameraSettings cameraSettingsConvert = CoreNativeTypeFactory.INSTANCE.convert(settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new e(json));
            this.f126876a.onCameraSettingsDeserializationStarted((FrameSourceDeserializer) orPut, cameraSettingsConvert, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener
    public void onFrameSourceDeserializationFinished(NativeFrameSourceDeserializer deserializer, NativeFrameSource frameSource, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f126878c.get();
        if (frameSourceDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeFrameSourceDeserializer.class), null, deserializer, new f(frameSourceDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            FrameSource frameSource2 = (FrameSource) this.proxyCache.require(Reflection.b(NativeFrameSource.class), null, frameSource);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new g(json));
            this.f126876a.onFrameSourceDeserializationFinished((FrameSourceDeserializer) orPut, frameSource2, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener
    public void onFrameSourceDeserializationStarted(NativeFrameSourceDeserializer deserializer, NativeFrameSource frameSource, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.f126878c.get();
        if (frameSourceDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeFrameSourceDeserializer.class), null, deserializer, new h(frameSourceDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            FrameSource frameSource2 = (FrameSource) this.proxyCache.require(Reflection.b(NativeFrameSource.class), null, frameSource);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new i(json));
            this.f126876a.onFrameSourceDeserializationStarted((FrameSourceDeserializer) orPut, frameSource2, jsonValue);
        }
    }

    public FrameSourceDeserializerListenerReversedAdapter(FrameSourceDeserializerListener _FrameSourceDeserializerListener, FrameSourceDeserializer _FrameSourceDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_FrameSourceDeserializerListener, "_FrameSourceDeserializerListener");
        Intrinsics.j(_FrameSourceDeserializer, "_FrameSourceDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f126876a = _FrameSourceDeserializerListener;
        this.proxyCache = proxyCache;
        this.f126878c = new WeakReference(_FrameSourceDeserializer);
    }
}
