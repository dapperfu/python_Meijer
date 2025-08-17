package g8;

import java.util.concurrent.atomic.AtomicInteger;
import y8.C18189b;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: s, reason: collision with root package name */
    static AtomicInteger f133106s = new AtomicInteger(0);

    /* renamed from: t, reason: collision with root package name */
    public static int f133107t = 100;

    /* renamed from: a, reason: collision with root package name */
    protected String f133108a;

    /* renamed from: b, reason: collision with root package name */
    protected long f133109b;

    /* renamed from: c, reason: collision with root package name */
    protected long f133110c;

    /* renamed from: d, reason: collision with root package name */
    protected long f133111d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f133112e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f133113f;

    /* renamed from: g, reason: collision with root package name */
    protected int f133114g;

    /* renamed from: h, reason: collision with root package name */
    protected n8.b f133115h;

    /* renamed from: i, reason: collision with root package name */
    protected int f133116i;

    /* renamed from: j, reason: collision with root package name */
    protected w f133117j;

    /* renamed from: k, reason: collision with root package name */
    protected p f133118k;

    /* renamed from: l, reason: collision with root package name */
    protected p f133119l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicInteger f133120m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicInteger f133121n;

    /* renamed from: o, reason: collision with root package name */
    private String f133122o;

    /* renamed from: p, reason: collision with root package name */
    private int f133123p;

    /* renamed from: q, reason: collision with root package name */
    private long f133124q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f133125r;

    public p(String str, int i10, w wVar, long j10, n8.b bVar, int i11, boolean z10) {
        this.f133109b = -1L;
        this.f133110c = -1L;
        this.f133111d = 0L;
        this.f133112e = false;
        this.f133113f = true;
        this.f133118k = null;
        this.f133119l = null;
        this.f133120m = new AtomicInteger(0);
        this.f133121n = new AtomicInteger(1);
        this.f133122o = "";
        this.f133124q = 0L;
        this.f133115h = bVar;
        this.f133123p = i10;
        this.f133117j = wVar;
        long jH = bVar.h();
        this.f133109b = jH;
        this.f133110c = jH;
        this.f133111d = j10;
        this.f133124q = x8.f.g();
        this.f133114g = x8.f.f();
        this.f133116i = i11;
        this.f133112e = i10 != 5;
        x(str);
        if (j10 == 0) {
            bVar.y(C14217B.a());
        }
        this.f133125r = z10;
    }

    public void c() {
        this.f133113f = false;
        this.f133112e = true;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133126a;

        static {
            int[] iArr = new int[w.values().length];
            f133126a = iArr;
            try {
                iArr[w.f133176i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133126a[w.f133174g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133126a[w.f133175h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f133126a[w.f133173f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f133126a[w.f133185r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f133126a[w.f133182o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f133126a[w.f133186s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private int A() {
        return this.f133119l.f133121n.get();
    }

    private void d(StringBuilder sb2) {
        sb2.append("&na=");
        sb2.append(x8.f.t(h()));
        sb2.append("&it=");
        sb2.append(x8.f.e());
        sb2.append("&pa=");
        sb2.append(j());
        sb2.append("&s0=");
        sb2.append(g());
        sb2.append("&t0=");
        sb2.append(n());
    }

    protected void C(long j10) {
        if (this.f133112e) {
            return;
        }
        this.f133110c = j10;
        this.f133112e = true;
        if (this.f133111d == 0) {
            this.f133115h.y(C14217B.a());
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
        sb2.append(this.f133117j.e());
        switch (a.f133126a[this.f133117j.ordinal()]) {
            case 1:
                d(sb2);
                sb2.append("&vl=");
                sb2.append(x8.f.t(this.f133108a));
                break;
            case 2:
                d(sb2);
                a(sb2, "&vl=", x8.f.t(this.f133108a));
                break;
            case 3:
                d(sb2);
                sb2.append("&vl=");
                sb2.append(x8.f.t(this.f133108a));
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
                sb2.append(x8.f.t(this.f133108a));
                sb2.append("&tt=");
                sb2.append(m8.d.CUSTOM.b());
                break;
            case 7:
                sb2.append("&na=");
                sb2.append(x8.f.t(h()));
                a(sb2, "&pl=", x8.f.t(this.f133108a));
                sb2.append("&t0=");
                sb2.append(n());
                break;
        }
        sb2.append("&fw=");
        sb2.append(this.f133125r ? "1" : "0");
        return sb2;
    }

    protected long e() {
        return this.f133110c;
    }

    public w f() {
        return this.f133117j;
    }

    public int g() {
        return this.f133114g;
    }

    public String h() {
        return this.f133122o;
    }

    protected long i() {
        return 0L;
    }

    public long j() {
        return this.f133111d;
    }

    public int k() {
        return this.f133116i;
    }

    public n8.b l() {
        return this.f133115h;
    }

    protected long m() {
        return this.f133115h.h();
    }

    public long n() {
        return this.f133109b;
    }

    public long o() {
        return this.f133124q;
    }

    protected int p() {
        return this.f133123p;
    }

    public void q() {
        this.f133119l.f133121n.incrementAndGet();
    }

    public boolean r() {
        return this.f133113f;
    }

    public boolean s() {
        return this.f133112e;
    }

    protected boolean u() {
        String str = this.f133122o;
        return str == null || str.isEmpty();
    }

    protected void v() {
        if (this.f133118k != null || this.f133120m.get() == 0) {
            return;
        }
        C18189b.a("EventThrottlingActionTreeSizeLimit", String.format("The root action with id %d has exceeded child limitation of %d, discarded %d child events", Long.valueOf(this.f133124q), Integer.valueOf(f133107t), Integer.valueOf(this.f133120m.get())));
    }

    public void w(int i10) {
        this.f133114g = i10;
    }

    protected void x(String str) {
        if (str == null) {
            this.f133122o = "";
        } else {
            this.f133122o = x8.f.s(str, 250);
        }
    }

    protected void y(long j10) {
        this.f133111d = j10;
    }

    public void z(long j10) {
        this.f133109b = j10;
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
        if (A() >= f133107t) {
            return true;
        }
        return false;
    }

    public p(String str, int i10, n8.b bVar, int i11, boolean z10) {
        this.f133109b = -1L;
        this.f133110c = -1L;
        this.f133111d = 0L;
        this.f133112e = false;
        this.f133113f = true;
        this.f133118k = null;
        this.f133119l = null;
        this.f133120m = new AtomicInteger(0);
        this.f133121n = new AtomicInteger(1);
        this.f133122o = "";
        this.f133124q = 0L;
        this.f133123p = i10;
        this.f133124q = x8.f.g();
        this.f133115h = bVar;
        this.f133116i = i11;
        x(str);
        this.f133125r = z10;
    }
}
