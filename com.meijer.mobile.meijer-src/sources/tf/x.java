package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class x extends AbstractC17251F.e.d.AbstractC2568e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f163043a;

    /* renamed from: b, reason: collision with root package name */
    private final String f163044b;

    static final class b extends AbstractC17251F.e.d.AbstractC2568e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f163045a;

        /* renamed from: b, reason: collision with root package name */
        private String f163046b;

        @Override // tf.AbstractC17251F.e.d.AbstractC2568e.b.a
        public AbstractC17251F.e.d.AbstractC2568e.b a() {
            String str;
            String str2 = this.f163045a;
            if (str2 != null && (str = this.f163046b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f163045a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f163046b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.AbstractC2568e.b.a
        public AbstractC17251F.e.d.AbstractC2568e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f163045a = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.AbstractC2568e.b.a
        public AbstractC17251F.e.d.AbstractC2568e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f163046b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.AbstractC2568e.b) {
            AbstractC17251F.e.d.AbstractC2568e.b bVar = (AbstractC17251F.e.d.AbstractC2568e.b) obj;
            if (this.f163043a.equals(bVar.b()) && this.f163044b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    private x(String str, String str2) {
        this.f163043a = str;
        this.f163044b = str2;
    }

    @Override // tf.AbstractC17251F.e.d.AbstractC2568e.b
    public String b() {
        return this.f163043a;
    }

    @Override // tf.AbstractC17251F.e.d.AbstractC2568e.b
    public String c() {
        return this.f163044b;
    }

    public int hashCode() {
        return ((this.f163043a.hashCode() ^ 1000003) * 1000003) ^ this.f163044b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f163043a + ", variantId=" + this.f163044b + "}";
    }
}
