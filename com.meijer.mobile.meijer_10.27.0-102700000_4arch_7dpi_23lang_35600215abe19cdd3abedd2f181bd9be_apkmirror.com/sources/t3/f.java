package t3;

import d3.C13466a;
import d3.P;
import java.util.Arrays;
import t3.b;

/* loaded from: classes.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f161371a;

    /* renamed from: b, reason: collision with root package name */
    private final int f161372b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f161373c;

    /* renamed from: d, reason: collision with root package name */
    private int f161374d;

    /* renamed from: e, reason: collision with root package name */
    private int f161375e;

    /* renamed from: f, reason: collision with root package name */
    private int f161376f;

    /* renamed from: g, reason: collision with root package name */
    private C17058a[] f161377g;

    public f(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // t3.b
    public synchronized void a(b.a aVar) {
        while (aVar != null) {
            try {
                C17058a[] c17058aArr = this.f161377g;
                int i10 = this.f161376f;
                this.f161376f = i10 + 1;
                c17058aArr[i10] = aVar.a();
                this.f161375e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // t3.b
    public synchronized void b(C17058a c17058a) {
        C17058a[] c17058aArr = this.f161377g;
        int i10 = this.f161376f;
        this.f161376f = i10 + 1;
        c17058aArr[i10] = c17058a;
        this.f161375e--;
        notifyAll();
    }

    @Override // t3.b
    public synchronized C17058a c() {
        C17058a c17058a;
        try {
            this.f161375e++;
            int i10 = this.f161376f;
            if (i10 > 0) {
                C17058a[] c17058aArr = this.f161377g;
                int i11 = i10 - 1;
                this.f161376f = i11;
                c17058a = (C17058a) C13466a.e(c17058aArr[i11]);
                this.f161377g[this.f161376f] = null;
            } else {
                c17058a = new C17058a(new byte[this.f161372b], 0);
                int i12 = this.f161375e;
                C17058a[] c17058aArr2 = this.f161377g;
                if (i12 > c17058aArr2.length) {
                    this.f161377g = (C17058a[]) Arrays.copyOf(c17058aArr2, c17058aArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c17058a;
    }

    @Override // t3.b
    public synchronized void d() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, P.j(this.f161374d, this.f161372b) - this.f161375e);
            int i11 = this.f161376f;
            if (iMax >= i11) {
                return;
            }
            if (this.f161373c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    C17058a c17058a = (C17058a) C13466a.e(this.f161377g[i10]);
                    if (c17058a.f161361a == this.f161373c) {
                        i10++;
                    } else {
                        C17058a c17058a2 = (C17058a) C13466a.e(this.f161377g[i12]);
                        if (c17058a2.f161361a != this.f161373c) {
                            i12--;
                        } else {
                            C17058a[] c17058aArr = this.f161377g;
                            c17058aArr[i10] = c17058a2;
                            c17058aArr[i12] = c17058a;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f161376f) {
                    return;
                }
            }
            Arrays.fill(this.f161377g, iMax, this.f161376f, (Object) null);
            this.f161376f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int f() {
        return this.f161375e * this.f161372b;
    }

    public synchronized void g() {
        if (this.f161371a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f161374d;
        this.f161374d = i10;
        if (z10) {
            d();
        }
    }

    public f(boolean z10, int i10, int i11) {
        C13466a.a(i10 > 0);
        C13466a.a(i11 >= 0);
        this.f161371a = z10;
        this.f161372b = i10;
        this.f161376f = i11;
        this.f161377g = new C17058a[i11 + 100];
        if (i11 <= 0) {
            this.f161373c = null;
            return;
        }
        this.f161373c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f161377g[i12] = new C17058a(this.f161373c, i12 * i10);
        }
    }

    @Override // t3.b
    public int e() {
        return this.f161372b;
    }
}
