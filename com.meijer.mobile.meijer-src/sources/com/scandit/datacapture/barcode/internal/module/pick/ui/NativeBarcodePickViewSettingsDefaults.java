package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodePickViewSettingsDefaults {
    public static native boolean hardwareTriggerEnabled();

    public static native Integer hardwareTriggerKeyCode();

    public static native NativeBarcodePickViewHighlightStyle highlightStyle();

    public static native String initialGuidelineText();

    public static native String loadingDialogTextForPicking();

    public static native String loadingDialogTextForUnpicking();

    public static native String moveCloserGuidelineText();

    public static native String onFirstItemPickCompletedHintText();

    public static native String onFirstItemToPickFoundHintText();

    public static native String onFirstItemUnpickCompletedHintText();

    public static native String onFirstUnmarkedItemPickCompletedHintText();

    public static native boolean showFinishButton();

    public static native boolean showGuidelines();

    public static native boolean showHints();

    public static native boolean showLoadingDialog();

    public static native boolean showPauseButton();

    public static native boolean showTorchButton();

    public static native boolean showZoomButton();

    public static native String tapShutterToPauseGuidelineText();

    public static native Anchor torchButtonPosition();

    public static native FloatWithUnit uiButtonsOffset();

    public static native Anchor zoomButtonPosition();

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickViewSettingsDefaults {
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private CppProxy(long j10) {
            new AtomicBoolean(false);
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }
}
