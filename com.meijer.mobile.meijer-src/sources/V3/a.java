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
import c3.C6476a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d3.C13599a;
import d3.D;
import d3.r;
import fsimpl.C14170dq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class a extends e {

    /* renamed from: i, reason: collision with root package name */
    private final int f39645i;

    /* renamed from: j, reason: collision with root package name */
    private final int f39646j;

    /* renamed from: k, reason: collision with root package name */
    private final int f39647k;

    /* renamed from: l, reason: collision with root package name */
    private final long f39648l;

    /* renamed from: o, reason: collision with root package name */
    private List<C6476a> f39651o;

    /* renamed from: p, reason: collision with root package name */
    private List<C6476a> f39652p;

    /* renamed from: q, reason: collision with root package name */
    private int f39653q;

    /* renamed from: r, reason: collision with root package name */
    private int f39654r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f39655s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f39656t;

    /* renamed from: u, reason: collision with root package name */
    private byte f39657u;

    /* renamed from: v, reason: collision with root package name */
    private byte f39658v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f39660x;

    /* renamed from: y, reason: collision with root package name */
    private long f39661y;

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f39643z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f39636A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f39637B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f39638C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, BinsView.TOTE_HEIGHT_DP, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f39639D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f39640E = {193, HttpResponseStatus.SUCCESS_CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, HttpResponseStatus.SUCCESS_OK, HttpResponseStatus.SUCCESS_ACCEPTED, HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION, 235, HttpResponseStatus.SUCCESS_PARTIAL_CONTENT, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f39641F = {195, 227, HttpResponseStatus.SUCCESS_RESET_CONTENT, HttpResponseStatus.SUCCESS_NO_CONTENT, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    private static final boolean[] f39642G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    private final D f39644h = new D();

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList<C0850a> f39649m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    private C0850a f39650n = new C0850a(0, 4);

    /* renamed from: w, reason: collision with root package name */
    private int f39659w = 0;

    /* renamed from: V3.a$a, reason: collision with other inner class name */
    private static final class C0850a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0851a> f39662a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f39663b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f39664c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f39665d;

        /* renamed from: e, reason: collision with root package name */
        private int f39666e;

        /* renamed from: f, reason: collision with root package name */
        private int f39667f;

        /* renamed from: g, reason: collision with root package name */
        private int f39668g;

        /* renamed from: h, reason: collision with root package name */
        private int f39669h;

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        /* renamed from: V3.a$a$a, reason: collision with other inner class name */
        private static class C0851a {

            /* renamed from: a, reason: collision with root package name */
            public final int f39670a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f39671b;

            /* renamed from: c, reason: collision with root package name */
            public int f39672c;

            public C0851a(int i10, boolean z10, int i11) {
                this.f39670a = i10;
                this.f39671b = z10;
                this.f39672c = i11;
            }
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f39664c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f39662a.size()) {
                C0851a c0851a = this.f39662a.get(i14);
                boolean z11 = c0851a.f39671b;
                int i16 = c0851a.f39670a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.f39637B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0851a.f39672c;
                i14++;
                if (i17 != (i14 < this.f39662a.size() ? this.f39662a.get(i14).f39672c : length)) {
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
            if (this.f39664c.length() < 32) {
                this.f39664c.append(c10);
            }
        }

        public void f() {
            int length = this.f39664c.length();
            if (length > 0) {
                this.f39664c.delete(length - 1, length);
                for (int size = this.f39662a.size() - 1; size >= 0; size--) {
                    C0851a c0851a = this.f39662a.get(size);
                    int i10 = c0851a.f39672c;
                    if (i10 != length) {
                        return;
                    }
                    c0851a.f39672c = i10 - 1;
                }
            }
        }

        public C6476a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f39663b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f39663b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f39666e + this.f39667f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f39668g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f39668g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f39665d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f39668g == 1) {
                i14 -= this.f39669h - 1;
            }
            return new C6476a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f39662a.isEmpty() && this.f39663b.isEmpty() && this.f39664c.length() == 0;
        }

        public void j(int i10) {
            this.f39668g = i10;
            this.f39662a.clear();
            this.f39663b.clear();
            this.f39664c.setLength(0);
            this.f39665d = 15;
            this.f39666e = 0;
            this.f39667f = 0;
        }

        public void k() {
            this.f39663b.add(h());
            this.f39664c.setLength(0);
            this.f39662a.clear();
            int iMin = Math.min(this.f39669h, this.f39665d);
            while (this.f39663b.size() >= iMin) {
                this.f39663b.remove(0);
            }
        }

        public void l(int i10) {
            this.f39668g = i10;
        }

        public void m(int i10) {
            this.f39669h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f39662a.add(new C0851a(i10, z10, this.f39664c.length()));
        }

        public C0850a(int i10, int i11) {
            j(i10);
            this.f39669h = i11;
        }
    }

    private boolean H(boolean z10, byte b10, byte b11) {
        if (!z10 || !G(b10)) {
            this.f39656t = false;
        } else {
            if (this.f39656t && this.f39657u == b10 && this.f39658v == b11) {
                this.f39656t = false;
                return true;
            }
            this.f39656t = true;
            this.f39657u = b10;
            this.f39658v = b11;
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
        int i10 = f39643z[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f39650n.f39665d) {
            if (this.f39653q != 1 && !this.f39650n.i()) {
                C0850a c0850a = new C0850a(this.f39653q, this.f39654r);
                this.f39650n = c0850a;
                this.f39649m.add(c0850a);
            }
            this.f39650n.f39665d = i10;
        }
        boolean z10 = (b11 & C14170dq.SCREEN) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f39650n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f39650n.f39666e = f39636A[i11];
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
        this.f39650n.j(this.f39653q);
        this.f39649m.clear();
        this.f39649m.add(this.f39650n);
    }

    private void O(int i10) {
        int i11 = this.f39653q;
        if (i11 == i10) {
            return;
        }
        this.f39653q = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f39649m.size(); i12++) {
                this.f39649m.get(i12).l(i10);
            }
            return;
        }
        N();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f39651o = Collections.EMPTY_LIST;
        }
    }

    private void P(int i10) {
        this.f39654r = i10;
        this.f39650n.m(i10);
    }

    private boolean Q() {
        return (this.f39648l == -9223372036854775807L || this.f39661y == -9223372036854775807L || l() - this.f39661y < this.f39648l) ? false : true;
    }

    private static char r(byte b10) {
        return (char) f39638C[(b10 & Byte.MAX_VALUE) - 32];
    }

    private static int s(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<C6476a> t() {
        int size = this.f39649m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            C6476a c6476aG = this.f39649m.get(i10).g(Integer.MIN_VALUE);
            arrayList.add(c6476aG);
            if (c6476aG != null) {
                iMin = Math.min(iMin, c6476aG.f61198i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            C6476a c6476a = (C6476a) arrayList.get(i11);
            if (c6476a != null) {
                if (c6476a.f61198i != iMin) {
                    c6476a = (C6476a) C13599a.e(this.f39649m.get(i11).g(iMin));
                }
                arrayList2.add(c6476a);
            }
        }
        return arrayList2;
    }

    private static char u(byte b10) {
        return (char) f39640E[b10 & 31];
    }

    private static char v(byte b10) {
        return (char) f39641F[b10 & 31];
    }

    private static char w(byte b10, byte b11) {
        return (b10 & 1) == 0 ? u(b11) : v(b11);
    }

    private static char x(byte b10) {
        return (char) f39639D[b10 & C14170dq.MULTIPLY];
    }

    private void y(byte b10) {
        this.f39650n.e(' ');
        this.f39650n.p((b10 >> 1) & 7, (b10 & 1) == 1);
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
                int i10 = this.f39653q;
                if (i10 != 0) {
                    if (b10 == 33) {
                        this.f39650n.f();
                        break;
                    } else {
                        switch (b10) {
                            case 44:
                                this.f39651o = Collections.EMPTY_LIST;
                                if (i10 == 1 || i10 == 3) {
                                    N();
                                    break;
                                }
                            case 45:
                                if (i10 == 1 && !this.f39650n.i()) {
                                    this.f39650n.k();
                                    break;
                                }
                                break;
                            case 46:
                                N();
                                break;
                            case 47:
                                this.f39651o = t();
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
        List<C6476a> list = this.f39651o;
        this.f39652p = list;
        return new f((List) C13599a.e(list));
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
        return this.f39651o != this.f39652p;
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
            C13599a.a(z10);
            this.f39648l = j10 * 1000;
        } else {
            this.f39648l = -9223372036854775807L;
        }
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f39645i = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        r.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f39647k = 0;
                        this.f39646j = 0;
                    } else {
                        this.f39647k = 1;
                        this.f39646j = 1;
                    }
                } else {
                    this.f39647k = 0;
                    this.f39646j = 1;
                }
            } else {
                this.f39647k = 1;
                this.f39646j = 0;
            }
        } else {
            this.f39647k = 0;
            this.f39646j = 0;
        }
        O(0);
        N();
        this.f39660x = true;
        this.f39661y = -9223372036854775807L;
    }

    private void M(byte b10, byte b11) {
        if (L(b10)) {
            this.f39660x = false;
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
                                this.f39660x = false;
                                break;
                        }
                        return;
                }
            }
            this.f39660x = true;
        }
    }

    private boolean R(byte b10) {
        if (B(b10)) {
            this.f39659w = s(b10);
        }
        if (this.f39659w == this.f39647k) {
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
        this.f39651o = null;
        this.f39652p = null;
        O(0);
        P(4);
        N();
        this.f39655s = false;
        this.f39656t = false;
        this.f39657u = (byte) 0;
        this.f39658v = (byte) 0;
        this.f39659w = 0;
        this.f39660x = true;
        this.f39661y = -9223372036854775807L;
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
            this.f39651o = Collections.EMPTY_LIST;
            this.f39661y = -9223372036854775807L;
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
