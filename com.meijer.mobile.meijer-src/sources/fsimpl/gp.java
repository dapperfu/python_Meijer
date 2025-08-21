package fsimpl;

import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class gp extends gn {
    private static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) < 65536) {
                        throw new gq(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    private static int a(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = charSequence.length();
        int i15 = i11 + i10;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i10) < i15 && (cCharAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        while (i16 < length) {
            char cCharAt2 = charSequence.charAt(i16);
            if (cCharAt2 >= 128 || i17 >= i15) {
                if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                    i17 = i18 + 1;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i17 > i15 - 3) {
                        if (i17 > i15 - 4) {
                            if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i13 = i16 + 1) != charSequence.length() && Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                            }
                            throw new gq(i16, length);
                        }
                        int i19 = i16 + 1;
                        if (i19 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i19);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i20 = i17 + 1;
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                int i21 = i20 + 1;
                                bArr[i20] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i22 = i21 + 1;
                                bArr[i21] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 = i22 + 1;
                                bArr[i22] = (byte) ((codePoint & 63) | 128);
                                i16 = i19;
                            } else {
                                i16 = i19;
                            }
                        }
                        throw new gq(i16 - 1, length);
                    }
                    int i23 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i24 = i23 + 1;
                    bArr[i23] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i12 = i24 + 1;
                    bArr[i24] = (byte) ((cCharAt2 & '?') | 128);
                }
                i16++;
            } else {
                i12 = i17 + 1;
                bArr[i17] = (byte) cCharAt2;
            }
            i17 = i12;
            i16++;
        }
        return i17;
    }

    public static String a(byte[] bArr, int i10, int i11) {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!go.a(b10)) {
                break;
            }
            i10++;
            go.a(b10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (go.a(b11)) {
                int i16 = i14 + 1;
                go.a(b11, cArr, i14);
                while (i15 < i12) {
                    byte b12 = bArr[i15];
                    if (!go.a(b12)) {
                        break;
                    }
                    i15++;
                    go.a(b12, cArr, i16);
                    i16++;
                }
                i10 = i15;
                i14 = i16;
            } else if (go.b(b11)) {
                if (i15 >= i12) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                go.a(b11, bArr[i15], cArr, i14);
                i10 = i15 + 1;
                i14++;
            } else if (go.c(b11)) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = i15 + 1;
                go.a(b11, bArr[i15], bArr[i17], cArr, i14);
                i10 = i17 + 1;
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i18 = i15 + 1;
                byte b13 = bArr[i15];
                int i19 = i18 + 1;
                go.a(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                i10 = i19 + 1;
                i14 = i14 + 1 + 1;
            }
        }
        return new String(cArr, 0, i14);
    }

    private static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int iA = length;
        while (true) {
            if (i10 < length) {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt >= 2048) {
                    iA += a(charSequence, i10);
                    break;
                }
                iA += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (iA >= length) {
            return iA;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iA + 4294967296L));
    }

    public static String b(ByteBuffer byteBuffer, int i10, int i11) {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (!go.a(b10)) {
                break;
            }
            i10++;
            go.a(b10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (go.a(b11)) {
                int i16 = i14 + 1;
                go.a(b11, cArr, i14);
                while (i15 < i12) {
                    byte b12 = byteBuffer.get(i15);
                    if (!go.a(b12)) {
                        break;
                    }
                    i15++;
                    go.a(b12, cArr, i16);
                    i16++;
                }
                i10 = i15;
                i14 = i16;
            } else if (go.b(b11)) {
                if (i15 >= i12) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                go.a(b11, byteBuffer.get(i15), cArr, i14);
                i10 = i15 + 1;
                i14++;
            } else if (go.c(b11)) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = i15 + 1;
                go.a(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                i10 = i17 + 1;
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i18 = i15 + 1;
                byte b13 = byteBuffer.get(i15);
                int i19 = i18 + 1;
                go.a(b11, b13, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                i10 = i19 + 1;
                i14 = i14 + 1 + 1;
            }
        }
        return new String(cArr, 0, i14);
    }

    private static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i10 = 0;
        while (i10 < length) {
            try {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i10, (byte) cCharAt);
                i10++;
            } catch (IndexOutOfBoundsException e10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (iPosition - byteBuffer.position()) + 1)));
            }
        }
        if (i10 == length) {
            byteBuffer.position(iPosition + i10);
            return;
        }
        iPosition += i10;
        while (i10 < length) {
            char cCharAt2 = charSequence.charAt(i10);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i11 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i11, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i11;
                } catch (IndexOutOfBoundsException e11) {
                    iPosition = i11;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (iPosition - byteBuffer.position()) + 1)));
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i12 = i10 + 1;
                    if (i12 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i13 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    int i14 = i13 + 1;
                                    byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                    int i15 = i14 + 1;
                                    byteBuffer.put(i14, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i15, (byte) ((codePoint & 63) | 128));
                                    iPosition = i15;
                                    i10 = i12;
                                } catch (IndexOutOfBoundsException e12) {
                                    iPosition = i13;
                                    i10 = i12;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (byteBuffer.position() + Math.max(i10, (iPosition - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i10 = i12;
                            }
                        } catch (IndexOutOfBoundsException e13) {
                        }
                    }
                    throw new gq(i10, length);
                }
                int i16 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition = i16 + 1;
                byteBuffer.put(i16, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i10++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    @Override // fsimpl.gn
    public int a(CharSequence charSequence) {
        return b(charSequence);
    }

    @Override // fsimpl.gn
    public String a(ByteBuffer byteBuffer, int i10, int i11) {
        return byteBuffer.hasArray() ? a(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11) : b(byteBuffer, i10, i11);
    }

    @Override // fsimpl.gn
    public void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            b(charSequence, byteBuffer);
        } else {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(a(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        }
    }
}
