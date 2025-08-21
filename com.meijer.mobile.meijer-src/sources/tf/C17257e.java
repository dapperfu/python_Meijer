package tf;

import tf.AbstractC17251F;

/* renamed from: tf.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17257e extends AbstractC17251F.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f162856a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162857b;

    /* renamed from: tf.e$b */
    static final class b extends AbstractC17251F.c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f162858a;

        /* renamed from: b, reason: collision with root package name */
        private String f162859b;

        @Override // tf.AbstractC17251F.c.a
        public AbstractC17251F.c a() {
            String str;
            String str2 = this.f162858a;
            if (str2 != null && (str = this.f162859b) != null) {
                return new C17257e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162858a == null) {
                sb2.append(" key");
            }
            if (this.f162859b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.c.a
        public AbstractC17251F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f162858a = str;
            return this;
        }

        @Override // tf.AbstractC17251F.c.a
        public AbstractC17251F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f162859b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.c) {
            AbstractC17251F.c cVar = (AbstractC17251F.c) obj;
            if (this.f162856a.equals(cVar.b()) && this.f162857b.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    private C17257e(String str, String str2) {
        this.f162856a = str;
        this.f162857b = str2;
    }

    @Override // tf.AbstractC17251F.c
    public String b() {
        return this.f162856a;
    }

    @Override // tf.AbstractC17251F.c
    public String c() {
        return this.f162857b;
    }

    public int hashCode() {
        return ((this.f162856a.hashCode() ^ 1000003) * 1000003) ^ this.f162857b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f162856a + ", value=" + this.f162857b + "}";
    }
}
