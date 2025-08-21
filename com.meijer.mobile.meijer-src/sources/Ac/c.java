package Ac;

import Ac.f;
import java.util.Set;

/* loaded from: classes4.dex */
final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f235a;

    /* renamed from: b, reason: collision with root package name */
    private final long f236b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<f.c> f237c;

    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f238a;

        /* renamed from: b, reason: collision with root package name */
        private Long f239b;

        /* renamed from: c, reason: collision with root package name */
        private Set<f.c> f240c;

        @Override // Ac.f.b.a
        public f.b a() {
            String str = "";
            if (this.f238a == null) {
                str = " delta";
            }
            if (this.f239b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f240c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f238a.longValue(), this.f239b.longValue(), this.f240c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Ac.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f240c = set;
            return this;
        }

        b() {
        }

        @Override // Ac.f.b.a
        public f.b.a b(long j10) {
            this.f238a = Long.valueOf(j10);
            return this;
        }

        @Override // Ac.f.b.a
        public f.b.a d(long j10) {
            this.f239b = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f235a == bVar.b() && this.f236b == bVar.d() && this.f237c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    private c(long j10, long j11, Set<f.c> set) {
        this.f235a = j10;
        this.f236b = j11;
        this.f237c = set;
    }

    @Override // Ac.f.b
    long b() {
        return this.f235a;
    }

    @Override // Ac.f.b
    Set<f.c> c() {
        return this.f237c;
    }

    @Override // Ac.f.b
    long d() {
        return this.f236b;
    }

    public int hashCode() {
        long j10 = this.f235a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f236b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f237c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f235a + ", maxAllowedDelay=" + this.f236b + ", flags=" + this.f237c + "}";
    }
}
