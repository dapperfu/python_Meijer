package s3;

import Ee.L;
import Ee.Z;
import Ee.a0;
import a3.G;
import d3.InterfaceC13606h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s3.y;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17000a extends AbstractC17002c {

    /* renamed from: i, reason: collision with root package name */
    private final t3.d f159758i;

    /* renamed from: j, reason: collision with root package name */
    private final long f159759j;

    /* renamed from: k, reason: collision with root package name */
    private final long f159760k;

    /* renamed from: l, reason: collision with root package name */
    private final long f159761l;

    /* renamed from: m, reason: collision with root package name */
    private final int f159762m;

    /* renamed from: n, reason: collision with root package name */
    private final int f159763n;

    /* renamed from: o, reason: collision with root package name */
    private final float f159764o;

    /* renamed from: p, reason: collision with root package name */
    private final float f159765p;

    /* renamed from: q, reason: collision with root package name */
    private final L<C2491a> f159766q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC13606h f159767r;

    /* renamed from: s, reason: collision with root package name */
    private float f159768s;

    /* renamed from: t, reason: collision with root package name */
    private int f159769t;

    /* renamed from: u, reason: collision with root package name */
    private int f159770u;

    /* renamed from: v, reason: collision with root package name */
    private long f159771v;

    /* renamed from: w, reason: collision with root package name */
    private long f159772w;

    /* renamed from: s3.a$a, reason: collision with other inner class name */
    public static final class C2491a {

        /* renamed from: a, reason: collision with root package name */
        public final long f159773a;

        /* renamed from: b, reason: collision with root package name */
        public final long f159774b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2491a)) {
                return false;
            }
            C2491a c2491a = (C2491a) obj;
            return this.f159773a == c2491a.f159773a && this.f159774b == c2491a.f159774b;
        }

        public int hashCode() {
            return (((int) this.f159773a) * 31) + ((int) this.f159774b);
        }

        public C2491a(long j10, long j11) {
            this.f159773a = j10;
            this.f159774b = j11;
        }
    }

    /* renamed from: s3.a$b */
    public static class b implements y.b {

        /* renamed from: a, reason: collision with root package name */
        private final int f159775a;

        /* renamed from: b, reason: collision with root package name */
        private final int f159776b;

        /* renamed from: c, reason: collision with root package name */
        private final int f159777c;

        /* renamed from: d, reason: collision with root package name */
        private final int f159778d;

        /* renamed from: e, reason: collision with root package name */
        private final int f159779e;

        /* renamed from: f, reason: collision with root package name */
        private final float f159780f;

        /* renamed from: g, reason: collision with root package name */
        private final float f159781g;

        /* renamed from: h, reason: collision with root package name */
        private final InterfaceC13606h f159782h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, InterfaceC13606h.f127918a);
        }

        protected C17000a b(G g10, int[] iArr, int i10, t3.d dVar, L<C2491a> l10) {
            return new C17000a(g10, iArr, i10, dVar, this.f159775a, this.f159776b, this.f159777c, this.f159778d, this.f159779e, this.f159780f, this.f159781g, l10, this.f159782h);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, InterfaceC13606h interfaceC13606h) {
            this.f159775a = i10;
            this.f159776b = i11;
            this.f159777c = i12;
            this.f159778d = i13;
            this.f159779e = i14;
            this.f159780f = f10;
            this.f159781g = f11;
            this.f159782h = interfaceC13606h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // s3.y.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final s3.y[] a(s3.y.a[] r10, t3.d r11, androidx.media3.exoplayer.source.r.b r12, a3.F r13) {
            /*
                r9 = this;
                Ee.L r12 = s3.C17000a.m(r10)
                int r13 = r10.length
                s3.y[] r13 = new s3.y[r13]
                r0 = 0
                r1 = r0
            L9:
                int r2 = r10.length
                if (r1 >= r2) goto L40
                r2 = r10[r1]
                if (r2 == 0) goto L15
                int[] r5 = r2.f159935b
                int r3 = r5.length
                if (r3 != 0) goto L17
            L15:
                r7 = r11
                goto L3c
            L17:
                int r3 = r5.length
                r4 = 1
                if (r3 != r4) goto L28
                s3.z r3 = new s3.z
                a3.G r4 = r2.f159934a
                r5 = r5[r0]
                int r2 = r2.f159936c
                r3.<init>(r4, r5, r2)
                r7 = r11
                goto L3a
            L28:
                a3.G r4 = r2.f159934a
                int r6 = r2.f159936c
                java.lang.Object r2 = r12.get(r1)
                r8 = r2
                Ee.L r8 = (Ee.L) r8
                r3 = r9
                r7 = r11
                s3.a r11 = r3.b(r4, r5, r6, r7, r8)
                r3 = r11
            L3a:
                r13[r1] = r3
            L3c:
                int r1 = r1 + 1
                r11 = r7
                goto L9
            L40:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.C17000a.b.a(s3.y$a[], t3.d, androidx.media3.exoplayer.source.r$b, a3.F):s3.y[]");
        }
    }

    private static long[][] p(y.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            y.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f159935b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f159935b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f159934a.a(iArr[i11]).f44762j;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    @Override // s3.AbstractC17002c, s3.y
    public void disable() {
    }

    private static void n(List<L.a<C2491a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            L.a<C2491a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C2491a(j10, jArr[i10]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static L<L<C2491a>> o(y.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (y.a aVar : aVarArr) {
            if (aVar == null || aVar.f159935b.length <= 1) {
                arrayList.add(null);
            } else {
                L.a aVarP = L.p();
                aVarP.a(new C2491a(0L, 0L));
                arrayList.add(aVarP);
            }
        }
        long[][] jArrP = p(aVarArr);
        int[] iArr = new int[jArrP.length];
        long[] jArr = new long[jArrP.length];
        for (int i10 = 0; i10 < jArrP.length; i10++) {
            long[] jArr2 = jArrP[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        n(arrayList, jArr);
        L<Integer> lQ = q(jArrP);
        for (int i11 = 0; i11 < lQ.size(); i11++) {
            int iIntValue = lQ.get(i11).intValue();
            int i12 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i12;
            jArr[iIntValue] = jArrP[iIntValue][i12];
            n(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        n(arrayList, jArr);
        L.a aVarP2 = L.p();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            L.a aVar2 = (L.a) arrayList.get(i14);
            aVarP2.a(aVar2 == null ? L.x() : aVar2.k());
        }
        return aVarP2.k();
    }

    @Override // s3.y
    public int b() {
        return this.f159769t;
    }

    @Override // s3.AbstractC17002c, s3.y
    public void d(float f10) {
        this.f159768s = f10;
    }

    protected C17000a(G g10, int[] iArr, int i10, t3.d dVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C2491a> list, InterfaceC13606h interfaceC13606h) {
        long j13;
        super(g10, iArr, i10);
        if (j12 < j10) {
            d3.r.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j10;
        } else {
            j13 = j12;
        }
        this.f159758i = dVar;
        this.f159759j = j10 * 1000;
        this.f159760k = j11 * 1000;
        this.f159761l = j13 * 1000;
        this.f159762m = i11;
        this.f159763n = i12;
        this.f159764o = f10;
        this.f159765p = f11;
        this.f159766q = L.s(list);
        this.f159767r = interfaceC13606h;
        this.f159768s = 1.0f;
        this.f159770u = 0;
        this.f159771v = -9223372036854775807L;
        this.f159772w = -2147483647L;
    }

    private static L<Integer> q(long[][] jArr) {
        double d10;
        Z zE = a0.c().a().e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double dLog = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i11] = dLog;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    double d13 = (d12 + dArr[i13]) * 0.5d;
                    if (d11 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = (d13 - dArr[0]) / d11;
                    }
                    zE.put(Double.valueOf(d10), Integer.valueOf(i10));
                }
            }
        }
        return L.s(zE.values());
    }

    @Override // s3.AbstractC17002c, s3.y
    public void enable() {
        this.f159771v = -9223372036854775807L;
    }
}
