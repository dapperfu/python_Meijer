package Da;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDa/a;", "", "a", "(LDa/a;)Ljava/lang/String;", "mobile-engage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {
    public static final String a(a aVar) {
        Intrinsics.j(aVar, "<this>");
        String strName = aVar.name();
        Locale localeForLanguageTag = Locale.forLanguageTag("en_US");
        Intrinsics.i(localeForLanguageTag, "forLanguageTag(...)");
        String lowerCase = strName.toLowerCase(localeForLanguageTag);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
