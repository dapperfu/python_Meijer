package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class ConfigurationUUID {
    private String ocqUuid;
    private String url;
    private String uuid;

    ConfigurationUUID(JSONObject jSONObject) {
        try {
            if (jSONObject.has("url")) {
                this.url = jSONObject.getString("url");
            }
            if (jSONObject.has("uuid")) {
                this.uuid = jSONObject.getString("uuid");
            }
            if (jSONObject.has("ocqUUID")) {
                this.ocqUuid = jSONObject.getString("ocqUUID");
            }
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    protected String getOcqUuid() {
        return this.ocqUuid;
    }

    protected String getUrl() {
        return this.url;
    }

    protected String getUuid() {
        return this.uuid;
    }

    protected String toJsonString() {
        try {
            return "{\"url\":" + l3.c(this.url) + ",\"uuid\":" + l3.c(this.uuid) + ",\"ocqUUID\":" + l3.c(this.ocqUuid) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
