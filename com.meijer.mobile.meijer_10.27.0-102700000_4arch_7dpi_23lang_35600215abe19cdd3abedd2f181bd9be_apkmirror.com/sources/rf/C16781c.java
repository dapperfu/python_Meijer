package rf;

import fsimpl.C14045dq;
import java.util.List;
import rf.AbstractC16777F;

/* renamed from: rf.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16781c extends AbstractC16777F.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f158385a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158386b;

    /* renamed from: c, reason: collision with root package name */
    private final int f158387c;

    /* renamed from: d, reason: collision with root package name */
    private final int f158388d;

    /* renamed from: e, reason: collision with root package name */
    private final long f158389e;

    /* renamed from: f, reason: collision with root package name */
    private final long f158390f;

    /* renamed from: g, reason: collision with root package name */
    private final long f158391g;

    /* renamed from: h, reason: collision with root package name */
    private final String f158392h;

    /* renamed from: i, reason: collision with root package name */
    private final List<AbstractC16777F.a.AbstractC2446a> f158393i;

    /* renamed from: rf.c$b */
    static final class b extends AbstractC16777F.a.b {

        /* renamed from: a, reason: collision with root package name */
        private int f158394a;

        /* renamed from: b, reason: collision with root package name */
        private String f158395b;

        /* renamed from: c, reason: collision with root package name */
        private int f158396c;

        /* renamed from: d, reason: collision with root package name */
        private int f158397d;

        /* renamed from: e, reason: collision with root package name */
        private long f158398e;

        /* renamed from: f, reason: collision with root package name */
        private long f158399f;

        /* renamed from: g, reason: collision with root package name */
        private long f158400g;

        /* renamed from: h, reason: collision with root package name */
        private String f158401h;

        /* renamed from: i, reason: collision with root package name */
        private List<AbstractC16777F.a.AbstractC2446a> f158402i;

        /* renamed from: j, reason: collision with root package name */
        private byte f158403j;

        @Override // rf.AbstractC16777F.a.b
        public AbstractC16777F.a a() {
            String str;
            if (this.f158403j == 63 && (str = this.f158395b) != null) {
                return new C16781c(this.f158394a, str, this.f158396c, this.f158397d, this.f158398e, this.f158399f, this.f158400g, this.f158401h, this.f158402i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f158403j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f158395b == null) {
                sb2.append(" processName");
            }
            if ((this.f158403j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f158403j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f158403j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f158403j & C14045dq.SCREEN) == 0) {
                sb2.append(" rss");
            }
            if ((this.f158403j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.a.b
        public AbstractC16777F.a.b b(List<AbstractC16777F.a.AbstractC2446a> list) {
            this.f158402i = list;
            return this;
        }

        @Override // rf.AbstractC16777F.a.b
        public AbstractC16777F.a.b c(int i10) {
            this.f158397d = i10;
            this.f158403j = (byte) (this.f158403j | 4);
            return this;
        }

        @Override // rf.AbstractC16777F.a.b
        public AbstractC16777F.a.b d(int i10) {
            this.f158394a = i10;
            this.f158403j = (byte) (this.f158403j | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.a.b
        public AbstractC16777F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f158395b = str;
            return this;
        }

        @Override // rf.AbstractC16777F.a.b
        public AbstractC16777F.a.b f(long j10) {
            this.f158398e = j10;
            this.f158403j = (byte) (this.f158403j | 8);
            return this;
        }

        @Override // rf.AbstractC16777F.a.b
        public AbstractC16777F.a.b g(int i10) {
            this.f158396c = i10;
            this.f158403j = (byte) (this.f158403j | 2);
            return this;
        }

        @Override // rf.AbstractC16777F.a.b
        public AbstractC16777F.a.b h(long j10) {
            this.f158399f = j10;
            this.f158403j = (byte) (this.f158403j | C14045dq.SCREEN);
            return this;
        }

        @Override // rf.AbstractC16777F.a.b
        public AbstractC16777F.a.b i(long j10) {
            this.f158400g = j10;
            this.f158403j = (byte) (this.f158403j | 32);
            return this;
        }

        @Override // rf.AbstractC16777F.a.b
        public AbstractC16777F.a.b j(String str) {
            this.f158401h = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        List<AbstractC16777F.a.AbstractC2446a> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.a) {
            AbstractC16777F.a aVar = (AbstractC16777F.a) obj;
            if (this.f158385a == aVar.d() && this.f158386b.equals(aVar.e()) && this.f158387c == aVar.g() && this.f158388d == aVar.c() && this.f158389e == aVar.f() && this.f158390f == aVar.h() && this.f158391g == aVar.i() && ((str = this.f158392h) != null ? str.equals(aVar.j()) : aVar.j() == null) && ((list = this.f158393i) != null ? list.equals(aVar.b()) : aVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    private C16781c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List<AbstractC16777F.a.AbstractC2446a> list) {
        this.f158385a = i10;
        this.f158386b = str;
        this.f158387c = i11;
        this.f158388d = i12;
        this.f158389e = j10;
        this.f158390f = j11;
        this.f158391g = j12;
        this.f158392h = str2;
        this.f158393i = list;
    }

    @Override // rf.AbstractC16777F.a
    public List<AbstractC16777F.a.AbstractC2446a> b() {
        return this.f158393i;
    }

    @Override // rf.AbstractC16777F.a
    public int c() {
        return this.f158388d;
    }

    @Override // rf.AbstractC16777F.a
    public int d() {
        return this.f158385a;
    }

    @Override // rf.AbstractC16777F.a
    public String e() {
        return this.f158386b;
    }

    @Override // rf.AbstractC16777F.a
    public long f() {
        return this.f158389e;
    }

    @Override // rf.AbstractC16777F.a
    public int g() {
        return this.f158387c;
    }

    @Override // rf.AbstractC16777F.a
    public long h() {
        return this.f158390f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f158385a ^ 1000003) * 1000003) ^ this.f158386b.hashCode()) * 1000003) ^ this.f158387c) * 1000003) ^ this.f158388d) * 1000003;
        long j10 = this.f158389e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f158390f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f158391g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f158392h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC16777F.a.AbstractC2446a> list = this.f158393i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // rf.AbstractC16777F.a
    public long i() {
        return this.f158391g;
    }

    @Override // rf.AbstractC16777F.a
    public String j() {
        return this.f158392h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f158385a + ", processName=" + this.f158386b + ", reasonCode=" + this.f158387c + ", importance=" + this.f158388d + ", pss=" + this.f158389e + ", rss=" + this.f158390f + ", timestamp=" + this.f158391g + ", traceFile=" + this.f158392h + ", buildIdMappingForArch=" + this.f158393i + "}";
    }
}
