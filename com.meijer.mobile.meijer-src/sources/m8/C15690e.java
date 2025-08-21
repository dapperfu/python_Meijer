package m8;

import i8.x;
import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import okhttp3.d;
import w7.EnumC17849a;

/* renamed from: m8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15690e {

    /* renamed from: D, reason: collision with root package name */
    protected static final String f150790D = x.f137411a + "ConfigurationBuilder";

    /* renamed from: A, reason: collision with root package name */
    private final EnumC17849a f150791A;

    /* renamed from: B, reason: collision with root package name */
    private final boolean f150792B;

    /* renamed from: C, reason: collision with root package name */
    private final int f150793C;

    /* renamed from: a, reason: collision with root package name */
    private final EnumC15686a f150794a;

    /* renamed from: b, reason: collision with root package name */
    private final String f150795b;

    /* renamed from: c, reason: collision with root package name */
    private final String f150796c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f150797d;

    /* renamed from: e, reason: collision with root package name */
    private KeyStore f150798e;

    /* renamed from: f, reason: collision with root package name */
    private KeyManager[] f150799f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f150800g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f150801h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f150802i;

    /* renamed from: j, reason: collision with root package name */
    private String[] f150803j;

    /* renamed from: k, reason: collision with root package name */
    private String[] f150804k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f150805l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f150806m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f150807n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f150808o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f150809p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f150810q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f150811r;

    /* renamed from: s, reason: collision with root package name */
    private d.a f150812s;

    /* renamed from: t, reason: collision with root package name */
    private final int f150813t;

    /* renamed from: u, reason: collision with root package name */
    private final int f150814u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f150815v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f150816w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f150817x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f150818y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f150819z;

    C15690e(EnumC15686a enumC15686a, String str, String str2) {
        this(enumC15686a, str, str2, new C15692g());
    }

    protected C15690e(EnumC15686a enumC15686a, String str, String str2, C15692g c15692g) {
        this.f150803j = new String[0];
        this.f150804k = new String[0];
        this.f150812s = null;
        this.f150794a = enumC15686a;
        this.f150795b = str;
        this.f150796c = str2;
        b(c15692g.f());
        f(c15692g.l());
        e(c15692g.j());
        d(c15692g.h());
        k(c15692g.v());
        g(c15692g.n());
        h(c15692g.o());
        i(c15692g.t());
        j(c15692g.u());
        this.f150813t = c15692g.k();
        this.f150814u = c15692g.w();
        this.f150817x = c15692g.d();
        this.f150811r = c15692g.b();
        this.f150818y = c15692g.x();
        this.f150819z = c15692g.e();
        this.f150800g = c15692g.g();
        this.f150801h = c15692g.q();
        this.f150802i = c15692g.c();
        this.f150815v = c15692g.r();
        this.f150816w = c15692g.p();
        this.f150798e = null;
        this.f150799f = null;
        this.f150791A = c15692g.m();
        c15692g.s();
        this.f150792B = c15692g.y();
        this.f150793C = c15692g.i();
    }

    public C15689d a() {
        String str = this.f150796c;
        if (str == null || this.f150794a == null) {
            if (this.f150807n) {
                z8.f.w(f150790D, "discard invalid configuration");
            }
            return null;
        }
        String strA = C15687b.a(str);
        if (strA == null) {
            if (this.f150807n) {
                String str2 = f150790D;
                z8.f.w(str2, "invalid value for the beacon url \"" + this.f150796c + "\"");
                z8.f.w(str2, "discard invalid configuration");
            }
            return null;
        }
        String strB = C15687b.b(this.f150795b);
        if (strB != null) {
            String strS = z8.f.s(strB, 250);
            return new C15689d(strS, z8.f.t(strS).replaceAll("_", "%5F"), strA, this.f150794a, this.f150797d, this.f150798e, this.f150799f, this.f150813t, this.f150814u, this.f150815v, this.f150816w, this.f150817x, this.f150811r, this.f150800g, this.f150801h, this.f150802i, this.f150818y, this.f150803j, this.f150804k, this.f150805l, this.f150806m, this.f150807n, this.f150819z, null, this.f150808o, this.f150809p, this.f150810q, (this.f150791A == EnumC17849a.f166972b && C15688c.a()) ? EnumC17849a.f166977g : this.f150791A, null, this.f150792B, null, this.f150812s, this.f150793C);
        }
        if (this.f150807n) {
            String str3 = f150790D;
            z8.f.w(str3, "invalid value for application id \"" + this.f150795b + "\"");
            z8.f.w(str3, "discard invalid configuration");
        }
        return null;
    }

    @Deprecated
    public C15690e b(boolean z10) {
        this.f150797d = z10;
        return this;
    }

    public C15690e c(boolean z10) {
        this.f150800g = z10;
        return this;
    }

    public C15690e d(boolean z10) {
        this.f150807n = z10;
        return this;
    }

    public C15690e e(boolean z10) {
        this.f150806m = z10;
        return this;
    }

    public C15690e f(boolean z10) {
        this.f150805l = z10;
        return this;
    }

    public C15690e i(boolean z10) {
        if (this.f150794a != EnumC15686a.APP_MON) {
            this.f150809p = z10;
        }
        return this;
    }

    public C15690e j(boolean z10) {
        this.f150810q = z10;
        return this;
    }

    public C15690e k(boolean z10) {
        this.f150808o = z10;
        return this;
    }

    public C15690e g(String... strArr) {
        String[] strArrC = C15687b.c(strArr);
        if (strArrC != null) {
            this.f150803j = strArrC;
        }
        return this;
    }

    public C15690e h(String... strArr) {
        String[] strArrC = C15687b.c(strArr);
        if (strArrC != null) {
            this.f150804k = strArrC;
        }
        return this;
    }
}
