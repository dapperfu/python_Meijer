package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b5 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f91654a;

    /* renamed from: b, reason: collision with root package name */
    private String f91655b;

    /* renamed from: c, reason: collision with root package name */
    private String f91656c;

    /* renamed from: d, reason: collision with root package name */
    private String f91657d;

    /* renamed from: e, reason: collision with root package name */
    private String f91658e;

    /* renamed from: f, reason: collision with root package name */
    private String f91659f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f91660g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<String> f91661h;

    b5(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.f91654a = str;
        this.f91655b = str2;
        this.f91656c = str3;
        this.f91657d = str4;
        this.f91658e = str5;
        this.f91659f = str6;
        this.f91660g = arrayList;
        this.f91661h = arrayList2;
    }

    public String a() {
        return this.f91656c;
    }

    public String b() {
        return this.f91654a;
    }

    public String c() {
        return this.f91657d;
    }

    public String d() {
        return this.f91655b;
    }

    public ArrayList<String> e() {
        return this.f91660g;
    }

    public String f() {
        return this.f91659f;
    }

    public ArrayList<String> g() {
        return this.f91661h;
    }

    public String h() {
        return this.f91658e;
    }

    String i() {
        try {
            return "{\"channelId\":" + l3.c(this.f91654a) + ",\"domain\":" + l3.c(this.f91655b) + ",\"apiKey\":" + l3.c(this.f91656c) + ",\"channelUrlsPrefix\":" + l3.c(this.f91657d) + ",\"uploadUrlSuffix\":" + l3.c(this.f91658e) + ",\"presignedUrlSuffix\":" + l3.c(this.f91659f) + ",\"namedFilters\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.f91660g) + ",\"unSupportedVideoFormats\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.f91661h) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    b5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("channelId") && !jSONObject.isNull("channelId")) {
                this.f91654a = jSONObject.getString("channelId");
            }
            if (jSONObject.has("domain") && !jSONObject.isNull("domain")) {
                this.f91655b = jSONObject.getString("domain");
            }
            if (jSONObject.has("apiKey") && !jSONObject.isNull("apiKey")) {
                this.f91656c = jSONObject.getString("apiKey");
            }
            if (jSONObject.has("channelUrlsPrefix") && !jSONObject.isNull("channelUrlsPrefix")) {
                this.f91657d = jSONObject.getString("channelUrlsPrefix");
            }
            if (jSONObject.has("uploadUrlSuffix") && !jSONObject.isNull("uploadUrlSuffix")) {
                this.f91658e = jSONObject.getString("uploadUrlSuffix");
            }
            if (jSONObject.has("presignedUrlSuffix") && !jSONObject.isNull("presignedUrlSuffix")) {
                this.f91659f = jSONObject.getString("presignedUrlSuffix");
            }
            if (jSONObject.has("namedFilters") && !jSONObject.isNull("namedFilters")) {
                this.f91660g = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("namedFilters"));
            }
            if (!jSONObject.has("unSupportedVideoFormats") || jSONObject.isNull("unSupportedVideoFormats")) {
                return;
            }
            this.f91661h = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("unSupportedVideoFormats"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
