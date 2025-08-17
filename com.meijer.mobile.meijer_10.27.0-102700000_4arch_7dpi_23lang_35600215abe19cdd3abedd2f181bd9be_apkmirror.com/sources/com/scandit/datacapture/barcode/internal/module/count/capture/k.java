package com.scandit.datacapture.barcode.internal.module.count.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.GuavaMapMakerProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes11.dex */
public final class k extends NativeBarcodeCountListener {

    /* renamed from: a, reason: collision with root package name */
    public final InternalBarcodeCountListener f121293a;

    /* renamed from: b, reason: collision with root package name */
    public final ProxyCache f121294b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f121295c;

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener
    public final void onObservationStarted(NativeBarcodeCount mode) {
        Intrinsics.j(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.f121295c.get();
        if (barcodeCount != null) {
            Object orPut = this.f121294b.getOrPut(Reflection.b(NativeBarcodeCount.class), null, mode, new a(barcodeCount));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f121293a.onObservationStarted((BarcodeCount) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener
    public final void onObservationStopped(NativeBarcodeCount mode) {
        Intrinsics.j(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.f121295c.get();
        if (barcodeCount != null) {
            Object orPut = this.f121294b.getOrPut(Reflection.b(NativeBarcodeCount.class), null, mode, new b(barcodeCount));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f121293a.onObservationStopped((BarcodeCount) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener
    public final void onScan(NativeBarcodeCount mode, NativeBarcodeCountSession session, NativeFrameData data) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeCount barcodeCount = (BarcodeCount) this.f121295c.get();
        if (barcodeCount != null) {
            Object orPut = this.f121294b.getOrPut(Reflection.b(NativeBarcodeCount.class), null, mode, new c(barcodeCount));
            Intrinsics.i(orPut, "getOrPut(...)");
            InternalBarcodeCountSession internalBarcodeCountSession = (InternalBarcodeCountSession) this.f121294b.getOrPut(Reflection.b(NativeBarcodeCountSession.class), null, session, new d(barcodeCount));
            FrameData frameData = (FrameData) this.f121294b.getOrPut(Reflection.b(NativeFrameData.class), null, data, new e(data));
            this.f121293a.b((BarcodeCount) orPut, internalBarcodeCountSession, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener
    public final void onSessionUpdated(NativeBarcodeCount mode, NativeBarcodeCountSession session, NativeFrameData data) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeCount barcodeCount = (BarcodeCount) this.f121295c.get();
        if (barcodeCount != null) {
            Object orPut = this.f121294b.getOrPut(Reflection.b(NativeBarcodeCount.class), null, mode, new f(barcodeCount));
            Intrinsics.i(orPut, "getOrPut(...)");
            InternalBarcodeCountSession internalBarcodeCountSession = (InternalBarcodeCountSession) this.f121294b.getOrPut(Reflection.b(NativeBarcodeCountSession.class), null, session, new g(barcodeCount));
            FrameData frameData = (FrameData) this.f121294b.getOrPut(Reflection.b(NativeFrameData.class), null, data, new h(data));
            this.f121293a.a((BarcodeCount) orPut, internalBarcodeCountSession, frameData);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountListener
    public final void onTrackedBarcodeUncounted(NativeBarcodeCountSession session, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(session, "session");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCount barcodeCount = (BarcodeCount) this.f121295c.get();
        if (barcodeCount != null) {
            this.f121293a.a((InternalBarcodeCountSession) this.f121294b.getOrPut(Reflection.b(NativeBarcodeCountSession.class), null, session, new i(barcodeCount)), (TrackedBarcode) this.f121294b.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new j(trackedBarcode)));
        }
    }

    public k(com.scandit.datacapture.barcode.count.capture.f _InternalBarcodeCountListener, BarcodeCount _BarcodeCount) {
        GuavaMapMakerProxyCache proxyCache = ProxyCacheKt.getGlobalProxyCache();
        Intrinsics.j(_InternalBarcodeCountListener, "_InternalBarcodeCountListener");
        Intrinsics.j(_BarcodeCount, "_BarcodeCount");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121293a = _InternalBarcodeCountListener;
        this.f121294b = proxyCache;
        this.f121295c = new WeakReference(_BarcodeCount);
    }
}
