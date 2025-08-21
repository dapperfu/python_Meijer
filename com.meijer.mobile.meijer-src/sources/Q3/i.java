package Q3;

import com.medallia.digital.mobilesdk.l3;
import d3.D;
import d3.P;
import x3.F;

/* loaded from: classes4.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public final F.a f27751a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27752b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27753c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27754d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27755e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f27756f;

    public long a() {
        long j10 = this.f27752b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        return P.U0((j10 * r2.f170164g) - 1, this.f27751a.f170161d);
    }

    private i(F.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f27751a = new F.a(aVar);
        this.f27752b = j10;
        this.f27753c = j11;
        this.f27756f = jArr;
        this.f27754d = i10;
        this.f27755e = i11;
    }

    public static i b(F.a aVar, D d10) {
        int iL;
        long J10;
        long[] jArr;
        int i10;
        int i11;
        int iQ = d10.q();
        if ((iQ & 1) != 0) {
            iL = d10.L();
        } else {
            iL = -1;
        }
        if ((iQ & 2) != 0) {
            J10 = d10.J();
        } else {
            J10 = -1;
        }
        long j10 = J10;
        if ((iQ & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = d10.H();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iQ & 8) != 0) {
            d10.X(4);
        }
        if (d10.a() >= 24) {
            d10.X(21);
            int iK = d10.K();
            i11 = iK & l3.f93322b;
            i10 = (16773120 & iK) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new i(aVar, iL, j10, jArr2, i10, i11);
    }
}
