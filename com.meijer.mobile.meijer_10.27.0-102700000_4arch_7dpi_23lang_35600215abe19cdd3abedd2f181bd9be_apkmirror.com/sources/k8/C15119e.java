package k8;

import g8.x;
import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import okhttp3.d;
import u7.EnumC17232a;

/* renamed from: k8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15119e {

    /* renamed from: D, reason: collision with root package name */
    protected static final String f141644D = x.f133195a + "ConfigurationBuilder";

    /* renamed from: A, reason: collision with root package name */
    private final EnumC17232a f141645A;

    /* renamed from: B, reason: collision with root package name */
    private final boolean f141646B;

    /* renamed from: C, reason: collision with root package name */
    private final int f141647C;

    /* renamed from: a, reason: collision with root package name */
    private final EnumC15115a f141648a;

    /* renamed from: b, reason: collision with root package name */
    private final String f141649b;

    /* renamed from: c, reason: collision with root package name */
    private final String f141650c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f141651d;

    /* renamed from: e, reason: collision with root package name */
    private KeyStore f141652e;

    /* renamed from: f, reason: collision with root package name */
    private KeyManager[] f141653f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f141654g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f141655h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f141656i;

    /* renamed from: j, reason: collision with root package name */
    private String[] f141657j;

    /* renamed from: k, reason: collision with root package name */
    private String[] f141658k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f141659l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f141660m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f141661n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f141662o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f141663p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f141664q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f141665r;

    /* renamed from: s, reason: collision with root package name */
    private d.a f141666s;

    /* renamed from: t, reason: collision with root package name */
    private final int f141667t;

    /* renamed from: u, reason: collision with root package name */
    private final int f141668u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f141669v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f141670w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f141671x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f141672y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f141673z;

    C15119e(EnumC15115a enumC15115a, String str, String str2) {
        this(enumC15115a, str, str2, new C15121g());
    }

    protected C15119e(EnumC15115a enumC15115a, String str, String str2, C15121g c15121g) {
        this.f141657j = new String[0];
        this.f141658k = new String[0];
        this.f141666s = null;
        this.f141648a = enumC15115a;
        this.f141649b = str;
        this.f141650c = str2;
        b(c15121g.f());
        f(c15121g.l());
        e(c15121g.j());
        d(c15121g.h());
        k(c15121g.v());
        g(c15121g.n());
        h(c15121g.o());
        i(c15121g.t());
        j(c15121g.u());
        this.f141667t = c15121g.k();
        this.f141668u = c15121g.w();
        this.f141671x = c15121g.d();
        this.f141665r = c15121g.b();
        this.f141672y = c15121g.x();
        this.f141673z = c15121g.e();
        this.f141654g = c15121g.g();
        this.f141655h = c15121g.q();
        this.f141656i = c15121g.c();
        this.f141669v = c15121g.r();
        this.f141670w = c15121g.p();
        this.f141652e = null;
        this.f141653f = null;
        this.f141645A = c15121g.m();
        c15121g.s();
        this.f141646B = c15121g.y();
        this.f141647C = c15121g.i();
    }

    public C15118d a() {
        String str = this.f141650c;
        if (str == null || this.f141648a == null) {
            if (this.f141661n) {
                x8.f.w(f141644D, "discard invalid configuration");
            }
            return null;
        }
        String strA = C15116b.a(str);
        if (strA == null) {
            if (this.f141661n) {
                String str2 = f141644D;
                x8.f.w(str2, "invalid value for the beacon url \"" + this.f141650c + "\"");
                x8.f.w(str2, "discard invalid configuration");
            }
            return null;
        }
        String strB = C15116b.b(this.f141649b);
        if (strB != null) {
            String strS = x8.f.s(strB, 250);
            return new C15118d(strS, x8.f.t(strS).replaceAll("_", "%5F"), strA, this.f141648a, this.f141651d, this.f141652e, this.f141653f, this.f141667t, this.f141668u, this.f141669v, this.f141670w, this.f141671x, this.f141665r, this.f141654g, this.f141655h, this.f141656i, this.f141672y, this.f141657j, this.f141658k, this.f141659l, this.f141660m, this.f141661n, this.f141673z, null, this.f141662o, this.f141663p, this.f141664q, (this.f141645A == EnumC17232a.f162763b && C15117c.a()) ? EnumC17232a.f162768g : this.f141645A, null, this.f141646B, null, this.f141666s, this.f141647C);
        }
        if (this.f141661n) {
            String str3 = f141644D;
            x8.f.w(str3, "invalid value for application id \"" + this.f141649b + "\"");
            x8.f.w(str3, "discard invalid configuration");
        }
        return null;
    }

    @Deprecated
    public C15119e b(boolean z10) {
        this.f141651d = z10;
        return this;
    }

    public C15119e c(boolean z10) {
        this.f141654g = z10;
        return this;
    }

    public C15119e d(boolean z10) {
        this.f141661n = z10;
        return this;
    }

    public C15119e e(boolean z10) {
        this.f141660m = z10;
        return this;
    }

    public C15119e f(boolean z10) {
        this.f141659l = z10;
        return this;
    }

    public C15119e i(boolean z10) {
        if (this.f141648a != EnumC15115a.APP_MON) {
            this.f141663p = z10;
        }
        return this;
    }

    public C15119e j(boolean z10) {
        this.f141664q = z10;
        return this;
    }

    public C15119e k(boolean z10) {
        this.f141662o = z10;
        return this;
    }

    public C15119e g(String... strArr) {
        String[] strArrC = C15116b.c(strArr);
        if (strArrC != null) {
            this.f141657j = strArrC;
        }
        return this;
    }

    public C15119e h(String... strArr) {
        String[] strArrC = C15116b.c(strArr);
        if (strArrC != null) {
            this.f141658k = strArrC;
        }
        return this;
    }
}
