package tf;

import tf.AbstractC17251F;

/* renamed from: tf.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17246A extends AbstractC17251F.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f162635a;

    /* renamed from: tf.A$b */
    static final class b extends AbstractC17251F.e.f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f162636a;

        @Override // tf.AbstractC17251F.e.f.a
        public AbstractC17251F.e.f a() {
            String str = this.f162636a;
            if (str != null) {
                return new C17246A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // tf.AbstractC17251F.e.f.a
        public AbstractC17251F.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f162636a = str;
            return this;
        }

        b() {
        }
    }

    private C17246A(String str) {
        this.f162635a = str;
    }

    @Override // tf.AbstractC17251F.e.f
    public String b() {
        return this.f162635a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.f) {
            return this.f162635a.equals(((AbstractC17251F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f162635a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f162635a + "}";
    }
}
