package t3;

import d3.C13599a;
import d3.P;
import java.util.Arrays;
import t3.b;

/* loaded from: classes.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f162181a;

    /* renamed from: b, reason: collision with root package name */
    private final int f162182b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f162183c;

    /* renamed from: d, reason: collision with root package name */
    private int f162184d;

    /* renamed from: e, reason: collision with root package name */
    private int f162185e;

    /* renamed from: f, reason: collision with root package name */
    private int f162186f;

    /* renamed from: g, reason: collision with root package name */
    private C17177a[] f162187g;

    public f(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // t3.b
    public synchronized void a(b.a aVar) {
        while (aVar != null) {
            try {
                C17177a[] c17177aArr = this.f162187g;
                int i10 = this.f162186f;
                this.f162186f = i10 + 1;
                c17177aArr[i10] = aVar.a();
                this.f162185e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // t3.b
    public synchronized void b(C17177a c17177a) {
        C17177a[] c17177aArr = this.f162187g;
        int i10 = this.f162186f;
        this.f162186f = i10 + 1;
        c17177aArr[i10] = c17177a;
        this.f162185e--;
        notifyAll();
    }

    @Override // t3.b
    public synchronized C17177a c() {
        C17177a c17177a;
        try {
            this.f162185e++;
            int i10 = this.f162186f;
            if (i10 > 0) {
                C17177a[] c17177aArr = this.f162187g;
                int i11 = i10 - 1;
                this.f162186f = i11;
                c17177a = (C17177a) C13599a.e(c17177aArr[i11]);
                this.f162187g[this.f162186f] = null;
            } else {
                c17177a = new C17177a(new byte[this.f162182b], 0);
                int i12 = this.f162185e;
                C17177a[] c17177aArr2 = this.f162187g;
                if (i12 > c17177aArr2.length) {
                    this.f162187g = (C17177a[]) Arrays.copyOf(c17177aArr2, c17177aArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c17177a;
    }

    @Override // t3.b
    public synchronized void d() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, P.j(this.f162184d, this.f162182b) - this.f162185e);
            int i11 = this.f162186f;
            if (iMax >= i11) {
                return;
            }
            if (this.f162183c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    C17177a c17177a = (C17177a) C13599a.e(this.f162187g[i10]);
                    if (c17177a.f162171a == this.f162183c) {
                        i10++;
                    } else {
                        C17177a c17177a2 = (C17177a) C13599a.e(this.f162187g[i12]);
                        if (c17177a2.f162171a != this.f162183c) {
                            i12--;
                        } else {
                            C17177a[] c17177aArr = this.f162187g;
                            c17177aArr[i10] = c17177a2;
                            c17177aArr[i12] = c17177a;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f162186f) {
                    return;
                }
            }
            Arrays.fill(this.f162187g, iMax, this.f162186f, (Object) null);
            this.f162186f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int f() {
        return this.f162185e * this.f162182b;
    }

    public synchronized void g() {
        if (this.f162181a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f162184d;
        this.f162184d = i10;
        if (z10) {
            d();
        }
    }

    public f(boolean z10, int i10, int i11) {
        C13599a.a(i10 > 0);
        C13599a.a(i11 >= 0);
        this.f162181a = z10;
        this.f162182b = i10;
        this.f162186f = i11;
        this.f162187g = new C17177a[i11 + 100];
        if (i11 <= 0) {
            this.f162183c = null;
            return;
        }
        this.f162183c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f162187g[i12] = new C17177a(this.f162183c, i12 * i10);
        }
    }

    @Override // t3.b
    public int e() {
        return this.f162182b;
    }
}
