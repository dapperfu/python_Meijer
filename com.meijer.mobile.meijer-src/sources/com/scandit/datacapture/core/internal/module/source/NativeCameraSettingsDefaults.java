package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeCameraSettingsDefaults {
    public static native int api();

    public static native boolean chooseClosestResolutionTo12MPForFourThreeAspectRatio();

    public static native boolean colorCorrection();

    public static native boolean dynamicResolution();

    public static native int dynamicResolutionHighPreviewOffset();

    public static native boolean dynamicResolutionLogging();

    public static native int dynamicResolutionLowFps();

    public static native int dynamicResolutionMeasuringIntervalMillis();

    public static native NativeEdgeEnhancement edgeEnhancementMode();

    public static native boolean enableSensorPixelModeMaximumResolution();

    public static native float exposureTargetBias();

    public static native FocusGestureStrategy focusGestureStrategy();

    public static native boolean forceAggressiveAutoFocus();

    public static native float lensPosition();

    public static native int manualUntilCaptureTimeout();

    public static native float maxFrameRate();

    public static native float minFrameRate();

    public static native NativeNoiseReduction noiseReductionMode();

    public static native boolean overwriteWithHighestResolution();

    public static native NativeVideoAspectRatio preferredAspectRatio();

    public static native VideoResolution preferredResolution();

    public static native boolean quadHd();

    public static native NativeRegionStrategy regionControlStrategy();

    public static native boolean shouldPreferSmoothAutoFocus();

    public static native NativeTonemapCurve tonemapCurve();

    public static native float torchLevel();

    public static native boolean useDepth();

    public static native boolean usesCameraApi2Features();

    public static native float zoomFactor();

    public static native float zoomGestureZoomFactor();

    @DjinniGenerated
    public static final class CppProxy extends NativeCameraSettingsDefaults {
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
