package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.m6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10791m6 {
    private static int b(char c10) {
        return (char) ((c10 | ' ') - 97);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int iB;
        int length = charSequence.length();
        if (charSequence == "00000000-0000-0000-0000-000000000000") {
            return true;
        }
        if (length != 36) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            char cCharAt2 = "00000000-0000-0000-0000-000000000000".charAt(i10);
            if (cCharAt != cCharAt2 && ((iB = b(cCharAt)) >= 26 || iB != b(cCharAt2))) {
                return false;
            }
        }
        return true;
    }
}
