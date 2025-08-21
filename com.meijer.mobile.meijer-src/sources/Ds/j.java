package Ds;

import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f6655a = Pattern.compile("[0-9]{8,12}");

    public static String a(Xd.a aVar) {
        int i10 = aVar.f42092a;
        return (i10 == 64 || i10 == 1024) ? e(b(aVar.f42093b)) : e(aVar.f42093b);
    }

    public static boolean c(Xd.a aVar) {
        return aVar.f42092a == 2;
    }

    public static boolean d(String str) {
        return f6655a.matcher(str).matches();
    }

    public static String e(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.length() > 11) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        return strTrim.startsWith("0") ? strTrim.substring(1) : strTrim;
    }

    public static String b(String str) {
        if (str.length() != 8) {
            return str;
        }
        return str.substring(0, 3) + "00000" + str.substring(3, 6) + str.charAt(7);
    }
}
