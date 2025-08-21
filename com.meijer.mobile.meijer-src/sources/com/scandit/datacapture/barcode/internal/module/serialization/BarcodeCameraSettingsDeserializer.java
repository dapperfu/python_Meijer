package com.scandit.datacapture.barcode.internal.module.serialization;

import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class BarcodeCameraSettingsDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final CameraSettings f123764a;

    public BarcodeCameraSettingsDeserializer(CameraSettings recommendedCameraSettings) {
        Intrinsics.j(recommendedCameraSettings, "recommendedCameraSettings");
        this.f123764a = recommendedCameraSettings;
    }

    public final CameraSettings a(JsonValue json) {
        Intrinsics.j(json, "json");
        CameraSettings cameraSettings = json.getByKeyAsBoolean("usesRecommendedSettings", true) ? this.f123764a : new CameraSettings();
        json._removeKeys(CollectionsKt.g("usesRecommendedSettings"));
        new FrameSourceDeserializer(CollectionsKt.m()).updateCameraSettingsFromJson(cameraSettings, json.jsonString());
        return cameraSettings;
    }
}
