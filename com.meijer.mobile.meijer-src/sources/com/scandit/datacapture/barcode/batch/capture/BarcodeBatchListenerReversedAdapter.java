package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingListener;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSession;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingListener;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchListener;", "_BarcodeBatchListener", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "_BarcodeBatch", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchListener;Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;", "mode", "", "onObservationStarted", "(Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;)V", "onObservationStopped", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSession;", "session", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "data", "onSessionUpdated", "(Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSession;Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeBatchListenerReversedAdapter extends NativeBarcodeTrackingListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeBatchListener f121375a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f121377c;

    public /* synthetic */ BarcodeBatchListenerReversedAdapter(BarcodeBatchListener barcodeBatchListener, BarcodeBatch barcodeBatch, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeBatchListener, barcodeBatch, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingListener
    public void onObservationStarted(NativeBarcodeTracking mode) {
        Intrinsics.j(mode, "mode");
        BarcodeBatch barcodeBatch = (BarcodeBatch) this.f121377c.get();
        if (barcodeBatch != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTracking.class), null, mode, new B(barcodeBatch));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f121375a.onObservationStarted((BarcodeBatch) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingListener
    public void onObservationStopped(NativeBarcodeTracking mode) {
        Intrinsics.j(mode, "mode");
        BarcodeBatch barcodeBatch = (BarcodeBatch) this.f121377c.get();
        if (barcodeBatch != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTracking.class), null, mode, new C(barcodeBatch));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f121375a.onObservationStopped((BarcodeBatch) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingListener
    public void onSessionUpdated(NativeBarcodeTracking mode, NativeBarcodeTrackingSession session, NativeFrameData data) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeBatch barcodeBatch = (BarcodeBatch) this.f121377c.get();
        if (barcodeBatch != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTracking.class), null, mode, new D(barcodeBatch));
            Intrinsics.i(orPut, "getOrPut(...)");
            BarcodeBatchSession barcodeBatchSession = (BarcodeBatchSession) this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingSession.class), null, session, new E(barcodeBatch));
            FrameData frameData = (FrameData) this.proxyCache.getOrPut(Reflection.b(NativeFrameData.class), null, data, new F(data));
            this.f121375a.onSessionUpdated((BarcodeBatch) orPut, barcodeBatchSession, frameData);
        }
    }

    public BarcodeBatchListenerReversedAdapter(BarcodeBatchListener _BarcodeBatchListener, BarcodeBatch _BarcodeBatch, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeBatchListener, "_BarcodeBatchListener");
        Intrinsics.j(_BarcodeBatch, "_BarcodeBatch");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121375a = _BarcodeBatchListener;
        this.proxyCache = proxyCache;
        this.f121377c = new WeakReference(_BarcodeBatch);
    }
}
