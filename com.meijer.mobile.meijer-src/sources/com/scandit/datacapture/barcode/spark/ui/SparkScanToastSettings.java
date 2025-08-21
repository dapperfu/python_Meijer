package com.scandit.datacapture.barcode.spark.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.utils.ColorExtensionsKt;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bW\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010\u0016J¶\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\u0016J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u00103R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u00108R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00105\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u00108R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010@R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010=\u001a\u0004\bB\u0010\u0016\"\u0004\bC\u0010@R$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010=\u001a\u0004\bE\u0010\u0016\"\u0004\bF\u0010@R$\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010\u0016\"\u0004\bI\u0010@R$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010\u0016\"\u0004\bL\u0010@R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010=\u001a\u0004\bN\u0010\u0016\"\u0004\bO\u0010@R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010=\u001a\u0004\bQ\u0010\u0016\"\u0004\bR\u0010@R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010=\u001a\u0004\bT\u0010\u0016\"\u0004\bU\u0010@R$\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010=\u001a\u0004\bW\u0010\u0016\"\u0004\bX\u0010@R$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010=\u001a\u0004\bZ\u0010\u0016\"\u0004\b[\u0010@R$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010=\u001a\u0004\b]\u0010\u0016\"\u0004\b^\u0010@R\"\u0010f\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e¨\u0006g"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "", "", "toastEnabled", "", "toastBackgroundColor", "toastTextColor", "", "targetModeEnabledMessage", "targetModeDisabledMessage", "continuousModeEnabledMessage", "continuousModeDisabledMessage", "scanPausedMessage", "zoomedInMessage", "zoomedOutMessage", "torchEnabledMessage", "torchDisabledMessage", "userFacingCameraEnabledMessage", "worldFacingCameraEnabledMessage", "<init>", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toJson", "()Ljava/lang/String;", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanToastSettings;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getToastEnabled", "setToastEnabled", "(Z)V", "b", "Ljava/lang/Integer;", "getToastBackgroundColor", "setToastBackgroundColor", "(Ljava/lang/Integer;)V", "c", "getToastTextColor", "setToastTextColor", "d", "Ljava/lang/String;", "getTargetModeEnabledMessage", "setTargetModeEnabledMessage", "(Ljava/lang/String;)V", "e", "getTargetModeDisabledMessage", "setTargetModeDisabledMessage", "f", "getContinuousModeEnabledMessage", "setContinuousModeEnabledMessage", "g", "getContinuousModeDisabledMessage", "setContinuousModeDisabledMessage", "h", "getScanPausedMessage", "setScanPausedMessage", "i", "getZoomedInMessage", "setZoomedInMessage", "j", "getZoomedOutMessage", "setZoomedOutMessage", "k", "getTorchEnabledMessage", "setTorchEnabledMessage", "l", "getTorchDisabledMessage", "setTorchDisabledMessage", "m", "getUserFacingCameraEnabledMessage", "setUserFacingCameraEnabledMessage", "n", "getWorldFacingCameraEnabledMessage", "setWorldFacingCameraEnabledMessage", "Lcom/scandit/datacapture/core/time/TimeInterval;", "o", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getToastDuration$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setToastDuration$scandit_barcode_capture", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "toastDuration", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class SparkScanToastSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean toastEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer toastBackgroundColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Integer toastTextColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String targetModeEnabledMessage;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String targetModeDisabledMessage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String continuousModeEnabledMessage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String continuousModeDisabledMessage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String scanPausedMessage;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String zoomedInMessage;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String zoomedOutMessage;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String torchEnabledMessage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String torchDisabledMessage;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String userFacingCameraEnabledMessage;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String worldFacingCameraEnabledMessage;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private TimeInterval toastDuration;

    public SparkScanToastSettings() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getToastEnabled() {
        return this.toastEnabled;
    }

    /* renamed from: component10, reason: from getter */
    public final String getZoomedOutMessage() {
        return this.zoomedOutMessage;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTorchEnabledMessage() {
        return this.torchEnabledMessage;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTorchDisabledMessage() {
        return this.torchDisabledMessage;
    }

    /* renamed from: component13, reason: from getter */
    public final String getUserFacingCameraEnabledMessage() {
        return this.userFacingCameraEnabledMessage;
    }

    /* renamed from: component14, reason: from getter */
    public final String getWorldFacingCameraEnabledMessage() {
        return this.worldFacingCameraEnabledMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getToastBackgroundColor() {
        return this.toastBackgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getToastTextColor() {
        return this.toastTextColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTargetModeEnabledMessage() {
        return this.targetModeEnabledMessage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTargetModeDisabledMessage() {
        return this.targetModeDisabledMessage;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContinuousModeEnabledMessage() {
        return this.continuousModeEnabledMessage;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContinuousModeDisabledMessage() {
        return this.continuousModeDisabledMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final String getScanPausedMessage() {
        return this.scanPausedMessage;
    }

    /* renamed from: component9, reason: from getter */
    public final String getZoomedInMessage() {
        return this.zoomedInMessage;
    }

    public final SparkScanToastSettings copy(boolean toastEnabled, Integer toastBackgroundColor, Integer toastTextColor, String targetModeEnabledMessage, String targetModeDisabledMessage, String continuousModeEnabledMessage, String continuousModeDisabledMessage, String scanPausedMessage, String zoomedInMessage, String zoomedOutMessage, String torchEnabledMessage, String torchDisabledMessage, String userFacingCameraEnabledMessage, String worldFacingCameraEnabledMessage) {
        return new SparkScanToastSettings(toastEnabled, toastBackgroundColor, toastTextColor, targetModeEnabledMessage, targetModeDisabledMessage, continuousModeEnabledMessage, continuousModeDisabledMessage, scanPausedMessage, zoomedInMessage, zoomedOutMessage, torchEnabledMessage, torchDisabledMessage, userFacingCameraEnabledMessage, worldFacingCameraEnabledMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SparkScanToastSettings)) {
            return false;
        }
        SparkScanToastSettings sparkScanToastSettings = (SparkScanToastSettings) other;
        return this.toastEnabled == sparkScanToastSettings.toastEnabled && Intrinsics.e(this.toastBackgroundColor, sparkScanToastSettings.toastBackgroundColor) && Intrinsics.e(this.toastTextColor, sparkScanToastSettings.toastTextColor) && Intrinsics.e(this.targetModeEnabledMessage, sparkScanToastSettings.targetModeEnabledMessage) && Intrinsics.e(this.targetModeDisabledMessage, sparkScanToastSettings.targetModeDisabledMessage) && Intrinsics.e(this.continuousModeEnabledMessage, sparkScanToastSettings.continuousModeEnabledMessage) && Intrinsics.e(this.continuousModeDisabledMessage, sparkScanToastSettings.continuousModeDisabledMessage) && Intrinsics.e(this.scanPausedMessage, sparkScanToastSettings.scanPausedMessage) && Intrinsics.e(this.zoomedInMessage, sparkScanToastSettings.zoomedInMessage) && Intrinsics.e(this.zoomedOutMessage, sparkScanToastSettings.zoomedOutMessage) && Intrinsics.e(this.torchEnabledMessage, sparkScanToastSettings.torchEnabledMessage) && Intrinsics.e(this.torchDisabledMessage, sparkScanToastSettings.torchDisabledMessage) && Intrinsics.e(this.userFacingCameraEnabledMessage, sparkScanToastSettings.userFacingCameraEnabledMessage) && Intrinsics.e(this.worldFacingCameraEnabledMessage, sparkScanToastSettings.worldFacingCameraEnabledMessage);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.toastEnabled) * 31;
        Integer num = this.toastBackgroundColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.toastTextColor;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.targetModeEnabledMessage;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetModeDisabledMessage;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.continuousModeEnabledMessage;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.continuousModeDisabledMessage;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scanPausedMessage;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zoomedInMessage;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zoomedOutMessage;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.torchEnabledMessage;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.torchDisabledMessage;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.userFacingCameraEnabledMessage;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.worldFacingCameraEnabledMessage;
        return iHashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "SparkScanToastSettings(toastEnabled=" + this.toastEnabled + ", toastBackgroundColor=" + this.toastBackgroundColor + ", toastTextColor=" + this.toastTextColor + ", targetModeEnabledMessage=" + this.targetModeEnabledMessage + ", targetModeDisabledMessage=" + this.targetModeDisabledMessage + ", continuousModeEnabledMessage=" + this.continuousModeEnabledMessage + ", continuousModeDisabledMessage=" + this.continuousModeDisabledMessage + ", scanPausedMessage=" + this.scanPausedMessage + ", zoomedInMessage=" + this.zoomedInMessage + ", zoomedOutMessage=" + this.zoomedOutMessage + ", torchEnabledMessage=" + this.torchEnabledMessage + ", torchDisabledMessage=" + this.torchDisabledMessage + ", userFacingCameraEnabledMessage=" + this.userFacingCameraEnabledMessage + ", worldFacingCameraEnabledMessage=" + this.worldFacingCameraEnabledMessage + ')';
    }

    public SparkScanToastSettings(boolean z10, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.toastEnabled = z10;
        this.toastBackgroundColor = num;
        this.toastTextColor = num2;
        this.targetModeEnabledMessage = str;
        this.targetModeDisabledMessage = str2;
        this.continuousModeEnabledMessage = str3;
        this.continuousModeDisabledMessage = str4;
        this.scanPausedMessage = str5;
        this.zoomedInMessage = str6;
        this.zoomedOutMessage = str7;
        this.torchEnabledMessage = str8;
        this.torchDisabledMessage = str9;
        this.userFacingCameraEnabledMessage = str10;
        this.worldFacingCameraEnabledMessage = str11;
        this.toastDuration = TimeInterval.INSTANCE.millis(1500L);
    }

    public final String getContinuousModeDisabledMessage() {
        return this.continuousModeDisabledMessage;
    }

    public final String getContinuousModeEnabledMessage() {
        return this.continuousModeEnabledMessage;
    }

    public final String getScanPausedMessage() {
        return this.scanPausedMessage;
    }

    public final String getTargetModeDisabledMessage() {
        return this.targetModeDisabledMessage;
    }

    public final String getTargetModeEnabledMessage() {
        return this.targetModeEnabledMessage;
    }

    public final Integer getToastBackgroundColor() {
        return this.toastBackgroundColor;
    }

    /* renamed from: getToastDuration$scandit_barcode_capture, reason: from getter */
    public final TimeInterval getToastDuration() {
        return this.toastDuration;
    }

    public final boolean getToastEnabled() {
        return this.toastEnabled;
    }

    public final Integer getToastTextColor() {
        return this.toastTextColor;
    }

    public final String getTorchDisabledMessage() {
        return this.torchDisabledMessage;
    }

    public final String getTorchEnabledMessage() {
        return this.torchEnabledMessage;
    }

    public final String getUserFacingCameraEnabledMessage() {
        return this.userFacingCameraEnabledMessage;
    }

    public final String getWorldFacingCameraEnabledMessage() {
        return this.worldFacingCameraEnabledMessage;
    }

    public final String getZoomedInMessage() {
        return this.zoomedInMessage;
    }

    public final String getZoomedOutMessage() {
        return this.zoomedOutMessage;
    }

    public final void setContinuousModeDisabledMessage(String str) {
        this.continuousModeDisabledMessage = str;
    }

    public final void setContinuousModeEnabledMessage(String str) {
        this.continuousModeEnabledMessage = str;
    }

    public final void setScanPausedMessage(String str) {
        this.scanPausedMessage = str;
    }

    public final void setTargetModeDisabledMessage(String str) {
        this.targetModeDisabledMessage = str;
    }

    public final void setTargetModeEnabledMessage(String str) {
        this.targetModeEnabledMessage = str;
    }

    public final void setToastBackgroundColor(Integer num) {
        this.toastBackgroundColor = num;
    }

    public final void setToastDuration$scandit_barcode_capture(TimeInterval timeInterval) {
        Intrinsics.j(timeInterval, "<set-?>");
        this.toastDuration = timeInterval;
    }

    public final void setToastEnabled(boolean z10) {
        this.toastEnabled = z10;
    }

    public final void setToastTextColor(Integer num) {
        this.toastTextColor = num;
    }

    public final void setTorchDisabledMessage(String str) {
        this.torchDisabledMessage = str;
    }

    public final void setTorchEnabledMessage(String str) {
        this.torchEnabledMessage = str;
    }

    public final void setUserFacingCameraEnabledMessage(String str) {
        this.userFacingCameraEnabledMessage = str;
    }

    public final void setWorldFacingCameraEnabledMessage(String str) {
        this.worldFacingCameraEnabledMessage = str;
    }

    public final void setZoomedInMessage(String str) {
        this.zoomedInMessage = str;
    }

    public final void setZoomedOutMessage(String str) {
        this.zoomedOutMessage = str;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("toastEnabled", this.toastEnabled);
        Integer num = this.toastBackgroundColor;
        if (num != null) {
            jSONObject.put("toastBackgroundColor", ColorExtensionsKt.toColorJsonValue(num.intValue()));
        }
        Integer num2 = this.toastTextColor;
        if (num2 != null) {
            jSONObject.put("toastTextColor", ColorExtensionsKt.toColorJsonValue(num2.intValue()));
        }
        jSONObject.put("targetModeEnabledMessage", this.targetModeEnabledMessage);
        jSONObject.put("targetModeDisabledMessage", this.targetModeDisabledMessage);
        jSONObject.put("continuousModeEnabledMessage", this.continuousModeEnabledMessage);
        jSONObject.put("continuousModeDisabledMessage", this.continuousModeDisabledMessage);
        jSONObject.put("scanPausedMessage", this.scanPausedMessage);
        jSONObject.put("zoomedInMessage", this.zoomedInMessage);
        jSONObject.put("zoomedOutMessage", this.zoomedOutMessage);
        jSONObject.put("torchEnabledMessage", this.torchEnabledMessage);
        jSONObject.put("torchDisabledMessage", this.torchDisabledMessage);
        jSONObject.put("userFacingCameraEnabledMessage", this.userFacingCameraEnabledMessage);
        jSONObject.put("worldFacingCameraEnabledMessage", this.worldFacingCameraEnabledMessage);
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public /* synthetic */ SparkScanToastSettings(boolean z10, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? SparkScanViewDefaults.getDefaultToastEnabled() : z10, (i10 & 2) != 0 ? SparkScanViewDefaults.getDefaultToastBackgroundColor() : num, (i10 & 4) != 0 ? SparkScanViewDefaults.getDefaultToastTextColor() : num2, (i10 & 8) != 0 ? SparkScanViewDefaults.getDefaultTargetModeEnabledMessage() : str, (i10 & 16) != 0 ? SparkScanViewDefaults.getDefaultTargetModeDisabledMessage() : str2, (i10 & 32) != 0 ? SparkScanViewDefaults.getDefaultContinuousModeEnabledMessage() : str3, (i10 & 64) != 0 ? SparkScanViewDefaults.getDefaultContinuousModeDisabledMessage() : str4, (i10 & 128) != 0 ? SparkScanViewDefaults.getDefaultScanPausedMessage() : str5, (i10 & 256) != 0 ? SparkScanViewDefaults.getDefaultZoomedInMessage() : str6, (i10 & 512) != 0 ? SparkScanViewDefaults.getDefaultZoomedOutMessage() : str7, (i10 & 1024) != 0 ? SparkScanViewDefaults.getDefaultTorchEnabledMessage() : str8, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? SparkScanViewDefaults.getDefaultTorchDisabledMessage() : str9, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? SparkScanViewDefaults.getDefaultUserFacingCameraEnabledMessage() : str10, (i10 & 8192) != 0 ? SparkScanViewDefaults.getDefaultWorldFacingCameraEnabledMessage() : str11);
    }
}
