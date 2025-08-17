package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickViewSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickViewSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122477a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native boolean native_getHardwareTriggerEnabled(long j10);

        private native Integer native_getHardwareTriggerKeyCode(long j10);

        private native NativeBarcodePickViewHighlightStyle native_getHighlightStyle(long j10);

        private native NativeBarcodePickViewHighlightStyleCustomView native_getHighlightStyleAsCustomView(long j10);

        private native NativeBarcodePickViewHighlightStyleDot native_getHighlightStyleAsDot(long j10);

        private native NativeBarcodePickViewHighlightStyleDotWithIcons native_getHighlightStyleAsDotWithIcons(long j10);

        private native NativeBarcodePickViewHighlightStyleRectangular native_getHighlightStyleAsRectangular(long j10);

        private native NativeBarcodePickViewHighlightStyleRectangularWithIcons native_getHighlightStyleAsRectangularWithIcons(long j10);

        private native NativeBarcodePickViewHighlightType native_getHighlightStyleType(long j10);

        private native String native_getInitialGuidelineText(long j10);

        private native String native_getLoadingDialogTextForPicking(long j10);

        private native String native_getLoadingDialogTextForUnpicking(long j10);

        private native String native_getMoveCloserGuidelineText(long j10);

        private native String native_getOnFirstItemPickCompletedHintText(long j10);

        private native String native_getOnFirstItemToPickFoundHintText(long j10);

        private native String native_getOnFirstItemUnpickCompletedHintText(long j10);

        private native String native_getOnFirstUnmarkedItemPickCompletedHintText(long j10);

        private native boolean native_getShowFinishButton(long j10);

        private native boolean native_getShowGuidelines(long j10);

        private native boolean native_getShowHints(long j10);

        private native boolean native_getShowLoadingDialog(long j10);

        private native boolean native_getShowPauseButton(long j10);

        private native boolean native_getShowTorchButton(long j10);

        private native boolean native_getShowZoomButton(long j10);

        private native String native_getTapShutterToPauseGuidelineText(long j10);

        private native Anchor native_getTorchButtonPosition(long j10);

        private native Anchor native_getZoomButtonPosition(long j10);

        private native void native_setHardwareTriggerEnabled(long j10, boolean z10);

        private native void native_setHardwareTriggerKeyCode(long j10, Integer num);

        private native void native_setHighlightStyle(long j10, NativeBarcodePickViewHighlightStyle nativeBarcodePickViewHighlightStyle);

        private native void native_setInitialGuidelineText(long j10, String str);

        private native void native_setLoadingDialogTextForPicking(long j10, String str);

        private native void native_setLoadingDialogTextForUnpicking(long j10, String str);

        private native void native_setMoveCloserGuidelineText(long j10, String str);

        private native void native_setOnFirstItemPickCompletedHintText(long j10, String str);

        private native void native_setOnFirstItemToPickFoundHintText(long j10, String str);

        private native void native_setOnFirstItemUnpickCompletedHintText(long j10, String str);

        private native void native_setOnFirstUnmarkedItemPickCompletedHintText(long j10, String str);

        private native void native_setShowFinishButton(long j10, boolean z10);

        private native void native_setShowGuidelines(long j10, boolean z10);

        private native void native_setShowHints(long j10, boolean z10);

        private native void native_setShowLoadingDialog(long j10, boolean z10);

        private native void native_setShowPauseButton(long j10, boolean z10);

        private native void native_setShowTorchButton(long j10, boolean z10);

        private native void native_setShowZoomButton(long j10, boolean z10);

        private native void native_setTapShutterToPauseGuidelineText(long j10, String str);

        private native void native_setTorchButtonPosition(long j10, Anchor anchor);

        private native void native_setZoomButtonPosition(long j10, Anchor anchor);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public boolean getHardwareTriggerEnabled() {
            return native_getHardwareTriggerEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public Integer getHardwareTriggerKeyCode() {
            return native_getHardwareTriggerKeyCode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public NativeBarcodePickViewHighlightStyle getHighlightStyle() {
            return native_getHighlightStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public NativeBarcodePickViewHighlightStyleCustomView getHighlightStyleAsCustomView() {
            return native_getHighlightStyleAsCustomView(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public NativeBarcodePickViewHighlightStyleDot getHighlightStyleAsDot() {
            return native_getHighlightStyleAsDot(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public NativeBarcodePickViewHighlightStyleDotWithIcons getHighlightStyleAsDotWithIcons() {
            return native_getHighlightStyleAsDotWithIcons(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public NativeBarcodePickViewHighlightStyleRectangular getHighlightStyleAsRectangular() {
            return native_getHighlightStyleAsRectangular(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public NativeBarcodePickViewHighlightStyleRectangularWithIcons getHighlightStyleAsRectangularWithIcons() {
            return native_getHighlightStyleAsRectangularWithIcons(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public NativeBarcodePickViewHighlightType getHighlightStyleType() {
            return native_getHighlightStyleType(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public String getInitialGuidelineText() {
            return native_getInitialGuidelineText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public String getLoadingDialogTextForPicking() {
            return native_getLoadingDialogTextForPicking(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public String getLoadingDialogTextForUnpicking() {
            return native_getLoadingDialogTextForUnpicking(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public String getMoveCloserGuidelineText() {
            return native_getMoveCloserGuidelineText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public String getOnFirstItemPickCompletedHintText() {
            return native_getOnFirstItemPickCompletedHintText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public String getOnFirstItemToPickFoundHintText() {
            return native_getOnFirstItemToPickFoundHintText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public String getOnFirstItemUnpickCompletedHintText() {
            return native_getOnFirstItemUnpickCompletedHintText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public String getOnFirstUnmarkedItemPickCompletedHintText() {
            return native_getOnFirstUnmarkedItemPickCompletedHintText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public boolean getShowFinishButton() {
            return native_getShowFinishButton(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public boolean getShowGuidelines() {
            return native_getShowGuidelines(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public boolean getShowHints() {
            return native_getShowHints(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public boolean getShowLoadingDialog() {
            return native_getShowLoadingDialog(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public boolean getShowPauseButton() {
            return native_getShowPauseButton(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public boolean getShowTorchButton() {
            return native_getShowTorchButton(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public boolean getShowZoomButton() {
            return native_getShowZoomButton(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public String getTapShutterToPauseGuidelineText() {
            return native_getTapShutterToPauseGuidelineText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public Anchor getTorchButtonPosition() {
            return native_getTorchButtonPosition(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public Anchor getZoomButtonPosition() {
            return native_getZoomButtonPosition(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setHardwareTriggerEnabled(boolean z10) {
            native_setHardwareTriggerEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setHardwareTriggerKeyCode(Integer num) {
            native_setHardwareTriggerKeyCode(this.nativeRef, num);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setHighlightStyle(NativeBarcodePickViewHighlightStyle nativeBarcodePickViewHighlightStyle) {
            native_setHighlightStyle(this.nativeRef, nativeBarcodePickViewHighlightStyle);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setInitialGuidelineText(String str) {
            native_setInitialGuidelineText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setLoadingDialogTextForPicking(String str) {
            native_setLoadingDialogTextForPicking(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setLoadingDialogTextForUnpicking(String str) {
            native_setLoadingDialogTextForUnpicking(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setMoveCloserGuidelineText(String str) {
            native_setMoveCloserGuidelineText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setOnFirstItemPickCompletedHintText(String str) {
            native_setOnFirstItemPickCompletedHintText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setOnFirstItemToPickFoundHintText(String str) {
            native_setOnFirstItemToPickFoundHintText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setOnFirstItemUnpickCompletedHintText(String str) {
            native_setOnFirstItemUnpickCompletedHintText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setOnFirstUnmarkedItemPickCompletedHintText(String str) {
            native_setOnFirstUnmarkedItemPickCompletedHintText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setShowFinishButton(boolean z10) {
            native_setShowFinishButton(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setShowGuidelines(boolean z10) {
            native_setShowGuidelines(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setShowHints(boolean z10) {
            native_setShowHints(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setShowLoadingDialog(boolean z10) {
            native_setShowLoadingDialog(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setShowPauseButton(boolean z10) {
            native_setShowPauseButton(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setShowTorchButton(boolean z10) {
            native_setShowTorchButton(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setShowZoomButton(boolean z10) {
            native_setShowZoomButton(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setTapShutterToPauseGuidelineText(String str) {
            native_setTapShutterToPauseGuidelineText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setTorchButtonPosition(Anchor anchor) {
            native_setTorchButtonPosition(this.nativeRef, anchor);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings
        public void setZoomButtonPosition(Anchor anchor) {
            native_setZoomButtonPosition(this.nativeRef, anchor);
        }

        private CppProxy(long j10) {
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }

    public static native NativeBarcodePickViewSettings create();

    public abstract boolean getHardwareTriggerEnabled();

    public abstract Integer getHardwareTriggerKeyCode();

    public abstract NativeBarcodePickViewHighlightStyle getHighlightStyle();

    public abstract NativeBarcodePickViewHighlightStyleCustomView getHighlightStyleAsCustomView();

    public abstract NativeBarcodePickViewHighlightStyleDot getHighlightStyleAsDot();

    public abstract NativeBarcodePickViewHighlightStyleDotWithIcons getHighlightStyleAsDotWithIcons();

    public abstract NativeBarcodePickViewHighlightStyleRectangular getHighlightStyleAsRectangular();

    public abstract NativeBarcodePickViewHighlightStyleRectangularWithIcons getHighlightStyleAsRectangularWithIcons();

    public abstract NativeBarcodePickViewHighlightType getHighlightStyleType();

    public abstract String getInitialGuidelineText();

    public abstract String getLoadingDialogTextForPicking();

    public abstract String getLoadingDialogTextForUnpicking();

    public abstract String getMoveCloserGuidelineText();

    public abstract String getOnFirstItemPickCompletedHintText();

    public abstract String getOnFirstItemToPickFoundHintText();

    public abstract String getOnFirstItemUnpickCompletedHintText();

    public abstract String getOnFirstUnmarkedItemPickCompletedHintText();

    public abstract boolean getShowFinishButton();

    public abstract boolean getShowGuidelines();

    public abstract boolean getShowHints();

    public abstract boolean getShowLoadingDialog();

    public abstract boolean getShowPauseButton();

    public abstract boolean getShowTorchButton();

    public abstract boolean getShowZoomButton();

    public abstract String getTapShutterToPauseGuidelineText();

    public abstract Anchor getTorchButtonPosition();

    public abstract Anchor getZoomButtonPosition();

    public abstract void setHardwareTriggerEnabled(boolean z10);

    public abstract void setHardwareTriggerKeyCode(Integer num);

    public abstract void setHighlightStyle(NativeBarcodePickViewHighlightStyle nativeBarcodePickViewHighlightStyle);

    public abstract void setInitialGuidelineText(String str);

    public abstract void setLoadingDialogTextForPicking(String str);

    public abstract void setLoadingDialogTextForUnpicking(String str);

    public abstract void setMoveCloserGuidelineText(String str);

    public abstract void setOnFirstItemPickCompletedHintText(String str);

    public abstract void setOnFirstItemToPickFoundHintText(String str);

    public abstract void setOnFirstItemUnpickCompletedHintText(String str);

    public abstract void setOnFirstUnmarkedItemPickCompletedHintText(String str);

    public abstract void setShowFinishButton(boolean z10);

    public abstract void setShowGuidelines(boolean z10);

    public abstract void setShowHints(boolean z10);

    public abstract void setShowLoadingDialog(boolean z10);

    public abstract void setShowPauseButton(boolean z10);

    public abstract void setShowTorchButton(boolean z10);

    public abstract void setShowZoomButton(boolean z10);

    public abstract void setTapShutterToPauseGuidelineText(String str);

    public abstract void setTorchButtonPosition(Anchor anchor);

    public abstract void setZoomButtonPosition(Anchor anchor);
}
