package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class TargetRuleEngineContract extends e0 {
    private String url;
    private String version;

    protected TargetRuleEngineContract(String str, String str2) {
        this.url = str;
        this.version = str2;
    }

    protected String getUrl() {
        return this.url;
    }

    protected String getVersion() {
        return this.version;
    }

    protected String toJsonString() {
        try {
            return "{\"url\":" + l3.c(this.url) + ",\"version\":" + l3.c(this.version) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    protected TargetRuleEngineContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("url") && !jSONObject.isNull("url")) {
                this.url = jSONObject.getString("url");
            }
            if (!jSONObject.has("version") || jSONObject.isNull("version")) {
                return;
            }
            this.version = jSONObject.getString("version");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
