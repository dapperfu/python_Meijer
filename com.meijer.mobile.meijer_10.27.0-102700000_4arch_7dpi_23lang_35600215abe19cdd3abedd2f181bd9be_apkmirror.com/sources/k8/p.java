package k8;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: j, reason: collision with root package name */
    public static final p f141701j = j().j();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f141702a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f141703b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f141704c;

    /* renamed from: d, reason: collision with root package name */
    private final int f141705d;

    /* renamed from: e, reason: collision with root package name */
    private final int f141706e;

    /* renamed from: f, reason: collision with root package name */
    private final int f141707f;

    /* renamed from: g, reason: collision with root package name */
    private final int f141708g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f141709h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f141710i;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f141711a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f141712b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f141713c;

        /* renamed from: d, reason: collision with root package name */
        private int f141714d;

        /* renamed from: e, reason: collision with root package name */
        private int f141715e;

        /* renamed from: f, reason: collision with root package name */
        private int f141716f;

        /* renamed from: g, reason: collision with root package name */
        private int f141717g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f141718h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f141719i;

        public b() {
            this.f141711a = false;
            this.f141712b = false;
            this.f141713c = false;
            this.f141714d = 0;
            this.f141715e = 0;
            this.f141716f = 1;
            this.f141717g = 0;
            this.f141718h = false;
            this.f141719i = false;
        }

        public p j() {
            return new p(this);
        }

        public b k(boolean z10) {
            this.f141711a = z10;
            return this;
        }

        public b l(boolean z10) {
            this.f141719i = z10;
            return this;
        }

        public b m(boolean z10) {
            this.f141713c = z10;
            return this;
        }

        public b n(boolean z10) {
            this.f141712b = z10;
            return this;
        }

        public b o(boolean z10) {
            this.f141718h = z10;
            return this;
        }

        public b p(int i10) {
            this.f141716f = i10;
            return this;
        }

        public b q(int i10) {
            this.f141715e = i10;
            return this;
        }

        public b r(int i10) {
            this.f141717g = i10;
            return this;
        }

        public b s(int i10) {
            this.f141714d = i10;
            return this;
        }

        public b(p pVar) {
            this.f141711a = pVar.f141702a;
            this.f141712b = pVar.f141703b;
            this.f141713c = pVar.f141704c;
            this.f141714d = pVar.f141705d;
            this.f141715e = pVar.f141706e;
            this.f141716f = pVar.f141707f;
            this.f141717g = pVar.f141708g;
            this.f141718h = pVar.f141709h;
            this.f141719i = pVar.f141710i;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f141702a == pVar.f141702a && this.f141703b == pVar.f141703b && this.f141706e == pVar.f141706e && this.f141704c == pVar.f141704c && this.f141707f == pVar.f141707f && this.f141708g == pVar.f141708g && this.f141705d == pVar.f141705d && this.f141709h == pVar.f141709h && this.f141710i == pVar.f141710i) {
                return true;
            }
        }
        return false;
    }

    private p(b bVar) {
        this.f141702a = bVar.f141711a;
        this.f141703b = bVar.f141712b;
        this.f141704c = bVar.f141713c;
        this.f141705d = bVar.f141714d;
        this.f141706e = bVar.f141715e;
        this.f141707f = bVar.f141716f;
        this.f141708g = bVar.f141717g;
        this.f141709h = bVar.f141718h;
        this.f141710i = bVar.f141719i;
    }

    public static b j() {
        return new b();
    }

    public int hashCode() {
        int i10 = (((((((this.f141702a ? 1 : 0) * 31) + (this.f141703b ? 1 : 0)) * 31) + (this.f141704c ? 1 : 0)) * 31) + this.f141705d) * 31;
        int i11 = this.f141706e;
        return ((((((((i10 + (i11 ^ (i11 >>> 32))) * 31) + this.f141707f) * 31) + this.f141708g) * 31) + (this.f141709h ? 1 : 0)) * 31) + (this.f141710i ? 1 : 0);
    }

    public boolean k() {
        return this.f141704c;
    }

    public boolean l() {
        return this.f141703b;
    }

    public int m() {
        return this.f141707f;
    }

    public int n() {
        return this.f141706e;
    }

    public int o() {
        return this.f141705d;
    }

    public boolean p() {
        return this.f141702a;
    }

    public boolean q() {
        return this.f141710i;
    }

    public boolean r() {
        return this.f141709h;
    }

    public b s() {
        return new b(this);
    }

    public String toString() {
        return "ReplayConfiguration{capture=" + this.f141702a + ", fullSessionConfigReceived=" + this.f141703b + ", crashesEnabled=" + this.f141704c + ", trafficControlPercentage=" + this.f141705d + ", retentionTime=" + this.f141706e + ", protocolVersion=" + this.f141707f + ", selfMonitoring=" + this.f141708g + ", pixelCopy=" + this.f141709h + ", colorMasking=" + this.f141710i + '}';
    }
}
