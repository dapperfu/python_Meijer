package a4;

import android.text.Layout;

/* loaded from: classes4.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f45128a;

    /* renamed from: b, reason: collision with root package name */
    private int f45129b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f45130c;

    /* renamed from: d, reason: collision with root package name */
    private int f45131d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45132e;

    /* renamed from: k, reason: collision with root package name */
    private float f45138k;

    /* renamed from: l, reason: collision with root package name */
    private String f45139l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f45142o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f45143p;

    /* renamed from: r, reason: collision with root package name */
    private C5659b f45145r;

    /* renamed from: t, reason: collision with root package name */
    private String f45147t;

    /* renamed from: u, reason: collision with root package name */
    private String f45148u;

    /* renamed from: f, reason: collision with root package name */
    private int f45133f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f45134g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f45135h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f45136i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f45137j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f45140m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f45141n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f45144q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f45146s = Float.MAX_VALUE;

    public g a(g gVar) {
        return t(gVar, true);
    }

    private g t(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f45130c && gVar.f45130c) {
                z(gVar.f45129b);
            }
            if (this.f45135h == -1) {
                this.f45135h = gVar.f45135h;
            }
            if (this.f45136i == -1) {
                this.f45136i = gVar.f45136i;
            }
            if (this.f45128a == null && (str = gVar.f45128a) != null) {
                this.f45128a = str;
            }
            if (this.f45133f == -1) {
                this.f45133f = gVar.f45133f;
            }
            if (this.f45134g == -1) {
                this.f45134g = gVar.f45134g;
            }
            if (this.f45141n == -1) {
                this.f45141n = gVar.f45141n;
            }
            if (this.f45142o == null && (alignment2 = gVar.f45142o) != null) {
                this.f45142o = alignment2;
            }
            if (this.f45143p == null && (alignment = gVar.f45143p) != null) {
                this.f45143p = alignment;
            }
            if (this.f45144q == -1) {
                this.f45144q = gVar.f45144q;
            }
            if (this.f45137j == -1) {
                this.f45137j = gVar.f45137j;
                this.f45138k = gVar.f45138k;
            }
            if (this.f45145r == null) {
                this.f45145r = gVar.f45145r;
            }
            if (this.f45146s == Float.MAX_VALUE) {
                this.f45146s = gVar.f45146s;
            }
            if (this.f45147t == null) {
                this.f45147t = gVar.f45147t;
            }
            if (this.f45148u == null) {
                this.f45148u = gVar.f45148u;
            }
            if (z10 && !this.f45132e && gVar.f45132e) {
                w(gVar.f45131d);
            }
            if (z10 && this.f45140m == -1 && (i10 = gVar.f45140m) != -1) {
                this.f45140m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f45128a = str;
        return this;
    }

    public g B(float f10) {
        this.f45138k = f10;
        return this;
    }

    public g C(int i10) {
        this.f45137j = i10;
        return this;
    }

    public g D(String str) {
        this.f45139l = str;
        return this;
    }

    public g E(boolean z10) {
        this.f45136i = z10 ? 1 : 0;
        return this;
    }

    public g F(boolean z10) {
        this.f45133f = z10 ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.f45143p = alignment;
        return this;
    }

    public g H(String str) {
        this.f45147t = str;
        return this;
    }

    public g I(int i10) {
        this.f45141n = i10;
        return this;
    }

    public g J(int i10) {
        this.f45140m = i10;
        return this;
    }

    public g K(float f10) {
        this.f45146s = f10;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.f45142o = alignment;
        return this;
    }

    public g M(boolean z10) {
        this.f45144q = z10 ? 1 : 0;
        return this;
    }

    public g N(C5659b c5659b) {
        this.f45145r = c5659b;
        return this;
    }

    public g O(boolean z10) {
        this.f45134g = z10 ? 1 : 0;
        return this;
    }

    public int b() {
        if (this.f45132e) {
            return this.f45131d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f45148u;
    }

    public int d() {
        if (this.f45130c) {
            return this.f45129b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f45128a;
    }

    public float f() {
        return this.f45138k;
    }

    public int g() {
        return this.f45137j;
    }

    public String h() {
        return this.f45139l;
    }

    public Layout.Alignment i() {
        return this.f45143p;
    }

    public String j() {
        return this.f45147t;
    }

    public int k() {
        return this.f45141n;
    }

    public int l() {
        return this.f45140m;
    }

    public float m() {
        return this.f45146s;
    }

    public int n() {
        int i10 = this.f45135h;
        if (i10 == -1 && this.f45136i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f45136i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f45142o;
    }

    public boolean p() {
        return this.f45144q == 1;
    }

    public C5659b q() {
        return this.f45145r;
    }

    public boolean r() {
        return this.f45132e;
    }

    public boolean s() {
        return this.f45130c;
    }

    public boolean u() {
        return this.f45133f == 1;
    }

    public boolean v() {
        return this.f45134g == 1;
    }

    public g w(int i10) {
        this.f45131d = i10;
        this.f45132e = true;
        return this;
    }

    public g x(boolean z10) {
        this.f45135h = z10 ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.f45148u = str;
        return this;
    }

    public g z(int i10) {
        this.f45129b = i10;
        this.f45130c = true;
        return this;
    }
}
