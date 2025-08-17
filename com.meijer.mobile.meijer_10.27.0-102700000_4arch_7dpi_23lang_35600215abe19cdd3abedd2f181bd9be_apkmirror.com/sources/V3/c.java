package V3;

import U3.k;
import U3.o;
import U3.p;
import V3.c;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.extractor.text.SubtitleDecoderException;
import c3.C6350a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d3.C;
import d3.C13466a;
import d3.C13474i;
import d3.D;
import d3.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public final class c extends e {

    /* renamed from: h, reason: collision with root package name */
    private final D f36813h = new D();

    /* renamed from: i, reason: collision with root package name */
    private final C f36814i = new C();

    /* renamed from: j, reason: collision with root package name */
    private int f36815j = -1;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f36816k;

    /* renamed from: l, reason: collision with root package name */
    private final int f36817l;

    /* renamed from: m, reason: collision with root package name */
    private final b[] f36818m;

    /* renamed from: n, reason: collision with root package name */
    private b f36819n;

    /* renamed from: o, reason: collision with root package name */
    private List<C6350a> f36820o;

    /* renamed from: p, reason: collision with root package name */
    private List<C6350a> f36821p;

    /* renamed from: q, reason: collision with root package name */
    private C0804c f36822q;

    /* renamed from: r, reason: collision with root package name */
    private int f36823r;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f36824c = new Comparator() { // from class: V3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((c.a) obj2).f36826b, ((c.a) obj).f36826b);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final C6350a f36825a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36826b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            C6350a.b bVarN = new C6350a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                bVarN.s(i13);
            }
            this.f36825a = bVarN.a();
            this.f36826b = i14;
        }
    }

    private static final class b {

        /* renamed from: A, reason: collision with root package name */
        private static final int[] f36827A;

        /* renamed from: B, reason: collision with root package name */
        private static final boolean[] f36828B;

        /* renamed from: C, reason: collision with root package name */
        private static final int[] f36829C;

        /* renamed from: D, reason: collision with root package name */
        private static final int[] f36830D;

        /* renamed from: E, reason: collision with root package name */
        private static final int[] f36831E;

        /* renamed from: F, reason: collision with root package name */
        private static final int[] f36832F;

        /* renamed from: v, reason: collision with root package name */
        public static final int f36833v = h(2, 2, 2, 0);

        /* renamed from: w, reason: collision with root package name */
        public static final int f36834w;

        /* renamed from: x, reason: collision with root package name */
        public static final int f36835x;

        /* renamed from: y, reason: collision with root package name */
        private static final int[] f36836y;

        /* renamed from: z, reason: collision with root package name */
        private static final int[] f36837z;

        /* renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f36838a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f36839b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        private boolean f36840c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f36841d;

        /* renamed from: e, reason: collision with root package name */
        private int f36842e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f36843f;

        /* renamed from: g, reason: collision with root package name */
        private int f36844g;

        /* renamed from: h, reason: collision with root package name */
        private int f36845h;

        /* renamed from: i, reason: collision with root package name */
        private int f36846i;

        /* renamed from: j, reason: collision with root package name */
        private int f36847j;

        /* renamed from: k, reason: collision with root package name */
        private int f36848k;

        /* renamed from: l, reason: collision with root package name */
        private int f36849l;

        /* renamed from: m, reason: collision with root package name */
        private int f36850m;

        /* renamed from: n, reason: collision with root package name */
        private int f36851n;

        /* renamed from: o, reason: collision with root package name */
        private int f36852o;

        /* renamed from: p, reason: collision with root package name */
        private int f36853p;

        /* renamed from: q, reason: collision with root package name */
        private int f36854q;

        /* renamed from: r, reason: collision with root package name */
        private int f36855r;

        /* renamed from: s, reason: collision with root package name */
        private int f36856s;

        /* renamed from: t, reason: collision with root package name */
        private int f36857t;

        /* renamed from: u, reason: collision with root package name */
        private int f36858u;

        static {
            int iH = h(0, 0, 0, 0);
            f36834w = iH;
            int iH2 = h(0, 0, 0, 3);
            f36835x = iH2;
            f36836y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f36837z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f36827A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f36828B = new boolean[]{false, false, false, true, true, true, false};
            f36829C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            f36830D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f36831E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f36832F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                d3.C13466a.c(r4, r0, r1)
                d3.C13466a.c(r5, r0, r1)
                d3.C13466a.c(r6, r0, r1)
                d3.C13466a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: V3.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f36839b.append(c10);
                return;
            }
            this.f36838a.add(d());
            this.f36839b.clear();
            if (this.f36852o != -1) {
                this.f36852o = 0;
            }
            if (this.f36853p != -1) {
                this.f36853p = 0;
            }
            if (this.f36854q != -1) {
                this.f36854q = 0;
            }
            if (this.f36856s != -1) {
                this.f36856s = 0;
            }
            while (true) {
                if (this.f36838a.size() < this.f36847j && this.f36838a.size() < 15) {
                    this.f36858u = this.f36838a.size();
                    return;
                }
                this.f36838a.remove(0);
            }
        }

        public void b() {
            int length = this.f36839b.length();
            if (length > 0) {
                this.f36839b.delete(length - 1, length);
            }
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f36839b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f36852o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f36852o, length, 33);
                }
                if (this.f36853p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f36853p, length, 33);
                }
                if (this.f36854q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f36855r), this.f36854q, length, 33);
                }
                if (this.f36856s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f36857t), this.f36856s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f36838a.clear();
            this.f36839b.clear();
            this.f36852o = -1;
            this.f36853p = -1;
            this.f36854q = -1;
            this.f36856s = -1;
            this.f36858u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f36840c = true;
            this.f36841d = z10;
            this.f36842e = i10;
            this.f36843f = z11;
            this.f36844g = i11;
            this.f36845h = i12;
            this.f36846i = i14;
            int i17 = i13 + 1;
            if (this.f36847j != i17) {
                this.f36847j = i17;
                while (true) {
                    if (this.f36838a.size() < this.f36847j && this.f36838a.size() < 15) {
                        break;
                    } else {
                        this.f36838a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f36849l != i15) {
                this.f36849l = i15;
                int i18 = i15 - 1;
                q(f36829C[i18], f36835x, f36828B[i18], 0, f36837z[i18], f36827A[i18], f36836y[i18]);
            }
            if (i16 == 0 || this.f36850m == i16) {
                return;
            }
            this.f36850m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, f36831E[i19], f36830D[i19]);
            n(f36833v, f36832F[i19], f36834w);
        }

        public boolean i() {
            return this.f36840c;
        }

        public boolean k() {
            return this.f36841d;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f36852o != -1) {
                if (!z10) {
                    this.f36839b.setSpan(new StyleSpan(2), this.f36852o, this.f36839b.length(), 33);
                    this.f36852o = -1;
                }
            } else if (z10) {
                this.f36852o = this.f36839b.length();
            }
            if (this.f36853p == -1) {
                if (z11) {
                    this.f36853p = this.f36839b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f36839b.setSpan(new UnderlineSpan(), this.f36853p, this.f36839b.length(), 33);
                this.f36853p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f36854q != -1 && this.f36855r != i10) {
                this.f36839b.setSpan(new ForegroundColorSpan(this.f36855r), this.f36854q, this.f36839b.length(), 33);
            }
            if (i10 != f36833v) {
                this.f36854q = this.f36839b.length();
                this.f36855r = i10;
            }
            if (this.f36856s != -1 && this.f36857t != i11) {
                this.f36839b.setSpan(new BackgroundColorSpan(this.f36857t), this.f36856s, this.f36839b.length(), 33);
            }
            if (i11 != f36834w) {
                this.f36856s = this.f36839b.length();
                this.f36857t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f36858u != i10) {
                a('\n');
            }
            this.f36858u = i10;
        }

        public void p(boolean z10) {
            this.f36841d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f36851n = i10;
            this.f36848k = i15;
        }

        public b() {
            l();
        }

        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            int i10;
            float f12;
            int i11;
            boolean z10;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.f36838a.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.f36838a.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i13 = this.f36848k;
            int i14 = 2;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            throw new IllegalArgumentException("Unexpected justification value: " + this.f36848k);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            if (this.f36843f) {
                f10 = this.f36845h / 99.0f;
                f11 = this.f36844g / 99.0f;
            } else {
                f10 = this.f36845h / 209.0f;
                f11 = this.f36844g / 74.0f;
            }
            float f13 = (f10 * 0.9f) + 0.05f;
            float f14 = (f11 * 0.9f) + 0.05f;
            int i15 = this.f36846i;
            if (i15 / 3 == 0) {
                i10 = i15;
                f12 = f13;
                i11 = 0;
            } else if (i15 / 3 == 1) {
                i10 = i15;
                f12 = f13;
                i11 = 1;
            } else {
                i10 = i15;
                f12 = f13;
                i11 = 2;
            }
            if (i10 % 3 == 0) {
                i14 = 0;
            } else if (i10 % 3 == 1) {
                i14 = 1;
            }
            if (this.f36851n != f36834w) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new a(spannableStringBuilder, alignment, f14, 0, i11, f12, i14, -3.4028235E38f, z10, this.f36851n, this.f36842e);
        }

        public boolean j() {
            if (i()) {
                if (!this.f36838a.isEmpty() || this.f36839b.length() != 0) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public void l() {
            e();
            this.f36840c = false;
            this.f36841d = false;
            this.f36842e = 4;
            this.f36843f = false;
            this.f36844g = 0;
            this.f36845h = 0;
            this.f36846i = 0;
            this.f36847j = 15;
            this.f36848k = 0;
            this.f36849l = 0;
            this.f36850m = 0;
            int i10 = f36834w;
            this.f36851n = i10;
            this.f36855r = f36833v;
            this.f36857t = i10;
        }
    }

    private void G() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f36818m[i10].l();
        }
    }

    private void u(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f36814i.r(8);
        } else if (i10 <= 23) {
            this.f36814i.r(16);
        } else if (i10 <= 31) {
            this.f36814i.r(24);
        }
    }

    /* renamed from: V3.c$c, reason: collision with other inner class name */
    private static final class C0804c {

        /* renamed from: a, reason: collision with root package name */
        public final int f36859a;

        /* renamed from: b, reason: collision with root package name */
        public final int f36860b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f36861c;

        /* renamed from: d, reason: collision with root package name */
        int f36862d = 0;

        public C0804c(int i10, int i11) {
            this.f36859a = i10;
            this.f36860b = i11;
            this.f36861c = new byte[(i11 * 2) - 1];
        }
    }

    private void A(int i10) {
        if (i10 == 160) {
            this.f36819n.a((char) 13252);
            return;
        }
        r.i("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f36819n.a('_');
    }

    private void B() {
        this.f36819n.m(this.f36814i.h(4), this.f36814i.h(2), this.f36814i.h(2), this.f36814i.g(), this.f36814i.g(), this.f36814i.h(3), this.f36814i.h(3));
    }

    private void C() {
        int iH = b.h(this.f36814i.h(2), this.f36814i.h(2), this.f36814i.h(2), this.f36814i.h(2));
        int iH2 = b.h(this.f36814i.h(2), this.f36814i.h(2), this.f36814i.h(2), this.f36814i.h(2));
        this.f36814i.r(2);
        this.f36819n.n(iH, iH2, b.g(this.f36814i.h(2), this.f36814i.h(2), this.f36814i.h(2)));
    }

    private void D() {
        this.f36814i.r(4);
        int iH = this.f36814i.h(4);
        this.f36814i.r(2);
        this.f36819n.o(iH, this.f36814i.h(6));
    }

    private void E() {
        int iH = b.h(this.f36814i.h(2), this.f36814i.h(2), this.f36814i.h(2), this.f36814i.h(2));
        int iH2 = this.f36814i.h(2);
        int iG = b.g(this.f36814i.h(2), this.f36814i.h(2), this.f36814i.h(2));
        if (this.f36814i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f36814i.g();
        int iH3 = this.f36814i.h(2);
        int iH4 = this.f36814i.h(2);
        int iH5 = this.f36814i.h(2);
        this.f36814i.r(8);
        this.f36819n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    private void F() {
        C0804c c0804c = this.f36822q;
        if (c0804c.f36862d != (c0804c.f36860b * 2) - 1) {
            r.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f36822q.f36860b * 2) - 1) + ", but current index is " + this.f36822q.f36862d + " (sequence number " + this.f36822q.f36859a + ");");
        }
        C c10 = this.f36814i;
        C0804c c0804c2 = this.f36822q;
        c10.o(c0804c2.f36861c, c0804c2.f36862d);
        boolean z10 = false;
        while (true) {
            if (this.f36814i.b() <= 0) {
                break;
            }
            int iH = this.f36814i.h(3);
            int iH2 = this.f36814i.h(5);
            if (iH == 7) {
                this.f36814i.r(2);
                iH = this.f36814i.h(6);
                if (iH < 7) {
                    r.i("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH != 0) {
                    r.i("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                }
            } else if (iH != this.f36817l) {
                this.f36814i.s(iH2);
            } else {
                int iE = this.f36814i.e() + (iH2 * 8);
                while (this.f36814i.e() < iE) {
                    int iH3 = this.f36814i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f36814i.h(8);
                        if (iH4 <= 31) {
                            u(iH4);
                        } else {
                            if (iH4 <= 127) {
                                z(iH4);
                            } else if (iH4 <= 159) {
                                v(iH4);
                            } else if (iH4 <= 255) {
                                A(iH4);
                            } else {
                                r.i("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        s(iH3);
                    } else {
                        if (iH3 <= 127) {
                            x(iH3);
                        } else if (iH3 <= 159) {
                            t(iH3);
                        } else if (iH3 <= 255) {
                            y(iH3);
                        } else {
                            r.i("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f36820o = r();
        }
    }

    private void q() {
        if (this.f36822q == null) {
            return;
        }
        F();
        this.f36822q = null;
    }

    private List<C6350a> r() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f36818m[i10].j() && this.f36818m[i10].k() && (aVarC = this.f36818m[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f36824c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f36825a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void s(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f36820o = r();
                return;
            }
            if (i10 == 8) {
                this.f36819n.b();
                return;
            }
            switch (i10) {
                case 12:
                    G();
                    break;
                case 13:
                    this.f36819n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f36814i.r(8);
                        break;
                    } else if (i10 >= 24 && i10 <= 31) {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f36814i.r(16);
                        break;
                    } else {
                        r.i("Cea708Decoder", "Invalid C0 command: " + i10);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void t(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f36823r != i12) {
                    this.f36823r = i12;
                    this.f36819n = this.f36818m[i12];
                    break;
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f36814i.g()) {
                        this.f36818m[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f36814i.g()) {
                        this.f36818m[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f36814i.g()) {
                        this.f36818m[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f36814i.g()) {
                        this.f36818m[8 - i14].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f36814i.g()) {
                        this.f36818m[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f36814i.r(8);
                break;
            case 142:
                break;
            case 143:
                G();
                break;
            case 144:
                if (this.f36819n.i()) {
                    B();
                    break;
                } else {
                    this.f36814i.r(16);
                    break;
                }
            case 145:
                if (this.f36819n.i()) {
                    C();
                    break;
                } else {
                    this.f36814i.r(24);
                    break;
                }
            case 146:
                if (this.f36819n.i()) {
                    D();
                    break;
                } else {
                    this.f36814i.r(16);
                    break;
                }
            case 147:
            case 148:
            case 149:
            case BinsView.TOTE_WIDTH_DP /* 150 */:
            default:
                r.i("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f36819n.i()) {
                    E();
                    break;
                } else {
                    this.f36814i.r(32);
                    break;
                }
            case 152:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                w(i15);
                if (this.f36823r != i15) {
                    this.f36823r = i15;
                    this.f36819n = this.f36818m[i15];
                    break;
                }
                break;
        }
    }

    private void v(int i10) {
        if (i10 <= 135) {
            this.f36814i.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f36814i.r(40);
        } else if (i10 <= 159) {
            this.f36814i.r(2);
            this.f36814i.r(this.f36814i.h(6) * 8);
        }
    }

    private void w(int i10) {
        b bVar = this.f36818m[i10];
        this.f36814i.r(2);
        boolean zG = this.f36814i.g();
        this.f36814i.r(2);
        int iH = this.f36814i.h(3);
        boolean zG2 = this.f36814i.g();
        int iH2 = this.f36814i.h(7);
        int iH3 = this.f36814i.h(8);
        int iH4 = this.f36814i.h(4);
        int iH5 = this.f36814i.h(4);
        this.f36814i.r(2);
        this.f36814i.r(6);
        this.f36814i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f36814i.h(3), this.f36814i.h(3));
    }

    private void x(int i10) {
        if (i10 == 127) {
            this.f36819n.a((char) 9835);
        } else {
            this.f36819n.a((char) (i10 & l3.f92484c));
        }
    }

    private void y(int i10) {
        this.f36819n.a((char) (i10 & l3.f92484c));
    }

    private void z(int i10) {
        if (i10 == 32) {
            this.f36819n.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f36819n.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f36819n.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f36819n.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f36819n.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f36819n.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f36819n.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f36819n.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f36819n.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f36819n.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f36819n.a((char) 9608);
                break;
            case 49:
                this.f36819n.a((char) 8216);
                break;
            case 50:
                this.f36819n.a((char) 8217);
                break;
            case 51:
                this.f36819n.a((char) 8220);
                break;
            case 52:
                this.f36819n.a((char) 8221);
                break;
            case 53:
                this.f36819n.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f36819n.a((char) 8539);
                        break;
                    case 119:
                        this.f36819n.a((char) 8540);
                        break;
                    case BinsView.TOTE_HEIGHT_DP /* 120 */:
                        this.f36819n.a((char) 8541);
                        break;
                    case 121:
                        this.f36819n.a((char) 8542);
                        break;
                    case 122:
                        this.f36819n.a((char) 9474);
                        break;
                    case 123:
                        this.f36819n.a((char) 9488);
                        break;
                    case 124:
                        this.f36819n.a((char) 9492);
                        break;
                    case 125:
                        this.f36819n.a((char) 9472);
                        break;
                    case 126:
                        this.f36819n.a((char) 9496);
                        break;
                    case l3.f92485d /* 127 */:
                        this.f36819n.a((char) 9484);
                        break;
                    default:
                        r.i("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
        }
    }

    @Override // V3.e
    protected k g() {
        List<C6350a> list = this.f36820o;
        this.f36821p = list;
        return new f((List) C13466a.e(list));
    }

    @Override // V3.e
    protected void h(o oVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C13466a.e(oVar.f55465d);
        this.f36813h.U(byteBuffer.array(), byteBuffer.limit());
        while (this.f36813h.a() >= 3) {
            int iH = this.f36813h.H();
            int i10 = iH & 3;
            boolean z10 = (iH & 4) == 4;
            byte bH = (byte) this.f36813h.H();
            byte bH2 = (byte) this.f36813h.H();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        q();
                        int i11 = (bH & 192) >> 6;
                        int i12 = this.f36815j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            G();
                            r.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f36815j + " current=" + i11);
                        }
                        this.f36815j = i11;
                        int i13 = bH & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0804c c0804c = new C0804c(i11, i13);
                        this.f36822q = c0804c;
                        byte[] bArr = c0804c.f36861c;
                        int i14 = c0804c.f36862d;
                        c0804c.f36862d = i14 + 1;
                        bArr[i14] = bH2;
                    } else {
                        C13466a.a(i10 == 2);
                        C0804c c0804c2 = this.f36822q;
                        if (c0804c2 == null) {
                            r.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0804c2.f36861c;
                            int i15 = c0804c2.f36862d;
                            int i16 = i15 + 1;
                            c0804c2.f36862d = i16;
                            bArr2[i15] = bH;
                            c0804c2.f36862d = i15 + 2;
                            bArr2[i16] = bH2;
                        }
                    }
                    C0804c c0804c3 = this.f36822q;
                    if (c0804c3.f36862d == (c0804c3.f36860b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override // V3.e
    protected boolean m() {
        return this.f36820o != this.f36821p;
    }

    public c(int i10, List<byte[]> list) {
        this.f36817l = i10 == -1 ? 1 : i10;
        this.f36816k = list != null && C13474i.v(list);
        this.f36818m = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f36818m[i11] = new b();
        }
        this.f36819n = this.f36818m[0];
    }

    @Override // V3.e, U3.l
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // V3.e, g3.d
    public void flush() {
        super.flush();
        this.f36820o = null;
        this.f36821p = null;
        this.f36823r = 0;
        this.f36819n = this.f36818m[0];
        G();
        this.f36822q = null;
    }

    @Override // V3.e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ o e() throws SubtitleDecoderException {
        return super.e();
    }

    @Override // V3.e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ p a() throws SubtitleDecoderException {
        return super.a();
    }

    @Override // V3.e
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void c(o oVar) throws SubtitleDecoderException {
        super.c(oVar);
    }

    @Override // V3.e, g3.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
