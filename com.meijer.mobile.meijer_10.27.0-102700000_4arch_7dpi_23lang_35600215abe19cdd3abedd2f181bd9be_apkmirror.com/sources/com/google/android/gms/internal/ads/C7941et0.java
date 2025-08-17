package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.et0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7941et0 {
    public static byte[] b(byte[]... bArr) throws GeneralSecurityException {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= bArr.length) {
                byte[] bArr2 = new byte[i11];
                int i12 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i12, length);
                    i12 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i10].length;
            if (i11 > a.e.API_PRIORITY_OTHER - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i11 += length2;
            i10++;
        }
    }

    public static final byte[] c(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (bArr.length - 16 < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i13 = 0; i13 < 16; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13]);
        }
        return bArr3;
    }

    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }
}
