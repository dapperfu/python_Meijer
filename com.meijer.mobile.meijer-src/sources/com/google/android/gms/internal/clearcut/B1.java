package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
abstract class B1 {
    B1() {
    }

    static void d(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i11 = 0;
        while (i11 < length) {
            try {
                char cCharAt = charSequence.charAt(i11);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i11, (byte) cCharAt);
                i11++;
            } catch (IndexOutOfBoundsException unused) {
                int iPosition2 = byteBuffer.position() + Math.max(i11, (iPosition - byteBuffer.position()) + 1);
                char cCharAt2 = charSequence.charAt(i11);
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Failed writing ");
                sb2.append(cCharAt2);
                sb2.append(" at index ");
                sb2.append(iPosition2);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
        }
        if (i11 == length) {
            byteBuffer.position(iPosition + i11);
            return;
        }
        iPosition += i11;
        while (i11 < length) {
            char cCharAt3 = charSequence.charAt(i11);
            if (cCharAt3 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt3);
            } else if (cCharAt3 < 2048) {
                int i12 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt3 >>> 6) | 192));
                    byteBuffer.put(i12, (byte) ((cCharAt3 & '?') | 128));
                    iPosition = i12;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i12;
                    int iPosition22 = byteBuffer.position() + Math.max(i11, (iPosition - byteBuffer.position()) + 1);
                    char cCharAt22 = charSequence.charAt(i11);
                    StringBuilder sb22 = new StringBuilder(37);
                    sb22.append("Failed writing ");
                    sb22.append(cCharAt22);
                    sb22.append(" at index ");
                    sb22.append(iPosition22);
                    throw new ArrayIndexOutOfBoundsException(sb22.toString());
                }
            } else {
                if (cCharAt3 >= 55296 && 57343 >= cCharAt3) {
                    int i13 = i11 + 1;
                    if (i13 != length) {
                        try {
                            char cCharAt4 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                int i14 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    i10 = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i14;
                                    i11 = i13;
                                    int iPosition222 = byteBuffer.position() + Math.max(i11, (iPosition - byteBuffer.position()) + 1);
                                    char cCharAt222 = charSequence.charAt(i11);
                                    StringBuilder sb222 = new StringBuilder(37);
                                    sb222.append("Failed writing ");
                                    sb222.append(cCharAt222);
                                    sb222.append(" at index ");
                                    sb222.append(iPosition222);
                                    throw new ArrayIndexOutOfBoundsException(sb222.toString());
                                }
                                try {
                                    byteBuffer.put(i14, (byte) (((codePoint >>> 12) & 63) | 128));
                                    iPosition += 3;
                                    byteBuffer.put(i10, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i11 = i13;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i11 = i13;
                                    iPosition = i10;
                                    int iPosition2222 = byteBuffer.position() + Math.max(i11, (iPosition - byteBuffer.position()) + 1);
                                    char cCharAt2222 = charSequence.charAt(i11);
                                    StringBuilder sb2222 = new StringBuilder(37);
                                    sb2222.append("Failed writing ");
                                    sb2222.append(cCharAt2222);
                                    sb2222.append(" at index ");
                                    sb2222.append(iPosition2222);
                                    throw new ArrayIndexOutOfBoundsException(sb2222.toString());
                                }
                            } else {
                                i11 = i13;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new D1(i11, length);
                }
                int i15 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt3 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i15, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt3 & '?') | 128));
            }
            i11++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    abstract int a(int i10, byte[] bArr, int i11, int i12);

    abstract int b(CharSequence charSequence, byte[] bArr, int i10, int i11);

    abstract void c(CharSequence charSequence, ByteBuffer byteBuffer);

    final boolean e(byte[] bArr, int i10, int i11) {
        return a(0, bArr, i10, i11) == 0;
    }
}
