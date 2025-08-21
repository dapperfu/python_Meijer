package com.medallia.digital.mobilesdk;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class r1 extends a0 {

    /* renamed from: e, reason: collision with root package name */
    private String f93610e;

    /* renamed from: f, reason: collision with root package name */
    private HashMap<String, String> f93611f;

    r1(JSONObject jSONObject) {
        super(jSONObject);
        try {
            if (jSONObject.has("submitEventsEndpoint") && !jSONObject.isNull("submitEventsEndpoint")) {
                this.f93610e = jSONObject.getString("submitEventsEndpoint");
            }
            if (!jSONObject.has("headers") || jSONObject.isNull("headers")) {
                return;
            }
            this.f93611f = ModelFactory.getInstance().getStringMap(jSONObject.getJSONObject("headers"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.a0
    public /* bridge */ /* synthetic */ Integer a() {
        return super.a();
    }

    @Override // com.medallia.digital.mobilesdk.a0
    public /* bridge */ /* synthetic */ Integer b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.a0
    public /* bridge */ /* synthetic */ Integer c() {
        return super.c();
    }

    @Override // com.medallia.digital.mobilesdk.a0
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // com.medallia.digital.mobilesdk.a0
    String e() {
        try {
            return "{\"maxRecordsToSubmit\":" + a() + ",\"maxRecursiveSubmits\":" + b() + ",\"isSamplingEnabled\":" + d() + ",\"samplePercent\":" + c() + ",\"submitEventsEndpoint\":" + l3.c(g()) + ",\"headers\":" + ModelFactory.getInstance().getStringMapAsJsonString(this.f93611f) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public HashMap<String, String> f() {
        return this.f93611f;
    }

    public String g() {
        return this.f93610e;
    }
}
