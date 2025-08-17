package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.common.geometry.Size2Deserializer;
import com.scandit.datacapture.core.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumSerializer;
import com.scandit.datacapture.core.internal.module.source.K;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettingsDefaults;
import com.scandit.datacapture.core.internal.module.source.NativeEdgeEnhancement;
import com.scandit.datacapture.core.internal.module.source.NativeFocusSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;
import com.scandit.datacapture.core.internal.module.source.NativeNoiseReduction;
import com.scandit.datacapture.core.internal.module.source.NativePreferredFrameRateRange;
import com.scandit.datacapture.core.internal.module.source.NativeRegionStrategy;
import com.scandit.datacapture.core.internal.module.source.NativeTonemapCurve;
import com.scandit.datacapture.core.internal.module.source.NativeVideoAspectRatio;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.source.RegionStrategyDeserializer;
import com.scandit.datacapture.core.internal.sdk.source.RegionStrategySerializer;
import com.scandit.datacapture.core.internal.sdk.utils.JsonUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010>\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/scandit/datacapture/core/source/CameraSettings;", "", "<init>", "()V", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "impl", "(Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;)V", "", "updateWithNativeObject$scandit_capture_core", "updateWithNativeObject", "Lcom/scandit/datacapture/core/internal/module/device/profiles/camera/CameraProfile;", "profile", "addDefaultPropertiesFromProfile$scandit_capture_core", "(Lcom/scandit/datacapture/core/internal/module/device/profiles/camera/CameraProfile;)V", "addDefaultPropertiesFromProfile", "", "name", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", "", "isUsingApi2Features$scandit_capture_core", "()Z", "isUsingApi2Features", "_impl$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "_impl", "Lcom/scandit/datacapture/core/source/VideoResolution;", "a", "Lcom/scandit/datacapture/core/source/VideoResolution;", "getPreferredResolution", "()Lcom/scandit/datacapture/core/source/VideoResolution;", "setPreferredResolution", "(Lcom/scandit/datacapture/core/source/VideoResolution;)V", "preferredResolution", "", "b", "F", "getZoomFactor", "()F", "setZoomFactor", "(F)V", "zoomFactor", "c", "getZoomGestureZoomFactor", "setZoomGestureZoomFactor", "zoomGestureZoomFactor", "Lcom/scandit/datacapture/core/source/FocusGestureStrategy;", "d", "Lcom/scandit/datacapture/core/source/FocusGestureStrategy;", "getFocusGestureStrategy", "()Lcom/scandit/datacapture/core/source/FocusGestureStrategy;", "setFocusGestureStrategy", "(Lcom/scandit/datacapture/core/source/FocusGestureStrategy;)V", "focusGestureStrategy", "f", "Z", "getShouldPreferSmoothAutoFocus", "setShouldPreferSmoothAutoFocus", "(Z)V", "shouldPreferSmoothAutoFocus", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class CameraSettings {

    @Deprecated
    public static final String FOCUS_STRATEGY_AUTO = "auto";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private VideoResolution preferredResolution;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float zoomFactor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float zoomGestureZoomFactor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private FocusGestureStrategy focusGestureStrategy;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f125891e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean shouldPreferSmoothAutoFocus;

    public CameraSettings() {
        VideoResolution videoResolutionPreferredResolution = NativeCameraSettingsDefaults.preferredResolution();
        Intrinsics.i(videoResolutionPreferredResolution, "preferredResolution(...)");
        float fZoomFactor = NativeCameraSettingsDefaults.zoomFactor();
        float fZoomGestureZoomFactor = NativeCameraSettingsDefaults.zoomGestureZoomFactor();
        boolean zShouldPreferSmoothAutoFocus = NativeCameraSettingsDefaults.shouldPreferSmoothAutoFocus();
        FocusGestureStrategy focusGestureStrategy = NativeCameraSettingsDefaults.focusGestureStrategy();
        Intrinsics.i(focusGestureStrategy, "focusGestureStrategy(...)");
        this.preferredResolution = videoResolutionPreferredResolution;
        this.zoomFactor = fZoomFactor;
        this.zoomGestureZoomFactor = fZoomGestureZoomFactor;
        this.focusGestureStrategy = focusGestureStrategy;
        HashMap map = new HashMap();
        this.f125891e = map;
        this.shouldPreferSmoothAutoFocus = zShouldPreferSmoothAutoFocus;
        if (zShouldPreferSmoothAutoFocus) {
            map.put("macroAutofocusMode", "off");
        }
    }

    private final void a(NativeJsonValue nativeJsonValue) throws JSONException {
        if (nativeJsonValue != null) {
            String string = nativeJsonValue.toString();
            Intrinsics.i(string, "toString(...)");
            Object objObjectFromJson = JsonUtils.objectFromJson(string);
            Map map = objObjectFromJson instanceof Map ? (Map) objObjectFromJson : null;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    setProperty((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public final NativeCameraSettings _impl$scandit_capture_core() {
        HashMap map = this.f125891e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!K.f124787a.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        NativeJsonValue nativeJsonValueFromString = NativeJsonValue.fromString(JsonUtils.jsonFromObject(linkedHashMap));
        VideoResolution videoResolution = this.preferredResolution;
        Float fA = a("minFrameRate");
        float fFloatValue = fA != null ? fA.floatValue() : NativeCameraSettingsDefaults.minFrameRate();
        Float fA2 = a("maxFrameRate");
        float fFloatValue2 = fA2 != null ? fA2.floatValue() : NativeCameraSettingsDefaults.maxFrameRate();
        float f10 = this.zoomFactor;
        float f11 = this.zoomGestureZoomFactor;
        Float fA3 = a("manualLensPosition");
        float fFloatValue3 = fA3 != null ? fA3.floatValue() : NativeCameraSettingsDefaults.lensPosition();
        Object property = getProperty("focusStrategy");
        String json = property instanceof String ? (String) property : null;
        if (json == null) {
            NativeFocusStrategy focusStrategy = NativeFocusStrategy.AUTO;
            Intrinsics.j(focusStrategy, "focusStrategy");
            Intrinsics.j(focusStrategy, "<this>");
            json = NativeEnumSerializer.focusStrategyToString(focusStrategy);
            Intrinsics.i(json, "focusStrategyToString(...)");
        }
        Intrinsics.j(json, "json");
        NativeFocusStrategy nativeFocusStrategyFocusStrategyFromJsonString = NativeEnumDeserializer.focusStrategyFromJsonString(json);
        Intrinsics.i(nativeFocusStrategyFocusStrategyFromJsonString, "focusStrategyFromJsonString(...)");
        NativeFocusSettings nativeFocusSettings = new NativeFocusSettings(fFloatValue3, nativeFocusStrategyFocusStrategyFromJsonString, this.shouldPreferSmoothAutoFocus, nativeJsonValueFromString, null, this.focusGestureStrategy);
        Object property2 = getProperty("api");
        Integer num = property2 instanceof Integer ? (Integer) property2 : null;
        int iIntValue = num != null ? num.intValue() : NativeCameraSettingsDefaults.api();
        Object property3 = getProperty("usesApi2Features");
        Boolean bool = property3 instanceof Boolean ? (Boolean) property3 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : NativeCameraSettingsDefaults.usesCameraApi2Features();
        Object property4 = getProperty("overwriteWithHighestResolution");
        Boolean bool2 = property4 instanceof Boolean ? (Boolean) property4 : null;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : NativeCameraSettingsDefaults.overwriteWithHighestResolution();
        Float fA4 = a("exposureTargetBias");
        float fFloatValue4 = fA4 != null ? fA4.floatValue() : NativeCameraSettingsDefaults.exposureTargetBias();
        Object property5 = getProperty("colorCorrection");
        Boolean bool3 = property5 instanceof Boolean ? (Boolean) property5 : null;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : NativeCameraSettingsDefaults.colorCorrection();
        Object property6 = getProperty("toneMappingCurve");
        boolean z10 = zBooleanValue3;
        NativeTonemapCurve nativeTonemapCurve = property6 instanceof NativeTonemapCurve ? (NativeTonemapCurve) property6 : null;
        if (nativeTonemapCurve == null) {
            nativeTonemapCurve = NativeCameraSettingsDefaults.tonemapCurve();
        }
        Object property7 = getProperty("noiseReductionMode");
        NativeNoiseReduction nativeNoiseReductionNoiseReductionMode = property7 instanceof NativeNoiseReduction ? (NativeNoiseReduction) property7 : null;
        if (nativeNoiseReductionNoiseReductionMode == null) {
            nativeNoiseReductionNoiseReductionMode = NativeCameraSettingsDefaults.noiseReductionMode();
        }
        Object property8 = getProperty("edgeEnhancementMode");
        NativeNoiseReduction nativeNoiseReduction = nativeNoiseReductionNoiseReductionMode;
        NativeEdgeEnhancement nativeEdgeEnhancementEdgeEnhancementMode = property8 instanceof NativeEdgeEnhancement ? (NativeEdgeEnhancement) property8 : null;
        if (nativeEdgeEnhancementEdgeEnhancementMode == null) {
            nativeEdgeEnhancementEdgeEnhancementMode = NativeCameraSettingsDefaults.edgeEnhancementMode();
        }
        Object property9 = getProperty("regionStrategy");
        NativeEdgeEnhancement nativeEdgeEnhancement = nativeEdgeEnhancementEdgeEnhancementMode;
        String json2 = property9 instanceof String ? (String) property9 : null;
        if (json2 == null) {
            json2 = RegionStrategySerializer.INSTANCE.toJson(NativeRegionStrategy.DEFAULT);
        }
        NativeRegionStrategy nativeRegionStrategyFromJson = RegionStrategyDeserializer.INSTANCE.fromJson(json2);
        float f12 = fFloatValue4;
        float f13 = NativeCameraSettingsDefaults.torchLevel();
        Object property10 = getProperty("preferredAspectRatio");
        String json3 = property10 instanceof String ? (String) property10 : null;
        if (json3 == null) {
            NativeVideoAspectRatio aspectRatio = NativeVideoAspectRatio.AUTO;
            Intrinsics.j(aspectRatio, "aspectRatio");
            Intrinsics.j(aspectRatio, "<this>");
            json3 = NativeEnumSerializer.videoAspectRatioToString(aspectRatio);
            Intrinsics.i(json3, "videoAspectRatioToString(...)");
        }
        Intrinsics.j(json3, "json");
        NativeVideoAspectRatio nativeVideoAspectRatioVideoAspectRatioFromJsonString = NativeEnumDeserializer.videoAspectRatioFromJsonString(json3);
        Intrinsics.i(nativeVideoAspectRatioVideoAspectRatioFromJsonString, "videoAspectRatioFromJsonString(...)");
        Object property11 = getProperty("arbitraryVideoResolution");
        String str = property11 instanceof String ? (String) property11 : null;
        Size2 size2FromJson = str == null ? null : Size2Deserializer.INSTANCE.fromJson(str);
        Object property12 = getProperty("closestResolutionTo12MPForFourToThreeAspectRatio");
        Boolean bool4 = property12 instanceof Boolean ? (Boolean) property12 : null;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : NativeCameraSettingsDefaults.chooseClosestResolutionTo12MPForFourThreeAspectRatio();
        Object property13 = getProperty("quadHd");
        Boolean bool5 = property13 instanceof Boolean ? (Boolean) property13 : null;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : NativeCameraSettingsDefaults.quadHd();
        Object property14 = getProperty("dynamicResolution");
        boolean z11 = zBooleanValue5;
        Boolean bool6 = property14 instanceof Boolean ? (Boolean) property14 : null;
        boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : NativeCameraSettingsDefaults.dynamicResolution();
        Object property15 = getProperty("dynamicResolutionLowFps");
        boolean z12 = zBooleanValue6;
        Integer num2 = property15 instanceof Integer ? (Integer) property15 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : NativeCameraSettingsDefaults.dynamicResolutionLowFps();
        Object property16 = getProperty("dynamicResolutionHighPreviewOffset");
        int i10 = iIntValue2;
        Integer num3 = property16 instanceof Integer ? (Integer) property16 : null;
        int iIntValue3 = num3 != null ? num3.intValue() : NativeCameraSettingsDefaults.dynamicResolutionHighPreviewOffset();
        Object property17 = getProperty("dynamicResolutionMeasuringIntervalMillis");
        int i11 = iIntValue3;
        Integer num4 = property17 instanceof Integer ? (Integer) property17 : null;
        int iIntValue4 = num4 != null ? num4.intValue() : NativeCameraSettingsDefaults.dynamicResolutionMeasuringIntervalMillis();
        Object property18 = getProperty("dynamicResolutionLogging");
        int i12 = iIntValue4;
        Boolean bool7 = property18 instanceof Boolean ? (Boolean) property18 : null;
        boolean zBooleanValue7 = bool7 != null ? bool7.booleanValue() : NativeCameraSettingsDefaults.dynamicResolutionLogging();
        Object property19 = getProperty("enableSensorPixelModeMaximumResolution");
        boolean z13 = zBooleanValue7;
        Boolean bool8 = property19 instanceof Boolean ? (Boolean) property19 : null;
        boolean zBooleanValue8 = bool8 != null ? bool8.booleanValue() : NativeCameraSettingsDefaults.enableSensorPixelModeMaximumResolution();
        Object property20 = getProperty("preferredFrameRateRange");
        boolean z14 = zBooleanValue8;
        NativePreferredFrameRateRange nativePreferredFrameRateRange = property20 instanceof NativePreferredFrameRateRange ? (NativePreferredFrameRateRange) property20 : null;
        Object property21 = getProperty("manualUntilCaptureTimeout");
        Integer num5 = property21 instanceof Integer ? (Integer) property21 : null;
        return new NativeCameraSettings(videoResolution, fFloatValue, fFloatValue2, f10, f11, nativeFocusSettings, iIntValue, zBooleanValue, zBooleanValue2, f12, z10, nativeTonemapCurve, nativeNoiseReduction, nativeEdgeEnhancement, nativeRegionStrategyFromJson, f13, nativeVideoAspectRatioVideoAspectRatioFromJsonString, size2FromJson, zBooleanValue4, z11, z12, i10, i11, i12, z13, z14, nativeJsonValueFromString, nativePreferredFrameRateRange, num5 != null ? num5.intValue() : NativeCameraSettingsDefaults.manualUntilCaptureTimeout(), NativeCameraSettingsDefaults.useDepth());
    }

    public final void addDefaultPropertiesFromProfile$scandit_capture_core(CameraProfile profile) {
        Intrinsics.j(profile, "profile");
        NativeFocusStrategy nativeFocusStrategyE = profile.e();
        if (nativeFocusStrategyE != null) {
            Object property = getProperty("focusStrategy");
            if (property == null || Intrinsics.e(property, FOCUS_STRATEGY_AUTO)) {
                setProperty("focusStrategy", nativeFocusStrategyE);
            }
        }
    }

    public final FocusGestureStrategy getFocusGestureStrategy() {
        return this.focusGestureStrategy;
    }

    public final VideoResolution getPreferredResolution() {
        return this.preferredResolution;
    }

    public final Object getProperty(String name) {
        Intrinsics.j(name, "name");
        return this.f125891e.get(name);
    }

    public final boolean getShouldPreferSmoothAutoFocus() {
        return this.shouldPreferSmoothAutoFocus;
    }

    public final float getZoomFactor() {
        return this.zoomFactor;
    }

    public final float getZoomGestureZoomFactor() {
        return this.zoomGestureZoomFactor;
    }

    public final boolean isUsingApi2Features$scandit_capture_core() {
        Object property = getProperty("usesApi2Features");
        if (Intrinsics.e(property instanceof Boolean ? (Boolean) property : null, Boolean.TRUE)) {
            return true;
        }
        Float fA = a("manualLensPosition");
        return (fA != null ? fA.floatValue() : -1.0f) >= 0.0f || this.preferredResolution == VideoResolution.UHD4K;
    }

    public final void setFocusGestureStrategy(FocusGestureStrategy focusGestureStrategy) {
        Intrinsics.j(focusGestureStrategy, "<set-?>");
        this.focusGestureStrategy = focusGestureStrategy;
    }

    public final void setPreferredResolution(VideoResolution videoResolution) {
        Intrinsics.j(videoResolution, "<set-?>");
        this.preferredResolution = videoResolution;
    }

    public final void setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        if (Intrinsics.e(name, "focusStrategy") && (value instanceof NativeFocusStrategy)) {
            NativeFocusStrategy focusStrategy = (NativeFocusStrategy) value;
            Intrinsics.j(focusStrategy, "focusStrategy");
            Intrinsics.j(focusStrategy, "<this>");
            value = NativeEnumSerializer.focusStrategyToString(focusStrategy);
            Intrinsics.i(value, "focusStrategyToString(...)");
        }
        this.f125891e.put(name, value);
        NativeFocusStrategy focusStrategy2 = NativeFocusStrategy.FORCE_CONTINUOUS;
        Intrinsics.j(focusStrategy2, "focusStrategy");
        Intrinsics.j(focusStrategy2, "<this>");
        String strFocusStrategyToString = NativeEnumSerializer.focusStrategyToString(focusStrategy2);
        Intrinsics.i(strFocusStrategyToString, "focusStrategyToString(...)");
        if (Intrinsics.e(name, "focusStrategy") && Intrinsics.e(value, strFocusStrategyToString)) {
            this.f125891e.put("macroAutofocusMode", "off");
        }
    }

    public final void setShouldPreferSmoothAutoFocus(boolean z10) {
        this.shouldPreferSmoothAutoFocus = z10;
        if (z10) {
            this.f125891e.put("macroAutofocusMode", "off");
        }
    }

    public final void setZoomFactor(float f10) {
        this.zoomFactor = f10;
    }

    public final void setZoomGestureZoomFactor(float f10) {
        this.zoomGestureZoomFactor = f10;
    }

    public final void updateWithNativeObject$scandit_capture_core(NativeCameraSettings impl) throws JSONException {
        Intrinsics.j(impl, "impl");
        VideoResolution preferredResolution = impl.getPreferredResolution();
        Intrinsics.i(preferredResolution, "getPreferredResolution(...)");
        this.preferredResolution = preferredResolution;
        this.zoomFactor = impl.getZoomFactor();
        this.zoomGestureZoomFactor = impl.getZoomGestureZoomFactor();
        setShouldPreferSmoothAutoFocus(impl.getFocus().getShouldPreferSmoothAutoFocus());
        FocusGestureStrategy focusGestureStrategy = impl.getFocus().getFocusGestureStrategy();
        Intrinsics.i(focusGestureStrategy, "getFocusGestureStrategy(...)");
        this.focusGestureStrategy = focusGestureStrategy;
        setProperty("api", Integer.valueOf(impl.getApi()));
        setProperty("usesApi2Features", Boolean.valueOf(impl.getUsesCameraApi2Features()));
        setProperty("manualLensPosition", Float.valueOf(impl.getFocus().getManualLensPosition()));
        setProperty("overwriteWithHighestResolution", Boolean.valueOf(impl.getOverwriteWithHighestResolution()));
        setProperty("exposureTargetBias", Float.valueOf(impl.getExposureTargetBias()));
        setProperty("maxFrameRate", Float.valueOf(impl.getMaxFrameRate()));
        setProperty("minFrameRate", Float.valueOf(impl.getMinFrameRate()));
        setProperty("colorCorrection", Boolean.valueOf(impl.getColorCorrection()));
        setProperty("toneMappingCurve", impl.getToneMappingCurve());
        setProperty("edgeEnhancementMode", impl.getEdgeEnhancementMode());
        setProperty("noiseReductionMode", impl.getNoiseReductionMode());
        NativeFocusStrategy focusStrategy = impl.getFocus().getSelectedFocusStrategy();
        Intrinsics.i(focusStrategy, "getSelectedFocusStrategy(...)");
        Intrinsics.j(focusStrategy, "focusStrategy");
        Intrinsics.j(focusStrategy, "<this>");
        String strFocusStrategyToString = NativeEnumSerializer.focusStrategyToString(focusStrategy);
        Intrinsics.i(strFocusStrategyToString, "focusStrategyToString(...)");
        setProperty("focusStrategy", strFocusStrategyToString);
        RegionStrategySerializer regionStrategySerializer = RegionStrategySerializer.INSTANCE;
        NativeRegionStrategy regionControlStrategy = impl.getRegionControlStrategy();
        Intrinsics.i(regionControlStrategy, "getRegionControlStrategy(...)");
        setProperty("regionStrategy", regionStrategySerializer.toJson(regionControlStrategy));
        NativeVideoAspectRatio aspectRatio = impl.getPreferredAspectRatio();
        Intrinsics.i(aspectRatio, "getPreferredAspectRatio(...)");
        Intrinsics.j(aspectRatio, "aspectRatio");
        Intrinsics.j(aspectRatio, "<this>");
        String strVideoAspectRatioToString = NativeEnumSerializer.videoAspectRatioToString(aspectRatio);
        Intrinsics.i(strVideoAspectRatioToString, "videoAspectRatioToString(...)");
        setProperty("preferredAspectRatio", strVideoAspectRatioToString);
        setProperty("enableSensorPixelModeMaximumResolution", Boolean.valueOf(impl.getEnableSensorPixelModeMaximumResolution()));
        setProperty("closestResolutionTo12MPForFourToThreeAspectRatio", Boolean.valueOf(impl.getChooseClosestResolutionTo12MPForFourThreeAspectRatio()));
        setProperty("quadHd", Boolean.valueOf(impl.getQuadHd()));
        if (impl.getArbitraryVideoResolution() != null) {
            Size2 arbitraryVideoResolution = impl.getArbitraryVideoResolution();
            Intrinsics.i(arbitraryVideoResolution, "getArbitraryVideoResolution(...)");
            setProperty("arbitraryVideoResolution", Size2UtilsKt.toJson(arbitraryVideoResolution));
        }
        setProperty("dynamicResolution", Boolean.valueOf(impl.getDynamicResolution()));
        setProperty("dynamicResolutionLowFps", Integer.valueOf(impl.getDynamicResolutionLowFps()));
        setProperty("dynamicResolutionHighPreviewOffset", Integer.valueOf(impl.getDynamicResolutionHighPreviewOffset()));
        setProperty("dynamicResolutionMeasuringIntervalMillis", Integer.valueOf(impl.getDynamicResolutionMeasuringIntervalMillis()));
        setProperty("dynamicResolutionLogging", Boolean.valueOf(impl.getDynamicResolutionLogging()));
        a(impl.getProperties());
        a(impl.getFocus().getProperties());
        setProperty("preferredFrameRateRange", impl.getPreferredFrameRateRange());
        setProperty("manualUntilCaptureTimeout", Integer.valueOf(impl.getManualUntilCaptureTimeout()));
    }

    private final Float a(String str) {
        Object obj = this.f125891e.get(str);
        Float fValueOf = obj instanceof Float ? (Float) obj : null;
        if (fValueOf == null) {
            Double d10 = obj instanceof Double ? (Double) obj : null;
            fValueOf = d10 != null ? Float.valueOf((float) d10.doubleValue()) : null;
            if (fValueOf == null) {
                if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                    return Float.valueOf(r5.intValue());
                }
                return null;
            }
        }
        return fValueOf;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraSettings(NativeCameraSettings impl) throws JSONException {
        this();
        Intrinsics.j(impl, "impl");
        updateWithNativeObject$scandit_capture_core(impl);
    }
}
