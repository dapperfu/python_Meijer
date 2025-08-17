package p3;

import a3.F;
import a3.v;
import android.net.Uri;
import d3.C13466a;

/* loaded from: classes.dex */
public final class t extends F {

    /* renamed from: r, reason: collision with root package name */
    private static final Object f155457r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static final a3.v f155458s = new v.c().e("SinglePeriodTimeline").i(Uri.EMPTY).a();

    /* renamed from: e, reason: collision with root package name */
    private final long f155459e;

    /* renamed from: f, reason: collision with root package name */
    private final long f155460f;

    /* renamed from: g, reason: collision with root package name */
    private final long f155461g;

    /* renamed from: h, reason: collision with root package name */
    private final long f155462h;

    /* renamed from: i, reason: collision with root package name */
    private final long f155463i;

    /* renamed from: j, reason: collision with root package name */
    private final long f155464j;

    /* renamed from: k, reason: collision with root package name */
    private final long f155465k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f155466l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f155467m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f155468n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f155469o;

    /* renamed from: p, reason: collision with root package name */
    private final a3.v f155470p;

    /* renamed from: q, reason: collision with root package name */
    private final v.g f155471q;

    public t(long j10, boolean z10, boolean z11, boolean z12, Object obj, a3.v vVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, vVar);
    }

    @Override // a3.F
    public F.b g(int i10, F.b bVar, boolean z10) {
        C13466a.c(i10, 0, 1);
        return bVar.t(null, z10 ? f155457r : null, 0, this.f155462h, -this.f155464j);
    }

    @Override // a3.F
    public int i() {
        return 1;
    }

    @Override // a3.F
    public Object m(int i10) {
        C13466a.c(i10, 0, 1);
        return f155457r;
    }

    @Override // a3.F
    public int p() {
        return 1;
    }

    public t(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, a3.v vVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, vVar, z12 ? vVar.f44014d : null);
    }

    @Override // a3.F
    public int b(Object obj) {
        return f155457r.equals(obj) ? 0 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a3.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a3.F.c o(int r25, a3.F.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            d3.C13466a.c(r3, r1, r2)
            long r1 = r0.f155465k
            boolean r14 = r0.f155467m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f155468n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f155463i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = a3.F.c.f43605q
            a3.v r5 = r0.f155470p
            java.lang.Object r6 = r0.f155469o
            long r7 = r0.f155459e
            long r9 = r0.f155460f
            long r11 = r0.f155461g
            boolean r13 = r0.f155466l
            a3.v$g r15 = r0.f155471q
            long r1 = r0.f155463i
            r21 = 0
            r18 = r1
            long r1 = r0.f155464j
            r20 = 0
            r3 = r26
            r22 = r1
            a3.F$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.t.o(int, a3.F$c, long):a3.F$c");
    }

    public t(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, a3.v vVar, v.g gVar) {
        this.f155459e = j10;
        this.f155460f = j11;
        this.f155461g = j12;
        this.f155462h = j13;
        this.f155463i = j14;
        this.f155464j = j15;
        this.f155465k = j16;
        this.f155466l = z10;
        this.f155467m = z11;
        this.f155468n = z12;
        this.f155469o = obj;
        this.f155470p = (a3.v) C13466a.e(vVar);
        this.f155471q = gVar;
    }
}
