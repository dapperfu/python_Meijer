package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeCameraDelegateSettings {
    final boolean colorCorrection;
    final boolean disablePostProcessing;
    final NativeEdgeEnhancement edgeEnhancementMode;
    final boolean enableSensorPixelModeMaximumResolution;
    final long exposureDuration;
    final float exposureTargetBias;
    final long frameDuration;
    final Size2 frameResolution;
    final NativeMacroAfMode macroAutofocusMode;
    final float maxFrameRate;
    final float minFrameRate;
    final int minPreviewShortSide;
    final NativeNoiseReduction noiseReductionMode;
    final NativePreferredFrameRateRange preferredFrameRateRange;
    final NativeJsonValue properties;
    final boolean sceneChangeDetection;
    final int sensorSensitivity;
    final int sharpnessStrength;
    final float stageOneStandbyDuration;
    final NativeTonemapCurve toneMappingCurve;
    final TorchState torchState;
    final boolean zoomAffectsMeteringArea;
    final float zoomFactor;

    public boolean getColorCorrection() {
        return this.colorCorrection;
    }

    public boolean getDisablePostProcessing() {
        return this.disablePostProcessing;
    }

    public NativeEdgeEnhancement getEdgeEnhancementMode() {
        return this.edgeEnhancementMode;
    }

    public boolean getEnableSensorPixelModeMaximumResolution() {
        return this.enableSensorPixelModeMaximumResolution;
    }

    public long getExposureDuration() {
        return this.exposureDuration;
    }

    public float getExposureTargetBias() {
        return this.exposureTargetBias;
    }

    public long getFrameDuration() {
        return this.frameDuration;
    }

    public Size2 getFrameResolution() {
        return this.frameResolution;
    }

    public NativeMacroAfMode getMacroAutofocusMode() {
        return this.macroAutofocusMode;
    }

    public float getMaxFrameRate() {
        return this.maxFrameRate;
    }

    public float getMinFrameRate() {
        return this.minFrameRate;
    }

    public int getMinPreviewShortSide() {
        return this.minPreviewShortSide;
    }

    public NativeNoiseReduction getNoiseReductionMode() {
        return this.noiseReductionMode;
    }

    public NativePreferredFrameRateRange getPreferredFrameRateRange() {
        return this.preferredFrameRateRange;
    }

    public NativeJsonValue getProperties() {
        return this.properties;
    }

    public boolean getSceneChangeDetection() {
        return this.sceneChangeDetection;
    }

    public int getSensorSensitivity() {
        return this.sensorSensitivity;
    }

    public int getSharpnessStrength() {
        return this.sharpnessStrength;
    }

    public float getStageOneStandbyDuration() {
        return this.stageOneStandbyDuration;
    }

    public NativeTonemapCurve getToneMappingCurve() {
        return this.toneMappingCurve;
    }

    public TorchState getTorchState() {
        return this.torchState;
    }

    public boolean getZoomAffectsMeteringArea() {
        return this.zoomAffectsMeteringArea;
    }

    public float getZoomFactor() {
        return this.zoomFactor;
    }

    public String toString() {
        return "NativeCameraDelegateSettings{frameResolution=" + this.frameResolution + ",minFrameRate=" + this.minFrameRate + ",maxFrameRate=" + this.maxFrameRate + ",zoomFactor=" + this.zoomFactor + ",exposureTargetBias=" + this.exposureTargetBias + ",edgeEnhancementMode=" + this.edgeEnhancementMode + ",colorCorrection=" + this.colorCorrection + ",torchState=" + this.torchState + ",toneMappingCurve=" + this.toneMappingCurve + ",noiseReductionMode=" + this.noiseReductionMode + ",zoomAffectsMeteringArea=" + this.zoomAffectsMeteringArea + ",macroAutofocusMode=" + this.macroAutofocusMode + ",sceneChangeDetection=" + this.sceneChangeDetection + ",exposureDuration=" + this.exposureDuration + ",frameDuration=" + this.frameDuration + ",disablePostProcessing=" + this.disablePostProcessing + ",sharpnessStrength=" + this.sharpnessStrength + ",sensorSensitivity=" + this.sensorSensitivity + ",stageOneStandbyDuration=" + this.stageOneStandbyDuration + ",minPreviewShortSide=" + this.minPreviewShortSide + ",enableSensorPixelModeMaximumResolution=" + this.enableSensorPixelModeMaximumResolution + ",properties=" + this.properties + ",preferredFrameRateRange=" + this.preferredFrameRateRange + "}";
    }

    public NativeCameraDelegateSettings(Size2 size2, float f10, float f11, float f12, float f13, NativeEdgeEnhancement nativeEdgeEnhancement, boolean z10, TorchState torchState, NativeTonemapCurve nativeTonemapCurve, NativeNoiseReduction nativeNoiseReduction, boolean z11, NativeMacroAfMode nativeMacroAfMode, boolean z12, long j10, long j11, boolean z13, int i10, int i11, float f14, int i12, boolean z14, NativeJsonValue nativeJsonValue, NativePreferredFrameRateRange nativePreferredFrameRateRange) {
        this.frameResolution = size2;
        this.minFrameRate = f10;
        this.maxFrameRate = f11;
        this.zoomFactor = f12;
        this.exposureTargetBias = f13;
        this.edgeEnhancementMode = nativeEdgeEnhancement;
        this.colorCorrection = z10;
        this.torchState = torchState;
        this.toneMappingCurve = nativeTonemapCurve;
        this.noiseReductionMode = nativeNoiseReduction;
        this.zoomAffectsMeteringArea = z11;
        this.macroAutofocusMode = nativeMacroAfMode;
        this.sceneChangeDetection = z12;
        this.exposureDuration = j10;
        this.frameDuration = j11;
        this.disablePostProcessing = z13;
        this.sharpnessStrength = i10;
        this.sensorSensitivity = i11;
        this.stageOneStandbyDuration = f14;
        this.minPreviewShortSide = i12;
        this.enableSensorPixelModeMaximumResolution = z14;
        this.properties = nativeJsonValue;
        this.preferredFrameRateRange = nativePreferredFrameRateRange;
    }
}
