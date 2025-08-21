package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class t3 extends b0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f93880a;

    /* renamed from: b, reason: collision with root package name */
    private String f93881b;

    /* renamed from: c, reason: collision with root package name */
    private String f93882c;

    /* renamed from: d, reason: collision with root package name */
    private long f93883d;

    /* renamed from: e, reason: collision with root package name */
    private String f93884e;

    /* renamed from: f, reason: collision with root package name */
    private long f93885f;

    protected t3(String str, String str2, String str3, String str4, long j10, long j11) {
        this.f93880a = str2;
        this.f93881b = str3;
        this.f93882c = str4;
        this.f93883d = j10;
        this.f93884e = str;
        this.f93885f = j11;
    }

    protected String a() {
        return this.f93882c;
    }

    protected String b() {
        return this.f93881b;
    }

    protected long c() {
        return this.f93885f;
    }

    protected long d() {
        return this.f93883d;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.LocalNotification;
    }

    protected String getFormId() {
        return this.f93884e;
    }

    protected String getTitle() {
        return this.f93880a;
    }

    protected void setFormId(String str) {
        this.f93884e = str;
    }

    protected String toJsonString() {
        try {
            return "{\"formId\":" + l3.c(this.f93884e) + ",\"title\":" + l3.c(this.f93880a) + ",\"body\":" + l3.c(this.f93881b) + ",\"appIconPath\":" + l3.c(this.f93882c) + ",\"expiration\":" + this.f93883d + ",\"delay\":" + this.f93885f + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    protected t3(JSONObject jSONObject) throws JSONException {
        try {
            if (jSONObject.has("formId") && !jSONObject.isNull("formId")) {
                this.f93884e = jSONObject.getString("formId");
            }
            if (jSONObject.has("title") && !jSONObject.isNull("title")) {
                this.f93880a = jSONObject.getString("title");
            }
            if (jSONObject.has("body") && !jSONObject.isNull("body")) {
                this.f93881b = jSONObject.getString("body");
            }
            if (jSONObject.has("appIconPath") && !jSONObject.isNull("appIconPath")) {
                this.f93882c = jSONObject.getString("appIconPath");
            }
            if (jSONObject.has("expiration") && !jSONObject.isNull("expiration") && !com.google.maps.android.BuildConfig.TRAVIS.equals(jSONObject.get("expiration"))) {
                String string = jSONObject.getString("expiration");
                if (!string.isEmpty()) {
                    this.f93883d = Long.parseLong(string);
                }
            }
            if (!jSONObject.has("delay") || jSONObject.isNull("delay") || com.google.maps.android.BuildConfig.TRAVIS.equals(jSONObject.get("delay"))) {
                return;
            }
            String string2 = jSONObject.getString("delay");
            if (string2.isEmpty()) {
                return;
            }
            this.f93885f = Long.parseLong(string2);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void a(long j10) {
        this.f93885f = j10;
    }

    protected void b(long j10) {
        this.f93883d = j10;
    }

    protected void c(String str) {
        this.f93880a = str;
    }

    protected void a(String str) {
        this.f93882c = str;
    }

    protected void b(String str) {
        this.f93881b = str;
    }
}
