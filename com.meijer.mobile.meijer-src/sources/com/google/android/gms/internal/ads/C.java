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
    public static final /* synthetic */ int f66477M = 0;

    /* renamed from: A, reason: collision with root package name */
    public final byte[] f66478A;

    /* renamed from: B, reason: collision with root package name */
    public final int f66479B;

    /* renamed from: C, reason: collision with root package name */
    public final Vz0 f66480C;

    /* renamed from: D, reason: collision with root package name */
    public final int f66481D;

    /* renamed from: E, reason: collision with root package name */
    public final int f66482E;

    /* renamed from: F, reason: collision with root package name */
    public final int f66483F;

    /* renamed from: G, reason: collision with root package name */
    public final int f66484G;

    /* renamed from: H, reason: collision with root package name */
    public final int f66485H;

    /* renamed from: I, reason: collision with root package name */
    public final int f66486I;

    /* renamed from: J, reason: collision with root package name */
    public final int f66487J;

    /* renamed from: K, reason: collision with root package name */
    public final int f66488K;

    /* renamed from: L, reason: collision with root package name */
    private int f66489L;

    /* renamed from: a, reason: collision with root package name */
    public final String f66490a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66491b;

    /* renamed from: c, reason: collision with root package name */
    public final List f66492c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66493d;

    /* renamed from: e, reason: collision with root package name */
    public final int f66494e;

    /* renamed from: f, reason: collision with root package name */
    public final int f66495f;

    /* renamed from: g, reason: collision with root package name */
    public final int f66496g;

    /* renamed from: h, reason: collision with root package name */
    public final int f66497h;

    /* renamed from: i, reason: collision with root package name */
    public final int f66498i;

    /* renamed from: j, reason: collision with root package name */
    public final int f66499j;

    /* renamed from: k, reason: collision with root package name */
    public final String f66500k;

    /* renamed from: l, reason: collision with root package name */
    public final C8776lb f66501l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f66502m;

    /* renamed from: n, reason: collision with root package name */
    public final String f66503n;

    /* renamed from: o, reason: collision with root package name */
    public final String f66504o;

    /* renamed from: p, reason: collision with root package name */
    public final int f66505p;

    /* renamed from: q, reason: collision with root package name */
    public final int f66506q;

    /* renamed from: r, reason: collision with root package name */
    public final List f66507r;

    /* renamed from: s, reason: collision with root package name */
    public final TE0 f66508s;

    /* renamed from: t, reason: collision with root package name */
    public final long f66509t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f66510u;

    /* renamed from: v, reason: collision with root package name */
    public final int f66511v;

    /* renamed from: w, reason: collision with root package name */
    public final int f66512w;

    /* renamed from: x, reason: collision with root package name */
    public final float f66513x;

    /* renamed from: y, reason: collision with root package name */
    public final int f66514y;

    /* renamed from: z, reason: collision with root package name */
    public final float f66515z;

    public final int a() {
        int i10;
        int i11 = this.f66511v;
        if (i11 == -1 || (i10 = this.f66512w) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final C9717uH0 b() {
        return new C9717uH0(this, null);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && C.class == obj.getClass()) {
            C c10 = (C) obj;
            int i11 = this.f66489L;
            if ((i11 == 0 || (i10 = c10.f66489L) == 0 || i11 == i10) && this.f66494e == c10.f66494e && this.f66495f == c10.f66495f && this.f66497h == c10.f66497h && this.f66498i == c10.f66498i && this.f66505p == c10.f66505p && this.f66509t == c10.f66509t && this.f66511v == c10.f66511v && this.f66512w == c10.f66512w && this.f66514y == c10.f66514y && this.f66479B == c10.f66479B && this.f66481D == c10.f66481D && this.f66482E == c10.f66482E && this.f66483F == c10.f66483F && this.f66484G == c10.f66484G && this.f66485H == c10.f66485H && this.f66486I == c10.f66486I && this.f66488K == c10.f66488K && Float.compare(this.f66513x, c10.f66513x) == 0 && Float.compare(this.f66515z, c10.f66515z) == 0 && Objects.equals(this.f66490a, c10.f66490a) && Objects.equals(this.f66491b, c10.f66491b) && this.f66492c.equals(c10.f66492c) && Objects.equals(this.f66500k, c10.f66500k) && Objects.equals(this.f66503n, c10.f66503n) && Objects.equals(this.f66504o, c10.f66504o) && Objects.equals(this.f66493d, c10.f66493d) && Arrays.equals(this.f66478A, c10.f66478A) && Objects.equals(this.f66501l, c10.f66501l) && Objects.equals(this.f66480C, c10.f66480C) && Objects.equals(this.f66508s, c10.f66508s) && d(c10)) {
                return true;
            }
        }
        return false;
    }

    static {
        new C(new C9717uH0());
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

    private C(C9717uH0 c9717uH0) {
        boolean z10;
        String str;
        this.f66490a = c9717uH0.f79637a;
        String strE = OV.e(c9717uH0.f79640d);
        this.f66493d = strE;
        if (c9717uH0.f79639c.isEmpty() && c9717uH0.f79638b != null) {
            this.f66492c = AbstractC8042eh0.u(new D0(strE, c9717uH0.f79638b));
            this.f66491b = c9717uH0.f79638b;
        } else if (!c9717uH0.f79639c.isEmpty() && c9717uH0.f79638b == null) {
            this.f66492c = c9717uH0.f79639c;
            List list = c9717uH0.f79639c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((D0) list.get(0)).f66940b;
                    break;
                }
                D0 d02 = (D0) it.next();
                if (TextUtils.equals(d02.f66939a, strE)) {
                    str = d02.f66940b;
                    break;
                }
            }
            this.f66491b = str;
        } else if (c9717uH0.f79639c.isEmpty() && c9717uH0.f79638b == null) {
            z10 = true;
            C8211gC.f(z10);
            this.f66492c = c9717uH0.f79639c;
            this.f66491b = c9717uH0.f79638b;
        } else {
            for (int i10 = 0; i10 < c9717uH0.f79639c.size(); i10++) {
                if (((D0) c9717uH0.f79639c.get(i10)).f66940b.equals(c9717uH0.f79638b)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            C8211gC.f(z10);
            this.f66492c = c9717uH0.f79639c;
            this.f66491b = c9717uH0.f79638b;
        }
        this.f66494e = c9717uH0.f79641e;
        C8211gC.g(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f66495f = c9717uH0.f79642f;
        this.f66496g = 0;
        int i11 = c9717uH0.f79644h;
        this.f66497h = i11;
        int i12 = c9717uH0.f79645i;
        this.f66498i = i12;
        this.f66499j = i12 != -1 ? i12 : i11;
        this.f66500k = c9717uH0.f79646j;
        this.f66501l = c9717uH0.f79647k;
        this.f66502m = null;
        this.f66503n = c9717uH0.f79648l;
        this.f66504o = c9717uH0.f79649m;
        this.f66505p = c9717uH0.f79650n;
        this.f66506q = c9717uH0.f79651o;
        this.f66507r = c9717uH0.f79652p == null ? Collections.EMPTY_LIST : c9717uH0.f79652p;
        TE0 te0 = c9717uH0.f79653q;
        this.f66508s = te0;
        this.f66509t = c9717uH0.f79654r;
        this.f66510u = c9717uH0.f79655s;
        this.f66511v = c9717uH0.f79656t;
        this.f66512w = c9717uH0.f79657u;
        this.f66513x = c9717uH0.f79658v;
        this.f66514y = c9717uH0.f79659w == -1 ? 0 : c9717uH0.f79659w;
        this.f66515z = c9717uH0.f79660x == -1.0f ? 1.0f : c9717uH0.f79660x;
        this.f66478A = c9717uH0.f79661y;
        this.f66479B = c9717uH0.f79662z;
        this.f66480C = c9717uH0.f79628A;
        this.f66481D = c9717uH0.f79629B;
        this.f66482E = c9717uH0.f79630C;
        this.f66483F = c9717uH0.f79631D;
        this.f66484G = c9717uH0.f79632E == -1 ? 0 : c9717uH0.f79632E;
        this.f66485H = c9717uH0.f79633F != -1 ? c9717uH0.f79633F : 0;
        this.f66486I = c9717uH0.f79634G;
        this.f66487J = c9717uH0.f79635H;
        if (c9717uH0.f79636I != 0 || te0 == null) {
            this.f66488K = c9717uH0.f79636I;
        } else {
            this.f66488K = 1;
        }
    }

    public final C c(int i10) {
        C9717uH0 c9717uH0 = new C9717uH0(this, null);
        c9717uH0.d(i10);
        return new C(c9717uH0);
    }

    public final boolean d(C c10) {
        if (this.f66507r.size() != c10.f66507r.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f66507r.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f66507r.get(i10), (byte[]) c10.f66507r.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f66489L;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f66490a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f66491b;
        int iHashCode2 = ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f66492c.hashCode();
        String str3 = this.f66493d;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f66494e) * 31) + this.f66495f) * 961) + this.f66497h) * 31) + this.f66498i) * 31;
        String str4 = this.f66500k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C8776lb c8776lb = this.f66501l;
        int iHashCode5 = (iHashCode4 + (c8776lb == null ? 0 : c8776lb.hashCode())) * 961;
        String str5 = this.f66503n;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iHashCode7 = ((((((((((((((((((((((((((((((((((iHashCode6 + (this.f66504o != null ? r2.hashCode() : 0)) * 31) + this.f66505p) * 31) + ((int) this.f66509t)) * 31) + this.f66511v) * 31) + this.f66512w) * 31) + Float.floatToIntBits(this.f66513x)) * 31) + this.f66514y) * 31) + Float.floatToIntBits(this.f66515z)) * 31) + this.f66479B) * 31) + this.f66481D) * 31) + this.f66482E) * 31) + this.f66483F) * 31) + this.f66484G) * 31) + this.f66485H) * 31) + this.f66486I) * 31) - 1) * 31) - 1) * 31) + this.f66488K;
        this.f66489L = iHashCode7;
        return iHashCode7;
    }

    public final String toString() {
        return "Format(" + this.f66490a + ", " + this.f66491b + ", " + this.f66503n + ", " + this.f66504o + ", " + this.f66500k + ", " + this.f66499j + ", " + this.f66493d + ", [" + this.f66511v + ", " + this.f66512w + ", " + this.f66513x + ", " + String.valueOf(this.f66480C) + "], [" + this.f66481D + ", " + this.f66482E + "])";
    }
}
