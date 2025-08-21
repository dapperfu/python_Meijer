package tc;

import java.util.Arrays;
import java.util.Map;
import tc.i;

/* renamed from: tc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17220b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f162419a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f162420b;

    /* renamed from: c, reason: collision with root package name */
    private final h f162421c;

    /* renamed from: d, reason: collision with root package name */
    private final long f162422d;

    /* renamed from: e, reason: collision with root package name */
    private final long f162423e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f162424f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f162425g;

    /* renamed from: h, reason: collision with root package name */
    private final String f162426h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f162427i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f162428j;

    /* renamed from: tc.b$b, reason: collision with other inner class name */
    static final class C2551b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f162429a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f162430b;

        /* renamed from: c, reason: collision with root package name */
        private h f162431c;

        /* renamed from: d, reason: collision with root package name */
        private Long f162432d;

        /* renamed from: e, reason: collision with root package name */
        private Long f162433e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f162434f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f162435g;

        /* renamed from: h, reason: collision with root package name */
        private String f162436h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f162437i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f162438j;

        @Override // tc.i.a
        public i d() {
            String str = "";
            if (this.f162429a == null) {
                str = " transportName";
            }
            if (this.f162431c == null) {
                str = str + " encodedPayload";
            }
            if (this.f162432d == null) {
                str = str + " eventMillis";
            }
            if (this.f162433e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f162434f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C17220b(this.f162429a, this.f162430b, this.f162431c, this.f162432d.longValue(), this.f162433e.longValue(), this.f162434f, this.f162435g, this.f162436h, this.f162437i, this.f162438j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // tc.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f162434f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // tc.i.a
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f162434f = map;
            return this;
        }

        @Override // tc.i.a
        public i.a g(Integer num) {
            this.f162430b = num;
            return this;
        }

        @Override // tc.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f162431c = hVar;
            return this;
        }

        @Override // tc.i.a
        public i.a j(byte[] bArr) {
            this.f162437i = bArr;
            return this;
        }

        @Override // tc.i.a
        public i.a k(byte[] bArr) {
            this.f162438j = bArr;
            return this;
        }

        @Override // tc.i.a
        public i.a l(Integer num) {
            this.f162435g = num;
            return this;
        }

        @Override // tc.i.a
        public i.a m(String str) {
            this.f162436h = str;
            return this;
        }

        @Override // tc.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f162429a = str;
            return this;
        }

        C2551b() {
        }

        @Override // tc.i.a
        public i.a i(long j10) {
            this.f162432d = Long.valueOf(j10);
            return this;
        }

        @Override // tc.i.a
        public i.a o(long j10) {
            this.f162433e = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f162419a.equals(iVar.n()) && ((num = this.f162420b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f162421c.equals(iVar.e()) && this.f162422d == iVar.f() && this.f162423e == iVar.o() && this.f162424f.equals(iVar.c()) && ((num2 = this.f162425g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f162426h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
                boolean z10 = iVar instanceof C17220b;
                if (Arrays.equals(this.f162427i, z10 ? ((C17220b) iVar).f162427i : iVar.g())) {
                    if (Arrays.equals(this.f162428j, z10 ? ((C17220b) iVar).f162428j : iVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private C17220b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f162419a = str;
        this.f162420b = num;
        this.f162421c = hVar;
        this.f162422d = j10;
        this.f162423e = j11;
        this.f162424f = map;
        this.f162425g = num2;
        this.f162426h = str2;
        this.f162427i = bArr;
        this.f162428j = bArr2;
    }

    @Override // tc.i
    protected Map<String, String> c() {
        return this.f162424f;
    }

    @Override // tc.i
    public Integer d() {
        return this.f162420b;
    }

    @Override // tc.i
    public h e() {
        return this.f162421c;
    }

    @Override // tc.i
    public long f() {
        return this.f162422d;
    }

    @Override // tc.i
    public byte[] g() {
        return this.f162427i;
    }

    @Override // tc.i
    public byte[] h() {
        return this.f162428j;
    }

    public int hashCode() {
        int iHashCode = (this.f162419a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f162420b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f162421c.hashCode()) * 1000003;
        long j10 = this.f162422d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f162423e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f162424f.hashCode()) * 1000003;
        Integer num2 = this.f162425g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f162426h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f162427i)) * 1000003) ^ Arrays.hashCode(this.f162428j);
    }

    @Override // tc.i
    public Integer l() {
        return this.f162425g;
    }

    @Override // tc.i
    public String m() {
        return this.f162426h;
    }

    @Override // tc.i
    public String n() {
        return this.f162419a;
    }

    @Override // tc.i
    public long o() {
        return this.f162423e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f162419a + ", code=" + this.f162420b + ", encodedPayload=" + this.f162421c + ", eventMillis=" + this.f162422d + ", uptimeMillis=" + this.f162423e + ", autoMetadata=" + this.f162424f + ", productId=" + this.f162425g + ", pseudonymousId=" + this.f162426h + ", experimentIdsClear=" + Arrays.toString(this.f162427i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f162428j) + "}";
    }
}
