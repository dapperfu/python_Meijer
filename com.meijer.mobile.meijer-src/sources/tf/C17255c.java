package tf;

import fsimpl.C14170dq;
import java.util.List;
import tf.AbstractC17251F;

/* renamed from: tf.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17255c extends AbstractC17251F.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f162831a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162832b;

    /* renamed from: c, reason: collision with root package name */
    private final int f162833c;

    /* renamed from: d, reason: collision with root package name */
    private final int f162834d;

    /* renamed from: e, reason: collision with root package name */
    private final long f162835e;

    /* renamed from: f, reason: collision with root package name */
    private final long f162836f;

    /* renamed from: g, reason: collision with root package name */
    private final long f162837g;

    /* renamed from: h, reason: collision with root package name */
    private final String f162838h;

    /* renamed from: i, reason: collision with root package name */
    private final List<AbstractC17251F.a.AbstractC2552a> f162839i;

    /* renamed from: tf.c$b */
    static final class b extends AbstractC17251F.a.b {

        /* renamed from: a, reason: collision with root package name */
        private int f162840a;

        /* renamed from: b, reason: collision with root package name */
        private String f162841b;

        /* renamed from: c, reason: collision with root package name */
        private int f162842c;

        /* renamed from: d, reason: collision with root package name */
        private int f162843d;

        /* renamed from: e, reason: collision with root package name */
        private long f162844e;

        /* renamed from: f, reason: collision with root package name */
        private long f162845f;

        /* renamed from: g, reason: collision with root package name */
        private long f162846g;

        /* renamed from: h, reason: collision with root package name */
        private String f162847h;

        /* renamed from: i, reason: collision with root package name */
        private List<AbstractC17251F.a.AbstractC2552a> f162848i;

        /* renamed from: j, reason: collision with root package name */
        private byte f162849j;

        @Override // tf.AbstractC17251F.a.b
        public AbstractC17251F.a a() {
            String str;
            if (this.f162849j == 63 && (str = this.f162841b) != null) {
                return new C17255c(this.f162840a, str, this.f162842c, this.f162843d, this.f162844e, this.f162845f, this.f162846g, this.f162847h, this.f162848i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f162849j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f162841b == null) {
                sb2.append(" processName");
            }
            if ((this.f162849j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f162849j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f162849j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f162849j & C14170dq.SCREEN) == 0) {
                sb2.append(" rss");
            }
            if ((this.f162849j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.a.b
        public AbstractC17251F.a.b b(List<AbstractC17251F.a.AbstractC2552a> list) {
            this.f162848i = list;
            return this;
        }

        @Override // tf.AbstractC17251F.a.b
        public AbstractC17251F.a.b c(int i10) {
            this.f162843d = i10;
            this.f162849j = (byte) (this.f162849j | 4);
            return this;
        }

        @Override // tf.AbstractC17251F.a.b
        public AbstractC17251F.a.b d(int i10) {
            this.f162840a = i10;
            this.f162849j = (byte) (this.f162849j | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.a.b
        public AbstractC17251F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f162841b = str;
            return this;
        }

        @Override // tf.AbstractC17251F.a.b
        public AbstractC17251F.a.b f(long j10) {
            this.f162844e = j10;
            this.f162849j = (byte) (this.f162849j | 8);
            return this;
        }

        @Override // tf.AbstractC17251F.a.b
        public AbstractC17251F.a.b g(int i10) {
            this.f162842c = i10;
            this.f162849j = (byte) (this.f162849j | 2);
            return this;
        }

        @Override // tf.AbstractC17251F.a.b
        public AbstractC17251F.a.b h(long j10) {
            this.f162845f = j10;
            this.f162849j = (byte) (this.f162849j | C14170dq.SCREEN);
            return this;
        }

        @Override // tf.AbstractC17251F.a.b
        public AbstractC17251F.a.b i(long j10) {
            this.f162846g = j10;
            this.f162849j = (byte) (this.f162849j | 32);
            return this;
        }

        @Override // tf.AbstractC17251F.a.b
        public AbstractC17251F.a.b j(String str) {
            this.f162847h = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        List<AbstractC17251F.a.AbstractC2552a> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.a) {
            AbstractC17251F.a aVar = (AbstractC17251F.a) obj;
            if (this.f162831a == aVar.d() && this.f162832b.equals(aVar.e()) && this.f162833c == aVar.g() && this.f162834d == aVar.c() && this.f162835e == aVar.f() && this.f162836f == aVar.h() && this.f162837g == aVar.i() && ((str = this.f162838h) != null ? str.equals(aVar.j()) : aVar.j() == null) && ((list = this.f162839i) != null ? list.equals(aVar.b()) : aVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    private C17255c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List<AbstractC17251F.a.AbstractC2552a> list) {
        this.f162831a = i10;
        this.f162832b = str;
        this.f162833c = i11;
        this.f162834d = i12;
        this.f162835e = j10;
        this.f162836f = j11;
        this.f162837g = j12;
        this.f162838h = str2;
        this.f162839i = list;
    }

    @Override // tf.AbstractC17251F.a
    public List<AbstractC17251F.a.AbstractC2552a> b() {
        return this.f162839i;
    }

    @Override // tf.AbstractC17251F.a
    public int c() {
        return this.f162834d;
    }

    @Override // tf.AbstractC17251F.a
    public int d() {
        return this.f162831a;
    }

    @Override // tf.AbstractC17251F.a
    public String e() {
        return this.f162832b;
    }

    @Override // tf.AbstractC17251F.a
    public long f() {
        return this.f162835e;
    }

    @Override // tf.AbstractC17251F.a
    public int g() {
        return this.f162833c;
    }

    @Override // tf.AbstractC17251F.a
    public long h() {
        return this.f162836f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f162831a ^ 1000003) * 1000003) ^ this.f162832b.hashCode()) * 1000003) ^ this.f162833c) * 1000003) ^ this.f162834d) * 1000003;
        long j10 = this.f162835e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f162836f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f162837g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f162838h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC17251F.a.AbstractC2552a> list = this.f162839i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // tf.AbstractC17251F.a
    public long i() {
        return this.f162837g;
    }

    @Override // tf.AbstractC17251F.a
    public String j() {
        return this.f162838h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f162831a + ", processName=" + this.f162832b + ", reasonCode=" + this.f162833c + ", importance=" + this.f162834d + ", pss=" + this.f162835e + ", rss=" + this.f162836f + ", timestamp=" + this.f162837g + ", traceFile=" + this.f162838h + ", buildIdMappingForArch=" + this.f162839i + "}";
    }
}
