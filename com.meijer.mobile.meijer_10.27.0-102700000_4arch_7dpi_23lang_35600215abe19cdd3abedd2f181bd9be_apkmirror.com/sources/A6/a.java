package A6;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "a", "(I)Z", "", "c", "(Ljava/lang/String;)Ljava/lang/String;", "b", "(I)Ljava/lang/String;", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {
    private static final boolean a(int i10) {
        if (97 <= i10 && i10 < 123) {
            return true;
        }
        if (65 > i10 || i10 >= 91) {
            return (48 <= i10 && i10 < 58) || i10 == 45 || i10 == 46 || i10 == 95 || i10 == 126;
        }
        return true;
    }

    private static final String b(int i10) {
        String string = Integer.toString(i10, CharsKt.a(16));
        Intrinsics.i(string, "toString(...)");
        String upperCase = string.toUpperCase(Locale.ROOT);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        if (upperCase.length() == 1) {
            upperCase = '0' + upperCase;
        }
        return '%' + upperCase;
    }

    public static final String c(String str) {
        Intrinsics.j(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : StringsKt.E(str)) {
            int i10 = b10 & 255;
            if (a(i10)) {
                sb2.append((char) i10);
            } else {
                sb2.append(b(i10));
            }
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
