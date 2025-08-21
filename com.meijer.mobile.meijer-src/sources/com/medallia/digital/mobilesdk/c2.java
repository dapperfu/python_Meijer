package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;

/* loaded from: classes8.dex */
class c2 extends b0 {

    /* renamed from: g, reason: collision with root package name */
    private static final int f92514g = 31;

    /* renamed from: a, reason: collision with root package name */
    private String f92515a;

    /* renamed from: b, reason: collision with root package name */
    private final String f92516b;

    /* renamed from: c, reason: collision with root package name */
    private final String f92517c;

    /* renamed from: d, reason: collision with root package name */
    private final FormTriggerType f92518d;

    /* renamed from: e, reason: collision with root package name */
    private final long f92519e;

    /* renamed from: f, reason: collision with root package name */
    private int f92520f;

    c2(String str, String str2, String str3, FormTriggerType formTriggerType, long j10, int i10) {
        this.f92515a = str;
        this.f92516b = str2;
        this.f92517c = str3;
        this.f92518d = formTriggerType;
        this.f92519e = j10;
        this.f92520f = i10;
    }

    protected String a() {
        return this.f92515a;
    }

    protected String b() {
        return this.f92516b;
    }

    protected FormTriggerType c() {
        return this.f92518d;
    }

    public int d() {
        return this.f92520f;
    }

    protected long e() {
        return this.f92519e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c2 c2Var = (c2) obj;
            String str = this.f92515a;
            if (str == null ? c2Var.f92515a != null : !str.equals(c2Var.f92515a)) {
                return false;
            }
            String str2 = this.f92516b;
            if (str2 == null ? c2Var.f92516b != null : !str2.equals(c2Var.f92516b)) {
                return false;
            }
            String str3 = this.f92517c;
            if (str3 == null ? c2Var.f92517c != null : !str3.equals(c2Var.f92517c)) {
                return false;
            }
            if (this.f92519e == c2Var.f92519e && this.f92520f == c2Var.f92520f && this.f92518d.ordinal() == c2Var.f92518d.ordinal()) {
                return true;
            }
        }
        return false;
    }

    protected void f() {
        this.f92520f++;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.Feedback;
    }

    protected String getFormId() {
        return this.f92517c;
    }

    public int hashCode() {
        String str = this.f92517c;
        int iHashCode = (str != null ? str.hashCode() : 0) * f92514g;
        String str2 = this.f92515a;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * f92514g;
        String str3 = this.f92516b;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * f92514g;
        String str4 = this.f92517c;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * f92514g) + this.f92518d.hashCode();
    }

    public void a(String str) {
        this.f92515a = str;
    }
}
