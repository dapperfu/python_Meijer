package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBrushProvider;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
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

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProviderReversedAdapter;", "Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBrushProvider;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;", "_BarcodeSelectionBrushProvider", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "_BarcodeSelectionBasicOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;", "barcode", "Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "brushForBarcode", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeBarcode;)Lcom/scandit/datacapture/core/internal/sdk/ui/style/NativeBrush;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeSelectionBrushProviderReversedAdapter extends NativeBarcodeSelectionBrushProvider {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeSelectionBrushProvider f123760a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f123762c;

    public /* synthetic */ BarcodeSelectionBrushProviderReversedAdapter(BarcodeSelectionBrushProvider barcodeSelectionBrushProvider, BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeSelectionBrushProvider, barcodeSelectionBasicOverlay, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBrushProvider
    public NativeBrush brushForBarcode(NativeBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        if (((BarcodeSelectionBasicOverlay) this.f123762c.get()) != null) {
            Brush brushBrushForBarcode = this.f123760a.brushForBarcode((Barcode) this.proxyCache.getOrPut(Reflection.b(NativeBarcode.class), null, barcode, new C13270d(barcode)));
            if (brushBrushForBarcode != null) {
                return CoreNativeTypeFactory.INSTANCE.convert(brushBrushForBarcode);
            }
        }
        return null;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public BarcodeSelectionBrushProviderReversedAdapter(BarcodeSelectionBrushProvider _BarcodeSelectionBrushProvider, BarcodeSelectionBasicOverlay _BarcodeSelectionBasicOverlay, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeSelectionBrushProvider, "_BarcodeSelectionBrushProvider");
        Intrinsics.j(_BarcodeSelectionBasicOverlay, "_BarcodeSelectionBasicOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123760a = _BarcodeSelectionBrushProvider;
        this.proxyCache = proxyCache;
        this.f123762c = new WeakReference(_BarcodeSelectionBasicOverlay);
    }
}
