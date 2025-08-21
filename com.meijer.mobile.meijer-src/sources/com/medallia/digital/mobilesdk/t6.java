package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class t6 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f93895a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, String> f93896b;

    /* renamed from: c, reason: collision with root package name */
    private int f93897c;

    /* renamed from: d, reason: collision with root package name */
    private int f93898d;

    t6(ArrayList<String> arrayList, HashMap<String, String> map) {
        this.f93897c = 2;
        this.f93898d = 4;
        this.f93895a = arrayList;
        this.f93896b = map;
    }

    protected int a() {
        return this.f93898d;
    }

    protected int b() {
        return this.f93897c;
    }

    protected HashMap<String, String> c() {
        return this.f93896b;
    }

    protected ArrayList<String> d() {
        return this.f93895a;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            String stringArrayAsJsonString = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"versions\":");
            if (this.f93895a != null) {
                stringArrayAsJsonString = ModelFactory.getInstance().getStringArrayAsJsonString(this.f93895a);
            }
            sb2.append(stringArrayAsJsonString);
            sb2.append(",\"messages\":");
            sb2.append(ModelFactory.getInstance().getStringMapAsJsonString(this.f93896b));
            sb2.append(",\"maxSupportedIndex\":");
            sb2.append(this.f93897c);
            sb2.append(",\"maxDeprecatedIndex\":");
            sb2.append(this.f93898d);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    t6(ArrayList<String> arrayList, HashMap<String, String> map, int i10, int i11) {
        this.f93895a = arrayList;
        this.f93896b = map;
        this.f93897c = i10;
        this.f93898d = i11;
    }

    t6(JSONObject jSONObject) {
        this.f93897c = 2;
        this.f93898d = 4;
        try {
            if (jSONObject.has("versions") && !jSONObject.isNull("versions")) {
                this.f93895a = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("versions"));
            }
            if (jSONObject.has("messages") && !jSONObject.isNull("messages")) {
                this.f93896b = ModelFactory.getInstance().getStringMap(jSONObject.getJSONObject("messages"));
            }
            if (jSONObject.has("maxSupportedIndex") && !jSONObject.isNull("maxSupportedIndex")) {
                this.f93897c = jSONObject.getInt("maxSupportedIndex");
            }
            if (!jSONObject.has("maxDeprecatedIndex") || jSONObject.isNull("maxDeprecatedIndex")) {
                return;
            }
            this.f93898d = jSONObject.getInt("maxDeprecatedIndex");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
