package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010 \u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R$\u0010#\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R$\u0010&\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R$\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R$\u0010,\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R$\u0010/\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R$\u00102\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R$\u00105\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R$\u00108\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0011\"\u0004\b7\u0010\u0013R$\u0010;\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0011\"\u0004\b:\u0010\u0013R$\u0010>\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0011\"\u0004\b=\u0010\u0013R$\u0010D\u001a\u00020?2\u0006\u0010\u000f\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010G\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010\u0011\"\u0004\bF\u0010\u0013R$\u0010J\u001a\u00020?2\u0006\u0010\u000f\u001a\u00020?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010A\"\u0004\bI\u0010CR$\u0010M\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bK\u0010\u0011\"\u0004\bL\u0010\u0013R(\u0010S\u001a\u0004\u0018\u00010N2\b\u0010\u000f\u001a\u0004\u0018\u00010N8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010V\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010\u0017\"\u0004\bU\u0010\u0019¨\u0006W"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettingsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;", "_NativeBarcodePickViewSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewSettings;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "p0", "getShowLoadingDialog", "()Z", "setShowLoadingDialog", "(Z)V", "showLoadingDialog", "", "getLoadingDialogTextForPicking", "()Ljava/lang/String;", "setLoadingDialogTextForPicking", "(Ljava/lang/String;)V", "loadingDialogTextForPicking", "getLoadingDialogTextForUnpicking", "setLoadingDialogTextForUnpicking", "loadingDialogTextForUnpicking", "getShowGuidelines", "setShowGuidelines", "showGuidelines", "getInitialGuidelineText", "setInitialGuidelineText", "initialGuidelineText", "getMoveCloserGuidelineText", "setMoveCloserGuidelineText", "moveCloserGuidelineText", "getShowHints", "setShowHints", "showHints", "getOnFirstItemToPickFoundHintText", "setOnFirstItemToPickFoundHintText", "onFirstItemToPickFoundHintText", "getOnFirstItemPickCompletedHintText", "setOnFirstItemPickCompletedHintText", "onFirstItemPickCompletedHintText", "getOnFirstUnmarkedItemPickCompletedHintText", "setOnFirstUnmarkedItemPickCompletedHintText", "onFirstUnmarkedItemPickCompletedHintText", "getOnFirstItemUnpickCompletedHintText", "setOnFirstItemUnpickCompletedHintText", "onFirstItemUnpickCompletedHintText", "getShowPauseButton", "setShowPauseButton", "showPauseButton", "getShowFinishButton", "setShowFinishButton", "showFinishButton", "getShowZoomButton", "setShowZoomButton", "showZoomButton", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getZoomButtonPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setZoomButtonPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "zoomButtonPosition", "getShowTorchButton", "setShowTorchButton", "showTorchButton", "getTorchButtonPosition", "setTorchButtonPosition", "torchButtonPosition", "getHardwareTriggerEnabled", "setHardwareTriggerEnabled", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, "", "getHardwareTriggerKeyCode", "()Ljava/lang/Integer;", "setHardwareTriggerKeyCode", "(Ljava/lang/Integer;)V", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "getTapShutterToPauseGuidelineText", "setTapShutterToPauseGuidelineText", "tapShutterToPauseGuidelineText", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickViewSettingsProxyAdapter implements BarcodePickViewSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickViewSettings f123721a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodePickViewSettingsProxyAdapter(NativeBarcodePickViewSettings _NativeBarcodePickViewSettings, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodePickViewSettings, "_NativeBarcodePickViewSettings");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123721a = _NativeBarcodePickViewSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickViewSettings getF123721a() {
        return this.f123721a;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getHardwareTriggerEnabled() {
        return this.f123721a.getHardwareTriggerEnabled();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public Integer getHardwareTriggerKeyCode() {
        return this.f123721a.getHardwareTriggerKeyCode();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public String getInitialGuidelineText() {
        String initialGuidelineText = this.f123721a.getInitialGuidelineText();
        Intrinsics.g(initialGuidelineText);
        return initialGuidelineText;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public String getLoadingDialogTextForPicking() {
        String loadingDialogTextForPicking = this.f123721a.getLoadingDialogTextForPicking();
        Intrinsics.g(loadingDialogTextForPicking);
        return loadingDialogTextForPicking;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public String getLoadingDialogTextForUnpicking() {
        String loadingDialogTextForUnpicking = this.f123721a.getLoadingDialogTextForUnpicking();
        Intrinsics.g(loadingDialogTextForUnpicking);
        return loadingDialogTextForUnpicking;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public String getMoveCloserGuidelineText() {
        String moveCloserGuidelineText = this.f123721a.getMoveCloserGuidelineText();
        Intrinsics.g(moveCloserGuidelineText);
        return moveCloserGuidelineText;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public String getOnFirstItemPickCompletedHintText() {
        String onFirstItemPickCompletedHintText = this.f123721a.getOnFirstItemPickCompletedHintText();
        Intrinsics.g(onFirstItemPickCompletedHintText);
        return onFirstItemPickCompletedHintText;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public String getOnFirstItemToPickFoundHintText() {
        String onFirstItemToPickFoundHintText = this.f123721a.getOnFirstItemToPickFoundHintText();
        Intrinsics.g(onFirstItemToPickFoundHintText);
        return onFirstItemToPickFoundHintText;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public String getOnFirstItemUnpickCompletedHintText() {
        String onFirstItemUnpickCompletedHintText = this.f123721a.getOnFirstItemUnpickCompletedHintText();
        Intrinsics.g(onFirstItemUnpickCompletedHintText);
        return onFirstItemUnpickCompletedHintText;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public String getOnFirstUnmarkedItemPickCompletedHintText() {
        String onFirstUnmarkedItemPickCompletedHintText = this.f123721a.getOnFirstUnmarkedItemPickCompletedHintText();
        Intrinsics.g(onFirstUnmarkedItemPickCompletedHintText);
        return onFirstUnmarkedItemPickCompletedHintText;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowFinishButton() {
        return this.f123721a.getShowFinishButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowGuidelines() {
        return this.f123721a.getShowGuidelines();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowHints() {
        return this.f123721a.getShowHints();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowLoadingDialog() {
        return this.f123721a.getShowLoadingDialog();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowPauseButton() {
        return this.f123721a.getShowPauseButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowTorchButton() {
        return this.f123721a.getShowTorchButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public boolean getShowZoomButton() {
        return this.f123721a.getShowZoomButton();
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public String getTapShutterToPauseGuidelineText() {
        String tapShutterToPauseGuidelineText = this.f123721a.getTapShutterToPauseGuidelineText();
        Intrinsics.g(tapShutterToPauseGuidelineText);
        return tapShutterToPauseGuidelineText;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public Anchor getTorchButtonPosition() {
        Anchor torchButtonPosition = this.f123721a.getTorchButtonPosition();
        Intrinsics.g(torchButtonPosition);
        return torchButtonPosition;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public Anchor getZoomButtonPosition() {
        Anchor zoomButtonPosition = this.f123721a.getZoomButtonPosition();
        Intrinsics.g(zoomButtonPosition);
        return zoomButtonPosition;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setHardwareTriggerEnabled(boolean z10) {
        this.f123721a.setHardwareTriggerEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setHardwareTriggerKeyCode(Integer num) {
        this.f123721a.setHardwareTriggerKeyCode(num);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setInitialGuidelineText(String p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setInitialGuidelineText(p02);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setLoadingDialogTextForPicking(String p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setLoadingDialogTextForPicking(p02);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setLoadingDialogTextForUnpicking(String p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setLoadingDialogTextForUnpicking(p02);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setMoveCloserGuidelineText(String p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setMoveCloserGuidelineText(p02);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setOnFirstItemPickCompletedHintText(String p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setOnFirstItemPickCompletedHintText(p02);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setOnFirstItemToPickFoundHintText(String p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setOnFirstItemToPickFoundHintText(p02);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setOnFirstItemUnpickCompletedHintText(String p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setOnFirstItemUnpickCompletedHintText(p02);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setOnFirstUnmarkedItemPickCompletedHintText(String p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setOnFirstUnmarkedItemPickCompletedHintText(p02);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowFinishButton(boolean z10) {
        this.f123721a.setShowFinishButton(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowGuidelines(boolean z10) {
        this.f123721a.setShowGuidelines(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowHints(boolean z10) {
        this.f123721a.setShowHints(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowLoadingDialog(boolean z10) {
        this.f123721a.setShowLoadingDialog(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowPauseButton(boolean z10) {
        this.f123721a.setShowPauseButton(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowTorchButton(boolean z10) {
        this.f123721a.setShowTorchButton(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setShowZoomButton(boolean z10) {
        this.f123721a.setShowZoomButton(z10);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setTapShutterToPauseGuidelineText(String p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setTapShutterToPauseGuidelineText(p02);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setTorchButtonPosition(Anchor p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setTorchButtonPosition(p02);
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettingsProxy
    public void setZoomButtonPosition(Anchor p02) {
        Intrinsics.j(p02, "p0");
        this.f123721a.setZoomButtonPosition(p02);
    }

    public /* synthetic */ BarcodePickViewSettingsProxyAdapter(NativeBarcodePickViewSettings nativeBarcodePickViewSettings, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickViewSettings, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
