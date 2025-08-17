package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class z extends AbstractC16777F.e.AbstractC2463e {

    /* renamed from: a, reason: collision with root package name */
    private final int f158603a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158604b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158605c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f158606d;

    static final class b extends AbstractC16777F.e.AbstractC2463e.a {

        /* renamed from: a, reason: collision with root package name */
        private int f158607a;

        /* renamed from: b, reason: collision with root package name */
        private String f158608b;

        /* renamed from: c, reason: collision with root package name */
        private String f158609c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f158610d;

        /* renamed from: e, reason: collision with root package name */
        private byte f158611e;

        @Override // rf.AbstractC16777F.e.AbstractC2463e.a
        public AbstractC16777F.e.AbstractC2463e a() {
            String str;
            String str2;
            if (this.f158611e == 3 && (str = this.f158608b) != null && (str2 = this.f158609c) != null) {
                return new z(this.f158607a, str, str2, this.f158610d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f158611e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f158608b == null) {
                sb2.append(" version");
            }
            if (this.f158609c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f158611e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.AbstractC2463e.a
        public AbstractC16777F.e.AbstractC2463e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f158609c = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.AbstractC2463e.a
        public AbstractC16777F.e.AbstractC2463e.a c(boolean z10) {
            this.f158610d = z10;
            this.f158611e = (byte) (this.f158611e | 2);
            return this;
        }

        @Override // rf.AbstractC16777F.e.AbstractC2463e.a
        public AbstractC16777F.e.AbstractC2463e.a d(int i10) {
            this.f158607a = i10;
            this.f158611e = (byte) (this.f158611e | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.AbstractC2463e.a
        public AbstractC16777F.e.AbstractC2463e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f158608b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.AbstractC2463e) {
            AbstractC16777F.e.AbstractC2463e abstractC2463e = (AbstractC16777F.e.AbstractC2463e) obj;
            if (this.f158603a == abstractC2463e.c() && this.f158604b.equals(abstractC2463e.d()) && this.f158605c.equals(abstractC2463e.b()) && this.f158606d == abstractC2463e.e()) {
                return true;
            }
        }
        return false;
    }

    private z(int i10, String str, String str2, boolean z10) {
        this.f158603a = i10;
        this.f158604b = str;
        this.f158605c = str2;
        this.f158606d = z10;
    }

    @Override // rf.AbstractC16777F.e.AbstractC2463e
    public String b() {
        return this.f158605c;
    }

    @Override // rf.AbstractC16777F.e.AbstractC2463e
    public int c() {
        return this.f158603a;
    }

    @Override // rf.AbstractC16777F.e.AbstractC2463e
    public String d() {
        return this.f158604b;
    }

    @Override // rf.AbstractC16777F.e.AbstractC2463e
    public boolean e() {
        return this.f158606d;
    }

    public int hashCode() {
        return ((((((this.f158603a ^ 1000003) * 1000003) ^ this.f158604b.hashCode()) * 1000003) ^ this.f158605c.hashCode()) * 1000003) ^ (this.f158606d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f158603a + ", version=" + this.f158604b + ", buildVersion=" + this.f158605c + ", jailbroken=" + this.f158606d + "}";
    }
}
