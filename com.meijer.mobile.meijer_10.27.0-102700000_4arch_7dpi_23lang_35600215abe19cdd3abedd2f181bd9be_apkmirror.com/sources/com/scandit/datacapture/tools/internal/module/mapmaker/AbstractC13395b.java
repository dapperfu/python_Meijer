package com.scandit.datacapture.tools.internal.module.mapmaker;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC13395b {
    public static String a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
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
