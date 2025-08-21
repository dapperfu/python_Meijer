package R1;

import java.util.ArrayList;

/* loaded from: classes.dex */
class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f31609h;

    /* renamed from: c, reason: collision with root package name */
    p f31612c;

    /* renamed from: d, reason: collision with root package name */
    p f31613d;

    /* renamed from: f, reason: collision with root package name */
    int f31615f;

    /* renamed from: g, reason: collision with root package name */
    int f31616g;

    /* renamed from: a, reason: collision with root package name */
    public int f31610a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31611b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<p> f31614e = new ArrayList<>();

    private long c(f fVar, long j10) {
        p pVar = fVar.f31585d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f31592k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f31592k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f31585d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, fVar2.f31587f + j10));
                }
            }
        }
        if (fVar != pVar.f31643i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f31642h, j11)), j11 - pVar.f31642h.f31587f);
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f31585d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f31592k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f31592k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f31585d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, fVar2.f31587f + j10));
                }
            }
        }
        if (fVar != pVar.f31642h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f31643i, j11)), j11 - pVar.f31643i.f31587f);
    }

    public void a(p pVar) {
        this.f31614e.add(pVar);
        this.f31613d = pVar;
    }

    public long b(Q1.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f31612c;
        if (pVar instanceof c) {
            if (((c) pVar).f31640f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f27600e : fVar.f27602f).f31642h;
        f fVar3 = (i10 == 0 ? fVar.f27600e : fVar.f27602f).f31643i;
        boolean zContains = pVar.f31642h.f31593l.contains(fVar2);
        boolean zContains2 = this.f31612c.f31643i.f31593l.contains(fVar3);
        long j11 = this.f31612c.j();
        if (zContains && zContains2) {
            long jD = d(this.f31612c.f31642h, 0L);
            long jC = c(this.f31612c.f31643i, 0L);
            long j12 = jD - j11;
            p pVar2 = this.f31612c;
            int i12 = pVar2.f31643i.f31587f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = pVar2.f31642h.f31587f;
            long j13 = ((-jC) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float fL = pVar2.f31636b.l(i10);
            float f10 = fL > 0.0f ? (long) ((j13 / fL) + (j12 / (1.0f - fL))) : 0L;
            long j14 = ((long) ((f10 * fL) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fL)) + 0.5f));
            j10 = r12.f31642h.f31587f + j14;
            i11 = this.f31612c.f31643i.f31587f;
        } else {
            if (zContains) {
                return Math.max(d(this.f31612c.f31642h, r12.f31587f), this.f31612c.f31642h.f31587f + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f31612c.f31643i, r12.f31587f), (-this.f31612c.f31643i.f31587f) + j11);
            }
            j10 = r12.f31642h.f31587f + this.f31612c.j();
            i11 = this.f31612c.f31643i.f31587f;
        }
        return j10 - i11;
    }

    public m(p pVar, int i10) {
        this.f31612c = null;
        this.f31613d = null;
        int i11 = f31609h;
        this.f31615f = i11;
        f31609h = i11 + 1;
        this.f31612c = pVar;
        this.f31613d = pVar;
        this.f31616g = i10;
    }
}
