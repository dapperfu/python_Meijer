package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStateListener;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountStateListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStateListener;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountStateListener;", "_BarcodeCountStateListener", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "_BarcodeCount", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountStateListener;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "mode", "", "onObservationStarted", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;)V", "onObservationStopped", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountState;", "oldState", "newState", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "frameData", "onStateChanged", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountState;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountState;Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountStateListenerReversedAdapter extends NativeBarcodeCountStateListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountStateListener f120626a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f120628c;

    public /* synthetic */ BarcodeCountStateListenerReversedAdapter(BarcodeCountStateListener barcodeCountStateListener, BarcodeCount barcodeCount, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCountStateListener, barcodeCount, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStateListener
    public void onObservationStarted(NativeBarcodeCount mode) {
        Intrinsics.j(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.f120628c.get();
        if (barcodeCount != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCount.class), null, mode, new l(barcodeCount));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f120626a.onObservationStarted((BarcodeCount) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStateListener
    public void onObservationStopped(NativeBarcodeCount mode) {
        Intrinsics.j(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.f120628c.get();
        if (barcodeCount != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCount.class), null, mode, new m(barcodeCount));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f120626a.onObservationStopped((BarcodeCount) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStateListener
    public void onStateChanged(BarcodeCountState oldState, BarcodeCountState newState, NativeFrameData frameData, NativeBarcodeCount mode) {
        Intrinsics.j(oldState, "oldState");
        Intrinsics.j(newState, "newState");
        Intrinsics.j(frameData, "frameData");
        Intrinsics.j(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.f120628c.get();
        if (barcodeCount != null) {
            FrameData frameData2 = (FrameData) this.proxyCache.getOrPut(Reflection.b(NativeFrameData.class), null, frameData, new n(frameData));
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCount.class), null, mode, new o(barcodeCount));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f120626a.onStateChanged(oldState, newState, frameData2, (BarcodeCount) orPut);
        }
    }

    public BarcodeCountStateListenerReversedAdapter(BarcodeCountStateListener _BarcodeCountStateListener, BarcodeCount _BarcodeCount, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeCountStateListener, "_BarcodeCountStateListener");
        Intrinsics.j(_BarcodeCount, "_BarcodeCount");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120626a = _BarcodeCountStateListener;
        this.proxyCache = proxyCache;
        this.f120628c = new WeakReference(_BarcodeCount);
    }
}
