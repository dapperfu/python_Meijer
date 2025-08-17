package z3;

import d3.C13466a;
import d3.P;
import java.io.IOException;
import java.util.Arrays;
import x3.InterfaceC18012q;
import x3.J;
import x3.K;
import x3.O;

/* loaded from: classes2.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f171528a;

    /* renamed from: b, reason: collision with root package name */
    private final O f171529b;

    /* renamed from: c, reason: collision with root package name */
    private final int f171530c;

    /* renamed from: d, reason: collision with root package name */
    private final int f171531d;

    /* renamed from: e, reason: collision with root package name */
    private final long f171532e;

    /* renamed from: f, reason: collision with root package name */
    private int f171533f;

    /* renamed from: g, reason: collision with root package name */
    private int f171534g;

    /* renamed from: h, reason: collision with root package name */
    private int f171535h;

    /* renamed from: i, reason: collision with root package name */
    private int f171536i;

    /* renamed from: j, reason: collision with root package name */
    private int f171537j;

    /* renamed from: k, reason: collision with root package name */
    private int f171538k;

    /* renamed from: l, reason: collision with root package name */
    private long f171539l;

    /* renamed from: m, reason: collision with root package name */
    private long[] f171540m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f171541n;

    public long g() {
        return e(1);
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f171532e * i10) / this.f171533f;
    }

    private K h(int i10) {
        return new K(this.f171541n[i10] * g(), this.f171540m[i10]);
    }

    public void a() {
        this.f171536i++;
    }

    public void b(long j10, boolean z10) {
        if (this.f171539l == -1) {
            this.f171539l = j10;
        }
        if (z10) {
            if (this.f171538k == this.f171541n.length) {
                long[] jArr = this.f171540m;
                this.f171540m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f171541n;
                this.f171541n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f171540m;
            int i10 = this.f171538k;
            jArr2[i10] = j10;
            this.f171541n[i10] = this.f171537j;
            this.f171538k = i10 + 1;
        }
        this.f171537j++;
    }

    public void c() {
        int i10;
        this.f171540m = Arrays.copyOf(this.f171540m, this.f171538k);
        this.f171541n = Arrays.copyOf(this.f171541n, this.f171538k);
        if (!k() || this.f171528a.f171527g == 0 || (i10 = this.f171538k) <= 0) {
            return;
        }
        this.f171533f = i10;
    }

    public long f() {
        return e(this.f171536i);
    }

    public J.a i(long j10) {
        if (this.f171538k == 0) {
            return new J.a(new K(0L, this.f171539l));
        }
        int iG = (int) (j10 / g());
        int iF = P.f(this.f171541n, iG, true, true);
        if (this.f171541n[iF] == iG) {
            return new J.a(h(iF));
        }
        K kH = h(iF);
        int i10 = iF + 1;
        return i10 < this.f171540m.length ? new J.a(kH, h(i10)) : new J.a(kH);
    }

    public boolean j(int i10) {
        return this.f171530c == i10 || this.f171531d == i10;
    }

    public boolean k() {
        return (this.f171530c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f171541n, this.f171536i) >= 0;
    }

    public boolean m(InterfaceC18012q interfaceC18012q) throws IOException {
        int i10 = this.f171535h;
        int iG = i10 - this.f171529b.g(interfaceC18012q, i10, false);
        this.f171535h = iG;
        boolean z10 = iG == 0;
        if (z10) {
            if (this.f171534g > 0) {
                this.f171529b.c(f(), l() ? 1 : 0, this.f171534g, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f171534g = i10;
        this.f171535h = i10;
    }

    public void o(long j10) {
        if (this.f171538k == 0) {
            this.f171536i = 0;
        } else {
            this.f171536i = this.f171541n[P.g(this.f171540m, j10, true, true)];
        }
    }

    public e(int i10, d dVar, O o10) {
        int i11;
        int iD;
        this.f171528a = dVar;
        int iB = dVar.b();
        boolean z10 = true;
        if (iB != 1 && iB != 2) {
            z10 = false;
        }
        C13466a.a(z10);
        if (iB == 2) {
            i11 = 1667497984;
        } else {
            i11 = 1651965952;
        }
        this.f171530c = d(i10, i11);
        this.f171532e = dVar.a();
        this.f171529b = o10;
        if (iB == 2) {
            iD = d(i10, 1650720768);
        } else {
            iD = -1;
        }
        this.f171531d = iD;
        this.f171539l = -1L;
        this.f171540m = new long[512];
        this.f171541n = new int[512];
        this.f171533f = dVar.f171525e;
    }
}
