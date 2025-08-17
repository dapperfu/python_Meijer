package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;

/* loaded from: classes7.dex */
class c2 extends b0 {

    /* renamed from: g, reason: collision with root package name */
    private static final int f91675g = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f91676a;

    /* renamed from: b, reason: collision with root package name */
    private final String f91677b;

    /* renamed from: c, reason: collision with root package name */
    private final String f91678c;

    /* renamed from: d, reason: collision with root package name */
    private final FormTriggerType f91679d;

    /* renamed from: e, reason: collision with root package name */
    private final long f91680e;

    /* renamed from: f, reason: collision with root package name */
    private int f91681f;

    c2(String str, String str2, String str3, FormTriggerType formTriggerType, long j10, int i10) {
        this.f91676a = str;
        this.f91677b = str2;
        this.f91678c = str3;
        this.f91679d = formTriggerType;
        this.f91680e = j10;
        this.f91681f = i10;
    }

    protected String a() {
        return this.f91676a;
    }

    protected String b() {
        return this.f91677b;
    }

    protected FormTriggerType c() {
        return this.f91679d;
    }

    public int d() {
        return this.f91681f;
    }

    protected long e() {
        return this.f91680e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c2 c2Var = (c2) obj;
            String str = this.f91676a;
            if (str == null ? c2Var.f91676a != null : !str.equals(c2Var.f91676a)) {
                return false;
            }
            String str2 = this.f91677b;
            if (str2 == null ? c2Var.f91677b != null : !str2.equals(c2Var.f91677b)) {
                return false;
            }
            String str3 = this.f91678c;
            if (str3 == null ? c2Var.f91678c != null : !str3.equals(c2Var.f91678c)) {
                return false;
            }
            if (this.f91680e == c2Var.f91680e && this.f91681f == c2Var.f91681f && this.f91679d.ordinal() == c2Var.f91679d.ordinal()) {
                return true;
            }
        }
        return false;
    }

    protected void f() {
        this.f91681f++;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.Feedback;
    }

    protected String getFormId() {
        return this.f91678c;
    }

    public int hashCode() {
        String str = this.f91678c;
        int iHashCode = (str != null ? str.hashCode() : 0) * f91675g;
        String str2 = this.f91676a;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * f91675g;
        String str3 = this.f91677b;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * f91675g;
        String str4 = this.f91678c;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * f91675g) + this.f91679d.hashCode();
    }

    public void a(String str) {
        this.f91676a = str;
    }
}
