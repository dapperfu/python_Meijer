package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "", "c", "(C)Z", "Ljava/util/Locale;", "locale", "", "f", "(CLjava/util/Locale;)Ljava/lang/String;", "d", "e", "char", "", "radix", "b", "(CI)I", "a", "(I)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes13.dex */
public class a {
    @PublishedApi
    public static int a(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new IntRange(2, 36));
    }

    @SinceKotlin
    @WasExperimental
    public static String d(char c10, Locale locale) {
        Intrinsics.j(locale, "locale");
        String strValueOf = String.valueOf(c10);
        Intrinsics.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @SinceKotlin
    @WasExperimental
    public static String e(char c10, Locale locale) {
        Intrinsics.j(locale, "locale");
        String strF = f(c10, locale);
        if (strF.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            Intrinsics.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.i(upperCase, "toUpperCase(...)");
            if (Intrinsics.e(strF, upperCase)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        } else if (c10 != 329) {
            char cCharAt = strF.charAt(0);
            Intrinsics.h(strF, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strF.substring(1);
            Intrinsics.i(strSubstring, "substring(...)");
            Intrinsics.h(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strF;
    }

    @SinceKotlin
    @WasExperimental
    public static final String f(char c10, Locale locale) {
        Intrinsics.j(locale, "locale");
        String strValueOf = String.valueOf(c10);
        Intrinsics.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static boolean c(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }
}
