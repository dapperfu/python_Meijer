package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f92434a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f92435b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f92436c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f92437d;

    a0() {
    }

    public Integer a() {
        return this.f92434a;
    }

    public Integer b() {
        return this.f92435b;
    }

    public Integer c() {
        return this.f92437d;
    }

    public boolean d() {
        return this.f92436c;
    }

    String e() {
        try {
            return "{\"maxRecordsToSubmit\":" + a() + ",\"maxRecursiveSubmits\":" + b() + ",\"isSamplingEnabled\":" + d() + ",\"samplePercent\":" + c() + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    a0(JSONObject jSONObject) {
        try {
            if (jSONObject.has("maxRecordsToSubmit") && !jSONObject.isNull("maxRecordsToSubmit")) {
                this.f92434a = Integer.valueOf(jSONObject.getInt("maxRecordsToSubmit"));
            }
            if (jSONObject.has("maxRecursiveSubmits") && !jSONObject.isNull("maxRecursiveSubmits")) {
                this.f92435b = Integer.valueOf(jSONObject.getInt("maxRecursiveSubmits"));
            }
            if (jSONObject.has("isSamplingEnabled") && !jSONObject.isNull("isSamplingEnabled")) {
                this.f92436c = jSONObject.getBoolean("isSamplingEnabled");
            }
            if (!jSONObject.has("samplePercent") || jSONObject.isNull("samplePercent")) {
                return;
            }
            this.f92437d = Integer.valueOf(jSONObject.getInt("samplePercent"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
