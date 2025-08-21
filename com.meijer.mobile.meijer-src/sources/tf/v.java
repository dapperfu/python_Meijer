package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class v extends AbstractC17251F.e.d.AbstractC2567d {

    /* renamed from: a, reason: collision with root package name */
    private final String f163032a;

    static final class b extends AbstractC17251F.e.d.AbstractC2567d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f163033a;

        @Override // tf.AbstractC17251F.e.d.AbstractC2567d.a
        public AbstractC17251F.e.d.AbstractC2567d a() {
            String str = this.f163033a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // tf.AbstractC17251F.e.d.AbstractC2567d.a
        public AbstractC17251F.e.d.AbstractC2567d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f163033a = str;
            return this;
        }

        b() {
        }
    }

    private v(String str) {
        this.f163032a = str;
    }

    @Override // tf.AbstractC17251F.e.d.AbstractC2567d
    public String b() {
        return this.f163032a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.AbstractC2567d) {
            return this.f163032a.equals(((AbstractC17251F.e.d.AbstractC2567d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f163032a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f163032a + "}";
    }
}
