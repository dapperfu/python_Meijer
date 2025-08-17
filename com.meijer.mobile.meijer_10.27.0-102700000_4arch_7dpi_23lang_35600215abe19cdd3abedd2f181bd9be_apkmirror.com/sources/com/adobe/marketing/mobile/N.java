package com.adobe.marketing.mobile;

/* loaded from: classes4.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    private final a f62025a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62026b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62027c;

    /* renamed from: d, reason: collision with root package name */
    private final String f62028d;

    public enum a {
        UNKNOWN(0),
        AUTHENTICATED(1),
        LOGGED_OUT(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f62033a;

        public int e() {
            return this.f62033a;
        }

        a(int i10) {
            this.f62033a = i10;
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
        if (!this.f62028d.equals(n10.f62028d)) {
            return false;
        }
        String str = this.f62026b;
        if (str == null) {
            return n10.f62026b == null;
        }
        String str2 = n10.f62026b;
        return str2 != null && str.compareTo(str2) == 0;
    }

    public a a() {
        return this.f62025a;
    }

    public final String b() {
        return this.f62026b;
    }

    public final String c() {
        return this.f62027c;
    }

    public final String d() {
        return this.f62028d;
    }

    public int hashCode() {
        return ((527 + this.f62026b.hashCode()) * 31) + this.f62028d.hashCode();
    }

    public N(String str, String str2, String str3, a aVar) {
        if (!f6.i.a(str2)) {
            if (f6.i.a(str3)) {
                Q5.t.a("MobileCore", "VisitorID", "The custom VisitorID should not have null/empty id, this VisitorID will be ignored", new Object[0]);
            }
            this.f62027c = str;
            this.f62028d = str2;
            this.f62026b = str3;
            this.f62025a = aVar;
            return;
        }
        throw new IllegalStateException("idType parameter cannot be null or empty");
    }
}
