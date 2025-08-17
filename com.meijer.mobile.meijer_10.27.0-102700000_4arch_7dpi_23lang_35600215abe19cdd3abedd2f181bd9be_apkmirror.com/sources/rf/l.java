package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class l extends AbstractC16777F.e.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f158481a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158482b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16777F.e.d.a f158483c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC16777F.e.d.c f158484d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC16777F.e.d.AbstractC2461d f158485e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC16777F.e.d.f f158486f;

    static final class b extends AbstractC16777F.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        private long f158487a;

        /* renamed from: b, reason: collision with root package name */
        private String f158488b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC16777F.e.d.a f158489c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC16777F.e.d.c f158490d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC16777F.e.d.AbstractC2461d f158491e;

        /* renamed from: f, reason: collision with root package name */
        private AbstractC16777F.e.d.f f158492f;

        /* renamed from: g, reason: collision with root package name */
        private byte f158493g;

        b() {
        }

        @Override // rf.AbstractC16777F.e.d.b
        public AbstractC16777F.e.d a() {
            String str;
            AbstractC16777F.e.d.a aVar;
            AbstractC16777F.e.d.c cVar;
            if (this.f158493g == 1 && (str = this.f158488b) != null && (aVar = this.f158489c) != null && (cVar = this.f158490d) != null) {
                return new l(this.f158487a, str, aVar, cVar, this.f158491e, this.f158492f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f158493g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f158488b == null) {
                sb2.append(" type");
            }
            if (this.f158489c == null) {
                sb2.append(" app");
            }
            if (this.f158490d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.b
        public AbstractC16777F.e.d.b b(AbstractC16777F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f158489c = aVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.b
        public AbstractC16777F.e.d.b c(AbstractC16777F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f158490d = cVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.b
        public AbstractC16777F.e.d.b d(AbstractC16777F.e.d.AbstractC2461d abstractC2461d) {
            this.f158491e = abstractC2461d;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.b
        public AbstractC16777F.e.d.b e(AbstractC16777F.e.d.f fVar) {
            this.f158492f = fVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.b
        public AbstractC16777F.e.d.b f(long j10) {
            this.f158487a = j10;
            this.f158493g = (byte) (this.f158493g | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.b
        public AbstractC16777F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f158488b = str;
            return this;
        }

        private b(AbstractC16777F.e.d dVar) {
            this.f158487a = dVar.f();
            this.f158488b = dVar.g();
            this.f158489c = dVar.b();
            this.f158490d = dVar.c();
            this.f158491e = dVar.d();
            this.f158492f = dVar.e();
            this.f158493g = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        AbstractC16777F.e.d.AbstractC2461d abstractC2461d;
        AbstractC16777F.e.d.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d) {
            AbstractC16777F.e.d dVar = (AbstractC16777F.e.d) obj;
            if (this.f158481a == dVar.f() && this.f158482b.equals(dVar.g()) && this.f158483c.equals(dVar.b()) && this.f158484d.equals(dVar.c()) && ((abstractC2461d = this.f158485e) != null ? abstractC2461d.equals(dVar.d()) : dVar.d() == null) && ((fVar = this.f158486f) != null ? fVar.equals(dVar.e()) : dVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    private l(long j10, String str, AbstractC16777F.e.d.a aVar, AbstractC16777F.e.d.c cVar, AbstractC16777F.e.d.AbstractC2461d abstractC2461d, AbstractC16777F.e.d.f fVar) {
        this.f158481a = j10;
        this.f158482b = str;
        this.f158483c = aVar;
        this.f158484d = cVar;
        this.f158485e = abstractC2461d;
        this.f158486f = fVar;
    }

    @Override // rf.AbstractC16777F.e.d
    public AbstractC16777F.e.d.a b() {
        return this.f158483c;
    }

    @Override // rf.AbstractC16777F.e.d
    public AbstractC16777F.e.d.c c() {
        return this.f158484d;
    }

    @Override // rf.AbstractC16777F.e.d
    public AbstractC16777F.e.d.AbstractC2461d d() {
        return this.f158485e;
    }

    @Override // rf.AbstractC16777F.e.d
    public AbstractC16777F.e.d.f e() {
        return this.f158486f;
    }

    @Override // rf.AbstractC16777F.e.d
    public long f() {
        return this.f158481a;
    }

    @Override // rf.AbstractC16777F.e.d
    public String g() {
        return this.f158482b;
    }

    @Override // rf.AbstractC16777F.e.d
    public AbstractC16777F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f158481a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f158482b.hashCode()) * 1000003) ^ this.f158483c.hashCode()) * 1000003) ^ this.f158484d.hashCode()) * 1000003;
        AbstractC16777F.e.d.AbstractC2461d abstractC2461d = this.f158485e;
        int iHashCode2 = (iHashCode ^ (abstractC2461d == null ? 0 : abstractC2461d.hashCode())) * 1000003;
        AbstractC16777F.e.d.f fVar = this.f158486f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f158481a + ", type=" + this.f158482b + ", app=" + this.f158483c + ", device=" + this.f158484d + ", log=" + this.f158485e + ", rollouts=" + this.f158486f + "}";
    }
}
