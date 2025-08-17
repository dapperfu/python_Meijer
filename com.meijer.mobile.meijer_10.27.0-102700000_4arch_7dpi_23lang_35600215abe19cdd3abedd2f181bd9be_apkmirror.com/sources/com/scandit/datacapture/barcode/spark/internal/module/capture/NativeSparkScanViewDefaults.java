package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeSparkScanViewDefaults {
    public static native boolean defaultBarcodeCountButtonVisible();

    public static native boolean defaultBarcodeFindButtonVisible();

    public static native boolean defaultCameraSwitchButtonVisible();

    public static native String defaultContinuousModeDisabledMessage();

    public static native String defaultContinuousModeEnabledMessage();

    public static native NativeColor defaultErrorToastBackgroundColor();

    public static native NativeColor defaultErrorToastTextColor();

    public static native NativeBrush defaultFeedbackErrorBrush();

    public static native NativeBrush defaultFeedbackSuccessBrush();

    public static native boolean defaultLabelCaptureButtonVisible();

    public static native boolean defaultPreviewCloseControlVisible();

    public static native boolean defaultPreviewSizeControlVisible();

    public static native String defaultScanPausedMessage();

    public static native boolean defaultScanningBehaviorButtonVisible();

    public static native boolean defaultTargetModeButtonVisible();

    public static native String defaultTargetModeDisabledMessage();

    public static native String defaultTargetModeEnabledMessage();

    public static native NativeColor defaultToastBackgroundColor();

    public static native boolean defaultToastEnabled();

    public static native NativeColor defaultToastEnabledBackgroundColor();

    public static native NativeColor defaultToastTextColor();

    public static native NativeColor defaultToolbarBackgroundColor();

    public static native NativeColor defaultToolbarIconActiveTintColor();

    public static native NativeColor defaultToolbarIconInactiveTintColor();

    public static native boolean defaultTorchControlVisible();

    public static native String defaultTorchDisabledMessage();

    public static native String defaultTorchEnabledMessage();

    public static native NativeColor defaultTriggerButtonAnimationColor();

    public static native NativeColor defaultTriggerButtonCollapsedColor();

    public static native NativeColor defaultTriggerButtonExpandedColor();

    public static native NativeColor defaultTriggerButtonTintColor();

    public static native boolean defaultTriggerButtonVisible();

    public static native String defaultUserFacingCameraEnabledMessage();

    public static native NativeColor defaultVisualFeedbackErrorColor();

    public static native NativeColor defaultVisualFeedbackSuccessColor();

    public static native String defaultWorldFacingCameraEnabledMessage();

    public static native boolean defaultZoomSwitchControlVisible();

    public static native String defaultZoomedInMessage();

    public static native String defaultZoomedOutMessage();

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanViewDefaults {
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
