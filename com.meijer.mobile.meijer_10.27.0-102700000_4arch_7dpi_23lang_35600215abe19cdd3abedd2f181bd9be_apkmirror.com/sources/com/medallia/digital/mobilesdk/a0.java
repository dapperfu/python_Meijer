package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f91595a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f91596b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f91597c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f91598d;

    a0() {
    }

    public Integer a() {
        return this.f91595a;
    }

    public Integer b() {
        return this.f91596b;
    }

    public Integer c() {
        return this.f91598d;
    }

    public boolean d() {
        return this.f91597c;
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
                this.f91595a = Integer.valueOf(jSONObject.getInt("maxRecordsToSubmit"));
            }
            if (jSONObject.has("maxRecursiveSubmits") && !jSONObject.isNull("maxRecursiveSubmits")) {
                this.f91596b = Integer.valueOf(jSONObject.getInt("maxRecursiveSubmits"));
            }
            if (jSONObject.has("isSamplingEnabled") && !jSONObject.isNull("isSamplingEnabled")) {
                this.f91597c = jSONObject.getBoolean("isSamplingEnabled");
            }
            if (!jSONObject.has("samplePercent") || jSONObject.isNull("samplePercent")) {
                return;
            }
            this.f91598d = Integer.valueOf(jSONObject.getInt("samplePercent"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
