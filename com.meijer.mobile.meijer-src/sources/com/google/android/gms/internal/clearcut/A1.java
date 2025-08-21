package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
final class A1 {

    /* renamed from: a, reason: collision with root package name */
    private static final B1 f81941a;

    static {
        f81941a = (C10475y1.x() && C10475y1.y()) ? new E1() : new C1();
    }

    static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new D1(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    static int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f81941a.b(charSequence, bArr, i10, i11);
    }

    static void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        B1 b12 = f81941a;
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(b(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        } else if (byteBuffer.isDirect()) {
            b12.c(charSequence, byteBuffer);
        } else {
            B1.d(charSequence, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static boolean h(byte[] bArr) {
        return f81941a.e(bArr, 0, bArr.length);
    }

    public static boolean i(byte[] bArr, int i10, int i11) {
        return f81941a.e(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return d(b10);
        }
        if (i12 == 1) {
            return l(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return f(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }
}
