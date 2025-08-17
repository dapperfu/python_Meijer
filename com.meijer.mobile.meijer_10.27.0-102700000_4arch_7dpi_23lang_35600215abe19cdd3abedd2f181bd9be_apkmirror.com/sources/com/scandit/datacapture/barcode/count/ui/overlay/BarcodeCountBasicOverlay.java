package com.scandit.datacapture.barcode.count.ui.overlay;

import android.annotation.SuppressLint;
import android.content.Context;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterLiveEditor;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountViewHandler;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountNotInListActionSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.OverlayPreconditionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 »\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006¼\u0001»\u0001½\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b'\u0010 J\u0018\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b+\u0010*J\u0018\u0010,\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b,\u0010*J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b-\u0010*J\u0018\u0010.\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b.\u0010*J\u0018\u0010/\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b/\u0010*J\u0018\u00100\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b0\u0010*J\u0018\u00101\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b1\u0010*J\u0018\u00102\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b2\u0010*J\u0018\u00103\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b3\u0010*J\u0017\u00105\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u0007H\u0016¢\u0006\u0004\b5\u00106J\u0017\u0010;\u001a\u00020\u00122\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010@\u001a\u00020\u00122\u0006\u0010=\u001a\u00020<H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020\u0012H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0012H\u0014¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\u0012H\u0014¢\u0006\u0004\bD\u0010BJ\r\u0010E\u001a\u00020\u0012¢\u0006\u0004\bE\u0010BJ\r\u0010F\u001a\u00020\u0012¢\u0006\u0004\bF\u0010BJ\r\u0010G\u001a\u00020\u0012¢\u0006\u0004\bG\u0010BJ\r\u0010H\u001a\u00020\u0012¢\u0006\u0004\bH\u0010BJ\u0015\u0010I\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bI\u0010\u001bJ\u0015\u0010J\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bJ\u0010\u001bJ\u0015\u0010K\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bK\u0010\u001bJ\u0015\u0010L\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bL\u0010\u001bJ\u0015\u0010M\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bM\u0010\u001bJ\u0015\u0010N\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bN\u0010\u001bJ\u0015\u0010Q\u001a\u00020\u00122\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\u0017\u0010W\u001a\u00020\u00122\u0006\u0010T\u001a\u00020SH\u0000¢\u0006\u0004\bU\u0010VJ\u0017\u0010\\\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020XH\u0000¢\u0006\u0004\bZ\u0010[J\u000f\u0010]\u001a\u00020SH\u0016¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b`\u0010aJ\u0019\u0010b\u001a\u0004\u0018\u00010_2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bb\u0010aJ\u0019\u0010c\u001a\u0004\u0018\u00010_2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bc\u0010aJ\u0019\u0010d\u001a\u0004\u0018\u00010_2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bd\u0010aJ\u0019\u0010e\u001a\u0004\u0018\u00010_2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\be\u0010aJ\u0011\u0010f\u001a\u0004\u0018\u00010_H\u0016¢\u0006\u0004\bf\u0010gR\u001c\u0010k\u001a\u0004\u0018\u00010_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010gR\u001c\u0010n\u001a\u0004\u0018\u00010_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010i\u001a\u0004\bm\u0010gR\u001c\u0010q\u001a\u0004\u0018\u00010_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010i\u001a\u0004\bp\u0010gR\u001c\u0010t\u001a\u0004\u0018\u00010_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010i\u001a\u0004\bs\u0010gR\u001c\u0010w\u001a\u0004\u0018\u00010_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010i\u001a\u0004\bv\u0010gR$\u0010\u007f\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R,\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R,\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R0\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0090\u00012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018W@WX\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R(\u0010\u0099\u0001\u001a\u00020S2\u0007\u0010\u0091\u0001\u001a\u00020S8W@WX\u0096\u000f¢\u0006\u000e\u001a\u0005\b\u0097\u0001\u0010^\"\u0005\b\u0098\u0001\u0010VR(\u0010\u009c\u0001\u001a\u00020S2\u0007\u0010\u0091\u0001\u001a\u00020S8W@WX\u0096\u000f¢\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010^\"\u0005\b\u009b\u0001\u0010VR\u0018\u0010 \u0001\u001a\u00030\u009d\u00018WX\u0096\u0005¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R4\u0010¢\u0001\u001a\u0004\u0018\u00010_2\t\u0010¡\u0001\u001a\u0004\u0018\u00010_8V@VX\u0096\u000e¢\u0006\u0016\n\u0005\b¢\u0001\u0010i\u001a\u0005\b£\u0001\u0010g\"\u0006\b¤\u0001\u0010¥\u0001R4\u0010¦\u0001\u001a\u0004\u0018\u00010_2\t\u0010¡\u0001\u001a\u0004\u0018\u00010_8V@VX\u0096\u000e¢\u0006\u0016\n\u0005\b¦\u0001\u0010i\u001a\u0005\b§\u0001\u0010g\"\u0006\b¨\u0001\u0010¥\u0001R4\u0010©\u0001\u001a\u0004\u0018\u00010_2\t\u0010¡\u0001\u001a\u0004\u0018\u00010_8V@VX\u0096\u000e¢\u0006\u0016\n\u0005\b©\u0001\u0010i\u001a\u0005\bª\u0001\u0010g\"\u0006\b«\u0001\u0010¥\u0001R4\u0010¬\u0001\u001a\u0004\u0018\u00010_2\t\u0010¡\u0001\u001a\u0004\u0018\u00010_8V@VX\u0096\u000e¢\u0006\u0016\n\u0005\b¬\u0001\u0010i\u001a\u0005\b\u00ad\u0001\u0010g\"\u0006\b®\u0001\u0010¥\u0001R4\u0010¯\u0001\u001a\u0004\u0018\u00010_2\t\u0010¡\u0001\u001a\u0004\u0018\u00010_8V@VX\u0096\u000e¢\u0006\u0016\n\u0005\b¯\u0001\u0010i\u001a\u0005\b°\u0001\u0010g\"\u0006\b±\u0001\u0010¥\u0001R(\u0010´\u0001\u001a\u00020S2\u0007\u0010¡\u0001\u001a\u00020S8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b²\u0001\u0010^\"\u0005\b³\u0001\u0010VR,\u0010º\u0001\u001a\u00030µ\u00012\b\u0010¡\u0001\u001a\u00030µ\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ViewBasedDataCaptureOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/barcode/internal/module/count/ui/handlers/a;", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "impl", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "dataCaptureView", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;Lcom/scandit/datacapture/core/ui/DataCaptureView;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "overlay", "", "_setProfilingOverlay", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;)V", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterLiveEditor;", "beginClusterEditing", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterLiveEditor;", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "barcode", "didAcceptNotInListBarcode", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;)V", "didCancelNotInListBarcode", "didRejectNotInListBarcode", "", "getTextForBarcodesNotInListDetectedHint", "()Ljava/lang/String;", "getTextForMoveCloserAndRescanHint", "getTextForMoveFurtherAndRescanHint", "getTextForScanningHint", "getTextForScreenCleanedUpHint", "getTextForTapShutterToScanHint", "getTextForTapToUncountHint", "getTextForUnscannedBarcodesDetectedHint", "text", "setTextForBarcodesNotInListDetectedHint", "(Ljava/lang/String;)V", "setTextForClusteringGestureHint", "setTextForMoveCloserAndRescanHint", "setTextForMoveFurtherAndRescanHint", "setTextForScanningHint", "setTextForScreenCleanedUpHint", "setTextForTapShutterToScanHint", "setTextForTapToUncountHint", "setTextForUnrecognizedBarcodesInClusterHint", "setTextForUnscannedBarcodesDetectedHint", "view", "_setDataCaptureView", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;)V", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountGuidanceHandler;", "guidanceHandler", "setGuidanceHandler$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountGuidanceHandler;)V", "setGuidanceHandler", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountViewHandler;", "viewHandler", "setViewHandler$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountViewHandler;)V", "setViewHandler", "_cleanupViews", "()V", "onAttachedToWindow", "onDetachedFromWindow", "clearHighlights", "listButtonPressed", "exitButtonPressed", "shutterButtonPressed", "didTapScannedBarcode", "didTapUnscannedBarcode", "didTapNotInListBarcode", "didTapAcceptedBarcode", "didTapRejectedBarcode", "didTapFilteredBarcode", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;", "cluster", "didTapCluster", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;)V", "", "statusModeEnabled", "setStatusModeEnabled$scandit_barcode_capture", "(Z)V", "setStatusModeEnabled", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountNotInListActionSettings;", "settings", "applyNotInListActionSettings$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountNotInListActionSettings;)V", "applyNotInListActionSettings", "isListenerSet", "()Z", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brushForTrackedBarcode", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;)Lcom/scandit/datacapture/core/ui/style/Brush;", "brushForUnscannedTrackedBarcode", "brushForTrackedBarcodeNotInList", "brushForAcceptedBarcodeNotInList", "brushForRejectedBarcodeNotInList", "brushFromFilterSettings", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "b", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getDefaultRecognizedBrush", "defaultRecognizedBrush", "c", "getDefaultUnrecognizedBrush", "defaultUnrecognizedBrush", "d", "getDefaultNotInListBrush", "defaultNotInListBrush", "e", "getDefaultAcceptedNotInListBrush", "defaultAcceptedNotInListBrush", "f", "getDefaultRejectedNotInListBrush", "defaultRejectedNotInListBrush", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;", "g", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;", "getListener", "()Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;", "setListener", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;)V", "listener", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;", "h", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;", "getUiListener", "()Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;", "setUiListener", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;)V", "uiListener", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayCallback;", "i", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayCallback;", "getCallback", "()Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayCallback;", "setCallback", "(Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayCallback;)V", "callback", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "<set-?>", "getFilterSettings", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "setFilterSettings", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)V", "filterSettings", "getShouldShowScanAreaGuides", "setShouldShowScanAreaGuides", "shouldShowScanAreaGuides", "getShouldShowStatusIconsOnScan", "setShouldShowStatusIconsOnScan", "shouldShowStatusIconsOnScan", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "style", "value", "recognizedBrush", "getRecognizedBrush", "setRecognizedBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "unrecognizedBrush", "getUnrecognizedBrush", "setUnrecognizedBrush", "notInListBrush", "getNotInListBrush", "setNotInListBrush", "acceptedNotInListBrush", "getAcceptedNotInListBrush", "setAcceptedNotInListBrush", "rejectedNotInListBrush", "getRejectedNotInListBrush", "setRejectedNotInListBrush", "getShouldShowHints", "setShouldShowHints", "shouldShowHints", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayColorScheme;", "getColorScheme$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayColorScheme;", "setColorScheme$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayColorScheme;)V", "colorScheme", "Companion", "com/scandit/datacapture/barcode/count/ui/overlay/a", "com/scandit/datacapture/barcode/count/ui/overlay/d", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
@Mockable
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeCountBasicOverlay extends ViewBasedDataCaptureOverlay implements DataCaptureOverlay, InterfaceC13091a, BarcodeCountBasicOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeCountBasicOverlayProxyAdapter f120759a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Brush defaultRecognizedBrush;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Brush defaultUnrecognizedBrush;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Brush defaultNotInListBrush;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Brush defaultAcceptedNotInListBrush;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Brush defaultRejectedNotInListBrush;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private BarcodeCountBasicOverlayListener listener;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private BarcodeCountBasicOverlayUiListener uiListener;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private BarcodeCountBasicOverlayCallback callback;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f120768j;

    /* renamed from: k, reason: collision with root package name */
    private final C13057a f120769k;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0004J!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay$Companion;", "", "Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultRecognizedBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultUnrecognizedBrush", "defaultNotInListBrush", "defaultAcceptedNotInListBrush", "defaultRejectedNotInListBrush", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "mode", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "newInstance", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Lcom/scandit/datacapture/core/ui/DataCaptureView;)Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "style", "(Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;)Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeCountBasicOverlay newInstance(BarcodeCount mode, DataCaptureView view) {
            Intrinsics.j(mode, "mode");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, view, C13058b.f120782a);
            BarcodeCountBasicOverlay barcodeCountBasicOverlay = new BarcodeCountBasicOverlay(mode, view, null);
            BarcodeCountBasicOverlay.INSTANCE.getClass();
            if (view != null) {
                view.addOverlay(barcodeCountBasicOverlay);
            }
            new WeakReference(mode);
            barcodeCountBasicOverlay.getClass();
            return barcodeCountBasicOverlay;
        }

        @JvmStatic
        public final Brush defaultAcceptedNotInListBrush() {
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush nativeBrushDefaultBrushForAcceptedBarcode = NativeBarcodeCountBasicOverlay.defaultBrushForAcceptedBarcode();
            Intrinsics.i(nativeBrushDefaultBrushForAcceptedBarcode, "defaultBrushForAcceptedBarcode(...)");
            return BrushExtensionsKt.of(companion, nativeBrushDefaultBrushForAcceptedBarcode);
        }

        @JvmStatic
        public final Brush defaultNotInListBrush() {
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush nativeBrushDefaultBrushForTrackedBarcodeNotInList = NativeBarcodeCountBasicOverlay.defaultBrushForTrackedBarcodeNotInList();
            Intrinsics.i(nativeBrushDefaultBrushForTrackedBarcodeNotInList, "defaultBrushForTrackedBarcodeNotInList(...)");
            return BrushExtensionsKt.of(companion, nativeBrushDefaultBrushForTrackedBarcodeNotInList);
        }

        @JvmStatic
        public final Brush defaultRecognizedBrush() {
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush nativeBrushDefaultBrushForTrackedBarcode = NativeBarcodeCountBasicOverlay.defaultBrushForTrackedBarcode();
            Intrinsics.i(nativeBrushDefaultBrushForTrackedBarcode, "defaultBrushForTrackedBarcode(...)");
            return BrushExtensionsKt.of(companion, nativeBrushDefaultBrushForTrackedBarcode);
        }

        @JvmStatic
        public final Brush defaultRejectedNotInListBrush() {
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush nativeBrushDefaultBrushForRejectedBarcode = NativeBarcodeCountBasicOverlay.defaultBrushForRejectedBarcode();
            Intrinsics.i(nativeBrushDefaultBrushForRejectedBarcode, "defaultBrushForRejectedBarcode(...)");
            return BrushExtensionsKt.of(companion, nativeBrushDefaultBrushForRejectedBarcode);
        }

        @JvmStatic
        public final Brush defaultUnrecognizedBrush() {
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush nativeBrushDefaultBrushForUnscannedTrackedBarcode = NativeBarcodeCountBasicOverlay.defaultBrushForUnscannedTrackedBarcode();
            Intrinsics.i(nativeBrushDefaultBrushForUnscannedTrackedBarcode, "defaultBrushForUnscannedTrackedBarcode(...)");
            return BrushExtensionsKt.of(companion, nativeBrushDefaultBrushForUnscannedTrackedBarcode);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final BarcodeCountBasicOverlay newInstance(DataCaptureView view, BarcodeCount mode, NativeBarcodeCountBasicOverlayStyle style) {
            Intrinsics.j(mode, "mode");
            Intrinsics.j(style, "style");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(mode, view, C13059c.f120783a);
            BarcodeCountBasicOverlay barcodeCountBasicOverlay = new BarcodeCountBasicOverlay(mode, view, style, null);
            BarcodeCountBasicOverlay.INSTANCE.getClass();
            if (view != null) {
                view.addOverlay(barcodeCountBasicOverlay);
            }
            new WeakReference(mode);
            barcodeCountBasicOverlay.getClass();
            return barcodeCountBasicOverlay;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeCountBasicOverlay(NativeBarcodeCountBasicOverlay impl, DataCaptureView dataCaptureView) {
        super(AppAndroidEnvironment.INSTANCE.getApplicationContext());
        Intrinsics.j(impl, "impl");
        this.f120759a = new BarcodeCountBasicOverlayProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        Companion companion = INSTANCE;
        this.defaultRecognizedBrush = companion.defaultRecognizedBrush();
        this.defaultUnrecognizedBrush = companion.defaultUnrecognizedBrush();
        this.defaultNotInListBrush = companion.defaultNotInListBrush();
        this.defaultAcceptedNotInListBrush = companion.defaultAcceptedNotInListBrush();
        this.defaultRejectedNotInListBrush = companion.defaultRejectedNotInListBrush();
        this.f120768j = new WeakReference(dataCaptureView);
        this.f120769k = new C13057a(this);
        impl.setListener(new BarcodeCountBasicOverlayListenerReversedAdapter(new C13060d(this), this, null, 4, null));
        impl.setUiListener(new BarcodeCountBasicOverlayUiListenerReversedAdapter(new C13060d(this), this, null, 4, null));
    }

    @JvmStatic
    public static final Brush defaultAcceptedNotInListBrush() {
        return INSTANCE.defaultAcceptedNotInListBrush();
    }

    @JvmStatic
    public static final Brush defaultNotInListBrush() {
        return INSTANCE.defaultNotInListBrush();
    }

    @JvmStatic
    public static final Brush defaultRecognizedBrush() {
        return INSTANCE.defaultRecognizedBrush();
    }

    @JvmStatic
    public static final Brush defaultRejectedNotInListBrush() {
        return INSTANCE.defaultRejectedNotInListBrush();
    }

    @JvmStatic
    public static final Brush defaultUnrecognizedBrush() {
        return INSTANCE.defaultUnrecognizedBrush();
    }

    @JvmStatic
    public static final BarcodeCountBasicOverlay newInstance(BarcodeCount barcodeCount, DataCaptureView dataCaptureView) {
        return INSTANCE.newInstance(barcodeCount, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @NativeImpl
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getF120775c() {
        return this.f120759a.getF120775c();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeCountBasicOverlay getF120773a() {
        return this.f120759a.getF120773a();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setProfilingOverlay")
    public void _setProfilingOverlay(ProfilingOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        this.f120759a._setProfilingOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public NativeBarcodeClusterLiveEditor beginClusterEditing() {
        return this.f120759a.beginClusterEditing();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "didAcceptNotInListBarcode")
    public void didAcceptNotInListBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        this.f120759a.didAcceptNotInListBarcode(barcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "didCancelNotInListBarcode")
    public void didCancelNotInListBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        this.f120759a.didCancelNotInListBarcode(barcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "didRejectNotInListBarcode")
    public void didRejectNotInListBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        this.f120759a.didRejectNotInListBarcode(barcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "getFilterSettings", property = "filterSettings")
    public BarcodeFilterHighlightSettings getFilterSettings() {
        return this.f120759a.getFilterSettings();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "shouldShowScanAreaGuides", property = "shouldShowScanAreaGuides")
    public boolean getShouldShowScanAreaGuides() {
        return this.f120759a.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "shouldShowStatusIconsOnScan", property = "shouldShowStatusIconsOnScan")
    public boolean getShouldShowStatusIconsOnScan() {
        return this.f120759a.getShouldShowStatusIconsOnScan();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(property = "style")
    public NativeBarcodeCountBasicOverlayStyle getStyle() {
        return this.f120759a.getStyle();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "getTextForWrongBarcodesDetectedHint")
    public String getTextForBarcodesNotInListDetectedHint() {
        return this.f120759a.getTextForBarcodesNotInListDetectedHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public String getTextForMoveCloserAndRescanHint() {
        return this.f120759a.getTextForMoveCloserAndRescanHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public String getTextForMoveFurtherAndRescanHint() {
        return this.f120759a.getTextForMoveFurtherAndRescanHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public String getTextForScanningHint() {
        return this.f120759a.getTextForScanningHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public String getTextForScreenCleanedUpHint() {
        return this.f120759a.getTextForScreenCleanedUpHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public String getTextForTapShutterToScanHint() {
        return this.f120759a.getTextForTapShutterToScanHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public String getTextForTapToUncountHint() {
        return this.f120759a.getTextForTapToUncountHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public String getTextForUnscannedBarcodesDetectedHint() {
        return this.f120759a.getTextForUnscannedBarcodesDetectedHint();
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setFilterSettings", property = "filterSettings")
    public void setFilterSettings(BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        this.f120759a.setFilterSettings(barcodeFilterHighlightSettings);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setShouldShowScanAreaGuides", property = "shouldShowScanAreaGuides")
    public void setShouldShowScanAreaGuides(boolean z10) {
        this.f120759a.setShouldShowScanAreaGuides(z10);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setShouldShowStatusIconsOnScan", property = "shouldShowStatusIconsOnScan")
    public void setShouldShowStatusIconsOnScan(boolean z10) {
        this.f120759a.setShouldShowStatusIconsOnScan(z10);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setTextForWrongBarcodesDetectedHint")
    public void setTextForBarcodesNotInListDetectedHint(String text) {
        Intrinsics.j(text, "text");
        this.f120759a.setTextForBarcodesNotInListDetectedHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setTextForSwipeToGroupHint")
    public void setTextForClusteringGestureHint(String text) {
        Intrinsics.j(text, "text");
        this.f120759a.setTextForClusteringGestureHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForMoveCloserAndRescanHint(String text) {
        Intrinsics.j(text, "text");
        this.f120759a.setTextForMoveCloserAndRescanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForMoveFurtherAndRescanHint(String text) {
        Intrinsics.j(text, "text");
        this.f120759a.setTextForMoveFurtherAndRescanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForScanningHint(String text) {
        Intrinsics.j(text, "text");
        this.f120759a.setTextForScanningHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForScreenCleanedUpHint(String text) {
        Intrinsics.j(text, "text");
        this.f120759a.setTextForScreenCleanedUpHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForTapShutterToScanHint(String text) {
        Intrinsics.j(text, "text");
        this.f120759a.setTextForTapShutterToScanHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForTapToUncountHint(String text) {
        Intrinsics.j(text, "text");
        this.f120759a.setTextForTapToUncountHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction(nativeName = "setTextForRescanYellowCodesHint")
    public void setTextForUnrecognizedBarcodesInClusterHint(String text) {
        Intrinsics.j(text, "text");
        this.f120759a.setTextForUnrecognizedBarcodesInClusterHint(text);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayProxy
    @ProxyFunction
    public void setTextForUnscannedBarcodesDetectedHint(String text) {
        Intrinsics.j(text, "text");
        this.f120759a.setTextForUnscannedBarcodesDetectedHint(text);
    }

    @JvmStatic
    public static final BarcodeCountBasicOverlay newInstance(DataCaptureView dataCaptureView, BarcodeCount barcodeCount, NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyle) {
        return INSTANCE.newInstance(dataCaptureView, barcodeCount, nativeBarcodeCountBasicOverlayStyle);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public void _cleanupViews() {
        BarcodeCountBasicOverlayCallback barcodeCountBasicOverlayCallback = this.callback;
        if (barcodeCountBasicOverlayCallback != null) {
            barcodeCountBasicOverlayCallback.cleanUpOverlayViews();
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public void _setDataCaptureView(DataCaptureView view) {
        DataCaptureView dataCaptureView;
        Intrinsics.j(view, "view");
        this.f120768j = new WeakReference(view);
        if (!isAttachedToWindow() || (dataCaptureView = (DataCaptureView) this.f120768j.get()) == null) {
            return;
        }
        dataCaptureView.addListener(this.f120769k);
        C13057a c13057a = this.f120769k;
        int width = dataCaptureView.getWidth();
        int height = dataCaptureView.getHeight();
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        c13057a.onSizeChanged(width, height, ContextExtensionsKt.getRotation(context));
    }

    public final void applyNotInListActionSettings$scandit_barcode_capture(BarcodeCountNotInListActionSettings settings) {
        Intrinsics.j(settings, "settings");
        getF120773a().applyNotInListActionSettings(settings.toNative$scandit_barcode_capture());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush brushForAcceptedBarcodeNotInList(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        NativeBrush nativeBrushBrushForAcceptedBarcode = getF120773a().brushForAcceptedBarcode(barcode.getF120470a());
        if (nativeBrushBrushForAcceptedBarcode != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, nativeBrushBrushForAcceptedBarcode);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush brushForRejectedBarcodeNotInList(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        NativeBrush nativeBrushBrushForRejectedBarcode = getF120773a().brushForRejectedBarcode(barcode.getF120470a());
        if (nativeBrushBrushForRejectedBarcode != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, nativeBrushBrushForRejectedBarcode);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush brushForTrackedBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        NativeBrush nativeBrushBrushForTrackedBarcode = getF120773a().brushForTrackedBarcode(barcode.getF120470a());
        if (nativeBrushBrushForTrackedBarcode != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, nativeBrushBrushForTrackedBarcode);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush brushForTrackedBarcodeNotInList(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        NativeBrush nativeBrushBrushForTrackedBarcodeNotInList = getF120773a().brushForTrackedBarcodeNotInList(barcode.getF120470a());
        if (nativeBrushBrushForTrackedBarcodeNotInList != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, nativeBrushBrushForTrackedBarcodeNotInList);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush brushForUnscannedTrackedBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        NativeBrush nativeBrushBrushForUnscannedTrackedBarcode = getF120773a().brushForUnscannedTrackedBarcode(barcode.getF120470a());
        if (nativeBrushBrushForUnscannedTrackedBarcode != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, nativeBrushBrushForUnscannedTrackedBarcode);
        }
        return null;
    }

    public final void didTapAcceptedBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        getF120773a().didTapAcceptedBarcode(barcode.getF120470a());
    }

    public final void didTapCluster(NativeCluster cluster) {
        Intrinsics.j(cluster, "cluster");
        getF120773a().didTapCluster(cluster);
    }

    public final void didTapFilteredBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        getF120773a().didTapFilteredBarcode(barcode.getF120470a());
    }

    public final void didTapNotInListBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        getF120773a().didTapNotInListBarcode(barcode.getF120470a());
    }

    public final void didTapRejectedBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        getF120773a().didTapRejectedBarcode(barcode.getF120470a());
    }

    public final void didTapScannedBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        getF120773a().didTapScannedBarcode(barcode.getF120470a());
    }

    public final void didTapUnscannedBarcode(TrackedBarcode barcode) {
        Intrinsics.j(barcode, "barcode");
        getF120773a().didTapUnscannedBarcode(barcode.getF120470a());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush getAcceptedNotInListBrush() {
        Brush.Companion companion = Brush.INSTANCE;
        NativeBrush acceptedBrush = getF120773a().getAcceptedBrush();
        Intrinsics.i(acceptedBrush, "getAcceptedBrush(...)");
        return BrushExtensionsKt.of(companion, acceptedBrush);
    }

    public final BarcodeCountBasicOverlayCallback getCallback() {
        return this.callback;
    }

    public Brush getDefaultAcceptedNotInListBrush() {
        return this.defaultAcceptedNotInListBrush;
    }

    public Brush getDefaultNotInListBrush() {
        return this.defaultNotInListBrush;
    }

    public Brush getDefaultRecognizedBrush() {
        return this.defaultRecognizedBrush;
    }

    public Brush getDefaultRejectedNotInListBrush() {
        return this.defaultRejectedNotInListBrush;
    }

    public Brush getDefaultUnrecognizedBrush() {
        return this.defaultUnrecognizedBrush;
    }

    public final BarcodeCountBasicOverlayListener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush getRejectedNotInListBrush() {
        Brush.Companion companion = Brush.INSTANCE;
        NativeBrush rejectedBrush = getF120773a().getRejectedBrush();
        Intrinsics.i(rejectedBrush, "getRejectedBrush(...)");
        return BrushExtensionsKt.of(companion, rejectedBrush);
    }

    public final BarcodeCountBasicOverlayUiListener getUiListener() {
        return this.uiListener;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public boolean isListenerSet() {
        return this.listener != null;
    }

    public final void setCallback(BarcodeCountBasicOverlayCallback barcodeCountBasicOverlayCallback) {
        this.callback = barcodeCountBasicOverlayCallback;
    }

    public final void setColorScheme$scandit_barcode_capture(NativeBarcodeCountBasicOverlayColorScheme value) {
        Intrinsics.j(value, "value");
        getF120773a().setColorScheme(value);
    }

    public final void setGuidanceHandler$scandit_barcode_capture(NativeBarcodeCountGuidanceHandler guidanceHandler) {
        Intrinsics.j(guidanceHandler, "guidanceHandler");
        getF120773a().setGuidanceHandler(guidanceHandler);
    }

    public final void setListener(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener) {
        this.listener = barcodeCountBasicOverlayListener;
    }

    public final void setUiListener(BarcodeCountBasicOverlayUiListener barcodeCountBasicOverlayUiListener) {
        this.uiListener = barcodeCountBasicOverlayUiListener;
    }

    public final void setViewHandler$scandit_barcode_capture(NativeBarcodeCountViewHandler viewHandler) {
        Intrinsics.j(viewHandler, "viewHandler");
        getF120773a().setViewHandler(viewHandler);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush brushFromFilterSettings() {
        NativeBrush brush;
        NativeBarcodeFilterOverlaySettings filterSettings = getF120773a().getFilterSettings();
        if (filterSettings != null && (brush = filterSettings.getBrush()) != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, brush);
        }
        return null;
    }

    public final void clearHighlights() {
        getF120773a().clearHighlightsButtonPressed();
    }

    public final void exitButtonPressed() {
        getF120773a().exitButtonPressed();
    }

    public final NativeBarcodeCountBasicOverlayColorScheme getColorScheme$scandit_barcode_capture() {
        NativeBarcodeCountBasicOverlayColorScheme colorScheme = getF120773a().getColorScheme();
        Intrinsics.i(colorScheme, "getColorScheme(...)");
        return colorScheme;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush getNotInListBrush() {
        NativeBrush notInListBrush = getF120773a().getNotInListBrush();
        if (notInListBrush != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, notInListBrush);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush getRecognizedBrush() {
        NativeBrush scannedBrush = getF120773a().getScannedBrush();
        if (scannedBrush != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, scannedBrush);
        }
        return null;
    }

    public final boolean getShouldShowHints() {
        return getF120773a().isHintsEnabled();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.InterfaceC13091a
    public Brush getUnrecognizedBrush() {
        NativeBrush unscannedBrush = getF120773a().getUnscannedBrush();
        if (unscannedBrush != null) {
            return BrushExtensionsKt.of(Brush.INSTANCE, unscannedBrush);
        }
        return null;
    }

    public final void listButtonPressed() {
        getF120773a().listButtonPressed();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        DataCaptureView dataCaptureView;
        super.onAttachedToWindow();
        if (this.f120768j.get() != null && (dataCaptureView = (DataCaptureView) this.f120768j.get()) != null) {
            dataCaptureView.addListener(this.f120769k);
            C13057a c13057a = this.f120769k;
            int width = dataCaptureView.getWidth();
            int height = dataCaptureView.getHeight();
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            c13057a.onSizeChanged(width, height, ContextExtensionsKt.getRotation(context));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataCaptureView dataCaptureView = (DataCaptureView) this.f120768j.get();
        if (dataCaptureView != null) {
            dataCaptureView.removeListener(this.f120769k);
        }
    }

    public void setAcceptedNotInListBrush(Brush brush) {
        NativeBrush nativeBrushConvert;
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay_impl = getF120773a();
        if (brush != null) {
            nativeBrushConvert = CoreNativeTypeFactory.INSTANCE.convert(brush);
        } else {
            nativeBrushConvert = null;
        }
        nativeBarcodeCountBasicOverlay_impl.setAcceptedBrush(nativeBrushConvert);
    }

    public void setNotInListBrush(Brush brush) {
        NativeBrush nativeBrushConvert;
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay_impl = getF120773a();
        if (brush != null) {
            nativeBrushConvert = CoreNativeTypeFactory.INSTANCE.convert(brush);
        } else {
            nativeBrushConvert = null;
        }
        nativeBarcodeCountBasicOverlay_impl.setNotInListBrush(nativeBrushConvert);
    }

    public void setRecognizedBrush(Brush brush) {
        NativeBrush nativeBrushConvert;
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay_impl = getF120773a();
        if (brush != null) {
            nativeBrushConvert = CoreNativeTypeFactory.INSTANCE.convert(brush);
        } else {
            nativeBrushConvert = null;
        }
        nativeBarcodeCountBasicOverlay_impl.setScannedBrush(nativeBrushConvert);
    }

    public void setRejectedNotInListBrush(Brush brush) {
        NativeBrush nativeBrushConvert;
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay_impl = getF120773a();
        if (brush != null) {
            nativeBrushConvert = CoreNativeTypeFactory.INSTANCE.convert(brush);
        } else {
            nativeBrushConvert = null;
        }
        nativeBarcodeCountBasicOverlay_impl.setRejectedBrush(nativeBrushConvert);
    }

    public final void setShouldShowHints(boolean z10) {
        getF120773a().setHintsEnabled(z10);
    }

    public final void setStatusModeEnabled$scandit_barcode_capture(boolean statusModeEnabled) {
        getF120773a().setStatusModeEnabled(statusModeEnabled);
    }

    public void setUnrecognizedBrush(Brush brush) {
        NativeBrush nativeBrushConvert;
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay_impl = getF120773a();
        if (brush != null) {
            nativeBrushConvert = CoreNativeTypeFactory.INSTANCE.convert(brush);
        } else {
            nativeBrushConvert = null;
        }
        nativeBarcodeCountBasicOverlay_impl.setUnscannedBrush(nativeBrushConvert);
    }

    public final void shutterButtonPressed() {
        getF120773a().shutterButtonPressed();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCountBasicOverlay(BarcodeCount barcodeCount, DataCaptureView dataCaptureView, DefaultConstructorMarker defaultConstructorMarker) {
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlayCreate = NativeBarcodeCountBasicOverlay.create(barcodeCount._impl(), NativeBarcodeCountBasicOverlayStyle.ICON);
        Intrinsics.i(nativeBarcodeCountBasicOverlayCreate, "create(...)");
        this(nativeBarcodeCountBasicOverlayCreate, dataCaptureView);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCountBasicOverlay(BarcodeCount barcodeCount, DataCaptureView dataCaptureView, NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyle, DefaultConstructorMarker defaultConstructorMarker) {
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlayCreate = NativeBarcodeCountBasicOverlay.create(barcodeCount._impl(), nativeBarcodeCountBasicOverlayStyle);
        Intrinsics.i(nativeBarcodeCountBasicOverlayCreate, "create(...)");
        this(nativeBarcodeCountBasicOverlayCreate, dataCaptureView);
    }
}
