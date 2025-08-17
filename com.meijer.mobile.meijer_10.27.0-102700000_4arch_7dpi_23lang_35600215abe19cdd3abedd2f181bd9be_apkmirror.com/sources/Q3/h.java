package Q3;

import d3.D;
import d3.P;
import d3.r;
import x3.F;
import x3.J;
import x3.K;

/* loaded from: classes4.dex */
final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f29733a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f29734b;

    /* renamed from: c, reason: collision with root package name */
    private final long f29735c;

    /* renamed from: d, reason: collision with root package name */
    private final long f29736d;

    /* renamed from: e, reason: collision with root package name */
    private final int f29737e;

    @Override // x3.J
    public boolean g() {
        return true;
    }

    public static h a(long j10, long j11, F.a aVar, D d10) {
        int iH;
        d10.X(6);
        long jQ = j11 + aVar.f169072c + d10.q();
        int iQ = d10.q();
        if (iQ <= 0) {
            return null;
        }
        long jU0 = P.U0((iQ * aVar.f169076g) - 1, aVar.f169073d);
        int iP = d10.P();
        int iP2 = d10.P();
        int iP3 = d10.P();
        d10.X(2);
        long[] jArr = new long[iP];
        long[] jArr2 = new long[iP];
        int i10 = 0;
        long j12 = j11 + aVar.f169072c;
        while (i10 < iP) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int i11 = i10;
            jArr3[i11] = (i10 * jU0) / iP;
            jArr4[i11] = j12;
            if (iP3 == 1) {
                iH = d10.H();
            } else if (iP3 == 2) {
                iH = d10.P();
            } else if (iP3 == 3) {
                iH = d10.K();
            } else {
                if (iP3 != 4) {
                    return null;
                }
                iH = d10.L();
            }
            j12 += iH * iP2;
            i10 = i11 + 1;
            jArr = jArr3;
            jArr2 = jArr4;
        }
        long[] jArr5 = jArr;
        long[] jArr6 = jArr2;
        if (j10 != -1 && j10 != jQ) {
            r.i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + jQ);
        }
        if (jQ != j12) {
            r.i("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jQ + ", " + j12 + "\nSeeking will be inaccurate.");
            jQ = Math.max(jQ, j12);
        }
        return new h(jArr5, jArr6, jU0, jQ, aVar.f169075f);
    }

    @Override // x3.J
    public J.a d(long j10) {
        int iG = P.g(this.f29733a, j10, true, true);
        K k10 = new K(this.f29733a[iG], this.f29734b[iG]);
        if (k10.f169083a >= j10 || iG == this.f29733a.length - 1) {
            return new J.a(k10);
        }
        int i10 = iG + 1;
        return new J.a(k10, new K(this.f29733a[i10], this.f29734b[i10]));
    }

    @Override // Q3.g
    public long f() {
        return this.f29736d;
    }

    @Override // Q3.g
    public long h(long j10) {
        return this.f29733a[P.g(this.f29734b, j10, true, true)];
    }

    @Override // Q3.g
    public int k() {
        return this.f29737e;
    }

    @Override // x3.J
    public long l() {
        return this.f29735c;
    }

    private h(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f29733a = jArr;
        this.f29734b = jArr2;
        this.f29735c = j10;
        this.f29736d = j11;
        this.f29737e = i10;
    }
}
