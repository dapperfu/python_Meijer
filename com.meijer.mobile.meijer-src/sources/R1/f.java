package R1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f31585d;

    /* renamed from: f, reason: collision with root package name */
    int f31587f;

    /* renamed from: g, reason: collision with root package name */
    public int f31588g;

    /* renamed from: a, reason: collision with root package name */
    public d f31582a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31583b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31584c = false;

    /* renamed from: e, reason: collision with root package name */
    a f31586e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f31589h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f31590i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31591j = false;

    /* renamed from: k, reason: collision with root package name */
    List<d> f31592k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<f> f31593l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    @Override // R1.d
    public void a(d dVar) {
        Iterator<f> it = this.f31593l.iterator();
        while (it.hasNext()) {
            if (!it.next().f31591j) {
                return;
            }
        }
        this.f31584c = true;
        d dVar2 = this.f31582a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f31583b) {
            this.f31585d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f31593l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f31591j) {
            g gVar = this.f31590i;
            if (gVar != null) {
                if (!gVar.f31591j) {
                    return;
                } else {
                    this.f31587f = this.f31589h * gVar.f31588g;
                }
            }
            d(fVar.f31588g + this.f31587f);
        }
        d dVar3 = this.f31582a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f31592k.add(dVar);
        if (this.f31591j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f31593l.clear();
        this.f31592k.clear();
        this.f31591j = false;
        this.f31588g = 0;
        this.f31584c = false;
        this.f31583b = false;
    }

    public void d(int i10) {
        if (this.f31591j) {
            return;
        }
        this.f31591j = true;
        this.f31588g = i10;
        for (d dVar : this.f31592k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31585d.f31636b.o());
        sb2.append(":");
        sb2.append(this.f31586e);
        sb2.append("(");
        sb2.append(this.f31591j ? Integer.valueOf(this.f31588g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f31593l.size());
        sb2.append(":d=");
        sb2.append(this.f31592k.size());
        sb2.append(">");
        return sb2.toString();
    }

    public f(p pVar) {
        this.f31585d = pVar;
    }
}
