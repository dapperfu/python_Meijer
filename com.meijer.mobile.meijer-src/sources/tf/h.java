package tf;

import java.util.List;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class h extends AbstractC17251F.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f162868a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162869b;

    /* renamed from: c, reason: collision with root package name */
    private final String f162870c;

    /* renamed from: d, reason: collision with root package name */
    private final long f162871d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f162872e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f162873f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC17251F.e.a f162874g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC17251F.e.f f162875h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC17251F.e.AbstractC2569e f162876i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC17251F.e.c f162877j;

    /* renamed from: k, reason: collision with root package name */
    private final List<AbstractC17251F.e.d> f162878k;

    /* renamed from: l, reason: collision with root package name */
    private final int f162879l;

    static final class b extends AbstractC17251F.e.b {

        /* renamed from: a, reason: collision with root package name */
        private String f162880a;

        /* renamed from: b, reason: collision with root package name */
        private String f162881b;

        /* renamed from: c, reason: collision with root package name */
        private String f162882c;

        /* renamed from: d, reason: collision with root package name */
        private long f162883d;

        /* renamed from: e, reason: collision with root package name */
        private Long f162884e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f162885f;

        /* renamed from: g, reason: collision with root package name */
        private AbstractC17251F.e.a f162886g;

        /* renamed from: h, reason: collision with root package name */
        private AbstractC17251F.e.f f162887h;

        /* renamed from: i, reason: collision with root package name */
        private AbstractC17251F.e.AbstractC2569e f162888i;

        /* renamed from: j, reason: collision with root package name */
        private AbstractC17251F.e.c f162889j;

        /* renamed from: k, reason: collision with root package name */
        private List<AbstractC17251F.e.d> f162890k;

        /* renamed from: l, reason: collision with root package name */
        private int f162891l;

        /* renamed from: m, reason: collision with root package name */
        private byte f162892m;

        b() {
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e a() {
            String str;
            String str2;
            AbstractC17251F.e.a aVar;
            if (this.f162892m == 7 && (str = this.f162880a) != null && (str2 = this.f162881b) != null && (aVar = this.f162886g) != null) {
                return new h(str, str2, this.f162882c, this.f162883d, this.f162884e, this.f162885f, aVar, this.f162887h, this.f162888i, this.f162889j, this.f162890k, this.f162891l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162880a == null) {
                sb2.append(" generator");
            }
            if (this.f162881b == null) {
                sb2.append(" identifier");
            }
            if ((this.f162892m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f162892m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f162886g == null) {
                sb2.append(" app");
            }
            if ((this.f162892m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b b(AbstractC17251F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f162886g = aVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b c(String str) {
            this.f162882c = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b d(boolean z10) {
            this.f162885f = z10;
            this.f162892m = (byte) (this.f162892m | 2);
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b e(AbstractC17251F.e.c cVar) {
            this.f162889j = cVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b f(Long l10) {
            this.f162884e = l10;
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b g(List<AbstractC17251F.e.d> list) {
            this.f162890k = list;
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f162880a = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b i(int i10) {
            this.f162891l = i10;
            this.f162892m = (byte) (this.f162892m | 4);
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f162881b = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b l(AbstractC17251F.e.AbstractC2569e abstractC2569e) {
            this.f162888i = abstractC2569e;
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b m(long j10) {
            this.f162883d = j10;
            this.f162892m = (byte) (this.f162892m | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.b
        public AbstractC17251F.e.b n(AbstractC17251F.e.f fVar) {
            this.f162887h = fVar;
            return this;
        }

        private b(AbstractC17251F.e eVar) {
            this.f162880a = eVar.g();
            this.f162881b = eVar.i();
            this.f162882c = eVar.c();
            this.f162883d = eVar.l();
            this.f162884e = eVar.e();
            this.f162885f = eVar.n();
            this.f162886g = eVar.b();
            this.f162887h = eVar.m();
            this.f162888i = eVar.k();
            this.f162889j = eVar.d();
            this.f162890k = eVar.f();
            this.f162891l = eVar.h();
            this.f162892m = (byte) 7;
        }
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        AbstractC17251F.e.f fVar;
        AbstractC17251F.e.AbstractC2569e abstractC2569e;
        AbstractC17251F.e.c cVar;
        List<AbstractC17251F.e.d> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e) {
            AbstractC17251F.e eVar = (AbstractC17251F.e) obj;
            if (this.f162868a.equals(eVar.g()) && this.f162869b.equals(eVar.i()) && ((str = this.f162870c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f162871d == eVar.l() && ((l10 = this.f162872e) != null ? l10.equals(eVar.e()) : eVar.e() == null) && this.f162873f == eVar.n() && this.f162874g.equals(eVar.b()) && ((fVar = this.f162875h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC2569e = this.f162876i) != null ? abstractC2569e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f162877j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f162878k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f162879l == eVar.h()) {
                return true;
            }
        }
        return false;
    }

    private h(String str, String str2, String str3, long j10, Long l10, boolean z10, AbstractC17251F.e.a aVar, AbstractC17251F.e.f fVar, AbstractC17251F.e.AbstractC2569e abstractC2569e, AbstractC17251F.e.c cVar, List<AbstractC17251F.e.d> list, int i10) {
        this.f162868a = str;
        this.f162869b = str2;
        this.f162870c = str3;
        this.f162871d = j10;
        this.f162872e = l10;
        this.f162873f = z10;
        this.f162874g = aVar;
        this.f162875h = fVar;
        this.f162876i = abstractC2569e;
        this.f162877j = cVar;
        this.f162878k = list;
        this.f162879l = i10;
    }

    @Override // tf.AbstractC17251F.e
    public AbstractC17251F.e.a b() {
        return this.f162874g;
    }

    @Override // tf.AbstractC17251F.e
    public String c() {
        return this.f162870c;
    }

    @Override // tf.AbstractC17251F.e
    public AbstractC17251F.e.c d() {
        return this.f162877j;
    }

    @Override // tf.AbstractC17251F.e
    public Long e() {
        return this.f162872e;
    }

    @Override // tf.AbstractC17251F.e
    public List<AbstractC17251F.e.d> f() {
        return this.f162878k;
    }

    @Override // tf.AbstractC17251F.e
    public String g() {
        return this.f162868a;
    }

    @Override // tf.AbstractC17251F.e
    public int h() {
        return this.f162879l;
    }

    public int hashCode() {
        int iHashCode = (((this.f162868a.hashCode() ^ 1000003) * 1000003) ^ this.f162869b.hashCode()) * 1000003;
        String str = this.f162870c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f162871d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f162872e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f162873f ? 1231 : 1237)) * 1000003) ^ this.f162874g.hashCode()) * 1000003;
        AbstractC17251F.e.f fVar = this.f162875h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC17251F.e.AbstractC2569e abstractC2569e = this.f162876i;
        int iHashCode5 = (iHashCode4 ^ (abstractC2569e == null ? 0 : abstractC2569e.hashCode())) * 1000003;
        AbstractC17251F.e.c cVar = this.f162877j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<AbstractC17251F.e.d> list = this.f162878k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f162879l;
    }

    @Override // tf.AbstractC17251F.e
    public String i() {
        return this.f162869b;
    }

    @Override // tf.AbstractC17251F.e
    public AbstractC17251F.e.AbstractC2569e k() {
        return this.f162876i;
    }

    @Override // tf.AbstractC17251F.e
    public long l() {
        return this.f162871d;
    }

    @Override // tf.AbstractC17251F.e
    public AbstractC17251F.e.f m() {
        return this.f162875h;
    }

    @Override // tf.AbstractC17251F.e
    public boolean n() {
        return this.f162873f;
    }

    @Override // tf.AbstractC17251F.e
    public AbstractC17251F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f162868a + ", identifier=" + this.f162869b + ", appQualitySessionId=" + this.f162870c + ", startedAt=" + this.f162871d + ", endedAt=" + this.f162872e + ", crashed=" + this.f162873f + ", app=" + this.f162874g + ", user=" + this.f162875h + ", os=" + this.f162876i + ", device=" + this.f162877j + ", events=" + this.f162878k + ", generatorType=" + this.f162879l + "}";
    }
}
