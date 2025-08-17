package Be;

/* loaded from: classes6.dex */
public final class B {
    private static String c(int i10) {
        return "Unpaired surrogate at index " + i10;
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int iB = length;
        while (true) {
            if (i10 < length) {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt < 2048) {
                    iB += (127 - cCharAt) >>> 31;
                    i10++;
                } else {
                    iB += b(charSequence, i10);
                    break;
                }
            } else {
                break;
            }
        }
        if (iB >= length) {
            return iB;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iB + 4294967296L));
    }

    private static int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) != cCharAt) {
                        i10++;
                    } else {
                        throw new IllegalArgumentException(c(i10));
                    }
                }
            }
            i10++;
        }
        return i11;
    }
}
