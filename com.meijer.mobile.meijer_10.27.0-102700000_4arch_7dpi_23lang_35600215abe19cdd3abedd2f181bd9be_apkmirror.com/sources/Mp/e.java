package Mp;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vg.C17567a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\"\u001c\u0010\n\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lvg/a;", "", "a", "(Lvg/a;)Ljava/lang/String;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "BARCODE_VALUE_PATTERN", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f21184a = Pattern.compile("[0-9]{8,12}");

    public static final String a(C17567a c17567a) {
        Intrinsics.j(c17567a, "<this>");
        int iC = c17567a.c();
        if (iC != 64 && iC != 1024) {
            return c(c17567a.d());
        }
        String strD = c17567a.d();
        return c(strD != null ? b(strD) : null);
    }

    public static final String b(String str) {
        Intrinsics.j(str, "<this>");
        if (str.length() != 8) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 3);
        Intrinsics.i(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("00000");
        String strSubstring2 = str.substring(3, 6);
        Intrinsics.i(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        sb2.append(str.charAt(7));
        return sb2.toString();
    }

    public static final String c(String str) {
        if (str == null) {
            return "";
        }
        String string = StringsKt.y1(str).toString();
        if (string.length() > 11) {
            string = string.substring(0, string.length() - 1);
            Intrinsics.i(string, "substring(...)");
        }
        return StringsKt.J0(string, "0");
    }
}
