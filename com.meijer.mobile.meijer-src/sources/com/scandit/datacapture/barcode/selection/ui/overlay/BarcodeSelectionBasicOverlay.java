package com.scandit.datacapture.barcode.selection.ui.overlay;

import com.scandit.datacapture.barcode.selection.capture.BarcodeSelection;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionBrushProvider;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionBrushProviderReversedAdapter;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionDeserializer;
import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.OverlayPreconditionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.viewfinder.AimerViewfinder;
import com.scandit.datacapture.core.ui.viewfinder.Viewfinder;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0003SRTB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010.\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R$\u00105\u001a\u00020/2\u0006\u00100\u001a\u00020/8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010;\u001a\u0002062\u0006\u00100\u001a\u0002068W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010>\u001a\u00020/2\u0006\u00100\u001a\u00020/8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b<\u00102\"\u0004\b=\u00104R$\u0010A\u001a\u00020/2\u0006\u00100\u001a\u00020/8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b?\u00102\"\u0004\b@\u00104R$\u0010G\u001a\u00020B2\u0006\u00100\u001a\u00020B8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020B2\u0006\u00100\u001a\u00020B8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\u0014\u0010N\u001a\u00020K8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010MR$\u0010Q\u001a\u00020/2\u0006\u00100\u001a\u00020/8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bO\u00102\"\u0004\bP\u00104¨\u0006U"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;", "impl", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "viewfinder", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "()Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;", "overlay", "", "_setProfilingOverlay", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/ProfilingOverlay;)V", "clearSelectedBarcodeBrushes", "()V", "", "text", "setTextForAimToSelectAutoHint", "(Ljava/lang/String;)V", "setTextForDoubleTapToUnfreezeHint", "setTextForSelectOrDoubleTapToFreezeHint", "setTextForTapAnywhereToSelectHint", "setTextForTapToSelectHint", "jsonData", "updateFromJson", "a", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "getViewfinder", "()Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;", "c", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;", "getAimedBarcodeBrushProvider", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;", "setAimedBarcodeBrushProvider", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionBrushProvider;)V", "aimedBarcodeBrushProvider", "d", "getTrackedBarcodeBrushProvider", "setTrackedBarcodeBrushProvider", "trackedBarcodeBrushProvider", "Lcom/scandit/datacapture/core/ui/style/Brush;", "<set-?>", "getAimedBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setAimedBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "aimedBrush", "", "getFrozenBackgroundColor", "()I", "setFrozenBackgroundColor", "(I)V", "frozenBackgroundColor", "getSelectedBrush", "setSelectedBrush", "selectedBrush", "getSelectingBrush", "setSelectingBrush", "selectingBrush", "", "getShouldShowHints", "()Z", "setShouldShowHints", "(Z)V", "shouldShowHints", "getShouldShowScanAreaGuides", "setShouldShowScanAreaGuides", "shouldShowScanAreaGuides", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "style", "getTrackedBrush", "setTrackedBrush", "trackedBrush", "Companion", "com/scandit/datacapture/barcode/selection/ui/overlay/a", "com/scandit/datacapture/barcode/selection/ui/overlay/d", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeSelectionBasicOverlay implements DataCaptureOverlay, BarcodeSelectionBasicOverlayProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Viewfinder viewfinder;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BarcodeSelectionBasicOverlayProxyAdapter f124798b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BarcodeSelectionBrushProvider aimedBarcodeBrushProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private BarcodeSelectionBrushProvider trackedBarcodeBrushProvider;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0006J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay$Companion;", "", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "style", "Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultTrackedBrush", "(Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;)Lcom/scandit/datacapture/core/ui/style/Brush;", "defaultAimedBrush", "defaultSelectingBrush", "defaultSelectedBrush", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "barcodeSelection", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "view", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "newInstance", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;Lcom/scandit/datacapture/core/ui/DataCaptureView;)Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;Lcom/scandit/datacapture/core/ui/DataCaptureView;Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;)Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "mode", "", "jsonData", "fromJson", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlay;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeSelectionBasicOverlay newInstance(BarcodeSelection barcodeSelection, DataCaptureView view) {
            Intrinsics.j(barcodeSelection, "barcodeSelection");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(barcodeSelection, view, b.f124806a);
            BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = new BarcodeSelectionBasicOverlay(barcodeSelection, new AimerViewfinder(), null);
            if (view != null) {
                view.addOverlay(barcodeSelectionBasicOverlay);
            }
            return barcodeSelectionBasicOverlay;
        }

        @JvmStatic
        public final Brush defaultAimedBrush(BarcodeSelectionBasicOverlayStyle style) {
            Intrinsics.j(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultAimedBrushForStyle = NativeBarcodeSelectionBasicOverlay.getDefaultAimedBrushForStyle(style);
            Intrinsics.i(defaultAimedBrushForStyle, "getDefaultAimedBrushForStyle(...)");
            return BrushExtensionsKt.of(companion, defaultAimedBrushForStyle);
        }

        @JvmStatic
        public final Brush defaultSelectedBrush(BarcodeSelectionBasicOverlayStyle style) {
            Intrinsics.j(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultSelectedBrushForStyle = NativeBarcodeSelectionBasicOverlay.getDefaultSelectedBrushForStyle(style);
            Intrinsics.i(defaultSelectedBrushForStyle, "getDefaultSelectedBrushForStyle(...)");
            return BrushExtensionsKt.of(companion, defaultSelectedBrushForStyle);
        }

        @JvmStatic
        public final Brush defaultSelectingBrush(BarcodeSelectionBasicOverlayStyle style) {
            Intrinsics.j(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultSelectingBrushForStyle = NativeBarcodeSelectionBasicOverlay.getDefaultSelectingBrushForStyle(style);
            Intrinsics.i(defaultSelectingBrushForStyle, "getDefaultSelectingBrushForStyle(...)");
            return BrushExtensionsKt.of(companion, defaultSelectingBrushForStyle);
        }

        @JvmStatic
        public final Brush defaultTrackedBrush(BarcodeSelectionBasicOverlayStyle style) {
            Intrinsics.j(style, "style");
            Brush.Companion companion = Brush.INSTANCE;
            NativeBrush defaultTrackedBrushForStyle = NativeBarcodeSelectionBasicOverlay.getDefaultTrackedBrushForStyle(style);
            Intrinsics.i(defaultTrackedBrushForStyle, "getDefaultTrackedBrushForStyle(...)");
            return BrushExtensionsKt.of(companion, defaultTrackedBrushForStyle);
        }

        @JvmStatic
        public final BarcodeSelectionBasicOverlay fromJson(BarcodeSelection mode, String jsonData) {
            Intrinsics.j(mode, "mode");
            Intrinsics.j(jsonData, "jsonData");
            return new BarcodeSelectionDeserializer().basicOverlayFromJson(mode, jsonData);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final BarcodeSelectionBasicOverlay newInstance(BarcodeSelection barcodeSelection, DataCaptureView view, BarcodeSelectionBasicOverlayStyle style) {
            Intrinsics.j(barcodeSelection, "barcodeSelection");
            Intrinsics.j(style, "style");
            OverlayPreconditionsKt.checkAttachedToSameDataCaptureContext(barcodeSelection, view, c.f124807a);
            BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = new BarcodeSelectionBasicOverlay(barcodeSelection, new AimerViewfinder(), style, null);
            if (view != null) {
                view.addOverlay(barcodeSelectionBasicOverlay);
            }
            return barcodeSelectionBasicOverlay;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeSelectionBasicOverlay(NativeBarcodeSelectionBasicOverlay impl, Viewfinder viewfinder) {
        Intrinsics.j(impl, "impl");
        Intrinsics.j(viewfinder, "viewfinder");
        this.viewfinder = viewfinder;
        this.f124798b = new BarcodeSelectionBasicOverlayProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        int i10 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ProxyCache proxyCache = null;
        impl.setAimedBarcodeBrushProvider(new BarcodeSelectionBrushProviderReversedAdapter(new a(this), this, proxyCache, i10, defaultConstructorMarker));
        impl.setTrackedBarcodeBrushProvider(new BarcodeSelectionBrushProviderReversedAdapter(new d(this), this, proxyCache, i10, defaultConstructorMarker));
    }

    @JvmStatic
    public static final Brush defaultAimedBrush(BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        return INSTANCE.defaultAimedBrush(barcodeSelectionBasicOverlayStyle);
    }

    @JvmStatic
    public static final Brush defaultSelectedBrush(BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        return INSTANCE.defaultSelectedBrush(barcodeSelectionBasicOverlayStyle);
    }

    @JvmStatic
    public static final Brush defaultSelectingBrush(BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        return INSTANCE.defaultSelectingBrush(barcodeSelectionBasicOverlayStyle);
    }

    @JvmStatic
    public static final Brush defaultTrackedBrush(BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        return INSTANCE.defaultTrackedBrush(barcodeSelectionBasicOverlayStyle);
    }

    @JvmStatic
    public static final BarcodeSelectionBasicOverlay fromJson(BarcodeSelection barcodeSelection, String str) {
        return INSTANCE.fromJson(barcodeSelection, str);
    }

    @JvmStatic
    public static final BarcodeSelectionBasicOverlay newInstance(BarcodeSelection barcodeSelection, DataCaptureView dataCaptureView) {
        return INSTANCE.newInstance(barcodeSelection, dataCaptureView);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    @NativeImpl
    /* renamed from: _dataCaptureOverlayImpl */
    public NativeDataCaptureOverlay getF124803c() {
        return this.f124798b.getF124803c();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeSelectionBasicOverlay getF124801a() {
        return this.f124798b.getF124801a();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(nativeName = "setProfilingOverlay")
    public void _setProfilingOverlay(ProfilingOverlay overlay) {
        Intrinsics.j(overlay, "overlay");
        this.f124798b._setProfilingOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void clearSelectedBarcodeBrushes() {
        this.f124798b.clearSelectedBarcodeBrushes();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "aimedBrush")
    public Brush getAimedBrush() {
        return this.f124798b.getAimedBrush();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(nativeName = "getFreezeOverlayColor", property = "frozenBackgroundColor")
    public int getFrozenBackgroundColor() {
        return this.f124798b.getFrozenBackgroundColor();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "selectedBrush")
    public Brush getSelectedBrush() {
        return this.f124798b.getSelectedBrush();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "selectingBrush")
    public Brush getSelectingBrush() {
        return this.f124798b.getSelectingBrush();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(nativeName = "getShowHints", property = "shouldShowHints")
    public boolean getShouldShowHints() {
        return this.f124798b.getShouldShowHints();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public boolean getShouldShowScanAreaGuides() {
        return this.f124798b.getShouldShowScanAreaGuides();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "style")
    public BarcodeSelectionBasicOverlayStyle getStyle() {
        return this.f124798b.getStyle();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "trackedBrush")
    public Brush getTrackedBrush() {
        return this.f124798b.getTrackedBrush();
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "aimedBrush")
    public void setAimedBrush(Brush brush) {
        Intrinsics.j(brush, "<set-?>");
        this.f124798b.setAimedBrush(brush);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(nativeName = "setFreezeOverlayColor", property = "frozenBackgroundColor")
    public void setFrozenBackgroundColor(int i10) {
        this.f124798b.setFrozenBackgroundColor(i10);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "selectedBrush")
    public void setSelectedBrush(Brush brush) {
        Intrinsics.j(brush, "<set-?>");
        this.f124798b.setSelectedBrush(brush);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "selectingBrush")
    public void setSelectingBrush(Brush brush) {
        Intrinsics.j(brush, "<set-?>");
        this.f124798b.setSelectingBrush(brush);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(nativeName = "setShowHints", property = "shouldShowHints")
    public void setShouldShowHints(boolean z10) {
        this.f124798b.setShouldShowHints(z10);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "shouldShowScanAreaGuides")
    public void setShouldShowScanAreaGuides(boolean z10) {
        this.f124798b.setShouldShowScanAreaGuides(z10);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void setTextForAimToSelectAutoHint(String text) {
        Intrinsics.j(text, "text");
        this.f124798b.setTextForAimToSelectAutoHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void setTextForDoubleTapToUnfreezeHint(String text) {
        Intrinsics.j(text, "text");
        this.f124798b.setTextForDoubleTapToUnfreezeHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void setTextForSelectOrDoubleTapToFreezeHint(String text) {
        Intrinsics.j(text, "text");
        this.f124798b.setTextForSelectOrDoubleTapToFreezeHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void setTextForTapAnywhereToSelectHint(String text) {
        Intrinsics.j(text, "text");
        this.f124798b.setTextForTapAnywhereToSelectHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction
    public void setTextForTapToSelectHint(String text) {
        Intrinsics.j(text, "text");
        this.f124798b.setTextForTapToSelectHint(text);
    }

    @Override // com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayProxy
    @ProxyFunction(property = "trackedBrush")
    public void setTrackedBrush(Brush brush) {
        Intrinsics.j(brush, "<set-?>");
        this.f124798b.setTrackedBrush(brush);
    }

    @JvmStatic
    public static final BarcodeSelectionBasicOverlay newInstance(BarcodeSelection barcodeSelection, DataCaptureView dataCaptureView, BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle) {
        return INSTANCE.newInstance(barcodeSelection, dataCaptureView, barcodeSelectionBasicOverlayStyle);
    }

    public final BarcodeSelectionBrushProvider getAimedBarcodeBrushProvider() {
        return this.aimedBarcodeBrushProvider;
    }

    public final BarcodeSelectionBrushProvider getTrackedBarcodeBrushProvider() {
        return this.trackedBarcodeBrushProvider;
    }

    public final Viewfinder getViewfinder() {
        return this.viewfinder;
    }

    public final void setAimedBarcodeBrushProvider(BarcodeSelectionBrushProvider barcodeSelectionBrushProvider) {
        this.aimedBarcodeBrushProvider = barcodeSelectionBrushProvider;
    }

    public final void setTrackedBarcodeBrushProvider(BarcodeSelectionBrushProvider barcodeSelectionBrushProvider) {
        this.trackedBarcodeBrushProvider = barcodeSelectionBrushProvider;
    }

    public final void updateFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        new BarcodeSelectionDeserializer().updateBasicOverlayFromJson(this, jsonData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeSelectionBasicOverlay(BarcodeSelection barcodeSelection, Viewfinder viewfinder, DefaultConstructorMarker defaultConstructorMarker) {
        NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlayCreateWithDefaultStyle = NativeBarcodeSelectionBasicOverlay.createWithDefaultStyle(barcodeSelection.getF124737a(), viewfinder.getF127133c());
        Intrinsics.i(nativeBarcodeSelectionBasicOverlayCreateWithDefaultStyle, "createWithDefaultStyle(...)");
        this(nativeBarcodeSelectionBasicOverlayCreateWithDefaultStyle, viewfinder);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeSelectionBasicOverlay(BarcodeSelection barcodeSelection, Viewfinder viewfinder, BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle, DefaultConstructorMarker defaultConstructorMarker) {
        NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlayCreate = NativeBarcodeSelectionBasicOverlay.create(barcodeSelection.getF124737a(), viewfinder.getF127133c(), barcodeSelectionBasicOverlayStyle);
        Intrinsics.i(nativeBarcodeSelectionBasicOverlayCreate, "create(...)");
        this(nativeBarcodeSelectionBasicOverlayCreate, viewfinder);
    }
}
