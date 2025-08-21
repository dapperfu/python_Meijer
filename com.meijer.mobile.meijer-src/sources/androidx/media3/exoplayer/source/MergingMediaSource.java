package androidx.media3.exoplayer.source;

import Ee.Z;
import Ee.a0;
import a3.F;
import a3.v;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3.C16398f;
import p3.InterfaceC16397e;

/* loaded from: classes.dex */
public final class MergingMediaSource extends AbstractC6219c<Integer> {

    /* renamed from: w, reason: collision with root package name */
    private static final a3.v f56995w = new v.c().e("MergingMediaSource").a();

    /* renamed from: k, reason: collision with root package name */
    private final boolean f56996k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f56997l;

    /* renamed from: m, reason: collision with root package name */
    private final r[] f56998m;

    /* renamed from: n, reason: collision with root package name */
    private final List<List<c>> f56999n;

    /* renamed from: o, reason: collision with root package name */
    private final a3.F[] f57000o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<r> f57001p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC16397e f57002q;

    /* renamed from: r, reason: collision with root package name */
    private final Map<Object, Long> f57003r;

    /* renamed from: s, reason: collision with root package name */
    private final Z<Object, C6218b> f57004s;

    /* renamed from: t, reason: collision with root package name */
    private int f57005t;

    /* renamed from: u, reason: collision with root package name */
    private long[][] f57006u;

    /* renamed from: v, reason: collision with root package name */
    private IllegalMergeException f57007v;

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final r.b f57011a;

        /* renamed from: b, reason: collision with root package name */
        private final q f57012b;

        private c(r.b bVar, q qVar) {
            this.f57011a = bVar;
            this.f57012b = qVar;
        }
    }

    public MergingMediaSource(r... rVarArr) {
        this(false, rVarArr);
    }

    public static final class IllegalMergeException extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f57008a;

        public IllegalMergeException(int i10) {
            this.f57008a = i10;
        }
    }

    private static final class b extends m {

        /* renamed from: f, reason: collision with root package name */
        private final long[] f57009f;

        /* renamed from: g, reason: collision with root package name */
        private final long[] f57010g;

        public b(a3.F f10, Map<Object, Long> map) {
            super(f10);
            int iP = f10.p();
            this.f57010g = new long[f10.p()];
            F.c cVar = new F.c();
            for (int i10 = 0; i10 < iP; i10++) {
                this.f57010g[i10] = f10.n(i10, cVar).f44445m;
            }
            int i11 = f10.i();
            this.f57009f = new long[i11];
            F.b bVar = new F.b();
            for (int i12 = 0; i12 < i11; i12++) {
                f10.g(i12, bVar, true);
                long jLongValue = ((Long) C13599a.e(map.get(bVar.f44411b))).longValue();
                long[] jArr = this.f57009f;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f44413d : jLongValue;
                jArr[i12] = jLongValue;
                long j10 = bVar.f44413d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f57010g;
                    int i13 = bVar.f44412c;
                    jArr2[i13] = jArr2[i13] - (j10 - jLongValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.b g(int i10, F.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f44413d = this.f57009f[i10];
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // androidx.media3.exoplayer.source.m, a3.F
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a3.F.c o(int r5, a3.F.c r6, long r7) {
            /*
                r4 = this;
                super.o(r5, r6, r7)
                long[] r7 = r4.f57010g
                r0 = r7[r5]
                r6.f44445m = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f44444l
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f44444l
            L20:
                r6.f44444l = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.MergingMediaSource.b.o(int, a3.F$c, long):a3.F$c");
        }
    }

    public MergingMediaSource(boolean z10, r... rVarArr) {
        this(z10, false, rVarArr);
    }

    private void I() {
        F.b bVar = new F.b();
        for (int i10 = 0; i10 < this.f57005t; i10++) {
            long j10 = -this.f57000o[0].f(i10, bVar).o();
            int i11 = 1;
            while (true) {
                a3.F[] fArr = this.f57000o;
                if (i11 < fArr.length) {
                    this.f57006u[i10][i11] = j10 - (-fArr[i11].f(i10, bVar).o());
                    i11++;
                }
            }
        }
    }

    private void L() {
        a3.F[] fArr;
        F.b bVar = new F.b();
        for (int i10 = 0; i10 < this.f57005t; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                fArr = this.f57000o;
                if (i11 >= fArr.length) {
                    break;
                }
                long jK = fArr[i11].f(i10, bVar).k();
                if (jK != -9223372036854775807L) {
                    long j11 = jK + this.f57006u[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object objM = fArr[0].m(i10);
            this.f57003r.put(objM, Long.valueOf(j10));
            Iterator<C6218b> it = this.f57004s.get(objM).iterator();
            while (it.hasNext()) {
                it.next().v(0L, j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC6219c
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public r.b C(Integer num, r.b bVar) {
        List<c> list = this.f56999n.get(num.intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f57011a.equals(bVar)) {
                return this.f56999n.get(0).get(i10).f57011a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC6219c
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void F(Integer num, r rVar, a3.F f10) {
        if (this.f57007v != null) {
            return;
        }
        if (this.f57005t == -1) {
            this.f57005t = f10.i();
        } else if (f10.i() != this.f57005t) {
            this.f57007v = new IllegalMergeException(0);
            return;
        }
        if (this.f57006u.length == 0) {
            this.f57006u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f57005t, this.f57000o.length);
        }
        this.f57001p.remove(rVar);
        this.f57000o[num.intValue()] = f10;
        if (this.f57001p.isEmpty()) {
            if (this.f56996k) {
                I();
            }
            a3.F bVar = this.f57000o[0];
            if (this.f56997l) {
                L();
                bVar = new b(bVar, this.f57003r);
            }
            z(bVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public void c(a3.v vVar) {
        this.f56998m[0].c(vVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public a3.v e() {
        r[] rVarArr = this.f56998m;
        return rVarArr.length > 0 ? rVarArr[0].e() : f56995w;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        if (this.f56997l) {
            C6218b c6218b = (C6218b) qVar;
            Iterator<Map.Entry<Object, C6218b>> it = this.f57004s.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, C6218b> next = it.next();
                if (next.getValue().equals(c6218b)) {
                    this.f57004s.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            qVar = c6218b.f57059a;
        }
        v vVar = (v) qVar;
        for (int i10 = 0; i10 < this.f56998m.length; i10++) {
            List<c> list = this.f56999n.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (list.get(i11).f57012b.equals(qVar)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            this.f56998m[i10].h(vVar.m(i10));
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        int length = this.f56998m.length;
        q[] qVarArr = new q[length];
        int iB = this.f57000o[0].b(bVar.f57157a);
        for (int i10 = 0; i10 < length; i10++) {
            r.b bVarA = bVar.a(this.f57000o[i10].m(iB));
            qVarArr[i10] = this.f56998m[i10].j(bVarA, bVar2, j10 - this.f57006u[iB][i10]);
            this.f56999n.get(i10).add(new c(bVarA, qVarArr[i10]));
        }
        v vVar = new v(this.f57002q, this.f57006u[iB], qVarArr);
        if (!this.f56997l) {
            return vVar;
        }
        C6218b c6218b = new C6218b(vVar, false, 0L, ((Long) C13599a.e(this.f57003r.get(bVar.f57157a))).longValue());
        this.f57004s.put(bVar.f57157a, c6218b);
        return c6218b;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6219c, androidx.media3.exoplayer.source.r
    public void m() throws IOException {
        IllegalMergeException illegalMergeException = this.f57007v;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.m();
    }

    public MergingMediaSource(boolean z10, boolean z11, r... rVarArr) {
        this(z10, z11, new C16398f(), rVarArr);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6219c, androidx.media3.exoplayer.source.AbstractC6217a
    protected void A() {
        super.A();
        Arrays.fill(this.f57000o, (Object) null);
        this.f57005t = -1;
        this.f57007v = null;
        this.f57001p.clear();
        Collections.addAll(this.f57001p, this.f56998m);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6219c, androidx.media3.exoplayer.source.AbstractC6217a
    protected void y(f3.o oVar) {
        super.y(oVar);
        for (int i10 = 0; i10 < this.f56998m.length; i10++) {
            G(Integer.valueOf(i10), this.f56998m[i10]);
        }
    }

    public MergingMediaSource(boolean z10, boolean z11, InterfaceC16397e interfaceC16397e, r... rVarArr) {
        this.f56996k = z10;
        this.f56997l = z11;
        this.f56998m = rVarArr;
        this.f57002q = interfaceC16397e;
        this.f57001p = new ArrayList<>(Arrays.asList(rVarArr));
        this.f57005t = -1;
        this.f56999n = new ArrayList(rVarArr.length);
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            this.f56999n.add(new ArrayList());
        }
        this.f57000o = new a3.F[rVarArr.length];
        this.f57006u = new long[0][];
        this.f57003r = new HashMap();
        this.f57004s = a0.a().a().e();
    }
}
