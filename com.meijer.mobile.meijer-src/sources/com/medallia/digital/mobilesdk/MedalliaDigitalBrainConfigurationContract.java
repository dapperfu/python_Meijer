package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class MedalliaDigitalBrainConfigurationContract extends e0 {
    private Long androidBackoffDelay;
    private boolean canBlockAfterOneSuccess;
    private boolean evaluateWithConfigurationFile;
    private Long formDisplayTimeout;
    private boolean isBlackBoxEnabled;
    private boolean isBridgeSDKIntegrationEnabled;
    private boolean isCrashlyticsInjectionCustomKeysEnabled;
    private boolean isDistinct;
    private boolean isFeedbackSubmitIndicatorEnabled;
    private boolean isSessionPercentageSupportDouble;
    private boolean isTREV2Enabled;
    private Double maxDbFileSizeInMb;
    private Integer maxTableRecordsBeforeClean;
    private long maxUserJourneyEventsSize;
    private Long offlineConfigurationExpirationTime;
    private boolean removeTaskContainingFormActivityOnly;
    private boolean requestMediaCapturePermissions;
    private Long sessionInactivityTime;
    private boolean skipSetUnattachedCustomParams;

    MedalliaDigitalBrainConfigurationContract() {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.isCrashlyticsInjectionCustomKeysEnabled = true;
        this.isFeedbackSubmitIndicatorEnabled = true;
    }

    protected Long getAndroidBackoffDelay() {
        return this.androidBackoffDelay;
    }

    protected Long getFormDisplayTimeout() {
        return this.formDisplayTimeout;
    }

    protected Double getMaxDbFileSizeInMb() {
        return this.maxDbFileSizeInMb;
    }

    protected Integer getMaxTableRecordsBeforeClean() {
        return this.maxTableRecordsBeforeClean;
    }

    protected long getMaxUserJourneyEventsSize() {
        return this.maxUserJourneyEventsSize;
    }

    protected Long getOfflineConfigurationExpirationTime() {
        return this.offlineConfigurationExpirationTime;
    }

    protected Long getSessionInactivityTime() {
        return this.sessionInactivityTime;
    }

    protected boolean isBlackBoxEnabled() {
        return this.isBlackBoxEnabled;
    }

    public boolean isBridgeSDKIntegrationEnabled() {
        return this.isBridgeSDKIntegrationEnabled;
    }

    protected boolean isCanBlockAfterOneSuccess() {
        return this.canBlockAfterOneSuccess;
    }

    public boolean isCrashlyticsInjectionCustomKeysEnabled() {
        return this.isCrashlyticsInjectionCustomKeysEnabled;
    }

    protected boolean isDistinct() {
        return this.isDistinct;
    }

    protected boolean isEvaluateWithConfigurationFile() {
        return this.evaluateWithConfigurationFile;
    }

    public boolean isFeedbackSubmitIndicatorEnabled() {
        return this.isFeedbackSubmitIndicatorEnabled;
    }

    public boolean isRemoveTaskContainingFormActivityOnly() {
        return this.removeTaskContainingFormActivityOnly;
    }

    public boolean isRequestMediaCapturePermissions() {
        return this.requestMediaCapturePermissions;
    }

    public boolean isSessionPercentageSupportDouble() {
        return this.isSessionPercentageSupportDouble;
    }

    public boolean isSkipSetUnattachedCustomParams() {
        return this.skipSetUnattachedCustomParams;
    }

    protected boolean isTREV2Enabled() {
        return this.isTREV2Enabled;
    }

    protected void setAndroidBackoffDelay(Long l10) {
        this.androidBackoffDelay = l10;
    }

    protected String toJsonString() {
        try {
            return "{\"sessionInactivityTime\":" + this.sessionInactivityTime + ",\"formDisplayTimeout\":" + this.formDisplayTimeout + ",\"offlineConfigurationExpirationTime\":" + this.offlineConfigurationExpirationTime + ",\"isDistinct\":" + this.isDistinct + ",\"canBlockAfterOneSuccess\":" + this.canBlockAfterOneSuccess + ",\"maxUserJourneyEventsSize\":" + this.maxUserJourneyEventsSize + ",\"isBlackBoxEnabled\":" + this.isBlackBoxEnabled + ",\"evaluateWithConfigurationFile\":" + this.evaluateWithConfigurationFile + ",\"isTREV2Enabled\":" + this.isTREV2Enabled + ",\"requestMediaCapturePermissions\":" + this.requestMediaCapturePermissions + ",\"androidBackoffDelay\":" + this.androidBackoffDelay + ",\"isFeedbackSubmitIndicatorEnabled\":" + this.isFeedbackSubmitIndicatorEnabled + ",\"isSessionPercentageSupportDouble\":" + this.isSessionPercentageSupportDouble + ",\"maxDbFileSizeInMb\":" + this.maxDbFileSizeInMb + ",\"maxTableRecordsBeforeClean\":" + this.maxTableRecordsBeforeClean + ",\"skipSetUnattachedCustomParams\":" + this.skipSetUnattachedCustomParams + ",\"androidRemoveTaskContainingFormActivityOnly\":" + this.removeTaskContainingFormActivityOnly + ",\"isBridgeSDKIntegrationEnabled\":" + this.isBridgeSDKIntegrationEnabled + ",\"isCrashlyticsInjectionCustomKeysEnabled\":" + this.isCrashlyticsInjectionCustomKeysEnabled + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    MedalliaDigitalBrainConfigurationContract(long j10) {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.isCrashlyticsInjectionCustomKeysEnabled = true;
        this.sessionInactivityTime = Long.valueOf(j10);
    }

    MedalliaDigitalBrainConfigurationContract(long j10, boolean z10, boolean z11) {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.isCrashlyticsInjectionCustomKeysEnabled = true;
        this.sessionInactivityTime = Long.valueOf(j10);
        this.isDistinct = z10;
        this.canBlockAfterOneSuccess = z11;
    }

    MedalliaDigitalBrainConfigurationContract(JSONObject jSONObject) {
        this.isBlackBoxEnabled = true;
        this.requestMediaCapturePermissions = true;
        this.isCrashlyticsInjectionCustomKeysEnabled = true;
        try {
            if (jSONObject.has("sessionInactivityTime") && !jSONObject.isNull("sessionInactivityTime")) {
                this.sessionInactivityTime = Long.valueOf(jSONObject.getLong("sessionInactivityTime"));
            }
            if (jSONObject.has("formDisplayTimeout") && !jSONObject.isNull("formDisplayTimeout")) {
                this.formDisplayTimeout = Long.valueOf(jSONObject.getLong("formDisplayTimeout"));
            }
            if (jSONObject.has("offlineConfigurationExpirationTime") && !jSONObject.isNull("offlineConfigurationExpirationTime")) {
                this.offlineConfigurationExpirationTime = Long.valueOf(jSONObject.getLong("offlineConfigurationExpirationTime"));
            }
            if (jSONObject.has("isDistinct") && !jSONObject.isNull("isDistinct")) {
                this.isDistinct = jSONObject.getBoolean("isDistinct");
            }
            if (jSONObject.has("canBlockAfterOneSuccess") && !jSONObject.isNull("canBlockAfterOneSuccess")) {
                this.canBlockAfterOneSuccess = jSONObject.getBoolean("canBlockAfterOneSuccess");
            }
            if (jSONObject.has("maxUserJourneyEventsSize") && !jSONObject.isNull("maxUserJourneyEventsSize")) {
                this.maxUserJourneyEventsSize = jSONObject.getLong("maxUserJourneyEventsSize");
            }
            if (jSONObject.has("isBlackBoxEnabled") && !jSONObject.isNull("isBlackBoxEnabled")) {
                this.isBlackBoxEnabled = jSONObject.getBoolean("isBlackBoxEnabled");
            }
            if (jSONObject.has("evaluateWithConfigurationFile") && !jSONObject.isNull("evaluateWithConfigurationFile")) {
                this.evaluateWithConfigurationFile = jSONObject.getBoolean("evaluateWithConfigurationFile");
            }
            if (jSONObject.has("isTREV2Enabled") && !jSONObject.isNull("isTREV2Enabled")) {
                this.isTREV2Enabled = jSONObject.getBoolean("isTREV2Enabled");
            }
            if (jSONObject.has("requestMediaCapturePermissions") && !jSONObject.isNull("requestMediaCapturePermissions")) {
                this.requestMediaCapturePermissions = jSONObject.getBoolean("requestMediaCapturePermissions");
            }
            if (jSONObject.has("androidBackoffDelay") && !jSONObject.isNull("androidBackoffDelay")) {
                this.androidBackoffDelay = Long.valueOf(jSONObject.getLong("androidBackoffDelay"));
            }
            if (jSONObject.has("isSessionPercentageSupportDouble") && !jSONObject.isNull("isSessionPercentageSupportDouble")) {
                this.isSessionPercentageSupportDouble = jSONObject.getBoolean("isSessionPercentageSupportDouble");
            }
            if (jSONObject.has("maxDbFileSizeInMb") && !jSONObject.isNull("maxDbFileSizeInMb")) {
                this.maxDbFileSizeInMb = Double.valueOf(jSONObject.getDouble("maxDbFileSizeInMb"));
            }
            if (jSONObject.has("maxTableRecordsBeforeClean") && !jSONObject.isNull("maxTableRecordsBeforeClean")) {
                this.maxTableRecordsBeforeClean = Integer.valueOf(jSONObject.getInt("maxTableRecordsBeforeClean"));
            }
            if (!jSONObject.has("isFeedbackSubmitIndicatorEnabled") || jSONObject.isNull("isFeedbackSubmitIndicatorEnabled")) {
                this.isFeedbackSubmitIndicatorEnabled = true;
            } else {
                this.isFeedbackSubmitIndicatorEnabled = jSONObject.getBoolean("isFeedbackSubmitIndicatorEnabled");
            }
            if (jSONObject.has("skipSetUnattachedCustomParams") && !jSONObject.isNull("skipSetUnattachedCustomParams")) {
                this.skipSetUnattachedCustomParams = jSONObject.getBoolean("skipSetUnattachedCustomParams");
            }
            if (jSONObject.has("androidRemoveTaskContainingFormActivityOnly") && !jSONObject.isNull("androidRemoveTaskContainingFormActivityOnly")) {
                this.removeTaskContainingFormActivityOnly = jSONObject.getBoolean("androidRemoveTaskContainingFormActivityOnly");
            }
            if (jSONObject.has("isBridgeSDKIntegrationEnabled") && !jSONObject.isNull("isBridgeSDKIntegrationEnabled")) {
                this.isBridgeSDKIntegrationEnabled = jSONObject.getBoolean("isBridgeSDKIntegrationEnabled");
            }
            if (!jSONObject.has("isCrashlyticsInjectionCustomKeysEnabled") || jSONObject.isNull("isCrashlyticsInjectionCustomKeysEnabled")) {
                return;
            }
            this.isCrashlyticsInjectionCustomKeysEnabled = jSONObject.getBoolean("isCrashlyticsInjectionCustomKeysEnabled");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
