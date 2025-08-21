package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterLiveEditor;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u0011J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u0011J\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u0013J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010+J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R$\u0010;\u001a\u0002052\u0006\u00106\u001a\u0002058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R(\u0010E\u001a\u0004\u0018\u00010@2\b\u00106\u001a\u0004\u0018\u00010@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010H\u001a\u0002052\u0006\u00106\u001a\u0002058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u00108\"\u0004\bG\u0010:¨\u0006I"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "_NativeBarcodeCountBasicOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "", "text", "", "setTextForUnscannedBarcodesDetectedHint", "(Ljava/lang/String;)V", "getTextForUnscannedBarcodesDetectedHint", "()Ljava/lang/String;", "setTextForBarcodesNotInListDetectedHint", "getTextForBarcodesNotInListDetectedHint", "setTextForTapShutterToScanHint", "getTextForTapShutterToScanHint", "setTextForScanningHint", "getTextForScanningHint", "setTextForMoveCloserAndRescanHint", "getTextForMoveCloserAndRescanHint", "setTextForMoveFurtherAndRescanHint", "getTextForMoveFurtherAndRescanHint", "setTextForTapToUncountHint", "getTextForTapToUncountHint", "setTextForClusteringGestureHint", "setTextForUnrecognizedBarcodesInClusterHint", "setTextForScreenCleanedUpHint", "getTextForScreenCleanedUpHint", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "overlay", "_setProfilingOverlay", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;)V", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "barcode", "didAcceptNotInListBarcode", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;)V", "didRejectNotInListBarcode", "didCancelNotInListBarcode", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterLiveEditor;", "beginClusterEditing", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterLiveEditor;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "p0", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "style", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)V", "filterSettings", "getShouldShowStatusIconsOnScan", "setShouldShowStatusIconsOnScan", "shouldShowStatusIconsOnScan", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCountBasicOverlayProxyAdapter implements BarcodeCountBasicOverlayProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCountBasicOverlay f121725a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureOverlay f121727c;

    public BarcodeCountBasicOverlayProxyAdapter(NativeBarcodeCountBasicOverlay _NativeBarcodeCountBasicOverlay, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeCountBasicOverlay, "_NativeBarcodeCountBasicOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121725a = _NativeBarcodeCountBasicOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeBarcodeCountBasicOverlay.asDataCaptureOverlay();
        Intrinsics.i(nativeDataCaptureOverlayAsDataCaptureOverlay, "asDataCaptureOverlay(...)");
        this.f121727c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setFilterSettings(BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettings = null;
        if (barcodeFilterHighlightSettings != null) {
            NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettings_impl = barcodeFilterHighlightSettings.getF121881a();
            this.proxyCache.put(Reflection.b(NativeBarcodeFilterOverlaySettings.class), null, nativeBarcodeFilterOverlaySettings_impl, barcodeFilterHighlightSettings);
            nativeBarcodeFilterOverlaySettings = nativeBarcodeFilterOverlaySettings_impl;
        }
        this.f121725a.setFilterSettings(nativeBarcodeFilterOverlaySettings);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy, com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getF124960c() {
        return this.f121727c;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCountBasicOverlay getF121725a() {
        return this.f121725a;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void _setProfilingOverlay(ProfilingOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        NativeProfilingOverlay f126722a = overlay.getF126722a();
        this.proxyCache.put(Reflection.b(NativeProfilingOverlay.class), null, f126722a, overlay);
        this.f121725a.setProfilingOverlay(f126722a);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public NativeBarcodeClusterLiveEditor beginClusterEditing() {
        return this.f121725a.beginClusterEditing();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void didAcceptNotInListBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        NativeTrackedBarcode f121422a = barcode.getF121422a();
        this.proxyCache.put(Reflection.b(NativeTrackedBarcode.class), null, f121422a, barcode);
        this.f121725a.didAcceptNotInListBarcode(f121422a);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void didCancelNotInListBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        NativeTrackedBarcode f121422a = barcode.getF121422a();
        this.proxyCache.put(Reflection.b(NativeTrackedBarcode.class), null, f121422a, barcode);
        this.f121725a.didCancelNotInListBarcode(f121422a);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void didRejectNotInListBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        NativeTrackedBarcode f121422a = barcode.getF121422a();
        this.proxyCache.put(Reflection.b(NativeTrackedBarcode.class), null, f121422a, barcode);
        this.f121725a.didRejectNotInListBarcode(f121422a);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public BarcodeFilterHighlightSettings getFilterSettings() {
        NativeBarcodeFilterOverlaySettings filterSettings = this.f121725a.getFilterSettings();
        if (filterSettings != null) {
            return (BarcodeFilterHighlightSettings) this.proxyCache.getOrPut(Reflection.b(NativeBarcodeFilterOverlaySettings.class), null, filterSettings, new B(filterSettings));
        }
        return null;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public boolean getShouldShowScanAreaGuides() {
        return this.f121725a.shouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public boolean getShouldShowStatusIconsOnScan() {
        return this.f121725a.shouldShowStatusIconsOnScan();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public NativeBarcodeCountBasicOverlayStyle getStyle() {
        NativeBarcodeCountBasicOverlayStyle style = this.f121725a.getStyle();
        Intrinsics.g(style);
        return style;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public String getTextForBarcodesNotInListDetectedHint() {
        String textForWrongBarcodesDetectedHint = this.f121725a.getTextForWrongBarcodesDetectedHint();
        Intrinsics.g(textForWrongBarcodesDetectedHint);
        return textForWrongBarcodesDetectedHint;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public String getTextForMoveCloserAndRescanHint() {
        String textForMoveCloserAndRescanHint = this.f121725a.getTextForMoveCloserAndRescanHint();
        Intrinsics.g(textForMoveCloserAndRescanHint);
        return textForMoveCloserAndRescanHint;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public String getTextForMoveFurtherAndRescanHint() {
        String textForMoveFurtherAndRescanHint = this.f121725a.getTextForMoveFurtherAndRescanHint();
        Intrinsics.g(textForMoveFurtherAndRescanHint);
        return textForMoveFurtherAndRescanHint;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public String getTextForScanningHint() {
        String textForScanningHint = this.f121725a.getTextForScanningHint();
        Intrinsics.g(textForScanningHint);
        return textForScanningHint;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public String getTextForScreenCleanedUpHint() {
        String textForScreenCleanedUpHint = this.f121725a.getTextForScreenCleanedUpHint();
        Intrinsics.g(textForScreenCleanedUpHint);
        return textForScreenCleanedUpHint;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public String getTextForTapShutterToScanHint() {
        String textForTapShutterToScanHint = this.f121725a.getTextForTapShutterToScanHint();
        Intrinsics.g(textForTapShutterToScanHint);
        return textForTapShutterToScanHint;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public String getTextForTapToUncountHint() {
        String textForTapToUncountHint = this.f121725a.getTextForTapToUncountHint();
        Intrinsics.g(textForTapToUncountHint);
        return textForTapToUncountHint;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public String getTextForUnscannedBarcodesDetectedHint() {
        String textForUnscannedBarcodesDetectedHint = this.f121725a.getTextForUnscannedBarcodesDetectedHint();
        Intrinsics.g(textForUnscannedBarcodesDetectedHint);
        return textForUnscannedBarcodesDetectedHint;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setShouldShowScanAreaGuides(boolean z10) {
        this.f121725a.setShouldShowScanAreaGuides(z10);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setShouldShowStatusIconsOnScan(boolean z10) {
        this.f121725a.setShouldShowStatusIconsOnScan(z10);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForBarcodesNotInListDetectedHint(String text) {
        Intrinsics.j(text, "text");
        this.f121725a.setTextForWrongBarcodesDetectedHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForClusteringGestureHint(String text) {
        Intrinsics.j(text, "text");
        this.f121725a.setTextForSwipeToGroupHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForMoveCloserAndRescanHint(String text) {
        Intrinsics.j(text, "text");
        this.f121725a.setTextForMoveCloserAndRescanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForMoveFurtherAndRescanHint(String text) {
        Intrinsics.j(text, "text");
        this.f121725a.setTextForMoveFurtherAndRescanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForScanningHint(String text) {
        Intrinsics.j(text, "text");
        this.f121725a.setTextForScanningHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForScreenCleanedUpHint(String text) {
        Intrinsics.j(text, "text");
        this.f121725a.setTextForScreenCleanedUpHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForTapShutterToScanHint(String text) {
        Intrinsics.j(text, "text");
        this.f121725a.setTextForTapShutterToScanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForTapToUncountHint(String text) {
        Intrinsics.j(text, "text");
        this.f121725a.setTextForTapToUncountHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForUnrecognizedBarcodesInClusterHint(String text) {
        Intrinsics.j(text, "text");
        this.f121725a.setTextForRescanYellowCodesHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    public void setTextForUnscannedBarcodesDetectedHint(String text) {
        Intrinsics.j(text, "text");
        this.f121725a.setTextForUnscannedBarcodesDetectedHint(text);
    }

    public /* synthetic */ BarcodeCountBasicOverlayProxyAdapter(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCountBasicOverlay, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
