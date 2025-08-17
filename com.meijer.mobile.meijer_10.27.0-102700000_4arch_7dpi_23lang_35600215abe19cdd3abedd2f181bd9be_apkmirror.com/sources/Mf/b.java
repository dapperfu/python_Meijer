package Mf;

import Mf.f;

/* loaded from: classes7.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f19513a;

    /* renamed from: b, reason: collision with root package name */
    private final long f19514b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f19515c;

    /* renamed from: Mf.b$b, reason: collision with other inner class name */
    static final class C0326b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f19516a;

        /* renamed from: b, reason: collision with root package name */
        private long f19517b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f19518c;

        /* renamed from: d, reason: collision with root package name */
        private byte f19519d;

        @Override // Mf.f.a
        public f a() {
            if (this.f19519d == 1) {
                return new b(this.f19516a, this.f19517b, this.f19518c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // Mf.f.a
        public f.a b(f.b bVar) {
            this.f19518c = bVar;
            return this;
        }

        @Override // Mf.f.a
        public f.a c(String str) {
            this.f19516a = str;
            return this;
        }

        @Override // Mf.f.a
        public f.a d(long j10) {
            this.f19517b = j10;
            this.f19519d = (byte) (this.f19519d | 1);
            return this;
        }

        C0326b() {
        }
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f19513a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f19514b == fVar.d() && ((bVar = this.f19515c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private b(String str, long j10, f.b bVar) {
        this.f19513a = str;
        this.f19514b = j10;
        this.f19515c = bVar;
    }

    @Override // Mf.f
    public f.b b() {
        return this.f19515c;
    }

    @Override // Mf.f
    public String c() {
        return this.f19513a;
    }

    @Override // Mf.f
    public long d() {
        return this.f19514b;
    }

    public int hashCode() {
        String str = this.f19513a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f19514b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f19515c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f19513a + ", tokenExpirationTimestamp=" + this.f19514b + ", responseCode=" + this.f19515c + "}";
    }
}
