package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class i2 extends O1<i2> implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public boolean f81477A;

    /* renamed from: c, reason: collision with root package name */
    public long f81478c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f81479d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f81480e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f81481f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f81482g = 0;

    /* renamed from: h, reason: collision with root package name */
    private String f81483h = "";

    /* renamed from: i, reason: collision with root package name */
    private int f81484i = 0;

    /* renamed from: j, reason: collision with root package name */
    private boolean f81485j = false;

    /* renamed from: k, reason: collision with root package name */
    private j2[] f81486k = j2.g();

    /* renamed from: l, reason: collision with root package name */
    private byte[] f81487l;

    /* renamed from: m, reason: collision with root package name */
    private W1 f81488m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f81489n;

    /* renamed from: o, reason: collision with root package name */
    private String f81490o;

    /* renamed from: p, reason: collision with root package name */
    private String f81491p;

    /* renamed from: q, reason: collision with root package name */
    private f2 f81492q;

    /* renamed from: r, reason: collision with root package name */
    private String f81493r;

    /* renamed from: s, reason: collision with root package name */
    public long f81494s;

    /* renamed from: t, reason: collision with root package name */
    private g2 f81495t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f81496u;

    /* renamed from: v, reason: collision with root package name */
    private String f81497v;

    /* renamed from: w, reason: collision with root package name */
    private int f81498w;

    /* renamed from: x, reason: collision with root package name */
    private int[] f81499x;

    /* renamed from: y, reason: collision with root package name */
    private long f81500y;

    /* renamed from: z, reason: collision with root package name */
    private X1 f81501z;

    public i2() {
        byte[] bArr = V1.f81217h;
        this.f81487l = bArr;
        this.f81488m = null;
        this.f81489n = bArr;
        this.f81490o = "";
        this.f81491p = "";
        this.f81492q = null;
        this.f81493r = "";
        this.f81494s = 180000L;
        this.f81495t = null;
        this.f81496u = bArr;
        this.f81497v = "";
        this.f81498w = 0;
        this.f81499x = V1.f81210a;
        this.f81500y = 0L;
        this.f81501z = null;
        this.f81477A = false;
        this.f81186b = null;
        this.f81203a = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final i2 clone() {
        try {
            i2 i2Var = (i2) super.clone();
            j2[] j2VarArr = this.f81486k;
            if (j2VarArr != null && j2VarArr.length > 0) {
                i2Var.f81486k = new j2[j2VarArr.length];
                int i10 = 0;
                while (true) {
                    j2[] j2VarArr2 = this.f81486k;
                    if (i10 >= j2VarArr2.length) {
                        break;
                    }
                    j2 j2Var = j2VarArr2[i10];
                    if (j2Var != null) {
                        i2Var.f81486k[i10] = (j2) j2Var.clone();
                    }
                    i10++;
                }
            }
            W1 w12 = this.f81488m;
            if (w12 != null) {
                i2Var.f81488m = w12;
            }
            f2 f2Var = this.f81492q;
            if (f2Var != null) {
                i2Var.f81492q = (f2) f2Var.clone();
            }
            g2 g2Var = this.f81495t;
            if (g2Var != null) {
                i2Var.f81495t = (g2) g2Var.clone();
            }
            int[] iArr = this.f81499x;
            if (iArr != null && iArr.length > 0) {
                i2Var.f81499x = (int[]) iArr.clone();
            }
            X1 x12 = this.f81501z;
            if (x12 != null) {
                i2Var.f81501z = x12;
            }
            return i2Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    public final void a(N1 n12) throws IOException {
        long j10 = this.f81478c;
        if (j10 != 0) {
            n12.u(1, j10);
        }
        String str = this.f81481f;
        if (str != null && !str.equals("")) {
            n12.c(2, this.f81481f);
        }
        j2[] j2VarArr = this.f81486k;
        int i10 = 0;
        if (j2VarArr != null && j2VarArr.length > 0) {
            int i11 = 0;
            while (true) {
                j2[] j2VarArr2 = this.f81486k;
                if (i11 >= j2VarArr2.length) {
                    break;
                }
                j2 j2Var = j2VarArr2[i11];
                if (j2Var != null) {
                    n12.b(3, j2Var);
                }
                i11++;
            }
        }
        byte[] bArr = this.f81487l;
        byte[] bArr2 = V1.f81217h;
        if (!Arrays.equals(bArr, bArr2)) {
            n12.d(4, this.f81487l);
        }
        if (!Arrays.equals(this.f81489n, bArr2)) {
            n12.d(6, this.f81489n);
        }
        f2 f2Var = this.f81492q;
        if (f2Var != null) {
            n12.b(7, f2Var);
        }
        String str2 = this.f81490o;
        if (str2 != null && !str2.equals("")) {
            n12.c(8, this.f81490o);
        }
        W1 w12 = this.f81488m;
        if (w12 != null) {
            n12.o(9, w12);
        }
        int i12 = this.f81482g;
        if (i12 != 0) {
            n12.l(11, i12);
        }
        String str3 = this.f81491p;
        if (str3 != null && !str3.equals("")) {
            n12.c(13, this.f81491p);
        }
        String str4 = this.f81493r;
        if (str4 != null && !str4.equals("")) {
            n12.c(14, this.f81493r);
        }
        long j11 = this.f81494s;
        if (j11 != 180000) {
            n12.j(15, 0);
            n12.w(N1.v(j11));
        }
        g2 g2Var = this.f81495t;
        if (g2Var != null) {
            n12.b(16, g2Var);
        }
        long j12 = this.f81479d;
        if (j12 != 0) {
            n12.u(17, j12);
        }
        if (!Arrays.equals(this.f81496u, bArr2)) {
            n12.d(18, this.f81496u);
        }
        int[] iArr = this.f81499x;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f81499x;
                if (i10 >= iArr2.length) {
                    break;
                }
                n12.l(20, iArr2[i10]);
                i10++;
            }
        }
        X1 x12 = this.f81501z;
        if (x12 != null) {
            n12.o(23, x12);
        }
        String str5 = this.f81497v;
        if (str5 != null && !str5.equals("")) {
            n12.c(24, this.f81497v);
        }
        boolean z10 = this.f81477A;
        if (z10) {
            n12.k(25, z10);
        }
        String str6 = this.f81483h;
        if (str6 != null && !str6.equals("")) {
            n12.c(26, this.f81483h);
        }
        super.a(n12);
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    protected final int d() {
        int[] iArr;
        int iD = super.d();
        long j10 = this.f81478c;
        if (j10 != 0) {
            iD += N1.m(1, j10);
        }
        String str = this.f81481f;
        if (str != null && !str.equals("")) {
            iD += N1.h(2, this.f81481f);
        }
        j2[] j2VarArr = this.f81486k;
        int i10 = 0;
        if (j2VarArr != null && j2VarArr.length > 0) {
            int i11 = 0;
            while (true) {
                j2[] j2VarArr2 = this.f81486k;
                if (i11 >= j2VarArr2.length) {
                    break;
                }
                j2 j2Var = j2VarArr2[i11];
                if (j2Var != null) {
                    iD += N1.g(3, j2Var);
                }
                i11++;
            }
        }
        byte[] bArr = this.f81487l;
        byte[] bArr2 = V1.f81217h;
        if (!Arrays.equals(bArr, bArr2)) {
            iD += N1.i(4, this.f81487l);
        }
        if (!Arrays.equals(this.f81489n, bArr2)) {
            iD += N1.i(6, this.f81489n);
        }
        f2 f2Var = this.f81492q;
        if (f2Var != null) {
            iD += N1.g(7, f2Var);
        }
        String str2 = this.f81490o;
        if (str2 != null && !str2.equals("")) {
            iD += N1.h(8, this.f81490o);
        }
        W1 w12 = this.f81488m;
        if (w12 != null) {
            iD += zzbn.O(9, w12);
        }
        int i12 = this.f81482g;
        if (i12 != 0) {
            iD += N1.y(11) + N1.z(i12);
        }
        String str3 = this.f81491p;
        if (str3 != null && !str3.equals("")) {
            iD += N1.h(13, this.f81491p);
        }
        String str4 = this.f81493r;
        if (str4 != null && !str4.equals("")) {
            iD += N1.h(14, this.f81493r);
        }
        long j11 = this.f81494s;
        if (j11 != 180000) {
            iD += N1.y(15) + N1.x(N1.v(j11));
        }
        g2 g2Var = this.f81495t;
        if (g2Var != null) {
            iD += N1.g(16, g2Var);
        }
        long j12 = this.f81479d;
        if (j12 != 0) {
            iD += N1.m(17, j12);
        }
        if (!Arrays.equals(this.f81496u, bArr2)) {
            iD += N1.i(18, this.f81496u);
        }
        int[] iArr2 = this.f81499x;
        if (iArr2 != null && iArr2.length > 0) {
            int iZ = 0;
            while (true) {
                iArr = this.f81499x;
                if (i10 >= iArr.length) {
                    break;
                }
                iZ += N1.z(iArr[i10]);
                i10++;
            }
            iD = iD + iZ + (iArr.length * 2);
        }
        X1 x12 = this.f81501z;
        if (x12 != null) {
            iD += zzbn.O(23, x12);
        }
        String str5 = this.f81497v;
        if (str5 != null && !str5.equals("")) {
            iD += N1.h(24, this.f81497v);
        }
        if (this.f81477A) {
            iD += N1.y(25) + 1;
        }
        String str6 = this.f81483h;
        return (str6 == null || str6.equals("")) ? iD : iD + N1.h(26, this.f81483h);
    }

    @Override // com.google.android.gms.internal.clearcut.O1, com.google.android.gms.internal.clearcut.S1
    /* renamed from: e */
    public final /* synthetic */ S1 clone() throws CloneNotSupportedException {
        return (i2) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        if (this.f81478c != i2Var.f81478c || this.f81479d != i2Var.f81479d) {
            return false;
        }
        String str = this.f81481f;
        if (str == null) {
            if (i2Var.f81481f != null) {
                return false;
            }
        } else if (!str.equals(i2Var.f81481f)) {
            return false;
        }
        if (this.f81482g != i2Var.f81482g) {
            return false;
        }
        String str2 = this.f81483h;
        if (str2 == null) {
            if (i2Var.f81483h != null) {
                return false;
            }
        } else if (!str2.equals(i2Var.f81483h)) {
            return false;
        }
        if (!R1.c(this.f81486k, i2Var.f81486k) || !Arrays.equals(this.f81487l, i2Var.f81487l)) {
            return false;
        }
        W1 w12 = this.f81488m;
        if (w12 == null) {
            if (i2Var.f81488m != null) {
                return false;
            }
        } else if (!w12.equals(i2Var.f81488m)) {
            return false;
        }
        if (!Arrays.equals(this.f81489n, i2Var.f81489n)) {
            return false;
        }
        String str3 = this.f81490o;
        if (str3 == null) {
            if (i2Var.f81490o != null) {
                return false;
            }
        } else if (!str3.equals(i2Var.f81490o)) {
            return false;
        }
        String str4 = this.f81491p;
        if (str4 == null) {
            if (i2Var.f81491p != null) {
                return false;
            }
        } else if (!str4.equals(i2Var.f81491p)) {
            return false;
        }
        f2 f2Var = this.f81492q;
        if (f2Var == null) {
            if (i2Var.f81492q != null) {
                return false;
            }
        } else if (!f2Var.equals(i2Var.f81492q)) {
            return false;
        }
        String str5 = this.f81493r;
        if (str5 == null) {
            if (i2Var.f81493r != null) {
                return false;
            }
        } else if (!str5.equals(i2Var.f81493r)) {
            return false;
        }
        if (this.f81494s != i2Var.f81494s) {
            return false;
        }
        g2 g2Var = this.f81495t;
        if (g2Var == null) {
            if (i2Var.f81495t != null) {
                return false;
            }
        } else if (!g2Var.equals(i2Var.f81495t)) {
            return false;
        }
        if (!Arrays.equals(this.f81496u, i2Var.f81496u)) {
            return false;
        }
        String str6 = this.f81497v;
        if (str6 == null) {
            if (i2Var.f81497v != null) {
                return false;
            }
        } else if (!str6.equals(i2Var.f81497v)) {
            return false;
        }
        if (!R1.a(this.f81499x, i2Var.f81499x)) {
            return false;
        }
        X1 x12 = this.f81501z;
        if (x12 == null) {
            if (i2Var.f81501z != null) {
                return false;
            }
        } else if (!x12.equals(i2Var.f81501z)) {
            return false;
        }
        if (this.f81477A != i2Var.f81477A) {
            return false;
        }
        P1 p12 = this.f81186b;
        if (p12 != null && !p12.a()) {
            return this.f81186b.equals(i2Var.f81186b);
        }
        P1 p13 = i2Var.f81186b;
        return p13 == null || p13.a();
    }

    @Override // com.google.android.gms.internal.clearcut.O1
    /* renamed from: f */
    public final /* synthetic */ O1 clone() throws CloneNotSupportedException {
        return (i2) clone();
    }

    public final int hashCode() {
        int iHashCode = (i2.class.getName().hashCode() + 527) * 31;
        long j10 = this.f81478c;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f81479d;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 961;
        String str = this.f81481f;
        int iHashCode2 = 0;
        int iHashCode3 = (((i11 + (str == null ? 0 : str.hashCode())) * 31) + this.f81482g) * 31;
        String str2 = this.f81483h;
        int iHashCode4 = ((((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 961) + 1237) * 31) + R1.f(this.f81486k)) * 31) + Arrays.hashCode(this.f81487l);
        W1 w12 = this.f81488m;
        int iHashCode5 = ((((iHashCode4 * 31) + (w12 == null ? 0 : w12.hashCode())) * 31) + Arrays.hashCode(this.f81489n)) * 31;
        String str3 = this.f81490o;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81491p;
        int iHashCode7 = iHashCode6 + (str4 == null ? 0 : str4.hashCode());
        f2 f2Var = this.f81492q;
        int iHashCode8 = ((iHashCode7 * 31) + (f2Var == null ? 0 : f2Var.hashCode())) * 31;
        String str5 = this.f81493r;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        long j12 = this.f81494s;
        g2 g2Var = this.f81495t;
        int iHashCode10 = (((((iHashCode9 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (g2Var == null ? 0 : g2Var.hashCode())) * 31) + Arrays.hashCode(this.f81496u)) * 31;
        String str6 = this.f81497v;
        int iHashCode11 = ((iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 961) + R1.d(this.f81499x);
        X1 x12 = this.f81501z;
        int iHashCode12 = ((((iHashCode11 * 961) + (x12 == null ? 0 : x12.hashCode())) * 31) + (this.f81477A ? 1231 : 1237)) * 31;
        P1 p12 = this.f81186b;
        if (p12 != null && !p12.a()) {
            iHashCode2 = this.f81186b.hashCode();
        }
        return iHashCode12 + iHashCode2;
    }
}
