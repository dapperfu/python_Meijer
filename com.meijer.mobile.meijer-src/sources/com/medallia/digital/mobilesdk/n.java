package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes8.dex */
class n extends j3 {

    /* renamed from: b, reason: collision with root package name */
    private long f93430b;

    /* renamed from: c, reason: collision with root package name */
    private String f93431c;

    protected n(String str) {
        super(str);
        try {
            JSONObject jSONObject = new JSONObject(k3.c(str));
            if (jSONObject.has("propertyId") && !jSONObject.isNull("propertyId")) {
                this.f93430b = jSONObject.getLong("propertyId");
            }
            if (!jSONObject.has("authUrl") || jSONObject.isNull("authUrl")) {
                return;
            }
            this.f93431c = jSONObject.getString("authUrl");
        } catch (Exception unused) {
        }
    }

    protected String b() {
        return this.f93431c;
    }

    protected long c() {
        return this.f93430b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof n)) {
            return false;
        }
        String strA = a();
        String strA2 = ((n) obj).a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int hashCode() {
        if (a() != null) {
            return a().hashCode();
        }
        return 0;
    }

    protected n(String str, long j10, String str2) {
        super(str);
        this.f93430b = j10;
        this.f93431c = str2;
    }
}
