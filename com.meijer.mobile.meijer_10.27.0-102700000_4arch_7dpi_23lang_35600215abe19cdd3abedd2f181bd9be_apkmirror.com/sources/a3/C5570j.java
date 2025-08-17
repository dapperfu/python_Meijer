package a3;

import com.medallia.digital.mobilesdk.q2;
import d3.P;
import java.util.Arrays;

/* renamed from: a3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5570j {

    /* renamed from: h, reason: collision with root package name */
    public static final C5570j f43837h = new b().d(1).c(2).e(3).a();

    /* renamed from: i, reason: collision with root package name */
    public static final C5570j f43838i = new b().d(1).c(1).e(2).a();

    /* renamed from: j, reason: collision with root package name */
    private static final String f43839j = P.y0(0);

    /* renamed from: k, reason: collision with root package name */
    private static final String f43840k = P.y0(1);

    /* renamed from: l, reason: collision with root package name */
    private static final String f43841l = P.y0(2);

    /* renamed from: m, reason: collision with root package name */
    private static final String f43842m = P.y0(3);

    /* renamed from: n, reason: collision with root package name */
    private static final String f43843n = P.y0(4);

    /* renamed from: o, reason: collision with root package name */
    private static final String f43844o = P.y0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f43845a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43846b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43847c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f43848d;

    /* renamed from: e, reason: collision with root package name */
    public final int f43849e;

    /* renamed from: f, reason: collision with root package name */
    public final int f43850f;

    /* renamed from: g, reason: collision with root package name */
    private int f43851g;

    /* renamed from: a3.j$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f43852a;

        /* renamed from: b, reason: collision with root package name */
        private int f43853b;

        /* renamed from: c, reason: collision with root package name */
        private int f43854c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f43855d;

        /* renamed from: e, reason: collision with root package name */
        private int f43856e;

        /* renamed from: f, reason: collision with root package name */
        private int f43857f;

        public b() {
            this.f43852a = -1;
            this.f43853b = -1;
            this.f43854c = -1;
            this.f43856e = -1;
            this.f43857f = -1;
        }

        public C5570j a() {
            return new C5570j(this.f43852a, this.f43853b, this.f43854c, this.f43855d, this.f43856e, this.f43857f);
        }

        public b b(int i10) {
            this.f43857f = i10;
            return this;
        }

        public b c(int i10) {
            this.f43853b = i10;
            return this;
        }

        public b d(int i10) {
            this.f43852a = i10;
            return this;
        }

        public b e(int i10) {
            this.f43854c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f43855d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f43856e = i10;
            return this;
        }

        private b(C5570j c5570j) {
            this.f43852a = c5570j.f43845a;
            this.f43853b = c5570j.f43846b;
            this.f43854c = c5570j.f43847c;
            this.f43855d = c5570j.f43848d;
            this.f43856e = c5570j.f43849e;
            this.f43857f = c5570j.f43850f;
        }
    }

    private static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String c(int i10) {
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

    private static String d(int i10) {
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

    private static String e(int i10) {
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

    public static boolean h(C5570j c5570j) {
        if (c5570j == null) {
            return true;
        }
        int i10 = c5570j.f43845a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = c5570j.f43846b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = c5570j.f43847c;
        if ((i12 != -1 && i12 != 3) || c5570j.f43848d != null) {
            return false;
        }
        int i13 = c5570j.f43850f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = c5570j.f43849e;
        return i14 == -1 || i14 == 8;
    }

    public static int j(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i10) {
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

    private static String l(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5570j.class == obj.getClass()) {
            C5570j c5570j = (C5570j) obj;
            if (this.f43845a == c5570j.f43845a && this.f43846b == c5570j.f43846b && this.f43847c == c5570j.f43847c && Arrays.equals(this.f43848d, c5570j.f43848d) && this.f43849e == c5570j.f43849e && this.f43850f == c5570j.f43850f) {
                return true;
            }
        }
        return false;
    }

    private C5570j(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f43845a = i10;
        this.f43846b = i11;
        this.f43847c = i12;
        this.f43848d = bArr;
        this.f43849e = i13;
        this.f43850f = i14;
    }

    public b a() {
        return new b();
    }

    public boolean f() {
        return (this.f43849e == -1 || this.f43850f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f43845a == -1 || this.f43846b == -1 || this.f43847c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f43851g == 0) {
            this.f43851g = ((((((((((527 + this.f43845a) * 31) + this.f43846b) * 31) + this.f43847c) * 31) + Arrays.hashCode(this.f43848d)) * 31) + this.f43849e) * 31) + this.f43850f;
        }
        return this.f43851g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f43845a));
        sb2.append(", ");
        sb2.append(c(this.f43846b));
        sb2.append(", ");
        sb2.append(e(this.f43847c));
        sb2.append(", ");
        sb2.append(this.f43848d != null);
        sb2.append(", ");
        sb2.append(l(this.f43849e));
        sb2.append(", ");
        sb2.append(b(this.f43850f));
        sb2.append(")");
        return sb2.toString();
    }

    public boolean i() {
        if (!f() && !g()) {
            return false;
        }
        return true;
    }

    public String m() {
        String strF;
        String str;
        if (g()) {
            strF = P.F("%s/%s/%s", d(this.f43845a), c(this.f43846b), e(this.f43847c));
        } else {
            strF = "NA/NA/NA";
        }
        if (f()) {
            str = this.f43849e + q2.f92724c + this.f43850f;
        } else {
            str = "NA/NA";
        }
        return strF + q2.f92724c + str;
    }
}
