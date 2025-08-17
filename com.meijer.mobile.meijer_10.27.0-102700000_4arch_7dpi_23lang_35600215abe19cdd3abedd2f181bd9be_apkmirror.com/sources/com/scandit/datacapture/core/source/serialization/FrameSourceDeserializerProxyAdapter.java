package com.scandit.datacapture.core.source.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerProxyAdapter;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;", "_NativeFrameSourceDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;)V", "_deserializer", "()Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;", "helper", "_setHelper", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;)V", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "listener", "_setListener", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;)V", "", "jsonData", "Lcom/scandit/datacapture/core/source/FrameSource;", "_frameSourceFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/source/FrameSource;", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "_frameSourceFromJsonValue", "(Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "updateFrameSourceFromJson", "(Lcom/scandit/datacapture/core/source/FrameSource;Ljava/lang/String;)Lcom/scandit/datacapture/core/source/FrameSource;", "updateFrameSourceFromJsonValue", "(Lcom/scandit/datacapture/core/source/FrameSource;Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/core/source/FrameSource;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "cameraSettingsFromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/source/CameraSettings;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "getWarnings", "()Ljava/util/List;", "warnings", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FrameSourceDeserializerProxyAdapter implements FrameSourceDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeFrameSourceDeserializer f125927a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private FrameSourceDeserializer f125929c;

    public FrameSourceDeserializerProxyAdapter(NativeFrameSourceDeserializer _NativeFrameSourceDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_NativeFrameSourceDeserializer, "_NativeFrameSourceDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125927a = _NativeFrameSourceDeserializer;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public void _setHelper(FrameSourceDeserializerHelper helper) {
        this.f125927a.setHelper(helper != null ? (FrameSourceDeserializerHelperReversedAdapter) this.proxyCache.getOrPut(Reflection.b(FrameSourceDeserializerHelper.class), null, helper, new j(helper)) : null);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public FrameSourceDeserializer _deserializer() {
        FrameSourceDeserializer frameSourceDeserializer = this.f125929c;
        if (frameSourceDeserializer != null) {
            return frameSourceDeserializer;
        }
        Intrinsics.y("_setDeserializer_backing_field");
        return null;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public FrameSource _frameSourceFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        NativeFrameSource nativeFrameSourceFrameSourceFromJson = this.f125927a.frameSourceFromJson(CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeFrameSource.class);
        Intrinsics.g(nativeFrameSourceFrameSourceFromJson);
        return (FrameSource) proxyCache.require(kClassB, null, nativeFrameSourceFrameSourceFromJson);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public FrameSource _frameSourceFromJsonValue(JsonValue json) {
        Intrinsics.j(json, "json");
        NativeJsonValue f125830a = json.getF125830a();
        this.proxyCache.put(Reflection.b(NativeJsonValue.class), null, f125830a, json);
        NativeFrameSource nativeFrameSourceFrameSourceFromJson = this.f125927a.frameSourceFromJson(f125830a);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeFrameSource.class);
        Intrinsics.g(nativeFrameSourceFrameSourceFromJson);
        return (FrameSource) proxyCache.require(kClassB, null, nativeFrameSourceFrameSourceFromJson);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    /* renamed from: _impl, reason: from getter */
    public NativeFrameSourceDeserializer getF125927a() {
        return this.f125927a;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public void _setDeserializer(FrameSourceDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f125929c = deserializer;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public void _setListener(FrameSourceDeserializerListener listener) {
        this.f125927a.setListener(listener != null ? (FrameSourceDeserializerListenerReversedAdapter) this.proxyCache.getOrPut(Reflection.b(FrameSourceDeserializerListener.class), this, listener, new k(listener, this)) : null);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public CameraSettings cameraSettingsFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeCameraSettings nativeCameraSettingsCameraSettingsFromJson = this.f125927a.cameraSettingsFromJson(coreNativeTypeFactory.convert(jsonData));
        Intrinsics.g(nativeCameraSettingsCameraSettingsFromJson);
        return coreNativeTypeFactory.convert(nativeCameraSettingsCameraSettingsFromJson);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public List<String> getWarnings() {
        ArrayList<String> warnings = this.f125927a.getWarnings();
        Intrinsics.g(warnings);
        return warnings;
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public FrameSource updateFrameSourceFromJson(FrameSource frameSource, String jsonData) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(jsonData, "jsonData");
        NativeFrameSource nativeFrameSource_frameSourceImpl = frameSource.getF125879c();
        this.proxyCache.put(Reflection.b(NativeFrameSource.class), null, nativeFrameSource_frameSourceImpl, frameSource);
        NativeFrameSource nativeFrameSourceUpdateFrameSourceFromJson = this.f125927a.updateFrameSourceFromJson(nativeFrameSource_frameSourceImpl, CoreNativeTypeFactory.INSTANCE.convert(jsonData));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeFrameSource.class);
        Intrinsics.g(nativeFrameSourceUpdateFrameSourceFromJson);
        return (FrameSource) proxyCache.require(kClassB, null, nativeFrameSourceUpdateFrameSourceFromJson);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public FrameSource updateFrameSourceFromJsonValue(FrameSource frameSource, JsonValue json) {
        Intrinsics.j(frameSource, "frameSource");
        Intrinsics.j(json, "json");
        NativeFrameSource nativeFrameSource_frameSourceImpl = frameSource.getF125879c();
        this.proxyCache.put(Reflection.b(NativeFrameSource.class), null, nativeFrameSource_frameSourceImpl, frameSource);
        NativeJsonValue f125830a = json.getF125830a();
        this.proxyCache.put(Reflection.b(NativeJsonValue.class), null, f125830a, json);
        NativeFrameSource nativeFrameSourceUpdateFrameSourceFromJson = this.f125927a.updateFrameSourceFromJson(nativeFrameSource_frameSourceImpl, f125830a);
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.b(NativeFrameSource.class);
        Intrinsics.g(nativeFrameSourceUpdateFrameSourceFromJson);
        return (FrameSource) proxyCache.require(kClassB, null, nativeFrameSourceUpdateFrameSourceFromJson);
    }

    public /* synthetic */ FrameSourceDeserializerProxyAdapter(NativeFrameSourceDeserializer nativeFrameSourceDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeFrameSourceDeserializer, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.core.source.serialization.FrameSourceDeserializerProxy
    public CameraSettings updateCameraSettingsFromJson(CameraSettings cameraSettings, String str) {
        return FrameSourceDeserializerProxy.DefaultImpls.updateCameraSettingsFromJson(this, cameraSettings, str);
    }
}
