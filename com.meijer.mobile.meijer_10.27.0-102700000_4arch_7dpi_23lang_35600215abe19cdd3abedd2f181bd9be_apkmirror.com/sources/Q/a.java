package Q;

import Q.e;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f29336a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29337b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29338c;

    /* renamed from: d, reason: collision with root package name */
    private final String f29339d;

    static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private String f29340a;

        /* renamed from: b, reason: collision with root package name */
        private String f29341b;

        /* renamed from: c, reason: collision with root package name */
        private String f29342c;

        /* renamed from: d, reason: collision with root package name */
        private String f29343d;

        @Override // Q.e.a
        public e a() {
            String str = "";
            if (this.f29340a == null) {
                str = " glVersion";
            }
            if (this.f29341b == null) {
                str = str + " eglVersion";
            }
            if (this.f29342c == null) {
                str = str + " glExtensions";
            }
            if (this.f29343d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new a(this.f29340a, this.f29341b, this.f29342c, this.f29343d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f29343d = str;
            return this;
        }

        @Override // Q.e.a
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f29341b = str;
            return this;
        }

        @Override // Q.e.a
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f29342c = str;
            return this;
        }

        @Override // Q.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f29340a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f29336a.equals(eVar.e()) && this.f29337b.equals(eVar.c()) && this.f29338c.equals(eVar.d()) && this.f29339d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    private a(String str, String str2, String str3, String str4) {
        this.f29336a = str;
        this.f29337b = str2;
        this.f29338c = str3;
        this.f29339d = str4;
    }

    @Override // Q.e
    public String b() {
        return this.f29339d;
    }

    @Override // Q.e
    public String c() {
        return this.f29337b;
    }

    @Override // Q.e
    public String d() {
        return this.f29338c;
    }

    @Override // Q.e
    public String e() {
        return this.f29336a;
    }

    public int hashCode() {
        return ((((((this.f29336a.hashCode() ^ 1000003) * 1000003) ^ this.f29337b.hashCode()) * 1000003) ^ this.f29338c.hashCode()) * 1000003) ^ this.f29339d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f29336a + ", eglVersion=" + this.f29337b + ", glExtensions=" + this.f29338c + ", eglExtensions=" + this.f29339d + "}";
    }
}
