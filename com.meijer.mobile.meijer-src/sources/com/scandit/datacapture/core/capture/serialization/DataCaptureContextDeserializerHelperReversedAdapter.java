package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextSettings;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J_\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerHelper;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;", "dataCaptureContextDeserializerHelper", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "", "licenseKey", "deviceName", "externalId", "frameworkName", "frameworkVersion", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;", "settings", "deviceOS", "browser", "browserVersion", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "createContext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "updateContextFromJson", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "c", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "m", "removeModeFromContext", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;)V", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "f", "setFrameSourceOnContext", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class DataCaptureContextDeserializerHelperReversedAdapter extends NativeDataCaptureContextDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContextDeserializerHelper f125035a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public /* synthetic */ DataCaptureContextDeserializerHelperReversedAdapter(DataCaptureContextDeserializerHelper dataCaptureContextDeserializerHelper, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContextDeserializerHelper, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper
    public NativeDataCaptureContext createContext(String licenseKey, String deviceName, String externalId, String frameworkName, String frameworkVersion, NativeDataCaptureContextSettings settings, String deviceOS, String browser, String browserVersion) {
        Intrinsics.j(licenseKey, "licenseKey");
        Intrinsics.j(deviceName, "deviceName");
        Intrinsics.j(externalId, "externalId");
        Intrinsics.j(frameworkName, "frameworkName");
        Intrinsics.j(settings, "settings");
        DataCaptureContext dataCaptureContextCreateContext = this.f125035a.createContext(licenseKey, deviceName, externalId, frameworkName, frameworkVersion, (DataCaptureContextSettings) this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContextSettings.class), null, settings, new c(settings)), deviceOS, browser, browserVersion);
        this.proxyCache.put(Reflection.b(DataCaptureContext.class), null, dataCaptureContextCreateContext, dataCaptureContextCreateContext._impl());
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContextCreateContext._impl();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContextCreateContext);
        return nativeDataCaptureContext_impl;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper
    public void removeModeFromContext(NativeDataCaptureContext c10, NativeDataCaptureMode m10) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(m10, "m");
        this.f125035a.removeModeFromContext((DataCaptureContext) this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, c10, new d(c10)), (DataCaptureMode) this.proxyCache.require(Reflection.b(NativeDataCaptureMode.class), null, m10));
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper
    public void setFrameSourceOnContext(NativeDataCaptureContext c10, NativeFrameSource f10) {
        Intrinsics.j(c10, "c");
        this.f125035a.setFrameSourceOnContext((DataCaptureContext) this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, c10, new e(c10)), f10 != null ? (FrameSource) this.proxyCache.require(Reflection.b(NativeFrameSource.class), null, f10) : null);
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerHelper
    public void updateContextFromJson(NativeDataCaptureContext context, NativeJsonValue json) {
        Intrinsics.j(context, "context");
        Intrinsics.j(json, "json");
        this.f125035a.updateContextFromJson((DataCaptureContext) this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new f(context)), (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new g(json)));
    }

    public DataCaptureContextDeserializerHelperReversedAdapter(DataCaptureContextDeserializerHelper dataCaptureContextDeserializerHelper, ProxyCache proxyCache) {
        Intrinsics.j(dataCaptureContextDeserializerHelper, "dataCaptureContextDeserializerHelper");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125035a = dataCaptureContextDeserializerHelper;
        this.proxyCache = proxyCache;
    }
}
