package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes8.dex */
class d5 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f92635c = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f92636a;

    /* renamed from: b, reason: collision with root package name */
    private String f92637b;

    d5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("key") && !jSONObject.isNull("key")) {
                this.f92636a = jSONObject.getString("key");
            }
            if (!jSONObject.has("presignedUrl") || jSONObject.isNull("presignedUrl")) {
                return;
            }
            this.f92637b = jSONObject.getString("presignedUrl");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    public String a() {
        return this.f92636a;
    }

    public String b() {
        return this.f92637b;
    }

    protected String c() {
        try {
            return "{\"key\":" + l3.c(this.f92636a) + ",\"presignedUrl\":" + l3.c(this.f92637b) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d5 d5Var = (d5) obj;
            String str = this.f92636a;
            if (str == null ? d5Var.f92636a != null : !str.equals(d5Var.f92636a)) {
                return false;
            }
            String str2 = this.f92637b;
            String str3 = d5Var.f92637b;
            if (str2 == null ? str3 != null : !str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f92636a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f92635c;
        String str2 = this.f92637b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
