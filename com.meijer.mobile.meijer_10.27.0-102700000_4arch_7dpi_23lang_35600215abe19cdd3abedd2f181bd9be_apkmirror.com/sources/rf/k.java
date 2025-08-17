package rf;

import fsimpl.C14045dq;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class k extends AbstractC16777F.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f158462a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158463b;

    /* renamed from: c, reason: collision with root package name */
    private final int f158464c;

    /* renamed from: d, reason: collision with root package name */
    private final long f158465d;

    /* renamed from: e, reason: collision with root package name */
    private final long f158466e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f158467f;

    /* renamed from: g, reason: collision with root package name */
    private final int f158468g;

    /* renamed from: h, reason: collision with root package name */
    private final String f158469h;

    /* renamed from: i, reason: collision with root package name */
    private final String f158470i;

    static final class b extends AbstractC16777F.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private int f158471a;

        /* renamed from: b, reason: collision with root package name */
        private String f158472b;

        /* renamed from: c, reason: collision with root package name */
        private int f158473c;

        /* renamed from: d, reason: collision with root package name */
        private long f158474d;

        /* renamed from: e, reason: collision with root package name */
        private long f158475e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f158476f;

        /* renamed from: g, reason: collision with root package name */
        private int f158477g;

        /* renamed from: h, reason: collision with root package name */
        private String f158478h;

        /* renamed from: i, reason: collision with root package name */
        private String f158479i;

        /* renamed from: j, reason: collision with root package name */
        private byte f158480j;

        @Override // rf.AbstractC16777F.e.c.a
        public AbstractC16777F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f158480j == 63 && (str = this.f158472b) != null && (str2 = this.f158478h) != null && (str3 = this.f158479i) != null) {
                return new k(this.f158471a, str, this.f158473c, this.f158474d, this.f158475e, this.f158476f, this.f158477g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f158480j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f158472b == null) {
                sb2.append(" model");
            }
            if ((this.f158480j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f158480j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f158480j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f158480j & C14045dq.SCREEN) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f158480j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f158478h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f158479i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.c.a
        public AbstractC16777F.e.c.a b(int i10) {
            this.f158471a = i10;
            this.f158480j = (byte) (this.f158480j | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.c.a
        public AbstractC16777F.e.c.a c(int i10) {
            this.f158473c = i10;
            this.f158480j = (byte) (this.f158480j | 2);
            return this;
        }

        @Override // rf.AbstractC16777F.e.c.a
        public AbstractC16777F.e.c.a d(long j10) {
            this.f158475e = j10;
            this.f158480j = (byte) (this.f158480j | 8);
            return this;
        }

        @Override // rf.AbstractC16777F.e.c.a
        public AbstractC16777F.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f158478h = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.c.a
        public AbstractC16777F.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f158472b = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.c.a
        public AbstractC16777F.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f158479i = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.c.a
        public AbstractC16777F.e.c.a h(long j10) {
            this.f158474d = j10;
            this.f158480j = (byte) (this.f158480j | 4);
            return this;
        }

        @Override // rf.AbstractC16777F.e.c.a
        public AbstractC16777F.e.c.a i(boolean z10) {
            this.f158476f = z10;
            this.f158480j = (byte) (this.f158480j | C14045dq.SCREEN);
            return this;
        }

        @Override // rf.AbstractC16777F.e.c.a
        public AbstractC16777F.e.c.a j(int i10) {
            this.f158477g = i10;
            this.f158480j = (byte) (this.f158480j | 32);
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.c) {
            AbstractC16777F.e.c cVar = (AbstractC16777F.e.c) obj;
            if (this.f158462a == cVar.b() && this.f158463b.equals(cVar.f()) && this.f158464c == cVar.c() && this.f158465d == cVar.h() && this.f158466e == cVar.d() && this.f158467f == cVar.j() && this.f158468g == cVar.i() && this.f158469h.equals(cVar.e()) && this.f158470i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f158462a = i10;
        this.f158463b = str;
        this.f158464c = i11;
        this.f158465d = j10;
        this.f158466e = j11;
        this.f158467f = z10;
        this.f158468g = i12;
        this.f158469h = str2;
        this.f158470i = str3;
    }

    @Override // rf.AbstractC16777F.e.c
    public int b() {
        return this.f158462a;
    }

    @Override // rf.AbstractC16777F.e.c
    public int c() {
        return this.f158464c;
    }

    @Override // rf.AbstractC16777F.e.c
    public long d() {
        return this.f158466e;
    }

    @Override // rf.AbstractC16777F.e.c
    public String e() {
        return this.f158469h;
    }

    @Override // rf.AbstractC16777F.e.c
    public String f() {
        return this.f158463b;
    }

    @Override // rf.AbstractC16777F.e.c
    public String g() {
        return this.f158470i;
    }

    @Override // rf.AbstractC16777F.e.c
    public long h() {
        return this.f158465d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f158462a ^ 1000003) * 1000003) ^ this.f158463b.hashCode()) * 1000003) ^ this.f158464c) * 1000003;
        long j10 = this.f158465d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f158466e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f158467f ? 1231 : 1237)) * 1000003) ^ this.f158468g) * 1000003) ^ this.f158469h.hashCode()) * 1000003) ^ this.f158470i.hashCode();
    }

    @Override // rf.AbstractC16777F.e.c
    public int i() {
        return this.f158468g;
    }

    @Override // rf.AbstractC16777F.e.c
    public boolean j() {
        return this.f158467f;
    }

    public String toString() {
        return "Device{arch=" + this.f158462a + ", model=" + this.f158463b + ", cores=" + this.f158464c + ", ram=" + this.f158465d + ", diskSpace=" + this.f158466e + ", simulator=" + this.f158467f + ", state=" + this.f158468g + ", manufacturer=" + this.f158469h + ", modelClass=" + this.f158470i + "}";
    }
}
