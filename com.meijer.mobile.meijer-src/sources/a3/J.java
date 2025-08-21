package a3;

import d3.C13599a;
import d3.P;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final J f44568b = new J(Ee.L.x());

    /* renamed from: c, reason: collision with root package name */
    private static final String f44569c = P.y0(0);

    /* renamed from: a, reason: collision with root package name */
    private final Ee.L<a> f44570a;

    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final String f44571f = P.y0(0);

        /* renamed from: g, reason: collision with root package name */
        private static final String f44572g = P.y0(1);

        /* renamed from: h, reason: collision with root package name */
        private static final String f44573h = P.y0(3);

        /* renamed from: i, reason: collision with root package name */
        private static final String f44574i = P.y0(4);

        /* renamed from: a, reason: collision with root package name */
        public final int f44575a;

        /* renamed from: b, reason: collision with root package name */
        private final G f44576b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f44577c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f44578d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean[] f44579e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f44577c == aVar.f44577c && this.f44576b.equals(aVar.f44576b) && Arrays.equals(this.f44578d, aVar.f44578d) && Arrays.equals(this.f44579e, aVar.f44579e)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(boolean z10) {
            for (int i10 = 0; i10 < this.f44578d.length; i10++) {
                if (i(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean h(int i10) {
            return i(i10, false);
        }

        public G a() {
            return this.f44576b;
        }

        public t b(int i10) {
            return this.f44576b.a(i10);
        }

        public int c() {
            return this.f44576b.f44453c;
        }

        public boolean d() {
            return this.f44577c;
        }

        public boolean e() {
            return Je.a.a(this.f44579e, true);
        }

        public boolean g(int i10) {
            return this.f44579e[i10];
        }

        public int hashCode() {
            return (((((this.f44576b.hashCode() * 31) + (this.f44577c ? 1 : 0)) * 31) + Arrays.hashCode(this.f44578d)) * 31) + Arrays.hashCode(this.f44579e);
        }

        public boolean i(int i10, boolean z10) {
            int i11 = this.f44578d[i10];
            if (i11 != 4) {
                return z10 && i11 == 3;
            }
            return true;
        }

        public a(G g10, boolean z10, int[] iArr, boolean[] zArr) {
            boolean z11;
            int i10 = g10.f44451a;
            this.f44575a = i10;
            boolean z12 = false;
            if (i10 == iArr.length && i10 == zArr.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            C13599a.a(z11);
            this.f44576b = g10;
            if (z10 && i10 > 1) {
                z12 = true;
            }
            this.f44577c = z12;
            this.f44578d = (int[]) iArr.clone();
            this.f44579e = (boolean[]) zArr.clone();
        }
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f44570a.size(); i11++) {
            a aVar = this.f44570a.get(i11);
            if (aVar.e() && aVar.c() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        return e(i10, false);
    }

    public boolean e(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f44570a.size(); i11++) {
            if (this.f44570a.get(i11).c() == i10 && this.f44570a.get(i11).f(z10)) {
                return true;
            }
        }
        return false;
    }

    public Ee.L<a> a() {
        return this.f44570a;
    }

    public boolean b() {
        return this.f44570a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        return this.f44570a.equals(((J) obj).f44570a);
    }

    public int hashCode() {
        return this.f44570a.hashCode();
    }

    public J(List<a> list) {
        this.f44570a = Ee.L.s(list);
    }
}
