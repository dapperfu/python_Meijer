package rf;

import rf.AbstractC16777F;

/* renamed from: rf.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16783e extends AbstractC16777F.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f158410a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158411b;

    /* renamed from: rf.e$b */
    static final class b extends AbstractC16777F.c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f158412a;

        /* renamed from: b, reason: collision with root package name */
        private String f158413b;

        @Override // rf.AbstractC16777F.c.a
        public AbstractC16777F.c a() {
            String str;
            String str2 = this.f158412a;
            if (str2 != null && (str = this.f158413b) != null) {
                return new C16783e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158412a == null) {
                sb2.append(" key");
            }
            if (this.f158413b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.c.a
        public AbstractC16777F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f158412a = str;
            return this;
        }

        @Override // rf.AbstractC16777F.c.a
        public AbstractC16777F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f158413b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.c) {
            AbstractC16777F.c cVar = (AbstractC16777F.c) obj;
            if (this.f158410a.equals(cVar.b()) && this.f158411b.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    private C16783e(String str, String str2) {
        this.f158410a = str;
        this.f158411b = str2;
    }

    @Override // rf.AbstractC16777F.c
    public String b() {
        return this.f158410a;
    }

    @Override // rf.AbstractC16777F.c
    public String c() {
        return this.f158411b;
    }

    public int hashCode() {
        return ((this.f158410a.hashCode() ^ 1000003) * 1000003) ^ this.f158411b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f158410a + ", value=" + this.f158411b + "}";
    }
}
