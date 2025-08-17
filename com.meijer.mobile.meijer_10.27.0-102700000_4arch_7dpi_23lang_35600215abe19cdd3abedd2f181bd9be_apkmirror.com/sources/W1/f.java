package W1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    m f38360d;

    /* renamed from: f, reason: collision with root package name */
    int f38362f;

    /* renamed from: g, reason: collision with root package name */
    public int f38363g;

    /* renamed from: a, reason: collision with root package name */
    public d f38357a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38358b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38359c = false;

    /* renamed from: e, reason: collision with root package name */
    a f38361e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f38364h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f38365i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f38366j = false;

    /* renamed from: k, reason: collision with root package name */
    List<d> f38367k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<f> f38368l = new ArrayList();

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
        Iterator<f> it = this.f38368l.iterator();
        while (it.hasNext()) {
            if (!it.next().f38366j) {
                return;
            }
        }
        this.f38359c = true;
        d dVar2 = this.f38357a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f38358b) {
            this.f38360d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f38368l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f38366j) {
            g gVar = this.f38365i;
            if (gVar != null) {
                if (!gVar.f38366j) {
                    return;
                } else {
                    this.f38362f = this.f38364h * gVar.f38363g;
                }
            }
            d(fVar.f38363g + this.f38362f);
        }
        d dVar3 = this.f38357a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f38367k.add(dVar);
        if (this.f38366j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f38368l.clear();
        this.f38367k.clear();
        this.f38366j = false;
        this.f38363g = 0;
        this.f38359c = false;
        this.f38358b = false;
    }

    public void d(int i10) {
        if (this.f38366j) {
            return;
        }
        this.f38366j = true;
        this.f38363g = i10;
        for (d dVar : this.f38367k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38360d.f38393b.r());
        sb2.append(":");
        sb2.append(this.f38361e);
        sb2.append("(");
        sb2.append(this.f38366j ? Integer.valueOf(this.f38363g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f38368l.size());
        sb2.append(":d=");
        sb2.append(this.f38367k.size());
        sb2.append(">");
        return sb2.toString();
    }

    public f(m mVar) {
        this.f38360d = mVar;
    }
}
