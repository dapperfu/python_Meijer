package com.medallia.digital.mobilesdk;

import java.io.Serializable;

/* loaded from: classes8.dex */
class q implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final int f93554g = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f93555a;

    /* renamed from: b, reason: collision with root package name */
    private InviteData f93556b;

    /* renamed from: c, reason: collision with root package name */
    private String f93557c;

    /* renamed from: d, reason: collision with root package name */
    private String f93558d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f93559e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f93560f;

    q(AppRatingContract appRatingContract) {
        this.f93555a = appRatingContract.getAppRatingId();
        this.f93556b = appRatingContract.getInviteData();
        this.f93557c = appRatingContract.getAppRatingUrl();
        this.f93558d = appRatingContract.getAppRatingLanguage();
        this.f93559e = appRatingContract.isDarkModeEnabled();
        this.f93560f = appRatingContract.isAppRatingDirectApi();
    }

    String a() {
        return this.f93555a;
    }

    String b() {
        return this.f93558d;
    }

    String c() {
        return this.f93557c;
    }

    InviteData d() {
        return this.f93556b;
    }

    protected boolean e() {
        return this.f93560f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            String str = this.f93555a;
            if (str == null ? qVar.f93555a != null : !str.equals(qVar.f93555a)) {
                return false;
            }
            InviteData inviteData = this.f93556b;
            if (inviteData == null ? qVar.f93556b != null : !inviteData.equals(qVar.f93556b)) {
                return false;
            }
            String str2 = this.f93558d;
            if (str2 == null ? qVar.f93558d != null : !str2.equals(qVar.f93558d)) {
                return false;
            }
            if (this.f93559e != qVar.f93559e) {
                return false;
            }
            String str3 = this.f93557c;
            String str4 = qVar.f93557c;
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
        return this.f93559e;
    }

    public int hashCode() {
        String str = this.f93555a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f93554g;
        InviteData inviteData = this.f93556b;
        int iHashCode2 = (iHashCode + (inviteData != null ? inviteData.hashCode() : 0)) * f93554g;
        String str2 = this.f93557c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * f93554g;
        String str3 = this.f93558d;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * f93554g) + Boolean.valueOf(this.f93559e).hashCode();
    }

    void a(AppRatingContract appRatingContract) {
        if (appRatingContract == null) {
            return;
        }
        this.f93555a = appRatingContract.getAppRatingId();
        this.f93556b = appRatingContract.getInviteData();
        this.f93557c = appRatingContract.getAppRatingUrl();
        this.f93558d = appRatingContract.getAppRatingLanguage();
        this.f93559e = appRatingContract.isDarkModeEnabled();
        this.f93560f = appRatingContract.isAppRatingDirectApi();
    }
}
