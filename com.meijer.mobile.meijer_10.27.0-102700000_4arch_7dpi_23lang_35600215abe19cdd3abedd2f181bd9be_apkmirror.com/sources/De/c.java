package De;

/* loaded from: classes6.dex */
public abstract class c extends e {
    protected abstract char[] b(char c10);

    private static char[] d(char[] cArr, int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i11];
        if (i10 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i10);
        }
        return cArr2;
    }

    protected c() {
    }

    protected final String c(String str, int i10) {
        int length = str.length();
        char[] cArrA = g.a();
        int length2 = cArrA.length;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            char[] cArrB = b(str.charAt(i10));
            if (cArrB != null) {
                int length3 = cArrB.length;
                int i13 = i10 - i11;
                int i14 = i12 + i13;
                int i15 = i14 + length3;
                if (length2 < i15) {
                    length2 = ((length - i10) * 2) + i15;
                    cArrA = d(cArrA, i12, length2);
                }
                if (i13 > 0) {
                    str.getChars(i11, i10, cArrA, i12);
                    i12 = i14;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrB, 0, cArrA, i12, length3);
                    i12 += length3;
                }
                i11 = i10 + 1;
            }
            i10++;
        }
        int i16 = length - i11;
        if (i16 > 0) {
            int i17 = i16 + i12;
            if (length2 < i17) {
                cArrA = d(cArrA, i12, i17);
            }
            str.getChars(i11, length, cArrA, i12);
            i12 = i17;
        }
        return new String(cArrA, 0, i12);
    }
}
