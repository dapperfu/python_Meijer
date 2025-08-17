package O1;

import Q1.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f {

    /* renamed from: u, reason: collision with root package name */
    public static float f23071u = Float.NaN;

    /* renamed from: a, reason: collision with root package name */
    public Q1.e f23072a;

    /* renamed from: b, reason: collision with root package name */
    public int f23073b;

    /* renamed from: c, reason: collision with root package name */
    public int f23074c;

    /* renamed from: d, reason: collision with root package name */
    public int f23075d;

    /* renamed from: e, reason: collision with root package name */
    public int f23076e;

    /* renamed from: f, reason: collision with root package name */
    public float f23077f;

    /* renamed from: g, reason: collision with root package name */
    public float f23078g;

    /* renamed from: h, reason: collision with root package name */
    public float f23079h;

    /* renamed from: i, reason: collision with root package name */
    public float f23080i;

    /* renamed from: j, reason: collision with root package name */
    public float f23081j;

    /* renamed from: k, reason: collision with root package name */
    public float f23082k;

    /* renamed from: l, reason: collision with root package name */
    public float f23083l;

    /* renamed from: m, reason: collision with root package name */
    public float f23084m;

    /* renamed from: n, reason: collision with root package name */
    public float f23085n;

    /* renamed from: o, reason: collision with root package name */
    public float f23086o;

    /* renamed from: p, reason: collision with root package name */
    public float f23087p;

    /* renamed from: q, reason: collision with root package name */
    public float f23088q;

    /* renamed from: r, reason: collision with root package name */
    public int f23089r;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap<String, N1.a> f23090s;

    /* renamed from: t, reason: collision with root package name */
    public String f23091t;

    public f() {
        this.f23072a = null;
        this.f23073b = 0;
        this.f23074c = 0;
        this.f23075d = 0;
        this.f23076e = 0;
        this.f23077f = Float.NaN;
        this.f23078g = Float.NaN;
        this.f23079h = Float.NaN;
        this.f23080i = Float.NaN;
        this.f23081j = Float.NaN;
        this.f23082k = Float.NaN;
        this.f23083l = Float.NaN;
        this.f23084m = Float.NaN;
        this.f23085n = Float.NaN;
        this.f23086o = Float.NaN;
        this.f23087p = Float.NaN;
        this.f23088q = Float.NaN;
        this.f23089r = 0;
        this.f23090s = new HashMap<>();
        this.f23091t = null;
    }

    private void e(StringBuilder sb2, d.b bVar) {
        Q1.d dVarJ = this.f23072a.j(bVar);
        if (dVarJ == null || dVarJ.f29528f == null) {
            return;
        }
        sb2.append("Anchor");
        sb2.append(bVar.name());
        sb2.append(": ['");
        String str = dVarJ.f29528f.g().f29607o;
        if (str == null) {
            str = "#PARENT";
        }
        sb2.append(str);
        sb2.append("', '");
        sb2.append(dVarJ.f29528f.j().name());
        sb2.append("', '");
        sb2.append(dVarJ.f29529g);
        sb2.append("'],\n");
    }

    public boolean c() {
        return Float.isNaN(this.f23079h) && Float.isNaN(this.f23080i) && Float.isNaN(this.f23081j) && Float.isNaN(this.f23082k) && Float.isNaN(this.f23083l) && Float.isNaN(this.f23084m) && Float.isNaN(this.f23085n) && Float.isNaN(this.f23086o) && Float.isNaN(this.f23087p);
    }

    public StringBuilder d(StringBuilder sb2, boolean z10) {
        sb2.append("{\n");
        b(sb2, "left", this.f23073b);
        b(sb2, "top", this.f23074c);
        b(sb2, "right", this.f23075d);
        b(sb2, "bottom", this.f23076e);
        a(sb2, "pivotX", this.f23077f);
        a(sb2, "pivotY", this.f23078g);
        a(sb2, "rotationX", this.f23079h);
        a(sb2, "rotationY", this.f23080i);
        a(sb2, "rotationZ", this.f23081j);
        a(sb2, "translationX", this.f23082k);
        a(sb2, "translationY", this.f23083l);
        a(sb2, "translationZ", this.f23084m);
        a(sb2, "scaleX", this.f23085n);
        a(sb2, "scaleY", this.f23086o);
        a(sb2, "alpha", this.f23087p);
        b(sb2, "visibility", this.f23089r);
        a(sb2, "interpolatedPos", this.f23088q);
        if (this.f23072a != null) {
            for (d.b bVar : d.b.values()) {
                e(sb2, bVar);
            }
        }
        if (z10) {
            a(sb2, "phone_orientation", f23071u);
        }
        if (z10) {
            a(sb2, "phone_orientation", f23071u);
        }
        if (this.f23090s.size() != 0) {
            sb2.append("custom : {\n");
            for (String str : this.f23090s.keySet()) {
                N1.a aVar = this.f23090s.get(str);
                sb2.append(str);
                sb2.append(": ");
                switch (aVar.h()) {
                    case 900:
                        sb2.append(aVar.e());
                        sb2.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb2.append(aVar.d());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(N1.a.a(aVar.e()));
                        sb2.append("',\n");
                        break;
                    case 903:
                        sb2.append("'");
                        sb2.append(aVar.g());
                        sb2.append("',\n");
                        break;
                    case 904:
                        sb2.append("'");
                        sb2.append(aVar.c());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void f(String str, int i10, float f10) {
        if (this.f23090s.containsKey(str)) {
            this.f23090s.get(str).i(f10);
        } else {
            this.f23090s.put(str, new N1.a(str, i10, f10));
        }
    }

    public void g(String str, int i10, int i11) {
        if (this.f23090s.containsKey(str)) {
            this.f23090s.get(str).j(i11);
        } else {
            this.f23090s.put(str, new N1.a(str, i10, i11));
        }
    }

    public f h() {
        Q1.e eVar = this.f23072a;
        if (eVar != null) {
            this.f23073b = eVar.w();
            this.f23074c = this.f23072a.H();
            this.f23075d = this.f23072a.F();
            this.f23076e = this.f23072a.m();
            i(this.f23072a.f29605n);
        }
        return this;
    }

    public void i(f fVar) {
        this.f23077f = fVar.f23077f;
        this.f23078g = fVar.f23078g;
        this.f23079h = fVar.f23079h;
        this.f23080i = fVar.f23080i;
        this.f23081j = fVar.f23081j;
        this.f23082k = fVar.f23082k;
        this.f23083l = fVar.f23083l;
        this.f23084m = fVar.f23084m;
        this.f23085n = fVar.f23085n;
        this.f23086o = fVar.f23086o;
        this.f23087p = fVar.f23087p;
        this.f23089r = fVar.f23089r;
        this.f23090s.clear();
        for (N1.a aVar : fVar.f23090s.values()) {
            this.f23090s.put(aVar.f(), aVar.b());
        }
    }

    private static void a(StringBuilder sb2, String str, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private static void b(StringBuilder sb2, String str, int i10) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public f(Q1.e eVar) {
        this.f23072a = null;
        this.f23073b = 0;
        this.f23074c = 0;
        this.f23075d = 0;
        this.f23076e = 0;
        this.f23077f = Float.NaN;
        this.f23078g = Float.NaN;
        this.f23079h = Float.NaN;
        this.f23080i = Float.NaN;
        this.f23081j = Float.NaN;
        this.f23082k = Float.NaN;
        this.f23083l = Float.NaN;
        this.f23084m = Float.NaN;
        this.f23085n = Float.NaN;
        this.f23086o = Float.NaN;
        this.f23087p = Float.NaN;
        this.f23088q = Float.NaN;
        this.f23089r = 0;
        this.f23090s = new HashMap<>();
        this.f23091t = null;
        this.f23072a = eVar;
    }

    public f(f fVar) {
        this.f23072a = null;
        this.f23073b = 0;
        this.f23074c = 0;
        this.f23075d = 0;
        this.f23076e = 0;
        this.f23077f = Float.NaN;
        this.f23078g = Float.NaN;
        this.f23079h = Float.NaN;
        this.f23080i = Float.NaN;
        this.f23081j = Float.NaN;
        this.f23082k = Float.NaN;
        this.f23083l = Float.NaN;
        this.f23084m = Float.NaN;
        this.f23085n = Float.NaN;
        this.f23086o = Float.NaN;
        this.f23087p = Float.NaN;
        this.f23088q = Float.NaN;
        this.f23089r = 0;
        this.f23090s = new HashMap<>();
        this.f23091t = null;
        this.f23072a = fVar.f23072a;
        this.f23073b = fVar.f23073b;
        this.f23074c = fVar.f23074c;
        this.f23075d = fVar.f23075d;
        this.f23076e = fVar.f23076e;
        i(fVar);
    }
}
