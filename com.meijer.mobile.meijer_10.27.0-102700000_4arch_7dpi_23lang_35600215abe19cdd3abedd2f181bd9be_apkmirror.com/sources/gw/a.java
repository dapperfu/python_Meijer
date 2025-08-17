package gw;

import Rv.h;
import fsimpl.C14045dq;
import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kw.C15328e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a]\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ac\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkw/e;", "", "input", "", "pos", "limit", "encodeSet", "", "alreadyEncoded", "strict", "plusIsSpace", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "", "h", "(Lkw/e;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "c", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encoded", "i", "(Lkw/e;Ljava/lang/String;IIZ)V", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;", "f", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "e", "(Ljava/lang/String;II)Z", "", "[C", "getHEX_DIGITS", "()[C", "HEX_DIGITS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f134130a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final String a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(encodeSet, "encodeSet");
        return d(str, i10, i11, encodeSet, z10, z11, z12, z13, null, 128, null);
    }

    public static /* synthetic */ String b(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        return a(str, i10, i11, str2, z10, z11, z12, z13);
    }

    public static final String c(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(encodeSet, "encodeSet");
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt.b0(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                C15328e c15328e = new C15328e();
                c15328e.Q0(str, i10, iCharCount);
                h(c15328e, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                return c15328e.n3();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, i11);
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String d(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        if ((i12 & 128) != 0) {
            charset = null;
        }
        return c(str, i10, i11, str2, z10, z11, z12, z13, charset);
    }

    public static final boolean e(String str, int i10, int i11) {
        Intrinsics.j(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && h.z(str.charAt(i10 + 1)) != -1 && h.z(str.charAt(i12)) != -1;
    }

    public static final String f(String str, int i10, int i11, boolean z10) {
        Intrinsics.j(str, "<this>");
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                C15328e c15328e = new C15328e();
                c15328e.Q0(str, i10, i12);
                i(c15328e, str, i12, i11, z10);
                return c15328e.n3();
            }
        }
        String strSubstring = str.substring(i10, i11);
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String g(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return f(str, i10, i11, z10);
    }

    public static final void h(C15328e c15328e, String input, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        Intrinsics.j(c15328e, "<this>");
        Intrinsics.j(input, "input");
        Intrinsics.j(encodeSet, "encodeSet");
        C15328e c15328e2 = null;
        while (i10 < i11) {
            int iCodePointAt = input.codePointAt(i10);
            if (z10 && (iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13)) {
                Unit unit = Unit.f142422a;
            } else {
                if (iCodePointAt == 32 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    c15328e.I0("+");
                } else if (iCodePointAt == 43 && z12) {
                    c15328e.I0(z10 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt.b0(encodeSet, (char) iCodePointAt, false, 2, null) || (iCodePointAt == 37 && (!z10 || (z11 && !e(input, i10, i11)))))) {
                    if (c15328e2 == null) {
                        c15328e2 = new C15328e();
                    }
                    if (charset == null || Intrinsics.e(charset, Charsets.UTF_8)) {
                        c15328e2.a0(iCodePointAt);
                    } else {
                        c15328e2.J0(input, i10, Character.charCount(iCodePointAt) + i10, charset);
                    }
                    while (!c15328e2.j2()) {
                        byte b10 = c15328e2.readByte();
                        c15328e.writeByte(37);
                        char[] cArr = f134130a;
                        c15328e.writeByte(cArr[((b10 & 255) >> 4) & 15]);
                        c15328e.writeByte(cArr[b10 & C14045dq.MULTIPLY]);
                    }
                    Unit unit2 = Unit.f142422a;
                } else {
                    c15328e.a0(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static final void i(C15328e c15328e, String encoded, int i10, int i11, boolean z10) {
        int i12;
        Intrinsics.j(c15328e, "<this>");
        Intrinsics.j(encoded, "encoded");
        while (i10 < i11) {
            int iCodePointAt = encoded.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iZ = h.z(encoded.charAt(i10 + 1));
                int iZ2 = h.z(encoded.charAt(i12));
                if (iZ == -1 || iZ2 == -1) {
                    c15328e.a0(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                } else {
                    c15328e.writeByte((iZ << 4) + iZ2);
                    i10 = Character.charCount(iCodePointAt) + i12;
                }
            } else if (iCodePointAt == 43 && z10) {
                c15328e.writeByte(32);
                i10++;
            } else {
                c15328e.a0(iCodePointAt);
                i10 += Character.charCount(iCodePointAt);
            }
        }
    }
}
