package Q3;

import L3.l;
import android.util.Pair;
import com.fullstory.Reason;
import d3.P;
import x3.J;
import x3.K;

/* loaded from: classes4.dex */
final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f29707a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f29708b;

    /* renamed from: c, reason: collision with root package name */
    private final long f29709c;

    private static Pair<Long, Long> b(long j10, long[] jArr, long[] jArr2) {
        int iG = P.g(jArr, j10, true, true);
        long j11 = jArr[iG];
        long j12 = jArr2[iG];
        int i10 = iG + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // x3.J
    public boolean g() {
        return true;
    }

    public static c a(long j10, l lVar, long j11) {
        int length = lVar.f17862e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += lVar.f17860c + lVar.f17862e[i12];
            j12 += lVar.f17861d + lVar.f17863f[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    @Override // x3.J
    public J.a d(long j10) {
        Pair<Long, Long> pairB = b(P.j1(P.p(j10, 0L, this.f29709c)), this.f29708b, this.f29707a);
        return new J.a(new K(P.M0(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // Q3.g
    public long f() {
        return -1L;
    }

    @Override // Q3.g
    public long h(long j10) {
        return P.M0(((Long) b(j10, this.f29707a, this.f29708b).second).longValue());
    }

    @Override // x3.J
    public long l() {
        return this.f29709c;
    }

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f29707a = jArr;
        this.f29708b = jArr2;
        this.f29709c = j10 == -9223372036854775807L ? P.M0(jArr2[jArr2.length - 1]) : j10;
    }

    @Override // Q3.g
    public int k() {
        return Reason.OS_VERSION_TOO_LOW;
    }
}
