package k8;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: p, reason: collision with root package name */
    private static final c f141720p = c.OK;

    /* renamed from: a, reason: collision with root package name */
    private final int f141721a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f141722b;

    /* renamed from: c, reason: collision with root package name */
    private final t f141723c;

    /* renamed from: d, reason: collision with root package name */
    private final int f141724d;

    /* renamed from: e, reason: collision with root package name */
    private final int f141725e;

    /* renamed from: f, reason: collision with root package name */
    private final o f141726f;

    /* renamed from: g, reason: collision with root package name */
    private final int f141727g;

    /* renamed from: h, reason: collision with root package name */
    private final int f141728h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f141729i;

    /* renamed from: j, reason: collision with root package name */
    private final p f141730j;

    /* renamed from: k, reason: collision with root package name */
    private final int f141731k;

    /* renamed from: l, reason: collision with root package name */
    private final int f141732l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f141733m;

    /* renamed from: n, reason: collision with root package name */
    private final c f141734n;

    /* renamed from: o, reason: collision with root package name */
    private final long f141735o;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f141736a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f141737b;

        /* renamed from: c, reason: collision with root package name */
        private t f141738c;

        /* renamed from: d, reason: collision with root package name */
        private int f141739d;

        /* renamed from: e, reason: collision with root package name */
        private int f141740e;

        /* renamed from: f, reason: collision with root package name */
        private o f141741f;

        /* renamed from: g, reason: collision with root package name */
        private int f141742g;

        /* renamed from: h, reason: collision with root package name */
        private int f141743h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f141744i;

        /* renamed from: j, reason: collision with root package name */
        private p f141745j;

        /* renamed from: k, reason: collision with root package name */
        private int f141746k;

        /* renamed from: l, reason: collision with root package name */
        private int f141747l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f141748m;

        /* renamed from: n, reason: collision with root package name */
        private c f141749n;

        /* renamed from: o, reason: collision with root package name */
        private long f141750o;

        public b() {
            this.f141736a = BinsView.TOTE_WIDTH_DP;
            this.f141737b = true;
            this.f141738c = t.f141757c;
            this.f141739d = BinsView.TOTE_HEIGHT_DP;
            this.f141740e = 0;
            this.f141741f = o.f141692e;
            this.f141742g = 1;
            this.f141743h = 100;
            this.f141744i = false;
            this.f141745j = p.f141701j;
            this.f141746k = 1;
            this.f141747l = 1;
            this.f141748m = false;
            this.f141749n = q.f141720p;
            this.f141750o = 0L;
        }

        public b r() {
            this.f141742g = 0;
            return this;
        }

        public b A(int i10) {
            this.f141747l = i10;
            return this;
        }

        public b B(t tVar) {
            this.f141738c = tVar;
            return this;
        }

        public b C(c cVar) {
            this.f141749n = cVar;
            return this;
        }

        public b D(boolean z10) {
            this.f141748m = z10;
            return this;
        }

        public b E(long j10) {
            this.f141750o = j10;
            return this;
        }

        public b F(int i10) {
            this.f141743h = i10;
            return this;
        }

        public q p() {
            return new q(this);
        }

        public b q(int i10) {
            this.f141742g = i10;
            return this;
        }

        public b s(boolean z10) {
            this.f141744i = z10;
            return this;
        }

        public b t(int i10) {
            this.f141736a = i10;
            return this;
        }

        public b u(int i10) {
            this.f141740e = i10;
            return this;
        }

        public b v(int i10) {
            this.f141746k = i10;
            return this;
        }

        public b w(o oVar) {
            this.f141741f = oVar;
            return this;
        }

        public b x(p pVar) {
            this.f141745j = pVar;
            return this;
        }

        public b y(boolean z10) {
            this.f141737b = z10;
            return this;
        }

        public b z(int i10) {
            this.f141739d = i10;
            return this;
        }

        public b(q qVar, boolean z10) {
            this.f141736a = qVar.f141721a;
            this.f141737b = qVar.f141722b;
            this.f141738c = qVar.f141723c;
            this.f141739d = qVar.f141724d;
            this.f141740e = qVar.f141725e;
            this.f141741f = qVar.f141726f;
            this.f141742g = qVar.f141727g;
            this.f141743h = qVar.f141728h;
            this.f141744i = qVar.f141729i;
            this.f141745j = qVar.f141730j.s().j();
            this.f141750o = qVar.f141735o;
            if (!z10) {
                this.f141746k = qVar.f141731k;
                this.f141747l = qVar.f141732l;
                this.f141748m = qVar.f141733m;
                this.f141749n = qVar.f141734n;
                return;
            }
            this.f141746k = 1;
            this.f141747l = 1;
            this.f141748m = false;
            this.f141749n = q.f141720p;
        }
    }

    public enum c {
        OK,
        ERROR
    }

    public b I() {
        return J(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f141721a == qVar.f141721a && this.f141722b == qVar.f141722b && this.f141723c.equals(qVar.f141723c) && this.f141724d == qVar.f141724d && this.f141725e == qVar.f141725e && this.f141726f.equals(qVar.f141726f) && this.f141727g == qVar.f141727g && this.f141728h == qVar.f141728h && this.f141729i == qVar.f141729i && this.f141730j.equals(qVar.f141730j) && this.f141731k == qVar.f141731k && this.f141732l == qVar.f141732l && this.f141733m == qVar.f141733m && this.f141735o == qVar.f141735o && this.f141734n == qVar.f141734n) {
                return true;
            }
        }
        return false;
    }

    private q(b bVar) {
        this.f141721a = bVar.f141736a;
        this.f141722b = bVar.f141737b;
        this.f141723c = bVar.f141738c;
        this.f141724d = bVar.f141739d;
        this.f141725e = bVar.f141740e;
        this.f141726f = bVar.f141741f;
        this.f141727g = bVar.f141742g;
        this.f141728h = bVar.f141743h;
        this.f141730j = bVar.f141745j;
        this.f141729i = bVar.f141744i;
        this.f141731k = bVar.f141746k;
        this.f141732l = bVar.f141747l;
        this.f141733m = bVar.f141748m;
        this.f141735o = bVar.f141750o;
        this.f141734n = bVar.f141749n;
    }

    public static b q() {
        return new b();
    }

    public long A() {
        return this.f141735o;
    }

    public int B() {
        return this.f141728h;
    }

    public boolean C() {
        return this.f141725e > 0;
    }

    public boolean D() {
        return this.f141727g == 1;
    }

    public boolean E() {
        return this.f141729i;
    }

    public boolean F() {
        return this.f141722b;
    }

    public boolean G() {
        return this.f141733m;
    }

    public long H() {
        return (this.f141721a * 1024) - 5;
    }

    public b J(boolean z10) {
        return new b(this, z10);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.f141721a * 31) + (this.f141722b ? 1 : 0)) * 31) + this.f141723c.hashCode()) * 31) + this.f141724d) * 31) + this.f141725e) * 31) + this.f141726f.hashCode()) * 31) + this.f141727g) * 31) + this.f141728h) * 31) + (this.f141729i ? 1 : 0)) * 31) + this.f141730j.hashCode()) * 31) + this.f141731k) * 31) + this.f141732l) * 31) + (this.f141733m ? 1 : 0)) * 31) + this.f141734n.hashCode()) * 31;
        long j10 = this.f141735o;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public int r() {
        return this.f141721a;
    }

    public int s() {
        return this.f141725e;
    }

    public int t() {
        return this.f141731k;
    }

    public String toString() {
        return "ServerConfiguration{maxBeaconSizeKb=" + this.f141721a + ", selfmonitoring=" + this.f141722b + ", sessionSplitConfiguration=" + this.f141723c + ", sendIntervalSec=" + this.f141724d + ", maxCachedCrashesCount=" + this.f141725e + ", rageTapConfiguration=" + this.f141726f + ", capture=" + this.f141727g + ", trafficControlPercentage=" + this.f141728h + ", gen3Enabled=" + this.f141729i + ", replayConfiguration=" + this.f141730j + ", multiplicity=" + this.f141731k + ", serverId=" + this.f141732l + ", switchServer=" + this.f141733m + ", status=" + this.f141734n + ", timestamp=" + this.f141735o + '}';
    }

    public o u() {
        return this.f141726f;
    }

    public p v() {
        return this.f141730j;
    }

    public int w() {
        return this.f141724d;
    }

    public int x() {
        return this.f141732l;
    }

    public t y() {
        return this.f141723c;
    }

    public c z() {
        return this.f141734n;
    }
}
