package com.scandit.datacapture.barcode.batch.ui.overlay;

import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlayProxyAdapter;", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlayProxy;", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "_NativeBarcodeTrackingAdvancedOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "p0", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeBatchAdvancedOverlayProxyAdapter implements BarcodeBatchAdvancedOverlayProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeTrackingAdvancedOverlay f121441a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureOverlay f121443c;

    public BarcodeBatchAdvancedOverlayProxyAdapter(NativeBarcodeTrackingAdvancedOverlay _NativeBarcodeTrackingAdvancedOverlay, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeTrackingAdvancedOverlay, "_NativeBarcodeTrackingAdvancedOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121441a = _NativeBarcodeTrackingAdvancedOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodeTrackingAdvancedOverlay.asDataCaptureOverlay();
        Intrinsics.i(nativeDataCaptureOverlayAsDataCaptureOverlay, "asDataCaptureOverlay(...)");
        this.f121443c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getF121443c() {
        return this.f121443c;
    }

    @Override // com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeTrackingAdvancedOverlay getF121441a() {
        return this.f121441a;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    public boolean getShouldShowScanAreaGuides() {
        return this.f121441a.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    public void setShouldShowScanAreaGuides(boolean z10) {
        this.f121441a.setShouldShowScanAreaGuides(z10);
    }

    public /* synthetic */ BarcodeBatchAdvancedOverlayProxyAdapter(NativeBarcodeTrackingAdvancedOverlay nativeBarcodeTrackingAdvancedOverlay, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeTrackingAdvancedOverlay, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
