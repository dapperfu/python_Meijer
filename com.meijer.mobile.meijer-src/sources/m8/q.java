package m8;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: p, reason: collision with root package name */
    private static final c f150866p = c.OK;

    /* renamed from: a, reason: collision with root package name */
    private final int f150867a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f150868b;

    /* renamed from: c, reason: collision with root package name */
    private final t f150869c;

    /* renamed from: d, reason: collision with root package name */
    private final int f150870d;

    /* renamed from: e, reason: collision with root package name */
    private final int f150871e;

    /* renamed from: f, reason: collision with root package name */
    private final o f150872f;

    /* renamed from: g, reason: collision with root package name */
    private final int f150873g;

    /* renamed from: h, reason: collision with root package name */
    private final int f150874h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f150875i;

    /* renamed from: j, reason: collision with root package name */
    private final p f150876j;

    /* renamed from: k, reason: collision with root package name */
    private final int f150877k;

    /* renamed from: l, reason: collision with root package name */
    private final int f150878l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f150879m;

    /* renamed from: n, reason: collision with root package name */
    private final c f150880n;

    /* renamed from: o, reason: collision with root package name */
    private final long f150881o;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f150882a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f150883b;

        /* renamed from: c, reason: collision with root package name */
        private t f150884c;

        /* renamed from: d, reason: collision with root package name */
        private int f150885d;

        /* renamed from: e, reason: collision with root package name */
        private int f150886e;

        /* renamed from: f, reason: collision with root package name */
        private o f150887f;

        /* renamed from: g, reason: collision with root package name */
        private int f150888g;

        /* renamed from: h, reason: collision with root package name */
        private int f150889h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f150890i;

        /* renamed from: j, reason: collision with root package name */
        private p f150891j;

        /* renamed from: k, reason: collision with root package name */
        private int f150892k;

        /* renamed from: l, reason: collision with root package name */
        private int f150893l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f150894m;

        /* renamed from: n, reason: collision with root package name */
        private c f150895n;

        /* renamed from: o, reason: collision with root package name */
        private long f150896o;

        public b() {
            this.f150882a = BinsView.TOTE_WIDTH_DP;
            this.f150883b = true;
            this.f150884c = t.f150903c;
            this.f150885d = BinsView.TOTE_HEIGHT_DP;
            this.f150886e = 0;
            this.f150887f = o.f150838e;
            this.f150888g = 1;
            this.f150889h = 100;
            this.f150890i = false;
            this.f150891j = p.f150847j;
            this.f150892k = 1;
            this.f150893l = 1;
            this.f150894m = false;
            this.f150895n = q.f150866p;
            this.f150896o = 0L;
        }

        public b r() {
            this.f150888g = 0;
            return this;
        }

        public b A(int i10) {
            this.f150893l = i10;
            return this;
        }

        public b B(t tVar) {
            this.f150884c = tVar;
            return this;
        }

        public b C(c cVar) {
            this.f150895n = cVar;
            return this;
        }

        public b D(boolean z10) {
            this.f150894m = z10;
            return this;
        }

        public b E(long j10) {
            this.f150896o = j10;
            return this;
        }

        public b F(int i10) {
            this.f150889h = i10;
            return this;
        }

        public q p() {
            return new q(this);
        }

        public b q(int i10) {
            this.f150888g = i10;
            return this;
        }

        public b s(boolean z10) {
            this.f150890i = z10;
            return this;
        }

        public b t(int i10) {
            this.f150882a = i10;
            return this;
        }

        public b u(int i10) {
            this.f150886e = i10;
            return this;
        }

        public b v(int i10) {
            this.f150892k = i10;
            return this;
        }

        public b w(o oVar) {
            this.f150887f = oVar;
            return this;
        }

        public b x(p pVar) {
            this.f150891j = pVar;
            return this;
        }

        public b y(boolean z10) {
            this.f150883b = z10;
            return this;
        }

        public b z(int i10) {
            this.f150885d = i10;
            return this;
        }

        public b(q qVar, boolean z10) {
            this.f150882a = qVar.f150867a;
            this.f150883b = qVar.f150868b;
            this.f150884c = qVar.f150869c;
            this.f150885d = qVar.f150870d;
            this.f150886e = qVar.f150871e;
            this.f150887f = qVar.f150872f;
            this.f150888g = qVar.f150873g;
            this.f150889h = qVar.f150874h;
            this.f150890i = qVar.f150875i;
            this.f150891j = qVar.f150876j.s().j();
            this.f150896o = qVar.f150881o;
            if (!z10) {
                this.f150892k = qVar.f150877k;
                this.f150893l = qVar.f150878l;
                this.f150894m = qVar.f150879m;
                this.f150895n = qVar.f150880n;
                return;
            }
            this.f150892k = 1;
            this.f150893l = 1;
            this.f150894m = false;
            this.f150895n = q.f150866p;
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
            if (this.f150867a == qVar.f150867a && this.f150868b == qVar.f150868b && this.f150869c.equals(qVar.f150869c) && this.f150870d == qVar.f150870d && this.f150871e == qVar.f150871e && this.f150872f.equals(qVar.f150872f) && this.f150873g == qVar.f150873g && this.f150874h == qVar.f150874h && this.f150875i == qVar.f150875i && this.f150876j.equals(qVar.f150876j) && this.f150877k == qVar.f150877k && this.f150878l == qVar.f150878l && this.f150879m == qVar.f150879m && this.f150881o == qVar.f150881o && this.f150880n == qVar.f150880n) {
                return true;
            }
        }
        return false;
    }

    private q(b bVar) {
        this.f150867a = bVar.f150882a;
        this.f150868b = bVar.f150883b;
        this.f150869c = bVar.f150884c;
        this.f150870d = bVar.f150885d;
        this.f150871e = bVar.f150886e;
        this.f150872f = bVar.f150887f;
        this.f150873g = bVar.f150888g;
        this.f150874h = bVar.f150889h;
        this.f150876j = bVar.f150891j;
        this.f150875i = bVar.f150890i;
        this.f150877k = bVar.f150892k;
        this.f150878l = bVar.f150893l;
        this.f150879m = bVar.f150894m;
        this.f150881o = bVar.f150896o;
        this.f150880n = bVar.f150895n;
    }

    public static b q() {
        return new b();
    }

    public long A() {
        return this.f150881o;
    }

    public int B() {
        return this.f150874h;
    }

    public boolean C() {
        return this.f150871e > 0;
    }

    public boolean D() {
        return this.f150873g == 1;
    }

    public boolean E() {
        return this.f150875i;
    }

    public boolean F() {
        return this.f150868b;
    }

    public boolean G() {
        return this.f150879m;
    }

    public long H() {
        return (this.f150867a * 1024) - 5;
    }

    public b J(boolean z10) {
        return new b(this, z10);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.f150867a * 31) + (this.f150868b ? 1 : 0)) * 31) + this.f150869c.hashCode()) * 31) + this.f150870d) * 31) + this.f150871e) * 31) + this.f150872f.hashCode()) * 31) + this.f150873g) * 31) + this.f150874h) * 31) + (this.f150875i ? 1 : 0)) * 31) + this.f150876j.hashCode()) * 31) + this.f150877k) * 31) + this.f150878l) * 31) + (this.f150879m ? 1 : 0)) * 31) + this.f150880n.hashCode()) * 31;
        long j10 = this.f150881o;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public int r() {
        return this.f150867a;
    }

    public int s() {
        return this.f150871e;
    }

    public int t() {
        return this.f150877k;
    }

    public String toString() {
        return "ServerConfiguration{maxBeaconSizeKb=" + this.f150867a + ", selfmonitoring=" + this.f150868b + ", sessionSplitConfiguration=" + this.f150869c + ", sendIntervalSec=" + this.f150870d + ", maxCachedCrashesCount=" + this.f150871e + ", rageTapConfiguration=" + this.f150872f + ", capture=" + this.f150873g + ", trafficControlPercentage=" + this.f150874h + ", gen3Enabled=" + this.f150875i + ", replayConfiguration=" + this.f150876j + ", multiplicity=" + this.f150877k + ", serverId=" + this.f150878l + ", switchServer=" + this.f150879m + ", status=" + this.f150880n + ", timestamp=" + this.f150881o + '}';
    }

    public o u() {
        return this.f150872f;
    }

    public p v() {
        return this.f150876j;
    }

    public int w() {
        return this.f150870d;
    }

    public int x() {
        return this.f150878l;
    }

    public t y() {
        return this.f150869c;
    }

    public c z() {
        return this.f150880n;
    }
}
