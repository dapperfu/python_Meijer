package com.medallia.digital.mobilesdk;

import java.io.Serializable;

/* loaded from: classes7.dex */
class q implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final int f92715g = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f92716a;

    /* renamed from: b, reason: collision with root package name */
    private InviteData f92717b;

    /* renamed from: c, reason: collision with root package name */
    private String f92718c;

    /* renamed from: d, reason: collision with root package name */
    private String f92719d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f92720e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f92721f;

    q(AppRatingContract appRatingContract) {
        this.f92716a = appRatingContract.getAppRatingId();
        this.f92717b = appRatingContract.getInviteData();
        this.f92718c = appRatingContract.getAppRatingUrl();
        this.f92719d = appRatingContract.getAppRatingLanguage();
        this.f92720e = appRatingContract.isDarkModeEnabled();
        this.f92721f = appRatingContract.isAppRatingDirectApi();
    }

    String a() {
        return this.f92716a;
    }

    String b() {
        return this.f92719d;
    }

    String c() {
        return this.f92718c;
    }

    InviteData d() {
        return this.f92717b;
    }

    protected boolean e() {
        return this.f92721f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            String str = this.f92716a;
            if (str == null ? qVar.f92716a != null : !str.equals(qVar.f92716a)) {
                return false;
            }
            InviteData inviteData = this.f92717b;
            if (inviteData == null ? qVar.f92717b != null : !inviteData.equals(qVar.f92717b)) {
                return false;
            }
            String str2 = this.f92719d;
            if (str2 == null ? qVar.f92719d != null : !str2.equals(qVar.f92719d)) {
                return false;
            }
            if (this.f92720e != qVar.f92720e) {
                return false;
            }
            String str3 = this.f92718c;
            String str4 = qVar.f92718c;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    boolean f() {
        return this.f92720e;
    }

    public int hashCode() {
        String str = this.f92716a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f92715g;
        InviteData inviteData = this.f92717b;
        int iHashCode2 = (iHashCode + (inviteData != null ? inviteData.hashCode() : 0)) * f92715g;
        String str2 = this.f92718c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * f92715g;
        String str3 = this.f92719d;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * f92715g) + Boolean.valueOf(this.f92720e).hashCode();
    }

    void a(AppRatingContract appRatingContract) {
        if (appRatingContract == null) {
            return;
        }
        this.f92716a = appRatingContract.getAppRatingId();
        this.f92717b = appRatingContract.getInviteData();
        this.f92718c = appRatingContract.getAppRatingUrl();
        this.f92719d = appRatingContract.getAppRatingLanguage();
        this.f92720e = appRatingContract.isDarkModeEnabled();
        this.f92721f = appRatingContract.isAppRatingDirectApi();
    }
}
