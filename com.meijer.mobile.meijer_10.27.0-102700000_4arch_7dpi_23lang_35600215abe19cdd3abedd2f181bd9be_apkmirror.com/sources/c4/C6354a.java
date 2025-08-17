package c4;

import Ce.L;
import U3.e;
import U3.r;
import android.graphics.Bitmap;
import android.graphics.Rect;
import c3.C6350a;
import d3.C;
import d3.D;
import d3.InterfaceC13477l;
import d3.P;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6354a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final D f61447a = new D();

    /* renamed from: b, reason: collision with root package name */
    private final D f61448b = new D();

    /* renamed from: c, reason: collision with root package name */
    private final b f61449c;

    /* renamed from: d, reason: collision with root package name */
    private Inflater f61450d;

    /* renamed from: c4.a$b */
    private static final class b {

        /* renamed from: b, reason: collision with root package name */
        private boolean f61452b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f61453c;

        /* renamed from: d, reason: collision with root package name */
        private int[] f61454d;

        /* renamed from: e, reason: collision with root package name */
        private int f61455e;

        /* renamed from: f, reason: collision with root package name */
        private int f61456f;

        /* renamed from: g, reason: collision with root package name */
        private Rect f61457g;

        /* renamed from: a, reason: collision with root package name */
        private final int[] f61451a = new int[4];

        /* renamed from: h, reason: collision with root package name */
        private int f61458h = -1;

        /* renamed from: i, reason: collision with root package name */
        private int f61459i = -1;

        /* renamed from: c4.a$b$a, reason: collision with other inner class name */
        private static final class C1206a {

            /* renamed from: a, reason: collision with root package name */
            public int f61460a;

            /* renamed from: b, reason: collision with root package name */
            public int f61461b;

            private C1206a() {
            }
        }

        private static void k(C c10, int i10, C1206a c1206a) {
            int iH = 0;
            for (int i11 = 1; iH < i11 && i11 <= 64; i11 <<= 2) {
                if (c10.b() < 4) {
                    c1206a.f61460a = -1;
                    c1206a.f61461b = 0;
                    return;
                }
                iH = (iH << 4) | c10.h(4);
            }
            c1206a.f61460a = iH & 3;
            if (iH >= 4) {
                i10 = iH >> 2;
            }
            c1206a.f61461b = i10;
        }

        public void m() {
            this.f61453c = false;
            this.f61457g = null;
            this.f61458h = -1;
            this.f61459i = -1;
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

        public C6350a a(D d10) {
            Rect rect;
            if (this.f61454d == null || !this.f61452b || !this.f61453c || (rect = this.f61457g) == null || this.f61458h == -1 || this.f61459i == -1 || rect.width() < 2 || this.f61457g.height() < 2) {
                return null;
            }
            Rect rect2 = this.f61457g;
            int[] iArr = new int[rect2.width() * rect2.height()];
            C c10 = new C();
            d10.W(this.f61458h);
            c10.m(d10);
            j(c10, true, rect2, iArr);
            d10.W(this.f61459i);
            c10.m(d10);
            j(c10, false, rect2, iArr);
            return new C6350a.b().f(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).k(rect2.left / this.f61455e).l(0).h(rect2.top / this.f61456f, 0).i(0).n(rect2.width() / this.f61455e).g(rect2.height() / this.f61456f).a();
        }

        public void l(D d10) {
            int[] iArr = this.f61454d;
            if (iArr == null || !this.f61452b) {
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
            if (d10.a() < 2 || !this.f61453c) {
                return false;
            }
            int iH = d10.H();
            int iH2 = d10.H();
            int[] iArr = this.f61451a;
            iArr[3] = n(iArr[3], iH >> 4);
            int[] iArr2 = this.f61451a;
            iArr2[2] = n(iArr2[2], iH & 15);
            int[] iArr3 = this.f61451a;
            iArr3[1] = n(iArr3[1], iH2 >> 4);
            int[] iArr4 = this.f61451a;
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
            this.f61457g = new Rect(i10, (iH4 << 4) | (iH5 >> 4), iH3 + 1, (d10.H() | ((iH5 & 15) << 8)) + 1);
            return true;
        }

        private boolean g(int[] iArr, D d10) {
            if (d10.a() < 2) {
                return false;
            }
            int iH = d10.H();
            int iH2 = d10.H();
            this.f61451a[3] = b(iArr, iH >> 4);
            this.f61451a[2] = b(iArr, iH & 15);
            this.f61451a[1] = b(iArr, iH2 >> 4);
            this.f61451a[0] = b(iArr, iH2 & 15);
            this.f61453c = true;
            return true;
        }

        private boolean h(D d10) {
            if (d10.a() < 4) {
                return false;
            }
            this.f61458h = d10.P();
            this.f61459i = d10.P();
            return true;
        }

        private void j(C c10, boolean z10, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i10 = !z10 ? 1 : 0;
            int i11 = i10 * iWidth;
            C1206a c1206a = new C1206a();
            while (true) {
                int i12 = 0;
                do {
                    k(c10, iWidth, c1206a);
                    int iMin = Math.min(c1206a.f61461b, iWidth - i12);
                    if (iMin > 0) {
                        int i13 = i11 + iMin;
                        Arrays.fill(iArr, i11, i13, this.f61451a[c1206a.f61460a]);
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
                    this.f61454d = new int[strArrC1.length];
                    for (int i10 = 0; i10 < strArrC1.length; i10++) {
                        this.f61454d[i10] = c(strArrC1[i10].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrC12 = P.c1(str2.substring(6).trim(), "x");
                    if (strArrC12.length == 2) {
                        try {
                            this.f61455e = Integer.parseInt(strArrC12[0]);
                            this.f61456f = Integer.parseInt(strArrC12[1]);
                            this.f61452b = true;
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

    private C6350a d() {
        if (this.f61450d == null) {
            this.f61450d = new Inflater();
        }
        if (P.J0(this.f61447a, this.f61448b, this.f61450d)) {
            this.f61447a.U(this.f61448b.e(), this.f61448b.g());
        }
        this.f61449c.m();
        int iA = this.f61447a.a();
        if (iA < 2 || this.f61447a.P() != iA) {
            return null;
        }
        this.f61449c.l(this.f61447a);
        return this.f61449c.a(this.f61447a);
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13477l<e> interfaceC13477l) {
        this.f61447a.U(bArr, i11 + i10);
        this.f61447a.W(i10);
        C6350a c6350aD = d();
        interfaceC13477l.accept(new e(c6350aD != null ? L.y(c6350aD) : L.x(), -9223372036854775807L, 5000000L));
    }

    public C6354a(List<byte[]> list) {
        b bVar = new b();
        this.f61449c = bVar;
        bVar.i(new String(list.get(0), StandardCharsets.UTF_8));
    }
}
