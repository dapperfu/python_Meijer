package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class v extends AbstractC16777F.e.d.AbstractC2461d {

    /* renamed from: a, reason: collision with root package name */
    private final String f158586a;

    static final class b extends AbstractC16777F.e.d.AbstractC2461d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f158587a;

        @Override // rf.AbstractC16777F.e.d.AbstractC2461d.a
        public AbstractC16777F.e.d.AbstractC2461d a() {
            String str = this.f158587a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // rf.AbstractC16777F.e.d.AbstractC2461d.a
        public AbstractC16777F.e.d.AbstractC2461d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f158587a = str;
            return this;
        }

        b() {
        }
    }

    private v(String str) {
        this.f158586a = str;
    }

    @Override // rf.AbstractC16777F.e.d.AbstractC2461d
    public String b() {
        return this.f158586a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.AbstractC2461d) {
            return this.f158586a.equals(((AbstractC16777F.e.d.AbstractC2461d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f158586a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f158586a + "}";
    }
}
