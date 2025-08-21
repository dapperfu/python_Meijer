package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class f6 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<g6> f92876a;

    /* renamed from: b, reason: collision with root package name */
    private String f92877b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f92878c;

    /* renamed from: d, reason: collision with root package name */
    private String f92879d;

    public f6() {
    }

    public String a() {
        return this.f92879d;
    }

    public String b() {
        return this.f92877b;
    }

    public ArrayList<g6> c() {
        return this.f92876a;
    }

    public boolean d() {
        return this.f92878c;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            return "{\"rulesStatus\":" + ModelFactory.getInstance().rulesAsJsoString(this.f92876a) + ",\"cuuidPath\":" + l3.c(this.f92877b) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    protected f6(JSONObject jSONObject) {
        try {
            if (jSONObject.has("rulesStatus") && !jSONObject.isNull("rulesStatus") && (jSONObject.get("rulesStatus") instanceof JSONArray)) {
                this.f92876a = ModelFactory.getInstance().getRulesArray(jSONObject.getJSONArray("rulesStatus"));
            }
            if (!jSONObject.has("cuuidPath") || jSONObject.isNull("cuuidPath")) {
                return;
            }
            this.f92877b = jSONObject.getString("cuuidPath");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    public void a(String str) {
        this.f92879d = str;
    }

    public void a(boolean z10) {
        this.f92878c = z10;
    }
}
