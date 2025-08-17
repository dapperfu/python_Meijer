package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes6.dex */
public final class U4 implements InterfaceC8924o4 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f70530a = new GQ();

    /* renamed from: b, reason: collision with root package name */
    private final boolean f70531b;

    /* renamed from: c, reason: collision with root package name */
    private final int f70532c;

    /* renamed from: d, reason: collision with root package name */
    private final int f70533d;

    /* renamed from: e, reason: collision with root package name */
    private final String f70534e;

    /* renamed from: f, reason: collision with root package name */
    private final float f70535f;

    /* renamed from: g, reason: collision with root package name */
    private final int f70536g;

    private static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & com.medallia.digital.mobilesdk.l3.f92484c) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z10 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                    z10 = false;
                }
            } else if (i17 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            } else {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            } else {
                if (i16 != 0 || z10) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC8924o4
    public final void a(byte[] bArr, int i10, int i11, C8817n4 c8817n4, ME me2) {
        String strB;
        int i12;
        this.f70530a.j(bArr, i10 + i11);
        this.f70530a.l(i10);
        GQ gq2 = this.f70530a;
        int i13 = 1;
        int i14 = 0;
        int i15 = 2;
        C8086gC.d(gq2.r() >= 2);
        int iG = gq2.G();
        if (iG == 0) {
            strB = "";
        } else {
            int iT = gq2.t();
            Charset charsetC = gq2.c();
            int iT2 = gq2.t() - iT;
            if (charsetC == null) {
                charsetC = StandardCharsets.UTF_8;
            }
            strB = gq2.b(iG - iT2, charsetC);
        }
        if (strB.isEmpty()) {
            me2.zza(new C8070g4(AbstractC7917eh0.t(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strB);
        c(spannableStringBuilder, this.f70532c, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.f70533d, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.f70534e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.f70535f;
        while (true) {
            GQ gq3 = this.f70530a;
            if (gq3.r() < 8) {
                C7318Ww c7318Ww = new C7318Ww();
                c7318Ww.l(spannableStringBuilder);
                c7318Ww.e(fMax, 0);
                c7318Ww.f(0);
                me2.zza(new C8070g4(AbstractC7917eh0.u(c7318Ww.p()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int iT3 = gq3.t();
            int iW = gq3.w();
            int iW2 = this.f70530a.w();
            if (iW2 == 1937013100) {
                C8086gC.d(this.f70530a.r() >= i15 ? i13 : i14);
                int iG2 = this.f70530a.G();
                int i16 = i14;
                while (i16 < iG2) {
                    GQ gq4 = this.f70530a;
                    C8086gC.d(gq4.r() >= 12 ? i13 : i14);
                    int iG3 = gq4.G();
                    int iG4 = gq4.G();
                    gq4.m(i15);
                    int iC = gq4.C();
                    gq4.m(i13);
                    int iW3 = gq4.w();
                    if (iG4 > spannableStringBuilder.length()) {
                        C9917xL.f("Tx3gParser", "Truncating styl end (" + iG4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        iG4 = spannableStringBuilder.length();
                    }
                    if (iG3 >= iG4) {
                        C9917xL.f("Tx3gParser", "Ignoring styl with start (" + iG3 + ") >= end (" + iG4 + ").");
                    } else {
                        int i17 = iG4;
                        c(spannableStringBuilder, iC, this.f70532c, iG3, i17, 0);
                        b(spannableStringBuilder, iW3, this.f70533d, iG3, i17, 0);
                    }
                    i16++;
                    i13 = 1;
                    i14 = 0;
                    i15 = 2;
                }
                i12 = i15;
            } else if (iW2 == 1952608120 && this.f70531b) {
                i12 = 2;
                C8086gC.d(this.f70530a.r() >= 2);
                fMax = Math.max(0.0f, Math.min(this.f70530a.G() / this.f70536g, 0.95f));
            } else {
                i12 = 2;
            }
            this.f70530a.l(iT3 + iW);
            i15 = i12;
            i13 = 1;
            i14 = 0;
        }
    }

    public U4(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f70532c = bArr[24];
            this.f70533d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f70534e = true == "Serif".equals(OV.c(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.f70536g = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.f70531b = z10;
            if (z10) {
                this.f70535f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.95f));
                return;
            } else {
                this.f70535f = 0.85f;
                return;
            }
        }
        this.f70532c = 0;
        this.f70533d = -1;
        this.f70534e = "sans-serif";
        this.f70531b = false;
        this.f70535f = 0.85f;
        this.f70536g = -1;
    }
}
