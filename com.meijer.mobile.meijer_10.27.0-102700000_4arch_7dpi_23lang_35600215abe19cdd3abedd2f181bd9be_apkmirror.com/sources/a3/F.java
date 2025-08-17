package a3;

import a3.C5562b;
import a3.v;
import android.net.Uri;
import android.util.Pair;
import d3.C13466a;
import d3.P;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f43583a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f43584b = P.y0(0);

    /* renamed from: c, reason: collision with root package name */
    private static final String f43585c = P.y0(1);

    /* renamed from: d, reason: collision with root package name */
    private static final String f43586d = P.y0(2);

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
        private static final String f43587h = P.y0(0);

        /* renamed from: i, reason: collision with root package name */
        private static final String f43588i = P.y0(1);

        /* renamed from: j, reason: collision with root package name */
        private static final String f43589j = P.y0(2);

        /* renamed from: k, reason: collision with root package name */
        private static final String f43590k = P.y0(3);

        /* renamed from: l, reason: collision with root package name */
        private static final String f43591l = P.y0(4);

        /* renamed from: a, reason: collision with root package name */
        public Object f43592a;

        /* renamed from: b, reason: collision with root package name */
        public Object f43593b;

        /* renamed from: c, reason: collision with root package name */
        public int f43594c;

        /* renamed from: d, reason: collision with root package name */
        public long f43595d;

        /* renamed from: e, reason: collision with root package name */
        public long f43596e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f43597f;

        /* renamed from: g, reason: collision with root package name */
        public C5562b f43598g = C5562b.f43777g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f43592a, bVar.f43592a) && Objects.equals(this.f43593b, bVar.f43593b) && this.f43594c == bVar.f43594c && this.f43595d == bVar.f43595d && this.f43596e == bVar.f43596e && this.f43597f == bVar.f43597f && Objects.equals(this.f43598g, bVar.f43598g)) {
                    return true;
                }
            }
            return false;
        }

        public int a(int i10) {
            return this.f43598g.c(i10).f43801b;
        }

        public long b(int i10, int i11) {
            C5562b.a aVarC = this.f43598g.c(i10);
            if (aVarC.f43801b != -1) {
                return aVarC.f43806g[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f43598g.f43784b;
        }

        public int d(long j10) {
            return this.f43598g.d(j10, this.f43595d);
        }

        public int e(long j10) {
            return this.f43598g.e(j10, this.f43595d);
        }

        public long f(int i10) {
            return this.f43598g.c(i10).f43800a;
        }

        public long g() {
            return this.f43598g.f43785c;
        }

        public int h(int i10, int i11) {
            C5562b.a aVarC = this.f43598g.c(i10);
            if (aVarC.f43801b != -1) {
                return aVarC.f43805f[i11];
            }
            return 0;
        }

        public int hashCode() {
            Object obj = this.f43592a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f43593b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f43594c) * 31;
            long j10 = this.f43595d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f43596e;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f43597f ? 1 : 0)) * 31) + this.f43598g.hashCode();
        }

        public Object i() {
            return this.f43598g.f43783a;
        }

        public long j(int i10) {
            return this.f43598g.c(i10).f43808i;
        }

        public long k() {
            return this.f43595d;
        }

        public int l(int i10) {
            return this.f43598g.c(i10).c();
        }

        public int m(int i10, int i11) {
            return this.f43598g.c(i10).d(i11);
        }

        public long n() {
            return P.j1(this.f43596e);
        }

        public long o() {
            return this.f43596e;
        }

        public int p() {
            return this.f43598g.f43787e;
        }

        public boolean q(int i10) {
            return !this.f43598g.c(i10).e();
        }

        public boolean s(int i10) {
            return this.f43598g.c(i10).f43809j;
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11) {
            return u(obj, obj2, i10, j10, j11, C5562b.f43777g, false);
        }

        public b u(Object obj, Object obj2, int i10, long j10, long j11, C5562b c5562b, boolean z10) {
            this.f43592a = obj;
            this.f43593b = obj2;
            this.f43594c = i10;
            this.f43595d = j10;
            this.f43596e = j11;
            this.f43598g = c5562b;
            this.f43597f = z10;
            return this;
        }

        public boolean r(int i10) {
            if (i10 == c() - 1 && this.f43598g.g(i10)) {
                return true;
            }
            return false;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f43616b;

        /* renamed from: d, reason: collision with root package name */
        public Object f43618d;

        /* renamed from: e, reason: collision with root package name */
        public long f43619e;

        /* renamed from: f, reason: collision with root package name */
        public long f43620f;

        /* renamed from: g, reason: collision with root package name */
        public long f43621g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f43622h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f43623i;

        /* renamed from: j, reason: collision with root package name */
        public v.g f43624j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f43625k;

        /* renamed from: l, reason: collision with root package name */
        public long f43626l;

        /* renamed from: m, reason: collision with root package name */
        public long f43627m;

        /* renamed from: n, reason: collision with root package name */
        public int f43628n;

        /* renamed from: o, reason: collision with root package name */
        public int f43629o;

        /* renamed from: p, reason: collision with root package name */
        public long f43630p;

        /* renamed from: q, reason: collision with root package name */
        public static final Object f43605q = new Object();

        /* renamed from: r, reason: collision with root package name */
        private static final Object f43606r = new Object();

        /* renamed from: s, reason: collision with root package name */
        private static final v f43607s = new v.c().e("androidx.media3.common.Timeline").i(Uri.EMPTY).a();

        /* renamed from: t, reason: collision with root package name */
        private static final String f43608t = P.y0(1);

        /* renamed from: u, reason: collision with root package name */
        private static final String f43609u = P.y0(2);

        /* renamed from: v, reason: collision with root package name */
        private static final String f43610v = P.y0(3);

        /* renamed from: w, reason: collision with root package name */
        private static final String f43611w = P.y0(4);

        /* renamed from: x, reason: collision with root package name */
        private static final String f43612x = P.y0(5);

        /* renamed from: y, reason: collision with root package name */
        private static final String f43613y = P.y0(6);

        /* renamed from: z, reason: collision with root package name */
        private static final String f43614z = P.y0(7);

        /* renamed from: A, reason: collision with root package name */
        private static final String f43599A = P.y0(8);

        /* renamed from: B, reason: collision with root package name */
        private static final String f43600B = P.y0(9);

        /* renamed from: C, reason: collision with root package name */
        private static final String f43601C = P.y0(10);

        /* renamed from: D, reason: collision with root package name */
        private static final String f43602D = P.y0(11);

        /* renamed from: E, reason: collision with root package name */
        private static final String f43603E = P.y0(12);

        /* renamed from: F, reason: collision with root package name */
        private static final String f43604F = P.y0(13);

        /* renamed from: a, reason: collision with root package name */
        public Object f43615a = f43605q;

        /* renamed from: c, reason: collision with root package name */
        public v f43617c = f43607s;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                if (Objects.equals(this.f43615a, cVar.f43615a) && Objects.equals(this.f43617c, cVar.f43617c) && Objects.equals(this.f43618d, cVar.f43618d) && Objects.equals(this.f43624j, cVar.f43624j) && this.f43619e == cVar.f43619e && this.f43620f == cVar.f43620f && this.f43621g == cVar.f43621g && this.f43622h == cVar.f43622h && this.f43623i == cVar.f43623i && this.f43625k == cVar.f43625k && this.f43626l == cVar.f43626l && this.f43627m == cVar.f43627m && this.f43628n == cVar.f43628n && this.f43629o == cVar.f43629o && this.f43630p == cVar.f43630p) {
                    return true;
                }
            }
            return false;
        }

        public long a() {
            return P.d0(this.f43621g);
        }

        public long b() {
            return P.j1(this.f43626l);
        }

        public long c() {
            return this.f43626l;
        }

        public long d() {
            return P.j1(this.f43627m);
        }

        public long e() {
            return this.f43630p;
        }

        public boolean f() {
            return this.f43624j != null;
        }

        public c g(Object obj, v vVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, v.g gVar, long j13, long j14, int i10, int i11, long j15) {
            v.h hVar;
            this.f43615a = obj;
            this.f43617c = vVar != null ? vVar : f43607s;
            this.f43616b = (vVar == null || (hVar = vVar.f44012b) == null) ? null : hVar.f44118i;
            this.f43618d = obj2;
            this.f43619e = j10;
            this.f43620f = j11;
            this.f43621g = j12;
            this.f43622h = z10;
            this.f43623i = z11;
            this.f43624j = gVar;
            this.f43626l = j13;
            this.f43627m = j14;
            this.f43628n = i10;
            this.f43629o = i11;
            this.f43630p = j15;
            this.f43625k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f43615a.hashCode()) * 31) + this.f43617c.hashCode()) * 31;
            Object obj = this.f43618d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            v.g gVar = this.f43624j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f43619e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f43620f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f43621g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f43622h ? 1 : 0)) * 31) + (this.f43623i ? 1 : 0)) * 31) + (this.f43625k ? 1 : 0)) * 31;
            long j13 = this.f43626l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f43627m;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f43628n) * 31) + this.f43629o) * 31;
            long j15 = this.f43630p;
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
        C13466a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f43628n;
        f(i11, bVar);
        while (i11 < cVar.f43629o && bVar.f43596e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f43596e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long jMin = j10 - bVar.f43596e;
        long j12 = bVar.f43595d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(C13466a.e(bVar.f43593b), Long.valueOf(Math.max(0L, jMin)));
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
        return (Pair) C13466a.e(k(cVar, bVar, i10, j10, 0L));
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
        int i12 = f(i10, bVar).f43594c;
        if (n(i12, cVar).f43629o == i10) {
            int iE = e(i12, i11, z10);
            if (iE == -1) {
                return -1;
            }
            return n(iE, cVar).f43628n;
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
