package rf;

import rf.AbstractC16777F;

/* renamed from: rf.A, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16772A extends AbstractC16777F.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f158189a;

    /* renamed from: rf.A$b */
    static final class b extends AbstractC16777F.e.f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f158190a;

        @Override // rf.AbstractC16777F.e.f.a
        public AbstractC16777F.e.f a() {
            String str = this.f158190a;
            if (str != null) {
                return new C16772A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // rf.AbstractC16777F.e.f.a
        public AbstractC16777F.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f158190a = str;
            return this;
        }

        b() {
        }
    }

    private C16772A(String str) {
        this.f158189a = str;
    }

    @Override // rf.AbstractC16777F.e.f
    public String b() {
        return this.f158189a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.f) {
            return this.f158189a.equals(((AbstractC16777F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f158189a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f158189a + "}";
    }
}
