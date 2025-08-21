package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class Vz0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Vz0 f71799h;

    /* renamed from: a, reason: collision with root package name */
    public final int f71800a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71801b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71802c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f71803d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71804e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71805f;

    /* renamed from: g, reason: collision with root package name */
    private int f71806g;

    /* synthetic */ Vz0(int i10, int i11, int i12, byte[] bArr, int i13, int i14, C9787uz0 c9787uz0) {
        this.f71800a = i10;
        this.f71801b = i11;
        this.f71802c = i12;
        this.f71803d = bArr;
        this.f71804e = i13;
        this.f71805f = i14;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean g(Vz0 vz0) {
        if (vz0 == null) {
            return true;
        }
        int i10 = vz0.f71800a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = vz0.f71801b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = vz0.f71802c;
        if ((i12 != -1 && i12 != 3) || vz0.f71803d != null) {
            return false;
        }
        int i13 = vz0.f71805f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = vz0.f71804e;
        return i14 == -1 || i14 == 8;
    }

    private static String h(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    private static String i(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    private static String j(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public final Uy0 c() {
        return new Uy0(this, null);
    }

    public final boolean e() {
        return (this.f71804e == -1 || this.f71805f == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Vz0.class == obj.getClass()) {
            Vz0 vz0 = (Vz0) obj;
            if (this.f71800a == vz0.f71800a && this.f71801b == vz0.f71801b && this.f71802c == vz0.f71802c && Arrays.equals(this.f71803d, vz0.f71803d) && this.f71804e == vz0.f71804e && this.f71805f == vz0.f71805f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.f71800a == -1 || this.f71801b == -1 || this.f71802c == -1) ? false : true;
    }

    static {
        Uy0 uy0 = new Uy0();
        uy0.c(1);
        uy0.b(2);
        uy0.d(3);
        f71799h = uy0.g();
        Uy0 uy02 = new Uy0();
        uy02.c(1);
        uy02.b(1);
        uy02.d(2);
        uy02.g();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public final int hashCode() {
        int i10 = this.f71806g;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((this.f71800a + 527) * 31) + this.f71801b) * 31) + this.f71802c) * 31) + Arrays.hashCode(this.f71803d)) * 31) + this.f71804e) * 31) + this.f71805f;
        this.f71806g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i10 = this.f71804e;
        int i11 = this.f71802c;
        int i12 = this.f71801b;
        String strI = i(this.f71800a);
        String strH = h(i12);
        String strJ = j(i11);
        String str2 = "NA";
        if (i10 != -1) {
            str = i10 + "bit Luma";
        } else {
            str = "NA";
        }
        int i13 = this.f71805f;
        if (i13 != -1) {
            str2 = i13 + "bit Chroma";
        }
        return "ColorInfo(" + strI + ", " + strH + ", " + strJ + ", " + (this.f71803d != null) + ", " + str + ", " + str2 + ")";
    }

    public final String d() {
        String str;
        String str2;
        if (f()) {
            str = String.format(Locale.US, "%s/%s/%s", i(this.f71800a), h(this.f71801b), j(this.f71802c));
        } else {
            str = "NA/NA/NA";
        }
        if (e()) {
            str2 = this.f71804e + com.medallia.digital.mobilesdk.q2.f93563c + this.f71805f;
        } else {
            str2 = "NA/NA";
        }
        return str + com.medallia.digital.mobilesdk.q2.f93563c + str2;
    }
}
