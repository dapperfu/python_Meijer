package Q;

import Q.e;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f27349a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27350b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27351c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27352d;

    static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private String f27353a;

        /* renamed from: b, reason: collision with root package name */
        private String f27354b;

        /* renamed from: c, reason: collision with root package name */
        private String f27355c;

        /* renamed from: d, reason: collision with root package name */
        private String f27356d;

        @Override // Q.e.a
        public e a() {
            String str = "";
            if (this.f27353a == null) {
                str = " glVersion";
            }
            if (this.f27354b == null) {
                str = str + " eglVersion";
            }
            if (this.f27355c == null) {
                str = str + " glExtensions";
            }
            if (this.f27356d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new a(this.f27353a, this.f27354b, this.f27355c, this.f27356d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Q.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f27356d = str;
            return this;
        }

        @Override // Q.e.a
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f27354b = str;
            return this;
        }

        @Override // Q.e.a
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f27355c = str;
            return this;
        }

        @Override // Q.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f27353a = str;
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
            if (this.f27349a.equals(eVar.e()) && this.f27350b.equals(eVar.c()) && this.f27351c.equals(eVar.d()) && this.f27352d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    private a(String str, String str2, String str3, String str4) {
        this.f27349a = str;
        this.f27350b = str2;
        this.f27351c = str3;
        this.f27352d = str4;
    }

    @Override // Q.e
    public String b() {
        return this.f27352d;
    }

    @Override // Q.e
    public String c() {
        return this.f27350b;
    }

    @Override // Q.e
    public String d() {
        return this.f27351c;
    }

    @Override // Q.e
    public String e() {
        return this.f27349a;
    }

    public int hashCode() {
        return ((((((this.f27349a.hashCode() ^ 1000003) * 1000003) ^ this.f27350b.hashCode()) * 1000003) ^ this.f27351c.hashCode()) * 1000003) ^ this.f27352d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f27349a + ", eglVersion=" + this.f27350b + ", glExtensions=" + this.f27351c + ", eglExtensions=" + this.f27352d + "}";
    }
}
