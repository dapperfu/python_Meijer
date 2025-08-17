package n8;

import g8.C14217B;
import g8.C14219b;
import g8.l;
import g8.w;
import g8.x;
import java.util.Random;
import k8.n;
import k8.o;
import k8.q;
import k8.t;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: o, reason: collision with root package name */
    private static final String f151058o = x.f133195a + "Session";

    /* renamed from: p, reason: collision with root package name */
    static C15783a f151059p = new C15783a();

    /* renamed from: q, reason: collision with root package name */
    private static volatile b f151060q = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f151061a;

    /* renamed from: b, reason: collision with root package name */
    public long f151062b;

    /* renamed from: c, reason: collision with root package name */
    public int f151063c;

    /* renamed from: g, reason: collision with root package name */
    public String f151067g;

    /* renamed from: j, reason: collision with root package name */
    private Random f151070j;

    /* renamed from: k, reason: collision with root package name */
    private volatile long f151071k;

    /* renamed from: l, reason: collision with root package name */
    private n f151072l;

    /* renamed from: m, reason: collision with root package name */
    private final o f151073m;

    /* renamed from: d, reason: collision with root package name */
    public int f151064d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f151065e = -1;

    /* renamed from: f, reason: collision with root package name */
    public String f151066f = null;

    /* renamed from: h, reason: collision with root package name */
    private f f151068h = f.CREATED;

    /* renamed from: n, reason: collision with root package name */
    private boolean f151074n = false;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f151069i = 0;

    public synchronized void y(long j10) {
        if (j10 > this.f151071k) {
            this.f151071k = j10;
        }
    }

    public static b b() {
        return f151060q != null ? f151060q : w(n.f141689b);
    }

    public static b e() {
        return f151060q;
    }

    private boolean q(int i10, int i11) {
        return this.f151070j.nextInt(i10) < i11;
    }

    public static b w(n nVar) {
        if (f151060q == null) {
            synchronized (b.class) {
                try {
                    if (f151060q == null) {
                        return t(nVar);
                    }
                } finally {
                }
            }
        }
        return f151060q;
    }

    public static void x(n nVar, boolean z10) {
        if (f151060q == null) {
            synchronized (b.class) {
                try {
                    if (f151060q == null) {
                        t(nVar).r(z10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a() {
        this.f151069i++;
    }

    public n f() {
        return this.f151072l;
    }

    public o g() {
        return this.f151073m;
    }

    public long i() {
        return this.f151061a;
    }

    public String j() {
        return this.f151067g;
    }

    public void k(q qVar) {
        if (this.f151068h != f.CREATED) {
            return;
        }
        int iT = qVar.t();
        boolean zQ = iT > 0;
        if (!zQ && x.f133196b) {
            x8.f.u(f151058o, "Session disabled by overload prevention (mp=0)");
        }
        if (zQ && !(zQ = q(100, qVar.B())) && x.f133196b) {
            x8.f.u(f151058o, "Session disabled by traffic control: tc=" + qVar.B());
        }
        this.f151068h = zQ ? f.ENABLED : f.DISABLED;
        this.f151065e = iT;
    }

    @Deprecated
    public void l(n nVar) {
        this.f151072l = nVar;
    }

    public boolean m() {
        return this.f151068h.b();
    }

    public boolean n() {
        return this.f151068h.e();
    }

    public boolean o() {
        return this.f151074n;
    }

    public boolean p() {
        return this.f151069i >= 20;
    }

    public void r(boolean z10) {
        this.f151074n = z10;
    }

    public void s(String str) {
        this.f151067g = str;
    }

    public b(long j10, Random random, n nVar, o oVar) {
        this.f151061a = j10;
        this.f151071k = j10;
        this.f151070j = random;
        this.f151072l = nVar;
        this.f151073m = oVar;
    }

    public static b c(boolean z10) {
        return d(z10, C14217B.a());
    }

    public static b d(boolean z10, long j10) {
        b bVarB = b();
        if (!z10) {
            t tVarG = C14219b.e().g();
            if (bVarB.f151071k + tVarG.b() < j10 || bVarB.f151061a + tVarG.e() < j10) {
                l.z(true, bVarB.f(), j10);
                if (bVarB.j() != null && bVarB.f().e(w.f133185r)) {
                    f151060q.s(bVarB.f151067g);
                    l.r(f151060q);
                }
                bVarB = f151060q;
            }
        }
        bVarB.f151071k = j10;
        return bVarB;
    }

    public static b t(n nVar) {
        return u(nVar, C14217B.a());
    }

    public static b u(n nVar, long j10) {
        boolean zO;
        q qVarF = C14219b.e().f();
        if (f151060q != null) {
            zO = f151060q.o();
        } else {
            zO = false;
        }
        f151060q = new b(j10, f151059p.a(), nVar, qVarF.u());
        f151060q.r(zO);
        return f151060q;
    }

    public static void v(n nVar, boolean z10) {
        u(nVar, C14217B.a()).r(z10);
    }

    public long h() {
        return C14217B.a() - this.f151061a;
    }
}
