package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes6.dex */
final class S4 {

    /* renamed from: a, reason: collision with root package name */
    private String f70011a;

    /* renamed from: b, reason: collision with root package name */
    private int f70012b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f70013c;

    /* renamed from: d, reason: collision with root package name */
    private int f70014d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f70015e;

    /* renamed from: k, reason: collision with root package name */
    private float f70021k;

    /* renamed from: l, reason: collision with root package name */
    private String f70022l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f70025o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f70026p;

    /* renamed from: r, reason: collision with root package name */
    private L4 f70028r;

    /* renamed from: f, reason: collision with root package name */
    private int f70016f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f70017g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f70018h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f70019i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f70020j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f70023m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f70024n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f70027q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f70029s = Float.MAX_VALUE;

    public final S4 A(float f10) {
        this.f70021k = f10;
        return this;
    }

    public final S4 B(int i10) {
        this.f70020j = i10;
        return this;
    }

    public final S4 C(String str) {
        this.f70022l = str;
        return this;
    }

    public final S4 D(boolean z10) {
        this.f70019i = z10 ? 1 : 0;
        return this;
    }

    public final S4 E(boolean z10) {
        this.f70016f = z10 ? 1 : 0;
        return this;
    }

    public final S4 F(Layout.Alignment alignment) {
        this.f70026p = alignment;
        return this;
    }

    public final S4 G(int i10) {
        this.f70024n = i10;
        return this;
    }

    public final S4 H(int i10) {
        this.f70023m = i10;
        return this;
    }

    public final S4 I(float f10) {
        this.f70029s = f10;
        return this;
    }

    public final S4 J(Layout.Alignment alignment) {
        this.f70025o = alignment;
        return this;
    }

    public final S4 a(boolean z10) {
        this.f70027q = z10 ? 1 : 0;
        return this;
    }

    public final S4 b(L4 l42) {
        this.f70028r = l42;
        return this;
    }

    public final S4 c(boolean z10) {
        this.f70017g = z10 ? 1 : 0;
        return this;
    }

    public final String d() {
        return this.f70011a;
    }

    public final String e() {
        return this.f70022l;
    }

    public final boolean f() {
        return this.f70027q == 1;
    }

    public final boolean g() {
        return this.f70015e;
    }

    public final boolean h() {
        return this.f70013c;
    }

    public final boolean i() {
        return this.f70016f == 1;
    }

    public final boolean j() {
        return this.f70017g == 1;
    }

    public final float k() {
        return this.f70021k;
    }

    public final float l() {
        return this.f70029s;
    }

    public final int o() {
        return this.f70020j;
    }

    public final int p() {
        return this.f70024n;
    }

    public final int q() {
        return this.f70023m;
    }

    public final int r() {
        int i10 = this.f70018h;
        if (i10 == -1 && this.f70019i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f70019i == 1 ? 2 : 0);
    }

    public final Layout.Alignment s() {
        return this.f70026p;
    }

    public final Layout.Alignment t() {
        return this.f70025o;
    }

    public final L4 u() {
        return this.f70028r;
    }

    public final S4 w(int i10) {
        this.f70014d = i10;
        this.f70015e = true;
        return this;
    }

    public final S4 x(boolean z10) {
        this.f70018h = z10 ? 1 : 0;
        return this;
    }

    public final S4 y(int i10) {
        this.f70012b = i10;
        this.f70013c = true;
        return this;
    }

    public final S4 z(String str) {
        this.f70011a = str;
        return this;
    }

    public final int m() {
        if (this.f70015e) {
            return this.f70014d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int n() {
        if (this.f70013c) {
            return this.f70012b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final S4 v(S4 s42) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (s42 != null) {
            if (!this.f70013c && s42.f70013c) {
                y(s42.f70012b);
            }
            if (this.f70018h == -1) {
                this.f70018h = s42.f70018h;
            }
            if (this.f70019i == -1) {
                this.f70019i = s42.f70019i;
            }
            if (this.f70011a == null && (str = s42.f70011a) != null) {
                this.f70011a = str;
            }
            if (this.f70016f == -1) {
                this.f70016f = s42.f70016f;
            }
            if (this.f70017g == -1) {
                this.f70017g = s42.f70017g;
            }
            if (this.f70024n == -1) {
                this.f70024n = s42.f70024n;
            }
            if (this.f70025o == null && (alignment2 = s42.f70025o) != null) {
                this.f70025o = alignment2;
            }
            if (this.f70026p == null && (alignment = s42.f70026p) != null) {
                this.f70026p = alignment;
            }
            if (this.f70027q == -1) {
                this.f70027q = s42.f70027q;
            }
            if (this.f70020j == -1) {
                this.f70020j = s42.f70020j;
                this.f70021k = s42.f70021k;
            }
            if (this.f70028r == null) {
                this.f70028r = s42.f70028r;
            }
            if (this.f70029s == Float.MAX_VALUE) {
                this.f70029s = s42.f70029s;
            }
            if (!this.f70015e && s42.f70015e) {
                w(s42.f70014d);
            }
            if (this.f70023m == -1 && (i10 = s42.f70023m) != -1) {
                this.f70023m = i10;
            }
        }
        return this;
    }
}
