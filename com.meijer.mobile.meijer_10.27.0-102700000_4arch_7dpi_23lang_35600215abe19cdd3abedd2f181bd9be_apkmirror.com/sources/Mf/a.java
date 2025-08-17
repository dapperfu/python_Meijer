package Mf;

import Mf.d;

/* loaded from: classes7.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f19503a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19504b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19505c;

    /* renamed from: d, reason: collision with root package name */
    private final f f19506d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f19507e;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f19508a;

        /* renamed from: b, reason: collision with root package name */
        private String f19509b;

        /* renamed from: c, reason: collision with root package name */
        private String f19510c;

        /* renamed from: d, reason: collision with root package name */
        private f f19511d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f19512e;

        @Override // Mf.d.a
        public d a() {
            return new a(this.f19508a, this.f19509b, this.f19510c, this.f19511d, this.f19512e);
        }

        @Override // Mf.d.a
        public d.a b(f fVar) {
            this.f19511d = fVar;
            return this;
        }

        @Override // Mf.d.a
        public d.a c(String str) {
            this.f19509b = str;
            return this;
        }

        @Override // Mf.d.a
        public d.a d(String str) {
            this.f19510c = str;
            return this;
        }

        @Override // Mf.d.a
        public d.a e(d.b bVar) {
            this.f19512e = bVar;
            return this;
        }

        @Override // Mf.d.a
        public d.a f(String str) {
            this.f19508a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f19503a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f19504b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f19505c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f19506d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f19507e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f19503a = str;
        this.f19504b = str2;
        this.f19505c = str3;
        this.f19506d = fVar;
        this.f19507e = bVar;
    }

    @Override // Mf.d
    public f b() {
        return this.f19506d;
    }

    @Override // Mf.d
    public String c() {
        return this.f19504b;
    }

    @Override // Mf.d
    public String d() {
        return this.f19505c;
    }

    @Override // Mf.d
    public d.b e() {
        return this.f19507e;
    }

    @Override // Mf.d
    public String f() {
        return this.f19503a;
    }

    public int hashCode() {
        String str = this.f19503a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f19504b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19505c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f19506d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f19507e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f19503a + ", fid=" + this.f19504b + ", refreshToken=" + this.f19505c + ", authToken=" + this.f19506d + ", responseCode=" + this.f19507e + "}";
    }
}
