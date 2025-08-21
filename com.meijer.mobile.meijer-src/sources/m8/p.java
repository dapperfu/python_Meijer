package m8;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: j, reason: collision with root package name */
    public static final p f150847j = j().j();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f150848a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f150849b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f150850c;

    /* renamed from: d, reason: collision with root package name */
    private final int f150851d;

    /* renamed from: e, reason: collision with root package name */
    private final int f150852e;

    /* renamed from: f, reason: collision with root package name */
    private final int f150853f;

    /* renamed from: g, reason: collision with root package name */
    private final int f150854g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f150855h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f150856i;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f150857a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f150858b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f150859c;

        /* renamed from: d, reason: collision with root package name */
        private int f150860d;

        /* renamed from: e, reason: collision with root package name */
        private int f150861e;

        /* renamed from: f, reason: collision with root package name */
        private int f150862f;

        /* renamed from: g, reason: collision with root package name */
        private int f150863g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f150864h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f150865i;

        public b() {
            this.f150857a = false;
            this.f150858b = false;
            this.f150859c = false;
            this.f150860d = 0;
            this.f150861e = 0;
            this.f150862f = 1;
            this.f150863g = 0;
            this.f150864h = false;
            this.f150865i = false;
        }

        public p j() {
            return new p(this);
        }

        public b k(boolean z10) {
            this.f150857a = z10;
            return this;
        }

        public b l(boolean z10) {
            this.f150865i = z10;
            return this;
        }

        public b m(boolean z10) {
            this.f150859c = z10;
            return this;
        }

        public b n(boolean z10) {
            this.f150858b = z10;
            return this;
        }

        public b o(boolean z10) {
            this.f150864h = z10;
            return this;
        }

        public b p(int i10) {
            this.f150862f = i10;
            return this;
        }

        public b q(int i10) {
            this.f150861e = i10;
            return this;
        }

        public b r(int i10) {
            this.f150863g = i10;
            return this;
        }

        public b s(int i10) {
            this.f150860d = i10;
            return this;
        }

        public b(p pVar) {
            this.f150857a = pVar.f150848a;
            this.f150858b = pVar.f150849b;
            this.f150859c = pVar.f150850c;
            this.f150860d = pVar.f150851d;
            this.f150861e = pVar.f150852e;
            this.f150862f = pVar.f150853f;
            this.f150863g = pVar.f150854g;
            this.f150864h = pVar.f150855h;
            this.f150865i = pVar.f150856i;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f150848a == pVar.f150848a && this.f150849b == pVar.f150849b && this.f150852e == pVar.f150852e && this.f150850c == pVar.f150850c && this.f150853f == pVar.f150853f && this.f150854g == pVar.f150854g && this.f150851d == pVar.f150851d && this.f150855h == pVar.f150855h && this.f150856i == pVar.f150856i) {
                return true;
            }
        }
        return false;
    }

    private p(b bVar) {
        this.f150848a = bVar.f150857a;
        this.f150849b = bVar.f150858b;
        this.f150850c = bVar.f150859c;
        this.f150851d = bVar.f150860d;
        this.f150852e = bVar.f150861e;
        this.f150853f = bVar.f150862f;
        this.f150854g = bVar.f150863g;
        this.f150855h = bVar.f150864h;
        this.f150856i = bVar.f150865i;
    }

    public static b j() {
        return new b();
    }

    public int hashCode() {
        int i10 = (((((((this.f150848a ? 1 : 0) * 31) + (this.f150849b ? 1 : 0)) * 31) + (this.f150850c ? 1 : 0)) * 31) + this.f150851d) * 31;
        int i11 = this.f150852e;
        return ((((((((i10 + (i11 ^ (i11 >>> 32))) * 31) + this.f150853f) * 31) + this.f150854g) * 31) + (this.f150855h ? 1 : 0)) * 31) + (this.f150856i ? 1 : 0);
    }

    public boolean k() {
        return this.f150850c;
    }

    public boolean l() {
        return this.f150849b;
    }

    public int m() {
        return this.f150853f;
    }

    public int n() {
        return this.f150852e;
    }

    public int o() {
        return this.f150851d;
    }

    public boolean p() {
        return this.f150848a;
    }

    public boolean q() {
        return this.f150856i;
    }

    public boolean r() {
        return this.f150855h;
    }

    public b s() {
        return new b(this);
    }

    public String toString() {
        return "ReplayConfiguration{capture=" + this.f150848a + ", fullSessionConfigReceived=" + this.f150849b + ", crashesEnabled=" + this.f150850c + ", trafficControlPercentage=" + this.f150851d + ", retentionTime=" + this.f150852e + ", protocolVersion=" + this.f150853f + ", selfMonitoring=" + this.f150854g + ", pixelCopy=" + this.f150855h + ", colorMasking=" + this.f150856i + '}';
    }
}
