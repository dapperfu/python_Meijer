package Gk;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "g", "(Ljava/lang/String;)Ljava/lang/String;", "", "excludeWords", "h", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "separator", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class e {
    public static final String d(String str, final String separator) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(separator, "separator");
        return new Regex("(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])").l(str, new Function1() { // from class: Gk.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.f(separator, (MatchResult) obj);
            }
        });
    }

    public static /* synthetic */ String e(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = " ";
        }
        return d(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(String str, MatchResult matchResult) {
        Intrinsics.j(matchResult, "matchResult");
        return str + ((String) CollectionsKt.s0(matchResult.b()));
    }

    public static final String g(String str) {
        Intrinsics.j(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return CollectionsKt.B0(StringsKt.b1(lowerCase, new String[]{" "}, false, 0, 6, null), " ", null, null, 0, null, new Function1() { // from class: Gk.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.i((String) obj);
            }
        }, 30, null);
    }

    public static final String h(String str, final List<String> excludeWords) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(excludeWords, "excludeWords");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return CollectionsKt.B0(StringsKt.b1(lowerCase, new String[]{" "}, false, 0, 6, null), " ", null, null, 0, null, new Function1() { // from class: Gk.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.j(excludeWords, (String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(String word) {
        Intrinsics.j(word, "word");
        if (word.length() <= 0) {
            return word;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) CharsKt.i(word.charAt(0)));
        String strSubstring = word.substring(1);
        Intrinsics.i(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(List list, String word) {
        Intrinsics.j(word, "word");
        if (list.contains(word) || word.length() <= 0) {
            return word;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) CharsKt.i(word.charAt(0)));
        String strSubstring = word.substring(1);
        Intrinsics.i(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }
}
