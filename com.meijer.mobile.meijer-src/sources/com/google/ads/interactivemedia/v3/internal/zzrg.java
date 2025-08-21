package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzrg {
    static int zza(int i10, double d10) {
        int iMax = Math.max(i10, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= iHighestOneBit) {
            return iHighestOneBit;
        }
        int i11 = iHighestOneBit + iHighestOneBit;
        if (i11 > 0) {
            return i11;
        }
        return 1073741824;
    }

    static int zzb(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    static int zzc(Object obj) {
        return zzb(obj == null ? 0 : obj.hashCode());
    }
}
