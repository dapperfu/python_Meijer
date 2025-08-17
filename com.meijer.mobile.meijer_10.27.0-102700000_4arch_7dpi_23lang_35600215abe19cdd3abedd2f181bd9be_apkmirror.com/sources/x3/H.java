package x3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class H {
    public static long e(byte[] bArr) {
        return d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static boolean g(long j10, long j11) {
        return j10 - j11 <= k(3840L) / 1000;
    }

    public static int i(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b10 = byteBuffer.get(26);
        int i10 = 28;
        int i11 = 28;
        for (int i12 = 0; i12 < b10; i12++) {
            i11 += byteBuffer.get(i12 + 27);
        }
        byte b11 = byteBuffer.get(i11 + 26);
        for (int i13 = 0; i13 < b11; i13++) {
            i10 += byteBuffer.get(i11 + 27 + i13);
        }
        return i11 + i10;
    }

    public static int j(ByteBuffer byteBuffer) {
        return (int) ((d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    private static byte[] b(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static long d(byte b10, byte b11) {
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r6 : i13 >= 12 ? 10000 << (i13 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static int f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static List<byte[]> a(byte[] bArr) {
        long jK = k(f(bArr));
        long jK2 = k(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(jK));
        arrayList.add(b(jK2));
        return arrayList;
    }

    public static int h(ByteBuffer byteBuffer) {
        byte b10;
        int i10 = i(byteBuffer);
        int i11 = byteBuffer.get(i10 + 26) + 27 + i10;
        byte b11 = byteBuffer.get(i11);
        if (byteBuffer.limit() - i11 > 1) {
            b10 = byteBuffer.get(i11 + 1);
        } else {
            b10 = 0;
        }
        return (int) ((d(b11, b10) * 48000) / 1000000);
    }

    private static long k(long j10) {
        return (j10 * 1000000000) / 48000;
    }
}
