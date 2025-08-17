package G9;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/text/Regex;", "a", "Lkotlin/text/Regex;", "getCamelRegex", "()Lkotlin/text/Regex;", "camelRegex", "getSnakeRegex", "snakeRegex", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Regex f11294a = new Regex("(?<=[a-zA-Z])[A-Z]");

    /* renamed from: b, reason: collision with root package name */
    private static final Regex f11295b = new Regex("_[a-zA-Z]");

    public static final String b(String str) {
        Intrinsics.j(str, "<this>");
        String strL = f11294a.l(str, new Function1() { // from class: G9.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.c((MatchResult) obj);
            }
        });
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        String upperCase = strL.toUpperCase(locale);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(MatchResult it) {
        Intrinsics.j(it, "it");
        return "_" + it.getValue();
    }
}
