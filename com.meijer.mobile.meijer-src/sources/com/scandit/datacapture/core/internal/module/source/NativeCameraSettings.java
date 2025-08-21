package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeCameraSettings {
    final int api;
    final Size2 arbitraryVideoResolution;
    final boolean chooseClosestResolutionTo12MPForFourThreeAspectRatio;
    final boolean colorCorrection;
    final boolean dynamicResolution;
    final int dynamicResolutionHighPreviewOffset;
    final boolean dynamicResolutionLogging;
    final int dynamicResolutionLowFps;
    final int dynamicResolutionMeasuringIntervalMillis;
    final NativeEdgeEnhancement edgeEnhancementMode;
    final boolean enableSensorPixelModeMaximumResolution;
    final float exposureTargetBias;
    final NativeFocusSettings focus;
    final int manualUntilCaptureTimeout;
    final float maxFrameRate;
    final float minFrameRate;
    final NativeNoiseReduction noiseReductionMode;
    final boolean overwriteWithHighestResolution;
    final NativeVideoAspectRatio preferredAspectRatio;
    final NativePreferredFrameRateRange preferredFrameRateRange;
    final VideoResolution preferredResolution;
    final NativeJsonValue properties;
    final boolean quadHd;
    final NativeRegionStrategy regionControlStrategy;
    final NativeTonemapCurve toneMappingCurve;
    final float torchLevel;
    final boolean useDepth;
    final boolean usesCameraApi2Features;
    final float zoomFactor;
    final float zoomGestureZoomFactor;

    public NativeCameraSettings(VideoResolution videoResolution, float f10, float f11, float f12, float f13, NativeFocusSettings nativeFocusSettings, int i10, boolean z10, boolean z11, float f14, boolean z12, NativeTonemapCurve nativeTonemapCurve, NativeNoiseReduction nativeNoiseReduction, NativeEdgeEnhancement nativeEdgeEnhancement, NativeRegionStrategy nativeRegionStrategy, float f15, NativeVideoAspectRatio nativeVideoAspectRatio, Size2 size2, boolean z13, boolean z14, boolean z15, int i11, int i12, int i13, boolean z16, boolean z17, NativeJsonValue nativeJsonValue, NativePreferredFrameRateRange nativePreferredFrameRateRange, int i14, boolean z18) {
        this.preferredResolution = videoResolution;
        this.minFrameRate = f10;
        this.maxFrameRate = f11;
        this.zoomFactor = f12;
        this.zoomGestureZoomFactor = f13;
        this.focus = nativeFocusSettings;
        this.api = i10;
        this.usesCameraApi2Features = z10;
        this.overwriteWithHighestResolution = z11;
        this.exposureTargetBias = f14;
        this.colorCorrection = z12;
        this.toneMappingCurve = nativeTonemapCurve;
        this.noiseReductionMode = nativeNoiseReduction;
        this.edgeEnhancementMode = nativeEdgeEnhancement;
        this.regionControlStrategy = nativeRegionStrategy;
        this.torchLevel = f15;
        this.preferredAspectRatio = nativeVideoAspectRatio;
        this.arbitraryVideoResolution = size2;
        this.chooseClosestResolutionTo12MPForFourThreeAspectRatio = z13;
        this.quadHd = z14;
        this.dynamicResolution = z15;
        this.dynamicResolutionLowFps = i11;
        this.dynamicResolutionHighPreviewOffset = i12;
        this.dynamicResolutionMeasuringIntervalMillis = i13;
        this.dynamicResolutionLogging = z16;
        this.enableSensorPixelModeMaximumResolution = z17;
        this.properties = nativeJsonValue;
        this.preferredFrameRateRange = nativePreferredFrameRateRange;
        this.manualUntilCaptureTimeout = i14;
        this.useDepth = z18;
    }

    public boolean equals(Object obj) {
        Size2 size2;
        NativeJsonValue nativeJsonValue;
        NativePreferredFrameRateRange nativePreferredFrameRateRange;
        if (!(obj instanceof NativeCameraSettings)) {
            return false;
        }
        NativeCameraSettings nativeCameraSettings = (NativeCameraSettings) obj;
        return this.preferredResolution == nativeCameraSettings.preferredResolution && this.minFrameRate == nativeCameraSettings.minFrameRate && this.maxFrameRate == nativeCameraSettings.maxFrameRate && this.zoomFactor == nativeCameraSettings.zoomFactor && this.zoomGestureZoomFactor == nativeCameraSettings.zoomGestureZoomFactor && this.focus.equals(nativeCameraSettings.focus) && this.api == nativeCameraSettings.api && this.usesCameraApi2Features == nativeCameraSettings.usesCameraApi2Features && this.overwriteWithHighestResolution == nativeCameraSettings.overwriteWithHighestResolution && this.exposureTargetBias == nativeCameraSettings.exposureTargetBias && this.colorCorrection == nativeCameraSettings.colorCorrection && this.toneMappingCurve == nativeCameraSettings.toneMappingCurve && this.noiseReductionMode == nativeCameraSettings.noiseReductionMode && this.edgeEnhancementMode == nativeCameraSettings.edgeEnhancementMode && this.regionControlStrategy == nativeCameraSettings.regionControlStrategy && this.torchLevel == nativeCameraSettings.torchLevel && this.preferredAspectRatio == nativeCameraSettings.preferredAspectRatio && (((size2 = this.arbitraryVideoResolution) == null && nativeCameraSettings.arbitraryVideoResolution == null) || (size2 != null && size2.equals(nativeCameraSettings.arbitraryVideoResolution))) && this.chooseClosestResolutionTo12MPForFourThreeAspectRatio == nativeCameraSettings.chooseClosestResolutionTo12MPForFourThreeAspectRatio && this.quadHd == nativeCameraSettings.quadHd && this.dynamicResolution == nativeCameraSettings.dynamicResolution && this.dynamicResolutionLowFps == nativeCameraSettings.dynamicResolutionLowFps && this.dynamicResolutionHighPreviewOffset == nativeCameraSettings.dynamicResolutionHighPreviewOffset && this.dynamicResolutionMeasuringIntervalMillis == nativeCameraSettings.dynamicResolutionMeasuringIntervalMillis && this.dynamicResolutionLogging == nativeCameraSettings.dynamicResolutionLogging && this.enableSensorPixelModeMaximumResolution == nativeCameraSettings.enableSensorPixelModeMaximumResolution && ((((nativeJsonValue = this.properties) == null && nativeCameraSettings.properties == null) || (nativeJsonValue != null && nativeJsonValue.equals(nativeCameraSettings.properties))) && ((((nativePreferredFrameRateRange = this.preferredFrameRateRange) == null && nativeCameraSettings.preferredFrameRateRange == null) || (nativePreferredFrameRateRange != null && nativePreferredFrameRateRange.equals(nativeCameraSettings.preferredFrameRateRange))) && this.manualUntilCaptureTimeout == nativeCameraSettings.manualUntilCaptureTimeout && this.useDepth == nativeCameraSettings.useDepth));
    }

    public int getApi() {
        return this.api;
    }

    public Size2 getArbitraryVideoResolution() {
        return this.arbitraryVideoResolution;
    }

    public boolean getChooseClosestResolutionTo12MPForFourThreeAspectRatio() {
        return this.chooseClosestResolutionTo12MPForFourThreeAspectRatio;
    }

    public boolean getColorCorrection() {
        return this.colorCorrection;
    }

    public boolean getDynamicResolution() {
        return this.dynamicResolution;
    }

    public int getDynamicResolutionHighPreviewOffset() {
        return this.dynamicResolutionHighPreviewOffset;
    }

    public boolean getDynamicResolutionLogging() {
        return this.dynamicResolutionLogging;
    }

    public int getDynamicResolutionLowFps() {
        return this.dynamicResolutionLowFps;
    }

    public int getDynamicResolutionMeasuringIntervalMillis() {
        return this.dynamicResolutionMeasuringIntervalMillis;
    }

    public NativeEdgeEnhancement getEdgeEnhancementMode() {
        return this.edgeEnhancementMode;
    }

    public boolean getEnableSensorPixelModeMaximumResolution() {
        return this.enableSensorPixelModeMaximumResolution;
    }

    public float getExposureTargetBias() {
        return this.exposureTargetBias;
    }

    public NativeFocusSettings getFocus() {
        return this.focus;
    }

    public int getManualUntilCaptureTimeout() {
        return this.manualUntilCaptureTimeout;
    }

    public float getMaxFrameRate() {
        return this.maxFrameRate;
    }

    public float getMinFrameRate() {
        return this.minFrameRate;
    }

    public NativeNoiseReduction getNoiseReductionMode() {
        return this.noiseReductionMode;
    }

    public boolean getOverwriteWithHighestResolution() {
        return this.overwriteWithHighestResolution;
    }

    public NativeVideoAspectRatio getPreferredAspectRatio() {
        return this.preferredAspectRatio;
    }

    public NativePreferredFrameRateRange getPreferredFrameRateRange() {
        return this.preferredFrameRateRange;
    }

    public VideoResolution getPreferredResolution() {
        return this.preferredResolution;
    }

    public NativeJsonValue getProperties() {
        return this.properties;
    }

    public boolean getQuadHd() {
        return this.quadHd;
    }

    public NativeRegionStrategy getRegionControlStrategy() {
        return this.regionControlStrategy;
    }

    public NativeTonemapCurve getToneMappingCurve() {
        return this.toneMappingCurve;
    }

    public float getTorchLevel() {
        return this.torchLevel;
    }

    public boolean getUseDepth() {
        return this.useDepth;
    }

    public boolean getUsesCameraApi2Features() {
        return this.usesCameraApi2Features;
    }

    public float getZoomFactor() {
        return this.zoomFactor;
    }

    public float getZoomGestureZoomFactor() {
        return this.zoomGestureZoomFactor;
    }

    public int hashCode() {
        int iHashCode = (this.preferredAspectRatio.hashCode() + ((Float.floatToIntBits(this.torchLevel) + ((this.regionControlStrategy.hashCode() + ((this.edgeEnhancementMode.hashCode() + ((this.noiseReductionMode.hashCode() + ((this.toneMappingCurve.hashCode() + ((((Float.floatToIntBits(this.exposureTargetBias) + ((((((((this.focus.hashCode() + ((Float.floatToIntBits(this.zoomGestureZoomFactor) + ((Float.floatToIntBits(this.zoomFactor) + ((Float.floatToIntBits(this.maxFrameRate) + ((Float.floatToIntBits(this.minFrameRate) + ((this.preferredResolution.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.api) * 31) + (this.usesCameraApi2Features ? 1 : 0)) * 31) + (this.overwriteWithHighestResolution ? 1 : 0)) * 31)) * 31) + (this.colorCorrection ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Size2 size2 = this.arbitraryVideoResolution;
        int iHashCode2 = (((((((((((((((((iHashCode + (size2 == null ? 0 : size2.hashCode())) * 31) + (this.chooseClosestResolutionTo12MPForFourThreeAspectRatio ? 1 : 0)) * 31) + (this.quadHd ? 1 : 0)) * 31) + (this.dynamicResolution ? 1 : 0)) * 31) + this.dynamicResolutionLowFps) * 31) + this.dynamicResolutionHighPreviewOffset) * 31) + this.dynamicResolutionMeasuringIntervalMillis) * 31) + (this.dynamicResolutionLogging ? 1 : 0)) * 31) + (this.enableSensorPixelModeMaximumResolution ? 1 : 0)) * 31;
        NativeJsonValue nativeJsonValue = this.properties;
        int iHashCode3 = (iHashCode2 + (nativeJsonValue == null ? 0 : nativeJsonValue.hashCode())) * 31;
        NativePreferredFrameRateRange nativePreferredFrameRateRange = this.preferredFrameRateRange;
        return ((((iHashCode3 + (nativePreferredFrameRateRange != null ? nativePreferredFrameRateRange.hashCode() : 0)) * 31) + this.manualUntilCaptureTimeout) * 31) + (this.useDepth ? 1 : 0);
    }

    public String toString() {
        return "NativeCameraSettings{preferredResolution=" + this.preferredResolution + ",minFrameRate=" + this.minFrameRate + ",maxFrameRate=" + this.maxFrameRate + ",zoomFactor=" + this.zoomFactor + ",zoomGestureZoomFactor=" + this.zoomGestureZoomFactor + ",focus=" + this.focus + ",api=" + this.api + ",usesCameraApi2Features=" + this.usesCameraApi2Features + ",overwriteWithHighestResolution=" + this.overwriteWithHighestResolution + ",exposureTargetBias=" + this.exposureTargetBias + ",colorCorrection=" + this.colorCorrection + ",toneMappingCurve=" + this.toneMappingCurve + ",noiseReductionMode=" + this.noiseReductionMode + ",edgeEnhancementMode=" + this.edgeEnhancementMode + ",regionControlStrategy=" + this.regionControlStrategy + ",torchLevel=" + this.torchLevel + ",preferredAspectRatio=" + this.preferredAspectRatio + ",arbitraryVideoResolution=" + this.arbitraryVideoResolution + ",chooseClosestResolutionTo12MPForFourThreeAspectRatio=" + this.chooseClosestResolutionTo12MPForFourThreeAspectRatio + ",quadHd=" + this.quadHd + ",dynamicResolution=" + this.dynamicResolution + ",dynamicResolutionLowFps=" + this.dynamicResolutionLowFps + ",dynamicResolutionHighPreviewOffset=" + this.dynamicResolutionHighPreviewOffset + ",dynamicResolutionMeasuringIntervalMillis=" + this.dynamicResolutionMeasuringIntervalMillis + ",dynamicResolutionLogging=" + this.dynamicResolutionLogging + ",enableSensorPixelModeMaximumResolution=" + this.enableSensorPixelModeMaximumResolution + ",properties=" + this.properties + ",preferredFrameRateRange=" + this.preferredFrameRateRange + ",manualUntilCaptureTimeout=" + this.manualUntilCaptureTimeout + ",useDepth=" + this.useDepth + "}";
    }
}
