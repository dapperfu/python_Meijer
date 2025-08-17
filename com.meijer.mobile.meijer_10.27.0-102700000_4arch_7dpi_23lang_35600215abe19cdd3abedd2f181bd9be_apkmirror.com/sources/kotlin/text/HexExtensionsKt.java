package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;

@Metadata(d1 = {"\u0000R\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\f\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aC\u0010!\u001a\u00020 *\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"\u001a+\u0010#\u001a\u00020 *\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020 *\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&\u001a#\u0010'\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(\u001a3\u0010+\u001a\u00020 *\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a3\u00100\u001a\u00020 *\u00020\u00072\u0006\u0010-\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\b0\u00101\u001a3\u00102\u001a\u00020 *\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b2\u00101\u001a\u001b\u00104\u001a\u000203*\u00020\u00072\u0006\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105\" \u0010<\u001a\u0002068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109\"\u0014\u0010=\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00107\"\u0014\u0010>\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00107\"\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010@¨\u0006B"}, d2 = {"", "formatLength", "", "a", "(J)I", "Lkotlin/text/HexFormat;", "format", "", "o", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "startIndex", "endIndex", "f", "(Ljava/lang/String;IILkotlin/text/HexFormat;)J", "Lkotlin/text/HexFormat$NumberHexFormat;", "numberFormat", "digits", "bits", "q", "(JLkotlin/text/HexFormat$NumberHexFormat;Ljava/lang/String;I)Ljava/lang/String;", "", "destination", "destinationOffset", "n", "(Ljava/lang/String;[CI)I", "typeHexLength", "h", "(Ljava/lang/String;IILkotlin/text/HexFormat;I)J", "prefix", "suffix", "", "ignoreCase", "", "c", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZI)V", "b", "(Ljava/lang/String;III)V", "d", "(Ljava/lang/String;II)V", "i", "(Ljava/lang/String;II)J", "specifier", "expected", "k", "(Ljava/lang/String;IILjava/lang/String;I)V", "index", "part", "partName", "m", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "l", "", "j", "(Ljava/lang/String;I)Ljava/lang/Void;", "", "[I", "e", "()[I", "getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations", "()V", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "", "[J", "HEX_DIGITS_TO_LONG_DECIMAL", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class HexExtensionsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f147408a;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f147409b;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f147410c;

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f147411d;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f147408a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f147409b = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f147410c = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f147411d = jArr;
    }

    private static final int a(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.o(ULong.b(j10))));
    }

    private static final void b(String str, int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if (i13 < 1) {
            k(str, i10, i11, "at least", 1);
        } else if (i13 > i12) {
            d(str, i10, (i13 + i10) - i12);
        }
    }

    private static final void c(String str, int i10, int i11, String str2, String str3, boolean z10, int i12) {
        if ((i11 - i10) - str2.length() <= str3.length()) {
            l(str, i10, i11, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i13 = 0; i13 < length; i13++) {
                if (!b.g(str2.charAt(i13), str.charAt(i10 + i13), z10)) {
                    m(str, i10, i11, str2, "prefix");
                }
            }
            i10 += str2.length();
        }
        int length2 = i11 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i14 = 0; i14 < length3; i14++) {
                if (!b.g(str3.charAt(i14), str.charAt(length2 + i14), z10)) {
                    m(str, length2, i11, str3, "suffix");
                }
            }
        }
        b(str, i10, length2, i12);
    }

    private static final void d(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i10 + ", but was '" + str.charAt(i10) + "'.\nThe result won't fit the type being parsed.");
            }
            i10++;
        }
    }

    public static final int[] e() {
        return f147408a;
    }

    @ExperimentalStdlibApi
    public static final long f(String str, int i10, int i11, HexFormat format) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(format, "format");
        return h(str, i10, i11, format, 16);
    }

    public static /* synthetic */ long g(String str, int i10, int i11, HexFormat hexFormat, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.a();
        }
        return f(str, i10, i11, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final long h(String str, int i10, int i11, HexFormat hexFormat, int i12) {
        AbstractList.INSTANCE.a(i10, i11, str.length());
        HexFormat.NumberHexFormat numberHexFormatB = hexFormat.getNumber();
        if (numberHexFormatB.getIsDigitsOnly()) {
            b(str, i10, i11, i12);
            return i(str, i10, i11);
        }
        String strE = numberHexFormatB.getPrefix();
        String strG = numberHexFormatB.getSuffix();
        c(str, i10, i11, strE, strG, numberHexFormatB.getIgnoreCase(), i12);
        return i(str, i10 + strE.length(), i11 - strG.length());
    }

    private static final long i(String str, int i10, int i11) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f147411d[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            j(str, i10);
            throw new KotlinNothingValueException();
        }
        return j10;
    }

    private static final Void j(String str, int i10) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i10 + ", but was " + str.charAt(i10));
    }

    private static final void k(String str, int i10, int i11, String str2, int i12) {
        Intrinsics.h(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        Intrinsics.i(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    private static final void l(String str, int i10, int i11, String str2, String str3) {
        Intrinsics.h(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        Intrinsics.i(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    @SinceKotlin
    @ExperimentalStdlibApi
    public static final String o(long j10, HexFormat format) {
        Intrinsics.j(format, "format");
        String str = format.getUpperCase() ? "0123456789ABCDEF" : "0123456789abcdef";
        HexFormat.NumberHexFormat numberHexFormatB = format.getNumber();
        if (!numberHexFormatB.getIsDigitsOnlyAndNoPadding()) {
            return q(j10, numberHexFormatB, str, 64);
        }
        char[] cArr = {str.charAt((int) ((j10 >> 60) & 15)), str.charAt((int) ((j10 >> 56) & 15)), str.charAt((int) ((j10 >> 52) & 15)), str.charAt((int) ((j10 >> 48) & 15)), str.charAt((int) ((j10 >> 44) & 15)), str.charAt((int) ((j10 >> 40) & 15)), str.charAt((int) ((j10 >> 36) & 15)), str.charAt((int) ((j10 >> 32) & 15)), str.charAt((int) ((j10 >> 28) & 15)), str.charAt((int) ((j10 >> 24) & 15)), str.charAt((int) ((j10 >> 20) & 15)), str.charAt((int) ((j10 >> 16) & 15)), str.charAt((int) ((j10 >> 12) & 15)), str.charAt((int) ((j10 >> 8) & 15)), str.charAt((int) ((j10 >> 4) & 15)), str.charAt((int) (j10 & 15))};
        return numberHexFormatB.getRemoveLeadingZeros() ? p.C(cArr, RangesKt.k(Long.numberOfLeadingZeros(j10) >> 2, 15), 0, 2, null) : p.A(cArr);
    }

    public static /* synthetic */ String p(long j10, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.a();
        }
        return o(j10, hexFormat);
    }

    @ExperimentalStdlibApi
    private static final String q(long j10, HexFormat.NumberHexFormat numberHexFormat, String str, int i10) {
        if ((i10 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = i10 >> 2;
        int iD = numberHexFormat.getMinLength();
        int iF = RangesKt.f(iD - i11, 0);
        String strE = numberHexFormat.getPrefix();
        String strG = numberHexFormat.getSuffix();
        boolean zF = numberHexFormat.getRemoveLeadingZeros();
        int iA = a(strE.length() + iF + i11 + strG.length());
        char[] cArr = new char[iA];
        int iN = n(strE, cArr, 0);
        if (iF > 0) {
            int i12 = iF + iN;
            ArraysKt.y(cArr, str.charAt(0), iN, i12);
            iN = i12;
        }
        int i13 = i10;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 -= 4;
            int i15 = (int) ((j10 >> i13) & 15);
            zF = zF && i15 == 0 && (i13 >> 2) >= iD;
            if (!zF) {
                cArr[iN] = str.charAt(i15);
                iN++;
            }
        }
        int iN2 = n(strG, cArr, iN);
        return iN2 == iA ? p.A(cArr) : p.C(cArr, 0, iN2, 1, null);
    }

    private static final void m(String str, int i10, int i11, String str2, String str3) {
        int iK = RangesKt.k(str2.length() + i10, i11);
        Intrinsics.h(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, iK);
        Intrinsics.i(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i10 + ", but was " + strSubstring);
    }

    private static final int n(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.h(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return i10 + str.length();
    }
}
