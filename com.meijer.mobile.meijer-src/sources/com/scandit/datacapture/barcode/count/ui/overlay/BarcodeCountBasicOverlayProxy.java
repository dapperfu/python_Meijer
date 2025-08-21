package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterLiveEditor;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\ba\u0018\u00002\u00020\u0001J\b\u0010\u0016\u001a\u00020\u0017H'J\b\u0010\u0018\u001a\u00020\u0019H'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH'J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH'J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H'J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H'J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H'J\b\u0010%\u001a\u00020&H'J\b\u0010'\u001a\u00020&H'J\b\u0010(\u001a\u00020&H'J\b\u0010)\u001a\u00020&H'J\b\u0010*\u001a\u00020&H'J\b\u0010+\u001a\u00020&H'J\b\u0010,\u001a\u00020&H'J\b\u0010-\u001a\u00020&H'J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&H'J\u0010\u00100\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&H'J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&H'J\u0010\u00102\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&H'J\u0010\u00103\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&H'J\u0010\u00104\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&H'J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&H'J\u0010\u00106\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&H'J\u0010\u00107\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&H'J\u0010\u00108\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020&H'R(\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00138gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00069"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayProxy;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "<set-?>", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "filterSettings", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)V", "", "shouldShowScanAreaGuides", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "shouldShowStatusIconsOnScan", "getShouldShowStatusIconsOnScan", "setShouldShowStatusIconsOnScan", "style", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "_setProfilingOverlay", "", "overlay", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "beginClusterEditing", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterLiveEditor;", "didAcceptNotInListBarcode", "barcode", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "didCancelNotInListBarcode", "didRejectNotInListBarcode", "getTextForBarcodesNotInListDetectedHint", "", "getTextForMoveCloserAndRescanHint", "getTextForMoveFurtherAndRescanHint", "getTextForScanningHint", "getTextForScreenCleanedUpHint", "getTextForTapShutterToScanHint", "getTextForTapToUncountHint", "getTextForUnscannedBarcodesDetectedHint", "setTextForBarcodesNotInListDetectedHint", "text", "setTextForClusteringGestureHint", "setTextForMoveCloserAndRescanHint", "setTextForMoveFurtherAndRescanHint", "setTextForScanningHint", "setTextForScreenCleanedUpHint", "setTextForTapShutterToScanHint", "setTextForTapToUncountHint", "setTextForUnrecognizedBarcodesInClusterHint", "setTextForUnscannedBarcodesDetectedHint", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCountBasicOverlay.class)
/* loaded from: classes12.dex */
public interface BarcodeCountBasicOverlayProxy extends DataCaptureOverlay {
    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @NativeImpl
    /* renamed from: _dataCaptureOverlayImpl */
    NativeDataCaptureOverlay getF124803c();

    @NativeImpl
    /* renamed from: _impl */
    NativeBarcodeCountBasicOverlay getF121725a();

    @ProxyFunction(nativeName = "setProfilingOverlay")
    void _setProfilingOverlay(ProfilingOverlay overlay);

    @ProxyFunction
    NativeBarcodeClusterLiveEditor beginClusterEditing();

    @ProxyFunction(nativeName = "didAcceptNotInListBarcode")
    void didAcceptNotInListBarcode(TrackedBarcode barcode);

    @ProxyFunction(nativeName = "didCancelNotInListBarcode")
    void didCancelNotInListBarcode(TrackedBarcode barcode);

    @ProxyFunction(nativeName = "didRejectNotInListBarcode")
    void didRejectNotInListBarcode(TrackedBarcode barcode);

    @ProxyFunction(nativeName = "getFilterSettings", property = "filterSettings")
    BarcodeFilterHighlightSettings getFilterSettings();

    @ProxyFunction(nativeName = "shouldShowScanAreaGuides", property = "shouldShowScanAreaGuides")
    boolean getShouldShowScanAreaGuides();

    @ProxyFunction(nativeName = "shouldShowStatusIconsOnScan", property = "shouldShowStatusIconsOnScan")
    boolean getShouldShowStatusIconsOnScan();

    @ProxyFunction(property = "style")
    NativeBarcodeCountBasicOverlayStyle getStyle();

    @ProxyFunction(nativeName = "getTextForWrongBarcodesDetectedHint")
    String getTextForBarcodesNotInListDetectedHint();

    @ProxyFunction
    String getTextForMoveCloserAndRescanHint();

    @ProxyFunction
    String getTextForMoveFurtherAndRescanHint();

    @ProxyFunction
    String getTextForScanningHint();

    @ProxyFunction
    String getTextForScreenCleanedUpHint();

    @ProxyFunction
    String getTextForTapShutterToScanHint();

    @ProxyFunction
    String getTextForTapToUncountHint();

    @ProxyFunction
    String getTextForUnscannedBarcodesDetectedHint();

    @ProxyFunction(nativeName = "setFilterSettings", property = "filterSettings")
    void setFilterSettings(BarcodeFilterHighlightSettings barcodeFilterHighlightSettings);

    @ProxyFunction(nativeName = "setShouldShowScanAreaGuides", property = "shouldShowScanAreaGuides")
    void setShouldShowScanAreaGuides(boolean z10);

    @ProxyFunction(nativeName = "setShouldShowStatusIconsOnScan", property = "shouldShowStatusIconsOnScan")
    void setShouldShowStatusIconsOnScan(boolean z10);

    @ProxyFunction(nativeName = "setTextForWrongBarcodesDetectedHint")
    void setTextForBarcodesNotInListDetectedHint(String text);

    @ProxyFunction(nativeName = "setTextForSwipeToGroupHint")
    void setTextForClusteringGestureHint(String text);

    @ProxyFunction
    void setTextForMoveCloserAndRescanHint(String text);

    @ProxyFunction
    void setTextForMoveFurtherAndRescanHint(String text);

    @ProxyFunction
    void setTextForScanningHint(String text);

    @ProxyFunction
    void setTextForScreenCleanedUpHint(String text);

    @ProxyFunction
    void setTextForTapShutterToScanHint(String text);

    @ProxyFunction
    void setTextForTapToUncountHint(String text);

    @ProxyFunction(nativeName = "setTextForRescanYellowCodesHint")
    void setTextForUnrecognizedBarcodesInClusterHint(String text);

    @ProxyFunction
    void setTextForUnscannedBarcodesDetectedHint(String text);
}
