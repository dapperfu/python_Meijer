package b4;

import Ce.L;
import U3.e;
import U3.r;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c3.C6350a;
import com.medallia.digital.mobilesdk.l3;
import d3.C13466a;
import d3.D;
import d3.InterfaceC13477l;
import d3.P;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6193a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final D f59767a = new D();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f59768b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59769c;

    /* renamed from: d, reason: collision with root package name */
    private final int f59770d;

    /* renamed from: e, reason: collision with root package name */
    private final String f59771e;

    /* renamed from: f, reason: collision with root package name */
    private final float f59772f;

    /* renamed from: g, reason: collision with root package name */
    private final int f59773g;

    @Override // U3.r
    public int c() {
        return 2;
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & l3.f92484c) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13477l<e> interfaceC13477l) {
        this.f59767a.U(bArr, i11 + i10);
        this.f59767a.W(i10);
        String strH = h(this.f59767a);
        if (strH.isEmpty()) {
            interfaceC13477l.accept(new e(L.x(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strH);
        f(spannableStringBuilder, this.f59769c, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.f59770d, -1, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.f59771e, 0, spannableStringBuilder.length());
        float fN = this.f59772f;
        while (this.f59767a.a() >= 8) {
            int iF = this.f59767a.f();
            int iQ = this.f59767a.q();
            int iQ2 = this.f59767a.q();
            if (iQ2 == 1937013100) {
                C13466a.a(this.f59767a.a() >= 2);
                int iP = this.f59767a.P();
                for (int i12 = 0; i12 < iP; i12++) {
                    d(this.f59767a, spannableStringBuilder);
                }
            } else if (iQ2 == 1952608120 && this.f59768b) {
                C13466a.a(this.f59767a.a() >= 2);
                fN = P.n(this.f59767a.P() / this.f59773g, 0.0f, 0.95f);
            }
            this.f59767a.W(iF + iQ);
        }
        interfaceC13477l.accept(new e(L.y(new C6350a.b().o(spannableStringBuilder).h(fN, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    public C6193a(List<byte[]> list) {
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f59769c = bArr[24];
            this.f59770d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f59771e = "Serif".equals(P.H(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.f59773g = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f59768b = z10;
            if (z10) {
                this.f59772f = P.n(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f59772f = 0.85f;
                return;
            }
        }
        this.f59769c = 0;
        this.f59770d = -1;
        this.f59771e = "sans-serif";
        this.f59768b = false;
        this.f59772f = 0.85f;
        this.f59773g = -1;
    }

    private void d(D d10, SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        if (d10.a() >= 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        int iP = d10.P();
        int iP2 = d10.P();
        d10.X(2);
        int iH = d10.H();
        d10.X(1);
        int iQ = d10.q();
        if (iP2 > spannableStringBuilder.length()) {
            d3.r.i("Tx3gParser", "Truncating styl end (" + iP2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iP2 = spannableStringBuilder.length();
        }
        int i10 = iP2;
        if (iP >= i10) {
            d3.r.i("Tx3gParser", "Ignoring styl with start (" + iP + ") >= end (" + i10 + ").");
            return;
        }
        f(spannableStringBuilder, iH, this.f59769c, iP, i10, 0);
        e(spannableStringBuilder, iQ, this.f59770d, iP, i10, 0);
    }

    private static String h(D d10) {
        boolean z10;
        if (d10.a() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        int iP = d10.P();
        if (iP == 0) {
            return "";
        }
        int iF = d10.f();
        Charset charsetR = d10.R();
        int iF2 = iP - (d10.f() - iF);
        if (charsetR == null) {
            charsetR = StandardCharsets.UTF_8;
        }
        return d10.F(iF2, charsetR);
    }
}
