package com.adobe.marketing.mobile;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adobe.marketing.mobile.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6449h {

    /* renamed from: a, reason: collision with root package name */
    private String f62476a;

    /* renamed from: b, reason: collision with root package name */
    private String f62477b;

    /* renamed from: c, reason: collision with root package name */
    private String f62478c;

    /* renamed from: d, reason: collision with root package name */
    private String f62479d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f62480e;

    /* renamed from: f, reason: collision with root package name */
    private long f62481f;

    /* renamed from: g, reason: collision with root package name */
    private String f62482g;

    /* renamed from: h, reason: collision with root package name */
    private String f62483h;

    /* renamed from: i, reason: collision with root package name */
    private String[] f62484i;

    /* renamed from: com.adobe.marketing.mobile.h$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C6449h f62485a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f62486b;

        public b(String str, String str2, String str3) {
            this(str, str2, str3, null);
        }

        public b(String str, String str2, String str3, String[] strArr) {
            C6449h c6449h = new C6449h();
            this.f62485a = c6449h;
            c6449h.f62476a = str;
            c6449h.f62477b = UUID.randomUUID().toString();
            c6449h.f62479d = str2;
            c6449h.f62478c = str3;
            c6449h.f62482g = null;
            c6449h.f62483h = null;
            c6449h.f62484i = strArr;
            this.f62486b = false;
        }

        private void i() {
            if (this.f62486b) {
                throw new UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
            }
        }

        b h(String str) {
            if (str == null) {
                return this;
            }
            i();
            this.f62485a.f62477b = str;
            return this;
        }

        public C6449h a() {
            i();
            this.f62486b = true;
            if (this.f62485a.f62479d != null && this.f62485a.f62478c != null) {
                if (this.f62485a.f62481f == 0) {
                    this.f62485a.f62481f = System.currentTimeMillis();
                }
                return this.f62485a;
            }
            return null;
        }

        public b b(C6449h c6449h) {
            i();
            if (c6449h != null) {
                this.f62485a.f62483h = c6449h.x();
                return this;
            }
            throw new NullPointerException("parentEvent cannot be null");
        }

        public b c(C6449h c6449h) {
            i();
            if (c6449h != null) {
                f(c6449h.f62477b);
                b(c6449h);
                return this;
            }
            throw new NullPointerException("requestEvent is null");
        }

        public b d(Map<String, Object> map) {
            i();
            try {
                this.f62485a.f62480e = com.adobe.marketing.mobile.util.a.f(map);
                return this;
            } catch (Exception e10) {
                Q5.t.f("MobileCore", "EventBuilder", "Event data couldn't be serialized, empty data was set instead %s", e10);
                return this;
            }
        }

        b e(String str) {
            i();
            this.f62485a.f62483h = str;
            return this;
        }

        b f(String str) {
            i();
            this.f62485a.f62482g = str;
            return this;
        }

        b g(long j10) {
            i();
            this.f62485a.f62481f = j10;
            return this;
        }
    }

    private C6449h() {
    }

    public C6449h n(Map<String, Object> map) {
        C6449h c6449hA = new b(this.f62476a, this.f62479d, this.f62478c, this.f62484i).d(map).a();
        c6449hA.f62477b = this.f62477b;
        c6449hA.f62481f = this.f62481f;
        c6449hA.f62482g = this.f62482g;
        return c6449hA;
    }

    public Map<String, Object> o() {
        return this.f62480e;
    }

    public String[] p() {
        return this.f62484i;
    }

    public String q() {
        return this.f62476a;
    }

    public String r() {
        return this.f62483h;
    }

    public String s() {
        return this.f62482g;
    }

    public String t() {
        return this.f62478c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        sb2.append("\n");
        sb2.append("    class: Event");
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    name: ");
        sb2.append(this.f62476a);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    uniqueIdentifier: ");
        sb2.append(this.f62477b);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    source: ");
        sb2.append(this.f62478c);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    type: ");
        sb2.append(this.f62479d);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    responseId: ");
        sb2.append(this.f62482g);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    parentId: ");
        sb2.append(this.f62483h);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    timestamp: ");
        sb2.append(this.f62481f);
        sb2.append(",");
        sb2.append("\n");
        Map<String, Object> map = this.f62480e;
        String strG = map == null ? "{}" : L5.j.g(map);
        sb2.append("    data: ");
        sb2.append(strG);
        sb2.append(",");
        sb2.append("\n");
        sb2.append("    mask: ");
        sb2.append(Arrays.toString(this.f62484i));
        sb2.append(",");
        sb2.append("\n");
        sb2.append("}");
        return sb2.toString();
    }

    public long u() {
        return this.f62481f;
    }

    public long v() {
        return TimeUnit.MILLISECONDS.toSeconds(this.f62481f);
    }

    public String w() {
        return this.f62479d;
    }

    public String x() {
        return this.f62477b;
    }
}
