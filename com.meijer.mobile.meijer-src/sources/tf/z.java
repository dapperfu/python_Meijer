package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class z extends AbstractC17251F.e.AbstractC2569e {

    /* renamed from: a, reason: collision with root package name */
    private final int f163049a;

    /* renamed from: b, reason: collision with root package name */
    private final String f163050b;

    /* renamed from: c, reason: collision with root package name */
    private final String f163051c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f163052d;

    static final class b extends AbstractC17251F.e.AbstractC2569e.a {

        /* renamed from: a, reason: collision with root package name */
        private int f163053a;

        /* renamed from: b, reason: collision with root package name */
        private String f163054b;

        /* renamed from: c, reason: collision with root package name */
        private String f163055c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f163056d;

        /* renamed from: e, reason: collision with root package name */
        private byte f163057e;

        @Override // tf.AbstractC17251F.e.AbstractC2569e.a
        public AbstractC17251F.e.AbstractC2569e a() {
            String str;
            String str2;
            if (this.f163057e == 3 && (str = this.f163054b) != null && (str2 = this.f163055c) != null) {
                return new z(this.f163053a, str, str2, this.f163056d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f163057e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f163054b == null) {
                sb2.append(" version");
            }
            if (this.f163055c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f163057e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.AbstractC2569e.a
        public AbstractC17251F.e.AbstractC2569e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f163055c = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.AbstractC2569e.a
        public AbstractC17251F.e.AbstractC2569e.a c(boolean z10) {
            this.f163056d = z10;
            this.f163057e = (byte) (this.f163057e | 2);
            return this;
        }

        @Override // tf.AbstractC17251F.e.AbstractC2569e.a
        public AbstractC17251F.e.AbstractC2569e.a d(int i10) {
            this.f163053a = i10;
            this.f163057e = (byte) (this.f163057e | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.AbstractC2569e.a
        public AbstractC17251F.e.AbstractC2569e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f163054b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.AbstractC2569e) {
            AbstractC17251F.e.AbstractC2569e abstractC2569e = (AbstractC17251F.e.AbstractC2569e) obj;
            if (this.f163049a == abstractC2569e.c() && this.f163050b.equals(abstractC2569e.d()) && this.f163051c.equals(abstractC2569e.b()) && this.f163052d == abstractC2569e.e()) {
                return true;
            }
        }
        return false;
    }

    private z(int i10, String str, String str2, boolean z10) {
        this.f163049a = i10;
        this.f163050b = str;
        this.f163051c = str2;
        this.f163052d = z10;
    }

    @Override // tf.AbstractC17251F.e.AbstractC2569e
    public String b() {
        return this.f163051c;
    }

    @Override // tf.AbstractC17251F.e.AbstractC2569e
    public int c() {
        return this.f163049a;
    }

    @Override // tf.AbstractC17251F.e.AbstractC2569e
    public String d() {
        return this.f163050b;
    }

    @Override // tf.AbstractC17251F.e.AbstractC2569e
    public boolean e() {
        return this.f163052d;
    }

    public int hashCode() {
        return ((((((this.f163049a ^ 1000003) * 1000003) ^ this.f163050b.hashCode()) * 1000003) ^ this.f163051c.hashCode()) * 1000003) ^ (this.f163052d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f163049a + ", version=" + this.f163050b + ", buildVersion=" + this.f163051c + ", jailbroken=" + this.f163052d + "}";
    }
}
