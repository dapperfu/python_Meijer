package com.adobe.marketing.mobile;

/* loaded from: classes4.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    private final a f62864a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62865b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62866c;

    /* renamed from: d, reason: collision with root package name */
    private final String f62867d;

    public enum a {
        UNKNOWN(0),
        AUTHENTICATED(1),
        LOGGED_OUT(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f62872a;

        public int e() {
            return this.f62872a;
        }

        a(int i10) {
            this.f62872a = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.e() == i10) {
                    return aVar;
                }
            }
            return UNKNOWN;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        if (!this.f62867d.equals(n10.f62867d)) {
            return false;
        }
        String str = this.f62865b;
        if (str == null) {
            return n10.f62865b == null;
        }
        String str2 = n10.f62865b;
        return str2 != null && str.compareTo(str2) == 0;
    }

    public a a() {
        return this.f62864a;
    }

    public final String b() {
        return this.f62865b;
    }

    public final String c() {
        return this.f62866c;
    }

    public final String d() {
        return this.f62867d;
    }

    public int hashCode() {
        return ((527 + this.f62865b.hashCode()) * 31) + this.f62867d.hashCode();
    }

    public N(String str, String str2, String str3, a aVar) {
        if (!g6.i.a(str2)) {
            if (g6.i.a(str3)) {
                R5.t.a("MobileCore", "VisitorID", "The custom VisitorID should not have null/empty id, this VisitorID will be ignored", new Object[0]);
            }
            this.f62866c = str;
            this.f62867d = str2;
            this.f62865b = str3;
            this.f62864a = aVar;
            return;
        }
        throw new IllegalStateException("idType parameter cannot be null or empty");
    }
}
