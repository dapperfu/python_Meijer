package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextFrameListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextFrameListener;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextFrameListener;", "_DataCaptureContextFrameListener", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "_DataCaptureContext", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/capture/DataCaptureContextFrameListener;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "data", "", "onFrameProcessingStarted", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;)V", "onFrameProcessingFinished", "onObservationStarted", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;)V", "onObservationStopped", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class DataCaptureContextFrameListenerReversedAdapter extends NativeDataCaptureContextFrameListener {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContextFrameListener f124999a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f125001c;

    public /* synthetic */ DataCaptureContextFrameListenerReversedAdapter(DataCaptureContextFrameListener dataCaptureContextFrameListener, DataCaptureContext dataCaptureContext, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContextFrameListener, dataCaptureContext, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener
    public void onFrameProcessingFinished(NativeDataCaptureContext context, NativeFrameData data) {
        Intrinsics.j(context, "context");
        Intrinsics.j(data, "data");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125001c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new g(dataCaptureContext));
            Intrinsics.i(orPut, "getOrPut(...)");
            FrameData frameData = (FrameData) this.proxyCache.getOrPut(Reflection.b(NativeFrameData.class), null, data, new h(data));
            this.f124999a.onFrameProcessingFinished((DataCaptureContext) orPut, frameData);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener
    public void onFrameProcessingStarted(NativeDataCaptureContext context, NativeFrameData data) {
        Intrinsics.j(context, "context");
        Intrinsics.j(data, "data");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125001c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new i(dataCaptureContext));
            Intrinsics.i(orPut, "getOrPut(...)");
            FrameData frameData = (FrameData) this.proxyCache.getOrPut(Reflection.b(NativeFrameData.class), null, data, new j(data));
            this.f124999a.onFrameProcessingStarted((DataCaptureContext) orPut, frameData);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener
    public void onObservationStarted(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125001c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new k(dataCaptureContext));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f124999a.onObservationStarted((DataCaptureContext) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener
    public void onObservationStopped(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125001c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new l(dataCaptureContext));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f124999a.onObservationStopped((DataCaptureContext) orPut);
        }
    }

    public DataCaptureContextFrameListenerReversedAdapter(DataCaptureContextFrameListener _DataCaptureContextFrameListener, DataCaptureContext _DataCaptureContext, ProxyCache proxyCache) {
        Intrinsics.j(_DataCaptureContextFrameListener, "_DataCaptureContextFrameListener");
        Intrinsics.j(_DataCaptureContext, "_DataCaptureContext");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124999a = _DataCaptureContextFrameListener;
        this.proxyCache = proxyCache;
        this.f125001c = new WeakReference(_DataCaptureContext);
    }
}
