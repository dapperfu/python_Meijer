package a3;

import a3.v;
import android.net.Uri;
import d3.C13599a;
import d3.P;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5645b {

    /* renamed from: g, reason: collision with root package name */
    public static final C5645b f44595g = new C5645b(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h, reason: collision with root package name */
    private static final a f44596h = new a(0).h(0);

    /* renamed from: i, reason: collision with root package name */
    private static final String f44597i = P.y0(1);

    /* renamed from: j, reason: collision with root package name */
    private static final String f44598j = P.y0(2);

    /* renamed from: k, reason: collision with root package name */
    private static final String f44599k = P.y0(3);

    /* renamed from: l, reason: collision with root package name */
    private static final String f44600l = P.y0(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f44601a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44602b;

    /* renamed from: c, reason: collision with root package name */
    public final long f44603c;

    /* renamed from: d, reason: collision with root package name */
    public final long f44604d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44605e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f44606f;

    /* renamed from: a3.b$a */
    public static final class a {

        /* renamed from: l, reason: collision with root package name */
        private static final String f44607l = P.y0(0);

        /* renamed from: m, reason: collision with root package name */
        private static final String f44608m = P.y0(1);

        /* renamed from: n, reason: collision with root package name */
        private static final String f44609n = P.y0(2);

        /* renamed from: o, reason: collision with root package name */
        private static final String f44610o = P.y0(3);

        /* renamed from: p, reason: collision with root package name */
        private static final String f44611p = P.y0(4);

        /* renamed from: q, reason: collision with root package name */
        private static final String f44612q = P.y0(5);

        /* renamed from: r, reason: collision with root package name */
        private static final String f44613r = P.y0(6);

        /* renamed from: s, reason: collision with root package name */
        private static final String f44614s = P.y0(7);

        /* renamed from: t, reason: collision with root package name */
        static final String f44615t = P.y0(8);

        /* renamed from: u, reason: collision with root package name */
        static final String f44616u = P.y0(9);

        /* renamed from: v, reason: collision with root package name */
        static final String f44617v = P.y0(10);

        /* renamed from: a, reason: collision with root package name */
        public final long f44618a;

        /* renamed from: b, reason: collision with root package name */
        public final int f44619b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44620c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final Uri[] f44621d;

        /* renamed from: e, reason: collision with root package name */
        public final v[] f44622e;

        /* renamed from: f, reason: collision with root package name */
        public final int[] f44623f;

        /* renamed from: g, reason: collision with root package name */
        public final long[] f44624g;

        /* renamed from: h, reason: collision with root package name */
        public final String[] f44625h;

        /* renamed from: i, reason: collision with root package name */
        public final long f44626i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f44627j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f44628k;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new v[0], new long[0], 0L, false, new String[0], false);
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static int[] b(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f44623f;
                if (i12 >= iArr.length || this.f44627j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f44618a == aVar.f44618a && this.f44619b == aVar.f44619b && this.f44620c == aVar.f44620c && Arrays.equals(this.f44622e, aVar.f44622e) && Arrays.equals(this.f44623f, aVar.f44623f) && Arrays.equals(this.f44624g, aVar.f44624g) && this.f44626i == aVar.f44626i && this.f44627j == aVar.f44627j && Arrays.equals(this.f44625h, aVar.f44625h) && this.f44628k == aVar.f44628k) {
                    return true;
                }
            }
            return false;
        }

        public a i(long[] jArr) {
            int length = jArr.length;
            v[] vVarArr = this.f44622e;
            if (length < vVarArr.length) {
                jArr = a(jArr, vVarArr.length);
            } else if (this.f44619b != -1 && jArr.length > vVarArr.length) {
                jArr = Arrays.copyOf(jArr, vVarArr.length);
            }
            return new a(this.f44618a, this.f44619b, this.f44620c, this.f44623f, this.f44622e, jArr, this.f44626i, this.f44627j, this.f44625h, this.f44628k);
        }

        private a(long j10, int i10, int i11, int[] iArr, v[] vVarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
            int i12 = 0;
            C13599a.a(iArr.length == vVarArr.length);
            this.f44618a = j10;
            this.f44619b = i10;
            this.f44620c = i11;
            this.f44623f = iArr;
            this.f44622e = vVarArr;
            this.f44624g = jArr;
            this.f44626i = j11;
            this.f44627j = z10;
            this.f44621d = new Uri[vVarArr.length];
            while (true) {
                Uri[] uriArr = this.f44621d;
                if (i12 >= uriArr.length) {
                    this.f44625h = strArr;
                    this.f44628k = z11;
                    return;
                } else {
                    v vVar = vVarArr[i12];
                    uriArr[i12] = vVar == null ? null : ((v.h) C13599a.e(vVar.f44830b)).f44928a;
                    i12++;
                }
            }
        }

        public boolean e() {
            if (this.f44619b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f44619b; i10++) {
                int i11 = this.f44623f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f44628k && this.f44618a == Long.MIN_VALUE && this.f44619b == -1;
        }

        public boolean g() {
            return this.f44619b == -1 || c() < this.f44619b;
        }

        public a h(int i10) {
            int[] iArrB = b(this.f44623f, i10);
            long[] jArrA = a(this.f44624g, i10);
            return new a(this.f44618a, i10, this.f44620c, iArrB, (v[]) Arrays.copyOf(this.f44622e, i10), jArrA, this.f44626i, this.f44627j, (String[]) Arrays.copyOf(this.f44625h, i10), this.f44628k);
        }

        public int hashCode() {
            int i10 = ((this.f44619b * 31) + this.f44620c) * 31;
            long j10 = this.f44618a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f44622e)) * 31) + Arrays.hashCode(this.f44623f)) * 31) + Arrays.hashCode(this.f44624g)) * 31;
            long j11 = this.f44626i;
            return ((((((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f44627j ? 1 : 0)) * 31) + Arrays.hashCode(this.f44625h)) * 31) + (this.f44628k ? 1 : 0);
        }

        public a j(v vVar, int i10) {
            int[] iArrB = b(this.f44623f, i10 + 1);
            long[] jArrA = this.f44624g;
            if (jArrA.length != iArrB.length) {
                jArrA = a(jArrA, iArrB.length);
            }
            long[] jArr = jArrA;
            v[] vVarArr = (v[]) Arrays.copyOf(this.f44622e, iArrB.length);
            vVarArr[i10] = vVar;
            iArrB[i10] = 1;
            String[] strArr = this.f44625h;
            if (strArr.length != iArrB.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrB.length);
            }
            return new a(this.f44618a, this.f44619b, this.f44620c, iArrB, vVarArr, jArr, this.f44626i, this.f44627j, strArr, this.f44628k);
        }

        public a k(int i10, int i11) {
            int i12 = this.f44619b;
            C13599a.a(i12 == -1 || i11 < i12);
            int[] iArrB = b(this.f44623f, i11 + 1);
            int i13 = iArrB[i11];
            C13599a.a(i13 == 0 || i13 == 1 || i13 == i10);
            long[] jArrA = this.f44624g;
            if (jArrA.length != iArrB.length) {
                jArrA = a(jArrA, iArrB.length);
            }
            long[] jArr = jArrA;
            v[] vVarArr = this.f44622e;
            if (vVarArr.length != iArrB.length) {
                vVarArr = (v[]) Arrays.copyOf(vVarArr, iArrB.length);
            }
            v[] vVarArr2 = vVarArr;
            String[] strArr = this.f44625h;
            if (strArr.length != iArrB.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrB.length);
            }
            String[] strArr2 = strArr;
            iArrB[i11] = i10;
            return new a(this.f44618a, this.f44619b, this.f44620c, iArrB, vVarArr2, jArr, this.f44626i, this.f44627j, strArr2, this.f44628k);
        }

        public a l() {
            if (this.f44619b == -1) {
                return new a(this.f44618a, 0, this.f44620c, new int[0], new v[0], new long[0], this.f44626i, this.f44627j, this.f44625h, this.f44628k);
            }
            int[] iArr = this.f44623f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    iArrCopyOf[i10] = 2;
                }
            }
            return new a(this.f44618a, length, this.f44620c, iArrCopyOf, this.f44622e, this.f44624g, this.f44626i, this.f44627j, this.f44625h, this.f44628k);
        }
    }

    public C5645b(Object obj, long... jArr) {
        this(obj, a(jArr), 0L, -9223372036854775807L, 0);
    }

    private static a[] a(long[] jArr) {
        int length = jArr.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = new a(jArr[i10]);
        }
        return aVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5645b.class == obj.getClass()) {
            C5645b c5645b = (C5645b) obj;
            if (Objects.equals(this.f44601a, c5645b.f44601a) && this.f44602b == c5645b.f44602b && this.f44603c == c5645b.f44603c && this.f44604d == c5645b.f44604d && this.f44605e == c5645b.f44605e && Arrays.equals(this.f44606f, c5645b.f44606f)) {
                return true;
            }
        }
        return false;
    }

    private boolean h(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        a aVarC = c(i10);
        long j12 = aVarC.f44618a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || aVarC.f() || j10 < j11 : j10 < j12;
    }

    public boolean b() {
        int i10 = this.f44602b - 1;
        return i10 >= 0 && g(i10);
    }

    public a c(int i10) {
        int i11 = this.f44605e;
        return i10 < i11 ? f44596h : this.f44606f[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = this.f44605e;
            while (i10 < this.f44602b && ((c(i10).f44618a != Long.MIN_VALUE && c(i10).f44618a <= j10) || !c(i10).g())) {
                i10++;
            }
            if (i10 < this.f44602b) {
                return i10;
            }
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f44602b - 1;
        int i11 = i10 - (g(i10) ? 1 : 0);
        while (i11 >= 0) {
            long j12 = j10;
            long j13 = j11;
            if (!h(j12, j13, i11)) {
                break;
            }
            i11--;
            j10 = j12;
            j11 = j13;
        }
        if (i11 < 0 || !c(i11).e()) {
            return -1;
        }
        return i11;
    }

    public boolean f(int i10, int i11) {
        a aVarC;
        int i12;
        return i10 < this.f44602b && (i12 = (aVarC = c(i10)).f44619b) != -1 && i11 < i12 && aVarC.f44623f[i11] == 4;
    }

    public boolean g(int i10) {
        return i10 == this.f44602b - 1 && c(i10).f();
    }

    public int hashCode() {
        int i10 = this.f44602b * 31;
        Object obj = this.f44601a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f44603c)) * 31) + ((int) this.f44604d)) * 31) + this.f44605e) * 31) + Arrays.hashCode(this.f44606f);
    }

    public C5645b i(int i10, int i11) {
        C13599a.a(i11 > 0);
        int i12 = i10 - this.f44605e;
        a[] aVarArr = this.f44606f;
        if (aVarArr[i12].f44619b == i11) {
            return this;
        }
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        aVarArr2[i12] = this.f44606f[i12].h(i11);
        return new C5645b(this.f44601a, aVarArr2, this.f44603c, this.f44604d, this.f44605e);
    }

    public C5645b j(long[][] jArr) {
        C13599a.g(this.f44605e == 0);
        a[] aVarArr = this.f44606f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        for (int i10 = 0; i10 < this.f44602b; i10++) {
            aVarArr2[i10] = aVarArr2[i10].i(jArr[i10]);
        }
        return new C5645b(this.f44601a, aVarArr2, this.f44603c, this.f44604d, this.f44605e);
    }

    public C5645b k(int i10, int i11) {
        int i12 = i10 - this.f44605e;
        a[] aVarArr = this.f44606f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].k(4, i11);
        return new C5645b(this.f44601a, aVarArr2, this.f44603c, this.f44604d, this.f44605e);
    }

    public C5645b l(long j10) {
        return this.f44603c == j10 ? this : new C5645b(this.f44601a, this.f44606f, j10, this.f44604d, this.f44605e);
    }

    public C5645b m(int i10, int i11, v vVar) {
        v.h hVar;
        int i12 = i10 - this.f44605e;
        a[] aVarArr = this.f44606f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        C13599a.g(aVarArr2[i12].f44627j || !((hVar = vVar.f44830b) == null || hVar.f44928a.equals(Uri.EMPTY)));
        aVarArr2[i12] = aVarArr2[i12].j(vVar, i11);
        return new C5645b(this.f44601a, aVarArr2, this.f44603c, this.f44604d, this.f44605e);
    }

    public C5645b n(long j10) {
        return this.f44604d == j10 ? this : new C5645b(this.f44601a, this.f44606f, this.f44603c, j10, this.f44605e);
    }

    public C5645b o(int i10, int i11) {
        int i12 = i10 - this.f44605e;
        a[] aVarArr = this.f44606f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].k(3, i11);
        return new C5645b(this.f44601a, aVarArr2, this.f44603c, this.f44604d, this.f44605e);
    }

    public C5645b p(int i10, int i11) {
        int i12 = i10 - this.f44605e;
        a[] aVarArr = this.f44606f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].k(2, i11);
        return new C5645b(this.f44601a, aVarArr2, this.f44603c, this.f44604d, this.f44605e);
    }

    public C5645b q(int i10) {
        int i11 = i10 - this.f44605e;
        a[] aVarArr = this.f44606f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].l();
        return new C5645b(this.f44601a, aVarArr2, this.f44603c, this.f44604d, this.f44605e);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f44601a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f44603c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f44606f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f44606f[i10].f44618a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f44606f[i10].f44623f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f44606f[i10].f44623f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f44606f[i10].f44624g[i11]);
                sb2.append(')');
                if (i11 < this.f44606f[i10].f44623f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f44606f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    private C5645b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f44601a = obj;
        this.f44603c = j10;
        this.f44604d = j11;
        this.f44602b = aVarArr.length + i10;
        this.f44606f = aVarArr;
        this.f44605e = i10;
    }
}
