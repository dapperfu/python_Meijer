package Me;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f19816a = h(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static byte[] g(int[] iArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArr.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArr);
        return byteBufferOrder.array();
    }

    static int[] h(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    static int[] b(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        e(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        f(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    static void c(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int iD = d(i14 ^ iArr[i13], 16);
        iArr[i13] = iD;
        int i15 = iArr[i12] + iD;
        iArr[i12] = i15;
        int iD2 = d(iArr[i11] ^ i15, 12);
        iArr[i11] = iD2;
        int i16 = iArr[i10] + iD2;
        iArr[i10] = i16;
        int iD3 = d(iArr[i13] ^ i16, 8);
        iArr[i13] = iD3;
        int i17 = iArr[i12] + iD3;
        iArr[i12] = i17;
        iArr[i11] = d(iArr[i11] ^ i17, 7);
    }

    private static int d(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    static void e(int[] iArr, int[] iArr2) {
        int[] iArr3 = f19816a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void f(int[] iArr) {
        for (int i10 = 0; i10 < 10; i10++) {
            c(iArr, 0, 4, 8, 12);
            c(iArr, 1, 5, 9, 13);
            c(iArr, 2, 6, 10, 14);
            c(iArr, 3, 7, 11, 15);
            c(iArr, 0, 5, 10, 15);
            c(iArr, 1, 6, 11, 12);
            c(iArr, 2, 7, 8, 13);
            c(iArr, 3, 4, 9, 14);
        }
    }

    static byte[] a(byte[] bArr, byte[] bArr2) {
        return g(b(h(bArr), h(bArr2)));
    }
}
