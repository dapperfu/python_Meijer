package com.scandit.datacapture.barcode.batch.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayListener;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayListener;", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayListener;", "_BarcodeBatchBasicOverlayListener", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "_BarcodeBatchBasicOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayListener;Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;", "overlay", "Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;", "trackedBarcode", "Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "brushForTrackedBarcode", "(Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;)Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "", "onTrackedBarcodeTapped", "(Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeBatchBasicOverlayListenerReversedAdapter extends NativeBarcodeTrackingBasicOverlayListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeBatchBasicOverlayListener f121447a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f121449c;

    public /* synthetic */ BarcodeBatchBasicOverlayListenerReversedAdapter(BarcodeBatchBasicOverlayListener barcodeBatchBasicOverlayListener, BarcodeBatchBasicOverlay barcodeBatchBasicOverlay, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeBatchBasicOverlayListener, barcodeBatchBasicOverlay, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayListener
    public NativeBrush brushForTrackedBarcode(NativeBarcodeTrackingBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeBatchBasicOverlay barcodeBatchBasicOverlay = (BarcodeBatchBasicOverlay) this.f121449c.get();
        if (barcodeBatchBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay, new d(barcodeBatchBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new e(trackedBarcode));
            Brush brushBrushForTrackedBarcode = this.f121447a.brushForTrackedBarcode((BarcodeBatchBasicOverlay) orPut, trackedBarcode2);
            if (brushBrushForTrackedBarcode != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForTrackedBarcode);
            }
        }
        return null;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayListener
    public void onTrackedBarcodeTapped(NativeBarcodeTrackingBasicOverlay overlay, NativeTrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeBatchBasicOverlay barcodeBatchBasicOverlay = (BarcodeBatchBasicOverlay) this.f121449c.get();
        if (barcodeBatchBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay, new f(barcodeBatchBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            TrackedBarcode trackedBarcode2 = (TrackedBarcode) this.proxyCache.getOrPut(Reflection.b(NativeTrackedBarcode.class), null, trackedBarcode, new g(trackedBarcode));
            this.f121447a.onTrackedBarcodeTapped((BarcodeBatchBasicOverlay) orPut, trackedBarcode2);
        }
    }

    public BarcodeBatchBasicOverlayListenerReversedAdapter(BarcodeBatchBasicOverlayListener _BarcodeBatchBasicOverlayListener, BarcodeBatchBasicOverlay _BarcodeBatchBasicOverlay, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeBatchBasicOverlayListener, "_BarcodeBatchBasicOverlayListener");
        Intrinsics.j(_BarcodeBatchBasicOverlay, "_BarcodeBatchBasicOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121447a = _BarcodeBatchBasicOverlayListener;
        this.proxyCache = proxyCache;
        this.f121449c = new WeakReference(_BarcodeBatchBasicOverlay);
    }
}
