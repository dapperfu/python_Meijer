package kotlin.text;

import java.util.Comparator;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00020\u0000*\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0000*\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0018*\u00020\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0005\u001a+\u0010\u001f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\"\u001a\u00020\u0002*\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\u0005\u001a;\u0010&\u001a\u00020\u0002*\u00020\u00002\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010*\u001a\u00020\u0000*\u00020\u00002\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010.\u001a\u00020\u0000*\u00020,2\u0006\u0010-\u001a\u00020\u0013¢\u0006\u0004\b.\u0010/\"%\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000001j\b\u0012\u0004\u0012\u00020\u0000`2*\u0002008F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"", "other", "", "ignoreCase", "H", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "oldChar", "newChar", "N", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", "newValue", "O", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "R", "", "A", "([C)Ljava/lang/String;", "", "startIndex", "endIndex", "B", "([CII)Ljava/lang/String;", "", "D", "([B)Ljava/lang/String;", "E", "(Ljava/lang/String;)[B", "prefix", "U", "T", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "suffix", "F", "thisOffset", "otherOffset", "length", "K", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "Ljava/util/Locale;", "locale", "z", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "", "n", "M", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "J", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension
/* loaded from: classes14.dex */
public class p extends o {
    @SinceKotlin
    public static String A(char[] cArr) {
        Intrinsics.j(cArr, "<this>");
        return new String(cArr);
    }

    @SinceKotlin
    public static String B(char[] cArr, int i10, int i11) {
        Intrinsics.j(cArr, "<this>");
        AbstractList.INSTANCE.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static /* synthetic */ String C(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        return B(cArr, i10, i11);
    }

    @SinceKotlin
    public static String D(byte[] bArr) {
        Intrinsics.j(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    @SinceKotlin
    public static byte[] E(String str) {
        Intrinsics.j(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean F(String str, String suffix, boolean z10) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : K(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean G(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return F(str, str2, z10);
    }

    public static boolean H(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean I(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return H(str, str2, z10);
    }

    public static Comparator<String> J(StringCompanionObject stringCompanionObject) {
        Intrinsics.j(stringCompanionObject, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.i(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean K(String str, int i10, String other, int i11, int i12, boolean z10) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean L(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return K(str, i10, str2, i11, i12, z10);
    }

    public static String M(CharSequence charSequence, int i10) {
        Intrinsics.j(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        Intrinsics.g(string);
        return string;
    }

    public static final String N(String str, char c10, char c11, boolean z10) {
        Intrinsics.j(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            Intrinsics.i(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (b.g(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String O(String str, String oldValue, String newValue, boolean z10) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(oldValue, "oldValue");
        Intrinsics.j(newValue, "newValue");
        int i10 = 0;
        int iM0 = StringsKt__StringsKt.m0(str, oldValue, 0, z10);
        if (iM0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iF = RangesKt.f(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iM0);
            sb2.append(newValue);
            i10 = iM0 + length;
            if (iM0 >= str.length()) {
                break;
            }
            iM0 = StringsKt__StringsKt.m0(str, oldValue, iM0 + iF, z10);
        } while (iM0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String P(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return N(str, c10, c11, z10);
    }

    public static /* synthetic */ String Q(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return O(str, str2, str3, z10);
    }

    public static final String R(String str, String oldValue, String newValue, boolean z10) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(oldValue, "oldValue");
        Intrinsics.j(newValue, "newValue");
        int iQ0 = StringsKt__StringsKt.q0(str, oldValue, 0, z10, 2, null);
        return iQ0 < 0 ? str : StringsKt__StringsKt.V0(str, iQ0, oldValue.length() + iQ0, newValue).toString();
    }

    public static /* synthetic */ String S(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return R(str, str2, str3, z10);
    }

    public static boolean T(String str, String prefix, int i10, boolean z10) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : K(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean U(String str, String prefix, boolean z10) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : K(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean V(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return T(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean W(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return U(str, str2, z10);
    }

    @SinceKotlin
    @Deprecated
    @LowPriorityInOverloadResolution
    @DeprecatedSinceKotlin
    public static String z(String str, Locale locale) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            Intrinsics.i(strSubstring, "substring(...)");
            Intrinsics.h(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        Intrinsics.i(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }
}
