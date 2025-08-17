package R1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f31583d;

    /* renamed from: f, reason: collision with root package name */
    int f31585f;

    /* renamed from: g, reason: collision with root package name */
    public int f31586g;

    /* renamed from: a, reason: collision with root package name */
    public d f31580a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31581b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31582c = false;

    /* renamed from: e, reason: collision with root package name */
    a f31584e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f31587h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f31588i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31589j = false;

    /* renamed from: k, reason: collision with root package name */
    List<d> f31590k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<f> f31591l = new ArrayList();

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
        Iterator<f> it = this.f31591l.iterator();
        while (it.hasNext()) {
            if (!it.next().f31589j) {
                return;
            }
        }
        this.f31582c = true;
        d dVar2 = this.f31580a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f31581b) {
            this.f31583d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f31591l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f31589j) {
            g gVar = this.f31588i;
            if (gVar != null) {
                if (!gVar.f31589j) {
                    return;
                } else {
                    this.f31585f = this.f31587h * gVar.f31586g;
                }
            }
            d(fVar.f31586g + this.f31585f);
        }
        d dVar3 = this.f31580a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f31590k.add(dVar);
        if (this.f31589j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f31591l.clear();
        this.f31590k.clear();
        this.f31589j = false;
        this.f31586g = 0;
        this.f31582c = false;
        this.f31581b = false;
    }

    public void d(int i10) {
        if (this.f31589j) {
            return;
        }
        this.f31589j = true;
        this.f31586g = i10;
        for (d dVar : this.f31590k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31583d.f31634b.o());
        sb2.append(":");
        sb2.append(this.f31584e);
        sb2.append("(");
        sb2.append(this.f31589j ? Integer.valueOf(this.f31586g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f31591l.size());
        sb2.append(":d=");
        sb2.append(this.f31590k.size());
        sb2.append(">");
        return sb2.toString();
    }

    public f(p pVar) {
        this.f31583d = pVar;
    }
}
