package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class r7 implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    private static final int f93720t = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f93721a;

    /* renamed from: b, reason: collision with root package name */
    private String f93722b;

    /* renamed from: c, reason: collision with root package name */
    private String f93723c;

    /* renamed from: d, reason: collision with root package name */
    private String f93724d;

    /* renamed from: e, reason: collision with root package name */
    private String f93725e;

    /* renamed from: f, reason: collision with root package name */
    private String f93726f;

    /* renamed from: g, reason: collision with root package name */
    private String f93727g;

    /* renamed from: h, reason: collision with root package name */
    private String f93728h;

    /* renamed from: i, reason: collision with root package name */
    private String f93729i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f93730j;

    /* renamed from: k, reason: collision with root package name */
    private String f93731k;

    /* renamed from: l, reason: collision with root package name */
    private String f93732l;

    /* renamed from: m, reason: collision with root package name */
    private String f93733m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f93734n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f93735o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f93736p;

    /* renamed from: q, reason: collision with root package name */
    private long f93737q;

    /* renamed from: r, reason: collision with root package name */
    private String f93738r;

    /* renamed from: s, reason: collision with root package name */
    private String f93739s;

    protected r7() {
    }

    protected String a() {
        return this.f93723c;
    }

    protected String b() {
        return this.f93733m;
    }

    protected String c() {
        return this.f93731k;
    }

    protected String d() {
        return this.f93732l;
    }

    protected String e() {
        return this.f93724d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r7 r7Var = (r7) obj;
            String str = this.f93721a;
            if (str == null ? r7Var.f93721a != null : !str.equals(r7Var.f93721a)) {
                return false;
            }
            String str2 = this.f93722b;
            if (str2 == null ? r7Var.f93722b != null : !str2.equals(r7Var.f93722b)) {
                return false;
            }
            String str3 = this.f93723c;
            if (str3 == null ? r7Var.f93723c != null : !str3.equals(r7Var.f93723c)) {
                return false;
            }
            String str4 = this.f93724d;
            if (str4 == null ? r7Var.f93724d != null : !str4.equals(r7Var.f93724d)) {
                return false;
            }
            String str5 = this.f93725e;
            if (str5 == null ? r7Var.f93725e != null : !str5.equals(r7Var.f93725e)) {
                return false;
            }
            String str6 = this.f93727g;
            if (str6 == null ? r7Var.f93727g != null : !str6.equals(r7Var.f93727g)) {
                return false;
            }
            String str7 = this.f93728h;
            if (str7 == null ? r7Var.f93728h != null : !str7.equals(r7Var.f93728h)) {
                return false;
            }
            String str8 = this.f93729i;
            if (str8 == null ? r7Var.f93729i != null : !str8.equals(r7Var.f93729i)) {
                return false;
            }
            if (this.f93730j != r7Var.f93730j) {
                return false;
            }
            String str9 = this.f93731k;
            if (str9 == null ? r7Var.f93731k != null : !str9.equals(r7Var.f93731k)) {
                return false;
            }
            String str10 = this.f93732l;
            if (str10 == null ? r7Var.f93732l != null : !str10.equals(r7Var.f93732l)) {
                return false;
            }
            String str11 = this.f93733m;
            if (str11 == null ? r7Var.f93733m != null : !str11.equals(r7Var.f93733m)) {
                return false;
            }
            if (this.f93734n != r7Var.f93734n || this.f93735o != r7Var.f93735o || this.f93736p != r7Var.f93736p || this.f93737q != r7Var.f93737q) {
                return false;
            }
            String str12 = this.f93738r;
            if (str12 == null ? r7Var.f93738r != null : !str12.equals(r7Var.f93738r)) {
                return false;
            }
            String str13 = this.f93726f;
            if (str13 == null ? r7Var.f93726f != null : !str13.equals(r7Var.f93726f)) {
                return false;
            }
            String str14 = this.f93739s;
            String str15 = r7Var.f93739s;
            if (str14 == null ? str15 != null : !str14.equals(str15)) {
                return true;
            }
        }
        return false;
    }

    protected String f() {
        return this.f93728h;
    }

    protected String g() {
        return this.f93725e;
    }

    protected String h() {
        return this.f93739s;
    }

    public int hashCode() {
        String str = this.f93721a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f93720t;
        String str2 = this.f93722b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * f93720t;
        String str3 = this.f93723c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * f93720t;
        String str4 = this.f93724d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * f93720t;
        String str5 = this.f93725e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * f93720t;
        String str6 = this.f93727g;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * f93720t;
        String str7 = this.f93728h;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * f93720t;
        String str8 = this.f93729i;
        int iHashCode8 = (((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * f93720t) + Boolean.valueOf(this.f93730j).hashCode()) * f93720t;
        String str9 = this.f93731k;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * f93720t;
        String str10 = this.f93732l;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * f93720t;
        String str11 = this.f93733m;
        int iHashCode11 = (((((((((iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * f93720t) + Boolean.valueOf(this.f93734n).hashCode()) * f93720t) + Boolean.valueOf(this.f93735o).hashCode()) * f93720t) + Boolean.valueOf(this.f93736p).hashCode()) * f93720t) + Long.valueOf(this.f93737q).hashCode()) * f93720t;
        String str12 = this.f93738r;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * f93720t;
        String str13 = this.f93739s;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * f93720t;
        String str14 = this.f93726f;
        return iHashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    protected String i() {
        return this.f93727g;
    }

    protected String j() {
        return this.f93729i;
    }

    protected long k() {
        return this.f93737q;
    }

    protected String l() {
        return this.f93722b;
    }

    public String m() {
        return this.f93726f;
    }

    protected String n() {
        return this.f93721a;
    }

    protected String o() {
        return this.f93738r;
    }

    protected boolean p() {
        return this.f93734n;
    }

    protected boolean q() {
        return this.f93730j;
    }

    protected boolean r() {
        return this.f93736p;
    }

    protected boolean s() {
        return this.f93735o;
    }

    protected String t() {
        try {
            return "{\"showThankYouPrompt\":" + this.f93736p + ",\"promptDuration\":" + this.f93737q + ",\"isStickyPrompt\":" + this.f93735o + ",\"isImageDisplay\":" + this.f93730j + ",\"selectedTheme\":" + l3.c(this.f93726f) + ",\"mobileThankYouPromptImageDataContract\":{\"url\":" + l3.c(this.f93727g) + "},\"mobileThankYouPromptDarkImageDataContract\":{\"url\":" + l3.c(this.f93728h) + "},\"mobileThankYouPromptGeneralSettingsSectionContract\":{\"textContent\":" + l3.c(l3.a(this.f93721a)) + ",\"bodyContent\":" + l3.c(l3.a(this.f93722b)) + ",\"promptContentFontColor\":" + l3.c(this.f93724d) + ",\"promptContentFontType\":" + l3.c(this.f93725e) + ",\"backgroundColor\":" + l3.c(this.f93723c) + "},\"mobileThankYouPromptButtonSectionContract\":{\"buttonDisplayed\":" + this.f93734n + ",\"buttonText\":" + l3.c(this.f93731k) + ",\"buttonTextColor\":" + l3.c(this.f93732l) + ",\"buttonColor\":" + l3.c(this.f93733m) + "},\"mobileThankYouAccessibilitySectionContract\":{\"imageAltText\":" + l3.c(this.f93739s) + ",\"closeButtonAltText\":" + l3.c(this.f93738r) + "}}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public r7(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, String str8, String str9, String str10, boolean z11, boolean z12, boolean z13, long j10, String str11, String str12, String str13) {
        this.f93721a = str;
        this.f93722b = str2;
        this.f93723c = str3;
        this.f93724d = str4;
        this.f93725e = str5;
        this.f93727g = str6;
        this.f93729i = str7;
        this.f93730j = z10;
        this.f93731k = str8;
        this.f93732l = str9;
        this.f93733m = str10;
        this.f93734n = z11;
        this.f93735o = z12;
        this.f93736p = z13;
        this.f93737q = j10;
        this.f93738r = str11;
        this.f93739s = str12;
        this.f93726f = str13;
    }

    public r7(JSONObject jSONObject) throws JSONException {
        try {
            if (jSONObject.has("showThankYouPrompt") && !jSONObject.isNull("showThankYouPrompt")) {
                this.f93736p = jSONObject.getBoolean("showThankYouPrompt");
            }
            if (jSONObject.has("promptDuration") && !jSONObject.isNull("promptDuration")) {
                this.f93737q = jSONObject.getLong("promptDuration");
            }
            if (jSONObject.has("isStickyPrompt") && !jSONObject.isNull("isStickyPrompt")) {
                this.f93735o = jSONObject.getBoolean("isStickyPrompt");
            }
            if (jSONObject.has("isImageDisplay") && !jSONObject.isNull("isImageDisplay")) {
                this.f93730j = jSONObject.getBoolean("isImageDisplay");
            }
            if (jSONObject.has("selectedTheme") && !jSONObject.isNull("selectedTheme")) {
                this.f93726f = jSONObject.getString("selectedTheme");
            }
            if (jSONObject.has("mobileThankYouPromptImageDataContract") && !jSONObject.isNull("mobileThankYouPromptImageDataContract")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("mobileThankYouPromptImageDataContract");
                if (jSONObject2.has("url") && !jSONObject2.isNull("url")) {
                    this.f93727g = jSONObject2.getString("url");
                }
            }
            if (jSONObject.has("mobileThankYouPromptDarkImageDataContract") && !jSONObject.isNull("mobileThankYouPromptDarkImageDataContract")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("mobileThankYouPromptDarkImageDataContract");
                if (jSONObject3.has("url") && !jSONObject3.isNull("url")) {
                    this.f93728h = jSONObject3.getString("url");
                }
            }
            if (jSONObject.has("mobileThankYouPromptGeneralSettingsSectionContract") && !jSONObject.isNull("mobileThankYouPromptGeneralSettingsSectionContract")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("mobileThankYouPromptGeneralSettingsSectionContract");
                if (jSONObject4.has("textContent") && !jSONObject4.isNull("textContent")) {
                    this.f93721a = jSONObject4.getString("textContent");
                }
                if (jSONObject4.has("bodyContent") && !jSONObject4.isNull("bodyContent")) {
                    this.f93722b = jSONObject4.getString("bodyContent");
                }
                if (jSONObject4.has("promptContentFontColor") && !jSONObject4.isNull("promptContentFontColor")) {
                    this.f93724d = jSONObject4.getString("promptContentFontColor");
                }
                if (jSONObject4.has("promptContentFontType") && !jSONObject4.isNull("promptContentFontType")) {
                    this.f93725e = jSONObject4.getString("promptContentFontType");
                }
                if (jSONObject4.has("backgroundColor") && !jSONObject4.isNull("backgroundColor")) {
                    this.f93723c = jSONObject4.getString("backgroundColor");
                }
            }
            if (jSONObject.has("mobileThankYouPromptButtonSectionContract") && !jSONObject.isNull("mobileThankYouPromptButtonSectionContract")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("mobileThankYouPromptButtonSectionContract");
                if (jSONObject5.has("buttonDisplayed") && !jSONObject5.isNull("buttonDisplayed")) {
                    this.f93734n = jSONObject5.getBoolean("buttonDisplayed");
                }
                if (jSONObject5.has("buttonText") && !jSONObject5.isNull("buttonText")) {
                    this.f93731k = jSONObject5.getString("buttonText");
                }
                if (jSONObject5.has("buttonTextColor") && !jSONObject5.isNull("buttonTextColor")) {
                    this.f93732l = jSONObject5.getString("buttonTextColor");
                }
                if (jSONObject5.has("buttonColor") && !jSONObject5.isNull("buttonColor")) {
                    this.f93733m = jSONObject5.getString("buttonColor");
                }
            }
            if (!jSONObject.has("mobileThankYouAccessibilitySectionContract") || jSONObject.isNull("mobileThankYouAccessibilitySectionContract")) {
                return;
            }
            JSONObject jSONObject6 = jSONObject.getJSONObject("mobileThankYouAccessibilitySectionContract");
            if (jSONObject6.has("imageAltText") && !jSONObject6.isNull("imageAltText")) {
                this.f93739s = jSONObject6.getString("imageAltText");
            }
            if (!jSONObject6.has("closeButtonAltText") || jSONObject6.isNull("closeButtonAltText")) {
                return;
            }
            this.f93738r = jSONObject6.getString("closeButtonAltText");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
