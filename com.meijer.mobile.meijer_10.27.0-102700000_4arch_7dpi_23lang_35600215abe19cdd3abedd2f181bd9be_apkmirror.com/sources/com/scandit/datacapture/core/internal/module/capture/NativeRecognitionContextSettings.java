package com.scandit.datacapture.core.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeRecognitionContextSettings {
    final String applicationId;
    final boolean delayedRegistration;
    final String deviceId;
    final String deviceModelName;
    final String deviceName;
    final String externalId;
    final String frameworkName;
    final String licenseKey;
    final String platform;
    final String platformVersion;
    final ArrayList<String> signatureHashes;
    final String writableAbsolutePath;

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeRecognitionContextSettings)) {
            return false;
        }
        NativeRecognitionContextSettings nativeRecognitionContextSettings = (NativeRecognitionContextSettings) obj;
        return this.licenseKey.equals(nativeRecognitionContextSettings.licenseKey) && this.writableAbsolutePath.equals(nativeRecognitionContextSettings.writableAbsolutePath) && this.platform.equals(nativeRecognitionContextSettings.platform) && this.platformVersion.equals(nativeRecognitionContextSettings.platformVersion) && this.frameworkName.equals(nativeRecognitionContextSettings.frameworkName) && this.deviceModelName.equals(nativeRecognitionContextSettings.deviceModelName) && this.applicationId.equals(nativeRecognitionContextSettings.applicationId) && this.deviceName.equals(nativeRecognitionContextSettings.deviceName) && this.deviceId.equals(nativeRecognitionContextSettings.deviceId) && this.externalId.equals(nativeRecognitionContextSettings.externalId) && this.signatureHashes.equals(nativeRecognitionContextSettings.signatureHashes) && this.delayedRegistration == nativeRecognitionContextSettings.delayedRegistration;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public boolean getDelayedRegistration() {
        return this.delayedRegistration;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceModelName() {
        return this.deviceModelName;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getFrameworkName() {
        return this.frameworkName;
    }

    public String getLicenseKey() {
        return this.licenseKey;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    public ArrayList<String> getSignatureHashes() {
        return this.signatureHashes;
    }

    public String getWritableAbsolutePath() {
        return this.writableAbsolutePath;
    }

    public int hashCode() {
        return ((this.signatureHashes.hashCode() + ((this.externalId.hashCode() + ((this.deviceId.hashCode() + ((this.deviceName.hashCode() + ((this.applicationId.hashCode() + ((this.deviceModelName.hashCode() + ((this.frameworkName.hashCode() + ((this.platformVersion.hashCode() + ((this.platform.hashCode() + ((this.writableAbsolutePath.hashCode() + ((this.licenseKey.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.delayedRegistration ? 1 : 0);
    }

    public String toString() {
        return "NativeRecognitionContextSettings{licenseKey=" + this.licenseKey + ",writableAbsolutePath=" + this.writableAbsolutePath + ",platform=" + this.platform + ",platformVersion=" + this.platformVersion + ",frameworkName=" + this.frameworkName + ",deviceModelName=" + this.deviceModelName + ",applicationId=" + this.applicationId + ",deviceName=" + this.deviceName + ",deviceId=" + this.deviceId + ",externalId=" + this.externalId + ",signatureHashes=" + this.signatureHashes + ",delayedRegistration=" + this.delayedRegistration + "}";
    }

    public NativeRecognitionContextSettings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList<String> arrayList, boolean z10) {
        this.licenseKey = str;
        this.writableAbsolutePath = str2;
        this.platform = str3;
        this.platformVersion = str4;
        this.frameworkName = str5;
        this.deviceModelName = str6;
        this.applicationId = str7;
        this.deviceName = str8;
        this.deviceId = str9;
        this.externalId = str10;
        this.signatureHashes = arrayList;
        this.delayedRegistration = z10;
    }
}
