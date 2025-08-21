package com.google.maps.internal;

import java.util.Objects;

/* loaded from: classes8.dex */
public class StringJoin {

    public interface UrlValue {
        String toUrlValue();
    }

    public static String join(char c10, String... strArr) {
        return join((CharSequence) new String(new char[]{c10}), strArr);
    }

    public static String join(CharSequence charSequence, String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 != 0) {
                sb2.append(charSequence);
            }
            sb2.append(strArr[i10]);
        }
        return sb2.toString();
    }

    private StringJoin() {
    }

    public static String join(char c10, Object... objArr) {
        return join(new String(new char[]{c10}), objArr);
    }

    public static String join(CharSequence charSequence, Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (i10 != 0) {
                sb2.append(charSequence);
            }
            sb2.append(Objects.toString(objArr[i10]));
        }
        return sb2.toString();
    }

    public static String join(char c10, UrlValue... urlValueArr) {
        String[] strArr = new String[urlValueArr.length];
        int length = urlValueArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            strArr[i11] = urlValueArr[i10].toUrlValue();
            i10++;
            i11++;
        }
        return join(c10, strArr);
    }
}
