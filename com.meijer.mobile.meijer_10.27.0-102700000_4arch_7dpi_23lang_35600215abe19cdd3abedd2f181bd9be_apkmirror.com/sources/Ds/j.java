package Ds;

import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f7348a = Pattern.compile("[0-9]{8,12}");

    public static String a(Vd.a aVar) {
        int i10 = aVar.f37380a;
        return (i10 == 64 || i10 == 1024) ? e(b(aVar.f37381b)) : e(aVar.f37381b);
    }

    public static boolean c(Vd.a aVar) {
        return aVar.f37380a == 2;
    }

    public static boolean d(String str) {
        return f7348a.matcher(str).matches();
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
