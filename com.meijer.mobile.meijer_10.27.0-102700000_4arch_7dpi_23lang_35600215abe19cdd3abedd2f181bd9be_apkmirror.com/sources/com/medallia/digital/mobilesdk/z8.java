package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;

/* loaded from: classes7.dex */
class z8 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f93672c = 31;

    /* renamed from: a, reason: collision with root package name */
    private final String f93673a;

    /* renamed from: b, reason: collision with root package name */
    private final String f93674b;

    public z8(String str, String str2) {
        this.f93673a = str;
        this.f93674b = str2;
    }

    public String a() {
        return this.f93673a;
    }

    public String b() {
        return this.f93674b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            z8 z8Var = (z8) obj;
            String str = this.f93674b;
            if (str == null ? z8Var.f93674b != null : !str.equals(z8Var.f93673a)) {
                return false;
            }
            String str2 = this.f93673a;
            String str3 = z8Var.f93673a;
            if (str2 == null ? str3 != null : !str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.WorkerManager;
    }

    public int hashCode() {
        String str = this.f93673a;
        int iHashCode = (str != null ? str.hashCode() : 0) * f93672c;
        String str2 = this.f93674b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    String toJsonString() {
        try {
            return "{\"mediaCaptureClientCorrelationId\":" + l3.c(this.f93673a) + "\"requestId\":" + l3.c(this.f93674b) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
