package ih;

/* renamed from: ih.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC14729h {
    public static String a(String str, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(d(str, 0, obj, sb2)));
        return sb2.toString();
    }

    public static String b(String str, Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(d(str, d(str, 0, obj, sb2), obj2, sb2)));
        return sb2.toString();
    }

    public static String c(String str, Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        int iD = 0;
        for (Object obj : objArr) {
            iD = d(str, iD, obj, sb2);
        }
        sb2.append(str.substring(iD));
        return sb2.toString();
    }

    private static int d(String str, int i10, Object obj, StringBuilder sb2) {
        String string;
        while (i10 < str.length()) {
            int iIndexOf = str.indexOf("{}", i10);
            if (iIndexOf < 0) {
                sb2.append(str.substring(i10));
                return str.length();
            }
            if (iIndexOf > 0) {
                int i11 = iIndexOf - 1;
                if (str.charAt(i11) == '\\') {
                    sb2.append(str.substring(i10, i11));
                    i10 = iIndexOf + 2;
                    sb2.append(str.substring(iIndexOf, i10));
                }
            }
            sb2.append(str.substring(i10, iIndexOf));
            if (obj == null) {
                string = "";
            } else {
                string = obj.toString();
            }
            sb2.append(string);
            return iIndexOf + 2;
        }
        return str.length();
    }
}
