package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;

/* loaded from: classes7.dex */
class p7 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f92709c = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f92710a;

    /* renamed from: b, reason: collision with root package name */
    private String f92711b;

    protected p7(String str, String str2) {
        this.f92711b = str;
        this.f92710a = str2;
    }

    protected String a() {
        return this.f92711b;
    }

    protected String b() {
        return this.f92710a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p7 p7Var = (p7) obj;
            String str = this.f92710a;
            if (str == null ? p7Var.f92710a != null : !str.equals(p7Var.f92710a)) {
                return false;
            }
            String str2 = this.f92711b;
            String str3 = p7Var.f92711b;
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
        String str = this.f92710a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f92709c;
        String str2 = this.f92711b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    protected void a(String str) {
        this.f92711b = str;
    }

    protected void b(String str) {
        this.f92710a = str;
    }
}
