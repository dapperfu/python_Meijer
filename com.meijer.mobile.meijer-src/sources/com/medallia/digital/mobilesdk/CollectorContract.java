package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class CollectorContract {
    private Boolean enabled;
    private Integer frequency;
    private Lifetime lifetime;

    protected CollectorContract(Boolean bool, Integer num, Lifetime lifetime) {
        this.enabled = bool;
        this.frequency = num;
        this.lifetime = lifetime;
    }

    protected Integer getFrequency() {
        return this.frequency;
    }

    protected Lifetime getLifetime() {
        return this.lifetime;
    }

    protected Boolean isEnabled() {
        return this.enabled;
    }

    protected CollectorContract setEnabled(boolean z10) {
        this.enabled = Boolean.valueOf(z10);
        return this;
    }

    protected String toJsonString() {
        String str;
        String str2;
        try {
            if (this.lifetime == null) {
                str = com.google.maps.android.BuildConfig.TRAVIS;
            } else {
                str = "\"" + this.lifetime + "\"";
            }
            if (this.frequency == null) {
                str2 = "";
            } else {
                str2 = ",\"frequency\":" + this.frequency;
            }
            return "{\"enabled\":" + this.enabled + str2 + ",\"lifetime\":" + str + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    CollectorContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("enabled") && !jSONObject.isNull("enabled")) {
                this.enabled = Boolean.valueOf(jSONObject.getBoolean("enabled"));
            }
            if (jSONObject.has("frequency") && !jSONObject.isNull("frequency")) {
                this.frequency = Integer.valueOf(jSONObject.getInt("frequency"));
            }
            if (!jSONObject.has("lifetime") || jSONObject.isNull("lifetime")) {
                return;
            }
            this.lifetime = Lifetime.fromString(jSONObject.getString("lifetime"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
