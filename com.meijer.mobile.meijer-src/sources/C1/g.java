package C1;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LC1/g;", "Lu1/l;", "<init>", "()V", "", "string", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "locale", "a", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class g implements u1.l {
    @Override // u1.l
    public String a(String string, Locale locale) {
        String strValueOf;
        if (string.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char cCharAt = string.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                strValueOf = CharsKt.e(cCharAt, locale);
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb2.append((Object) strValueOf);
            String strSubstring = string.substring(1);
            Intrinsics.i(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            return sb2.toString();
        }
        return string;
    }
}
