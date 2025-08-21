package R3;

import d3.D;
import java.io.IOException;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    public c f31834a;

    /* renamed from: b, reason: collision with root package name */
    public long f31835b;

    /* renamed from: c, reason: collision with root package name */
    public long f31836c;

    /* renamed from: d, reason: collision with root package name */
    public long f31837d;

    /* renamed from: e, reason: collision with root package name */
    public int f31838e;

    /* renamed from: f, reason: collision with root package name */
    public int f31839f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31845l;

    /* renamed from: n, reason: collision with root package name */
    public u f31847n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31849p;

    /* renamed from: q, reason: collision with root package name */
    public long f31850q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31851r;

    /* renamed from: g, reason: collision with root package name */
    public long[] f31840g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f31841h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f31842i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public long[] f31843j = new long[0];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f31844k = new boolean[0];

    /* renamed from: m, reason: collision with root package name */
    public boolean[] f31846m = new boolean[0];

    /* renamed from: o, reason: collision with root package name */
    public final D f31848o = new D();

    public void f() {
        this.f31838e = 0;
        this.f31850q = 0L;
        this.f31851r = false;
        this.f31845l = false;
        this.f31849p = false;
        this.f31847n = null;
    }

    public void a(D d10) {
        d10.l(this.f31848o.e(), 0, this.f31848o.g());
        this.f31848o.W(0);
        this.f31849p = false;
    }

    public void b(InterfaceC18078q interfaceC18078q) throws IOException {
        interfaceC18078q.readFully(this.f31848o.e(), 0, this.f31848o.g());
        this.f31848o.W(0);
        this.f31849p = false;
    }

    public long c(int i10) {
        return this.f31843j[i10];
    }

    public void d(int i10) {
        this.f31848o.S(i10);
        this.f31845l = true;
        this.f31849p = true;
    }

    public void e(int i10, int i11) {
        this.f31838e = i10;
        this.f31839f = i11;
        if (this.f31841h.length < i10) {
            this.f31840g = new long[i10];
            this.f31841h = new int[i10];
        }
        if (this.f31842i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f31842i = new int[i12];
            this.f31843j = new long[i12];
            this.f31844k = new boolean[i12];
            this.f31846m = new boolean[i12];
        }
    }

    public boolean g(int i10) {
        return this.f31845l && this.f31846m[i10];
    }
}
