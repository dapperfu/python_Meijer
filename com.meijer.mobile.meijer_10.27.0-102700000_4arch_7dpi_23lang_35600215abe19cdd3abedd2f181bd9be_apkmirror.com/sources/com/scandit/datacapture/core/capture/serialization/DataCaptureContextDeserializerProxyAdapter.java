package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerProxyAdapter;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;", "_NativeDataCaptureContextDeserializer", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;", "deserializer", "", "_setDeserializer", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;)V", "_deserializer", "()Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;", "helper", "_setHelper", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;)V", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", "listener", "_setListener", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "p0", "getAvoidThreadDependencies", "()Z", "setAvoidThreadDependencies", "(Z)V", "avoidThreadDependencies", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class DataCaptureContextDeserializerProxyAdapter implements DataCaptureContextDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataCaptureContextDeserializer f124088a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private DataCaptureContextDeserializer f124090c;

    public DataCaptureContextDeserializerProxyAdapter(NativeDataCaptureContextDeserializer _NativeDataCaptureContextDeserializer, ProxyCache proxyCache) {
        Intrinsics.j(_NativeDataCaptureContextDeserializer, "_NativeDataCaptureContextDeserializer");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124088a = _NativeDataCaptureContextDeserializer;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public void _setHelper(DataCaptureContextDeserializerHelper helper) {
        this.f124088a.setHelper(helper != null ? (DataCaptureContextDeserializerHelperReversedAdapter) this.proxyCache.getOrPut(Reflection.b(DataCaptureContextDeserializerHelper.class), null, helper, new n(helper)) : null);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public DataCaptureContextDeserializer _deserializer() {
        DataCaptureContextDeserializer dataCaptureContextDeserializer = this.f124090c;
        if (dataCaptureContextDeserializer != null) {
            return dataCaptureContextDeserializer;
        }
        Intrinsics.y("_setDeserializer_backing_field");
        return null;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    /* renamed from: _impl, reason: from getter */
    public NativeDataCaptureContextDeserializer getF124088a() {
        return this.f124088a;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public void _setDeserializer(DataCaptureContextDeserializer deserializer) {
        Intrinsics.j(deserializer, "deserializer");
        this.f124090c = deserializer;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public void _setListener(DataCaptureContextDeserializerListener listener) {
        this.f124088a.setListener(listener != null ? (DataCaptureContextDeserializerListenerReversedAdapter) this.proxyCache.getOrPut(Reflection.b(DataCaptureContextDeserializerListener.class), this, listener, new o(listener, this)) : null);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public boolean getAvoidThreadDependencies() {
        return this.f124088a.getAvoidThreadDependencies();
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public void setAvoidThreadDependencies(boolean z10) {
        this.f124088a.setAvoidThreadDependencies(z10);
    }

    public /* synthetic */ DataCaptureContextDeserializerProxyAdapter(NativeDataCaptureContextDeserializer nativeDataCaptureContextDeserializer, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDataCaptureContextDeserializer, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
