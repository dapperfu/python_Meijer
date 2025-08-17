package w6;

/* renamed from: w6.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17794p {
    static String a(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            int i12 = 1;
            while (i11 < length && cCharAt == str.charAt(i11)) {
                i12++;
                i11++;
            }
            if (i12 > 1) {
                sb2.append(String.valueOf(i12));
            }
            sb2.append(cCharAt);
            i10 = i11;
        }
        return sb2.toString();
    }
}
