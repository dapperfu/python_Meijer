package a3;

import com.medallia.digital.mobilesdk.q2;
import d3.P;
import java.util.Arrays;

/* renamed from: a3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5653j {

    /* renamed from: h, reason: collision with root package name */
    public static final C5653j f44655h = new b().d(1).c(2).e(3).a();

    /* renamed from: i, reason: collision with root package name */
    public static final C5653j f44656i = new b().d(1).c(1).e(2).a();

    /* renamed from: j, reason: collision with root package name */
    private static final String f44657j = P.y0(0);

    /* renamed from: k, reason: collision with root package name */
    private static final String f44658k = P.y0(1);

    /* renamed from: l, reason: collision with root package name */
    private static final String f44659l = P.y0(2);

    /* renamed from: m, reason: collision with root package name */
    private static final String f44660m = P.y0(3);

    /* renamed from: n, reason: collision with root package name */
    private static final String f44661n = P.y0(4);

    /* renamed from: o, reason: collision with root package name */
    private static final String f44662o = P.y0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f44663a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44664b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44665c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f44666d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44667e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44668f;

    /* renamed from: g, reason: collision with root package name */
    private int f44669g;

    /* renamed from: a3.j$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f44670a;

        /* renamed from: b, reason: collision with root package name */
        private int f44671b;

        /* renamed from: c, reason: collision with root package name */
        private int f44672c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f44673d;

        /* renamed from: e, reason: collision with root package name */
        private int f44674e;

        /* renamed from: f, reason: collision with root package name */
        private int f44675f;

        public b() {
            this.f44670a = -1;
            this.f44671b = -1;
            this.f44672c = -1;
            this.f44674e = -1;
            this.f44675f = -1;
        }

        public C5653j a() {
            return new C5653j(this.f44670a, this.f44671b, this.f44672c, this.f44673d, this.f44674e, this.f44675f);
        }

        public b b(int i10) {
            this.f44675f = i10;
            return this;
        }

        public b c(int i10) {
            this.f44671b = i10;
            return this;
        }

        public b d(int i10) {
            this.f44670a = i10;
            return this;
        }

        public b e(int i10) {
            this.f44672c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f44673d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f44674e = i10;
            return this;
        }

        private b(C5653j c5653j) {
            this.f44670a = c5653j.f44663a;
            this.f44671b = c5653j.f44664b;
            this.f44672c = c5653j.f44665c;
            this.f44673d = c5653j.f44666d;
            this.f44674e = c5653j.f44667e;
            this.f44675f = c5653j.f44668f;
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

    public static boolean h(C5653j c5653j) {
        if (c5653j == null) {
            return true;
        }
        int i10 = c5653j.f44663a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = c5653j.f44664b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = c5653j.f44665c;
        if ((i12 != -1 && i12 != 3) || c5653j.f44666d != null) {
            return false;
        }
        int i13 = c5653j.f44668f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = c5653j.f44667e;
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
        if (obj != null && C5653j.class == obj.getClass()) {
            C5653j c5653j = (C5653j) obj;
            if (this.f44663a == c5653j.f44663a && this.f44664b == c5653j.f44664b && this.f44665c == c5653j.f44665c && Arrays.equals(this.f44666d, c5653j.f44666d) && this.f44667e == c5653j.f44667e && this.f44668f == c5653j.f44668f) {
                return true;
            }
        }
        return false;
    }

    private C5653j(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f44663a = i10;
        this.f44664b = i11;
        this.f44665c = i12;
        this.f44666d = bArr;
        this.f44667e = i13;
        this.f44668f = i14;
    }

    public b a() {
        return new b();
    }

    public boolean f() {
        return (this.f44667e == -1 || this.f44668f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f44663a == -1 || this.f44664b == -1 || this.f44665c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f44669g == 0) {
            this.f44669g = ((((((((((527 + this.f44663a) * 31) + this.f44664b) * 31) + this.f44665c) * 31) + Arrays.hashCode(this.f44666d)) * 31) + this.f44667e) * 31) + this.f44668f;
        }
        return this.f44669g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f44663a));
        sb2.append(", ");
        sb2.append(c(this.f44664b));
        sb2.append(", ");
        sb2.append(e(this.f44665c));
        sb2.append(", ");
        sb2.append(this.f44666d != null);
        sb2.append(", ");
        sb2.append(l(this.f44667e));
        sb2.append(", ");
        sb2.append(b(this.f44668f));
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
            strF = P.F("%s/%s/%s", d(this.f44663a), c(this.f44664b), e(this.f44665c));
        } else {
            strF = "NA/NA/NA";
        }
        if (f()) {
            str = this.f44667e + q2.f93563c + this.f44668f;
        } else {
            str = "NA/NA";
        }
        return strF + q2.f93563c + str;
    }
}
