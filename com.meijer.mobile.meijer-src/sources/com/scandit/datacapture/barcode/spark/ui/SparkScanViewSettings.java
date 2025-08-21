package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanMiniPreviewSizeSerializer;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeSerializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.core.internal.module.serialization.NativeEnumSerializer;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.source.TorchStateSerializer;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 x2\u00020\u0001:\u0001xB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u00107\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R\"\u0010;\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R$\u0010B\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010*\u001a\u0004\bD\u0010,\"\u0004\bE\u0010.R\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0013\u001a\u0004\bP\u0010\u0015\"\u0004\bQ\u0010\u0017R\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010^\u001a\u00020S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010U\u001a\u0004\b\\\u0010W\"\u0004\b]\u0010YR\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR(\u0010w\u001a\u00020o8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bp\u0010q\u0012\u0004\bv\u0010\u0003\u001a\u0004\br\u0010s\"\u0004\bt\u0010u¨\u0006y"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;", "", "<init>", "()V", "", "toJson", "()Ljava/lang/String;", "clone$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;", "clone", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/scandit/datacapture/core/time/TimeInterval;", "a", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getTriggerButtonCollapseTimeout", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setTriggerButtonCollapseTimeout", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "triggerButtonCollapseTimeout", "Lcom/scandit/datacapture/core/source/TorchState;", "b", "Lcom/scandit/datacapture/core/source/TorchState;", "getDefaultTorchState", "()Lcom/scandit/datacapture/core/source/TorchState;", "setDefaultTorchState", "(Lcom/scandit/datacapture/core/source/TorchState;)V", "defaultTorchState", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "c", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "getDefaultScanningMode", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "setDefaultScanningMode", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;)V", "defaultScanningMode", "d", "Z", "getHoldToScanEnabled", "()Z", "setHoldToScanEnabled", "(Z)V", "holdToScanEnabled", "e", "getSoundEnabled", "setSoundEnabled", "soundEnabled", "f", "getHapticEnabled", "setHapticEnabled", "hapticEnabled", "g", "getHardwareTriggerEnabled", "setHardwareTriggerEnabled", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, "h", "Ljava/lang/Integer;", "getHardwareTriggerKeyCode", "()Ljava/lang/Integer;", "setHardwareTriggerKeyCode", "(Ljava/lang/Integer;)V", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "i", "getVisualFeedbackEnabled", "setVisualFeedbackEnabled", "visualFeedbackEnabled", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "j", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "getToastSettings", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "setToastSettings", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;)V", "toastSettings", "k", "getInactiveStateTimeout", "setInactiveStateTimeout", "inactiveStateTimeout", "", "l", "F", "getZoomFactorOut", "()F", "setZoomFactorOut", "(F)V", "zoomFactorOut", "m", "getZoomFactorIn", "setZoomFactorIn", "zoomFactorIn", "Lcom/scandit/datacapture/core/source/CameraPosition;", "n", "Lcom/scandit/datacapture/core/source/CameraPosition;", "getDefaultCameraPosition", "()Lcom/scandit/datacapture/core/source/CameraPosition;", "setDefaultCameraPosition", "(Lcom/scandit/datacapture/core/source/CameraPosition;)V", "defaultCameraPosition", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanMiniPreviewSize;", "o", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanMiniPreviewSize;", "getDefaultMiniPreviewSize", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanMiniPreviewSize;", "setDefaultMiniPreviewSize", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanMiniPreviewSize;)V", "defaultMiniPreviewSize", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "p", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "getDefaultHandMode", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "setDefaultHandMode", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;)V", "getDefaultHandMode$annotations", "defaultHandMode", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SparkScanViewSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: q, reason: collision with root package name */
    private static final SparkScanScanningMode.Default f124921q = new SparkScanScanningMode.Default(SparkScanScanningBehavior.SINGLE, SparkScanPreviewBehavior.DEFAULT);

    /* renamed from: r, reason: collision with root package name */
    private static final TimeInterval f124922r;

    /* renamed from: s, reason: collision with root package name */
    private static final CameraPosition f124923s;

    /* renamed from: t, reason: collision with root package name */
    private static final TimeInterval f124924t;

    /* renamed from: u, reason: collision with root package name */
    private static final TorchState f124925u;

    /* renamed from: v, reason: collision with root package name */
    private static final SparkScanViewHandMode f124926v;

    /* renamed from: w, reason: collision with root package name */
    private static final SparkScanToastSettings f124927w;

    /* renamed from: x, reason: collision with root package name */
    private static final SparkScanMiniPreviewSize f124928x;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean hardwareTriggerEnabled;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TimeInterval triggerButtonCollapseTimeout = f124924t;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private TorchState defaultTorchState = f124925u;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private SparkScanScanningMode defaultScanningMode = f124921q;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean holdToScanEnabled = true;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean soundEnabled = true;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hapticEnabled = true;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Integer hardwareTriggerKeyCode = null;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean visualFeedbackEnabled = true;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private SparkScanToastSettings toastSettings = f124927w;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private TimeInterval inactiveStateTimeout = f124922r;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float zoomFactorOut = 1.0f;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float zoomFactorIn = 2.0f;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private CameraPosition defaultCameraPosition = f124923s;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SparkScanMiniPreviewSize defaultMiniPreviewSize = f124928x;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private SparkScanViewHandMode defaultHandMode = f124926v;

    @Deprecated
    public static /* synthetic */ void getDefaultHandMode$annotations() {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(SparkScanViewSettings.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings");
        SparkScanViewSettings sparkScanViewSettings = (SparkScanViewSettings) other;
        return Intrinsics.e(this.triggerButtonCollapseTimeout, sparkScanViewSettings.triggerButtonCollapseTimeout) && this.defaultTorchState == sparkScanViewSettings.defaultTorchState && Intrinsics.e(this.defaultScanningMode, sparkScanViewSettings.defaultScanningMode) && this.holdToScanEnabled == sparkScanViewSettings.holdToScanEnabled && this.soundEnabled == sparkScanViewSettings.soundEnabled && this.hapticEnabled == sparkScanViewSettings.hapticEnabled && this.hardwareTriggerEnabled == sparkScanViewSettings.hardwareTriggerEnabled && Intrinsics.e(this.hardwareTriggerKeyCode, sparkScanViewSettings.hardwareTriggerKeyCode) && this.visualFeedbackEnabled == sparkScanViewSettings.visualFeedbackEnabled && Intrinsics.e(this.toastSettings, sparkScanViewSettings.toastSettings) && Intrinsics.e(this.inactiveStateTimeout, sparkScanViewSettings.inactiveStateTimeout) && this.zoomFactorOut == sparkScanViewSettings.zoomFactorOut && this.zoomFactorIn == sparkScanViewSettings.zoomFactorIn && this.defaultCameraPosition == sparkScanViewSettings.defaultCameraPosition && this.defaultMiniPreviewSize == sparkScanViewSettings.defaultMiniPreviewSize;
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0014\u0010#\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u000fR\u0014\u0010%\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006("}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings$Companion;", "", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "DEFAULT_SCANNING_MODE", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "getDEFAULT_SCANNING_MODE", "()Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode$Default;", "Lcom/scandit/datacapture/core/source/CameraPosition;", "CAMERA_POSITION_DEFAULT", "Lcom/scandit/datacapture/core/source/CameraPosition;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "HAND_MODE_DEFAULT", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewHandMode;", "", "HAPTIC_ENABLED_DEFAULT", "Z", "HOLD_TO_SCAN_ENABLED_DEFAULT", "HW_TRIGGER_ENABLED_DEFAULT", "", "HW_TRIGGER_KEYCODE_DEFAULT", "Ljava/lang/Integer;", "Lcom/scandit/datacapture/core/time/TimeInterval;", "INACTIVE_STATE_TIMEOUT_DEFAULT", "Lcom/scandit/datacapture/core/time/TimeInterval;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanMiniPreviewSize;", "MINI_PREVIEW_SIZE_DEFAULT", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanMiniPreviewSize;", "SOUND_ENABLED_DEFAULT", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "TOAST_SETTINGS_DEFAULT", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "Lcom/scandit/datacapture/core/source/TorchState;", "TORCH_STATE_DEFAULT", "Lcom/scandit/datacapture/core/source/TorchState;", "TRIGGER_BUTTON_COLLAPSE_DEFAULT", "VISUAL_FEEDBACK_ENABLED_DEFAULT", "", "ZOOM_FACTOR_IN_DEFAULT", "F", "ZOOM_FACTOR_OUT_DEFAULT", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final SparkScanScanningMode.Default getDEFAULT_SCANNING_MODE() {
            return SparkScanViewSettings.f124921q;
        }
    }

    static {
        TimeInterval.Companion companion = TimeInterval.INSTANCE;
        f124922r = companion.seconds(10.0f);
        f124923s = CameraPosition.WORLD_FACING;
        f124924t = companion.seconds(5.0f);
        f124925u = TorchState.OFF;
        f124926v = SparkScanViewHandMode.RIGHT;
        f124927w = new SparkScanToastSettings(false, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        f124928x = SparkScanMiniPreviewSize.REGULAR;
    }

    public final /* synthetic */ SparkScanViewSettings clone$scandit_barcode_capture() {
        SparkScanViewSettings sparkScanViewSettings = new SparkScanViewSettings();
        sparkScanViewSettings.triggerButtonCollapseTimeout = this.triggerButtonCollapseTimeout;
        sparkScanViewSettings.inactiveStateTimeout = this.inactiveStateTimeout;
        sparkScanViewSettings.defaultTorchState = this.defaultTorchState;
        sparkScanViewSettings.defaultScanningMode = this.defaultScanningMode;
        sparkScanViewSettings.holdToScanEnabled = this.holdToScanEnabled;
        sparkScanViewSettings.soundEnabled = this.soundEnabled;
        sparkScanViewSettings.hapticEnabled = this.hapticEnabled;
        sparkScanViewSettings.hardwareTriggerEnabled = this.hardwareTriggerEnabled;
        sparkScanViewSettings.hardwareTriggerKeyCode = this.hardwareTriggerKeyCode;
        sparkScanViewSettings.visualFeedbackEnabled = this.visualFeedbackEnabled;
        sparkScanViewSettings.toastSettings = this.toastSettings;
        sparkScanViewSettings.zoomFactorIn = this.zoomFactorIn;
        sparkScanViewSettings.zoomFactorOut = this.zoomFactorOut;
        sparkScanViewSettings.defaultCameraPosition = this.defaultCameraPosition;
        sparkScanViewSettings.defaultMiniPreviewSize = this.defaultMiniPreviewSize;
        return sparkScanViewSettings;
    }

    public final CameraPosition getDefaultCameraPosition() {
        return this.defaultCameraPosition;
    }

    public final SparkScanViewHandMode getDefaultHandMode() {
        return this.defaultHandMode;
    }

    public final SparkScanMiniPreviewSize getDefaultMiniPreviewSize() {
        return this.defaultMiniPreviewSize;
    }

    public final SparkScanScanningMode getDefaultScanningMode() {
        return this.defaultScanningMode;
    }

    public final TorchState getDefaultTorchState() {
        return this.defaultTorchState;
    }

    public final boolean getHapticEnabled() {
        return this.hapticEnabled;
    }

    public final boolean getHardwareTriggerEnabled() {
        return this.hardwareTriggerEnabled;
    }

    public final Integer getHardwareTriggerKeyCode() {
        return this.hardwareTriggerKeyCode;
    }

    public final boolean getHoldToScanEnabled() {
        return this.holdToScanEnabled;
    }

    public final TimeInterval getInactiveStateTimeout() {
        return this.inactiveStateTimeout;
    }

    public final boolean getSoundEnabled() {
        return this.soundEnabled;
    }

    public final SparkScanToastSettings getToastSettings() {
        return this.toastSettings;
    }

    public final TimeInterval getTriggerButtonCollapseTimeout() {
        return this.triggerButtonCollapseTimeout;
    }

    public final boolean getVisualFeedbackEnabled() {
        return this.visualFeedbackEnabled;
    }

    public final float getZoomFactorIn() {
        return this.zoomFactorIn;
    }

    public final float getZoomFactorOut() {
        return this.zoomFactorOut;
    }

    public int hashCode() {
        int iHashCode = (Boolean.hashCode(this.hardwareTriggerEnabled) + ((Boolean.hashCode(this.hapticEnabled) + ((Boolean.hashCode(this.soundEnabled) + ((Boolean.hashCode(this.holdToScanEnabled) + ((this.defaultScanningMode.hashCode() + ((this.defaultTorchState.hashCode() + (this.triggerButtonCollapseTimeout.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Integer num = this.hardwareTriggerKeyCode;
        return this.defaultMiniPreviewSize.hashCode() + ((this.defaultCameraPosition.hashCode() + ((Float.hashCode(this.zoomFactorIn) + ((Float.hashCode(this.zoomFactorOut) + ((this.inactiveStateTimeout.hashCode() + ((this.toastSettings.hashCode() + ((Boolean.hashCode(this.visualFeedbackEnabled) + ((iHashCode + (num != null ? num.intValue() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setDefaultCameraPosition(CameraPosition cameraPosition) {
        Intrinsics.j(cameraPosition, "<set-?>");
        this.defaultCameraPosition = cameraPosition;
    }

    public final void setDefaultHandMode(SparkScanViewHandMode sparkScanViewHandMode) {
        Intrinsics.j(sparkScanViewHandMode, "<set-?>");
        this.defaultHandMode = sparkScanViewHandMode;
    }

    public final void setDefaultMiniPreviewSize(SparkScanMiniPreviewSize sparkScanMiniPreviewSize) {
        Intrinsics.j(sparkScanMiniPreviewSize, "<set-?>");
        this.defaultMiniPreviewSize = sparkScanMiniPreviewSize;
    }

    public final void setDefaultScanningMode(SparkScanScanningMode sparkScanScanningMode) {
        Intrinsics.j(sparkScanScanningMode, "<set-?>");
        this.defaultScanningMode = sparkScanScanningMode;
    }

    public final void setDefaultTorchState(TorchState torchState) {
        Intrinsics.j(torchState, "<set-?>");
        this.defaultTorchState = torchState;
    }

    public final void setHapticEnabled(boolean z10) {
        this.hapticEnabled = z10;
    }

    public final void setHardwareTriggerEnabled(boolean z10) {
        this.hardwareTriggerEnabled = z10;
    }

    public final void setHardwareTriggerKeyCode(Integer num) {
        this.hardwareTriggerKeyCode = num;
    }

    public final void setHoldToScanEnabled(boolean z10) {
        this.holdToScanEnabled = z10;
    }

    public final void setInactiveStateTimeout(TimeInterval timeInterval) {
        Intrinsics.j(timeInterval, "<set-?>");
        this.inactiveStateTimeout = timeInterval;
    }

    public final void setSoundEnabled(boolean z10) {
        this.soundEnabled = z10;
    }

    public final void setToastSettings(SparkScanToastSettings sparkScanToastSettings) {
        Intrinsics.j(sparkScanToastSettings, "<set-?>");
        this.toastSettings = sparkScanToastSettings;
    }

    public final void setTriggerButtonCollapseTimeout(TimeInterval timeInterval) {
        Intrinsics.j(timeInterval, "<set-?>");
        this.triggerButtonCollapseTimeout = timeInterval;
    }

    public final void setVisualFeedbackEnabled(boolean z10) {
        this.visualFeedbackEnabled = z10;
    }

    public final void setZoomFactorIn(float f10) {
        this.zoomFactorIn = f10;
    }

    public final void setZoomFactorOut(float f10) {
        this.zoomFactorOut = f10;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("triggerButtonCollapseTimeout", Float.valueOf(this.triggerButtonCollapseTimeout.asSeconds()));
        jSONObject.put("inactiveStateTimeout", Float.valueOf(this.inactiveStateTimeout.asSeconds()));
        jSONObject.put("defaultTorchState", TorchStateSerializer.toJson(this.defaultTorchState));
        jSONObject.put("defaultScanningMode", SparkScanScanningModeSerializer.toJson$default(this.defaultScanningMode, false, 2, null));
        jSONObject.put("holdToScanEnabled", this.holdToScanEnabled);
        jSONObject.put("soundEnabled", this.soundEnabled);
        jSONObject.put("hapticEnabled", this.hapticEnabled);
        jSONObject.put(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, this.hardwareTriggerEnabled);
        jSONObject.put(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, this.hardwareTriggerKeyCode);
        jSONObject.put("visualFeedbackEnabled", this.visualFeedbackEnabled);
        jSONObject.put("toastSettings", this.toastSettings.toJson());
        jSONObject.put("ignoreDragLimits", true);
        jSONObject.put("zoomFactorIn", Float.valueOf(this.zoomFactorIn));
        jSONObject.put("zoomFactorOut", Float.valueOf(this.zoomFactorOut));
        jSONObject.put("defaultCameraPosition", NativeEnumSerializer.cameraPositionToString(this.defaultCameraPosition));
        jSONObject.put("defaultMiniPreviewSize", SparkScanMiniPreviewSizeSerializer.toJson(this.defaultMiniPreviewSize));
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
