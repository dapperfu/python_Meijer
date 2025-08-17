package g6;

import Z.o0;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q6.C16475e;

/* renamed from: g6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14209i {

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<C16475e>> f132932c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, z> f132933d;

    /* renamed from: e, reason: collision with root package name */
    private float f132934e;

    /* renamed from: f, reason: collision with root package name */
    private Map<String, n6.c> f132935f;

    /* renamed from: g, reason: collision with root package name */
    private List<n6.h> f132936g;

    /* renamed from: h, reason: collision with root package name */
    private o0<n6.d> f132937h;

    /* renamed from: i, reason: collision with root package name */
    private Z.C<C16475e> f132938i;

    /* renamed from: j, reason: collision with root package name */
    private List<C16475e> f132939j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f132940k;

    /* renamed from: l, reason: collision with root package name */
    private float f132941l;

    /* renamed from: m, reason: collision with root package name */
    private float f132942m;

    /* renamed from: n, reason: collision with root package name */
    private float f132943n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f132944o;

    /* renamed from: q, reason: collision with root package name */
    private int f132946q;

    /* renamed from: r, reason: collision with root package name */
    private int f132947r;

    /* renamed from: a, reason: collision with root package name */
    private final H f132930a = new H();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<String> f132931b = new HashSet<>();

    /* renamed from: p, reason: collision with root package name */
    private int f132945p = 0;

    public Rect b() {
        return this.f132940k;
    }

    public o0<n6.d> c() {
        return this.f132937h;
    }

    public float e() {
        return this.f132942m - this.f132941l;
    }

    public float f() {
        return this.f132942m;
    }

    public Map<String, n6.c> g() {
        return this.f132935f;
    }

    public float h(float f10) {
        return u6.l.i(this.f132941l, this.f132942m, f10);
    }

    public float i() {
        return this.f132943n;
    }

    public List<C16475e> k() {
        return this.f132939j;
    }

    public n6.h l(String str) {
        int size = this.f132936g.size();
        for (int i10 = 0; i10 < size; i10++) {
            n6.h hVar = this.f132936g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f132945p;
    }

    public H n() {
        return this.f132930a;
    }

    public List<C16475e> o(String str) {
        return this.f132932c.get(str);
    }

    public float p() {
        return this.f132941l;
    }

    public boolean q() {
        return this.f132944o;
    }

    public boolean r() {
        return !this.f132933d.isEmpty();
    }

    public void s(int i10) {
        this.f132945p += i10;
    }

    public void t(Rect rect, float f10, float f11, float f12, List<C16475e> list, Z.C<C16475e> c10, Map<String, List<C16475e>> map, Map<String, z> map2, float f13, o0<n6.d> o0Var, Map<String, n6.c> map3, List<n6.h> list2, int i10, int i11) {
        this.f132940k = rect;
        this.f132941l = f10;
        this.f132942m = f11;
        this.f132943n = f12;
        this.f132939j = list;
        this.f132938i = c10;
        this.f132932c = map;
        this.f132933d = map2;
        this.f132934e = f13;
        this.f132937h = o0Var;
        this.f132935f = map3;
        this.f132936g = list2;
        this.f132946q = i10;
        this.f132947r = i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<C16475e> it = this.f132939j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().z("\t"));
        }
        return sb2.toString();
    }

    public C16475e u(long j10) {
        return this.f132938i.d(j10);
    }

    public void v(boolean z10) {
        this.f132944o = z10;
    }

    public void w(boolean z10) {
        this.f132930a.b(z10);
    }

    public void a(String str) {
        u6.g.c(str);
        this.f132931b.add(str);
    }

    public float d() {
        return (long) ((e() / this.f132943n) * 1000.0f);
    }

    public Map<String, z> j() {
        float fE = u6.q.e();
        if (fE != this.f132934e) {
            for (Map.Entry<String, z> entry : this.f132933d.entrySet()) {
                this.f132933d.put(entry.getKey(), entry.getValue().a(this.f132934e / fE));
            }
        }
        this.f132934e = fE;
        return this.f132933d;
    }
}
