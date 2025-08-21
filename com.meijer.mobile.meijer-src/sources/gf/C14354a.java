package gf;

/* renamed from: gf.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C14354a {
    public static boolean a(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static String b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (a(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (a(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}
