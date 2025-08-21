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
import c3.C6476a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d3.C;
import d3.C13599a;
import d3.C13607i;
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
    private final D f39673h = new D();

    /* renamed from: i, reason: collision with root package name */
    private final C f39674i = new C();

    /* renamed from: j, reason: collision with root package name */
    private int f39675j = -1;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f39676k;

    /* renamed from: l, reason: collision with root package name */
    private final int f39677l;

    /* renamed from: m, reason: collision with root package name */
    private final b[] f39678m;

    /* renamed from: n, reason: collision with root package name */
    private b f39679n;

    /* renamed from: o, reason: collision with root package name */
    private List<C6476a> f39680o;

    /* renamed from: p, reason: collision with root package name */
    private List<C6476a> f39681p;

    /* renamed from: q, reason: collision with root package name */
    private C0852c f39682q;

    /* renamed from: r, reason: collision with root package name */
    private int f39683r;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f39684c = new Comparator() { // from class: V3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((c.a) obj2).f39686b, ((c.a) obj).f39686b);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final C6476a f39685a;

        /* renamed from: b, reason: collision with root package name */
        public final int f39686b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            C6476a.b bVarN = new C6476a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                bVarN.s(i13);
            }
            this.f39685a = bVarN.a();
            this.f39686b = i14;
        }
    }

    private static final class b {

        /* renamed from: A, reason: collision with root package name */
        private static final int[] f39687A;

        /* renamed from: B, reason: collision with root package name */
        private static final boolean[] f39688B;

        /* renamed from: C, reason: collision with root package name */
        private static final int[] f39689C;

        /* renamed from: D, reason: collision with root package name */
        private static final int[] f39690D;

        /* renamed from: E, reason: collision with root package name */
        private static final int[] f39691E;

        /* renamed from: F, reason: collision with root package name */
        private static final int[] f39692F;

        /* renamed from: v, reason: collision with root package name */
        public static final int f39693v = h(2, 2, 2, 0);

        /* renamed from: w, reason: collision with root package name */
        public static final int f39694w;

        /* renamed from: x, reason: collision with root package name */
        public static final int f39695x;

        /* renamed from: y, reason: collision with root package name */
        private static final int[] f39696y;

        /* renamed from: z, reason: collision with root package name */
        private static final int[] f39697z;

        /* renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f39698a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f39699b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        private boolean f39700c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f39701d;

        /* renamed from: e, reason: collision with root package name */
        private int f39702e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f39703f;

        /* renamed from: g, reason: collision with root package name */
        private int f39704g;

        /* renamed from: h, reason: collision with root package name */
        private int f39705h;

        /* renamed from: i, reason: collision with root package name */
        private int f39706i;

        /* renamed from: j, reason: collision with root package name */
        private int f39707j;

        /* renamed from: k, reason: collision with root package name */
        private int f39708k;

        /* renamed from: l, reason: collision with root package name */
        private int f39709l;

        /* renamed from: m, reason: collision with root package name */
        private int f39710m;

        /* renamed from: n, reason: collision with root package name */
        private int f39711n;

        /* renamed from: o, reason: collision with root package name */
        private int f39712o;

        /* renamed from: p, reason: collision with root package name */
        private int f39713p;

        /* renamed from: q, reason: collision with root package name */
        private int f39714q;

        /* renamed from: r, reason: collision with root package name */
        private int f39715r;

        /* renamed from: s, reason: collision with root package name */
        private int f39716s;

        /* renamed from: t, reason: collision with root package name */
        private int f39717t;

        /* renamed from: u, reason: collision with root package name */
        private int f39718u;

        static {
            int iH = h(0, 0, 0, 0);
            f39694w = iH;
            int iH2 = h(0, 0, 0, 3);
            f39695x = iH2;
            f39696y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f39697z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f39687A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f39688B = new boolean[]{false, false, false, true, true, true, false};
            f39689C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            f39690D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f39691E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f39692F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
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
                d3.C13599a.c(r4, r0, r1)
                d3.C13599a.c(r5, r0, r1)
                d3.C13599a.c(r6, r0, r1)
                d3.C13599a.c(r7, r0, r1)
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
                this.f39699b.append(c10);
                return;
            }
            this.f39698a.add(d());
            this.f39699b.clear();
            if (this.f39712o != -1) {
                this.f39712o = 0;
            }
            if (this.f39713p != -1) {
                this.f39713p = 0;
            }
            if (this.f39714q != -1) {
                this.f39714q = 0;
            }
            if (this.f39716s != -1) {
                this.f39716s = 0;
            }
            while (true) {
                if (this.f39698a.size() < this.f39707j && this.f39698a.size() < 15) {
                    this.f39718u = this.f39698a.size();
                    return;
                }
                this.f39698a.remove(0);
            }
        }

        public void b() {
            int length = this.f39699b.length();
            if (length > 0) {
                this.f39699b.delete(length - 1, length);
            }
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f39699b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f39712o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f39712o, length, 33);
                }
                if (this.f39713p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f39713p, length, 33);
                }
                if (this.f39714q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f39715r), this.f39714q, length, 33);
                }
                if (this.f39716s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f39717t), this.f39716s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f39698a.clear();
            this.f39699b.clear();
            this.f39712o = -1;
            this.f39713p = -1;
            this.f39714q = -1;
            this.f39716s = -1;
            this.f39718u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f39700c = true;
            this.f39701d = z10;
            this.f39702e = i10;
            this.f39703f = z11;
            this.f39704g = i11;
            this.f39705h = i12;
            this.f39706i = i14;
            int i17 = i13 + 1;
            if (this.f39707j != i17) {
                this.f39707j = i17;
                while (true) {
                    if (this.f39698a.size() < this.f39707j && this.f39698a.size() < 15) {
                        break;
                    } else {
                        this.f39698a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f39709l != i15) {
                this.f39709l = i15;
                int i18 = i15 - 1;
                q(f39689C[i18], f39695x, f39688B[i18], 0, f39697z[i18], f39687A[i18], f39696y[i18]);
            }
            if (i16 == 0 || this.f39710m == i16) {
                return;
            }
            this.f39710m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, f39691E[i19], f39690D[i19]);
            n(f39693v, f39692F[i19], f39694w);
        }

        public boolean i() {
            return this.f39700c;
        }

        public boolean k() {
            return this.f39701d;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f39712o != -1) {
                if (!z10) {
                    this.f39699b.setSpan(new StyleSpan(2), this.f39712o, this.f39699b.length(), 33);
                    this.f39712o = -1;
                }
            } else if (z10) {
                this.f39712o = this.f39699b.length();
            }
            if (this.f39713p == -1) {
                if (z11) {
                    this.f39713p = this.f39699b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f39699b.setSpan(new UnderlineSpan(), this.f39713p, this.f39699b.length(), 33);
                this.f39713p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f39714q != -1 && this.f39715r != i10) {
                this.f39699b.setSpan(new ForegroundColorSpan(this.f39715r), this.f39714q, this.f39699b.length(), 33);
            }
            if (i10 != f39693v) {
                this.f39714q = this.f39699b.length();
                this.f39715r = i10;
            }
            if (this.f39716s != -1 && this.f39717t != i11) {
                this.f39699b.setSpan(new BackgroundColorSpan(this.f39717t), this.f39716s, this.f39699b.length(), 33);
            }
            if (i11 != f39694w) {
                this.f39716s = this.f39699b.length();
                this.f39717t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f39718u != i10) {
                a('\n');
            }
            this.f39718u = i10;
        }

        public void p(boolean z10) {
            this.f39701d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f39711n = i10;
            this.f39708k = i15;
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
            for (int i12 = 0; i12 < this.f39698a.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.f39698a.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i13 = this.f39708k;
            int i14 = 2;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            throw new IllegalArgumentException("Unexpected justification value: " + this.f39708k);
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
            if (this.f39703f) {
                f10 = this.f39705h / 99.0f;
                f11 = this.f39704g / 99.0f;
            } else {
                f10 = this.f39705h / 209.0f;
                f11 = this.f39704g / 74.0f;
            }
            float f13 = (f10 * 0.9f) + 0.05f;
            float f14 = (f11 * 0.9f) + 0.05f;
            int i15 = this.f39706i;
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
            if (this.f39711n != f39694w) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new a(spannableStringBuilder, alignment, f14, 0, i11, f12, i14, -3.4028235E38f, z10, this.f39711n, this.f39702e);
        }

        public boolean j() {
            if (i()) {
                if (!this.f39698a.isEmpty() || this.f39699b.length() != 0) {
                    return false;
                }
                return true;
            }
            return true;
        }

        public void l() {
            e();
            this.f39700c = false;
            this.f39701d = false;
            this.f39702e = 4;
            this.f39703f = false;
            this.f39704g = 0;
            this.f39705h = 0;
            this.f39706i = 0;
            this.f39707j = 15;
            this.f39708k = 0;
            this.f39709l = 0;
            this.f39710m = 0;
            int i10 = f39694w;
            this.f39711n = i10;
            this.f39715r = f39693v;
            this.f39717t = i10;
        }
    }

    private void G() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f39678m[i10].l();
        }
    }

    private void u(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f39674i.r(8);
        } else if (i10 <= 23) {
            this.f39674i.r(16);
        } else if (i10 <= 31) {
            this.f39674i.r(24);
        }
    }

    /* renamed from: V3.c$c, reason: collision with other inner class name */
    private static final class C0852c {

        /* renamed from: a, reason: collision with root package name */
        public final int f39719a;

        /* renamed from: b, reason: collision with root package name */
        public final int f39720b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f39721c;

        /* renamed from: d, reason: collision with root package name */
        int f39722d = 0;

        public C0852c(int i10, int i11) {
            this.f39719a = i10;
            this.f39720b = i11;
            this.f39721c = new byte[(i11 * 2) - 1];
        }
    }

    private void A(int i10) {
        if (i10 == 160) {
            this.f39679n.a((char) 13252);
            return;
        }
        r.i("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f39679n.a('_');
    }

    private void B() {
        this.f39679n.m(this.f39674i.h(4), this.f39674i.h(2), this.f39674i.h(2), this.f39674i.g(), this.f39674i.g(), this.f39674i.h(3), this.f39674i.h(3));
    }

    private void C() {
        int iH = b.h(this.f39674i.h(2), this.f39674i.h(2), this.f39674i.h(2), this.f39674i.h(2));
        int iH2 = b.h(this.f39674i.h(2), this.f39674i.h(2), this.f39674i.h(2), this.f39674i.h(2));
        this.f39674i.r(2);
        this.f39679n.n(iH, iH2, b.g(this.f39674i.h(2), this.f39674i.h(2), this.f39674i.h(2)));
    }

    private void D() {
        this.f39674i.r(4);
        int iH = this.f39674i.h(4);
        this.f39674i.r(2);
        this.f39679n.o(iH, this.f39674i.h(6));
    }

    private void E() {
        int iH = b.h(this.f39674i.h(2), this.f39674i.h(2), this.f39674i.h(2), this.f39674i.h(2));
        int iH2 = this.f39674i.h(2);
        int iG = b.g(this.f39674i.h(2), this.f39674i.h(2), this.f39674i.h(2));
        if (this.f39674i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f39674i.g();
        int iH3 = this.f39674i.h(2);
        int iH4 = this.f39674i.h(2);
        int iH5 = this.f39674i.h(2);
        this.f39674i.r(8);
        this.f39679n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    private void F() {
        C0852c c0852c = this.f39682q;
        if (c0852c.f39722d != (c0852c.f39720b * 2) - 1) {
            r.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f39682q.f39720b * 2) - 1) + ", but current index is " + this.f39682q.f39722d + " (sequence number " + this.f39682q.f39719a + ");");
        }
        C c10 = this.f39674i;
        C0852c c0852c2 = this.f39682q;
        c10.o(c0852c2.f39721c, c0852c2.f39722d);
        boolean z10 = false;
        while (true) {
            if (this.f39674i.b() <= 0) {
                break;
            }
            int iH = this.f39674i.h(3);
            int iH2 = this.f39674i.h(5);
            if (iH == 7) {
                this.f39674i.r(2);
                iH = this.f39674i.h(6);
                if (iH < 7) {
                    r.i("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH != 0) {
                    r.i("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                }
            } else if (iH != this.f39677l) {
                this.f39674i.s(iH2);
            } else {
                int iE = this.f39674i.e() + (iH2 * 8);
                while (this.f39674i.e() < iE) {
                    int iH3 = this.f39674i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f39674i.h(8);
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
            this.f39680o = r();
        }
    }

    private void q() {
        if (this.f39682q == null) {
            return;
        }
        F();
        this.f39682q = null;
    }

    private List<C6476a> r() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f39678m[i10].j() && this.f39678m[i10].k() && (aVarC = this.f39678m[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f39684c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f39685a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void s(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f39680o = r();
                return;
            }
            if (i10 == 8) {
                this.f39679n.b();
                return;
            }
            switch (i10) {
                case 12:
                    G();
                    break;
                case 13:
                    this.f39679n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f39674i.r(8);
                        break;
                    } else if (i10 >= 24 && i10 <= 31) {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f39674i.r(16);
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
                if (this.f39683r != i12) {
                    this.f39683r = i12;
                    this.f39679n = this.f39678m[i12];
                    break;
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f39674i.g()) {
                        this.f39678m[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f39674i.g()) {
                        this.f39678m[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f39674i.g()) {
                        this.f39678m[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f39674i.g()) {
                        this.f39678m[8 - i14].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f39674i.g()) {
                        this.f39678m[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f39674i.r(8);
                break;
            case 142:
                break;
            case 143:
                G();
                break;
            case 144:
                if (this.f39679n.i()) {
                    B();
                    break;
                } else {
                    this.f39674i.r(16);
                    break;
                }
            case 145:
                if (this.f39679n.i()) {
                    C();
                    break;
                } else {
                    this.f39674i.r(24);
                    break;
                }
            case 146:
                if (this.f39679n.i()) {
                    D();
                    break;
                } else {
                    this.f39674i.r(16);
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
                if (this.f39679n.i()) {
                    E();
                    break;
                } else {
                    this.f39674i.r(32);
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
                if (this.f39683r != i15) {
                    this.f39683r = i15;
                    this.f39679n = this.f39678m[i15];
                    break;
                }
                break;
        }
    }

    private void v(int i10) {
        if (i10 <= 135) {
            this.f39674i.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f39674i.r(40);
        } else if (i10 <= 159) {
            this.f39674i.r(2);
            this.f39674i.r(this.f39674i.h(6) * 8);
        }
    }

    private void w(int i10) {
        b bVar = this.f39678m[i10];
        this.f39674i.r(2);
        boolean zG = this.f39674i.g();
        this.f39674i.r(2);
        int iH = this.f39674i.h(3);
        boolean zG2 = this.f39674i.g();
        int iH2 = this.f39674i.h(7);
        int iH3 = this.f39674i.h(8);
        int iH4 = this.f39674i.h(4);
        int iH5 = this.f39674i.h(4);
        this.f39674i.r(2);
        this.f39674i.r(6);
        this.f39674i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f39674i.h(3), this.f39674i.h(3));
    }

    private void x(int i10) {
        if (i10 == 127) {
            this.f39679n.a((char) 9835);
        } else {
            this.f39679n.a((char) (i10 & l3.f93323c));
        }
    }

    private void y(int i10) {
        this.f39679n.a((char) (i10 & l3.f93323c));
    }

    private void z(int i10) {
        if (i10 == 32) {
            this.f39679n.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f39679n.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f39679n.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f39679n.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f39679n.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f39679n.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f39679n.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f39679n.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f39679n.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f39679n.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f39679n.a((char) 9608);
                break;
            case 49:
                this.f39679n.a((char) 8216);
                break;
            case 50:
                this.f39679n.a((char) 8217);
                break;
            case 51:
                this.f39679n.a((char) 8220);
                break;
            case 52:
                this.f39679n.a((char) 8221);
                break;
            case 53:
                this.f39679n.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f39679n.a((char) 8539);
                        break;
                    case 119:
                        this.f39679n.a((char) 8540);
                        break;
                    case BinsView.TOTE_HEIGHT_DP /* 120 */:
                        this.f39679n.a((char) 8541);
                        break;
                    case 121:
                        this.f39679n.a((char) 8542);
                        break;
                    case 122:
                        this.f39679n.a((char) 9474);
                        break;
                    case 123:
                        this.f39679n.a((char) 9488);
                        break;
                    case 124:
                        this.f39679n.a((char) 9492);
                        break;
                    case 125:
                        this.f39679n.a((char) 9472);
                        break;
                    case 126:
                        this.f39679n.a((char) 9496);
                        break;
                    case l3.f93324d /* 127 */:
                        this.f39679n.a((char) 9484);
                        break;
                    default:
                        r.i("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
        }
    }

    @Override // V3.e
    protected k g() {
        List<C6476a> list = this.f39680o;
        this.f39681p = list;
        return new f((List) C13599a.e(list));
    }

    @Override // V3.e
    protected void h(o oVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C13599a.e(oVar.f55689d);
        this.f39673h.U(byteBuffer.array(), byteBuffer.limit());
        while (this.f39673h.a() >= 3) {
            int iH = this.f39673h.H();
            int i10 = iH & 3;
            boolean z10 = (iH & 4) == 4;
            byte bH = (byte) this.f39673h.H();
            byte bH2 = (byte) this.f39673h.H();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        q();
                        int i11 = (bH & 192) >> 6;
                        int i12 = this.f39675j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            G();
                            r.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f39675j + " current=" + i11);
                        }
                        this.f39675j = i11;
                        int i13 = bH & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0852c c0852c = new C0852c(i11, i13);
                        this.f39682q = c0852c;
                        byte[] bArr = c0852c.f39721c;
                        int i14 = c0852c.f39722d;
                        c0852c.f39722d = i14 + 1;
                        bArr[i14] = bH2;
                    } else {
                        C13599a.a(i10 == 2);
                        C0852c c0852c2 = this.f39682q;
                        if (c0852c2 == null) {
                            r.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0852c2.f39721c;
                            int i15 = c0852c2.f39722d;
                            int i16 = i15 + 1;
                            c0852c2.f39722d = i16;
                            bArr2[i15] = bH;
                            c0852c2.f39722d = i15 + 2;
                            bArr2[i16] = bH2;
                        }
                    }
                    C0852c c0852c3 = this.f39682q;
                    if (c0852c3.f39722d == (c0852c3.f39720b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override // V3.e
    protected boolean m() {
        return this.f39680o != this.f39681p;
    }

    public c(int i10, List<byte[]> list) {
        this.f39677l = i10 == -1 ? 1 : i10;
        this.f39676k = list != null && C13607i.v(list);
        this.f39678m = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f39678m[i11] = new b();
        }
        this.f39679n = this.f39678m[0];
    }

    @Override // V3.e, U3.l
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // V3.e, g3.d
    public void flush() {
        super.flush();
        this.f39680o = null;
        this.f39681p = null;
        this.f39683r = 0;
        this.f39679n = this.f39678m[0];
        G();
        this.f39682q = null;
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
