package com.medallia.digital.mobilesdk;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class r1 extends a0 {

    /* renamed from: e, reason: collision with root package name */
    private String f92771e;

    /* renamed from: f, reason: collision with root package name */
    private HashMap<String, String> f92772f;

    r1(JSONObject jSONObject) {
        super(jSONObject);
        try {
            if (jSONObject.has("submitEventsEndpoint") && !jSONObject.isNull("submitEventsEndpoint")) {
                this.f92771e = jSONObject.getString("submitEventsEndpoint");
            }
            if (!jSONObject.has("headers") || jSONObject.isNull("headers")) {
                return;
            }
            this.f92772f = ModelFactory.getInstance().getStringMap(jSONObject.getJSONObject("headers"));
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
            return "{\"maxRecordsToSubmit\":" + a() + ",\"maxRecursiveSubmits\":" + b() + ",\"isSamplingEnabled\":" + d() + ",\"samplePercent\":" + c() + ",\"submitEventsEndpoint\":" + l3.c(g()) + ",\"headers\":" + ModelFactory.getInstance().getStringMapAsJsonString(this.f92772f) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public HashMap<String, String> f() {
        return this.f92772f;
    }

    public String g() {
        return this.f92771e;
    }
}
