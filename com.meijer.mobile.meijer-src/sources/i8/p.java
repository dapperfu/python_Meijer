package i8;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: s, reason: collision with root package name */
    static AtomicInteger f137322s = new AtomicInteger(0);

    /* renamed from: t, reason: collision with root package name */
    public static int f137323t = 100;

    /* renamed from: a, reason: collision with root package name */
    protected String f137324a;

    /* renamed from: b, reason: collision with root package name */
    protected long f137325b;

    /* renamed from: c, reason: collision with root package name */
    protected long f137326c;

    /* renamed from: d, reason: collision with root package name */
    protected long f137327d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f137328e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f137329f;

    /* renamed from: g, reason: collision with root package name */
    protected int f137330g;

    /* renamed from: h, reason: collision with root package name */
    protected p8.b f137331h;

    /* renamed from: i, reason: collision with root package name */
    protected int f137332i;

    /* renamed from: j, reason: collision with root package name */
    protected w f137333j;

    /* renamed from: k, reason: collision with root package name */
    protected p f137334k;

    /* renamed from: l, reason: collision with root package name */
    protected p f137335l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicInteger f137336m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicInteger f137337n;

    /* renamed from: o, reason: collision with root package name */
    private String f137338o;

    /* renamed from: p, reason: collision with root package name */
    private int f137339p;

    /* renamed from: q, reason: collision with root package name */
    private long f137340q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f137341r;

    public p(String str, int i10, w wVar, long j10, p8.b bVar, int i11, boolean z10) {
        this.f137325b = -1L;
        this.f137326c = -1L;
        this.f137327d = 0L;
        this.f137328e = false;
        this.f137329f = true;
        this.f137334k = null;
        this.f137335l = null;
        this.f137336m = new AtomicInteger(0);
        this.f137337n = new AtomicInteger(1);
        this.f137338o = "";
        this.f137340q = 0L;
        this.f137331h = bVar;
        this.f137339p = i10;
        this.f137333j = wVar;
        long jH = bVar.h();
        this.f137325b = jH;
        this.f137326c = jH;
        this.f137327d = j10;
        this.f137340q = z8.f.g();
        this.f137330g = z8.f.f();
        this.f137332i = i11;
        this.f137328e = i10 != 5;
        x(str);
        if (j10 == 0) {
            bVar.y(C14693B.a());
        }
        this.f137341r = z10;
    }

    public void c() {
        this.f137329f = false;
        this.f137328e = true;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137342a;

        static {
            int[] iArr = new int[w.values().length];
            f137342a = iArr;
            try {
                iArr[w.f137392i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137342a[w.f137390g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137342a[w.f137391h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137342a[w.f137389f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f137342a[w.f137401r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f137342a[w.f137398o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f137342a[w.f137402s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private int A() {
        return this.f137335l.f137337n.get();
    }

    private void d(StringBuilder sb2) {
        sb2.append("&na=");
        sb2.append(z8.f.t(h()));
        sb2.append("&it=");
        sb2.append(z8.f.e());
        sb2.append("&pa=");
        sb2.append(j());
        sb2.append("&s0=");
        sb2.append(g());
        sb2.append("&t0=");
        sb2.append(n());
    }

    protected void C(long j10) {
        if (this.f137328e) {
            return;
        }
        this.f137326c = j10;
        this.f137328e = true;
        if (this.f137327d == 0) {
            this.f137331h.y(C14693B.a());
        }
    }

    protected void a(StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            sb2.append(str);
            if (str2.isEmpty()) {
                return;
            }
            sb2.append(str2);
        }
    }

    public StringBuilder b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(this.f137333j.e());
        switch (a.f137342a[this.f137333j.ordinal()]) {
            case 1:
                d(sb2);
                sb2.append("&vl=");
                sb2.append(z8.f.t(this.f137324a));
                break;
            case 2:
                d(sb2);
                a(sb2, "&vl=", z8.f.t(this.f137324a));
                break;
            case 3:
                d(sb2);
                sb2.append("&vl=");
                sb2.append(z8.f.t(this.f137324a));
                break;
            case 4:
                d(sb2);
                break;
            case 5:
                d(sb2);
                break;
            case 6:
                d(sb2);
                sb2.append("&ev=");
                sb2.append(z8.f.t(this.f137324a));
                sb2.append("&tt=");
                sb2.append(o8.d.CUSTOM.b());
                break;
            case 7:
                sb2.append("&na=");
                sb2.append(z8.f.t(h()));
                a(sb2, "&pl=", z8.f.t(this.f137324a));
                sb2.append("&t0=");
                sb2.append(n());
                break;
        }
        sb2.append("&fw=");
        sb2.append(this.f137341r ? "1" : "0");
        return sb2;
    }

    protected long e() {
        return this.f137326c;
    }

    public w f() {
        return this.f137333j;
    }

    public int g() {
        return this.f137330g;
    }

    public String h() {
        return this.f137338o;
    }

    protected long i() {
        return 0L;
    }

    public long j() {
        return this.f137327d;
    }

    public int k() {
        return this.f137332i;
    }

    public p8.b l() {
        return this.f137331h;
    }

    protected long m() {
        return this.f137331h.h();
    }

    public long n() {
        return this.f137325b;
    }

    public long o() {
        return this.f137340q;
    }

    protected int p() {
        return this.f137339p;
    }

    public void q() {
        this.f137335l.f137337n.incrementAndGet();
    }

    public boolean r() {
        return this.f137329f;
    }

    public boolean s() {
        return this.f137328e;
    }

    protected boolean u() {
        String str = this.f137338o;
        return str == null || str.isEmpty();
    }

    protected void v() {
        if (this.f137334k != null || this.f137336m.get() == 0) {
            return;
        }
        A8.b.a("EventThrottlingActionTreeSizeLimit", String.format("The root action with id %d has exceeded child limitation of %d, discarded %d child events", Long.valueOf(this.f137340q), Integer.valueOf(f137323t), Integer.valueOf(this.f137336m.get())));
    }

    public void w(int i10) {
        this.f137330g = i10;
    }

    protected void x(String str) {
        if (str == null) {
            this.f137338o = "";
        } else {
            this.f137338o = z8.f.s(str, 250);
        }
    }

    protected void y(long j10) {
        this.f137327d = j10;
    }

    public void z(long j10) {
        this.f137325b = j10;
    }

    protected void B() {
        long jI = i();
        if (jI > 0) {
            C(jI);
        } else {
            C(m());
        }
    }

    public boolean t() {
        if (A() >= f137323t) {
            return true;
        }
        return false;
    }

    public p(String str, int i10, p8.b bVar, int i11, boolean z10) {
        this.f137325b = -1L;
        this.f137326c = -1L;
        this.f137327d = 0L;
        this.f137328e = false;
        this.f137329f = true;
        this.f137334k = null;
        this.f137335l = null;
        this.f137336m = new AtomicInteger(0);
        this.f137337n = new AtomicInteger(1);
        this.f137338o = "";
        this.f137340q = 0L;
        this.f137339p = i10;
        this.f137340q = z8.f.g();
        this.f137331h = bVar;
        this.f137332i = i11;
        x(str);
        this.f137341r = z10;
    }
}
