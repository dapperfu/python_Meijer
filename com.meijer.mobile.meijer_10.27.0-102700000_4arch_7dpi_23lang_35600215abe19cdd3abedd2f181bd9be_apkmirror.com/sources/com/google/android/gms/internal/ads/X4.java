package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public final class X4 {

    /* renamed from: f, reason: collision with root package name */
    private int f71242f;

    /* renamed from: h, reason: collision with root package name */
    private int f71244h;

    /* renamed from: n, reason: collision with root package name */
    private float f71250n;

    /* renamed from: a, reason: collision with root package name */
    private String f71237a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f71238b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set f71239c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    private String f71240d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f71241e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f71243g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f71245i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f71246j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f71247k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f71248l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f71249m = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f71251o = -1;

    /* renamed from: p, reason: collision with root package name */
    private boolean f71252p = false;

    public final boolean A() {
        return this.f71246j == 1;
    }

    public final float b() {
        return this.f71250n;
    }

    public final int e() {
        return this.f71249m;
    }

    public final int f() {
        return this.f71251o;
    }

    public final int h() {
        int i10 = this.f71247k;
        if (i10 == -1 && this.f71248l == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f71248l == 1 ? 2 : 0);
    }

    public final X4 i(int i10) {
        this.f71244h = i10;
        this.f71245i = true;
        return this;
    }

    public final X4 j(boolean z10) {
        this.f71247k = 1;
        return this;
    }

    public final X4 k(boolean z10) {
        this.f71252p = z10;
        return this;
    }

    public final X4 l(int i10) {
        this.f71242f = i10;
        this.f71243g = true;
        return this;
    }

    public final X4 n(float f10) {
        this.f71250n = f10;
        return this;
    }

    public final X4 o(int i10) {
        this.f71249m = i10;
        return this;
    }

    public final X4 p(boolean z10) {
        this.f71248l = 1;
        return this;
    }

    public final X4 q(int i10) {
        this.f71251o = i10;
        return this;
    }

    public final X4 r(boolean z10) {
        this.f71246j = 1;
        return this;
    }

    public final String s() {
        return this.f71241e;
    }

    public final void u(String str) {
        this.f71237a = str;
    }

    public final void v(String str) {
        this.f71238b = str;
    }

    public final void w(String str) {
        this.f71240d = str;
    }

    public final boolean x() {
        return this.f71252p;
    }

    public final boolean y() {
        return this.f71245i;
    }

    public final boolean z() {
        return this.f71243g;
    }

    public final int c() {
        if (this.f71245i) {
            return this.f71244h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final int d() {
        if (this.f71243g) {
            return this.f71242f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final int g(String str, String str2, Set set, String str3) {
        if (this.f71237a.isEmpty() && this.f71238b.isEmpty() && this.f71239c.isEmpty() && this.f71240d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f71237a, str, 1073741824), this.f71238b, str2, 2), this.f71240d, str3, 4);
        if (iA == -1 || !set.containsAll(this.f71239c)) {
            return 0;
        }
        return iA + (this.f71239c.size() * 4);
    }

    public final void t(String[] strArr) {
        this.f71239c = new HashSet(Arrays.asList(strArr));
    }

    private static int a(int i10, String str, String str2, int i11) {
        if (!str.isEmpty() && i10 != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i10 + i11;
        }
        return i10;
    }

    public final X4 m(String str) {
        this.f71241e = C8446jf0.a(str);
        return this;
    }
}
