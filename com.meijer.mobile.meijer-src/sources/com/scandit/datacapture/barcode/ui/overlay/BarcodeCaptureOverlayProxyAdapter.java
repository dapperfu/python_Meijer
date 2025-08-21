package com.scandit.datacapture.barcode.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayProxyAdapter;", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayProxy;", "Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;", "_NativeBarcodeCaptureOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/core/ui/style/Brush;", "p0", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "brush", "", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "style", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCaptureOverlayProxyAdapter implements BarcodeCaptureOverlayProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCaptureOverlay f124958a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureOverlay f124960c;

    public BarcodeCaptureOverlayProxyAdapter(NativeBarcodeCaptureOverlay _NativeBarcodeCaptureOverlay, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeCaptureOverlay, "_NativeBarcodeCaptureOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124958a = _NativeBarcodeCaptureOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodeCaptureOverlay.asDataCaptureOverlay();
        Intrinsics.i(nativeDataCaptureOverlayAsDataCaptureOverlay, "asDataCaptureOverlay(...)");
        this.f124960c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy, com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getF124960c() {
        return this.f124960c;
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCaptureOverlay getF124958a() {
        return this.f124958a;
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    public Brush getBrush() {
        NativeBrush brushForRecognizedBarcodes = this.f124958a.getBrushForRecognizedBarcodes();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(brushForRecognizedBarcodes);
        return coreNativeTypeFactory.convert(brushForRecognizedBarcodes);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    public boolean getShouldShowScanAreaGuides() {
        return this.f124958a.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    public BarcodeCaptureOverlayStyle getStyle() {
        NativeBarcodeCaptureOverlayStyle style = this.f124958a.getStyle();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(style);
        return barcodeNativeTypeFactory.convert(style);
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    public void setBrush(Brush p02) {
        Intrinsics.j(p02, "p0");
        this.f124958a.setBrushForRecognizedBarcodes(CoreNativeTypeFactory.INSTANCE.convert(p02));
    }

    @Override // com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlayProxy
    public void setShouldShowScanAreaGuides(boolean z10) {
        this.f124958a.setShouldShowScanAreaGuides(z10);
    }

    public /* synthetic */ BarcodeCaptureOverlayProxyAdapter(NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCaptureOverlay, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
