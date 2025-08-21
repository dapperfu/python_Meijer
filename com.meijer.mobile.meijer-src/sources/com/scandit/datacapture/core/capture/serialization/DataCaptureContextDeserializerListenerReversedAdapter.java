package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerListener;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerListener;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", "_DataCaptureContextDeserializerListener", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;", "_DataCaptureContextDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;", "deserializer", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onContextDeserializationStarted", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;)V", "onContextDeserializationFinished", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class DataCaptureContextDeserializerListenerReversedAdapter extends NativeDataCaptureContextDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContextDeserializerListener f125037a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f125039c;

    public /* synthetic */ DataCaptureContextDeserializerListenerReversedAdapter(DataCaptureContextDeserializerListener dataCaptureContextDeserializerListener, DataCaptureContextDeserializer dataCaptureContextDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContextDeserializerListener, dataCaptureContextDeserializer, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerListener
    public void onContextDeserializationFinished(NativeDataCaptureContextDeserializer deserializer, NativeDataCaptureContext context, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(context, "context");
        Intrinsics.j(json, "json");
        DataCaptureContextDeserializer dataCaptureContextDeserializer = (DataCaptureContextDeserializer) this.f125039c.get();
        if (dataCaptureContextDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContextDeserializer.class), null, deserializer, new h(dataCaptureContextDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            DataCaptureContext dataCaptureContext = (DataCaptureContext) this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new i(context));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new j(json));
            this.f125037a.onContextDeserializationFinished((DataCaptureContextDeserializer) orPut, dataCaptureContext, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerListener
    public void onContextDeserializationStarted(NativeDataCaptureContextDeserializer deserializer, NativeDataCaptureContext context, NativeJsonValue json) {
        Intrinsics.j(deserializer, "deserializer");
        Intrinsics.j(context, "context");
        Intrinsics.j(json, "json");
        DataCaptureContextDeserializer dataCaptureContextDeserializer = (DataCaptureContextDeserializer) this.f125039c.get();
        if (dataCaptureContextDeserializer != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContextDeserializer.class), null, deserializer, new k(dataCaptureContextDeserializer));
            Intrinsics.i(orPut, "getOrPut(...)");
            DataCaptureContext dataCaptureContext = (DataCaptureContext) this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new l(context));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(Reflection.b(NativeJsonValue.class), null, json, new m(json));
            this.f125037a.onContextDeserializationStarted((DataCaptureContextDeserializer) orPut, dataCaptureContext, jsonValue);
        }
    }

    public DataCaptureContextDeserializerListenerReversedAdapter(DataCaptureContextDeserializerListener _DataCaptureContextDeserializerListener, DataCaptureContextDeserializer _DataCaptureContextDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_DataCaptureContextDeserializerListener, "_DataCaptureContextDeserializerListener");
        Intrinsics.j(_DataCaptureContextDeserializer, "_DataCaptureContextDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125037a = _DataCaptureContextDeserializerListener;
        this.proxyCache = proxyCache;
        this.f125039c = new WeakReference(_DataCaptureContextDeserializer);
    }
}
