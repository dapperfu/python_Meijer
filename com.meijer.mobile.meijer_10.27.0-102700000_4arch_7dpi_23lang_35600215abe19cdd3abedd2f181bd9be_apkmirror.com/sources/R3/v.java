package R3;

import d3.D;
import java.io.IOException;
import x3.InterfaceC18012q;

/* loaded from: classes4.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    public c f31832a;

    /* renamed from: b, reason: collision with root package name */
    public long f31833b;

    /* renamed from: c, reason: collision with root package name */
    public long f31834c;

    /* renamed from: d, reason: collision with root package name */
    public long f31835d;

    /* renamed from: e, reason: collision with root package name */
    public int f31836e;

    /* renamed from: f, reason: collision with root package name */
    public int f31837f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31843l;

    /* renamed from: n, reason: collision with root package name */
    public u f31845n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31847p;

    /* renamed from: q, reason: collision with root package name */
    public long f31848q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31849r;

    /* renamed from: g, reason: collision with root package name */
    public long[] f31838g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f31839h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f31840i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public long[] f31841j = new long[0];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f31842k = new boolean[0];

    /* renamed from: m, reason: collision with root package name */
    public boolean[] f31844m = new boolean[0];

    /* renamed from: o, reason: collision with root package name */
    public final D f31846o = new D();

    public void f() {
        this.f31836e = 0;
        this.f31848q = 0L;
        this.f31849r = false;
        this.f31843l = false;
        this.f31847p = false;
        this.f31845n = null;
    }

    public void a(D d10) {
        d10.l(this.f31846o.e(), 0, this.f31846o.g());
        this.f31846o.W(0);
        this.f31847p = false;
    }

    public void b(InterfaceC18012q interfaceC18012q) throws IOException {
        interfaceC18012q.readFully(this.f31846o.e(), 0, this.f31846o.g());
        this.f31846o.W(0);
        this.f31847p = false;
    }

    public long c(int i10) {
        return this.f31841j[i10];
    }

    public void d(int i10) {
        this.f31846o.S(i10);
        this.f31843l = true;
        this.f31847p = true;
    }

    public void e(int i10, int i11) {
        this.f31836e = i10;
        this.f31837f = i11;
        if (this.f31839h.length < i10) {
            this.f31838g = new long[i10];
            this.f31839h = new int[i10];
        }
        if (this.f31840i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f31840i = new int[i12];
            this.f31841j = new long[i12];
            this.f31842k = new boolean[i12];
            this.f31844m = new boolean[i12];
        }
    }

    public boolean g(int i10) {
        return this.f31843l && this.f31844m[i10];
    }
}
