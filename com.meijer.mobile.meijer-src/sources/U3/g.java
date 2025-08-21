package U3;

import Ee.L;
import Ee.g0;
import c3.C6476a;
import d3.C13599a;
import d3.P;

/* loaded from: classes4.dex */
public final class g implements k {

    /* renamed from: c, reason: collision with root package name */
    private static final g0<e> f37041c = g0.d().e(new De.g() { // from class: U3.f
        @Override // De.g
        public final Object apply(Object obj) {
            return Long.valueOf(g.f(((e) obj).f37038b));
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private final L<L<C6476a>> f37042a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f37043b;

    @Override // U3.k
    public int a(long j10) {
        int iD = P.d(this.f37043b, j10, false, false);
        if (iD < this.f37042a.size()) {
            return iD;
        }
        return -1;
    }

    @Override // U3.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public L<C6476a> b(long j10) {
        int iG = P.g(this.f37043b, j10, true, false);
        return iG == -1 ? L.x() : this.f37042a.get(iG);
    }

    @Override // U3.k
    public long e(int i10) {
        C13599a.a(i10 < this.f37042a.size());
        return this.f37043b[i10];
    }

    @Override // U3.k
    public int l() {
        return this.f37042a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.util.List<U3.e> r15) {
        /*
            r14 = this;
            r14.<init>()
            int r0 = r15.size()
            r1 = 2
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 1
            if (r0 != r5) goto L4a
            java.lang.Object r15 = Ee.Q.h(r15)
            U3.e r15 = (U3.e) r15
            long r6 = r15.f37038b
            long r6 = f(r6)
            long r8 = r15.f37039c
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L32
            Ee.L<c3.a> r15 = r15.f37037a
            Ee.L r15 = Ee.L.y(r15)
            r14.f37042a = r15
            long[] r15 = new long[r5]
            r15[r2] = r6
            r14.f37043b = r15
            return
        L32:
            Ee.L<c3.a> r0 = r15.f37037a
            Ee.L r3 = Ee.L.x()
            Ee.L r0 = Ee.L.z(r0, r3)
            r14.f37042a = r0
            long r3 = r15.f37039c
            long r3 = r3 + r6
            long[] r15 = new long[r1]
            r15[r2] = r6
            r15[r5] = r3
            r14.f37043b = r15
            return
        L4a:
            int r0 = r15.size()
            int r0 = r0 * r1
            long[] r0 = new long[r0]
            r14.f37043b = r0
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r0, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Ee.g0<U3.e> r1 = U3.g.f37041c
            Ee.L r15 = Ee.L.G(r1, r15)
            r1 = r2
        L67:
            int r5 = r15.size()
            if (r2 >= r5) goto Ld3
            java.lang.Object r5 = r15.get(r2)
            U3.e r5 = (U3.e) r5
            long r6 = r5.f37038b
            long r6 = f(r6)
            long r8 = r5.f37039c
            long r8 = r8 + r6
            if (r1 == 0) goto Lb0
            long[] r10 = r14.f37043b
            int r11 = r1 + (-1)
            r12 = r10[r11]
            int r10 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r10 >= 0) goto L89
            goto Lb0
        L89:
            int r10 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r10 != 0) goto L9f
            java.lang.Object r10 = r0.get(r11)
            Ee.L r10 = (Ee.L) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L9f
            Ee.L<c3.a> r6 = r5.f37037a
            r0.set(r11, r6)
            goto Lbc
        L9f:
            java.lang.String r10 = "CuesWithTimingSubtitle"
            java.lang.String r12 = "Truncating unsupported overlapping cues."
            d3.r.i(r10, r12)
            long[] r10 = r14.f37043b
            r10[r11] = r6
            Ee.L<c3.a> r6 = r5.f37037a
            r0.set(r11, r6)
            goto Lbc
        Lb0:
            long[] r10 = r14.f37043b
            int r11 = r1 + 1
            r10[r1] = r6
            Ee.L<c3.a> r1 = r5.f37037a
            r0.add(r1)
            r1 = r11
        Lbc:
            long r5 = r5.f37039c
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto Ld0
            long[] r5 = r14.f37043b
            int r6 = r1 + 1
            r5[r1] = r8
            Ee.L r1 = Ee.L.x()
            r0.add(r1)
            r1 = r6
        Ld0:
            int r2 = r2 + 1
            goto L67
        Ld3:
            Ee.L r15 = Ee.L.s(r0)
            r14.f37042a = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.g.<init>(java.util.List):void");
    }

    private static long f(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10;
    }
}
