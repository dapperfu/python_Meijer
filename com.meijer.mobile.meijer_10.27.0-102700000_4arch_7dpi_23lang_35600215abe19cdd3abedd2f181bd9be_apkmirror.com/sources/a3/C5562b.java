package a3;

import a3.v;
import android.net.Uri;
import d3.C13466a;
import d3.P;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5562b {

    /* renamed from: g, reason: collision with root package name */
    public static final C5562b f43777g = new C5562b(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h, reason: collision with root package name */
    private static final a f43778h = new a(0).h(0);

    /* renamed from: i, reason: collision with root package name */
    private static final String f43779i = P.y0(1);

    /* renamed from: j, reason: collision with root package name */
    private static final String f43780j = P.y0(2);

    /* renamed from: k, reason: collision with root package name */
    private static final String f43781k = P.y0(3);

    /* renamed from: l, reason: collision with root package name */
    private static final String f43782l = P.y0(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f43783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43784b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43785c;

    /* renamed from: d, reason: collision with root package name */
    public final long f43786d;

    /* renamed from: e, reason: collision with root package name */
    public final int f43787e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f43788f;

    /* renamed from: a3.b$a */
    public static final class a {

        /* renamed from: l, reason: collision with root package name */
        private static final String f43789l = P.y0(0);

        /* renamed from: m, reason: collision with root package name */
        private static final String f43790m = P.y0(1);

        /* renamed from: n, reason: collision with root package name */
        private static final String f43791n = P.y0(2);

        /* renamed from: o, reason: collision with root package name */
        private static final String f43792o = P.y0(3);

        /* renamed from: p, reason: collision with root package name */
        private static final String f43793p = P.y0(4);

        /* renamed from: q, reason: collision with root package name */
        private static final String f43794q = P.y0(5);

        /* renamed from: r, reason: collision with root package name */
        private static final String f43795r = P.y0(6);

        /* renamed from: s, reason: collision with root package name */
        private static final String f43796s = P.y0(7);

        /* renamed from: t, reason: collision with root package name */
        static final String f43797t = P.y0(8);

        /* renamed from: u, reason: collision with root package name */
        static final String f43798u = P.y0(9);

        /* renamed from: v, reason: collision with root package name */
        static final String f43799v = P.y0(10);

        /* renamed from: a, reason: collision with root package name */
        public final long f43800a;

        /* renamed from: b, reason: collision with root package name */
        public final int f43801b;

        /* renamed from: c, reason: collision with root package name */
        public final int f43802c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final Uri[] f43803d;

        /* renamed from: e, reason: collision with root package name */
        public final v[] f43804e;

        /* renamed from: f, reason: collision with root package name */
        public final int[] f43805f;

        /* renamed from: g, reason: collision with root package name */
        public final long[] f43806g;

        /* renamed from: h, reason: collision with root package name */
        public final String[] f43807h;

        /* renamed from: i, reason: collision with root package name */
        public final long f43808i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f43809j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f43810k;

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
                int[] iArr = this.f43805f;
                if (i12 >= iArr.length || this.f43809j || (i11 = iArr[i12]) == 0 || i11 == 1) {
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
                if (this.f43800a == aVar.f43800a && this.f43801b == aVar.f43801b && this.f43802c == aVar.f43802c && Arrays.equals(this.f43804e, aVar.f43804e) && Arrays.equals(this.f43805f, aVar.f43805f) && Arrays.equals(this.f43806g, aVar.f43806g) && this.f43808i == aVar.f43808i && this.f43809j == aVar.f43809j && Arrays.equals(this.f43807h, aVar.f43807h) && this.f43810k == aVar.f43810k) {
                    return true;
                }
            }
            return false;
        }

        public a i(long[] jArr) {
            int length = jArr.length;
            v[] vVarArr = this.f43804e;
            if (length < vVarArr.length) {
                jArr = a(jArr, vVarArr.length);
            } else if (this.f43801b != -1 && jArr.length > vVarArr.length) {
                jArr = Arrays.copyOf(jArr, vVarArr.length);
            }
            return new a(this.f43800a, this.f43801b, this.f43802c, this.f43805f, this.f43804e, jArr, this.f43808i, this.f43809j, this.f43807h, this.f43810k);
        }

        private a(long j10, int i10, int i11, int[] iArr, v[] vVarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
            int i12 = 0;
            C13466a.a(iArr.length == vVarArr.length);
            this.f43800a = j10;
            this.f43801b = i10;
            this.f43802c = i11;
            this.f43805f = iArr;
            this.f43804e = vVarArr;
            this.f43806g = jArr;
            this.f43808i = j11;
            this.f43809j = z10;
            this.f43803d = new Uri[vVarArr.length];
            while (true) {
                Uri[] uriArr = this.f43803d;
                if (i12 >= uriArr.length) {
                    this.f43807h = strArr;
                    this.f43810k = z11;
                    return;
                } else {
                    v vVar = vVarArr[i12];
                    uriArr[i12] = vVar == null ? null : ((v.h) C13466a.e(vVar.f44012b)).f44110a;
                    i12++;
                }
            }
        }

        public boolean e() {
            if (this.f43801b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f43801b; i10++) {
                int i11 = this.f43805f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f43810k && this.f43800a == Long.MIN_VALUE && this.f43801b == -1;
        }

        public boolean g() {
            return this.f43801b == -1 || c() < this.f43801b;
        }

        public a h(int i10) {
            int[] iArrB = b(this.f43805f, i10);
            long[] jArrA = a(this.f43806g, i10);
            return new a(this.f43800a, i10, this.f43802c, iArrB, (v[]) Arrays.copyOf(this.f43804e, i10), jArrA, this.f43808i, this.f43809j, (String[]) Arrays.copyOf(this.f43807h, i10), this.f43810k);
        }

        public int hashCode() {
            int i10 = ((this.f43801b * 31) + this.f43802c) * 31;
            long j10 = this.f43800a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f43804e)) * 31) + Arrays.hashCode(this.f43805f)) * 31) + Arrays.hashCode(this.f43806g)) * 31;
            long j11 = this.f43808i;
            return ((((((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f43809j ? 1 : 0)) * 31) + Arrays.hashCode(this.f43807h)) * 31) + (this.f43810k ? 1 : 0);
        }

        public a j(v vVar, int i10) {
            int[] iArrB = b(this.f43805f, i10 + 1);
            long[] jArrA = this.f43806g;
            if (jArrA.length != iArrB.length) {
                jArrA = a(jArrA, iArrB.length);
            }
            long[] jArr = jArrA;
            v[] vVarArr = (v[]) Arrays.copyOf(this.f43804e, iArrB.length);
            vVarArr[i10] = vVar;
            iArrB[i10] = 1;
            String[] strArr = this.f43807h;
            if (strArr.length != iArrB.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrB.length);
            }
            return new a(this.f43800a, this.f43801b, this.f43802c, iArrB, vVarArr, jArr, this.f43808i, this.f43809j, strArr, this.f43810k);
        }

        public a k(int i10, int i11) {
            int i12 = this.f43801b;
            C13466a.a(i12 == -1 || i11 < i12);
            int[] iArrB = b(this.f43805f, i11 + 1);
            int i13 = iArrB[i11];
            C13466a.a(i13 == 0 || i13 == 1 || i13 == i10);
            long[] jArrA = this.f43806g;
            if (jArrA.length != iArrB.length) {
                jArrA = a(jArrA, iArrB.length);
            }
            long[] jArr = jArrA;
            v[] vVarArr = this.f43804e;
            if (vVarArr.length != iArrB.length) {
                vVarArr = (v[]) Arrays.copyOf(vVarArr, iArrB.length);
            }
            v[] vVarArr2 = vVarArr;
            String[] strArr = this.f43807h;
            if (strArr.length != iArrB.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrB.length);
            }
            String[] strArr2 = strArr;
            iArrB[i11] = i10;
            return new a(this.f43800a, this.f43801b, this.f43802c, iArrB, vVarArr2, jArr, this.f43808i, this.f43809j, strArr2, this.f43810k);
        }

        public a l() {
            if (this.f43801b == -1) {
                return new a(this.f43800a, 0, this.f43802c, new int[0], new v[0], new long[0], this.f43808i, this.f43809j, this.f43807h, this.f43810k);
            }
            int[] iArr = this.f43805f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    iArrCopyOf[i10] = 2;
                }
            }
            return new a(this.f43800a, length, this.f43802c, iArrCopyOf, this.f43804e, this.f43806g, this.f43808i, this.f43809j, this.f43807h, this.f43810k);
        }
    }

    public C5562b(Object obj, long... jArr) {
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
        if (obj != null && C5562b.class == obj.getClass()) {
            C5562b c5562b = (C5562b) obj;
            if (Objects.equals(this.f43783a, c5562b.f43783a) && this.f43784b == c5562b.f43784b && this.f43785c == c5562b.f43785c && this.f43786d == c5562b.f43786d && this.f43787e == c5562b.f43787e && Arrays.equals(this.f43788f, c5562b.f43788f)) {
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
        long j12 = aVarC.f43800a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || aVarC.f() || j10 < j11 : j10 < j12;
    }

    public boolean b() {
        int i10 = this.f43784b - 1;
        return i10 >= 0 && g(i10);
    }

    public a c(int i10) {
        int i11 = this.f43787e;
        return i10 < i11 ? f43778h : this.f43788f[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = this.f43787e;
            while (i10 < this.f43784b && ((c(i10).f43800a != Long.MIN_VALUE && c(i10).f43800a <= j10) || !c(i10).g())) {
                i10++;
            }
            if (i10 < this.f43784b) {
                return i10;
            }
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f43784b - 1;
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
        return i10 < this.f43784b && (i12 = (aVarC = c(i10)).f43801b) != -1 && i11 < i12 && aVarC.f43805f[i11] == 4;
    }

    public boolean g(int i10) {
        return i10 == this.f43784b - 1 && c(i10).f();
    }

    public int hashCode() {
        int i10 = this.f43784b * 31;
        Object obj = this.f43783a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f43785c)) * 31) + ((int) this.f43786d)) * 31) + this.f43787e) * 31) + Arrays.hashCode(this.f43788f);
    }

    public C5562b i(int i10, int i11) {
        C13466a.a(i11 > 0);
        int i12 = i10 - this.f43787e;
        a[] aVarArr = this.f43788f;
        if (aVarArr[i12].f43801b == i11) {
            return this;
        }
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        aVarArr2[i12] = this.f43788f[i12].h(i11);
        return new C5562b(this.f43783a, aVarArr2, this.f43785c, this.f43786d, this.f43787e);
    }

    public C5562b j(long[][] jArr) {
        C13466a.g(this.f43787e == 0);
        a[] aVarArr = this.f43788f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        for (int i10 = 0; i10 < this.f43784b; i10++) {
            aVarArr2[i10] = aVarArr2[i10].i(jArr[i10]);
        }
        return new C5562b(this.f43783a, aVarArr2, this.f43785c, this.f43786d, this.f43787e);
    }

    public C5562b k(int i10, int i11) {
        int i12 = i10 - this.f43787e;
        a[] aVarArr = this.f43788f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].k(4, i11);
        return new C5562b(this.f43783a, aVarArr2, this.f43785c, this.f43786d, this.f43787e);
    }

    public C5562b l(long j10) {
        return this.f43785c == j10 ? this : new C5562b(this.f43783a, this.f43788f, j10, this.f43786d, this.f43787e);
    }

    public C5562b m(int i10, int i11, v vVar) {
        v.h hVar;
        int i12 = i10 - this.f43787e;
        a[] aVarArr = this.f43788f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        C13466a.g(aVarArr2[i12].f43809j || !((hVar = vVar.f44012b) == null || hVar.f44110a.equals(Uri.EMPTY)));
        aVarArr2[i12] = aVarArr2[i12].j(vVar, i11);
        return new C5562b(this.f43783a, aVarArr2, this.f43785c, this.f43786d, this.f43787e);
    }

    public C5562b n(long j10) {
        return this.f43786d == j10 ? this : new C5562b(this.f43783a, this.f43788f, this.f43785c, j10, this.f43787e);
    }

    public C5562b o(int i10, int i11) {
        int i12 = i10 - this.f43787e;
        a[] aVarArr = this.f43788f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].k(3, i11);
        return new C5562b(this.f43783a, aVarArr2, this.f43785c, this.f43786d, this.f43787e);
    }

    public C5562b p(int i10, int i11) {
        int i12 = i10 - this.f43787e;
        a[] aVarArr = this.f43788f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].k(2, i11);
        return new C5562b(this.f43783a, aVarArr2, this.f43785c, this.f43786d, this.f43787e);
    }

    public C5562b q(int i10) {
        int i11 = i10 - this.f43787e;
        a[] aVarArr = this.f43788f;
        a[] aVarArr2 = (a[]) P.R0(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].l();
        return new C5562b(this.f43783a, aVarArr2, this.f43785c, this.f43786d, this.f43787e);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f43783a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f43785c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f43788f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f43788f[i10].f43800a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f43788f[i10].f43805f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f43788f[i10].f43805f[i11];
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
                sb2.append(this.f43788f[i10].f43806g[i11]);
                sb2.append(')');
                if (i11 < this.f43788f[i10].f43805f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f43788f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    private C5562b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f43783a = obj;
        this.f43785c = j10;
        this.f43786d = j11;
        this.f43784b = aVarArr.length + i10;
        this.f43788f = aVarArr;
        this.f43787e = i10;
    }
}
