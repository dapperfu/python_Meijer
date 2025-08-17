package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zztw {
    private static boolean zzc(char c10) {
        if (c10 < 'a' || c10 > 'z') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static String zzb(String str) {
        if (!str.isEmpty()) {
            if (zzc(str.charAt(0))) {
                for (int i10 = 1; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (!zzc(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                        throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                    }
                }
                return str;
            }
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        throw new IllegalArgumentException("identifier must not be empty");
    }
}
