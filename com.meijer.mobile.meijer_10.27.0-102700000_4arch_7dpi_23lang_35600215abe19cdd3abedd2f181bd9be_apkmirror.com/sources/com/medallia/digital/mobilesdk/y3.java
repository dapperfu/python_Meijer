package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class y3 extends e0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f93615a;

    /* renamed from: b, reason: collision with root package name */
    private ResourceContract f93616b;

    /* renamed from: c, reason: collision with root package name */
    private ResourceContract f93617c;

    /* renamed from: d, reason: collision with root package name */
    private String f93618d;

    /* renamed from: e, reason: collision with root package name */
    private String f93619e;

    /* renamed from: f, reason: collision with root package name */
    private String f93620f;

    y3(ArrayList<String> arrayList, ResourceContract resourceContract, String str, String str2, String str3) {
        this.f93615a = arrayList;
        this.f93616b = resourceContract;
        this.f93618d = str;
        this.f93619e = str2;
        this.f93620f = str3;
    }

    ArrayList<String> a() {
        return this.f93615a;
    }

    String b() {
        return this.f93620f;
    }

    String c() {
        return this.f93618d;
    }

    String d() {
        return this.f93619e;
    }

    ResourceContract e() {
        return this.f93616b;
    }

    ResourceContract f() {
        return this.f93617c;
    }

    protected String toJsonString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{\"availableLanguages\":");
        sb2.append(ModelFactory.getInstance().getStringArrayAsJsonString(this.f93615a));
        sb2.append(",\"resource\":");
        ResourceContract resourceContract = this.f93616b;
        sb2.append(resourceContract == null ? null : resourceContract.toJsonString());
        sb2.append(",\"staticResource\":");
        ResourceContract resourceContract2 = this.f93617c;
        sb2.append(resourceContract2 != null ? resourceContract2.toJsonString() : null);
        sb2.append(",\"fileNamePattern\":");
        sb2.append(l3.c(this.f93618d));
        sb2.append(",\"localePlaceHolderInPattern\":");
        sb2.append(l3.c(this.f93619e));
        sb2.append(",\"defaultLocaleName\":");
        sb2.append(l3.c(this.f93620f));
        sb2.append("}");
        return sb2.toString();
    }

    y3(JSONObject jSONObject) {
        try {
            if (jSONObject.has("availableLanguages") && !jSONObject.isNull("availableLanguages")) {
                this.f93615a = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("availableLanguages"));
            }
            if (jSONObject.has("resource") && !jSONObject.isNull("resource")) {
                this.f93616b = new ResourceContract(jSONObject.getJSONObject("resource"));
            }
            if (jSONObject.has("staticResource") && !jSONObject.isNull("staticResource")) {
                this.f93617c = new ResourceContract(jSONObject.getJSONObject("staticResource"));
            }
            if (jSONObject.has("fileNamePattern") && !jSONObject.isNull("fileNamePattern")) {
                this.f93618d = jSONObject.getString("fileNamePattern");
            }
            if (jSONObject.has("localePlaceHolderInPattern") && !jSONObject.isNull("localePlaceHolderInPattern")) {
                this.f93619e = jSONObject.getString("localePlaceHolderInPattern");
            }
            if (!jSONObject.has("defaultLocaleName") || jSONObject.isNull("defaultLocaleName")) {
                return;
            }
            this.f93620f = jSONObject.getString("defaultLocaleName");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
