package Nf;

import Nf.c;
import Nf.d;

/* loaded from: classes8.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f20893b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f20894c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20895d;

    /* renamed from: e, reason: collision with root package name */
    private final String f20896e;

    /* renamed from: f, reason: collision with root package name */
    private final long f20897f;

    /* renamed from: g, reason: collision with root package name */
    private final long f20898g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20899h;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f20900a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f20901b;

        /* renamed from: c, reason: collision with root package name */
        private String f20902c;

        /* renamed from: d, reason: collision with root package name */
        private String f20903d;

        /* renamed from: e, reason: collision with root package name */
        private long f20904e;

        /* renamed from: f, reason: collision with root package name */
        private long f20905f;

        /* renamed from: g, reason: collision with root package name */
        private String f20906g;

        /* renamed from: h, reason: collision with root package name */
        private byte f20907h;

        b() {
        }

        @Override // Nf.d.a
        public d a() {
            if (this.f20907h == 3 && this.f20901b != null) {
                return new a(this.f20900a, this.f20901b, this.f20902c, this.f20903d, this.f20904e, this.f20905f, this.f20906g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f20901b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f20907h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f20907h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // Nf.d.a
        public d.a b(String str) {
            this.f20902c = str;
            return this;
        }

        @Override // Nf.d.a
        public d.a c(long j10) {
            this.f20904e = j10;
            this.f20907h = (byte) (this.f20907h | 1);
            return this;
        }

        @Override // Nf.d.a
        public d.a d(String str) {
            this.f20900a = str;
            return this;
        }

        @Override // Nf.d.a
        public d.a e(String str) {
            this.f20906g = str;
            return this;
        }

        @Override // Nf.d.a
        public d.a f(String str) {
            this.f20903d = str;
            return this;
        }

        @Override // Nf.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f20901b = aVar;
            return this;
        }

        @Override // Nf.d.a
        public d.a h(long j10) {
            this.f20905f = j10;
            this.f20907h = (byte) (this.f20907h | 2);
            return this;
        }

        private b(d dVar) {
            this.f20900a = dVar.d();
            this.f20901b = dVar.g();
            this.f20902c = dVar.b();
            this.f20903d = dVar.f();
            this.f20904e = dVar.c();
            this.f20905f = dVar.h();
            this.f20906g = dVar.e();
            this.f20907h = (byte) 3;
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
            String str4 = this.f20893b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f20894c.equals(dVar.g()) && ((str = this.f20895d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f20896e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f20897f == dVar.c() && this.f20898g == dVar.h() && ((str3 = this.f20899h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f20893b = str;
        this.f20894c = aVar;
        this.f20895d = str2;
        this.f20896e = str3;
        this.f20897f = j10;
        this.f20898g = j11;
        this.f20899h = str4;
    }

    @Override // Nf.d
    public String b() {
        return this.f20895d;
    }

    @Override // Nf.d
    public long c() {
        return this.f20897f;
    }

    @Override // Nf.d
    public String d() {
        return this.f20893b;
    }

    @Override // Nf.d
    public String e() {
        return this.f20899h;
    }

    @Override // Nf.d
    public String f() {
        return this.f20896e;
    }

    @Override // Nf.d
    public c.a g() {
        return this.f20894c;
    }

    @Override // Nf.d
    public long h() {
        return this.f20898g;
    }

    public int hashCode() {
        String str = this.f20893b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f20894c.hashCode()) * 1000003;
        String str2 = this.f20895d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20896e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f20897f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f20898g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f20899h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // Nf.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f20893b + ", registrationStatus=" + this.f20894c + ", authToken=" + this.f20895d + ", refreshToken=" + this.f20896e + ", expiresInSecs=" + this.f20897f + ", tokenCreationEpochInSecs=" + this.f20898g + ", fisError=" + this.f20899h + "}";
    }
}
