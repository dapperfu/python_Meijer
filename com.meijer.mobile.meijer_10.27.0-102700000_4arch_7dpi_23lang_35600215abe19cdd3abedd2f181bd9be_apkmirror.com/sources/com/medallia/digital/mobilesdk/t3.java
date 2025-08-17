package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class t3 extends b0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f93041a;

    /* renamed from: b, reason: collision with root package name */
    private String f93042b;

    /* renamed from: c, reason: collision with root package name */
    private String f93043c;

    /* renamed from: d, reason: collision with root package name */
    private long f93044d;

    /* renamed from: e, reason: collision with root package name */
    private String f93045e;

    /* renamed from: f, reason: collision with root package name */
    private long f93046f;

    protected t3(String str, String str2, String str3, String str4, long j10, long j11) {
        this.f93041a = str2;
        this.f93042b = str3;
        this.f93043c = str4;
        this.f93044d = j10;
        this.f93045e = str;
        this.f93046f = j11;
    }

    protected String a() {
        return this.f93043c;
    }

    protected String b() {
        return this.f93042b;
    }

    protected long c() {
        return this.f93046f;
    }

    protected long d() {
        return this.f93044d;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.LocalNotification;
    }

    protected String getFormId() {
        return this.f93045e;
    }

    protected String getTitle() {
        return this.f93041a;
    }

    protected void setFormId(String str) {
        this.f93045e = str;
    }

    protected String toJsonString() {
        try {
            return "{\"formId\":" + l3.c(this.f93045e) + ",\"title\":" + l3.c(this.f93041a) + ",\"body\":" + l3.c(this.f93042b) + ",\"appIconPath\":" + l3.c(this.f93043c) + ",\"expiration\":" + this.f93044d + ",\"delay\":" + this.f93046f + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    protected t3(JSONObject jSONObject) throws JSONException {
        try {
            if (jSONObject.has("formId") && !jSONObject.isNull("formId")) {
                this.f93045e = jSONObject.getString("formId");
            }
            if (jSONObject.has("title") && !jSONObject.isNull("title")) {
                this.f93041a = jSONObject.getString("title");
            }
            if (jSONObject.has("body") && !jSONObject.isNull("body")) {
                this.f93042b = jSONObject.getString("body");
            }
            if (jSONObject.has("appIconPath") && !jSONObject.isNull("appIconPath")) {
                this.f93043c = jSONObject.getString("appIconPath");
            }
            if (jSONObject.has("expiration") && !jSONObject.isNull("expiration") && !com.google.maps.android.BuildConfig.TRAVIS.equals(jSONObject.get("expiration"))) {
                String string = jSONObject.getString("expiration");
                if (!string.isEmpty()) {
                    this.f93044d = Long.parseLong(string);
                }
            }
            if (!jSONObject.has("delay") || jSONObject.isNull("delay") || com.google.maps.android.BuildConfig.TRAVIS.equals(jSONObject.get("delay"))) {
                return;
            }
            String string2 = jSONObject.getString("delay");
            if (string2.isEmpty()) {
                return;
            }
            this.f93046f = Long.parseLong(string2);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void a(long j10) {
        this.f93046f = j10;
    }

    protected void b(long j10) {
        this.f93044d = j10;
    }

    protected void c(String str) {
        this.f93041a = str;
    }

    protected void a(String str) {
        this.f93043c = str;
    }

    protected void b(String str) {
        this.f93042b = str;
    }
}
