package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public final class X4 {

    /* renamed from: f, reason: collision with root package name */
    private int f72082f;

    /* renamed from: h, reason: collision with root package name */
    private int f72084h;

    /* renamed from: n, reason: collision with root package name */
    private float f72090n;

    /* renamed from: a, reason: collision with root package name */
    private String f72077a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f72078b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set f72079c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    private String f72080d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f72081e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f72083g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f72085i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f72086j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f72087k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f72088l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f72089m = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f72091o = -1;

    /* renamed from: p, reason: collision with root package name */
    private boolean f72092p = false;

    public final boolean A() {
        return this.f72086j == 1;
    }

    public final float b() {
        return this.f72090n;
    }

    public final int e() {
        return this.f72089m;
    }

    public final int f() {
        return this.f72091o;
    }

    public final int h() {
        int i10 = this.f72087k;
        if (i10 == -1 && this.f72088l == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f72088l == 1 ? 2 : 0);
    }

    public final X4 i(int i10) {
        this.f72084h = i10;
        this.f72085i = true;
        return this;
    }

    public final X4 j(boolean z10) {
        this.f72087k = 1;
        return this;
    }

    public final X4 k(boolean z10) {
        this.f72092p = z10;
        return this;
    }

    public final X4 l(int i10) {
        this.f72082f = i10;
        this.f72083g = true;
        return this;
    }

    public final X4 n(float f10) {
        this.f72090n = f10;
        return this;
    }

    public final X4 o(int i10) {
        this.f72089m = i10;
        return this;
    }

    public final X4 p(boolean z10) {
        this.f72088l = 1;
        return this;
    }

    public final X4 q(int i10) {
        this.f72091o = i10;
        return this;
    }

    public final X4 r(boolean z10) {
        this.f72086j = 1;
        return this;
    }

    public final String s() {
        return this.f72081e;
    }

    public final void u(String str) {
        this.f72077a = str;
    }

    public final void v(String str) {
        this.f72078b = str;
    }

    public final void w(String str) {
        this.f72080d = str;
    }

    public final boolean x() {
        return this.f72092p;
    }

    public final boolean y() {
        return this.f72085i;
    }

    public final boolean z() {
        return this.f72083g;
    }

    public final int c() {
        if (this.f72085i) {
            return this.f72084h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final int d() {
        if (this.f72083g) {
            return this.f72082f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final int g(String str, String str2, Set set, String str3) {
        if (this.f72077a.isEmpty() && this.f72078b.isEmpty() && this.f72079c.isEmpty() && this.f72080d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f72077a, str, 1073741824), this.f72078b, str2, 2), this.f72080d, str3, 4);
        if (iA == -1 || !set.containsAll(this.f72079c)) {
            return 0;
        }
        return iA + (this.f72079c.size() * 4);
    }

    public final void t(String[] strArr) {
        this.f72079c = new HashSet(Arrays.asList(strArr));
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
        this.f72081e = C8571jf0.a(str);
        return this;
    }
}
