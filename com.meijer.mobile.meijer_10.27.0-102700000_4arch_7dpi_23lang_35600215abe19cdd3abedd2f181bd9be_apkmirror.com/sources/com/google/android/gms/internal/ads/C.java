package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class C {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f65637M = 0;

    /* renamed from: A, reason: collision with root package name */
    public final byte[] f65638A;

    /* renamed from: B, reason: collision with root package name */
    public final int f65639B;

    /* renamed from: C, reason: collision with root package name */
    public final Vz0 f65640C;

    /* renamed from: D, reason: collision with root package name */
    public final int f65641D;

    /* renamed from: E, reason: collision with root package name */
    public final int f65642E;

    /* renamed from: F, reason: collision with root package name */
    public final int f65643F;

    /* renamed from: G, reason: collision with root package name */
    public final int f65644G;

    /* renamed from: H, reason: collision with root package name */
    public final int f65645H;

    /* renamed from: I, reason: collision with root package name */
    public final int f65646I;

    /* renamed from: J, reason: collision with root package name */
    public final int f65647J;

    /* renamed from: K, reason: collision with root package name */
    public final int f65648K;

    /* renamed from: L, reason: collision with root package name */
    private int f65649L;

    /* renamed from: a, reason: collision with root package name */
    public final String f65650a;

    /* renamed from: b, reason: collision with root package name */
    public final String f65651b;

    /* renamed from: c, reason: collision with root package name */
    public final List f65652c;

    /* renamed from: d, reason: collision with root package name */
    public final String f65653d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65654e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65655f;

    /* renamed from: g, reason: collision with root package name */
    public final int f65656g;

    /* renamed from: h, reason: collision with root package name */
    public final int f65657h;

    /* renamed from: i, reason: collision with root package name */
    public final int f65658i;

    /* renamed from: j, reason: collision with root package name */
    public final int f65659j;

    /* renamed from: k, reason: collision with root package name */
    public final String f65660k;

    /* renamed from: l, reason: collision with root package name */
    public final C8651lb f65661l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f65662m;

    /* renamed from: n, reason: collision with root package name */
    public final String f65663n;

    /* renamed from: o, reason: collision with root package name */
    public final String f65664o;

    /* renamed from: p, reason: collision with root package name */
    public final int f65665p;

    /* renamed from: q, reason: collision with root package name */
    public final int f65666q;

    /* renamed from: r, reason: collision with root package name */
    public final List f65667r;

    /* renamed from: s, reason: collision with root package name */
    public final TE0 f65668s;

    /* renamed from: t, reason: collision with root package name */
    public final long f65669t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f65670u;

    /* renamed from: v, reason: collision with root package name */
    public final int f65671v;

    /* renamed from: w, reason: collision with root package name */
    public final int f65672w;

    /* renamed from: x, reason: collision with root package name */
    public final float f65673x;

    /* renamed from: y, reason: collision with root package name */
    public final int f65674y;

    /* renamed from: z, reason: collision with root package name */
    public final float f65675z;

    public final int a() {
        int i10;
        int i11 = this.f65671v;
        if (i11 == -1 || (i10 = this.f65672w) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final C9592uH0 b() {
        return new C9592uH0(this, null);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && C.class == obj.getClass()) {
            C c10 = (C) obj;
            int i11 = this.f65649L;
            if ((i11 == 0 || (i10 = c10.f65649L) == 0 || i11 == i10) && this.f65654e == c10.f65654e && this.f65655f == c10.f65655f && this.f65657h == c10.f65657h && this.f65658i == c10.f65658i && this.f65665p == c10.f65665p && this.f65669t == c10.f65669t && this.f65671v == c10.f65671v && this.f65672w == c10.f65672w && this.f65674y == c10.f65674y && this.f65639B == c10.f65639B && this.f65641D == c10.f65641D && this.f65642E == c10.f65642E && this.f65643F == c10.f65643F && this.f65644G == c10.f65644G && this.f65645H == c10.f65645H && this.f65646I == c10.f65646I && this.f65648K == c10.f65648K && Float.compare(this.f65673x, c10.f65673x) == 0 && Float.compare(this.f65675z, c10.f65675z) == 0 && Objects.equals(this.f65650a, c10.f65650a) && Objects.equals(this.f65651b, c10.f65651b) && this.f65652c.equals(c10.f65652c) && Objects.equals(this.f65660k, c10.f65660k) && Objects.equals(this.f65663n, c10.f65663n) && Objects.equals(this.f65664o, c10.f65664o) && Objects.equals(this.f65653d, c10.f65653d) && Arrays.equals(this.f65638A, c10.f65638A) && Objects.equals(this.f65661l, c10.f65661l) && Objects.equals(this.f65640C, c10.f65640C) && Objects.equals(this.f65668s, c10.f65668s) && d(c10)) {
                return true;
            }
        }
        return false;
    }

    static {
        new C(new C9592uH0());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
    }

    private C(C9592uH0 c9592uH0) {
        boolean z10;
        String str;
        this.f65650a = c9592uH0.f78797a;
        String strE = OV.e(c9592uH0.f78800d);
        this.f65653d = strE;
        if (c9592uH0.f78799c.isEmpty() && c9592uH0.f78798b != null) {
            this.f65652c = AbstractC7917eh0.u(new D0(strE, c9592uH0.f78798b));
            this.f65651b = c9592uH0.f78798b;
        } else if (!c9592uH0.f78799c.isEmpty() && c9592uH0.f78798b == null) {
            this.f65652c = c9592uH0.f78799c;
            List list = c9592uH0.f78799c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((D0) list.get(0)).f66100b;
                    break;
                }
                D0 d02 = (D0) it.next();
                if (TextUtils.equals(d02.f66099a, strE)) {
                    str = d02.f66100b;
                    break;
                }
            }
            this.f65651b = str;
        } else if (c9592uH0.f78799c.isEmpty() && c9592uH0.f78798b == null) {
            z10 = true;
            C8086gC.f(z10);
            this.f65652c = c9592uH0.f78799c;
            this.f65651b = c9592uH0.f78798b;
        } else {
            for (int i10 = 0; i10 < c9592uH0.f78799c.size(); i10++) {
                if (((D0) c9592uH0.f78799c.get(i10)).f66100b.equals(c9592uH0.f78798b)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            C8086gC.f(z10);
            this.f65652c = c9592uH0.f78799c;
            this.f65651b = c9592uH0.f78798b;
        }
        this.f65654e = c9592uH0.f78801e;
        C8086gC.g(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f65655f = c9592uH0.f78802f;
        this.f65656g = 0;
        int i11 = c9592uH0.f78804h;
        this.f65657h = i11;
        int i12 = c9592uH0.f78805i;
        this.f65658i = i12;
        this.f65659j = i12 != -1 ? i12 : i11;
        this.f65660k = c9592uH0.f78806j;
        this.f65661l = c9592uH0.f78807k;
        this.f65662m = null;
        this.f65663n = c9592uH0.f78808l;
        this.f65664o = c9592uH0.f78809m;
        this.f65665p = c9592uH0.f78810n;
        this.f65666q = c9592uH0.f78811o;
        this.f65667r = c9592uH0.f78812p == null ? Collections.EMPTY_LIST : c9592uH0.f78812p;
        TE0 te0 = c9592uH0.f78813q;
        this.f65668s = te0;
        this.f65669t = c9592uH0.f78814r;
        this.f65670u = c9592uH0.f78815s;
        this.f65671v = c9592uH0.f78816t;
        this.f65672w = c9592uH0.f78817u;
        this.f65673x = c9592uH0.f78818v;
        this.f65674y = c9592uH0.f78819w == -1 ? 0 : c9592uH0.f78819w;
        this.f65675z = c9592uH0.f78820x == -1.0f ? 1.0f : c9592uH0.f78820x;
        this.f65638A = c9592uH0.f78821y;
        this.f65639B = c9592uH0.f78822z;
        this.f65640C = c9592uH0.f78788A;
        this.f65641D = c9592uH0.f78789B;
        this.f65642E = c9592uH0.f78790C;
        this.f65643F = c9592uH0.f78791D;
        this.f65644G = c9592uH0.f78792E == -1 ? 0 : c9592uH0.f78792E;
        this.f65645H = c9592uH0.f78793F != -1 ? c9592uH0.f78793F : 0;
        this.f65646I = c9592uH0.f78794G;
        this.f65647J = c9592uH0.f78795H;
        if (c9592uH0.f78796I != 0 || te0 == null) {
            this.f65648K = c9592uH0.f78796I;
        } else {
            this.f65648K = 1;
        }
    }

    public final C c(int i10) {
        C9592uH0 c9592uH0 = new C9592uH0(this, null);
        c9592uH0.d(i10);
        return new C(c9592uH0);
    }

    public final boolean d(C c10) {
        if (this.f65667r.size() != c10.f65667r.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f65667r.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f65667r.get(i10), (byte[]) c10.f65667r.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f65649L;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f65650a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f65651b;
        int iHashCode2 = ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f65652c.hashCode();
        String str3 = this.f65653d;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f65654e) * 31) + this.f65655f) * 961) + this.f65657h) * 31) + this.f65658i) * 31;
        String str4 = this.f65660k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C8651lb c8651lb = this.f65661l;
        int iHashCode5 = (iHashCode4 + (c8651lb == null ? 0 : c8651lb.hashCode())) * 961;
        String str5 = this.f65663n;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iHashCode7 = ((((((((((((((((((((((((((((((((((iHashCode6 + (this.f65664o != null ? r2.hashCode() : 0)) * 31) + this.f65665p) * 31) + ((int) this.f65669t)) * 31) + this.f65671v) * 31) + this.f65672w) * 31) + Float.floatToIntBits(this.f65673x)) * 31) + this.f65674y) * 31) + Float.floatToIntBits(this.f65675z)) * 31) + this.f65639B) * 31) + this.f65641D) * 31) + this.f65642E) * 31) + this.f65643F) * 31) + this.f65644G) * 31) + this.f65645H) * 31) + this.f65646I) * 31) - 1) * 31) - 1) * 31) + this.f65648K;
        this.f65649L = iHashCode7;
        return iHashCode7;
    }

    public final String toString() {
        return "Format(" + this.f65650a + ", " + this.f65651b + ", " + this.f65663n + ", " + this.f65664o + ", " + this.f65660k + ", " + this.f65659j + ", " + this.f65653d + ", [" + this.f65671v + ", " + this.f65672w + ", " + this.f65673x + ", " + String.valueOf(this.f65640C) + "], [" + this.f65641D + ", " + this.f65642E + "])";
    }
}
