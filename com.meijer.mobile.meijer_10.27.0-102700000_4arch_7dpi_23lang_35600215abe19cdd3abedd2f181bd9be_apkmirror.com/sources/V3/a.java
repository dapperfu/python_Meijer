package V3;

import U3.k;
import U3.o;
import U3.p;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.extractor.text.SubtitleDecoderException;
import c3.C6350a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d3.C13466a;
import d3.D;
import d3.r;
import fsimpl.C14045dq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class a extends e {

    /* renamed from: i, reason: collision with root package name */
    private final int f36785i;

    /* renamed from: j, reason: collision with root package name */
    private final int f36786j;

    /* renamed from: k, reason: collision with root package name */
    private final int f36787k;

    /* renamed from: l, reason: collision with root package name */
    private final long f36788l;

    /* renamed from: o, reason: collision with root package name */
    private List<C6350a> f36791o;

    /* renamed from: p, reason: collision with root package name */
    private List<C6350a> f36792p;

    /* renamed from: q, reason: collision with root package name */
    private int f36793q;

    /* renamed from: r, reason: collision with root package name */
    private int f36794r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f36795s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f36796t;

    /* renamed from: u, reason: collision with root package name */
    private byte f36797u;

    /* renamed from: v, reason: collision with root package name */
    private byte f36798v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f36800x;

    /* renamed from: y, reason: collision with root package name */
    private long f36801y;

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f36783z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f36776A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f36777B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f36778C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, BinsView.TOTE_HEIGHT_DP, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f36779D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f36780E = {193, HttpResponseStatus.SUCCESS_CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, HttpResponseStatus.SUCCESS_OK, HttpResponseStatus.SUCCESS_ACCEPTED, HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION, 235, HttpResponseStatus.SUCCESS_PARTIAL_CONTENT, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f36781F = {195, 227, HttpResponseStatus.SUCCESS_RESET_CONTENT, HttpResponseStatus.SUCCESS_NO_CONTENT, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    private static final boolean[] f36782G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    private final D f36784h = new D();

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList<C0802a> f36789m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    private C0802a f36790n = new C0802a(0, 4);

    /* renamed from: w, reason: collision with root package name */
    private int f36799w = 0;

    /* renamed from: V3.a$a, reason: collision with other inner class name */
    private static final class C0802a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0803a> f36802a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f36803b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f36804c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f36805d;

        /* renamed from: e, reason: collision with root package name */
        private int f36806e;

        /* renamed from: f, reason: collision with root package name */
        private int f36807f;

        /* renamed from: g, reason: collision with root package name */
        private int f36808g;

        /* renamed from: h, reason: collision with root package name */
        private int f36809h;

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        /* renamed from: V3.a$a$a, reason: collision with other inner class name */
        private static class C0803a {

            /* renamed from: a, reason: collision with root package name */
            public final int f36810a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f36811b;

            /* renamed from: c, reason: collision with root package name */
            public int f36812c;

            public C0803a(int i10, boolean z10, int i11) {
                this.f36810a = i10;
                this.f36811b = z10;
                this.f36812c = i11;
            }
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f36804c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f36802a.size()) {
                C0803a c0803a = this.f36802a.get(i14);
                boolean z11 = c0803a.f36811b;
                int i16 = c0803a.f36810a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.f36777B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0803a.f36812c;
                i14++;
                if (i17 != (i14 < this.f36802a.size() ? this.f36802a.get(i14).f36812c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f36804c.length() < 32) {
                this.f36804c.append(c10);
            }
        }

        public void f() {
            int length = this.f36804c.length();
            if (length > 0) {
                this.f36804c.delete(length - 1, length);
                for (int size = this.f36802a.size() - 1; size >= 0; size--) {
                    C0803a c0803a = this.f36802a.get(size);
                    int i10 = c0803a.f36812c;
                    if (i10 != length) {
                        return;
                    }
                    c0803a.f36812c = i10 - 1;
                }
            }
        }

        public C6350a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f36803b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f36803b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f36806e + this.f36807f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f36808g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f36808g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f36805d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f36808g == 1) {
                i14 -= this.f36809h - 1;
            }
            return new C6350a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f36802a.isEmpty() && this.f36803b.isEmpty() && this.f36804c.length() == 0;
        }

        public void j(int i10) {
            this.f36808g = i10;
            this.f36802a.clear();
            this.f36803b.clear();
            this.f36804c.setLength(0);
            this.f36805d = 15;
            this.f36806e = 0;
            this.f36807f = 0;
        }

        public void k() {
            this.f36803b.add(h());
            this.f36804c.setLength(0);
            this.f36802a.clear();
            int iMin = Math.min(this.f36809h, this.f36805d);
            while (this.f36803b.size() >= iMin) {
                this.f36803b.remove(0);
            }
        }

        public void l(int i10) {
            this.f36808g = i10;
        }

        public void m(int i10) {
            this.f36809h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f36802a.add(new C0803a(i10, z10, this.f36804c.length()));
        }

        public C0802a(int i10, int i11) {
            j(i10);
            this.f36809h = i11;
        }
    }

    private boolean H(boolean z10, byte b10, byte b11) {
        if (!z10 || !G(b10)) {
            this.f36796t = false;
        } else {
            if (this.f36796t && this.f36797u == b10 && this.f36798v == b11) {
                this.f36796t = false;
                return true;
            }
            this.f36796t = true;
            this.f36797u = b10;
            this.f36798v = b11;
        }
        return false;
    }

    private static boolean L(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    @Override // V3.e, g3.d
    public void release() {
    }

    private void A(byte b10, byte b11) {
        int i10 = f36783z[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f36790n.f36805d) {
            if (this.f36793q != 1 && !this.f36790n.i()) {
                C0802a c0802a = new C0802a(this.f36793q, this.f36794r);
                this.f36790n = c0802a;
                this.f36789m.add(c0802a);
            }
            this.f36790n.f36805d = i10;
        }
        boolean z10 = (b11 & C14045dq.SCREEN) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f36790n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f36790n.f36806e = f36776A[i11];
        }
    }

    private static boolean B(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean F(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean G(byte b10) {
        return (b10 & 240) == 16;
    }

    private static boolean I(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean J(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean K(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private void N() {
        this.f36790n.j(this.f36793q);
        this.f36789m.clear();
        this.f36789m.add(this.f36790n);
    }

    private void O(int i10) {
        int i11 = this.f36793q;
        if (i11 == i10) {
            return;
        }
        this.f36793q = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f36789m.size(); i12++) {
                this.f36789m.get(i12).l(i10);
            }
            return;
        }
        N();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f36791o = Collections.EMPTY_LIST;
        }
    }

    private void P(int i10) {
        this.f36794r = i10;
        this.f36790n.m(i10);
    }

    private boolean Q() {
        return (this.f36788l == -9223372036854775807L || this.f36801y == -9223372036854775807L || l() - this.f36801y < this.f36788l) ? false : true;
    }

    private static char r(byte b10) {
        return (char) f36778C[(b10 & Byte.MAX_VALUE) - 32];
    }

    private static int s(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<C6350a> t() {
        int size = this.f36789m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            C6350a c6350aG = this.f36789m.get(i10).g(Integer.MIN_VALUE);
            arrayList.add(c6350aG);
            if (c6350aG != null) {
                iMin = Math.min(iMin, c6350aG.f61399i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            C6350a c6350a = (C6350a) arrayList.get(i11);
            if (c6350a != null) {
                if (c6350a.f61399i != iMin) {
                    c6350a = (C6350a) C13466a.e(this.f36789m.get(i11).g(iMin));
                }
                arrayList2.add(c6350a);
            }
        }
        return arrayList2;
    }

    private static char u(byte b10) {
        return (char) f36780E[b10 & 31];
    }

    private static char v(byte b10) {
        return (char) f36781F[b10 & 31];
    }

    private static char w(byte b10, byte b11) {
        return (b10 & 1) == 0 ? u(b11) : v(b11);
    }

    private static char x(byte b10) {
        return (char) f36779D[b10 & C14045dq.MULTIPLY];
    }

    private void y(byte b10) {
        this.f36790n.e(' ');
        this.f36790n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void z(byte b10) {
        if (b10 == 32) {
            O(2);
            return;
        }
        if (b10 == 41) {
            O(3);
            return;
        }
        switch (b10) {
            case 37:
                O(1);
                P(2);
                break;
            case 38:
                O(1);
                P(3);
                break;
            case 39:
                O(1);
                P(4);
                break;
            default:
                int i10 = this.f36793q;
                if (i10 != 0) {
                    if (b10 == 33) {
                        this.f36790n.f();
                        break;
                    } else {
                        switch (b10) {
                            case 44:
                                this.f36791o = Collections.EMPTY_LIST;
                                if (i10 == 1 || i10 == 3) {
                                    N();
                                    break;
                                }
                            case 45:
                                if (i10 == 1 && !this.f36790n.i()) {
                                    this.f36790n.k();
                                    break;
                                }
                                break;
                            case 46:
                                N();
                                break;
                            case 47:
                                this.f36791o = t();
                                N();
                                break;
                        }
                    }
                }
                break;
        }
    }

    @Override // V3.e
    protected k g() {
        List<C6350a> list = this.f36791o;
        this.f36792p = list;
        return new f((List) C13466a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // V3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void h(U3.o r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.a.h(U3.o):void");
    }

    @Override // V3.e
    protected boolean m() {
        return this.f36791o != this.f36792p;
    }

    public a(String str, int i10, long j10) {
        int i11;
        boolean z10;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 16000) {
                z10 = true;
            } else {
                z10 = false;
            }
            C13466a.a(z10);
            this.f36788l = j10 * 1000;
        } else {
            this.f36788l = -9223372036854775807L;
        }
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f36785i = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        r.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f36787k = 0;
                        this.f36786j = 0;
                    } else {
                        this.f36787k = 1;
                        this.f36786j = 1;
                    }
                } else {
                    this.f36787k = 0;
                    this.f36786j = 1;
                }
            } else {
                this.f36787k = 1;
                this.f36786j = 0;
            }
        } else {
            this.f36787k = 0;
            this.f36786j = 0;
        }
        O(0);
        N();
        this.f36800x = true;
        this.f36801y = -9223372036854775807L;
    }

    private void M(byte b10, byte b11) {
        if (L(b10)) {
            this.f36800x = false;
            return;
        }
        if (I(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f36800x = false;
                                break;
                        }
                        return;
                }
            }
            this.f36800x = true;
        }
    }

    private boolean R(byte b10) {
        if (B(b10)) {
            this.f36799w = s(b10);
        }
        if (this.f36799w == this.f36787k) {
            return true;
        }
        return false;
    }

    @Override // V3.e, U3.l
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // V3.e, g3.d
    public void flush() {
        super.flush();
        this.f36791o = null;
        this.f36792p = null;
        O(0);
        P(4);
        N();
        this.f36795s = false;
        this.f36796t = false;
        this.f36797u = (byte) 0;
        this.f36798v = (byte) 0;
        this.f36799w = 0;
        this.f36800x = true;
        this.f36801y = -9223372036854775807L;
    }

    @Override // V3.e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ o e() throws SubtitleDecoderException {
        return super.e();
    }

    @Override // V3.e, g3.d
    /* renamed from: j */
    public p a() throws SubtitleDecoderException {
        p pVarK;
        p pVarA = super.a();
        if (pVarA != null) {
            return pVarA;
        }
        if (Q() && (pVarK = k()) != null) {
            this.f36791o = Collections.EMPTY_LIST;
            this.f36801y = -9223372036854775807L;
            pVarK.F(l(), g(), Long.MAX_VALUE);
            return pVarK;
        }
        return null;
    }

    @Override // V3.e
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void c(o oVar) throws SubtitleDecoderException {
        super.c(oVar);
    }
}
