package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class b1 implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final int f92479f = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f92480a;

    /* renamed from: b, reason: collision with root package name */
    private String f92481b;

    /* renamed from: c, reason: collision with root package name */
    private String f92482c;

    /* renamed from: d, reason: collision with root package name */
    private String f92483d;

    /* renamed from: e, reason: collision with root package name */
    private String f92484e;

    b1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("invitationTitle") && !jSONObject.isNull("invitationTitle")) {
                this.f92480a = jSONObject.getString("invitationTitle");
            }
            if (jSONObject.has("invitationDescription") && !jSONObject.isNull("invitationDescription")) {
                this.f92481b = jSONObject.getString("invitationDescription");
            }
            if (jSONObject.has("provideButtonText") && !jSONObject.isNull("provideButtonText")) {
                this.f92482c = jSONObject.getString("provideButtonText");
            }
            if (jSONObject.has("declineButtonText") && !jSONObject.isNull("declineButtonText")) {
                this.f92483d = jSONObject.getString("declineButtonText");
            }
            if (!jSONObject.has("laterButtonText") || jSONObject.isNull("laterButtonText")) {
                return;
            }
            this.f92484e = jSONObject.getString("laterButtonText");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected String a() {
        return this.f92483d;
    }

    protected String b() {
        return this.f92481b;
    }

    protected String c() {
        return this.f92480a;
    }

    protected String d() {
        return this.f92484e;
    }

    protected String e() {
        return this.f92482c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = this.f92480a;
        if (str == null ? b1Var.f92480a != null : !str.equals(b1Var.f92480a)) {
            return false;
        }
        String str2 = this.f92481b;
        if (str2 == null ? b1Var.f92481b != null : !str2.equals(b1Var.f92481b)) {
            return false;
        }
        String str3 = this.f92482c;
        if (str3 == null ? b1Var.f92482c != null : !str3.equals(b1Var.f92482c)) {
            return false;
        }
        String str4 = this.f92483d;
        if (str4 == null ? b1Var.f92483d != null : !str4.equals(b1Var.f92483d)) {
            return false;
        }
        String str5 = this.f92484e;
        String str6 = b1Var.f92484e;
        return str5 == null ? str6 == null : str5.equals(str6);
    }

    public String f() {
        try {
            return "{\"invitationTitle\":" + l3.d(this.f92480a) + ",\"invitationDescription\":" + l3.d(this.f92481b) + ",\"provideButtonText\":" + l3.c(this.f92482c) + ",\"declineButtonText\":" + l3.c(this.f92483d) + ",\"laterButtonText\":" + l3.c(this.f92484e) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public int hashCode() {
        String str = this.f92480a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f92479f;
        String str2 = this.f92481b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * f92479f;
        String str3 = this.f92482c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * f92479f;
        String str4 = this.f92483d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * f92479f;
        String str5 = this.f92484e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
