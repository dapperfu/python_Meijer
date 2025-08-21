package h6;

import Z.o0;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r6.C16863e;

/* renamed from: h6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14478i {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<C16863e>> f135108c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, z> f135109d;

    /* renamed from: e, reason: collision with root package name */
    private float f135110e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, o6.c> f135111f;

    /* renamed from: g, reason: collision with root package name */
    private List<o6.h> f135112g;

    /* renamed from: h, reason: collision with root package name */
    private o0<o6.d> f135113h;

    /* renamed from: i, reason: collision with root package name */
    private Z.C<C16863e> f135114i;

    /* renamed from: j, reason: collision with root package name */
    private List<C16863e> f135115j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f135116k;

    /* renamed from: l, reason: collision with root package name */
    private float f135117l;

    /* renamed from: m, reason: collision with root package name */
    private float f135118m;

    /* renamed from: n, reason: collision with root package name */
    private float f135119n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f135120o;

    /* renamed from: q, reason: collision with root package name */
    private int f135122q;

    /* renamed from: r, reason: collision with root package name */
    private int f135123r;

    /* renamed from: a, reason: collision with root package name */
    private final H f135106a = new H();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<String> f135107b = new HashSet<>();

    /* renamed from: p, reason: collision with root package name */
    private int f135121p = 0;

    public Rect b() {
        return this.f135116k;
    }

    public o0<o6.d> c() {
        return this.f135113h;
    }

    public float e() {
        return this.f135118m - this.f135117l;
    }

    public float f() {
        return this.f135118m;
    }

    public Map<String, o6.c> g() {
        return this.f135111f;
    }

    public float h(float f10) {
        return v6.l.i(this.f135117l, this.f135118m, f10);
    }

    public float i() {
        return this.f135119n;
    }

    public List<C16863e> k() {
        return this.f135115j;
    }

    public o6.h l(String str) {
        int size = this.f135112g.size();
        for (int i10 = 0; i10 < size; i10++) {
            o6.h hVar = this.f135112g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f135121p;
    }

    public H n() {
        return this.f135106a;
    }

    public List<C16863e> o(String str) {
        return this.f135108c.get(str);
    }

    public float p() {
        return this.f135117l;
    }

    public boolean q() {
        return this.f135120o;
    }

    public boolean r() {
        return !this.f135109d.isEmpty();
    }

    public void s(int i10) {
        this.f135121p += i10;
    }

    public void t(Rect rect, float f10, float f11, float f12, List<C16863e> list, Z.C<C16863e> c10, Map<String, List<C16863e>> map, Map<String, z> map2, float f13, o0<o6.d> o0Var, Map<String, o6.c> map3, List<o6.h> list2, int i10, int i11) {
        this.f135116k = rect;
        this.f135117l = f10;
        this.f135118m = f11;
        this.f135119n = f12;
        this.f135115j = list;
        this.f135114i = c10;
        this.f135108c = map;
        this.f135109d = map2;
        this.f135110e = f13;
        this.f135113h = o0Var;
        this.f135111f = map3;
        this.f135112g = list2;
        this.f135122q = i10;
        this.f135123r = i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<C16863e> it = this.f135115j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().z("\t"));
        }
        return sb2.toString();
    }

    public C16863e u(long j10) {
        return this.f135114i.d(j10);
    }

    public void v(boolean z10) {
        this.f135120o = z10;
    }

    public void w(boolean z10) {
        this.f135106a.b(z10);
    }

    public void a(String str) {
        v6.g.c(str);
        this.f135107b.add(str);
    }

    public float d() {
        return (long) ((e() / this.f135119n) * 1000.0f);
    }

    public Map<String, z> j() {
        float fE = v6.q.e();
        if (fE != this.f135110e) {
            for (Map.Entry<String, z> entry : this.f135109d.entrySet()) {
                this.f135109d.put(entry.getKey(), entry.getValue().a(this.f135110e / fE));
            }
        }
        this.f135110e = fE;
        return this.f135109d;
    }
}
