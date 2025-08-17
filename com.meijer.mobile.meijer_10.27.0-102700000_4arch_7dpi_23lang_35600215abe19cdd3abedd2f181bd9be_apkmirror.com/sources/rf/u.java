package rf;

import fsimpl.C14045dq;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class u extends AbstractC16777F.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f158573a;

    /* renamed from: b, reason: collision with root package name */
    private final int f158574b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f158575c;

    /* renamed from: d, reason: collision with root package name */
    private final int f158576d;

    /* renamed from: e, reason: collision with root package name */
    private final long f158577e;

    /* renamed from: f, reason: collision with root package name */
    private final long f158578f;

    static final class b extends AbstractC16777F.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f158579a;

        /* renamed from: b, reason: collision with root package name */
        private int f158580b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f158581c;

        /* renamed from: d, reason: collision with root package name */
        private int f158582d;

        /* renamed from: e, reason: collision with root package name */
        private long f158583e;

        /* renamed from: f, reason: collision with root package name */
        private long f158584f;

        /* renamed from: g, reason: collision with root package name */
        private byte f158585g;

        @Override // rf.AbstractC16777F.e.d.c.a
        public AbstractC16777F.e.d.c a() {
            if (this.f158585g == 31) {
                return new u(this.f158579a, this.f158580b, this.f158581c, this.f158582d, this.f158583e, this.f158584f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f158585g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f158585g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f158585g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f158585g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f158585g & C14045dq.SCREEN) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.c.a
        public AbstractC16777F.e.d.c.a b(Double d10) {
            this.f158579a = d10;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.c.a
        public AbstractC16777F.e.d.c.a c(int i10) {
            this.f158580b = i10;
            this.f158585g = (byte) (this.f158585g | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.c.a
        public AbstractC16777F.e.d.c.a d(long j10) {
            this.f158584f = j10;
            this.f158585g = (byte) (this.f158585g | C14045dq.SCREEN);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.c.a
        public AbstractC16777F.e.d.c.a e(int i10) {
            this.f158582d = i10;
            this.f158585g = (byte) (this.f158585g | 4);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.c.a
        public AbstractC16777F.e.d.c.a f(boolean z10) {
            this.f158581c = z10;
            this.f158585g = (byte) (this.f158585g | 2);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.c.a
        public AbstractC16777F.e.d.c.a g(long j10) {
            this.f158583e = j10;
            this.f158585g = (byte) (this.f158585g | 8);
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.c) {
            AbstractC16777F.e.d.c cVar = (AbstractC16777F.e.d.c) obj;
            Double d10 = this.f158573a;
            if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
                if (this.f158574b == cVar.c() && this.f158575c == cVar.g() && this.f158576d == cVar.e() && this.f158577e == cVar.f() && this.f158578f == cVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    private u(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f158573a = d10;
        this.f158574b = i10;
        this.f158575c = z10;
        this.f158576d = i11;
        this.f158577e = j10;
        this.f158578f = j11;
    }

    @Override // rf.AbstractC16777F.e.d.c
    public Double b() {
        return this.f158573a;
    }

    @Override // rf.AbstractC16777F.e.d.c
    public int c() {
        return this.f158574b;
    }

    @Override // rf.AbstractC16777F.e.d.c
    public long d() {
        return this.f158578f;
    }

    @Override // rf.AbstractC16777F.e.d.c
    public int e() {
        return this.f158576d;
    }

    @Override // rf.AbstractC16777F.e.d.c
    public long f() {
        return this.f158577e;
    }

    @Override // rf.AbstractC16777F.e.d.c
    public boolean g() {
        return this.f158575c;
    }

    public int hashCode() {
        Double d10 = this.f158573a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f158574b) * 1000003) ^ (this.f158575c ? 1231 : 1237)) * 1000003) ^ this.f158576d) * 1000003;
        long j10 = this.f158577e;
        long j11 = this.f158578f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f158573a + ", batteryVelocity=" + this.f158574b + ", proximityOn=" + this.f158575c + ", orientation=" + this.f158576d + ", ramUsed=" + this.f158577e + ", diskUsed=" + this.f158578f + "}";
    }
}
