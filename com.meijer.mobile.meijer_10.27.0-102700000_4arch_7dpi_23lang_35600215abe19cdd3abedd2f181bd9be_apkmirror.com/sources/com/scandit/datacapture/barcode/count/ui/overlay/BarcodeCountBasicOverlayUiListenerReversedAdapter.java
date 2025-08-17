package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayUiListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayUiListener;", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;", "_BarcodeCountBasicOverlayUiListener", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "_BarcodeCountBasicOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "overlay", "", "onListButtonTapped", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;)V", "onExitButtonTapped", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountBasicOverlayUiListenerReversedAdapter extends NativeBarcodeCountBasicOverlayUiListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountBasicOverlayUiListener f120776a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f120778c;

    public /* synthetic */ BarcodeCountBasicOverlayUiListenerReversedAdapter(BarcodeCountBasicOverlayUiListener barcodeCountBasicOverlayUiListener, BarcodeCountBasicOverlay barcodeCountBasicOverlay, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCountBasicOverlayUiListener, barcodeCountBasicOverlay, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayUiListener
    public void onExitButtonTapped(NativeBarcodeCountBasicOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120778c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new C(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f120776a.onExitButtonTapped((BarcodeCountBasicOverlay) orPut);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayUiListener
    public void onListButtonTapped(NativeBarcodeCountBasicOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120778c.get();
        if (barcodeCountBasicOverlay != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeBarcodeCountBasicOverlay.class), null, overlay, new D(barcodeCountBasicOverlay));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f120776a.onListButtonTapped((BarcodeCountBasicOverlay) orPut);
        }
    }

    public BarcodeCountBasicOverlayUiListenerReversedAdapter(BarcodeCountBasicOverlayUiListener _BarcodeCountBasicOverlayUiListener, BarcodeCountBasicOverlay _BarcodeCountBasicOverlay, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeCountBasicOverlayUiListener, "_BarcodeCountBasicOverlayUiListener");
        Intrinsics.j(_BarcodeCountBasicOverlay, "_BarcodeCountBasicOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120776a = _BarcodeCountBasicOverlayUiListener;
        this.proxyCache = proxyCache;
        this.f120778c = new WeakReference(_BarcodeCountBasicOverlay);
    }
}
