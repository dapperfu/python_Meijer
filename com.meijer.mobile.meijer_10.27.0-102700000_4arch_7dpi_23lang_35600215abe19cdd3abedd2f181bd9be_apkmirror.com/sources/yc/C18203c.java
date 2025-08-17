package yc;

import java.util.Set;
import yc.f;

/* renamed from: yc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C18203c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f170386a;

    /* renamed from: b, reason: collision with root package name */
    private final long f170387b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<f.c> f170388c;

    /* renamed from: yc.c$b */
    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f170389a;

        /* renamed from: b, reason: collision with root package name */
        private Long f170390b;

        /* renamed from: c, reason: collision with root package name */
        private Set<f.c> f170391c;

        @Override // yc.f.b.a
        public f.b a() {
            String str = "";
            if (this.f170389a == null) {
                str = " delta";
            }
            if (this.f170390b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f170391c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C18203c(this.f170389a.longValue(), this.f170390b.longValue(), this.f170391c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // yc.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f170391c = set;
            return this;
        }

        b() {
        }

        @Override // yc.f.b.a
        public f.b.a b(long j10) {
            this.f170389a = Long.valueOf(j10);
            return this;
        }

        @Override // yc.f.b.a
        public f.b.a d(long j10) {
            this.f170390b = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f170386a == bVar.b() && this.f170387b == bVar.d() && this.f170388c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    private C18203c(long j10, long j11, Set<f.c> set) {
        this.f170386a = j10;
        this.f170387b = j11;
        this.f170388c = set;
    }

    @Override // yc.f.b
    long b() {
        return this.f170386a;
    }

    @Override // yc.f.b
    Set<f.c> c() {
        return this.f170388c;
    }

    @Override // yc.f.b
    long d() {
        return this.f170387b;
    }

    public int hashCode() {
        long j10 = this.f170386a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f170387b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f170388c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f170386a + ", maxAllowedDelay=" + this.f170387b + ", flags=" + this.f170388c + "}";
    }
}
