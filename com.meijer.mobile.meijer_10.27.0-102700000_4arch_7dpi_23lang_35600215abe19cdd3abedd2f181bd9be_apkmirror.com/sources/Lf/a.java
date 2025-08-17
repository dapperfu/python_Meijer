package Lf;

import Lf.c;
import Lf.d;

/* loaded from: classes7.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f18073b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f18074c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18075d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18076e;

    /* renamed from: f, reason: collision with root package name */
    private final long f18077f;

    /* renamed from: g, reason: collision with root package name */
    private final long f18078g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18079h;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f18080a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f18081b;

        /* renamed from: c, reason: collision with root package name */
        private String f18082c;

        /* renamed from: d, reason: collision with root package name */
        private String f18083d;

        /* renamed from: e, reason: collision with root package name */
        private long f18084e;

        /* renamed from: f, reason: collision with root package name */
        private long f18085f;

        /* renamed from: g, reason: collision with root package name */
        private String f18086g;

        /* renamed from: h, reason: collision with root package name */
        private byte f18087h;

        b() {
        }

        @Override // Lf.d.a
        public d a() {
            if (this.f18087h == 3 && this.f18081b != null) {
                return new a(this.f18080a, this.f18081b, this.f18082c, this.f18083d, this.f18084e, this.f18085f, this.f18086g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18081b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f18087h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f18087h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // Lf.d.a
        public d.a b(String str) {
            this.f18082c = str;
            return this;
        }

        @Override // Lf.d.a
        public d.a c(long j10) {
            this.f18084e = j10;
            this.f18087h = (byte) (this.f18087h | 1);
            return this;
        }

        @Override // Lf.d.a
        public d.a d(String str) {
            this.f18080a = str;
            return this;
        }

        @Override // Lf.d.a
        public d.a e(String str) {
            this.f18086g = str;
            return this;
        }

        @Override // Lf.d.a
        public d.a f(String str) {
            this.f18083d = str;
            return this;
        }

        @Override // Lf.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f18081b = aVar;
            return this;
        }

        @Override // Lf.d.a
        public d.a h(long j10) {
            this.f18085f = j10;
            this.f18087h = (byte) (this.f18087h | 2);
            return this;
        }

        private b(d dVar) {
            this.f18080a = dVar.d();
            this.f18081b = dVar.g();
            this.f18082c = dVar.b();
            this.f18083d = dVar.f();
            this.f18084e = dVar.c();
            this.f18085f = dVar.h();
            this.f18086g = dVar.e();
            this.f18087h = (byte) 3;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f18073b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f18074c.equals(dVar.g()) && ((str = this.f18075d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f18076e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f18077f == dVar.c() && this.f18078g == dVar.h() && ((str3 = this.f18079h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f18073b = str;
        this.f18074c = aVar;
        this.f18075d = str2;
        this.f18076e = str3;
        this.f18077f = j10;
        this.f18078g = j11;
        this.f18079h = str4;
    }

    @Override // Lf.d
    public String b() {
        return this.f18075d;
    }

    @Override // Lf.d
    public long c() {
        return this.f18077f;
    }

    @Override // Lf.d
    public String d() {
        return this.f18073b;
    }

    @Override // Lf.d
    public String e() {
        return this.f18079h;
    }

    @Override // Lf.d
    public String f() {
        return this.f18076e;
    }

    @Override // Lf.d
    public c.a g() {
        return this.f18074c;
    }

    @Override // Lf.d
    public long h() {
        return this.f18078g;
    }

    public int hashCode() {
        String str = this.f18073b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f18074c.hashCode()) * 1000003;
        String str2 = this.f18075d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18076e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f18077f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f18078g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f18079h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // Lf.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f18073b + ", registrationStatus=" + this.f18074c + ", authToken=" + this.f18075d + ", refreshToken=" + this.f18076e + ", expiresInSecs=" + this.f18077f + ", tokenCreationEpochInSecs=" + this.f18078g + ", fisError=" + this.f18079h + "}";
    }
}
