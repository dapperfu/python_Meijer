package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes6.dex */
final class S4 {

    /* renamed from: a, reason: collision with root package name */
    private String f70851a;

    /* renamed from: b, reason: collision with root package name */
    private int f70852b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f70853c;

    /* renamed from: d, reason: collision with root package name */
    private int f70854d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f70855e;

    /* renamed from: k, reason: collision with root package name */
    private float f70861k;

    /* renamed from: l, reason: collision with root package name */
    private String f70862l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f70865o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f70866p;

    /* renamed from: r, reason: collision with root package name */
    private L4 f70868r;

    /* renamed from: f, reason: collision with root package name */
    private int f70856f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f70857g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f70858h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f70859i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f70860j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f70863m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f70864n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f70867q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f70869s = Float.MAX_VALUE;

    public final S4 A(float f10) {
        this.f70861k = f10;
        return this;
    }

    public final S4 B(int i10) {
        this.f70860j = i10;
        return this;
    }

    public final S4 C(String str) {
        this.f70862l = str;
        return this;
    }

    public final S4 D(boolean z10) {
        this.f70859i = z10 ? 1 : 0;
        return this;
    }

    public final S4 E(boolean z10) {
        this.f70856f = z10 ? 1 : 0;
        return this;
    }

    public final S4 F(Layout.Alignment alignment) {
        this.f70866p = alignment;
        return this;
    }

    public final S4 G(int i10) {
        this.f70864n = i10;
        return this;
    }

    public final S4 H(int i10) {
        this.f70863m = i10;
        return this;
    }

    public final S4 I(float f10) {
        this.f70869s = f10;
        return this;
    }

    public final S4 J(Layout.Alignment alignment) {
        this.f70865o = alignment;
        return this;
    }

    public final S4 a(boolean z10) {
        this.f70867q = z10 ? 1 : 0;
        return this;
    }

    public final S4 b(L4 l42) {
        this.f70868r = l42;
        return this;
    }

    public final S4 c(boolean z10) {
        this.f70857g = z10 ? 1 : 0;
        return this;
    }

    public final String d() {
        return this.f70851a;
    }

    public final String e() {
        return this.f70862l;
    }

    public final boolean f() {
        return this.f70867q == 1;
    }

    public final boolean g() {
        return this.f70855e;
    }

    public final boolean h() {
        return this.f70853c;
    }

    public final boolean i() {
        return this.f70856f == 1;
    }

    public final boolean j() {
        return this.f70857g == 1;
    }

    public final float k() {
        return this.f70861k;
    }

    public final float l() {
        return this.f70869s;
    }

    public final int o() {
        return this.f70860j;
    }

    public final int p() {
        return this.f70864n;
    }

    public final int q() {
        return this.f70863m;
    }

    public final int r() {
        int i10 = this.f70858h;
        if (i10 == -1 && this.f70859i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f70859i == 1 ? 2 : 0);
    }

    public final Layout.Alignment s() {
        return this.f70866p;
    }

    public final Layout.Alignment t() {
        return this.f70865o;
    }

    public final L4 u() {
        return this.f70868r;
    }

    public final S4 w(int i10) {
        this.f70854d = i10;
        this.f70855e = true;
        return this;
    }

    public final S4 x(boolean z10) {
        this.f70858h = z10 ? 1 : 0;
        return this;
    }

    public final S4 y(int i10) {
        this.f70852b = i10;
        this.f70853c = true;
        return this;
    }

    public final S4 z(String str) {
        this.f70851a = str;
        return this;
    }

    public final int m() {
        if (this.f70855e) {
            return this.f70854d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int n() {
        if (this.f70853c) {
            return this.f70852b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final S4 v(S4 s42) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (s42 != null) {
            if (!this.f70853c && s42.f70853c) {
                y(s42.f70852b);
            }
            if (this.f70858h == -1) {
                this.f70858h = s42.f70858h;
            }
            if (this.f70859i == -1) {
                this.f70859i = s42.f70859i;
            }
            if (this.f70851a == null && (str = s42.f70851a) != null) {
                this.f70851a = str;
            }
            if (this.f70856f == -1) {
                this.f70856f = s42.f70856f;
            }
            if (this.f70857g == -1) {
                this.f70857g = s42.f70857g;
            }
            if (this.f70864n == -1) {
                this.f70864n = s42.f70864n;
            }
            if (this.f70865o == null && (alignment2 = s42.f70865o) != null) {
                this.f70865o = alignment2;
            }
            if (this.f70866p == null && (alignment = s42.f70866p) != null) {
                this.f70866p = alignment;
            }
            if (this.f70867q == -1) {
                this.f70867q = s42.f70867q;
            }
            if (this.f70860j == -1) {
                this.f70860j = s42.f70860j;
                this.f70861k = s42.f70861k;
            }
            if (this.f70868r == null) {
                this.f70868r = s42.f70868r;
            }
            if (this.f70869s == Float.MAX_VALUE) {
                this.f70869s = s42.f70869s;
            }
            if (!this.f70855e && s42.f70855e) {
                w(s42.f70854d);
            }
            if (this.f70863m == -1 && (i10 = s42.f70863m) != -1) {
                this.f70863m = i10;
            }
        }
        return this;
    }
}
