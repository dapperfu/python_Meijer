package a3;

import a3.C5645b;
import a3.v;
import android.net.Uri;
import android.util.Pair;
import d3.C13599a;
import d3.P;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f44401a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f44402b = P.y0(0);

    /* renamed from: c, reason: collision with root package name */
    private static final String f44403c = P.y0(1);

    /* renamed from: d, reason: collision with root package name */
    private static final String f44404d = P.y0(2);

    class a extends F {
        @Override // a3.F
        public int b(Object obj) {
            return -1;
        }

        @Override // a3.F
        public int i() {
            return 0;
        }

        @Override // a3.F
        public int p() {
            return 0;
        }

        @Override // a3.F
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // a3.F
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // a3.F
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        a() {
        }
    }

    public static final class b {

        /* renamed from: h, reason: collision with root package name */
        private static final String f44405h = P.y0(0);

        /* renamed from: i, reason: collision with root package name */
        private static final String f44406i = P.y0(1);

        /* renamed from: j, reason: collision with root package name */
        private static final String f44407j = P.y0(2);

        /* renamed from: k, reason: collision with root package name */
        private static final String f44408k = P.y0(3);

        /* renamed from: l, reason: collision with root package name */
        private static final String f44409l = P.y0(4);

        /* renamed from: a, reason: collision with root package name */
        public Object f44410a;

        /* renamed from: b, reason: collision with root package name */
        public Object f44411b;

        /* renamed from: c, reason: collision with root package name */
        public int f44412c;

        /* renamed from: d, reason: collision with root package name */
        public long f44413d;

        /* renamed from: e, reason: collision with root package name */
        public long f44414e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f44415f;

        /* renamed from: g, reason: collision with root package name */
        public C5645b f44416g = C5645b.f44595g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f44410a, bVar.f44410a) && Objects.equals(this.f44411b, bVar.f44411b) && this.f44412c == bVar.f44412c && this.f44413d == bVar.f44413d && this.f44414e == bVar.f44414e && this.f44415f == bVar.f44415f && Objects.equals(this.f44416g, bVar.f44416g)) {
                    return true;
                }
            }
            return false;
        }

        public int a(int i10) {
            return this.f44416g.c(i10).f44619b;
        }

        public long b(int i10, int i11) {
            C5645b.a aVarC = this.f44416g.c(i10);
            if (aVarC.f44619b != -1) {
                return aVarC.f44624g[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f44416g.f44602b;
        }

        public int d(long j10) {
            return this.f44416g.d(j10, this.f44413d);
        }

        public int e(long j10) {
            return this.f44416g.e(j10, this.f44413d);
        }

        public long f(int i10) {
            return this.f44416g.c(i10).f44618a;
        }

        public long g() {
            return this.f44416g.f44603c;
        }

        public int h(int i10, int i11) {
            C5645b.a aVarC = this.f44416g.c(i10);
            if (aVarC.f44619b != -1) {
                return aVarC.f44623f[i11];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f44410a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f44411b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f44412c) * 31;
            long j10 = this.f44413d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f44414e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f44415f ? 1 : 0)) * 31) + this.f44416g.hashCode();
        }

        public Object i() {
            return this.f44416g.f44601a;
        }

        public long j(int i10) {
            return this.f44416g.c(i10).f44626i;
        }

        public long k() {
            return this.f44413d;
        }

        public int l(int i10) {
            return this.f44416g.c(i10).c();
        }

        public int m(int i10, int i11) {
            return this.f44416g.c(i10).d(i11);
        }

        public long n() {
            return P.j1(this.f44414e);
        }

        public long o() {
            return this.f44414e;
        }

        public int p() {
            return this.f44416g.f44605e;
        }

        public boolean q(int i10) {
            return !this.f44416g.c(i10).e();
        }

        public boolean s(int i10) {
            return this.f44416g.c(i10).f44627j;
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11) {
            return u(obj, obj2, i10, j10, j11, C5645b.f44595g, false);
        }

        public b u(Object obj, Object obj2, int i10, long j10, long j11, C5645b c5645b, boolean z10) {
            this.f44410a = obj;
            this.f44411b = obj2;
            this.f44412c = i10;
            this.f44413d = j10;
            this.f44414e = j11;
            this.f44416g = c5645b;
            this.f44415f = z10;
            return this;
        }

        public boolean r(int i10) {
            if (i10 == c() - 1 && this.f44416g.g(i10)) {
                return true;
            }
            return false;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f44434b;

        /* renamed from: d, reason: collision with root package name */
        public Object f44436d;

        /* renamed from: e, reason: collision with root package name */
        public long f44437e;

        /* renamed from: f, reason: collision with root package name */
        public long f44438f;

        /* renamed from: g, reason: collision with root package name */
        public long f44439g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f44440h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f44441i;

        /* renamed from: j, reason: collision with root package name */
        public v.g f44442j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f44443k;

        /* renamed from: l, reason: collision with root package name */
        public long f44444l;

        /* renamed from: m, reason: collision with root package name */
        public long f44445m;

        /* renamed from: n, reason: collision with root package name */
        public int f44446n;

        /* renamed from: o, reason: collision with root package name */
        public int f44447o;

        /* renamed from: p, reason: collision with root package name */
        public long f44448p;

        /* renamed from: q, reason: collision with root package name */
        public static final Object f44423q = new Object();

        /* renamed from: r, reason: collision with root package name */
        private static final Object f44424r = new Object();

        /* renamed from: s, reason: collision with root package name */
        private static final v f44425s = new v.c().e("androidx.media3.common.Timeline").i(Uri.EMPTY).a();

        /* renamed from: t, reason: collision with root package name */
        private static final String f44426t = P.y0(1);

        /* renamed from: u, reason: collision with root package name */
        private static final String f44427u = P.y0(2);

        /* renamed from: v, reason: collision with root package name */
        private static final String f44428v = P.y0(3);

        /* renamed from: w, reason: collision with root package name */
        private static final String f44429w = P.y0(4);

        /* renamed from: x, reason: collision with root package name */
        private static final String f44430x = P.y0(5);

        /* renamed from: y, reason: collision with root package name */
        private static final String f44431y = P.y0(6);

        /* renamed from: z, reason: collision with root package name */
        private static final String f44432z = P.y0(7);

        /* renamed from: A, reason: collision with root package name */
        private static final String f44417A = P.y0(8);

        /* renamed from: B, reason: collision with root package name */
        private static final String f44418B = P.y0(9);

        /* renamed from: C, reason: collision with root package name */
        private static final String f44419C = P.y0(10);

        /* renamed from: D, reason: collision with root package name */
        private static final String f44420D = P.y0(11);

        /* renamed from: E, reason: collision with root package name */
        private static final String f44421E = P.y0(12);

        /* renamed from: F, reason: collision with root package name */
        private static final String f44422F = P.y0(13);

        /* renamed from: a, reason: collision with root package name */
        public Object f44433a = f44423q;

        /* renamed from: c, reason: collision with root package name */
        public v f44435c = f44425s;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (Objects.equals(this.f44433a, cVar.f44433a) && Objects.equals(this.f44435c, cVar.f44435c) && Objects.equals(this.f44436d, cVar.f44436d) && Objects.equals(this.f44442j, cVar.f44442j) && this.f44437e == cVar.f44437e && this.f44438f == cVar.f44438f && this.f44439g == cVar.f44439g && this.f44440h == cVar.f44440h && this.f44441i == cVar.f44441i && this.f44443k == cVar.f44443k && this.f44444l == cVar.f44444l && this.f44445m == cVar.f44445m && this.f44446n == cVar.f44446n && this.f44447o == cVar.f44447o && this.f44448p == cVar.f44448p) {
                    return true;
                }
            }
            return false;
        }

        public long a() {
            return P.d0(this.f44439g);
        }

        public long b() {
            return P.j1(this.f44444l);
        }

        public long c() {
            return this.f44444l;
        }

        public long d() {
            return P.j1(this.f44445m);
        }

        public long e() {
            return this.f44448p;
        }

        public boolean f() {
            return this.f44442j != null;
        }

        public c g(Object obj, v vVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, v.g gVar, long j13, long j14, int i10, int i11, long j15) {
            v.h hVar;
            this.f44433a = obj;
            this.f44435c = vVar != null ? vVar : f44425s;
            this.f44434b = (vVar == null || (hVar = vVar.f44830b) == null) ? null : hVar.f44936i;
            this.f44436d = obj2;
            this.f44437e = j10;
            this.f44438f = j11;
            this.f44439g = j12;
            this.f44440h = z10;
            this.f44441i = z11;
            this.f44442j = gVar;
            this.f44444l = j13;
            this.f44445m = j14;
            this.f44446n = i10;
            this.f44447o = i11;
            this.f44448p = j15;
            this.f44443k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f44433a.hashCode()) * 31) + this.f44435c.hashCode()) * 31;
            Object obj = this.f44436d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            v.g gVar = this.f44442j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f44437e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f44438f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f44439g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f44440h ? 1 : 0)) * 31) + (this.f44441i ? 1 : 0)) * 31) + (this.f44443k ? 1 : 0)) * 31;
            long j13 = this.f44444l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f44445m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f44446n) * 31) + this.f44447o) * 31;
            long j15 = this.f44448p;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    public abstract int b(Object obj);

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        if (f10.p() != p() || f10.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(f10.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(f10.g(i11, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != f10.a(true) || (iC = c(true)) != f10.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != f10.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public abstract int i();

    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        C13599a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f44446n;
        f(i11, bVar);
        while (i11 < cVar.f44447o && bVar.f44414e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f44414e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long jMin = j10 - bVar.f44414e;
        long j12 = bVar.f44413d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(C13599a.e(bVar.f44411b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i10);

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = 217 + p();
        for (int i10 = 0; i10 < p(); i10++) {
            iP = (iP * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (iP * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i11 = (i11 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i11;
    }

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        return (Pair) C13599a.e(k(cVar, bVar, i10, j10, 0L));
    }

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    protected F() {
    }

    public int a(boolean z10) {
        if (q()) {
            return -1;
        }
        return 0;
    }

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f44412c;
        if (n(i12, cVar).f44447o == i10) {
            int iE = e(i12, i11, z10);
            if (iE == -1) {
                return -1;
            }
            return n(iE, cVar).f44446n;
        }
        return i10 + 1;
    }

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public final boolean q() {
        if (p() == 0) {
            return true;
        }
        return false;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        if (d(i10, bVar, cVar, i11, z10) == -1) {
            return true;
        }
        return false;
    }
}
