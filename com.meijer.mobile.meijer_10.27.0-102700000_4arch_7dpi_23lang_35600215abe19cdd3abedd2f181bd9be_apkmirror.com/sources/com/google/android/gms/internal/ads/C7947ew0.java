package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ew0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7947ew0 extends AbstractC7840dw0 {
    C7947ew0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7840dw0
    final String b(byte[] bArr, int i10, int i11) throws zzgyg {
        int i12;
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i13 = i10 + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (i10 < i13) {
            byte b10 = bArr[i10];
            if (!C7734cw0.d(b10)) {
                break;
            }
            i10++;
            cArr[i14] = (char) b10;
            i14++;
        }
        int i15 = i14;
        while (i10 < i13) {
            int i16 = i10 + 1;
            byte b11 = bArr[i10];
            if (C7734cw0.d(b11)) {
                cArr[i15] = (char) b11;
                i15++;
                i10 = i16;
                while (i10 < i13) {
                    byte b12 = bArr[i10];
                    if (C7734cw0.d(b12)) {
                        i10++;
                        cArr[i15] = (char) b12;
                        i15++;
                    }
                }
            } else {
                if (C7734cw0.f(b11)) {
                    if (i16 >= i13) {
                        throw new zzgyg("Protocol message had invalid UTF-8.");
                    }
                    i12 = i15 + 1;
                    i10 += 2;
                    C7734cw0.c(b11, bArr[i16], cArr, i15);
                } else if (C7734cw0.e(b11)) {
                    if (i16 >= i13 - 1) {
                        throw new zzgyg("Protocol message had invalid UTF-8.");
                    }
                    i12 = i15 + 1;
                    int i17 = i10 + 2;
                    i10 += 3;
                    C7734cw0.b(b11, bArr[i16], bArr[i17], cArr, i15);
                } else {
                    if (i16 >= i13 - 2) {
                        throw new zzgyg("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i16];
                    int i18 = i10 + 3;
                    byte b14 = bArr[i10 + 2];
                    i10 += 4;
                    C7734cw0.a(b11, b13, b14, bArr[i18], cArr, i15);
                    i15 += 2;
                }
                i15 = i12;
            }
        }
        return new String(cArr, 0, i15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.AbstractC7840dw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7947ew0.a(int, byte[], int, int):int");
    }
}
