package d4;

import androidx.media3.common.ParserException;
import d3.D;
import d3.P;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f127223a = Pattern.compile("^NOTE([ \t].*)?$");

    public static float b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String[] strArrD1 = P.d1(str, "\\.");
        long j10 = 0;
        for (String str2 : P.c1(strArrD1[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrD1.length == 2) {
            String strTrim = strArrD1[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: " + strTrim);
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static boolean a(D d10) {
        String strS = d10.s();
        if (strS != null && strS.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static void d(D d10) throws ParserException {
        int iF = d10.f();
        if (a(d10)) {
            return;
        }
        d10.W(iF);
        throw ParserException.a("Expected WEBVTT. Got " + d10.s(), null);
    }
}
