package com.scandit.datacapture.barcode.internal.module.spark.serialization;

import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanMiniPreviewSizeDeserializer;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeDeserializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanToastSettings;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchStateDeserializer;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements SparkScanViewSettingsDeserializer {

    /* renamed from: a, reason: collision with root package name */
    public final d f122960a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f122961b;

    public c() {
        e toastSettingsDeserializer = new e();
        b toastSettingsFactory = b.f122959a;
        Intrinsics.j(toastSettingsDeserializer, "toastSettingsDeserializer");
        Intrinsics.j(toastSettingsFactory, "toastSettingsFactory");
        this.f122960a = toastSettingsDeserializer;
        this.f122961b = toastSettingsFactory;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.serialization.SparkScanViewSettingsDeserializer
    public final void a(SparkScanViewSettings settings, JsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        if (json.contains("triggerButtonCollapseTimeout")) {
            settings.setTriggerButtonCollapseTimeout(TimeInterval.INSTANCE.seconds(json.requireByKeyAsFloat("triggerButtonCollapseTimeout")));
        }
        if (json.contains("inactiveStateTimeout")) {
            settings.setInactiveStateTimeout(TimeInterval.INSTANCE.seconds(json.requireByKeyAsFloat("inactiveStateTimeout")));
        }
        if (json.contains("defaultTorchState")) {
            settings.setDefaultTorchState(TorchStateDeserializer.fromJson(json.requireByKeyAsString("defaultTorchState")));
        }
        if (json.contains("defaultScanningMode")) {
            settings.setDefaultScanningMode(SparkScanScanningModeDeserializer.fromJson(json.requireByKeyAsObject("defaultScanningMode").jsonString()));
        }
        if (json.contains("holdToScanEnabled")) {
            settings.setHoldToScanEnabled(json.requireByKeyAsBoolean("holdToScanEnabled"));
        }
        if (json.contains("soundEnabled")) {
            settings.setSoundEnabled(json.requireByKeyAsBoolean("soundEnabled"));
        }
        if (json.contains("hapticEnabled")) {
            settings.setHapticEnabled(json.requireByKeyAsBoolean("hapticEnabled"));
        }
        if (json.contains(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED)) {
            settings.setHardwareTriggerEnabled(json.requireByKeyAsBoolean(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED));
        }
        if (json.contains(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE)) {
            settings.setHardwareTriggerKeyCode(Integer.valueOf(json.requireByKeyAsInt(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE)));
        }
        if (json.contains("visualFeedbackEnabled")) {
            settings.setVisualFeedbackEnabled(json.requireByKeyAsBoolean("visualFeedbackEnabled"));
        }
        SparkScanToastSettings settings2 = (SparkScanToastSettings) this.f122961b.invoke();
        if (json.contains("toastSettings")) {
            JsonValue json2 = json.requireByKeyAsObject("toastSettings");
            ((e) this.f122960a).getClass();
            Intrinsics.j(settings2, "settings");
            Intrinsics.j(json2, "json");
            if (json2.contains("toastEnabled")) {
                settings2.setToastEnabled(json2.requireByKeyAsBoolean("toastEnabled"));
            }
            if (json2.contains("toastBackgroundColor")) {
                settings2.setToastBackgroundColor(Integer.valueOf(json2.requireByKeyAsColor("toastBackgroundColor")));
            }
            if (json2.contains("toastTextColor")) {
                settings2.setToastTextColor(Integer.valueOf(json2.requireByKeyAsColor("toastTextColor")));
            }
            if (json2.contains("targetModeEnabledMessage")) {
                settings2.setTargetModeEnabledMessage(json2.requireByKeyAsString("targetModeEnabledMessage"));
            }
            if (json2.contains("targetModeDisabledMessage")) {
                settings2.setTargetModeDisabledMessage(json2.requireByKeyAsString("targetModeDisabledMessage"));
            }
            if (json2.contains("continuousModeEnabledMessage")) {
                settings2.setContinuousModeEnabledMessage(json2.requireByKeyAsString("continuousModeEnabledMessage"));
            }
            if (json2.contains("continuousModeDisabledMessage")) {
                settings2.setContinuousModeDisabledMessage(json2.requireByKeyAsString("continuousModeDisabledMessage"));
            }
            if (json2.contains("scanPausedMessage")) {
                settings2.setScanPausedMessage(json2.requireByKeyAsString("scanPausedMessage"));
            }
            if (json2.contains("zoomedInMessage")) {
                settings2.setZoomedInMessage(json2.requireByKeyAsString("zoomedInMessage"));
            }
            if (json2.contains("zoomedOutMessage")) {
                settings2.setZoomedOutMessage(json2.requireByKeyAsString("zoomedOutMessage"));
            }
            if (json2.contains("torchEnabledMessage")) {
                settings2.setTorchEnabledMessage(json2.requireByKeyAsString("torchEnabledMessage"));
            }
            if (json2.contains("torchDisabledMessage")) {
                settings2.setTorchDisabledMessage(json2.requireByKeyAsString("torchDisabledMessage"));
            }
            if (json2.contains("worldFacingCameraEnabledMessage")) {
                settings2.setWorldFacingCameraEnabledMessage(json2.requireByKeyAsString("worldFacingCameraEnabledMessage"));
            }
            if (json2.contains("userFacingCameraEnabledMessage")) {
                settings2.setUserFacingCameraEnabledMessage(json2.requireByKeyAsString("userFacingCameraEnabledMessage"));
            }
        }
        settings.setToastSettings(settings2);
        if (json.contains("zoomFactorOut")) {
            settings.setZoomFactorOut(json.requireByKeyAsFloat("zoomFactorOut"));
        }
        if (json.contains("zoomFactorIn")) {
            settings.setZoomFactorIn(json.requireByKeyAsFloat("zoomFactorIn"));
        }
        if (json.contains("defaultCameraPosition")) {
            CameraPosition cameraPositionCameraPositionFromJsonString = NativeEnumDeserializer.cameraPositionFromJsonString(json.requireByKeyAsString("defaultCameraPosition"));
            Intrinsics.i(cameraPositionCameraPositionFromJsonString, "cameraPositionFromJsonString(...)");
            settings.setDefaultCameraPosition(cameraPositionCameraPositionFromJsonString);
        }
        if (json.contains("defaultMiniPreviewSize")) {
            settings.setDefaultMiniPreviewSize(SparkScanMiniPreviewSizeDeserializer.fromJson(json.requireByKeyAsString("defaultMiniPreviewSize")));
        }
    }
}
