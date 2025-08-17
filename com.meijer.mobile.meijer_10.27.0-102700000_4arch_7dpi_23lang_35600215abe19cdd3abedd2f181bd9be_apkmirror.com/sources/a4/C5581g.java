package a4;

import android.text.Layout;

/* renamed from: a4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5581g {

    /* renamed from: a, reason: collision with root package name */
    private String f44310a;

    /* renamed from: b, reason: collision with root package name */
    private int f44311b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f44312c;

    /* renamed from: d, reason: collision with root package name */
    private int f44313d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44314e;

    /* renamed from: k, reason: collision with root package name */
    private float f44320k;

    /* renamed from: l, reason: collision with root package name */
    private String f44321l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f44324o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f44325p;

    /* renamed from: r, reason: collision with root package name */
    private C5576b f44327r;

    /* renamed from: t, reason: collision with root package name */
    private String f44329t;

    /* renamed from: u, reason: collision with root package name */
    private String f44330u;

    /* renamed from: f, reason: collision with root package name */
    private int f44315f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f44316g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f44317h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f44318i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f44319j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f44322m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f44323n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f44326q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f44328s = Float.MAX_VALUE;

    public C5581g a(C5581g c5581g) {
        return t(c5581g, true);
    }

    private C5581g t(C5581g c5581g, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c5581g != null) {
            if (!this.f44312c && c5581g.f44312c) {
                z(c5581g.f44311b);
            }
            if (this.f44317h == -1) {
                this.f44317h = c5581g.f44317h;
            }
            if (this.f44318i == -1) {
                this.f44318i = c5581g.f44318i;
            }
            if (this.f44310a == null && (str = c5581g.f44310a) != null) {
                this.f44310a = str;
            }
            if (this.f44315f == -1) {
                this.f44315f = c5581g.f44315f;
            }
            if (this.f44316g == -1) {
                this.f44316g = c5581g.f44316g;
            }
            if (this.f44323n == -1) {
                this.f44323n = c5581g.f44323n;
            }
            if (this.f44324o == null && (alignment2 = c5581g.f44324o) != null) {
                this.f44324o = alignment2;
            }
            if (this.f44325p == null && (alignment = c5581g.f44325p) != null) {
                this.f44325p = alignment;
            }
            if (this.f44326q == -1) {
                this.f44326q = c5581g.f44326q;
            }
            if (this.f44319j == -1) {
                this.f44319j = c5581g.f44319j;
                this.f44320k = c5581g.f44320k;
            }
            if (this.f44327r == null) {
                this.f44327r = c5581g.f44327r;
            }
            if (this.f44328s == Float.MAX_VALUE) {
                this.f44328s = c5581g.f44328s;
            }
            if (this.f44329t == null) {
                this.f44329t = c5581g.f44329t;
            }
            if (this.f44330u == null) {
                this.f44330u = c5581g.f44330u;
            }
            if (z10 && !this.f44314e && c5581g.f44314e) {
                w(c5581g.f44313d);
            }
            if (z10 && this.f44322m == -1 && (i10 = c5581g.f44322m) != -1) {
                this.f44322m = i10;
            }
        }
        return this;
    }

    public C5581g A(String str) {
        this.f44310a = str;
        return this;
    }

    public C5581g B(float f10) {
        this.f44320k = f10;
        return this;
    }

    public C5581g C(int i10) {
        this.f44319j = i10;
        return this;
    }

    public C5581g D(String str) {
        this.f44321l = str;
        return this;
    }

    public C5581g E(boolean z10) {
        this.f44318i = z10 ? 1 : 0;
        return this;
    }

    public C5581g F(boolean z10) {
        this.f44315f = z10 ? 1 : 0;
        return this;
    }

    public C5581g G(Layout.Alignment alignment) {
        this.f44325p = alignment;
        return this;
    }

    public C5581g H(String str) {
        this.f44329t = str;
        return this;
    }

    public C5581g I(int i10) {
        this.f44323n = i10;
        return this;
    }

    public C5581g J(int i10) {
        this.f44322m = i10;
        return this;
    }

    public C5581g K(float f10) {
        this.f44328s = f10;
        return this;
    }

    public C5581g L(Layout.Alignment alignment) {
        this.f44324o = alignment;
        return this;
    }

    public C5581g M(boolean z10) {
        this.f44326q = z10 ? 1 : 0;
        return this;
    }

    public C5581g N(C5576b c5576b) {
        this.f44327r = c5576b;
        return this;
    }

    public C5581g O(boolean z10) {
        this.f44316g = z10 ? 1 : 0;
        return this;
    }

    public int b() {
        if (this.f44314e) {
            return this.f44313d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f44330u;
    }

    public int d() {
        if (this.f44312c) {
            return this.f44311b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f44310a;
    }

    public float f() {
        return this.f44320k;
    }

    public int g() {
        return this.f44319j;
    }

    public String h() {
        return this.f44321l;
    }

    public Layout.Alignment i() {
        return this.f44325p;
    }

    public String j() {
        return this.f44329t;
    }

    public int k() {
        return this.f44323n;
    }

    public int l() {
        return this.f44322m;
    }

    public float m() {
        return this.f44328s;
    }

    public int n() {
        int i10 = this.f44317h;
        if (i10 == -1 && this.f44318i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f44318i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f44324o;
    }

    public boolean p() {
        return this.f44326q == 1;
    }

    public C5576b q() {
        return this.f44327r;
    }

    public boolean r() {
        return this.f44314e;
    }

    public boolean s() {
        return this.f44312c;
    }

    public boolean u() {
        return this.f44315f == 1;
    }

    public boolean v() {
        return this.f44316g == 1;
    }

    public C5581g w(int i10) {
        this.f44313d = i10;
        this.f44314e = true;
        return this;
    }

    public C5581g x(boolean z10) {
        this.f44317h = z10 ? 1 : 0;
        return this;
    }

    public C5581g y(String str) {
        this.f44330u = str;
        return this;
    }

    public C5581g z(int i10) {
        this.f44311b = i10;
        this.f44312c = true;
        return this;
    }
}
