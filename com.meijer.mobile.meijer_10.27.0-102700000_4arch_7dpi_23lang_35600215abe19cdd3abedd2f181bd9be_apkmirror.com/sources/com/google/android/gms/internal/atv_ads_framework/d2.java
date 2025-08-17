package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
final class d2 extends c2 {
    d2() {
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.c2
    final int a(int i10, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 >= i12) {
            return 0;
        }
        while (i13 < i12) {
            int i14 = i13 + 1;
            byte b10 = bArr[i13];
            if (b10 >= 0) {
                i13 = i14;
            } else {
                if (b10 < -32) {
                    if (i14 >= i12) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        i13 += 2;
                        if (bArr[i14] > -65) {
                        }
                    }
                    return -1;
                }
                if (b10 >= -16) {
                    if (i14 >= i12 - 2) {
                        return f2.a(bArr, i14, i12);
                    }
                    int i15 = i13 + 2;
                    byte b11 = bArr[i14];
                    if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                        int i16 = i13 + 3;
                        if (bArr[i15] <= -65) {
                            i13 += 4;
                            if (bArr[i16] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i14 >= i12 - 1) {
                    return f2.a(bArr, i14, i12);
                }
                int i17 = i13 + 2;
                byte b12 = bArr[i14];
                if (b12 > -65 || (b10 == -32 && b12 < -96)) {
                    return -1;
                }
                if (b10 == -19 && b12 >= -96) {
                    return -1;
                }
                i13 += 3;
                if (bArr[i17] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
