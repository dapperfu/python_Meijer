package tf;

import tf.AbstractC17251F;

/* renamed from: tf.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17256d extends AbstractC17251F.a.AbstractC2552a {

    /* renamed from: a, reason: collision with root package name */
    private final String f162850a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162851b;

    /* renamed from: c, reason: collision with root package name */
    private final String f162852c;

    /* renamed from: tf.d$b */
    static final class b extends AbstractC17251F.a.AbstractC2552a.AbstractC2553a {

        /* renamed from: a, reason: collision with root package name */
        private String f162853a;

        /* renamed from: b, reason: collision with root package name */
        private String f162854b;

        /* renamed from: c, reason: collision with root package name */
        private String f162855c;

        @Override // tf.AbstractC17251F.a.AbstractC2552a.AbstractC2553a
        public AbstractC17251F.a.AbstractC2552a a() {
            String str;
            String str2;
            String str3 = this.f162853a;
            if (str3 != null && (str = this.f162854b) != null && (str2 = this.f162855c) != null) {
                return new C17256d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162853a == null) {
                sb2.append(" arch");
            }
            if (this.f162854b == null) {
                sb2.append(" libraryName");
            }
            if (this.f162855c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.a.AbstractC2552a.AbstractC2553a
        public AbstractC17251F.a.AbstractC2552a.AbstractC2553a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f162853a = str;
            return this;
        }

        @Override // tf.AbstractC17251F.a.AbstractC2552a.AbstractC2553a
        public AbstractC17251F.a.AbstractC2552a.AbstractC2553a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f162855c = str;
            return this;
        }

        @Override // tf.AbstractC17251F.a.AbstractC2552a.AbstractC2553a
        public AbstractC17251F.a.AbstractC2552a.AbstractC2553a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f162854b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.a.AbstractC2552a) {
            AbstractC17251F.a.AbstractC2552a abstractC2552a = (AbstractC17251F.a.AbstractC2552a) obj;
            if (this.f162850a.equals(abstractC2552a.b()) && this.f162851b.equals(abstractC2552a.d()) && this.f162852c.equals(abstractC2552a.c())) {
                return true;
            }
        }
        return false;
    }

    private C17256d(String str, String str2, String str3) {
        this.f162850a = str;
        this.f162851b = str2;
        this.f162852c = str3;
    }

    @Override // tf.AbstractC17251F.a.AbstractC2552a
    public String b() {
        return this.f162850a;
    }

    @Override // tf.AbstractC17251F.a.AbstractC2552a
    public String c() {
        return this.f162852c;
    }

    @Override // tf.AbstractC17251F.a.AbstractC2552a
    public String d() {
        return this.f162851b;
    }

    public int hashCode() {
        return ((((this.f162850a.hashCode() ^ 1000003) * 1000003) ^ this.f162851b.hashCode()) * 1000003) ^ this.f162852c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f162850a + ", libraryName=" + this.f162851b + ", buildId=" + this.f162852c + "}";
    }
}
