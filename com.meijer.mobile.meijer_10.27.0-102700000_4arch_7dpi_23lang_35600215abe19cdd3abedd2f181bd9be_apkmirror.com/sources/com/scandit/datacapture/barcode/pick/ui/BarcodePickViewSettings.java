package com.scandit.datacapture.barcode.pick.ui;

import android.content.Context;
import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.barcode.internal.sdk.pick.ui.BarcodePickViewSettingsDefaults;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000bR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00105\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u000b\"\u0004\b3\u00104R\"\u00109\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u0010\u000b\"\u0004\b8\u00104R$\u0010=\u001a\u00020(2\u0006\u0010:\u001a\u00020(8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b;\u0010,\"\u0004\b<\u0010.R(\u0010C\u001a\u0004\u0018\u00010>2\b\u0010:\u001a\u0004\u0018\u00010>8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010I\u001a\u00020D2\u0006\u0010:\u001a\u00020D8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010L\u001a\u00020D2\u0006\u0010:\u001a\u00020D8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR$\u0010O\u001a\u00020D2\u0006\u0010:\u001a\u00020D8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bM\u0010F\"\u0004\bN\u0010HR$\u0010R\u001a\u00020D2\u0006\u0010:\u001a\u00020D8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bP\u0010F\"\u0004\bQ\u0010HR$\u0010U\u001a\u00020D2\u0006\u0010:\u001a\u00020D8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bS\u0010F\"\u0004\bT\u0010HR$\u0010X\u001a\u00020D2\u0006\u0010:\u001a\u00020D8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bV\u0010F\"\u0004\bW\u0010HR$\u0010[\u001a\u00020D2\u0006\u0010:\u001a\u00020D8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bY\u0010F\"\u0004\bZ\u0010HR$\u0010^\u001a\u00020D2\u0006\u0010:\u001a\u00020D8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\\\u0010F\"\u0004\b]\u0010HR$\u0010a\u001a\u00020(2\u0006\u0010:\u001a\u00020(8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b_\u0010,\"\u0004\b`\u0010.R$\u0010d\u001a\u00020(2\u0006\u0010:\u001a\u00020(8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bb\u0010,\"\u0004\bc\u0010.R$\u0010g\u001a\u00020(2\u0006\u0010:\u001a\u00020(8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\be\u0010,\"\u0004\bf\u0010.R$\u0010j\u001a\u00020(2\u0006\u0010:\u001a\u00020(8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bh\u0010,\"\u0004\bi\u0010.R$\u0010m\u001a\u00020(2\u0006\u0010:\u001a\u00020(8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bk\u0010,\"\u0004\bl\u0010.R$\u0010p\u001a\u00020(2\u0006\u0010:\u001a\u00020(8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bn\u0010,\"\u0004\bo\u0010.R$\u0010s\u001a\u00020(2\u0006\u0010:\u001a\u00020(8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bq\u0010,\"\u0004\br\u0010.R$\u0010v\u001a\u00020D2\u0006\u0010:\u001a\u00020D8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bt\u0010F\"\u0004\bu\u0010HR$\u0010|\u001a\u00020w2\u0006\u0010:\u001a\u00020w8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R$\u0010\u007f\u001a\u00020w2\u0006\u0010:\u001a\u00020w8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b}\u0010y\"\u0004\b~\u0010{R\u0016\u0010\u0081\u0001\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u000bR\u0016\u0010\u0083\u0001\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u000b¨\u0006\u0084\u0001"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;)V", "()V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;", "", "maxIconSize$scandit_barcode_capture", "()F", "maxIconSize", "minIconSize$scandit_barcode_capture", "minIconSize", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "value", "b", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "getHighlightStyle", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "setHighlightStyle", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;)V", "highlightStyle", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "c", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "getUiButtonsOffset", "()Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "setUiButtonsOffset", "(Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;)V", "uiButtonsOffset", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "d", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "getFilterHighlightSettings", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;", "setFilterHighlightSettings", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightSettings;)V", "filterHighlightSettings", "", "e", "Z", "getDrawDebugInfo$scandit_barcode_capture", "()Z", "setDrawDebugInfo$scandit_barcode_capture", "(Z)V", "drawDebugInfo", "f", "F", "getMaxIconSizeForRectangularStyle$scandit_barcode_capture", "setMaxIconSizeForRectangularStyle$scandit_barcode_capture", "(F)V", "maxIconSizeForRectangularStyle", "g", "getIconSizeForDotStyle$scandit_barcode_capture", "setIconSizeForDotStyle$scandit_barcode_capture", "iconSizeForDotStyle", "<set-?>", "getHardwareTriggerEnabled", "setHardwareTriggerEnabled", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, "", "getHardwareTriggerKeyCode", "()Ljava/lang/Integer;", "setHardwareTriggerKeyCode", "(Ljava/lang/Integer;)V", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "", "getInitialGuidelineText", "()Ljava/lang/String;", "setInitialGuidelineText", "(Ljava/lang/String;)V", "initialGuidelineText", "getLoadingDialogTextForPicking", "setLoadingDialogTextForPicking", "loadingDialogTextForPicking", "getLoadingDialogTextForUnpicking", "setLoadingDialogTextForUnpicking", "loadingDialogTextForUnpicking", "getMoveCloserGuidelineText", "setMoveCloserGuidelineText", "moveCloserGuidelineText", "getOnFirstItemPickCompletedHintText", "setOnFirstItemPickCompletedHintText", "onFirstItemPickCompletedHintText", "getOnFirstItemToPickFoundHintText", "setOnFirstItemToPickFoundHintText", "onFirstItemToPickFoundHintText", "getOnFirstItemUnpickCompletedHintText", "setOnFirstItemUnpickCompletedHintText", "onFirstItemUnpickCompletedHintText", "getOnFirstUnmarkedItemPickCompletedHintText", "setOnFirstUnmarkedItemPickCompletedHintText", "onFirstUnmarkedItemPickCompletedHintText", "getShowFinishButton", "setShowFinishButton", "showFinishButton", "getShowGuidelines", "setShowGuidelines", "showGuidelines", "getShowHints", "setShowHints", "showHints", "getShowLoadingDialog", "setShowLoadingDialog", "showLoadingDialog", "getShowPauseButton", "setShowPauseButton", "showPauseButton", "getShowTorchButton", "setShowTorchButton", "showTorchButton", "getShowZoomButton", "setShowZoomButton", "showZoomButton", "getTapShutterToPauseGuidelineText", "setTapShutterToPauseGuidelineText", "tapShutterToPauseGuidelineText", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getTorchButtonPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setTorchButtonPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "torchButtonPosition", "getZoomButtonPosition", "setZoomButtonPosition", "zoomButtonPosition", "getMinimumHighlightWidthPx$scandit_barcode_capture", "minimumHighlightWidthPx", "getMinimumHighlightHeightPx$scandit_barcode_capture", "minimumHighlightHeightPx", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickViewSettings implements BarcodePickViewSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodePickViewSettingsProxyAdapter f123714a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private BarcodePickViewHighlightStyle highlightStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private FloatWithUnit uiButtonsOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private BarcodeFilterHighlightSettings filterHighlightSettings;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ boolean drawDebugInfo;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ float maxIconSizeForRectangularStyle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ float iconSizeForDotStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodePickViewSettings(NativeBarcodePickViewSettings impl) {
        Intrinsics.j(impl, "impl");
        this.f123714a = new BarcodePickViewSettingsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.highlightStyle = BarcodePickViewSettingsDefaults.getHighlightStyle();
        this.uiButtonsOffset = BarcodePickViewSettingsDefaults.getUiButtonsOffset();
        this.filterHighlightSettings = BarcodePickViewSettingsDefaults.getFilterHighlightSettings();
        this.drawDebugInfo = BarcodePickViewSettingsDefaults.getDrawDebugInfo();
        this.maxIconSizeForRectangularStyle = BarcodePickViewSettingsDefaults.getMaxIconSizeForRectangularStyle();
        this.iconSizeForDotStyle = BarcodePickViewSettingsDefaults.getIconSizeForDotStyle();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodePickViewSettings getF123721a() {
        return this.f123714a.getF123721a();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED)
    public boolean getHardwareTriggerEnabled() {
        return this.f123714a.getHardwareTriggerEnabled();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE)
    public Integer getHardwareTriggerKeyCode() {
        return this.f123714a.getHardwareTriggerKeyCode();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "initialGuidelineText")
    public String getInitialGuidelineText() {
        return this.f123714a.getInitialGuidelineText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "loadingDialogTextForPicking")
    public String getLoadingDialogTextForPicking() {
        return this.f123714a.getLoadingDialogTextForPicking();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "loadingDialogTextForUnpicking")
    public String getLoadingDialogTextForUnpicking() {
        return this.f123714a.getLoadingDialogTextForUnpicking();
    }

    public final /* synthetic */ float getMinimumHighlightHeightPx$scandit_barcode_capture() {
        Number numberValueOf = Float.valueOf(0.0f);
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.highlightStyle;
        Intrinsics.j(barcodePickViewHighlightStyle, "<this>");
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.Rectangular) barcodePickViewHighlightStyle).getMinimumHighlightHeight());
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.RectangularWithIcons) barcodePickViewHighlightStyle).getMinimumHighlightHeight());
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.CustomView) barcodePickViewHighlightStyle).getMinimumHighlightHeight());
        } else if (!(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot) && !(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) {
            throw new NoWhenBranchMatchedException();
        }
        return PixelExtensionsKt.pxFromDp$default(numberValueOf.floatValue(), (Context) null, 1, (Object) null);
    }

    public final /* synthetic */ float getMinimumHighlightWidthPx$scandit_barcode_capture() {
        Number numberValueOf = Float.valueOf(0.0f);
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.highlightStyle;
        Intrinsics.j(barcodePickViewHighlightStyle, "<this>");
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.Rectangular) barcodePickViewHighlightStyle).getMinimumHighlightWidth());
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.RectangularWithIcons) barcodePickViewHighlightStyle).getMinimumHighlightWidth());
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            numberValueOf = Integer.valueOf(((BarcodePickViewHighlightStyle.CustomView) barcodePickViewHighlightStyle).getMinimumHighlightWidth());
        } else if (!(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot) && !(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) {
            throw new NoWhenBranchMatchedException();
        }
        return PixelExtensionsKt.pxFromDp$default(numberValueOf.floatValue(), (Context) null, 1, (Object) null);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "moveCloserGuidelineText")
    public String getMoveCloserGuidelineText() {
        return this.f123714a.getMoveCloserGuidelineText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemPickCompletedHintText")
    public String getOnFirstItemPickCompletedHintText() {
        return this.f123714a.getOnFirstItemPickCompletedHintText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemToPickFoundHintText")
    public String getOnFirstItemToPickFoundHintText() {
        return this.f123714a.getOnFirstItemToPickFoundHintText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemUnpickCompletedHintText")
    public String getOnFirstItemUnpickCompletedHintText() {
        return this.f123714a.getOnFirstItemUnpickCompletedHintText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstUnmarkedItemPickCompletedHintText")
    public String getOnFirstUnmarkedItemPickCompletedHintText() {
        return this.f123714a.getOnFirstUnmarkedItemPickCompletedHintText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showFinishButton")
    public boolean getShowFinishButton() {
        return this.f123714a.getShowFinishButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showGuidelines")
    public boolean getShowGuidelines() {
        return this.f123714a.getShowGuidelines();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showHints")
    public boolean getShowHints() {
        return this.f123714a.getShowHints();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showLoadingDialog")
    public boolean getShowLoadingDialog() {
        return this.f123714a.getShowLoadingDialog();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showPauseButton")
    public boolean getShowPauseButton() {
        return this.f123714a.getShowPauseButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showTorchButton")
    public boolean getShowTorchButton() {
        return this.f123714a.getShowTorchButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showZoomButton")
    public boolean getShowZoomButton() {
        return this.f123714a.getShowZoomButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "tapShutterToPauseGuidelineText")
    public String getTapShutterToPauseGuidelineText() {
        return this.f123714a.getTapShutterToPauseGuidelineText();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "torchButtonPosition")
    public Anchor getTorchButtonPosition() {
        return this.f123714a.getTorchButtonPosition();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "zoomButtonPosition")
    public Anchor getZoomButtonPosition() {
        return this.f123714a.getZoomButtonPosition();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED)
    public void setHardwareTriggerEnabled(boolean z10) {
        this.f123714a.setHardwareTriggerEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE)
    public void setHardwareTriggerKeyCode(Integer num) {
        this.f123714a.setHardwareTriggerKeyCode(num);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "initialGuidelineText")
    public void setInitialGuidelineText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f123714a.setInitialGuidelineText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "loadingDialogTextForPicking")
    public void setLoadingDialogTextForPicking(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f123714a.setLoadingDialogTextForPicking(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "loadingDialogTextForUnpicking")
    public void setLoadingDialogTextForUnpicking(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f123714a.setLoadingDialogTextForUnpicking(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "moveCloserGuidelineText")
    public void setMoveCloserGuidelineText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f123714a.setMoveCloserGuidelineText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemPickCompletedHintText")
    public void setOnFirstItemPickCompletedHintText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f123714a.setOnFirstItemPickCompletedHintText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemToPickFoundHintText")
    public void setOnFirstItemToPickFoundHintText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f123714a.setOnFirstItemToPickFoundHintText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstItemUnpickCompletedHintText")
    public void setOnFirstItemUnpickCompletedHintText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f123714a.setOnFirstItemUnpickCompletedHintText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "onFirstUnmarkedItemPickCompletedHintText")
    public void setOnFirstUnmarkedItemPickCompletedHintText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f123714a.setOnFirstUnmarkedItemPickCompletedHintText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showFinishButton")
    public void setShowFinishButton(boolean z10) {
        this.f123714a.setShowFinishButton(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showGuidelines")
    public void setShowGuidelines(boolean z10) {
        this.f123714a.setShowGuidelines(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showHints")
    public void setShowHints(boolean z10) {
        this.f123714a.setShowHints(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showLoadingDialog")
    public void setShowLoadingDialog(boolean z10) {
        this.f123714a.setShowLoadingDialog(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showPauseButton")
    public void setShowPauseButton(boolean z10) {
        this.f123714a.setShowPauseButton(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showTorchButton")
    public void setShowTorchButton(boolean z10) {
        this.f123714a.setShowTorchButton(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "showZoomButton")
    public void setShowZoomButton(boolean z10) {
        this.f123714a.setShowZoomButton(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "tapShutterToPauseGuidelineText")
    public void setTapShutterToPauseGuidelineText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.f123714a.setTapShutterToPauseGuidelineText(str);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "torchButtonPosition")
    public void setTorchButtonPosition(Anchor anchor) {
        Intrinsics.j(anchor, "<set-?>");
        this.f123714a.setTorchButtonPosition(anchor);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    @ProxyFunction(property = "zoomButtonPosition")
    public void setZoomButtonPosition(Anchor anchor) {
        Intrinsics.j(anchor, "<set-?>");
        this.f123714a.setZoomButtonPosition(anchor);
    }

    /* renamed from: getDrawDebugInfo$scandit_barcode_capture, reason: from getter */
    public final boolean getDrawDebugInfo() {
        return this.drawDebugInfo;
    }

    public final BarcodeFilterHighlightSettings getFilterHighlightSettings() {
        return this.filterHighlightSettings;
    }

    public final BarcodePickViewHighlightStyle getHighlightStyle() {
        return this.highlightStyle;
    }

    /* renamed from: getIconSizeForDotStyle$scandit_barcode_capture, reason: from getter */
    public final float getIconSizeForDotStyle() {
        return this.iconSizeForDotStyle;
    }

    /* renamed from: getMaxIconSizeForRectangularStyle$scandit_barcode_capture, reason: from getter */
    public final float getMaxIconSizeForRectangularStyle() {
        return this.maxIconSizeForRectangularStyle;
    }

    public final FloatWithUnit getUiButtonsOffset() {
        return this.uiButtonsOffset;
    }

    public final /* synthetic */ float maxIconSize$scandit_barcode_capture() {
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.highlightStyle;
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            return this.maxIconSizeForRectangularStyle;
        }
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            return this.iconSizeForDotStyle;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final /* synthetic */ float minIconSize$scandit_barcode_capture() {
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.highlightStyle;
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            return 0.0f;
        }
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            return this.iconSizeForDotStyle;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void setDrawDebugInfo$scandit_barcode_capture(boolean z10) {
        this.drawDebugInfo = z10;
    }

    public final void setFilterHighlightSettings(BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        this.filterHighlightSettings = barcodeFilterHighlightSettings;
    }

    public final void setHighlightStyle(BarcodePickViewHighlightStyle value) {
        Intrinsics.j(value, "value");
        getF123721a().setHighlightStyle(value._highlightStyleImpl());
        this.highlightStyle = value;
    }

    public final void setIconSizeForDotStyle$scandit_barcode_capture(float f10) {
        this.iconSizeForDotStyle = f10;
    }

    public final void setMaxIconSizeForRectangularStyle$scandit_barcode_capture(float f10) {
        this.maxIconSizeForRectangularStyle = f10;
    }

    public final void setUiButtonsOffset(FloatWithUnit floatWithUnit) {
        Intrinsics.j(floatWithUnit, "<set-?>");
        this.uiButtonsOffset = floatWithUnit;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePickViewSettings() {
        NativeBarcodePickViewSettings nativeBarcodePickViewSettingsCreate = NativeBarcodePickViewSettings.create();
        Intrinsics.i(nativeBarcodePickViewSettingsCreate, "create(...)");
        this(nativeBarcodePickViewSettingsCreate);
    }
}
