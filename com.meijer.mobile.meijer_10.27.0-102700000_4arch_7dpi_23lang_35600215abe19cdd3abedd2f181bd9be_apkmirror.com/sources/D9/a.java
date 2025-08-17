package D9;

import java.util.HashMap;
import java.util.Map;
import s9.C16914a;
import t9.C17074a;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5079a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5080b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f5081c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5082d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5083e;

    /* renamed from: D9.a$a, reason: collision with other inner class name */
    public static class C0096a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5084a;

        /* renamed from: b, reason: collision with root package name */
        private String f5085b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<String, Object> f5086c;

        /* renamed from: d, reason: collision with root package name */
        private final long f5087d;

        /* renamed from: e, reason: collision with root package name */
        private long f5088e;

        public a a() {
            return new a(this.f5084a, this.f5085b, this.f5086c, this.f5087d, this.f5088e);
        }

        public C0096a b(Map<String, Object> map) {
            this.f5086c.putAll(map);
            return this;
        }

        public C0096a c(String str) {
            this.f5085b = str;
            return this;
        }

        public C0096a(C16914a c16914a, C17074a c17074a) {
            G9.b.c(c16914a, "TimestampProvider must not be null!");
            G9.b.c(c17074a, "UuidProvider must not be null!");
            this.f5087d = c16914a.a();
            this.f5088e = Long.MAX_VALUE;
            this.f5084a = c17074a.a();
            this.f5086c = new HashMap();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5082d != aVar.f5082d || this.f5083e != aVar.f5083e) {
                return false;
            }
            String str = this.f5079a;
            if (str == null ? aVar.f5079a != null : !str.equals(aVar.f5079a)) {
                return false;
            }
            String str2 = this.f5080b;
            if (str2 == null ? aVar.f5080b != null : !str2.equals(aVar.f5080b)) {
                return false;
            }
            Map<String, Object> map = this.f5081c;
            Map<String, Object> map2 = aVar.f5081c;
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
        return this.f5081c;
    }

    public String b() {
        return this.f5079a;
    }

    public long c() {
        return this.f5082d;
    }

    public long d() {
        return this.f5083e;
    }

    public String e() {
        return this.f5080b;
    }

    public int hashCode() {
        String str = this.f5079a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5080b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, Object> map = this.f5081c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f5082d;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f5083e;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "ShardModel{id='" + this.f5079a + "', type='" + this.f5080b + "', data=" + this.f5081c + ", timestamp=" + this.f5082d + ", ttl=" + this.f5083e + '}';
    }

    public a(String str, String str2, Map<String, Object> map, long j10, long j11) {
        G9.b.c(str2, "Type must not be null!");
        G9.b.c(map, "Data must not be null!");
        G9.b.c(str, "ID must not be null!");
        this.f5079a = str;
        this.f5080b = str2;
        this.f5081c = map;
        this.f5082d = j10;
        this.f5083e = j11;
    }
}
