package F9;

import java.util.HashMap;
import java.util.Map;
import u9.C17361a;
import v9.C17649a;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f9112a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9113b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f9114c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9115d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9116e;

    /* renamed from: F9.a$a, reason: collision with other inner class name */
    public static class C0171a {

        /* renamed from: a, reason: collision with root package name */
        private final String f9117a;

        /* renamed from: b, reason: collision with root package name */
        private String f9118b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<String, Object> f9119c;

        /* renamed from: d, reason: collision with root package name */
        private final long f9120d;

        /* renamed from: e, reason: collision with root package name */
        private long f9121e;

        public a a() {
            return new a(this.f9117a, this.f9118b, this.f9119c, this.f9120d, this.f9121e);
        }

        public C0171a b(Map<String, Object> map) {
            this.f9119c.putAll(map);
            return this;
        }

        public C0171a c(String str) {
            this.f9118b = str;
            return this;
        }

        public C0171a(C17361a c17361a, C17649a c17649a) {
            I9.b.c(c17361a, "TimestampProvider must not be null!");
            I9.b.c(c17649a, "UuidProvider must not be null!");
            this.f9120d = c17361a.a();
            this.f9121e = Long.MAX_VALUE;
            this.f9117a = c17649a.a();
            this.f9119c = new HashMap();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9115d != aVar.f9115d || this.f9116e != aVar.f9116e) {
                return false;
            }
            String str = this.f9112a;
            if (str == null ? aVar.f9112a != null : !str.equals(aVar.f9112a)) {
                return false;
            }
            String str2 = this.f9113b;
            if (str2 == null ? aVar.f9113b != null : !str2.equals(aVar.f9113b)) {
                return false;
            }
            Map<String, Object> map = this.f9114c;
            Map<String, Object> map2 = aVar.f9114c;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
        }
        return false;
    }

    public Map<String, Object> a() {
        return this.f9114c;
    }

    public String b() {
        return this.f9112a;
    }

    public long c() {
        return this.f9115d;
    }

    public long d() {
        return this.f9116e;
    }

    public String e() {
        return this.f9113b;
    }

    public int hashCode() {
        String str = this.f9112a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9113b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, Object> map = this.f9114c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f9115d;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f9116e;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "ShardModel{id='" + this.f9112a + "', type='" + this.f9113b + "', data=" + this.f9114c + ", timestamp=" + this.f9115d + ", ttl=" + this.f9116e + '}';
    }

    public a(String str, String str2, Map<String, Object> map, long j10, long j11) {
        I9.b.c(str2, "Type must not be null!");
        I9.b.c(map, "Data must not be null!");
        I9.b.c(str, "ID must not be null!");
        this.f9112a = str;
        this.f9113b = str2;
        this.f9114c = map;
        this.f9115d = j10;
        this.f9116e = j11;
    }
}
