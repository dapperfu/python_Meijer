package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatus;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextListener;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextListener;", "contextListener", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "captureContext", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/capture/DataCaptureContextListener;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "source", "", "onFrameSourceChanged", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;)V", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "mode", "onModeAdded", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;)V", "onModeRemoved", "Lcom/scandit/datacapture/core/internal/sdk/common/NativeContextStatus;", "status", "onStatusChanged", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/core/internal/sdk/common/NativeContextStatus;)V", "onObservationStarted", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;)V", "onObservationStopped", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class DataCaptureContextListenerReversedAdapter extends NativeDataCaptureContextListener {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContextListener f125002a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f125004c;

    public /* synthetic */ DataCaptureContextListenerReversedAdapter(DataCaptureContextListener dataCaptureContextListener, DataCaptureContext dataCaptureContext, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContextListener, dataCaptureContext, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onFrameSourceChanged(NativeDataCaptureContext context, NativeFrameSource source) {
        Intrinsics.j(context, "context");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125004c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new m(dataCaptureContext));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f125002a.onFrameSourceChanged((DataCaptureContext) orPut, source != null ? (FrameSource) this.proxyCache.require(Reflection.b(NativeFrameSource.class), null, source) : null);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onModeAdded(NativeDataCaptureContext context, NativeDataCaptureMode mode) {
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125004c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new n(dataCaptureContext));
            Intrinsics.i(orPut, "getOrPut(...)");
            DataCaptureMode dataCaptureMode = (DataCaptureMode) this.proxyCache.require(Reflection.b(NativeDataCaptureMode.class), null, mode);
            this.f125002a.onModeAdded((DataCaptureContext) orPut, dataCaptureMode);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onModeRemoved(NativeDataCaptureContext context, NativeDataCaptureMode mode) {
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125004c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new o(dataCaptureContext));
            Intrinsics.i(orPut, "getOrPut(...)");
            DataCaptureMode dataCaptureMode = (DataCaptureMode) this.proxyCache.require(Reflection.b(NativeDataCaptureMode.class), null, mode);
            this.f125002a.onModeRemoved((DataCaptureContext) orPut, dataCaptureMode);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onObservationStarted(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125004c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new p(dataCaptureContext));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f125002a.onObservationStarted((DataCaptureContext) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onObservationStopped(NativeDataCaptureContext context) {
        Intrinsics.j(context, "context");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125004c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new q(dataCaptureContext));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f125002a.onObservationStopped((DataCaptureContext) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextListener
    public void onStatusChanged(NativeDataCaptureContext context, NativeContextStatus status) {
        Intrinsics.j(context, "context");
        Intrinsics.j(status, "status");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125004c.get();
        if (dataCaptureContext != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new r(dataCaptureContext));
            Intrinsics.i(orPut, "getOrPut(...)");
            ContextStatus contextStatusConvert = CoreNativeTypeFactory.INSTANCE.convert(status);
            this.f125002a.onStatusChanged((DataCaptureContext) orPut, contextStatusConvert);
        }
    }

    public DataCaptureContextListenerReversedAdapter(DataCaptureContextListener contextListener, DataCaptureContext captureContext, ProxyCache proxyCache) {
        Intrinsics.j(contextListener, "contextListener");
        Intrinsics.j(captureContext, "captureContext");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125002a = contextListener;
        this.proxyCache = proxyCache;
        this.f125004c = new WeakReference(captureContext);
    }
}
