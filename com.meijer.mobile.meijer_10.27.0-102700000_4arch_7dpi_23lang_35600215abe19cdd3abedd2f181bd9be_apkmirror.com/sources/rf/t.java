package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class t extends AbstractC16777F.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f158564a;

    /* renamed from: b, reason: collision with root package name */
    private final int f158565b;

    /* renamed from: c, reason: collision with root package name */
    private final int f158566c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f158567d;

    static final class b extends AbstractC16777F.e.d.a.c.AbstractC2460a {

        /* renamed from: a, reason: collision with root package name */
        private String f158568a;

        /* renamed from: b, reason: collision with root package name */
        private int f158569b;

        /* renamed from: c, reason: collision with root package name */
        private int f158570c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f158571d;

        /* renamed from: e, reason: collision with root package name */
        private byte f158572e;

        @Override // rf.AbstractC16777F.e.d.a.c.AbstractC2460a
        public AbstractC16777F.e.d.a.c a() {
            String str;
            if (this.f158572e == 7 && (str = this.f158568a) != null) {
                return new t(str, this.f158569b, this.f158570c, this.f158571d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158568a == null) {
                sb2.append(" processName");
            }
            if ((this.f158572e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f158572e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f158572e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.a.c.AbstractC2460a
        public AbstractC16777F.e.d.a.c.AbstractC2460a b(boolean z10) {
            this.f158571d = z10;
            this.f158572e = (byte) (this.f158572e | 4);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.c.AbstractC2460a
        public AbstractC16777F.e.d.a.c.AbstractC2460a c(int i10) {
            this.f158570c = i10;
            this.f158572e = (byte) (this.f158572e | 2);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.c.AbstractC2460a
        public AbstractC16777F.e.d.a.c.AbstractC2460a d(int i10) {
            this.f158569b = i10;
            this.f158572e = (byte) (this.f158572e | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.c.AbstractC2460a
        public AbstractC16777F.e.d.a.c.AbstractC2460a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f158568a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.a.c) {
            AbstractC16777F.e.d.a.c cVar = (AbstractC16777F.e.d.a.c) obj;
            if (this.f158564a.equals(cVar.d()) && this.f158565b == cVar.c() && this.f158566c == cVar.b() && this.f158567d == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    private t(String str, int i10, int i11, boolean z10) {
        this.f158564a = str;
        this.f158565b = i10;
        this.f158566c = i11;
        this.f158567d = z10;
    }

    @Override // rf.AbstractC16777F.e.d.a.c
    public int b() {
        return this.f158566c;
    }

    @Override // rf.AbstractC16777F.e.d.a.c
    public int c() {
        return this.f158565b;
    }

    @Override // rf.AbstractC16777F.e.d.a.c
    public String d() {
        return this.f158564a;
    }

    @Override // rf.AbstractC16777F.e.d.a.c
    public boolean e() {
        return this.f158567d;
    }

    public int hashCode() {
        return ((((((this.f158564a.hashCode() ^ 1000003) * 1000003) ^ this.f158565b) * 1000003) ^ this.f158566c) * 1000003) ^ (this.f158567d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f158564a + ", pid=" + this.f158565b + ", importance=" + this.f158566c + ", defaultProcess=" + this.f158567d + "}";
    }
}
