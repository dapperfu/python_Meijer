package kotlin.text;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(C)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class _OneToManyTitlecaseMappingsKt {
    public static final String a(char c10) {
        String strValueOf = String.valueOf(c10);
        Intrinsics.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        if (upperCase.length() > 1) {
            if (c10 == 329) {
                return upperCase;
            }
            char cCharAt = upperCase.charAt(0);
            Intrinsics.h(upperCase, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = upperCase.substring(1);
            Intrinsics.i(strSubstring, "substring(...)");
            Intrinsics.h(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(locale);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c10));
    }
}
