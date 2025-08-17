package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class b1 implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final int f91640f = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f91641a;

    /* renamed from: b, reason: collision with root package name */
    private String f91642b;

    /* renamed from: c, reason: collision with root package name */
    private String f91643c;

    /* renamed from: d, reason: collision with root package name */
    private String f91644d;

    /* renamed from: e, reason: collision with root package name */
    private String f91645e;

    b1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("invitationTitle") && !jSONObject.isNull("invitationTitle")) {
                this.f91641a = jSONObject.getString("invitationTitle");
            }
            if (jSONObject.has("invitationDescription") && !jSONObject.isNull("invitationDescription")) {
                this.f91642b = jSONObject.getString("invitationDescription");
            }
            if (jSONObject.has("provideButtonText") && !jSONObject.isNull("provideButtonText")) {
                this.f91643c = jSONObject.getString("provideButtonText");
            }
            if (jSONObject.has("declineButtonText") && !jSONObject.isNull("declineButtonText")) {
                this.f91644d = jSONObject.getString("declineButtonText");
            }
            if (!jSONObject.has("laterButtonText") || jSONObject.isNull("laterButtonText")) {
                return;
            }
            this.f91645e = jSONObject.getString("laterButtonText");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected String a() {
        return this.f91644d;
    }

    protected String b() {
        return this.f91642b;
    }

    protected String c() {
        return this.f91641a;
    }

    protected String d() {
        return this.f91645e;
    }

    protected String e() {
        return this.f91643c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        String str = this.f91641a;
        if (str == null ? b1Var.f91641a != null : !str.equals(b1Var.f91641a)) {
            return false;
        }
        String str2 = this.f91642b;
        if (str2 == null ? b1Var.f91642b != null : !str2.equals(b1Var.f91642b)) {
            return false;
        }
        String str3 = this.f91643c;
        if (str3 == null ? b1Var.f91643c != null : !str3.equals(b1Var.f91643c)) {
            return false;
        }
        String str4 = this.f91644d;
        if (str4 == null ? b1Var.f91644d != null : !str4.equals(b1Var.f91644d)) {
            return false;
        }
        String str5 = this.f91645e;
        String str6 = b1Var.f91645e;
        return str5 == null ? str6 == null : str5.equals(str6);
    }

    public String f() {
        try {
            return "{\"invitationTitle\":" + l3.d(this.f91641a) + ",\"invitationDescription\":" + l3.d(this.f91642b) + ",\"provideButtonText\":" + l3.c(this.f91643c) + ",\"declineButtonText\":" + l3.c(this.f91644d) + ",\"laterButtonText\":" + l3.c(this.f91645e) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public int hashCode() {
        String str = this.f91641a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f91640f;
        String str2 = this.f91642b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * f91640f;
        String str3 = this.f91643c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * f91640f;
        String str4 = this.f91644d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * f91640f;
        String str5 = this.f91645e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
