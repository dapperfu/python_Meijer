package com.google.android.gms.internal.vision;

/* loaded from: classes6.dex */
final class u2 extends p2 {
    private static int e(byte[] bArr, int i10, long j10, int i11) {
        if (i11 == 0) {
            return o2.h(i10);
        }
        if (i11 == 1) {
            return o2.i(i10, l2.a(bArr, j10));
        }
        if (i11 == 2) {
            return o2.j(i10, l2.a(bArr, j10), l2.a(bArr, j10 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.vision.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.u2.a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.vision.p2
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
            l2.l(bArr, j13, (byte) cCharAt);
            i13++;
            j13 = 1 + j13;
        }
        if (i13 == length) {
            return (int) j13;
        }
        while (i13 < length) {
            char cCharAt3 = charSequence.charAt(i13);
            if (cCharAt3 < 128 && j13 < j14) {
                l2.l(bArr, j13, (byte) cCharAt3);
                j12 = j14;
                j11 = j10;
                j13 += j10;
            } else if (cCharAt3 >= 2048 || j13 > j14 - 2) {
                j11 = j10;
                if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j13 > j14 - 3) {
                    j12 = j14;
                    if (j13 > j12 - 4) {
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i12)))) {
                            throw new r2(i13, length);
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
                            l2.l(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                            l2.l(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j15 = j13 + 3;
                            l2.l(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                            j13 += 4;
                            l2.l(bArr, j15, (byte) ((codePoint & 63) | 128));
                            i13 = i14;
                        } else {
                            i13 = i14;
                        }
                    }
                    throw new r2(i13 - 1, length);
                }
                l2.l(bArr, j13, (byte) ((cCharAt3 >>> '\f') | 480));
                long j16 = j13 + 2;
                j12 = j14;
                l2.l(bArr, j13 + j11, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                j13 += 3;
                l2.l(bArr, j16, (byte) ((cCharAt3 & '?') | 128));
            } else {
                j11 = j10;
                long j17 = j13 + j11;
                l2.l(bArr, j13, (byte) ((cCharAt3 >>> 6) | 960));
                j13 += 2;
                l2.l(bArr, j17, (byte) ((cCharAt3 & '?') | 128));
                j12 = j14;
            }
            i13++;
            j10 = j11;
            j14 = j12;
        }
        return (int) j13;
    }

    @Override // com.google.android.gms.internal.vision.p2
    final String d(byte[] bArr, int i10, int i11) throws zzjk {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte bA = l2.a(bArr, i10);
            if (!q2.l(bA)) {
                break;
            }
            i10++;
            q2.i(bA, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte bA2 = l2.a(bArr, i10);
            if (q2.l(bA2)) {
                int i16 = i14 + 1;
                q2.i(bA2, cArr, i14);
                while (i15 < i12) {
                    byte bA3 = l2.a(bArr, i15);
                    if (!q2.l(bA3)) {
                        break;
                    }
                    i15++;
                    q2.i(bA3, cArr, i16);
                    i16++;
                }
                i14 = i16;
                i10 = i15;
            } else if (q2.m(bA2)) {
                if (i15 >= i12) {
                    throw zzjk.f();
                }
                i10 += 2;
                q2.h(bA2, l2.a(bArr, i15), cArr, i14);
                i14++;
            } else if (q2.n(bA2)) {
                if (i15 >= i12 - 1) {
                    throw zzjk.f();
                }
                int i17 = i10 + 2;
                i10 += 3;
                q2.g(bA2, l2.a(bArr, i15), l2.a(bArr, i17), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw zzjk.f();
                }
                byte bA4 = l2.a(bArr, i15);
                int i18 = i10 + 3;
                byte bA5 = l2.a(bArr, i10 + 2);
                i10 += 4;
                q2.f(bA2, bA4, bA5, l2.a(bArr, i18), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    u2() {
    }
}
