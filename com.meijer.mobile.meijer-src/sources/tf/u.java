package tf;

import fsimpl.C14170dq;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class u extends AbstractC17251F.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f163019a;

    /* renamed from: b, reason: collision with root package name */
    private final int f163020b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f163021c;

    /* renamed from: d, reason: collision with root package name */
    private final int f163022d;

    /* renamed from: e, reason: collision with root package name */
    private final long f163023e;

    /* renamed from: f, reason: collision with root package name */
    private final long f163024f;

    static final class b extends AbstractC17251F.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f163025a;

        /* renamed from: b, reason: collision with root package name */
        private int f163026b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f163027c;

        /* renamed from: d, reason: collision with root package name */
        private int f163028d;

        /* renamed from: e, reason: collision with root package name */
        private long f163029e;

        /* renamed from: f, reason: collision with root package name */
        private long f163030f;

        /* renamed from: g, reason: collision with root package name */
        private byte f163031g;

        @Override // tf.AbstractC17251F.e.d.c.a
        public AbstractC17251F.e.d.c a() {
            if (this.f163031g == 31) {
                return new u(this.f163025a, this.f163026b, this.f163027c, this.f163028d, this.f163029e, this.f163030f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f163031g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f163031g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f163031g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f163031g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f163031g & C14170dq.SCREEN) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.c.a
        public AbstractC17251F.e.d.c.a b(Double d10) {
            this.f163025a = d10;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.c.a
        public AbstractC17251F.e.d.c.a c(int i10) {
            this.f163026b = i10;
            this.f163031g = (byte) (this.f163031g | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.c.a
        public AbstractC17251F.e.d.c.a d(long j10) {
            this.f163030f = j10;
            this.f163031g = (byte) (this.f163031g | C14170dq.SCREEN);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.c.a
        public AbstractC17251F.e.d.c.a e(int i10) {
            this.f163028d = i10;
            this.f163031g = (byte) (this.f163031g | 4);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.c.a
        public AbstractC17251F.e.d.c.a f(boolean z10) {
            this.f163027c = z10;
            this.f163031g = (byte) (this.f163031g | 2);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.c.a
        public AbstractC17251F.e.d.c.a g(long j10) {
            this.f163029e = j10;
            this.f163031g = (byte) (this.f163031g | 8);
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.c) {
            AbstractC17251F.e.d.c cVar = (AbstractC17251F.e.d.c) obj;
            Double d10 = this.f163019a;
            if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
                if (this.f163020b == cVar.c() && this.f163021c == cVar.g() && this.f163022d == cVar.e() && this.f163023e == cVar.f() && this.f163024f == cVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    private u(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f163019a = d10;
        this.f163020b = i10;
        this.f163021c = z10;
        this.f163022d = i11;
        this.f163023e = j10;
        this.f163024f = j11;
    }

    @Override // tf.AbstractC17251F.e.d.c
    public Double b() {
        return this.f163019a;
    }

    @Override // tf.AbstractC17251F.e.d.c
    public int c() {
        return this.f163020b;
    }

    @Override // tf.AbstractC17251F.e.d.c
    public long d() {
        return this.f163024f;
    }

    @Override // tf.AbstractC17251F.e.d.c
    public int e() {
        return this.f163022d;
    }

    @Override // tf.AbstractC17251F.e.d.c
    public long f() {
        return this.f163023e;
    }

    @Override // tf.AbstractC17251F.e.d.c
    public boolean g() {
        return this.f163021c;
    }

    public int hashCode() {
        Double d10 = this.f163019a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f163020b) * 1000003) ^ (this.f163021c ? 1231 : 1237)) * 1000003) ^ this.f163022d) * 1000003;
        long j10 = this.f163023e;
        long j11 = this.f163024f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f163019a + ", batteryVelocity=" + this.f163020b + ", proximityOn=" + this.f163021c + ", orientation=" + this.f163022d + ", ramUsed=" + this.f163023e + ", diskUsed=" + this.f163024f + "}";
    }
}
