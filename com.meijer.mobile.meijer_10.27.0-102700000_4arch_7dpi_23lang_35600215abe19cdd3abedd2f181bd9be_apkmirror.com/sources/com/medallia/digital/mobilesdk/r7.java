package com.medallia.digital.mobilesdk;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class r7 implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    private static final int f92881t = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f92882a;

    /* renamed from: b, reason: collision with root package name */
    private String f92883b;

    /* renamed from: c, reason: collision with root package name */
    private String f92884c;

    /* renamed from: d, reason: collision with root package name */
    private String f92885d;

    /* renamed from: e, reason: collision with root package name */
    private String f92886e;

    /* renamed from: f, reason: collision with root package name */
    private String f92887f;

    /* renamed from: g, reason: collision with root package name */
    private String f92888g;

    /* renamed from: h, reason: collision with root package name */
    private String f92889h;

    /* renamed from: i, reason: collision with root package name */
    private String f92890i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f92891j;

    /* renamed from: k, reason: collision with root package name */
    private String f92892k;

    /* renamed from: l, reason: collision with root package name */
    private String f92893l;

    /* renamed from: m, reason: collision with root package name */
    private String f92894m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f92895n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f92896o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f92897p;

    /* renamed from: q, reason: collision with root package name */
    private long f92898q;

    /* renamed from: r, reason: collision with root package name */
    private String f92899r;

    /* renamed from: s, reason: collision with root package name */
    private String f92900s;

    protected r7() {
    }

    protected String a() {
        return this.f92884c;
    }

    protected String b() {
        return this.f92894m;
    }

    protected String c() {
        return this.f92892k;
    }

    protected String d() {
        return this.f92893l;
    }

    protected String e() {
        return this.f92885d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r7 r7Var = (r7) obj;
            String str = this.f92882a;
            if (str == null ? r7Var.f92882a != null : !str.equals(r7Var.f92882a)) {
                return false;
            }
            String str2 = this.f92883b;
            if (str2 == null ? r7Var.f92883b != null : !str2.equals(r7Var.f92883b)) {
                return false;
            }
            String str3 = this.f92884c;
            if (str3 == null ? r7Var.f92884c != null : !str3.equals(r7Var.f92884c)) {
                return false;
            }
            String str4 = this.f92885d;
            if (str4 == null ? r7Var.f92885d != null : !str4.equals(r7Var.f92885d)) {
                return false;
            }
            String str5 = this.f92886e;
            if (str5 == null ? r7Var.f92886e != null : !str5.equals(r7Var.f92886e)) {
                return false;
            }
            String str6 = this.f92888g;
            if (str6 == null ? r7Var.f92888g != null : !str6.equals(r7Var.f92888g)) {
                return false;
            }
            String str7 = this.f92889h;
            if (str7 == null ? r7Var.f92889h != null : !str7.equals(r7Var.f92889h)) {
                return false;
            }
            String str8 = this.f92890i;
            if (str8 == null ? r7Var.f92890i != null : !str8.equals(r7Var.f92890i)) {
                return false;
            }
            if (this.f92891j != r7Var.f92891j) {
                return false;
            }
            String str9 = this.f92892k;
            if (str9 == null ? r7Var.f92892k != null : !str9.equals(r7Var.f92892k)) {
                return false;
            }
            String str10 = this.f92893l;
            if (str10 == null ? r7Var.f92893l != null : !str10.equals(r7Var.f92893l)) {
                return false;
            }
            String str11 = this.f92894m;
            if (str11 == null ? r7Var.f92894m != null : !str11.equals(r7Var.f92894m)) {
                return false;
            }
            if (this.f92895n != r7Var.f92895n || this.f92896o != r7Var.f92896o || this.f92897p != r7Var.f92897p || this.f92898q != r7Var.f92898q) {
                return false;
            }
            String str12 = this.f92899r;
            if (str12 == null ? r7Var.f92899r != null : !str12.equals(r7Var.f92899r)) {
                return false;
            }
            String str13 = this.f92887f;
            if (str13 == null ? r7Var.f92887f != null : !str13.equals(r7Var.f92887f)) {
                return false;
            }
            String str14 = this.f92900s;
            String str15 = r7Var.f92900s;
            if (str14 == null ? str15 != null : !str14.equals(str15)) {
                return true;
            }
        }
        return false;
    }

    protected String f() {
        return this.f92889h;
    }

    protected String g() {
        return this.f92886e;
    }

    protected String h() {
        return this.f92900s;
    }

    public int hashCode() {
        String str = this.f92882a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f92881t;
        String str2 = this.f92883b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * f92881t;
        String str3 = this.f92884c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * f92881t;
        String str4 = this.f92885d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * f92881t;
        String str5 = this.f92886e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * f92881t;
        String str6 = this.f92888g;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * f92881t;
        String str7 = this.f92889h;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * f92881t;
        String str8 = this.f92890i;
        int iHashCode8 = (((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * f92881t) + Boolean.valueOf(this.f92891j).hashCode()) * f92881t;
        String str9 = this.f92892k;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * f92881t;
        String str10 = this.f92893l;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * f92881t;
        String str11 = this.f92894m;
        int iHashCode11 = (((((((((iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * f92881t) + Boolean.valueOf(this.f92895n).hashCode()) * f92881t) + Boolean.valueOf(this.f92896o).hashCode()) * f92881t) + Boolean.valueOf(this.f92897p).hashCode()) * f92881t) + Long.valueOf(this.f92898q).hashCode()) * f92881t;
        String str12 = this.f92899r;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * f92881t;
        String str13 = this.f92900s;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * f92881t;
        String str14 = this.f92887f;
        return iHashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    protected String i() {
        return this.f92888g;
    }

    protected String j() {
        return this.f92890i;
    }

    protected long k() {
        return this.f92898q;
    }

    protected String l() {
        return this.f92883b;
    }

    public String m() {
        return this.f92887f;
    }

    protected String n() {
        return this.f92882a;
    }

    protected String o() {
        return this.f92899r;
    }

    protected boolean p() {
        return this.f92895n;
    }

    protected boolean q() {
        return this.f92891j;
    }

    protected boolean r() {
        return this.f92897p;
    }

    protected boolean s() {
        return this.f92896o;
    }

    protected String t() {
        try {
            return "{\"showThankYouPrompt\":" + this.f92897p + ",\"promptDuration\":" + this.f92898q + ",\"isStickyPrompt\":" + this.f92896o + ",\"isImageDisplay\":" + this.f92891j + ",\"selectedTheme\":" + l3.c(this.f92887f) + ",\"mobileThankYouPromptImageDataContract\":{\"url\":" + l3.c(this.f92888g) + "},\"mobileThankYouPromptDarkImageDataContract\":{\"url\":" + l3.c(this.f92889h) + "},\"mobileThankYouPromptGeneralSettingsSectionContract\":{\"textContent\":" + l3.c(l3.a(this.f92882a)) + ",\"bodyContent\":" + l3.c(l3.a(this.f92883b)) + ",\"promptContentFontColor\":" + l3.c(this.f92885d) + ",\"promptContentFontType\":" + l3.c(this.f92886e) + ",\"backgroundColor\":" + l3.c(this.f92884c) + "},\"mobileThankYouPromptButtonSectionContract\":{\"buttonDisplayed\":" + this.f92895n + ",\"buttonText\":" + l3.c(this.f92892k) + ",\"buttonTextColor\":" + l3.c(this.f92893l) + ",\"buttonColor\":" + l3.c(this.f92894m) + "},\"mobileThankYouAccessibilitySectionContract\":{\"imageAltText\":" + l3.c(this.f92900s) + ",\"closeButtonAltText\":" + l3.c(this.f92899r) + "}}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public r7(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, String str8, String str9, String str10, boolean z11, boolean z12, boolean z13, long j10, String str11, String str12, String str13) {
        this.f92882a = str;
        this.f92883b = str2;
        this.f92884c = str3;
        this.f92885d = str4;
        this.f92886e = str5;
        this.f92888g = str6;
        this.f92890i = str7;
        this.f92891j = z10;
        this.f92892k = str8;
        this.f92893l = str9;
        this.f92894m = str10;
        this.f92895n = z11;
        this.f92896o = z12;
        this.f92897p = z13;
        this.f92898q = j10;
        this.f92899r = str11;
        this.f92900s = str12;
        this.f92887f = str13;
    }

    public r7(JSONObject jSONObject) throws JSONException {
        try {
            if (jSONObject.has("showThankYouPrompt") && !jSONObject.isNull("showThankYouPrompt")) {
                this.f92897p = jSONObject.getBoolean("showThankYouPrompt");
            }
            if (jSONObject.has("promptDuration") && !jSONObject.isNull("promptDuration")) {
                this.f92898q = jSONObject.getLong("promptDuration");
            }
            if (jSONObject.has("isStickyPrompt") && !jSONObject.isNull("isStickyPrompt")) {
                this.f92896o = jSONObject.getBoolean("isStickyPrompt");
            }
            if (jSONObject.has("isImageDisplay") && !jSONObject.isNull("isImageDisplay")) {
                this.f92891j = jSONObject.getBoolean("isImageDisplay");
            }
            if (jSONObject.has("selectedTheme") && !jSONObject.isNull("selectedTheme")) {
                this.f92887f = jSONObject.getString("selectedTheme");
            }
            if (jSONObject.has("mobileThankYouPromptImageDataContract") && !jSONObject.isNull("mobileThankYouPromptImageDataContract")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("mobileThankYouPromptImageDataContract");
                if (jSONObject2.has("url") && !jSONObject2.isNull("url")) {
                    this.f92888g = jSONObject2.getString("url");
                }
            }
            if (jSONObject.has("mobileThankYouPromptDarkImageDataContract") && !jSONObject.isNull("mobileThankYouPromptDarkImageDataContract")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("mobileThankYouPromptDarkImageDataContract");
                if (jSONObject3.has("url") && !jSONObject3.isNull("url")) {
                    this.f92889h = jSONObject3.getString("url");
                }
            }
            if (jSONObject.has("mobileThankYouPromptGeneralSettingsSectionContract") && !jSONObject.isNull("mobileThankYouPromptGeneralSettingsSectionContract")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("mobileThankYouPromptGeneralSettingsSectionContract");
                if (jSONObject4.has("textContent") && !jSONObject4.isNull("textContent")) {
                    this.f92882a = jSONObject4.getString("textContent");
                }
                if (jSONObject4.has("bodyContent") && !jSONObject4.isNull("bodyContent")) {
                    this.f92883b = jSONObject4.getString("bodyContent");
                }
                if (jSONObject4.has("promptContentFontColor") && !jSONObject4.isNull("promptContentFontColor")) {
                    this.f92885d = jSONObject4.getString("promptContentFontColor");
                }
                if (jSONObject4.has("promptContentFontType") && !jSONObject4.isNull("promptContentFontType")) {
                    this.f92886e = jSONObject4.getString("promptContentFontType");
                }
                if (jSONObject4.has("backgroundColor") && !jSONObject4.isNull("backgroundColor")) {
                    this.f92884c = jSONObject4.getString("backgroundColor");
                }
            }
            if (jSONObject.has("mobileThankYouPromptButtonSectionContract") && !jSONObject.isNull("mobileThankYouPromptButtonSectionContract")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("mobileThankYouPromptButtonSectionContract");
                if (jSONObject5.has("buttonDisplayed") && !jSONObject5.isNull("buttonDisplayed")) {
                    this.f92895n = jSONObject5.getBoolean("buttonDisplayed");
                }
                if (jSONObject5.has("buttonText") && !jSONObject5.isNull("buttonText")) {
                    this.f92892k = jSONObject5.getString("buttonText");
                }
                if (jSONObject5.has("buttonTextColor") && !jSONObject5.isNull("buttonTextColor")) {
                    this.f92893l = jSONObject5.getString("buttonTextColor");
                }
                if (jSONObject5.has("buttonColor") && !jSONObject5.isNull("buttonColor")) {
                    this.f92894m = jSONObject5.getString("buttonColor");
                }
            }
            if (!jSONObject.has("mobileThankYouAccessibilitySectionContract") || jSONObject.isNull("mobileThankYouAccessibilitySectionContract")) {
                return;
            }
            JSONObject jSONObject6 = jSONObject.getJSONObject("mobileThankYouAccessibilitySectionContract");
            if (jSONObject6.has("imageAltText") && !jSONObject6.isNull("imageAltText")) {
                this.f92900s = jSONObject6.getString("imageAltText");
            }
            if (!jSONObject6.has("closeButtonAltText") || jSONObject6.isNull("closeButtonAltText")) {
                return;
            }
            this.f92899r = jSONObject6.getString("closeButtonAltText");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
