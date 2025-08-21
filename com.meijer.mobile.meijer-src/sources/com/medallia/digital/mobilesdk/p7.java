package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;

/* loaded from: classes8.dex */
class p7 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f93548c = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f93549a;

    /* renamed from: b, reason: collision with root package name */
    private String f93550b;

    protected p7(String str, String str2) {
        this.f93550b = str;
        this.f93549a = str2;
    }

    protected String a() {
        return this.f93550b;
    }

    protected String b() {
        return this.f93549a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p7 p7Var = (p7) obj;
            String str = this.f93549a;
            if (str == null ? p7Var.f93549a != null : !str.equals(p7Var.f93549a)) {
                return false;
            }
            String str2 = this.f93550b;
            String str3 = p7Var.f93550b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.Template;
    }

    public int hashCode() {
        String str = this.f93549a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f93548c;
        String str2 = this.f93550b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    protected void a(String str) {
        this.f93550b = str;
    }

    protected void b(String str) {
        this.f93549a = str;
    }
}
