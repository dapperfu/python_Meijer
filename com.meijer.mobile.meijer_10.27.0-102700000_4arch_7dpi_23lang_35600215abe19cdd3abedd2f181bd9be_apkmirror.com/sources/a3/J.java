package a3;

import d3.C13466a;
import d3.P;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final J f43750b = new J(Ce.L.x());

    /* renamed from: c, reason: collision with root package name */
    private static final String f43751c = P.y0(0);

    /* renamed from: a, reason: collision with root package name */
    private final Ce.L<a> f43752a;

    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final String f43753f = P.y0(0);

        /* renamed from: g, reason: collision with root package name */
        private static final String f43754g = P.y0(1);

        /* renamed from: h, reason: collision with root package name */
        private static final String f43755h = P.y0(3);

        /* renamed from: i, reason: collision with root package name */
        private static final String f43756i = P.y0(4);

        /* renamed from: a, reason: collision with root package name */
        public final int f43757a;

        /* renamed from: b, reason: collision with root package name */
        private final G f43758b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f43759c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f43760d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean[] f43761e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f43759c == aVar.f43759c && this.f43758b.equals(aVar.f43758b) && Arrays.equals(this.f43760d, aVar.f43760d) && Arrays.equals(this.f43761e, aVar.f43761e)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(boolean z10) {
            for (int i10 = 0; i10 < this.f43760d.length; i10++) {
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
            return this.f43758b;
        }

        public t b(int i10) {
            return this.f43758b.a(i10);
        }

        public int c() {
            return this.f43758b.f43635c;
        }

        public boolean d() {
            return this.f43759c;
        }

        public boolean e() {
            return He.a.a(this.f43761e, true);
        }

        public boolean g(int i10) {
            return this.f43761e[i10];
        }

        public int hashCode() {
            return (((((this.f43758b.hashCode() * 31) + (this.f43759c ? 1 : 0)) * 31) + Arrays.hashCode(this.f43760d)) * 31) + Arrays.hashCode(this.f43761e);
        }

        public boolean i(int i10, boolean z10) {
            int i11 = this.f43760d[i10];
            if (i11 != 4) {
                return z10 && i11 == 3;
            }
            return true;
        }

        public a(G g10, boolean z10, int[] iArr, boolean[] zArr) {
            boolean z11;
            int i10 = g10.f43633a;
            this.f43757a = i10;
            boolean z12 = false;
            if (i10 == iArr.length && i10 == zArr.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            C13466a.a(z11);
            this.f43758b = g10;
            if (z10 && i10 > 1) {
                z12 = true;
            }
            this.f43759c = z12;
            this.f43760d = (int[]) iArr.clone();
            this.f43761e = (boolean[]) zArr.clone();
        }
    }

    public boolean c(int i10) {
        for (int i11 = 0; i11 < this.f43752a.size(); i11++) {
            a aVar = this.f43752a.get(i11);
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
        for (int i11 = 0; i11 < this.f43752a.size(); i11++) {
            if (this.f43752a.get(i11).c() == i10 && this.f43752a.get(i11).f(z10)) {
                return true;
            }
        }
        return false;
    }

    public Ce.L<a> a() {
        return this.f43752a;
    }

    public boolean b() {
        return this.f43752a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        return this.f43752a.equals(((J) obj).f43752a);
    }

    public int hashCode() {
        return this.f43752a.hashCode();
    }

    public J(List<a> list) {
        this.f43752a = Ce.L.s(list);
    }
}
