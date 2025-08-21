package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
final class E1 extends B1 {
    E1() {
    }

    private static int f(byte[] bArr, int i10, long j10, int i11) {
        if (i11 == 0) {
            return A1.d(i10);
        }
        if (i11 == 1) {
            return A1.l(i10, C10475y1.a(bArr, j10));
        }
        if (i11 == 2) {
            return A1.f(i10, C10475y1.a(bArr, j10), C10475y1.a(bArr, j10 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.clearcut.B1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.E1.a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.clearcut.B1
    final int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        long j10;
        long j11;
        long j12;
        int i12;
        char cCharAt;
        long j13 = i10;
        long j14 = i11 + j13;
        int length = charSequence.length();
        if (length > i11 || bArr.length - i11 < i10) {
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(cCharAt2);
            sb2.append(" at index ");
            sb2.append(i10 + i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i13 = 0;
        while (true) {
            j10 = 1;
            if (i13 >= length || (cCharAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            C10475y1.k(bArr, j13, (byte) cCharAt);
            i13++;
            j13 = 1 + j13;
        }
        if (i13 == length) {
            return (int) j13;
        }
        while (i13 < length) {
            char cCharAt3 = charSequence.charAt(i13);
            if (cCharAt3 < 128 && j13 < j14) {
                C10475y1.k(bArr, j13, (byte) cCharAt3);
                j12 = j14;
                j11 = j10;
                j13 += j10;
            } else if (cCharAt3 >= 2048 || j13 > j14 - 2) {
                j11 = j10;
                if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j13 > j14 - 3) {
                    j12 = j14;
                    if (j13 > j12 - 4) {
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i12)))) {
                            throw new D1(i13, length);
                        }
                        StringBuilder sb3 = new StringBuilder(46);
                        sb3.append("Failed writing ");
                        sb3.append(cCharAt3);
                        sb3.append(" at index ");
                        sb3.append(j13);
                        throw new ArrayIndexOutOfBoundsException(sb3.toString());
                    }
                    int i14 = i13 + 1;
                    if (i14 != length) {
                        char cCharAt4 = charSequence.charAt(i14);
                        if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                            int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                            C10475y1.k(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                            C10475y1.k(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j15 = j13 + 3;
                            C10475y1.k(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                            j13 += 4;
                            C10475y1.k(bArr, j15, (byte) ((codePoint & 63) | 128));
                            i13 = i14;
                        } else {
                            i13 = i14;
                        }
                    }
                    throw new D1(i13 - 1, length);
                }
                C10475y1.k(bArr, j13, (byte) ((cCharAt3 >>> '\f') | 480));
                long j16 = j13 + 2;
                j12 = j14;
                C10475y1.k(bArr, j13 + j11, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                j13 += 3;
                C10475y1.k(bArr, j16, (byte) ((cCharAt3 & '?') | 128));
            } else {
                j11 = j10;
                long j17 = j13 + j11;
                C10475y1.k(bArr, j13, (byte) ((cCharAt3 >>> 6) | 960));
                j13 += 2;
                C10475y1.k(bArr, j17, (byte) ((cCharAt3 & '?') | 128));
                j12 = j14;
            }
            i13++;
            j10 = j11;
            j14 = j12;
        }
        return (int) j13;
    }

    @Override // com.google.android.gms.internal.clearcut.B1
    final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j10;
        char c10;
        long j11;
        long j12;
        long j13;
        long j14;
        int i10;
        char c11;
        char cCharAt;
        long jO = C10475y1.o(byteBuffer);
        long jPosition = byteBuffer.position() + jO;
        long jLimit = byteBuffer.limit() + jO;
        int length = charSequence.length();
        if (length > jLimit - jPosition) {
            char cCharAt2 = charSequence.charAt(length - 1);
            int iLimit = byteBuffer.limit();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(cCharAt2);
            sb2.append(" at index ");
            sb2.append(iLimit);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i11 = 0;
        while (true) {
            j10 = 1;
            c10 = 128;
            if (i11 >= length || (cCharAt = charSequence.charAt(i11)) >= 128) {
                break;
            }
            C10475y1.c(jPosition, (byte) cCharAt);
            i11++;
            jPosition = 1 + jPosition;
        }
        if (i11 == length) {
            j11 = jPosition - jO;
        } else {
            while (i11 < length) {
                char cCharAt3 = charSequence.charAt(i11);
                if (cCharAt3 >= c10 || jPosition >= jLimit) {
                    j12 = j10;
                    if (cCharAt3 < 2048 && jPosition <= jLimit - 2) {
                        long j15 = jPosition + j12;
                        C10475y1.c(jPosition, (byte) ((cCharAt3 >>> 6) | 960));
                        jPosition += 2;
                        C10475y1.c(j15, (byte) ((cCharAt3 & '?') | 128));
                        j13 = jO;
                        j14 = jLimit;
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || jPosition > jLimit - 3) {
                            j13 = jO;
                            j14 = jLimit;
                            if (jPosition > j14 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i10)))) {
                                    throw new D1(i11, length);
                                }
                                StringBuilder sb3 = new StringBuilder(46);
                                sb3.append("Failed writing ");
                                sb3.append(cCharAt3);
                                sb3.append(" at index ");
                                sb3.append(jPosition);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i12 = i11 + 1;
                            if (i12 != length) {
                                char cCharAt4 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    C10475y1.c(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c11 = 128;
                                    C10475y1.c(jPosition + j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j16 = jPosition + 3;
                                    C10475y1.c(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    C10475y1.c(j16, (byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            throw new D1(i11 - 1, length);
                        }
                        C10475y1.c(jPosition, (byte) ((cCharAt3 >>> '\f') | 480));
                        j13 = jO;
                        long j17 = jPosition + 2;
                        j14 = jLimit;
                        C10475y1.c(jPosition + j12, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        jPosition += 3;
                        C10475y1.c(j17, (byte) ((cCharAt3 & '?') | 128));
                    }
                    c11 = 128;
                } else {
                    C10475y1.c(jPosition, (byte) cCharAt3);
                    j13 = jO;
                    j14 = jLimit;
                    c11 = c10;
                    jPosition += j10;
                    j12 = j10;
                }
                i11++;
                c10 = c11;
                j10 = j12;
                jO = j13;
                jLimit = j14;
            }
            j11 = jPosition - jO;
        }
        byteBuffer.position((int) j11);
    }
}
