package W1;

import java.util.ArrayList;

/* loaded from: classes.dex */
class k {

    /* renamed from: h, reason: collision with root package name */
    public static int f38381h;

    /* renamed from: c, reason: collision with root package name */
    m f38384c;

    /* renamed from: d, reason: collision with root package name */
    m f38385d;

    /* renamed from: f, reason: collision with root package name */
    int f38387f;

    /* renamed from: g, reason: collision with root package name */
    int f38388g;

    /* renamed from: a, reason: collision with root package name */
    public int f38382a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38383b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<m> f38386e = new ArrayList<>();

    private long c(f fVar, long j10) {
        m mVar = fVar.f38360d;
        if (mVar instanceof i) {
            return j10;
        }
        int size = fVar.f38367k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f38367k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f38360d != mVar) {
                    jMin = Math.min(jMin, c(fVar2, fVar2.f38362f + j10));
                }
            }
        }
        if (fVar != mVar.f38400i) {
            return jMin;
        }
        long j11 = j10 - mVar.j();
        return Math.min(Math.min(jMin, c(mVar.f38399h, j11)), j11 - mVar.f38399h.f38362f);
    }

    private long d(f fVar, long j10) {
        m mVar = fVar.f38360d;
        if (mVar instanceof i) {
            return j10;
        }
        int size = fVar.f38367k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f38367k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f38360d != mVar) {
                    jMax = Math.max(jMax, d(fVar2, fVar2.f38362f + j10));
                }
            }
        }
        if (fVar != mVar.f38399h) {
            return jMax;
        }
        long j11 = j10 + mVar.j();
        return Math.max(Math.max(jMax, d(mVar.f38400i, j11)), j11 - mVar.f38400i.f38362f);
    }

    public void a(m mVar) {
        this.f38386e.add(mVar);
        this.f38385d = mVar;
    }

    public long b(V1.f fVar, int i10) {
        long j10;
        int i11;
        m mVar = this.f38384c;
        if (mVar instanceof c) {
            if (((c) mVar).f38397f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(mVar instanceof j)) {
                return 0L;
            }
        } else if (!(mVar instanceof l)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f36632e : fVar.f36634f).f38399h;
        f fVar3 = (i10 == 0 ? fVar.f36632e : fVar.f36634f).f38400i;
        boolean zContains = mVar.f38399h.f38368l.contains(fVar2);
        boolean zContains2 = this.f38384c.f38400i.f38368l.contains(fVar3);
        long j11 = this.f38384c.j();
        if (zContains && zContains2) {
            long jD = d(this.f38384c.f38399h, 0L);
            long jC = c(this.f38384c.f38400i, 0L);
            long j12 = jD - j11;
            m mVar2 = this.f38384c;
            int i12 = mVar2.f38400i.f38362f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = mVar2.f38399h.f38362f;
            long j13 = ((-jC) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float fO = mVar2.f38393b.o(i10);
            float f10 = fO > 0.0f ? (long) ((j13 / fO) + (j12 / (1.0f - fO))) : 0L;
            long j14 = ((long) ((f10 * fO) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fO)) + 0.5f));
            j10 = r12.f38399h.f38362f + j14;
            i11 = this.f38384c.f38400i.f38362f;
        } else {
            if (zContains) {
                return Math.max(d(this.f38384c.f38399h, r12.f38362f), this.f38384c.f38399h.f38362f + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f38384c.f38400i, r12.f38362f), (-this.f38384c.f38400i.f38362f) + j11);
            }
            j10 = r12.f38399h.f38362f + this.f38384c.j();
            i11 = this.f38384c.f38400i.f38362f;
        }
        return j10 - i11;
    }

    public k(m mVar, int i10) {
        this.f38384c = null;
        this.f38385d = null;
        int i11 = f38381h;
        this.f38387f = i11;
        f38381h = i11 + 1;
        this.f38384c = mVar;
        this.f38385d = mVar;
        this.f38388g = i10;
    }
}
