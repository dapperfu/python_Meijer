package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J!\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayListener;", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;", "_BarcodeCountBasicOverlayListener", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "_BarcodeCountBasicOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "overlay", "Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;", "trackedBarcode", "Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "brushForTrackedBarcode", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;)Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "brushForUntrackedBarcode", "brushForTrackedBarcodeNotInList", "brushForAcceptedBarcode", "brushForRejectedBarcode", "", "onTrackedBarcodeTapped", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;)V", "onUnTrackedBarcodeTapped", "onFilteredBarcodeTapped", "onTrackedBarcodeNotInListTapped", "onAcceptedTrackedBarcodeTapped", "onRejectedTrackedBarcodeTapped", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;", "cluster", "onClusterTapped", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountBasicOverlayListenerReversedAdapter extends NativeBarcodeCountBasicOverlayListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountBasicOverlayListener f120770a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f120772c;

    public /* synthetic */ BarcodeCountBasicOverlayListenerReversedAdapter(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay barcodeCountBasicOverlay, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCountBasicOverlayListener, barcodeCountBasicOverlay, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public NativeBrush brushForAcceptedBarcode(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new e(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new f(trackedBarcode));
            Brush brushBrushForAcceptedBarcode = this.f120770a.brushForAcceptedBarcode((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
            if (brushBrushForAcceptedBarcode != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForAcceptedBarcode);
            }
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public NativeBrush brushForRejectedBarcode(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new g(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new h(trackedBarcode));
            Brush brushBrushForRejectedBarcode = this.f120770a.brushForRejectedBarcode((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
            if (brushBrushForRejectedBarcode != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForRejectedBarcode);
            }
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public NativeBrush brushForTrackedBarcode(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new i(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new j(trackedBarcode));
            Brush brushBrushForRecognizedBarcode = this.f120770a.brushForRecognizedBarcode((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
            if (brushBrushForRecognizedBarcode != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForRecognizedBarcode);
            }
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public NativeBrush brushForTrackedBarcodeNotInList(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new k(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new l(trackedBarcode));
            Brush brushBrushForRecognizedBarcodeNotInList = this.f120770a.brushForRecognizedBarcodeNotInList((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
            if (brushBrushForRecognizedBarcodeNotInList != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForRecognizedBarcodeNotInList);
            }
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public NativeBrush brushForUntrackedBarcode(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new m(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new n(trackedBarcode));
            Brush brushBrushForUnrecognizedBarcode = this.f120770a.brushForUnrecognizedBarcode((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
            if (brushBrushForUnrecognizedBarcode != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForUnrecognizedBarcode);
            }
        }
        return null;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onAcceptedTrackedBarcodeTapped(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new o(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new p(trackedBarcode));
            this.f120770a.onAcceptedTrackedBarcodeTapped((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onClusterTapped(NativeBarcodeCountBasicOverlay overlay, NativeCluster cluster) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(cluster, "cluster");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new q(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f120770a.onClusterTapped((BarcodeCountBasicOverlay) orPut, cluster);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onFilteredBarcodeTapped(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new r(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new s(trackedBarcode));
            this.f120770a.onFilteredBarcodeTapped((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onRejectedTrackedBarcodeTapped(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new t(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new u(trackedBarcode));
            this.f120770a.onRejectedTrackedBarcodeTapped((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onTrackedBarcodeNotInListTapped(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new v(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new w(trackedBarcode));
            this.f120770a.onRecognizedBarcodeNotInListTapped((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onTrackedBarcodeTapped(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new x(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new y(trackedBarcode));
            this.f120770a.onRecognizedBarcodeTapped((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener
    public void onUnTrackedBarcodeTapped(NativeBarcodeCountBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120772c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new z(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new A(trackedBarcode));
            this.f120770a.onUnrecognizedBarcodeTapped((BarcodeCountBasicOverlay) orPut, trackedBarcode2);
        }
    }

    public BarcodeCountBasicOverlayListenerReversedAdapter(BarcodeCountBasicOverlayListener _BarcodeCountBasicOverlayListener, BarcodeCountBasicOverlay _BarcodeCountBasicOverlay, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeCountBasicOverlayListener, "_BarcodeCountBasicOverlayListener");
        Intrinsics.j(_BarcodeCountBasicOverlay, "_BarcodeCountBasicOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120770a = _BarcodeCountBasicOverlayListener;
        this.proxyCache = proxyCache;
        this.f120772c = new WeakReference(_BarcodeCountBasicOverlay);
    }
}
