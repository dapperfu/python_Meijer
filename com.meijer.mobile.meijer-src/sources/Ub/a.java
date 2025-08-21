package Ub;

/* loaded from: classes4.dex */
public final class a {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            throw new com.gimbal.proximity.a.c(Tb.b.PROXIMITY_UNKNOWN_TYPE);
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Integer.valueOf(b10 & 255)));
        }
        return sb2.toString().toUpperCase();
    }

    public static byte[] b(String str) {
        if (str == null) {
            throw new com.gimbal.proximity.a.c(Tb.b.PROXIMITY_UNKNOWN_TYPE);
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            byte bDigit = (byte) Character.digit(str.charAt(i10), 16);
            byte bDigit2 = (byte) Character.digit(str.charAt(i10 + 1), 16);
            if (bDigit < 0 || bDigit2 < 0) {
                throw new com.gimbal.proximity.a.c(Tb.b.PROXIMITY_UNKNOWN_TYPE);
            }
            bArr[i10 / 2] = (byte) ((bDigit << 4) + bDigit2);
        }
        return bArr;
    }
}
