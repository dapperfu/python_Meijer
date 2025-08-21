package z3;

import d3.C13599a;
import d3.P;
import java.io.IOException;
import java.util.Arrays;
import x3.InterfaceC18078q;
import x3.J;
import x3.K;
import x3.O;

/* loaded from: classes2.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f172324a;

    /* renamed from: b, reason: collision with root package name */
    private final O f172325b;

    /* renamed from: c, reason: collision with root package name */
    private final int f172326c;

    /* renamed from: d, reason: collision with root package name */
    private final int f172327d;

    /* renamed from: e, reason: collision with root package name */
    private final long f172328e;

    /* renamed from: f, reason: collision with root package name */
    private int f172329f;

    /* renamed from: g, reason: collision with root package name */
    private int f172330g;

    /* renamed from: h, reason: collision with root package name */
    private int f172331h;

    /* renamed from: i, reason: collision with root package name */
    private int f172332i;

    /* renamed from: j, reason: collision with root package name */
    private int f172333j;

    /* renamed from: k, reason: collision with root package name */
    private int f172334k;

    /* renamed from: l, reason: collision with root package name */
    private long f172335l;

    /* renamed from: m, reason: collision with root package name */
    private long[] f172336m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f172337n;

    public long g() {
        return e(1);
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f172328e * i10) / this.f172329f;
    }

    private K h(int i10) {
        return new K(this.f172337n[i10] * g(), this.f172336m[i10]);
    }

    public void a() {
        this.f172332i++;
    }

    public void b(long j10, boolean z10) {
        if (this.f172335l == -1) {
            this.f172335l = j10;
        }
        if (z10) {
            if (this.f172334k == this.f172337n.length) {
                long[] jArr = this.f172336m;
                this.f172336m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f172337n;
                this.f172337n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f172336m;
            int i10 = this.f172334k;
            jArr2[i10] = j10;
            this.f172337n[i10] = this.f172333j;
            this.f172334k = i10 + 1;
        }
        this.f172333j++;
    }

    public void c() {
        int i10;
        this.f172336m = Arrays.copyOf(this.f172336m, this.f172334k);
        this.f172337n = Arrays.copyOf(this.f172337n, this.f172334k);
        if (!k() || this.f172324a.f172323g == 0 || (i10 = this.f172334k) <= 0) {
            return;
        }
        this.f172329f = i10;
    }

    public long f() {
        return e(this.f172332i);
    }

    public J.a i(long j10) {
        if (this.f172334k == 0) {
            return new J.a(new K(0L, this.f172335l));
        }
        int iG = (int) (j10 / g());
        int iF = P.f(this.f172337n, iG, true, true);
        if (this.f172337n[iF] == iG) {
            return new J.a(h(iF));
        }
        K kH = h(iF);
        int i10 = iF + 1;
        return i10 < this.f172336m.length ? new J.a(kH, h(i10)) : new J.a(kH);
    }

    public boolean j(int i10) {
        return this.f172326c == i10 || this.f172327d == i10;
    }

    public boolean k() {
        return (this.f172326c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f172337n, this.f172332i) >= 0;
    }

    public boolean m(InterfaceC18078q interfaceC18078q) throws IOException {
        int i10 = this.f172331h;
        int iG = i10 - this.f172325b.g(interfaceC18078q, i10, false);
        this.f172331h = iG;
        boolean z10 = iG == 0;
        if (z10) {
            if (this.f172330g > 0) {
                this.f172325b.c(f(), l() ? 1 : 0, this.f172330g, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f172330g = i10;
        this.f172331h = i10;
    }

    public void o(long j10) {
        if (this.f172334k == 0) {
            this.f172332i = 0;
        } else {
            this.f172332i = this.f172337n[P.g(this.f172336m, j10, true, true)];
        }
    }

    public e(int i10, d dVar, O o10) {
        int i11;
        int iD;
        this.f172324a = dVar;
        int iB = dVar.b();
        boolean z10 = true;
        if (iB != 1 && iB != 2) {
            z10 = false;
        }
        C13599a.a(z10);
        if (iB == 2) {
            i11 = 1667497984;
        } else {
            i11 = 1651965952;
        }
        this.f172326c = d(i10, i11);
        this.f172328e = dVar.a();
        this.f172325b = o10;
        if (iB == 2) {
            iD = d(i10, 1650720768);
        } else {
            iD = -1;
        }
        this.f172327d = iD;
        this.f172335l = -1L;
        this.f172336m = new long[512];
        this.f172337n = new int[512];
        this.f172329f = dVar.f172321e;
    }
}
