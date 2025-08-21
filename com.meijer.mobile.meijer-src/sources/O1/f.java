package O1;

import Q1.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f {

    /* renamed from: u, reason: collision with root package name */
    public static float f23064u = Float.NaN;

    /* renamed from: a, reason: collision with root package name */
    public Q1.e f23065a;

    /* renamed from: b, reason: collision with root package name */
    public int f23066b;

    /* renamed from: c, reason: collision with root package name */
    public int f23067c;

    /* renamed from: d, reason: collision with root package name */
    public int f23068d;

    /* renamed from: e, reason: collision with root package name */
    public int f23069e;

    /* renamed from: f, reason: collision with root package name */
    public float f23070f;

    /* renamed from: g, reason: collision with root package name */
    public float f23071g;

    /* renamed from: h, reason: collision with root package name */
    public float f23072h;

    /* renamed from: i, reason: collision with root package name */
    public float f23073i;

    /* renamed from: j, reason: collision with root package name */
    public float f23074j;

    /* renamed from: k, reason: collision with root package name */
    public float f23075k;

    /* renamed from: l, reason: collision with root package name */
    public float f23076l;

    /* renamed from: m, reason: collision with root package name */
    public float f23077m;

    /* renamed from: n, reason: collision with root package name */
    public float f23078n;

    /* renamed from: o, reason: collision with root package name */
    public float f23079o;

    /* renamed from: p, reason: collision with root package name */
    public float f23080p;

    /* renamed from: q, reason: collision with root package name */
    public float f23081q;

    /* renamed from: r, reason: collision with root package name */
    public int f23082r;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap<String, N1.a> f23083s;

    /* renamed from: t, reason: collision with root package name */
    public String f23084t;

    public f() {
        this.f23065a = null;
        this.f23066b = 0;
        this.f23067c = 0;
        this.f23068d = 0;
        this.f23069e = 0;
        this.f23070f = Float.NaN;
        this.f23071g = Float.NaN;
        this.f23072h = Float.NaN;
        this.f23073i = Float.NaN;
        this.f23074j = Float.NaN;
        this.f23075k = Float.NaN;
        this.f23076l = Float.NaN;
        this.f23077m = Float.NaN;
        this.f23078n = Float.NaN;
        this.f23079o = Float.NaN;
        this.f23080p = Float.NaN;
        this.f23081q = Float.NaN;
        this.f23082r = 0;
        this.f23083s = new HashMap<>();
        this.f23084t = null;
    }

    private void e(StringBuilder sb2, d.b bVar) {
        Q1.d dVarJ = this.f23065a.j(bVar);
        if (dVarJ == null || dVarJ.f27541f == null) {
            return;
        }
        sb2.append("Anchor");
        sb2.append(bVar.name());
        sb2.append(": ['");
        String str = dVarJ.f27541f.g().f27620o;
        if (str == null) {
            str = "#PARENT";
        }
        sb2.append(str);
        sb2.append("', '");
        sb2.append(dVarJ.f27541f.j().name());
        sb2.append("', '");
        sb2.append(dVarJ.f27542g);
        sb2.append("'],\n");
    }

    public boolean c() {
        return Float.isNaN(this.f23072h) && Float.isNaN(this.f23073i) && Float.isNaN(this.f23074j) && Float.isNaN(this.f23075k) && Float.isNaN(this.f23076l) && Float.isNaN(this.f23077m) && Float.isNaN(this.f23078n) && Float.isNaN(this.f23079o) && Float.isNaN(this.f23080p);
    }

    public StringBuilder d(StringBuilder sb2, boolean z10) {
        sb2.append("{\n");
        b(sb2, "left", this.f23066b);
        b(sb2, "top", this.f23067c);
        b(sb2, "right", this.f23068d);
        b(sb2, "bottom", this.f23069e);
        a(sb2, "pivotX", this.f23070f);
        a(sb2, "pivotY", this.f23071g);
        a(sb2, "rotationX", this.f23072h);
        a(sb2, "rotationY", this.f23073i);
        a(sb2, "rotationZ", this.f23074j);
        a(sb2, "translationX", this.f23075k);
        a(sb2, "translationY", this.f23076l);
        a(sb2, "translationZ", this.f23077m);
        a(sb2, "scaleX", this.f23078n);
        a(sb2, "scaleY", this.f23079o);
        a(sb2, "alpha", this.f23080p);
        b(sb2, "visibility", this.f23082r);
        a(sb2, "interpolatedPos", this.f23081q);
        if (this.f23065a != null) {
            for (d.b bVar : d.b.values()) {
                e(sb2, bVar);
            }
        }
        if (z10) {
            a(sb2, "phone_orientation", f23064u);
        }
        if (z10) {
            a(sb2, "phone_orientation", f23064u);
        }
        if (this.f23083s.size() != 0) {
            sb2.append("custom : {\n");
            for (String str : this.f23083s.keySet()) {
                N1.a aVar = this.f23083s.get(str);
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
        if (this.f23083s.containsKey(str)) {
            this.f23083s.get(str).i(f10);
        } else {
            this.f23083s.put(str, new N1.a(str, i10, f10));
        }
    }

    public void g(String str, int i10, int i11) {
        if (this.f23083s.containsKey(str)) {
            this.f23083s.get(str).j(i11);
        } else {
            this.f23083s.put(str, new N1.a(str, i10, i11));
        }
    }

    public f h() {
        Q1.e eVar = this.f23065a;
        if (eVar != null) {
            this.f23066b = eVar.w();
            this.f23067c = this.f23065a.H();
            this.f23068d = this.f23065a.F();
            this.f23069e = this.f23065a.m();
            i(this.f23065a.f27618n);
        }
        return this;
    }

    public void i(f fVar) {
        this.f23070f = fVar.f23070f;
        this.f23071g = fVar.f23071g;
        this.f23072h = fVar.f23072h;
        this.f23073i = fVar.f23073i;
        this.f23074j = fVar.f23074j;
        this.f23075k = fVar.f23075k;
        this.f23076l = fVar.f23076l;
        this.f23077m = fVar.f23077m;
        this.f23078n = fVar.f23078n;
        this.f23079o = fVar.f23079o;
        this.f23080p = fVar.f23080p;
        this.f23082r = fVar.f23082r;
        this.f23083s.clear();
        for (N1.a aVar : fVar.f23083s.values()) {
            this.f23083s.put(aVar.f(), aVar.b());
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
        this.f23065a = null;
        this.f23066b = 0;
        this.f23067c = 0;
        this.f23068d = 0;
        this.f23069e = 0;
        this.f23070f = Float.NaN;
        this.f23071g = Float.NaN;
        this.f23072h = Float.NaN;
        this.f23073i = Float.NaN;
        this.f23074j = Float.NaN;
        this.f23075k = Float.NaN;
        this.f23076l = Float.NaN;
        this.f23077m = Float.NaN;
        this.f23078n = Float.NaN;
        this.f23079o = Float.NaN;
        this.f23080p = Float.NaN;
        this.f23081q = Float.NaN;
        this.f23082r = 0;
        this.f23083s = new HashMap<>();
        this.f23084t = null;
        this.f23065a = eVar;
    }

    public f(f fVar) {
        this.f23065a = null;
        this.f23066b = 0;
        this.f23067c = 0;
        this.f23068d = 0;
        this.f23069e = 0;
        this.f23070f = Float.NaN;
        this.f23071g = Float.NaN;
        this.f23072h = Float.NaN;
        this.f23073i = Float.NaN;
        this.f23074j = Float.NaN;
        this.f23075k = Float.NaN;
        this.f23076l = Float.NaN;
        this.f23077m = Float.NaN;
        this.f23078n = Float.NaN;
        this.f23079o = Float.NaN;
        this.f23080p = Float.NaN;
        this.f23081q = Float.NaN;
        this.f23082r = 0;
        this.f23083s = new HashMap<>();
        this.f23084t = null;
        this.f23065a = fVar.f23065a;
        this.f23066b = fVar.f23066b;
        this.f23067c = fVar.f23067c;
        this.f23068d = fVar.f23068d;
        this.f23069e = fVar.f23069e;
        i(fVar);
    }
}
