package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class y3 extends e0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f94454a;

    /* renamed from: b, reason: collision with root package name */
    private ResourceContract f94455b;

    /* renamed from: c, reason: collision with root package name */
    private ResourceContract f94456c;

    /* renamed from: d, reason: collision with root package name */
    private String f94457d;

    /* renamed from: e, reason: collision with root package name */
    private String f94458e;

    /* renamed from: f, reason: collision with root package name */
    private String f94459f;

    y3(ArrayList<String> arrayList, ResourceContract resourceContract, String str, String str2, String str3) {
        this.f94454a = arrayList;
        this.f94455b = resourceContract;
        this.f94457d = str;
        this.f94458e = str2;
        this.f94459f = str3;
    }

    ArrayList<String> a() {
        return this.f94454a;
    }

    String b() {
        return this.f94459f;
    }

    String c() {
        return this.f94457d;
    }

    String d() {
        return this.f94458e;
    }

    ResourceContract e() {
        return this.f94455b;
    }

    ResourceContract f() {
        return this.f94456c;
    }

    protected String toJsonString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{\"availableLanguages\":");
        sb2.append(ModelFactory.getInstance().getStringArrayAsJsonString(this.f94454a));
        sb2.append(",\"resource\":");
        ResourceContract resourceContract = this.f94455b;
        sb2.append(resourceContract == null ? null : resourceContract.toJsonString());
        sb2.append(",\"staticResource\":");
        ResourceContract resourceContract2 = this.f94456c;
        sb2.append(resourceContract2 != null ? resourceContract2.toJsonString() : null);
        sb2.append(",\"fileNamePattern\":");
        sb2.append(l3.c(this.f94457d));
        sb2.append(",\"localePlaceHolderInPattern\":");
        sb2.append(l3.c(this.f94458e));
        sb2.append(",\"defaultLocaleName\":");
        sb2.append(l3.c(this.f94459f));
        sb2.append("}");
        return sb2.toString();
    }

    y3(JSONObject jSONObject) {
        try {
            if (jSONObject.has("availableLanguages") && !jSONObject.isNull("availableLanguages")) {
                this.f94454a = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("availableLanguages"));
            }
            if (jSONObject.has("resource") && !jSONObject.isNull("resource")) {
                this.f94455b = new ResourceContract(jSONObject.getJSONObject("resource"));
            }
            if (jSONObject.has("staticResource") && !jSONObject.isNull("staticResource")) {
                this.f94456c = new ResourceContract(jSONObject.getJSONObject("staticResource"));
            }
            if (jSONObject.has("fileNamePattern") && !jSONObject.isNull("fileNamePattern")) {
                this.f94457d = jSONObject.getString("fileNamePattern");
            }
            if (jSONObject.has("localePlaceHolderInPattern") && !jSONObject.isNull("localePlaceHolderInPattern")) {
                this.f94458e = jSONObject.getString("localePlaceHolderInPattern");
            }
            if (!jSONObject.has("defaultLocaleName") || jSONObject.isNull("defaultLocaleName")) {
                return;
            }
            this.f94459f = jSONObject.getString("defaultLocaleName");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
