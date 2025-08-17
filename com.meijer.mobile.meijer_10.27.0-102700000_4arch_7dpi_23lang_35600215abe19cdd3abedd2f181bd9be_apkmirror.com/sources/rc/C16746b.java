package rc;

import java.util.Arrays;
import java.util.Map;
import rc.i;

/* renamed from: rc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16746b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f157929a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f157930b;

    /* renamed from: c, reason: collision with root package name */
    private final h f157931c;

    /* renamed from: d, reason: collision with root package name */
    private final long f157932d;

    /* renamed from: e, reason: collision with root package name */
    private final long f157933e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f157934f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f157935g;

    /* renamed from: h, reason: collision with root package name */
    private final String f157936h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f157937i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f157938j;

    /* renamed from: rc.b$b, reason: collision with other inner class name */
    static final class C2445b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f157939a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f157940b;

        /* renamed from: c, reason: collision with root package name */
        private h f157941c;

        /* renamed from: d, reason: collision with root package name */
        private Long f157942d;

        /* renamed from: e, reason: collision with root package name */
        private Long f157943e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f157944f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f157945g;

        /* renamed from: h, reason: collision with root package name */
        private String f157946h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f157947i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f157948j;

        @Override // rc.i.a
        public i d() {
            String str = "";
            if (this.f157939a == null) {
                str = " transportName";
            }
            if (this.f157941c == null) {
                str = str + " encodedPayload";
            }
            if (this.f157942d == null) {
                str = str + " eventMillis";
            }
            if (this.f157943e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f157944f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C16746b(this.f157939a, this.f157940b, this.f157941c, this.f157942d.longValue(), this.f157943e.longValue(), this.f157944f, this.f157945g, this.f157946h, this.f157947i, this.f157948j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // rc.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f157944f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // rc.i.a
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f157944f = map;
            return this;
        }

        @Override // rc.i.a
        public i.a g(Integer num) {
            this.f157940b = num;
            return this;
        }

        @Override // rc.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f157941c = hVar;
            return this;
        }

        @Override // rc.i.a
        public i.a j(byte[] bArr) {
            this.f157947i = bArr;
            return this;
        }

        @Override // rc.i.a
        public i.a k(byte[] bArr) {
            this.f157948j = bArr;
            return this;
        }

        @Override // rc.i.a
        public i.a l(Integer num) {
            this.f157945g = num;
            return this;
        }

        @Override // rc.i.a
        public i.a m(String str) {
            this.f157946h = str;
            return this;
        }

        @Override // rc.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f157939a = str;
            return this;
        }

        C2445b() {
        }

        @Override // rc.i.a
        public i.a i(long j10) {
            this.f157942d = Long.valueOf(j10);
            return this;
        }

        @Override // rc.i.a
        public i.a o(long j10) {
            this.f157943e = Long.valueOf(j10);
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
            if (this.f157929a.equals(iVar.n()) && ((num = this.f157930b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f157931c.equals(iVar.e()) && this.f157932d == iVar.f() && this.f157933e == iVar.o() && this.f157934f.equals(iVar.c()) && ((num2 = this.f157935g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f157936h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
                boolean z10 = iVar instanceof C16746b;
                if (Arrays.equals(this.f157937i, z10 ? ((C16746b) iVar).f157937i : iVar.g())) {
                    if (Arrays.equals(this.f157938j, z10 ? ((C16746b) iVar).f157938j : iVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private C16746b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f157929a = str;
        this.f157930b = num;
        this.f157931c = hVar;
        this.f157932d = j10;
        this.f157933e = j11;
        this.f157934f = map;
        this.f157935g = num2;
        this.f157936h = str2;
        this.f157937i = bArr;
        this.f157938j = bArr2;
    }

    @Override // rc.i
    protected Map<String, String> c() {
        return this.f157934f;
    }

    @Override // rc.i
    public Integer d() {
        return this.f157930b;
    }

    @Override // rc.i
    public h e() {
        return this.f157931c;
    }

    @Override // rc.i
    public long f() {
        return this.f157932d;
    }

    @Override // rc.i
    public byte[] g() {
        return this.f157937i;
    }

    @Override // rc.i
    public byte[] h() {
        return this.f157938j;
    }

    public int hashCode() {
        int iHashCode = (this.f157929a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f157930b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f157931c.hashCode()) * 1000003;
        long j10 = this.f157932d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f157933e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f157934f.hashCode()) * 1000003;
        Integer num2 = this.f157935g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f157936h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f157937i)) * 1000003) ^ Arrays.hashCode(this.f157938j);
    }

    @Override // rc.i
    public Integer l() {
        return this.f157935g;
    }

    @Override // rc.i
    public String m() {
        return this.f157936h;
    }

    @Override // rc.i
    public String n() {
        return this.f157929a;
    }

    @Override // rc.i
    public long o() {
        return this.f157933e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f157929a + ", code=" + this.f157930b + ", encodedPayload=" + this.f157931c + ", eventMillis=" + this.f157932d + ", uptimeMillis=" + this.f157933e + ", autoMetadata=" + this.f157934f + ", productId=" + this.f157935g + ", pseudonymousId=" + this.f157936h + ", experimentIdsClear=" + Arrays.toString(this.f157937i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f157938j) + "}";
    }
}
