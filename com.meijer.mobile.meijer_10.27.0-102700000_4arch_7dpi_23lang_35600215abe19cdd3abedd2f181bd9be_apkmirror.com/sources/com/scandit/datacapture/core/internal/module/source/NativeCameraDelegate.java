package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;
import java.util.EnumSet;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeCameraDelegate {
    public abstract void bootUpWithSettings(NativeCameraDelegateSettings nativeCameraDelegateSettings, NativeWrappedPromise nativeWrappedPromise);

    public abstract NativeCameraApi getCameraApi();

    public abstract String getCameraId();

    public abstract NativeCameraInfo getCameraInfo();

    public abstract CameraPosition getCameraPosition();

    public abstract int getCameraToNativeDeviceOrientation();

    public abstract ArrayList<Size2> getFrameResolutions();

    public abstract EnumSet<NativeFocusMode> getSupportedFocusModesBits();

    public abstract boolean goToSleep();

    public abstract boolean hasManualLensPositionControl();

    public abstract boolean hasNoFocusSystem();

    public abstract boolean isTimestampRealtime();

    public abstract boolean isTorchAvailable();

    public abstract void setBatterySavingMode(boolean z10);

    public abstract boolean setFixedLensPosition(float f10);

    public abstract boolean shouldMirrorAroundYAxis();

    public abstract boolean shouldUseContinuous(boolean z10);

    public abstract void shutDown();

    public abstract boolean startContinuousFocusInArea(Rect rect);

    public abstract boolean startSingleShotFocusInArea(Rect rect);

    public abstract void startWithSettings(NativeCameraDelegateSettings nativeCameraDelegateSettings, NativeWrappedPromise nativeWrappedPromise);

    public abstract void updateSettings(NativeCameraDelegateSettings nativeCameraDelegateSettings, FrameSourceState frameSourceState);

    public abstract void wakeUp(NativeWrappedPromise nativeWrappedPromise);
}
