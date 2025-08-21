package f3;

import android.text.TextUtils;
import d3.C13599a;
import d3.r;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f131535a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f131536b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append("-");
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    public static long b(String str, String str2) throws NumberFormatException {
        long j10;
        if (!TextUtils.isEmpty(str)) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                r.d("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        } else {
            j10 = -1;
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = f131535a.matcher(str2);
            if (matcher.matches()) {
                try {
                    long j11 = (Long.parseLong((String) C13599a.e(matcher.group(2))) - Long.parseLong((String) C13599a.e(matcher.group(1)))) + 1;
                    if (j10 < 0) {
                        return j11;
                    }
                    if (j10 != j11) {
                        r.i("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
                        return Math.max(j10, j11);
                    }
                    return j10;
                } catch (NumberFormatException unused2) {
                    r.d("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
                    return j10;
                }
            }
            return j10;
        }
        return j10;
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f131536b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        return Long.parseLong((String) C13599a.e(matcher.group(1)));
    }
}
