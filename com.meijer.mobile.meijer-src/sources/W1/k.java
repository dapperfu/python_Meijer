package W1;

import java.util.ArrayList;

/* loaded from: classes.dex */
class k {

    /* renamed from: h, reason: collision with root package name */
    public static int f40669h;

    /* renamed from: c, reason: collision with root package name */
    m f40672c;

    /* renamed from: d, reason: collision with root package name */
    m f40673d;

    /* renamed from: f, reason: collision with root package name */
    int f40675f;

    /* renamed from: g, reason: collision with root package name */
    int f40676g;

    /* renamed from: a, reason: collision with root package name */
    public int f40670a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40671b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<m> f40674e = new ArrayList<>();

    private long c(f fVar, long j10) {
        m mVar = fVar.f40648d;
        if (mVar instanceof i) {
            return j10;
        }
        int size = fVar.f40655k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f40655k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f40648d != mVar) {
                    jMin = Math.min(jMin, c(fVar2, fVar2.f40650f + j10));
                }
            }
        }
        if (fVar != mVar.f40688i) {
            return jMin;
        }
        long j11 = j10 - mVar.j();
        return Math.min(Math.min(jMin, c(mVar.f40687h, j11)), j11 - mVar.f40687h.f40650f);
    }

    private long d(f fVar, long j10) {
        m mVar = fVar.f40648d;
        if (mVar instanceof i) {
            return j10;
        }
        int size = fVar.f40655k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f40655k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f40648d != mVar) {
                    jMax = Math.max(jMax, d(fVar2, fVar2.f40650f + j10));
                }
            }
        }
        if (fVar != mVar.f40687h) {
            return jMax;
        }
        long j11 = j10 + mVar.j();
        return Math.max(Math.max(jMax, d(mVar.f40688i, j11)), j11 - mVar.f40688i.f40650f);
    }

    public void a(m mVar) {
        this.f40674e.add(mVar);
        this.f40673d = mVar;
    }

    public long b(V1.f fVar, int i10) {
        long j10;
        int i11;
        m mVar = this.f40672c;
        if (mVar instanceof c) {
            if (((c) mVar).f40685f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(mVar instanceof j)) {
                return 0L;
            }
        } else if (!(mVar instanceof l)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f39492e : fVar.f39494f).f40687h;
        f fVar3 = (i10 == 0 ? fVar.f39492e : fVar.f39494f).f40688i;
        boolean zContains = mVar.f40687h.f40656l.contains(fVar2);
        boolean zContains2 = this.f40672c.f40688i.f40656l.contains(fVar3);
        long j11 = this.f40672c.j();
        if (zContains && zContains2) {
            long jD = d(this.f40672c.f40687h, 0L);
            long jC = c(this.f40672c.f40688i, 0L);
            long j12 = jD - j11;
            m mVar2 = this.f40672c;
            int i12 = mVar2.f40688i.f40650f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = mVar2.f40687h.f40650f;
            long j13 = ((-jC) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float fO = mVar2.f40681b.o(i10);
            float f10 = fO > 0.0f ? (long) ((j13 / fO) + (j12 / (1.0f - fO))) : 0L;
            long j14 = ((long) ((f10 * fO) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fO)) + 0.5f));
            j10 = r12.f40687h.f40650f + j14;
            i11 = this.f40672c.f40688i.f40650f;
        } else {
            if (zContains) {
                return Math.max(d(this.f40672c.f40687h, r12.f40650f), this.f40672c.f40687h.f40650f + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f40672c.f40688i, r12.f40650f), (-this.f40672c.f40688i.f40650f) + j11);
            }
            j10 = r12.f40687h.f40650f + this.f40672c.j();
            i11 = this.f40672c.f40688i.f40650f;
        }
        return j10 - i11;
    }

    public k(m mVar, int i10) {
        this.f40672c = null;
        this.f40673d = null;
        int i11 = f40669h;
        this.f40675f = i11;
        f40669h = i11 + 1;
        this.f40672c = mVar;
        this.f40673d = mVar;
        this.f40676g = i10;
    }
}
