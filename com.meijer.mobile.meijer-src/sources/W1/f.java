package W1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    m f40648d;

    /* renamed from: f, reason: collision with root package name */
    int f40650f;

    /* renamed from: g, reason: collision with root package name */
    public int f40651g;

    /* renamed from: a, reason: collision with root package name */
    public d f40645a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40646b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40647c = false;

    /* renamed from: e, reason: collision with root package name */
    a f40649e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f40652h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f40653i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40654j = false;

    /* renamed from: k, reason: collision with root package name */
    List<d> f40655k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<f> f40656l = new ArrayList();

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

    @Override // W1.d
    public void a(d dVar) {
        Iterator<f> it = this.f40656l.iterator();
        while (it.hasNext()) {
            if (!it.next().f40654j) {
                return;
            }
        }
        this.f40647c = true;
        d dVar2 = this.f40645a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f40646b) {
            this.f40648d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f40656l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f40654j) {
            g gVar = this.f40653i;
            if (gVar != null) {
                if (!gVar.f40654j) {
                    return;
                } else {
                    this.f40650f = this.f40652h * gVar.f40651g;
                }
            }
            d(fVar.f40651g + this.f40650f);
        }
        d dVar3 = this.f40645a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f40655k.add(dVar);
        if (this.f40654j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f40656l.clear();
        this.f40655k.clear();
        this.f40654j = false;
        this.f40651g = 0;
        this.f40647c = false;
        this.f40646b = false;
    }

    public void d(int i10) {
        if (this.f40654j) {
            return;
        }
        this.f40654j = true;
        this.f40651g = i10;
        for (d dVar : this.f40655k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f40648d.f40681b.r());
        sb2.append(":");
        sb2.append(this.f40649e);
        sb2.append("(");
        sb2.append(this.f40654j ? Integer.valueOf(this.f40651g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f40656l.size());
        sb2.append(":d=");
        sb2.append(this.f40655k.size());
        sb2.append(">");
        return sb2.toString();
    }

    public f(m mVar) {
        this.f40648d = mVar;
    }
}
