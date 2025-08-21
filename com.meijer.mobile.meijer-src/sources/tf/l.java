package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class l extends AbstractC17251F.e.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f162927a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162928b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC17251F.e.d.a f162929c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC17251F.e.d.c f162930d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC17251F.e.d.AbstractC2567d f162931e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC17251F.e.d.f f162932f;

    static final class b extends AbstractC17251F.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        private long f162933a;

        /* renamed from: b, reason: collision with root package name */
        private String f162934b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC17251F.e.d.a f162935c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC17251F.e.d.c f162936d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC17251F.e.d.AbstractC2567d f162937e;

        /* renamed from: f, reason: collision with root package name */
        private AbstractC17251F.e.d.f f162938f;

        /* renamed from: g, reason: collision with root package name */
        private byte f162939g;

        b() {
        }

        @Override // tf.AbstractC17251F.e.d.b
        public AbstractC17251F.e.d a() {
            String str;
            AbstractC17251F.e.d.a aVar;
            AbstractC17251F.e.d.c cVar;
            if (this.f162939g == 1 && (str = this.f162934b) != null && (aVar = this.f162935c) != null && (cVar = this.f162936d) != null) {
                return new l(this.f162933a, str, aVar, cVar, this.f162937e, this.f162938f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f162939g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f162934b == null) {
                sb2.append(" type");
            }
            if (this.f162935c == null) {
                sb2.append(" app");
            }
            if (this.f162936d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.b
        public AbstractC17251F.e.d.b b(AbstractC17251F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f162935c = aVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.b
        public AbstractC17251F.e.d.b c(AbstractC17251F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f162936d = cVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.b
        public AbstractC17251F.e.d.b d(AbstractC17251F.e.d.AbstractC2567d abstractC2567d) {
            this.f162937e = abstractC2567d;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.b
        public AbstractC17251F.e.d.b e(AbstractC17251F.e.d.f fVar) {
            this.f162938f = fVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.b
        public AbstractC17251F.e.d.b f(long j10) {
            this.f162933a = j10;
            this.f162939g = (byte) (this.f162939g | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.b
        public AbstractC17251F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f162934b = str;
            return this;
        }

        private b(AbstractC17251F.e.d dVar) {
            this.f162933a = dVar.f();
            this.f162934b = dVar.g();
            this.f162935c = dVar.b();
            this.f162936d = dVar.c();
            this.f162937e = dVar.d();
            this.f162938f = dVar.e();
            this.f162939g = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        AbstractC17251F.e.d.AbstractC2567d abstractC2567d;
        AbstractC17251F.e.d.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d) {
            AbstractC17251F.e.d dVar = (AbstractC17251F.e.d) obj;
            if (this.f162927a == dVar.f() && this.f162928b.equals(dVar.g()) && this.f162929c.equals(dVar.b()) && this.f162930d.equals(dVar.c()) && ((abstractC2567d = this.f162931e) != null ? abstractC2567d.equals(dVar.d()) : dVar.d() == null) && ((fVar = this.f162932f) != null ? fVar.equals(dVar.e()) : dVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    private l(long j10, String str, AbstractC17251F.e.d.a aVar, AbstractC17251F.e.d.c cVar, AbstractC17251F.e.d.AbstractC2567d abstractC2567d, AbstractC17251F.e.d.f fVar) {
        this.f162927a = j10;
        this.f162928b = str;
        this.f162929c = aVar;
        this.f162930d = cVar;
        this.f162931e = abstractC2567d;
        this.f162932f = fVar;
    }

    @Override // tf.AbstractC17251F.e.d
    public AbstractC17251F.e.d.a b() {
        return this.f162929c;
    }

    @Override // tf.AbstractC17251F.e.d
    public AbstractC17251F.e.d.c c() {
        return this.f162930d;
    }

    @Override // tf.AbstractC17251F.e.d
    public AbstractC17251F.e.d.AbstractC2567d d() {
        return this.f162931e;
    }

    @Override // tf.AbstractC17251F.e.d
    public AbstractC17251F.e.d.f e() {
        return this.f162932f;
    }

    @Override // tf.AbstractC17251F.e.d
    public long f() {
        return this.f162927a;
    }

    @Override // tf.AbstractC17251F.e.d
    public String g() {
        return this.f162928b;
    }

    @Override // tf.AbstractC17251F.e.d
    public AbstractC17251F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f162927a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f162928b.hashCode()) * 1000003) ^ this.f162929c.hashCode()) * 1000003) ^ this.f162930d.hashCode()) * 1000003;
        AbstractC17251F.e.d.AbstractC2567d abstractC2567d = this.f162931e;
        int iHashCode2 = (iHashCode ^ (abstractC2567d == null ? 0 : abstractC2567d.hashCode())) * 1000003;
        AbstractC17251F.e.d.f fVar = this.f162932f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f162927a + ", type=" + this.f162928b + ", app=" + this.f162929c + ", device=" + this.f162930d + ", log=" + this.f162931e + ", rollouts=" + this.f162932f + "}";
    }
}
