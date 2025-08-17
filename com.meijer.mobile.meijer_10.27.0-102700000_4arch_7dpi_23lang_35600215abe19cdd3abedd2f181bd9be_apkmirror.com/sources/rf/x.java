package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class x extends AbstractC16777F.e.d.AbstractC2462e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f158597a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158598b;

    static final class b extends AbstractC16777F.e.d.AbstractC2462e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f158599a;

        /* renamed from: b, reason: collision with root package name */
        private String f158600b;

        @Override // rf.AbstractC16777F.e.d.AbstractC2462e.b.a
        public AbstractC16777F.e.d.AbstractC2462e.b a() {
            String str;
            String str2 = this.f158599a;
            if (str2 != null && (str = this.f158600b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158599a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f158600b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.AbstractC2462e.b.a
        public AbstractC16777F.e.d.AbstractC2462e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f158599a = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.AbstractC2462e.b.a
        public AbstractC16777F.e.d.AbstractC2462e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f158600b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.AbstractC2462e.b) {
            AbstractC16777F.e.d.AbstractC2462e.b bVar = (AbstractC16777F.e.d.AbstractC2462e.b) obj;
            if (this.f158597a.equals(bVar.b()) && this.f158598b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    private x(String str, String str2) {
        this.f158597a = str;
        this.f158598b = str2;
    }

    @Override // rf.AbstractC16777F.e.d.AbstractC2462e.b
    public String b() {
        return this.f158597a;
    }

    @Override // rf.AbstractC16777F.e.d.AbstractC2462e.b
    public String c() {
        return this.f158598b;
    }

    public int hashCode() {
        return ((this.f158597a.hashCode() ^ 1000003) * 1000003) ^ this.f158598b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f158597a + ", variantId=" + this.f158598b + "}";
    }
}
