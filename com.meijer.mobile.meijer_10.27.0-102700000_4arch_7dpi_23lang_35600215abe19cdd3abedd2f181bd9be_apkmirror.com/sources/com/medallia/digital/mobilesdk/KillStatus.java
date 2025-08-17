package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class KillStatus {
    private Boolean isKilled;
    private Long restorePollingInterval;
    private Boolean shouldCheckRestoreOnOsChange;

    KillStatus() {
    }

    protected Long getRestorePollingInterval() {
        return this.restorePollingInterval;
    }

    protected Boolean getShouldCheckRestoreOnOsChange() {
        return this.shouldCheckRestoreOnOsChange;
    }

    protected Boolean isKilled() {
        return this.isKilled;
    }

    protected String toJsonString() {
        try {
            return "{\"isKilled\":" + this.isKilled + ",\"restorePollingInterval\":" + this.restorePollingInterval + ",\"shouldCheckRestoreOnOsChange\":" + this.shouldCheckRestoreOnOsChange + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    KillStatus(Boolean bool, Long l10, Boolean bool2) {
        this.isKilled = bool;
        this.restorePollingInterval = l10;
        this.shouldCheckRestoreOnOsChange = bool2;
    }

    KillStatus(JSONObject jSONObject) {
        try {
            if (jSONObject.has("isKilled") && !jSONObject.isNull("isKilled")) {
                this.isKilled = Boolean.valueOf(jSONObject.getBoolean("isKilled"));
            }
            if (jSONObject.has("restorePollingInterval") && !jSONObject.isNull("restorePollingInterval")) {
                this.restorePollingInterval = Long.valueOf(jSONObject.getLong("restorePollingInterval"));
            }
            if (!jSONObject.has("shouldCheckRestoreOnOsChange") || jSONObject.isNull("shouldCheckRestoreOnOsChange")) {
                return;
            }
            this.shouldCheckRestoreOnOsChange = Boolean.valueOf(jSONObject.getBoolean("shouldCheckRestoreOnOsChange"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
