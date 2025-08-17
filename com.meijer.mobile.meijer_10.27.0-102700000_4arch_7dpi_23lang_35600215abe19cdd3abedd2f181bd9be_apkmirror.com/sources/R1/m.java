package R1;

import java.util.ArrayList;

/* loaded from: classes.dex */
class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f31607h;

    /* renamed from: c, reason: collision with root package name */
    p f31610c;

    /* renamed from: d, reason: collision with root package name */
    p f31611d;

    /* renamed from: f, reason: collision with root package name */
    int f31613f;

    /* renamed from: g, reason: collision with root package name */
    int f31614g;

    /* renamed from: a, reason: collision with root package name */
    public int f31608a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31609b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<p> f31612e = new ArrayList<>();

    private long c(f fVar, long j10) {
        p pVar = fVar.f31583d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f31590k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f31590k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f31583d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, fVar2.f31585f + j10));
                }
            }
        }
        if (fVar != pVar.f31641i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f31640h, j11)), j11 - pVar.f31640h.f31585f);
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f31583d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f31590k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f31590k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f31583d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, fVar2.f31585f + j10));
                }
            }
        }
        if (fVar != pVar.f31640h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f31641i, j11)), j11 - pVar.f31641i.f31585f);
    }

    public void a(p pVar) {
        this.f31612e.add(pVar);
        this.f31611d = pVar;
    }

    public long b(Q1.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f31610c;
        if (pVar instanceof c) {
            if (((c) pVar).f31638f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f29587e : fVar.f29589f).f31640h;
        f fVar3 = (i10 == 0 ? fVar.f29587e : fVar.f29589f).f31641i;
        boolean zContains = pVar.f31640h.f31591l.contains(fVar2);
        boolean zContains2 = this.f31610c.f31641i.f31591l.contains(fVar3);
        long j11 = this.f31610c.j();
        if (zContains && zContains2) {
            long jD = d(this.f31610c.f31640h, 0L);
            long jC = c(this.f31610c.f31641i, 0L);
            long j12 = jD - j11;
            p pVar2 = this.f31610c;
            int i12 = pVar2.f31641i.f31585f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = pVar2.f31640h.f31585f;
            long j13 = ((-jC) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float fL = pVar2.f31634b.l(i10);
            float f10 = fL > 0.0f ? (long) ((j13 / fL) + (j12 / (1.0f - fL))) : 0L;
            long j14 = ((long) ((f10 * fL) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fL)) + 0.5f));
            j10 = r12.f31640h.f31585f + j14;
            i11 = this.f31610c.f31641i.f31585f;
        } else {
            if (zContains) {
                return Math.max(d(this.f31610c.f31640h, r12.f31585f), this.f31610c.f31640h.f31585f + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f31610c.f31641i, r12.f31585f), (-this.f31610c.f31641i.f31585f) + j11);
            }
            j10 = r12.f31640h.f31585f + this.f31610c.j();
            i11 = this.f31610c.f31641i.f31585f;
        }
        return j10 - i11;
    }

    public m(p pVar, int i10) {
        this.f31610c = null;
        this.f31611d = null;
        int i11 = f31607h;
        this.f31613f = i11;
        f31607h = i11 + 1;
        this.f31610c = pVar;
        this.f31611d = pVar;
        this.f31614g = i10;
    }
}
