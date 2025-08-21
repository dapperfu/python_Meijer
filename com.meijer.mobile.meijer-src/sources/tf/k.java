package tf;

import fsimpl.C14170dq;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class k extends AbstractC17251F.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f162908a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162909b;

    /* renamed from: c, reason: collision with root package name */
    private final int f162910c;

    /* renamed from: d, reason: collision with root package name */
    private final long f162911d;

    /* renamed from: e, reason: collision with root package name */
    private final long f162912e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f162913f;

    /* renamed from: g, reason: collision with root package name */
    private final int f162914g;

    /* renamed from: h, reason: collision with root package name */
    private final String f162915h;

    /* renamed from: i, reason: collision with root package name */
    private final String f162916i;

    static final class b extends AbstractC17251F.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private int f162917a;

        /* renamed from: b, reason: collision with root package name */
        private String f162918b;

        /* renamed from: c, reason: collision with root package name */
        private int f162919c;

        /* renamed from: d, reason: collision with root package name */
        private long f162920d;

        /* renamed from: e, reason: collision with root package name */
        private long f162921e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f162922f;

        /* renamed from: g, reason: collision with root package name */
        private int f162923g;

        /* renamed from: h, reason: collision with root package name */
        private String f162924h;

        /* renamed from: i, reason: collision with root package name */
        private String f162925i;

        /* renamed from: j, reason: collision with root package name */
        private byte f162926j;

        @Override // tf.AbstractC17251F.e.c.a
        public AbstractC17251F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f162926j == 63 && (str = this.f162918b) != null && (str2 = this.f162924h) != null && (str3 = this.f162925i) != null) {
                return new k(this.f162917a, str, this.f162919c, this.f162920d, this.f162921e, this.f162922f, this.f162923g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f162926j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f162918b == null) {
                sb2.append(" model");
            }
            if ((this.f162926j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f162926j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f162926j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f162926j & C14170dq.SCREEN) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f162926j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f162924h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f162925i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.c.a
        public AbstractC17251F.e.c.a b(int i10) {
            this.f162917a = i10;
            this.f162926j = (byte) (this.f162926j | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.c.a
        public AbstractC17251F.e.c.a c(int i10) {
            this.f162919c = i10;
            this.f162926j = (byte) (this.f162926j | 2);
            return this;
        }

        @Override // tf.AbstractC17251F.e.c.a
        public AbstractC17251F.e.c.a d(long j10) {
            this.f162921e = j10;
            this.f162926j = (byte) (this.f162926j | 8);
            return this;
        }

        @Override // tf.AbstractC17251F.e.c.a
        public AbstractC17251F.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f162924h = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.c.a
        public AbstractC17251F.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f162918b = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.c.a
        public AbstractC17251F.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f162925i = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.c.a
        public AbstractC17251F.e.c.a h(long j10) {
            this.f162920d = j10;
            this.f162926j = (byte) (this.f162926j | 4);
            return this;
        }

        @Override // tf.AbstractC17251F.e.c.a
        public AbstractC17251F.e.c.a i(boolean z10) {
            this.f162922f = z10;
            this.f162926j = (byte) (this.f162926j | C14170dq.SCREEN);
            return this;
        }

        @Override // tf.AbstractC17251F.e.c.a
        public AbstractC17251F.e.c.a j(int i10) {
            this.f162923g = i10;
            this.f162926j = (byte) (this.f162926j | 32);
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.c) {
            AbstractC17251F.e.c cVar = (AbstractC17251F.e.c) obj;
            if (this.f162908a == cVar.b() && this.f162909b.equals(cVar.f()) && this.f162910c == cVar.c() && this.f162911d == cVar.h() && this.f162912e == cVar.d() && this.f162913f == cVar.j() && this.f162914g == cVar.i() && this.f162915h.equals(cVar.e()) && this.f162916i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f162908a = i10;
        this.f162909b = str;
        this.f162910c = i11;
        this.f162911d = j10;
        this.f162912e = j11;
        this.f162913f = z10;
        this.f162914g = i12;
        this.f162915h = str2;
        this.f162916i = str3;
    }

    @Override // tf.AbstractC17251F.e.c
    public int b() {
        return this.f162908a;
    }

    @Override // tf.AbstractC17251F.e.c
    public int c() {
        return this.f162910c;
    }

    @Override // tf.AbstractC17251F.e.c
    public long d() {
        return this.f162912e;
    }

    @Override // tf.AbstractC17251F.e.c
    public String e() {
        return this.f162915h;
    }

    @Override // tf.AbstractC17251F.e.c
    public String f() {
        return this.f162909b;
    }

    @Override // tf.AbstractC17251F.e.c
    public String g() {
        return this.f162916i;
    }

    @Override // tf.AbstractC17251F.e.c
    public long h() {
        return this.f162911d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f162908a ^ 1000003) * 1000003) ^ this.f162909b.hashCode()) * 1000003) ^ this.f162910c) * 1000003;
        long j10 = this.f162911d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f162912e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f162913f ? 1231 : 1237)) * 1000003) ^ this.f162914g) * 1000003) ^ this.f162915h.hashCode()) * 1000003) ^ this.f162916i.hashCode();
    }

    @Override // tf.AbstractC17251F.e.c
    public int i() {
        return this.f162914g;
    }

    @Override // tf.AbstractC17251F.e.c
    public boolean j() {
        return this.f162913f;
    }

    public String toString() {
        return "Device{arch=" + this.f162908a + ", model=" + this.f162909b + ", cores=" + this.f162910c + ", ram=" + this.f162911d + ", diskSpace=" + this.f162912e + ", simulator=" + this.f162913f + ", state=" + this.f162914g + ", manufacturer=" + this.f162915h + ", modelClass=" + this.f162916i + "}";
    }
}
