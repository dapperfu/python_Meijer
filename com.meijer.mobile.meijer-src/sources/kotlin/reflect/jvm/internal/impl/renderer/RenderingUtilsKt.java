package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class RenderingUtilsKt {
    public static final String a(FqNameUnsafe fqNameUnsafe) {
        Intrinsics.j(fqNameUnsafe, "<this>");
        return c(fqNameUnsafe.h());
    }

    public static final String b(Name name) {
        Intrinsics.j(name, "<this>");
        if (!e(name)) {
            String strB = name.b();
            Intrinsics.i(strB, "asString(...)");
            return strB;
        }
        StringBuilder sb2 = new StringBuilder();
        String strB2 = name.b();
        Intrinsics.i(strB2, "asString(...)");
        sb2.append('`' + strB2);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String c(List<Name> pathSegments) {
        Intrinsics.j(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (Name name : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(name));
        }
        return sb2.toString();
    }

    public static final String d(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.j(lowerRendered, "lowerRendered");
        Intrinsics.j(lowerPrefix, "lowerPrefix");
        Intrinsics.j(upperRendered, "upperRendered");
        Intrinsics.j(upperPrefix, "upperPrefix");
        Intrinsics.j(foldedPrefix, "foldedPrefix");
        if (StringsKt.W(lowerRendered, lowerPrefix, false, 2, null) && StringsKt.W(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            Intrinsics.i(strSubstring, "substring(...)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            Intrinsics.i(strSubstring2, "substring(...)");
            String str = foldedPrefix + strSubstring;
            if (Intrinsics.e(strSubstring, strSubstring2)) {
                return str;
            }
            if (f(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    public static final boolean f(String lower, String upper) {
        Intrinsics.j(lower, "lower");
        Intrinsics.j(upper, "upper");
        if (Intrinsics.e(lower, StringsKt.Q(upper, "?", "", false, 4, null))) {
            return true;
        }
        if (StringsKt.G(upper, "?", false, 2, null)) {
            if (Intrinsics.e(lower + '?', upper)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(lower);
        sb2.append(")?");
        return Intrinsics.e(sb2.toString(), upper);
    }

    private static final boolean e(Name name) {
        String strB = name.b();
        Intrinsics.i(strB, "asString(...)");
        if (!KeywordStringsGenerated.f146983a.contains(strB)) {
            for (int i10 = 0; i10 < strB.length(); i10++) {
                char cCharAt = strB.charAt(i10);
                if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                    return true;
                }
            }
            if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                return false;
            }
            return true;
        }
        return true;
    }
}
