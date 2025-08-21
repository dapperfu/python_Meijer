package p8;

import i8.C14693B;
import i8.C14695b;
import i8.l;
import i8.w;
import i8.x;
import java.util.Random;
import m8.n;
import m8.o;
import m8.q;
import m8.t;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: o, reason: collision with root package name */
    private static final String f156189o = x.f137411a + "Session";

    /* renamed from: p, reason: collision with root package name */
    static C16411a f156190p = new C16411a();

    /* renamed from: q, reason: collision with root package name */
    private static volatile b f156191q = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f156192a;

    /* renamed from: b, reason: collision with root package name */
    public long f156193b;

    /* renamed from: c, reason: collision with root package name */
    public int f156194c;

    /* renamed from: g, reason: collision with root package name */
    public String f156198g;

    /* renamed from: j, reason: collision with root package name */
    private Random f156201j;

    /* renamed from: k, reason: collision with root package name */
    private volatile long f156202k;

    /* renamed from: l, reason: collision with root package name */
    private n f156203l;

    /* renamed from: m, reason: collision with root package name */
    private final o f156204m;

    /* renamed from: d, reason: collision with root package name */
    public int f156195d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f156196e = -1;

    /* renamed from: f, reason: collision with root package name */
    public String f156197f = null;

    /* renamed from: h, reason: collision with root package name */
    private g f156199h = g.CREATED;

    /* renamed from: n, reason: collision with root package name */
    private boolean f156205n = false;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f156200i = 0;

    public synchronized void y(long j10) {
        if (j10 > this.f156202k) {
            this.f156202k = j10;
        }
    }

    public static b b() {
        return f156191q != null ? f156191q : w(n.f150835b);
    }

    public static b e() {
        return f156191q;
    }

    private boolean q(int i10, int i11) {
        return this.f156201j.nextInt(i10) < i11;
    }

    public static b w(n nVar) {
        if (f156191q == null) {
            synchronized (b.class) {
                try {
                    if (f156191q == null) {
                        return t(nVar);
                    }
                } finally {
                }
            }
        }
        return f156191q;
    }

    public static void x(n nVar, boolean z10) {
        if (f156191q == null) {
            synchronized (b.class) {
                try {
                    if (f156191q == null) {
                        t(nVar).r(z10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a() {
        this.f156200i++;
    }

    public n f() {
        return this.f156203l;
    }

    public o g() {
        return this.f156204m;
    }

    public long i() {
        return this.f156192a;
    }

    public String j() {
        return this.f156198g;
    }

    public void k(q qVar) {
        if (this.f156199h != g.CREATED) {
            return;
        }
        int iT = qVar.t();
        boolean zQ = iT > 0;
        if (!zQ && x.f137412b) {
            z8.f.u(f156189o, "Session disabled by overload prevention (mp=0)");
        }
        if (zQ && !(zQ = q(100, qVar.B())) && x.f137412b) {
            z8.f.u(f156189o, "Session disabled by traffic control: tc=" + qVar.B());
        }
        this.f156199h = zQ ? g.ENABLED : g.DISABLED;
        this.f156196e = iT;
    }

    @Deprecated
    public void l(n nVar) {
        this.f156203l = nVar;
    }

    public boolean m() {
        return this.f156199h.b();
    }

    public boolean n() {
        return this.f156199h.e();
    }

    public boolean o() {
        return this.f156205n;
    }

    public boolean p() {
        return this.f156200i >= 20;
    }

    public void r(boolean z10) {
        this.f156205n = z10;
    }

    public void s(String str) {
        this.f156198g = str;
    }

    public b(long j10, Random random, n nVar, o oVar) {
        this.f156192a = j10;
        this.f156202k = j10;
        this.f156201j = random;
        this.f156203l = nVar;
        this.f156204m = oVar;
    }

    public static b c(boolean z10) {
        return d(z10, C14693B.a());
    }

    public static b d(boolean z10, long j10) {
        b bVarB = b();
        if (!z10) {
            t tVarG = C14695b.e().g();
            if (bVarB.f156202k + tVarG.b() < j10 || bVarB.f156192a + tVarG.e() < j10) {
                l.z(true, bVarB.f(), j10);
                if (bVarB.j() != null && bVarB.f().e(w.f137401r)) {
                    f156191q.s(bVarB.f156198g);
                    l.r(f156191q);
                }
                bVarB = f156191q;
            }
        }
        bVarB.f156202k = j10;
        return bVarB;
    }

    public static b t(n nVar) {
        return u(nVar, C14693B.a());
    }

    public static b u(n nVar, long j10) {
        boolean zO;
        q qVarF = C14695b.e().f();
        if (f156191q != null) {
            zO = f156191q.o();
        } else {
            zO = false;
        }
        f156191q = new b(j10, f156190p.a(), nVar, qVarF.u());
        f156191q.r(zO);
        return f156191q;
    }

    public static void v(n nVar, boolean z10) {
        u(nVar, C14693B.a()).r(z10);
    }

    public long h() {
        return C14693B.a() - this.f156192a;
    }
}
