package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f6 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<g6> f92037a;

    /* renamed from: b, reason: collision with root package name */
    private String f92038b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f92039c;

    /* renamed from: d, reason: collision with root package name */
    private String f92040d;

    public f6() {
    }

    public String a() {
        return this.f92040d;
    }

    public String b() {
        return this.f92038b;
    }

    public ArrayList<g6> c() {
        return this.f92037a;
    }

    public boolean d() {
        return this.f92039c;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            return "{\"rulesStatus\":" + ModelFactory.getInstance().rulesAsJsoString(this.f92037a) + ",\"cuuidPath\":" + l3.c(this.f92038b) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    protected f6(JSONObject jSONObject) {
        try {
            if (jSONObject.has("rulesStatus") && !jSONObject.isNull("rulesStatus") && (jSONObject.get("rulesStatus") instanceof JSONArray)) {
                this.f92037a = ModelFactory.getInstance().getRulesArray(jSONObject.getJSONArray("rulesStatus"));
            }
            if (!jSONObject.has("cuuidPath") || jSONObject.isNull("cuuidPath")) {
                return;
            }
            this.f92038b = jSONObject.getString("cuuidPath");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    public void a(String str) {
        this.f92040d = str;
    }

    public void a(boolean z10) {
        this.f92039c = z10;
    }
}
