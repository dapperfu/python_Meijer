package Lb;

/* loaded from: classes4.dex */
public final class n {
    public static Integer a(String str, String str2) {
        int iCompareTo;
        int i10;
        int i11 = -1;
        if (str == null) {
            return -1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
        int i12 = 0;
        while (i12 < iMax) {
            String str3 = i12 < strArrSplit.length ? strArrSplit[i12] : "0";
            String str4 = i12 < strArrSplit2.length ? strArrSplit2[i12] : "0";
            if (!str3.equals(str4)) {
                try {
                    iCompareTo = Integer.valueOf(str3).compareTo(Integer.valueOf(str4));
                } catch (NumberFormatException unused) {
                    String strReplaceAll = str3.replaceAll("[^\\d.]", "");
                    String strReplaceAll2 = str4.replaceAll("[^\\d.]", "");
                    if (strReplaceAll != null || strReplaceAll2 != null) {
                        if (strReplaceAll != null) {
                            if (strReplaceAll2 == null) {
                                iCompareTo = i11;
                            } else {
                                int length = strReplaceAll.length();
                                int length2 = strReplaceAll2.length();
                                int i13 = 0;
                                int i14 = 0;
                                while (i13 < length && i14 < length2) {
                                    char cCharAt = strReplaceAll.charAt(i13);
                                    char cCharAt2 = strReplaceAll2.charAt(i14);
                                    if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
                                        i10 = length;
                                        char lowerCase = Character.toLowerCase(cCharAt);
                                        char lowerCase2 = Character.toLowerCase(cCharAt2);
                                        if (lowerCase != lowerCase2) {
                                            iCompareTo = lowerCase - lowerCase2;
                                            break;
                                        }
                                        i13++;
                                        i14++;
                                        length = i10;
                                    } else {
                                        long jCharAt = 0;
                                        long jCharAt2 = 0;
                                        while (i13 < length) {
                                            if (strReplaceAll.charAt(i13) < '0' || strReplaceAll.charAt(i13) > '9') {
                                                i10 = length;
                                                break;
                                            }
                                            jCharAt2 = (jCharAt2 * 10) + (strReplaceAll.charAt(i13) - '0');
                                            i13++;
                                            length = length;
                                        }
                                        i10 = length;
                                        while (i14 < length2 && strReplaceAll2.charAt(i14) >= '0' && strReplaceAll2.charAt(i14) <= '9') {
                                            jCharAt = (jCharAt * 10) + (strReplaceAll2.charAt(i14) - '0');
                                            i14++;
                                        }
                                        if (jCharAt2 < jCharAt) {
                                            iCompareTo = -1;
                                            break;
                                        }
                                        if (jCharAt >= jCharAt2) {
                                            length = i10;
                                        }
                                    }
                                    i12++;
                                    i11 = -1;
                                }
                                iCompareTo = (length - i13) - (length2 - i14);
                            }
                        }
                        iCompareTo = 1;
                        break;
                    } else {
                        iCompareTo = 0;
                    }
                }
                if (iCompareTo != 0) {
                    return Integer.valueOf(Integer.signum(iCompareTo));
                }
            }
            i12++;
            i11 = -1;
        }
        return 0;
    }
}
