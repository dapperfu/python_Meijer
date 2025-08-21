package Of;

import Of.f;

/* loaded from: classes8.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f23700a;

    /* renamed from: b, reason: collision with root package name */
    private final long f23701b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f23702c;

    /* renamed from: Of.b$b, reason: collision with other inner class name */
    static final class C0382b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f23703a;

        /* renamed from: b, reason: collision with root package name */
        private long f23704b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f23705c;

        /* renamed from: d, reason: collision with root package name */
        private byte f23706d;

        @Override // Of.f.a
        public f a() {
            if (this.f23706d == 1) {
                return new b(this.f23703a, this.f23704b, this.f23705c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // Of.f.a
        public f.a b(f.b bVar) {
            this.f23705c = bVar;
            return this;
        }

        @Override // Of.f.a
        public f.a c(String str) {
            this.f23703a = str;
            return this;
        }

        @Override // Of.f.a
        public f.a d(long j10) {
            this.f23704b = j10;
            this.f23706d = (byte) (this.f23706d | 1);
            return this;
        }

        C0382b() {
        }
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f23700a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f23701b == fVar.d() && ((bVar = this.f23702c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private b(String str, long j10, f.b bVar) {
        this.f23700a = str;
        this.f23701b = j10;
        this.f23702c = bVar;
    }

    @Override // Of.f
    public f.b b() {
        return this.f23702c;
    }

    @Override // Of.f
    public String c() {
        return this.f23700a;
    }

    @Override // Of.f
    public long d() {
        return this.f23701b;
    }

    public int hashCode() {
        String str = this.f23700a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f23701b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f23702c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f23700a + ", tokenExpirationTimestamp=" + this.f23701b + ", responseCode=" + this.f23702c + "}";
    }
}
