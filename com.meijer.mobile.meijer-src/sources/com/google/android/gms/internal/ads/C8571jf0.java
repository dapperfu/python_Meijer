package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8571jf0 {
    public static boolean d(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean e(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    private static int f(char c10) {
        return (char) ((c10 | ' ') - 97);
    }

    public static String a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (e(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (e(c10)) {
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

    public static String b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (d(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (d(c10)) {
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

    public static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        int iF;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            char cCharAt2 = charSequence2.charAt(i10);
            if (cCharAt != cCharAt2 && ((iF = f(cCharAt)) >= 26 || iF != f(cCharAt2))) {
                return false;
            }
        }
        return true;
    }
}
