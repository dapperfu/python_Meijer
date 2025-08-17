package rf;

import java.util.List;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class h extends AbstractC16777F.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f158422a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158423b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158424c;

    /* renamed from: d, reason: collision with root package name */
    private final long f158425d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f158426e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f158427f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC16777F.e.a f158428g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC16777F.e.f f158429h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC16777F.e.AbstractC2463e f158430i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC16777F.e.c f158431j;

    /* renamed from: k, reason: collision with root package name */
    private final List<AbstractC16777F.e.d> f158432k;

    /* renamed from: l, reason: collision with root package name */
    private final int f158433l;

    static final class b extends AbstractC16777F.e.b {

        /* renamed from: a, reason: collision with root package name */
        private String f158434a;

        /* renamed from: b, reason: collision with root package name */
        private String f158435b;

        /* renamed from: c, reason: collision with root package name */
        private String f158436c;

        /* renamed from: d, reason: collision with root package name */
        private long f158437d;

        /* renamed from: e, reason: collision with root package name */
        private Long f158438e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f158439f;

        /* renamed from: g, reason: collision with root package name */
        private AbstractC16777F.e.a f158440g;

        /* renamed from: h, reason: collision with root package name */
        private AbstractC16777F.e.f f158441h;

        /* renamed from: i, reason: collision with root package name */
        private AbstractC16777F.e.AbstractC2463e f158442i;

        /* renamed from: j, reason: collision with root package name */
        private AbstractC16777F.e.c f158443j;

        /* renamed from: k, reason: collision with root package name */
        private List<AbstractC16777F.e.d> f158444k;

        /* renamed from: l, reason: collision with root package name */
        private int f158445l;

        /* renamed from: m, reason: collision with root package name */
        private byte f158446m;

        b() {
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e a() {
            String str;
            String str2;
            AbstractC16777F.e.a aVar;
            if (this.f158446m == 7 && (str = this.f158434a) != null && (str2 = this.f158435b) != null && (aVar = this.f158440g) != null) {
                return new h(str, str2, this.f158436c, this.f158437d, this.f158438e, this.f158439f, aVar, this.f158441h, this.f158442i, this.f158443j, this.f158444k, this.f158445l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158434a == null) {
                sb2.append(" generator");
            }
            if (this.f158435b == null) {
                sb2.append(" identifier");
            }
            if ((this.f158446m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f158446m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f158440g == null) {
                sb2.append(" app");
            }
            if ((this.f158446m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b b(AbstractC16777F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f158440g = aVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b c(String str) {
            this.f158436c = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b d(boolean z10) {
            this.f158439f = z10;
            this.f158446m = (byte) (this.f158446m | 2);
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b e(AbstractC16777F.e.c cVar) {
            this.f158443j = cVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b f(Long l10) {
            this.f158438e = l10;
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b g(List<AbstractC16777F.e.d> list) {
            this.f158444k = list;
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f158434a = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b i(int i10) {
            this.f158445l = i10;
            this.f158446m = (byte) (this.f158446m | 4);
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f158435b = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b l(AbstractC16777F.e.AbstractC2463e abstractC2463e) {
            this.f158442i = abstractC2463e;
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b m(long j10) {
            this.f158437d = j10;
            this.f158446m = (byte) (this.f158446m | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.b
        public AbstractC16777F.e.b n(AbstractC16777F.e.f fVar) {
            this.f158441h = fVar;
            return this;
        }

        private b(AbstractC16777F.e eVar) {
            this.f158434a = eVar.g();
            this.f158435b = eVar.i();
            this.f158436c = eVar.c();
            this.f158437d = eVar.l();
            this.f158438e = eVar.e();
            this.f158439f = eVar.n();
            this.f158440g = eVar.b();
            this.f158441h = eVar.m();
            this.f158442i = eVar.k();
            this.f158443j = eVar.d();
            this.f158444k = eVar.f();
            this.f158445l = eVar.h();
            this.f158446m = (byte) 7;
        }
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        AbstractC16777F.e.f fVar;
        AbstractC16777F.e.AbstractC2463e abstractC2463e;
        AbstractC16777F.e.c cVar;
        List<AbstractC16777F.e.d> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e) {
            AbstractC16777F.e eVar = (AbstractC16777F.e) obj;
            if (this.f158422a.equals(eVar.g()) && this.f158423b.equals(eVar.i()) && ((str = this.f158424c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f158425d == eVar.l() && ((l10 = this.f158426e) != null ? l10.equals(eVar.e()) : eVar.e() == null) && this.f158427f == eVar.n() && this.f158428g.equals(eVar.b()) && ((fVar = this.f158429h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC2463e = this.f158430i) != null ? abstractC2463e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f158431j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f158432k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f158433l == eVar.h()) {
                return true;
            }
        }
        return false;
    }

    private h(String str, String str2, String str3, long j10, Long l10, boolean z10, AbstractC16777F.e.a aVar, AbstractC16777F.e.f fVar, AbstractC16777F.e.AbstractC2463e abstractC2463e, AbstractC16777F.e.c cVar, List<AbstractC16777F.e.d> list, int i10) {
        this.f158422a = str;
        this.f158423b = str2;
        this.f158424c = str3;
        this.f158425d = j10;
        this.f158426e = l10;
        this.f158427f = z10;
        this.f158428g = aVar;
        this.f158429h = fVar;
        this.f158430i = abstractC2463e;
        this.f158431j = cVar;
        this.f158432k = list;
        this.f158433l = i10;
    }

    @Override // rf.AbstractC16777F.e
    public AbstractC16777F.e.a b() {
        return this.f158428g;
    }

    @Override // rf.AbstractC16777F.e
    public String c() {
        return this.f158424c;
    }

    @Override // rf.AbstractC16777F.e
    public AbstractC16777F.e.c d() {
        return this.f158431j;
    }

    @Override // rf.AbstractC16777F.e
    public Long e() {
        return this.f158426e;
    }

    @Override // rf.AbstractC16777F.e
    public List<AbstractC16777F.e.d> f() {
        return this.f158432k;
    }

    @Override // rf.AbstractC16777F.e
    public String g() {
        return this.f158422a;
    }

    @Override // rf.AbstractC16777F.e
    public int h() {
        return this.f158433l;
    }

    public int hashCode() {
        int iHashCode = (((this.f158422a.hashCode() ^ 1000003) * 1000003) ^ this.f158423b.hashCode()) * 1000003;
        String str = this.f158424c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f158425d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f158426e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f158427f ? 1231 : 1237)) * 1000003) ^ this.f158428g.hashCode()) * 1000003;
        AbstractC16777F.e.f fVar = this.f158429h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC16777F.e.AbstractC2463e abstractC2463e = this.f158430i;
        int iHashCode5 = (iHashCode4 ^ (abstractC2463e == null ? 0 : abstractC2463e.hashCode())) * 1000003;
        AbstractC16777F.e.c cVar = this.f158431j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<AbstractC16777F.e.d> list = this.f158432k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f158433l;
    }

    @Override // rf.AbstractC16777F.e
    public String i() {
        return this.f158423b;
    }

    @Override // rf.AbstractC16777F.e
    public AbstractC16777F.e.AbstractC2463e k() {
        return this.f158430i;
    }

    @Override // rf.AbstractC16777F.e
    public long l() {
        return this.f158425d;
    }

    @Override // rf.AbstractC16777F.e
    public AbstractC16777F.e.f m() {
        return this.f158429h;
    }

    @Override // rf.AbstractC16777F.e
    public boolean n() {
        return this.f158427f;
    }

    @Override // rf.AbstractC16777F.e
    public AbstractC16777F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f158422a + ", identifier=" + this.f158423b + ", appQualitySessionId=" + this.f158424c + ", startedAt=" + this.f158425d + ", endedAt=" + this.f158426e + ", crashed=" + this.f158427f + ", app=" + this.f158428g + ", user=" + this.f158429h + ", os=" + this.f158430i + ", device=" + this.f158431j + ", events=" + this.f158432k + ", generatorType=" + this.f158433l + "}";
    }
}
