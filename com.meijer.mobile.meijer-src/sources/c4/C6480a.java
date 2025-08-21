package c4;

import Ee.L;
import U3.e;
import U3.r;
import android.graphics.Bitmap;
import android.graphics.Rect;
import c3.C6476a;
import d3.C;
import d3.D;
import d3.InterfaceC13610l;
import d3.P;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6480a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final D f61246a = new D();

    /* renamed from: b, reason: collision with root package name */
    private final D f61247b = new D();

    /* renamed from: c, reason: collision with root package name */
    private final b f61248c;

    /* renamed from: d, reason: collision with root package name */
    private Inflater f61249d;

    /* renamed from: c4.a$b */
    private static final class b {

        /* renamed from: b, reason: collision with root package name */
        private boolean f61251b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f61252c;

        /* renamed from: d, reason: collision with root package name */
        private int[] f61253d;

        /* renamed from: e, reason: collision with root package name */
        private int f61254e;

        /* renamed from: f, reason: collision with root package name */
        private int f61255f;

        /* renamed from: g, reason: collision with root package name */
        private Rect f61256g;

        /* renamed from: a, reason: collision with root package name */
        private final int[] f61250a = new int[4];

        /* renamed from: h, reason: collision with root package name */
        private int f61257h = -1;

        /* renamed from: i, reason: collision with root package name */
        private int f61258i = -1;

        /* renamed from: c4.a$b$a, reason: collision with other inner class name */
        private static final class C1218a {

            /* renamed from: a, reason: collision with root package name */
            public int f61259a;

            /* renamed from: b, reason: collision with root package name */
            public int f61260b;

            private C1218a() {
            }
        }

        private static void k(C c10, int i10, C1218a c1218a) {
            int iH = 0;
            for (int i11 = 1; iH < i11 && i11 <= 64; i11 <<= 2) {
                if (c10.b() < 4) {
                    c1218a.f61259a = -1;
                    c1218a.f61260b = 0;
                    return;
                }
                iH = (iH << 4) | c10.h(4);
            }
            c1218a.f61259a = iH & 3;
            if (iH >= 4) {
                i10 = iH >> 2;
            }
            c1218a.f61260b = i10;
        }

        public void m() {
            this.f61252c = false;
            this.f61256g = null;
            this.f61257h = -1;
            this.f61258i = -1;
        }

        private static int b(int[] iArr, int i10) {
            return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
        }

        private static int c(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        public C6476a a(D d10) {
            Rect rect;
            if (this.f61253d == null || !this.f61251b || !this.f61252c || (rect = this.f61256g) == null || this.f61257h == -1 || this.f61258i == -1 || rect.width() < 2 || this.f61256g.height() < 2) {
                return null;
            }
            Rect rect2 = this.f61256g;
            int[] iArr = new int[rect2.width() * rect2.height()];
            C c10 = new C();
            d10.W(this.f61257h);
            c10.m(d10);
            j(c10, true, rect2, iArr);
            d10.W(this.f61258i);
            c10.m(d10);
            j(c10, false, rect2, iArr);
            return new C6476a.b().f(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).k(rect2.left / this.f61254e).l(0).h(rect2.top / this.f61255f, 0).i(0).n(rect2.width() / this.f61254e).g(rect2.height() / this.f61255f).a();
        }

        public void l(D d10) {
            int[] iArr = this.f61253d;
            if (iArr == null || !this.f61251b) {
                return;
            }
            d10.X(d10.P() - 2);
            d(iArr, d10, d10.P());
        }

        private void d(int[] iArr, D d10, int i10) {
            while (d10.f() < i10 && d10.a() > 0) {
                switch (d10.H()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (g(iArr, d10)) {
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        if (e(d10)) {
                            break;
                        } else {
                            return;
                        }
                    case 5:
                        if (f(d10)) {
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        if (h(d10)) {
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }

        private boolean e(D d10) {
            if (d10.a() < 2 || !this.f61252c) {
                return false;
            }
            int iH = d10.H();
            int iH2 = d10.H();
            int[] iArr = this.f61250a;
            iArr[3] = n(iArr[3], iH >> 4);
            int[] iArr2 = this.f61250a;
            iArr2[2] = n(iArr2[2], iH & 15);
            int[] iArr3 = this.f61250a;
            iArr3[1] = n(iArr3[1], iH2 >> 4);
            int[] iArr4 = this.f61250a;
            iArr4[0] = n(iArr4[0], iH2 & 15);
            return true;
        }

        private boolean f(D d10) {
            if (d10.a() < 6) {
                return false;
            }
            int iH = d10.H();
            int iH2 = d10.H();
            int i10 = (iH << 4) | (iH2 >> 4);
            int iH3 = ((iH2 & 15) << 8) | d10.H();
            int iH4 = d10.H();
            int iH5 = d10.H();
            this.f61256g = new Rect(i10, (iH4 << 4) | (iH5 >> 4), iH3 + 1, (d10.H() | ((iH5 & 15) << 8)) + 1);
            return true;
        }

        private boolean g(int[] iArr, D d10) {
            if (d10.a() < 2) {
                return false;
            }
            int iH = d10.H();
            int iH2 = d10.H();
            this.f61250a[3] = b(iArr, iH >> 4);
            this.f61250a[2] = b(iArr, iH & 15);
            this.f61250a[1] = b(iArr, iH2 >> 4);
            this.f61250a[0] = b(iArr, iH2 & 15);
            this.f61252c = true;
            return true;
        }

        private boolean h(D d10) {
            if (d10.a() < 4) {
                return false;
            }
            this.f61257h = d10.P();
            this.f61258i = d10.P();
            return true;
        }

        private void j(C c10, boolean z10, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i10 = !z10 ? 1 : 0;
            int i11 = i10 * iWidth;
            C1218a c1218a = new C1218a();
            while (true) {
                int i12 = 0;
                do {
                    k(c10, iWidth, c1218a);
                    int iMin = Math.min(c1218a.f61260b, iWidth - i12);
                    if (iMin > 0) {
                        int i13 = i11 + iMin;
                        Arrays.fill(iArr, i11, i13, this.f61250a[c1218a.f61259a]);
                        i12 += iMin;
                        i11 = i13;
                    }
                } while (i12 < iWidth);
                i10 += 2;
                if (i10 >= iHeight) {
                    return;
                }
                i11 = i10 * iWidth;
                c10.c();
            }
        }

        private static int n(int i10, int i11) {
            return (i10 & 16777215) | ((i11 * 17) << 24);
        }

        public void i(String str) {
            for (String str2 : P.c1(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrC1 = P.c1(str2.substring(9), ",");
                    this.f61253d = new int[strArrC1.length];
                    for (int i10 = 0; i10 < strArrC1.length; i10++) {
                        this.f61253d[i10] = c(strArrC1[i10].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrC12 = P.c1(str2.substring(6).trim(), "x");
                    if (strArrC12.length == 2) {
                        try {
                            this.f61254e = Integer.parseInt(strArrC12[0]);
                            this.f61255f = Integer.parseInt(strArrC12[1]);
                            this.f61251b = true;
                        } catch (RuntimeException e10) {
                            d3.r.j("VobsubParser", "Parsing IDX failed", e10);
                        }
                    }
                }
            }
        }
    }

    @Override // U3.r
    public int c() {
        return 2;
    }

    private C6476a d() {
        if (this.f61249d == null) {
            this.f61249d = new Inflater();
        }
        if (P.J0(this.f61246a, this.f61247b, this.f61249d)) {
            this.f61246a.U(this.f61247b.e(), this.f61247b.g());
        }
        this.f61248c.m();
        int iA = this.f61246a.a();
        if (iA < 2 || this.f61246a.P() != iA) {
            return null;
        }
        this.f61248c.l(this.f61246a);
        return this.f61248c.a(this.f61246a);
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13610l<e> interfaceC13610l) {
        this.f61246a.U(bArr, i11 + i10);
        this.f61246a.W(i10);
        C6476a c6476aD = d();
        interfaceC13610l.accept(new e(c6476aD != null ? L.y(c6476aD) : L.x(), -9223372036854775807L, 5000000L));
    }

    public C6480a(List<byte[]> list) {
        b bVar = new b();
        this.f61248c = bVar;
        bVar.i(new String(list.get(0), StandardCharsets.UTF_8));
    }
}
