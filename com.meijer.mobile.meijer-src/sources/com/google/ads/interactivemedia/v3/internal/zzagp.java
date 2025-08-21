package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzagp {
    static /* bridge */ /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    private static boolean zze(byte b10) {
        return b10 > -65;
    }

    static /* bridge */ /* synthetic */ void zzc(byte b10, byte b11, char[] cArr, int i10) throws zzaeg {
        if (b10 < -62 || zze(b11)) {
            throw new zzaeg("Protocol message had invalid UTF-8.");
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    static /* bridge */ /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzaeg {
        if (!zze(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !zze(b12) && !zze(b13)) {
            int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
            cArr[i10] = (char) ((i11 >>> 10) + 55232);
            cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
            return;
        }
        throw new zzaeg("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void zzb(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.ads.interactivemedia.v3.internal.zzaeg {
        /*
            boolean r0 = zze(r3)
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
            boolean r0 = zze(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            com.google.ads.interactivemedia.v3.internal.zzaeg r2 = new com.google.ads.interactivemedia.v3.internal.zzaeg
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzagp.zzb(byte, byte, byte, char[], int):void");
    }
}
