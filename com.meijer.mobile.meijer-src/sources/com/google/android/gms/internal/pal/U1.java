package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class U1 {
    static /* bridge */ /* synthetic */ boolean d(byte b10) {
        return b10 >= 0;
    }

    private static boolean e(byte b10) {
        return b10 > -65;
    }

    static /* bridge */ /* synthetic */ void c(byte b10, byte b11, char[] cArr, int i10) throws zzadi {
        if (b10 < -62 || e(b11)) {
            throw zzadi.d();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    static /* bridge */ /* synthetic */ void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzadi {
        if (!e(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !e(b12) && !e(b13)) {
            int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
            cArr[i10] = (char) ((i11 >>> 10) + 55232);
            cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
            return;
        }
        throw zzadi.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void b(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.pal.zzadi {
        /*
            boolean r0 = e(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = e(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            int r2 = r2 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r4 & 63
            r2 = r2 | r3
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            com.google.android.gms.internal.pal.zzadi r2 = com.google.android.gms.internal.pal.zzadi.d()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.U1.b(byte, byte, byte, char[], int):void");
    }
}
