package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class b5 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f92493a;

    /* renamed from: b, reason: collision with root package name */
    private String f92494b;

    /* renamed from: c, reason: collision with root package name */
    private String f92495c;

    /* renamed from: d, reason: collision with root package name */
    private String f92496d;

    /* renamed from: e, reason: collision with root package name */
    private String f92497e;

    /* renamed from: f, reason: collision with root package name */
    private String f92498f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f92499g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<String> f92500h;

    b5(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.f92493a = str;
        this.f92494b = str2;
        this.f92495c = str3;
        this.f92496d = str4;
        this.f92497e = str5;
        this.f92498f = str6;
        this.f92499g = arrayList;
        this.f92500h = arrayList2;
    }

    public String a() {
        return this.f92495c;
    }

    public String b() {
        return this.f92493a;
    }

    public String c() {
        return this.f92496d;
    }

    public String d() {
        return this.f92494b;
    }

    public ArrayList<String> e() {
        return this.f92499g;
    }

    public String f() {
        return this.f92498f;
    }

    public ArrayList<String> g() {
        return this.f92500h;
    }

    public String h() {
        return this.f92497e;
    }

    String i() {
        try {
            return "{\"channelId\":" + l3.c(this.f92493a) + ",\"domain\":" + l3.c(this.f92494b) + ",\"apiKey\":" + l3.c(this.f92495c) + ",\"channelUrlsPrefix\":" + l3.c(this.f92496d) + ",\"uploadUrlSuffix\":" + l3.c(this.f92497e) + ",\"presignedUrlSuffix\":" + l3.c(this.f92498f) + ",\"namedFilters\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.f92499g) + ",\"unSupportedVideoFormats\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.f92500h) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    b5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("channelId") && !jSONObject.isNull("channelId")) {
                this.f92493a = jSONObject.getString("channelId");
            }
            if (jSONObject.has("domain") && !jSONObject.isNull("domain")) {
                this.f92494b = jSONObject.getString("domain");
            }
            if (jSONObject.has("apiKey") && !jSONObject.isNull("apiKey")) {
                this.f92495c = jSONObject.getString("apiKey");
            }
            if (jSONObject.has("channelUrlsPrefix") && !jSONObject.isNull("channelUrlsPrefix")) {
                this.f92496d = jSONObject.getString("channelUrlsPrefix");
            }
            if (jSONObject.has("uploadUrlSuffix") && !jSONObject.isNull("uploadUrlSuffix")) {
                this.f92497e = jSONObject.getString("uploadUrlSuffix");
            }
            if (jSONObject.has("presignedUrlSuffix") && !jSONObject.isNull("presignedUrlSuffix")) {
                this.f92498f = jSONObject.getString("presignedUrlSuffix");
            }
            if (jSONObject.has("namedFilters") && !jSONObject.isNull("namedFilters")) {
                this.f92499g = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("namedFilters"));
            }
            if (!jSONObject.has("unSupportedVideoFormats") || jSONObject.isNull("unSupportedVideoFormats")) {
                return;
            }
            this.f92500h = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("unSupportedVideoFormats"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
