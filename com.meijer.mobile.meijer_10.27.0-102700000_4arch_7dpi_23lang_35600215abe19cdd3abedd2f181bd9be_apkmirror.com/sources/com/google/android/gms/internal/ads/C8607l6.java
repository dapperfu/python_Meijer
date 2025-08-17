package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8607l6 {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long b(GQ gq2, int i10, int i11) {
        gq2.l(i10);
        if (gq2.r() >= 5) {
            int iW = gq2.w();
            if ((8388608 & iW) == 0 && ((iW >> 8) & 8191) == i11 && (iW & 32) != 0 && gq2.C() >= 7 && gq2.r() >= 7 && (gq2.C() & 16) == 16) {
                byte[] bArr = new byte[6];
                gq2.h(bArr, 0, 6);
                long j10 = bArr[0];
                long j11 = bArr[1];
                long j12 = bArr[2];
                long j13 = bArr[3] & 255;
                return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((bArr[4] & 255) >> 7);
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }
}
