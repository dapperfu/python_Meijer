package Of;

import Of.d;

/* loaded from: classes8.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f23690a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23691b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23692c;

    /* renamed from: d, reason: collision with root package name */
    private final f f23693d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f23694e;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f23695a;

        /* renamed from: b, reason: collision with root package name */
        private String f23696b;

        /* renamed from: c, reason: collision with root package name */
        private String f23697c;

        /* renamed from: d, reason: collision with root package name */
        private f f23698d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f23699e;

        @Override // Of.d.a
        public d a() {
            return new a(this.f23695a, this.f23696b, this.f23697c, this.f23698d, this.f23699e);
        }

        @Override // Of.d.a
        public d.a b(f fVar) {
            this.f23698d = fVar;
            return this;
        }

        @Override // Of.d.a
        public d.a c(String str) {
            this.f23696b = str;
            return this;
        }

        @Override // Of.d.a
        public d.a d(String str) {
            this.f23697c = str;
            return this;
        }

        @Override // Of.d.a
        public d.a e(d.b bVar) {
            this.f23699e = bVar;
            return this;
        }

        @Override // Of.d.a
        public d.a f(String str) {
            this.f23695a = str;
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
            String str = this.f23690a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f23691b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f23692c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f23693d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f23694e;
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
        this.f23690a = str;
        this.f23691b = str2;
        this.f23692c = str3;
        this.f23693d = fVar;
        this.f23694e = bVar;
    }

    @Override // Of.d
    public f b() {
        return this.f23693d;
    }

    @Override // Of.d
    public String c() {
        return this.f23691b;
    }

    @Override // Of.d
    public String d() {
        return this.f23692c;
    }

    @Override // Of.d
    public d.b e() {
        return this.f23694e;
    }

    @Override // Of.d
    public String f() {
        return this.f23690a;
    }

    public int hashCode() {
        String str = this.f23690a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f23691b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f23692c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f23693d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f23694e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f23690a + ", fid=" + this.f23691b + ", refreshToken=" + this.f23692c + ", authToken=" + this.f23693d + ", responseCode=" + this.f23694e + "}";
    }
}
