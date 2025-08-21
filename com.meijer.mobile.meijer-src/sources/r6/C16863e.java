package r6;

import h6.C14478i;
import java.util.List;
import java.util.Locale;
import p6.C16407b;
import p6.j;
import p6.k;
import p6.n;
import q6.C16608a;
import t6.C17197j;
import w6.C17845a;

/* renamed from: r6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16863e {

    /* renamed from: a, reason: collision with root package name */
    private final List<q6.c> f159319a;

    /* renamed from: b, reason: collision with root package name */
    private final C14478i f159320b;

    /* renamed from: c, reason: collision with root package name */
    private final String f159321c;

    /* renamed from: d, reason: collision with root package name */
    private final long f159322d;

    /* renamed from: e, reason: collision with root package name */
    private final a f159323e;

    /* renamed from: f, reason: collision with root package name */
    private final long f159324f;

    /* renamed from: g, reason: collision with root package name */
    private final String f159325g;

    /* renamed from: h, reason: collision with root package name */
    private final List<q6.i> f159326h;

    /* renamed from: i, reason: collision with root package name */
    private final n f159327i;

    /* renamed from: j, reason: collision with root package name */
    private final int f159328j;

    /* renamed from: k, reason: collision with root package name */
    private final int f159329k;

    /* renamed from: l, reason: collision with root package name */
    private final int f159330l;

    /* renamed from: m, reason: collision with root package name */
    private final float f159331m;

    /* renamed from: n, reason: collision with root package name */
    private final float f159332n;

    /* renamed from: o, reason: collision with root package name */
    private final float f159333o;

    /* renamed from: p, reason: collision with root package name */
    private final float f159334p;

    /* renamed from: q, reason: collision with root package name */
    private final j f159335q;

    /* renamed from: r, reason: collision with root package name */
    private final k f159336r;

    /* renamed from: s, reason: collision with root package name */
    private final C16407b f159337s;

    /* renamed from: t, reason: collision with root package name */
    private final List<C17845a<Float>> f159338t;

    /* renamed from: u, reason: collision with root package name */
    private final b f159339u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f159340v;

    /* renamed from: w, reason: collision with root package name */
    private final C16608a f159341w;

    /* renamed from: x, reason: collision with root package name */
    private final C17197j f159342x;

    /* renamed from: y, reason: collision with root package name */
    private final q6.h f159343y;

    /* renamed from: r6.e$a */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* renamed from: r6.e$b */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public C16863e(List<q6.c> list, C14478i c14478i, String str, long j10, a aVar, long j11, String str2, List<q6.i> list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List<C17845a<Float>> list3, b bVar, C16407b c16407b, boolean z10, C16608a c16608a, C17197j c17197j, q6.h hVar) {
        this.f159319a = list;
        this.f159320b = c14478i;
        this.f159321c = str;
        this.f159322d = j10;
        this.f159323e = aVar;
        this.f159324f = j11;
        this.f159325g = str2;
        this.f159326h = list2;
        this.f159327i = nVar;
        this.f159328j = i10;
        this.f159329k = i11;
        this.f159330l = i12;
        this.f159331m = f10;
        this.f159332n = f11;
        this.f159333o = f12;
        this.f159334p = f13;
        this.f159335q = jVar;
        this.f159336r = kVar;
        this.f159338t = list3;
        this.f159339u = bVar;
        this.f159337s = c16407b;
        this.f159340v = z10;
        this.f159341w = c16608a;
        this.f159342x = c17197j;
        this.f159343y = hVar;
    }

    public q6.h a() {
        return this.f159343y;
    }

    public C16608a b() {
        return this.f159341w;
    }

    C14478i c() {
        return this.f159320b;
    }

    public C17197j d() {
        return this.f159342x;
    }

    public long e() {
        return this.f159322d;
    }

    List<C17845a<Float>> f() {
        return this.f159338t;
    }

    public a g() {
        return this.f159323e;
    }

    List<q6.i> h() {
        return this.f159326h;
    }

    b i() {
        return this.f159339u;
    }

    public String j() {
        return this.f159321c;
    }

    long k() {
        return this.f159324f;
    }

    float l() {
        return this.f159334p;
    }

    float m() {
        return this.f159333o;
    }

    public String n() {
        return this.f159325g;
    }

    List<q6.c> o() {
        return this.f159319a;
    }

    int p() {
        return this.f159330l;
    }

    int q() {
        return this.f159329k;
    }

    int r() {
        return this.f159328j;
    }

    float s() {
        return this.f159332n / this.f159320b.e();
    }

    j t() {
        return this.f159335q;
    }

    public String toString() {
        return z("");
    }

    k u() {
        return this.f159336r;
    }

    C16407b v() {
        return this.f159337s;
    }

    float w() {
        return this.f159331m;
    }

    n x() {
        return this.f159327i;
    }

    public boolean y() {
        return this.f159340v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        C16863e c16863eU = this.f159320b.u(k());
        if (c16863eU != null) {
            sb2.append("\t\tParents: ");
            sb2.append(c16863eU.j());
            C16863e c16863eU2 = this.f159320b.u(c16863eU.k());
            while (c16863eU2 != null) {
                sb2.append("->");
                sb2.append(c16863eU2.j());
                c16863eU2 = this.f159320b.u(c16863eU2.k());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f159319a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (q6.c cVar : this.f159319a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
