package q6;

import g6.C14209i;
import java.util.List;
import java.util.Locale;
import o6.C15998b;
import o6.j;
import o6.k;
import o6.n;
import p6.C16263a;
import s6.C16899j;
import v6.C17512a;

/* renamed from: q6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16475e {

    /* renamed from: a, reason: collision with root package name */
    private final List<p6.c> f156871a;

    /* renamed from: b, reason: collision with root package name */
    private final C14209i f156872b;

    /* renamed from: c, reason: collision with root package name */
    private final String f156873c;

    /* renamed from: d, reason: collision with root package name */
    private final long f156874d;

    /* renamed from: e, reason: collision with root package name */
    private final a f156875e;

    /* renamed from: f, reason: collision with root package name */
    private final long f156876f;

    /* renamed from: g, reason: collision with root package name */
    private final String f156877g;

    /* renamed from: h, reason: collision with root package name */
    private final List<p6.i> f156878h;

    /* renamed from: i, reason: collision with root package name */
    private final n f156879i;

    /* renamed from: j, reason: collision with root package name */
    private final int f156880j;

    /* renamed from: k, reason: collision with root package name */
    private final int f156881k;

    /* renamed from: l, reason: collision with root package name */
    private final int f156882l;

    /* renamed from: m, reason: collision with root package name */
    private final float f156883m;

    /* renamed from: n, reason: collision with root package name */
    private final float f156884n;

    /* renamed from: o, reason: collision with root package name */
    private final float f156885o;

    /* renamed from: p, reason: collision with root package name */
    private final float f156886p;

    /* renamed from: q, reason: collision with root package name */
    private final j f156887q;

    /* renamed from: r, reason: collision with root package name */
    private final k f156888r;

    /* renamed from: s, reason: collision with root package name */
    private final C15998b f156889s;

    /* renamed from: t, reason: collision with root package name */
    private final List<C17512a<Float>> f156890t;

    /* renamed from: u, reason: collision with root package name */
    private final b f156891u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f156892v;

    /* renamed from: w, reason: collision with root package name */
    private final C16263a f156893w;

    /* renamed from: x, reason: collision with root package name */
    private final C16899j f156894x;

    /* renamed from: y, reason: collision with root package name */
    private final p6.h f156895y;

    /* renamed from: q6.e$a */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* renamed from: q6.e$b */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public C16475e(List<p6.c> list, C14209i c14209i, String str, long j10, a aVar, long j11, String str2, List<p6.i> list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List<C17512a<Float>> list3, b bVar, C15998b c15998b, boolean z10, C16263a c16263a, C16899j c16899j, p6.h hVar) {
        this.f156871a = list;
        this.f156872b = c14209i;
        this.f156873c = str;
        this.f156874d = j10;
        this.f156875e = aVar;
        this.f156876f = j11;
        this.f156877g = str2;
        this.f156878h = list2;
        this.f156879i = nVar;
        this.f156880j = i10;
        this.f156881k = i11;
        this.f156882l = i12;
        this.f156883m = f10;
        this.f156884n = f11;
        this.f156885o = f12;
        this.f156886p = f13;
        this.f156887q = jVar;
        this.f156888r = kVar;
        this.f156890t = list3;
        this.f156891u = bVar;
        this.f156889s = c15998b;
        this.f156892v = z10;
        this.f156893w = c16263a;
        this.f156894x = c16899j;
        this.f156895y = hVar;
    }

    public p6.h a() {
        return this.f156895y;
    }

    public C16263a b() {
        return this.f156893w;
    }

    C14209i c() {
        return this.f156872b;
    }

    public C16899j d() {
        return this.f156894x;
    }

    public long e() {
        return this.f156874d;
    }

    List<C17512a<Float>> f() {
        return this.f156890t;
    }

    public a g() {
        return this.f156875e;
    }

    List<p6.i> h() {
        return this.f156878h;
    }

    b i() {
        return this.f156891u;
    }

    public String j() {
        return this.f156873c;
    }

    long k() {
        return this.f156876f;
    }

    float l() {
        return this.f156886p;
    }

    float m() {
        return this.f156885o;
    }

    public String n() {
        return this.f156877g;
    }

    List<p6.c> o() {
        return this.f156871a;
    }

    int p() {
        return this.f156882l;
    }

    int q() {
        return this.f156881k;
    }

    int r() {
        return this.f156880j;
    }

    float s() {
        return this.f156884n / this.f156872b.e();
    }

    j t() {
        return this.f156887q;
    }

    public String toString() {
        return z("");
    }

    k u() {
        return this.f156888r;
    }

    C15998b v() {
        return this.f156889s;
    }

    float w() {
        return this.f156883m;
    }

    n x() {
        return this.f156879i;
    }

    public boolean y() {
        return this.f156892v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        C16475e c16475eU = this.f156872b.u(k());
        if (c16475eU != null) {
            sb2.append("\t\tParents: ");
            sb2.append(c16475eU.j());
            C16475e c16475eU2 = this.f156872b.u(c16475eU.k());
            while (c16475eU2 != null) {
                sb2.append("->");
                sb2.append(c16475eU2.j());
                c16475eU2 = this.f156872b.u(c16475eU2.k());
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
        if (!this.f156871a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (p6.c cVar : this.f156871a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
