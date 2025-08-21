package com.adobe.marketing.mobile;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adobe.marketing.mobile.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6574h {

    /* renamed from: a, reason: collision with root package name */
    private String f63315a;

    /* renamed from: b, reason: collision with root package name */
    private String f63316b;

    /* renamed from: c, reason: collision with root package name */
    private String f63317c;

    /* renamed from: d, reason: collision with root package name */
    private String f63318d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f63319e;

    /* renamed from: f, reason: collision with root package name */
    private long f63320f;

    /* renamed from: g, reason: collision with root package name */
    private String f63321g;

    /* renamed from: h, reason: collision with root package name */
    private String f63322h;

    /* renamed from: i, reason: collision with root package name */
    private String[] f63323i;

    /* renamed from: com.adobe.marketing.mobile.h$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C6574h f63324a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f63325b;

        public b(String str, String str2, String str3) {
            this(str, str2, str3, null);
        }

        public b(String str, String str2, String str3, String[] strArr) {
            C6574h c6574h = new C6574h();
            this.f63324a = c6574h;
            c6574h.f63315a = str;
            c6574h.f63316b = UUID.randomUUID().toString();
            c6574h.f63318d = str2;
            c6574h.f63317c = str3;
            c6574h.f63321g = null;
            c6574h.f63322h = null;
            c6574h.f63323i = strArr;
            this.f63325b = false;
        }

        private void i() {
            if (this.f63325b) {
                throw new UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
            }
        }

        b h(String str) {
            if (str == null) {
                return this;
            }
            i();
            this.f63324a.f63316b = str;
            return this;
        }

        public C6574h a() {
            i();
            this.f63325b = true;
            if (this.f63324a.f63318d != null && this.f63324a.f63317c != null) {
                if (this.f63324a.f63320f == 0) {
                    this.f63324a.f63320f = System.currentTimeMillis();
                }
                return this.f63324a;
            }
            return null;
        }

        public b b(C6574h c6574h) {
            i();
            if (c6574h != null) {
                this.f63324a.f63322h = c6574h.x();
                return this;
            }
            throw new NullPointerException("parentEvent cannot be null");
        }

        public b c(C6574h c6574h) {
            i();
            if (c6574h != null) {
                f(c6574h.f63316b);
                b(c6574h);
                return this;
            }
            throw new NullPointerException("requestEvent is null");
        }

        public b d(Map<String, Object> map) {
            i();
            try {
                this.f63324a.f63319e = com.adobe.marketing.mobile.util.a.f(map);
                return this;
            } catch (Exception e10) {
                R5.t.f("MobileCore", "EventBuilder", "Event data couldn't be serialized, empty data was set instead %s", e10);
                return this;
            }
        }

        b e(String str) {
            i();
            this.f63324a.f63322h = str;
            return this;
        }

        b f(String str) {
            i();
            this.f63324a.f63321g = str;
            return this;
        }

        b g(long j10) {
            i();
            this.f63324a.f63320f = j10;
            return this;
        }
    }

    private C6574h() {
    }

    public C6574h n(Map<String, Object> map) {
        C6574h c6574hA = new b(this.f63315a, this.f63318d, this.f63317c, this.f63323i).d(map).a();
        c6574hA.f63316b = this.f63316b;
        c6574hA.f63320f = this.f63320f;
        c6574hA.f63321g = this.f63321g;
        return c6574hA;
    }

    public Map<String, Object> o() {
        return this.f63319e;
    }

    public String[] p() {
        return this.f63323i;
    }

    public String q() {
        return this.f63315a;
    }

    public String r() {
        return this.f63322h;
    }

    public String s() {
        return this.f63321g;
    }

    public String t() {
        return this.f63317c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        sb2.append("\n");
        sb2.append("    class: Event");
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    name: ");
        sb2.append(this.f63315a);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    uniqueIdentifier: ");
        sb2.append(this.f63316b);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    source: ");
        sb2.append(this.f63317c);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    type: ");
        sb2.append(this.f63318d);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    responseId: ");
        sb2.append(this.f63321g);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    parentId: ");
        sb2.append(this.f63322h);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    timestamp: ");
        sb2.append(this.f63320f);
        sb2.append(",");
        sb2.append("\n");
        Map<String, Object> map = this.f63319e;
        String strG = map == null ? "{}" : M5.j.g(map);
        sb2.append("    data: ");
        sb2.append(strG);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    mask: ");
        sb2.append(Arrays.toString(this.f63323i));
        sb2.append(",");
        sb2.append("\n");
        sb2.append("}");
        return sb2.toString();
    }

    public long u() {
        return this.f63320f;
    }

    public long v() {
        return TimeUnit.MILLISECONDS.toSeconds(this.f63320f);
    }

    public String w() {
        return this.f63318d;
    }

    public String x() {
        return this.f63316b;
    }
}
