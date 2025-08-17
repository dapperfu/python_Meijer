package com.google.ads.interactivemedia.v3.internal;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class zzsu {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    zzsu(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z10 = true;
            zzqh.zzf(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            zzqh.zzf(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public final String toString() {
        return this.zze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    final zzsu zzc() {
        boolean z10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i11 >= cArr.length) {
                return this;
            }
            if (zzpw.zza(cArr[i11])) {
                int i12 = 0;
                while (true) {
                    if (i12 >= cArr.length) {
                        z10 = false;
                        break;
                    }
                    char c10 = cArr[i12];
                    if (c10 >= 'a' && c10 <= 'z') {
                        z10 = true;
                        break;
                    }
                    i12++;
                }
                zzqh.zzi(!z10, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i10 >= cArr3.length) {
                        break;
                    }
                    char c11 = cArr3[i10];
                    if (zzpw.zza(c11)) {
                        c11 ^= 32;
                    }
                    cArr2[i10] = (char) c11;
                    i10++;
                }
                zzsu zzsuVar = new zzsu(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzsuVar.zzi) {
                    return zzsuVar;
                }
                byte[] bArr = zzsuVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i13 = 65; i13 <= 90; i13++) {
                    int i14 = i13 | 32;
                    byte[] bArr2 = zzsuVar.zzg;
                    byte b10 = bArr2[i13];
                    byte b11 = bArr2[i14];
                    if (b10 == -1) {
                        bArrCopyOf[i13] = b11;
                    } else {
                        char c12 = (char) i13;
                        char c13 = (char) i14;
                        if (b11 != -1) {
                            throw new IllegalStateException(zzqm.zzb("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                        }
                        bArrCopyOf[i14] = b10;
                    }
                }
                return new zzsu(zzsuVar.zze.concat(".ignoreCase()"), zzsuVar.zzf, bArrCopyOf, true);
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzsu) {
            zzsu zzsuVar = (zzsu) obj;
            if (this.zzi == zzsuVar.zzi && Arrays.equals(this.zzf, zzsuVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    final char zza(int i10) {
        return this.zzf[i10];
    }

    final int zzb(char c10) throws zzsx {
        if (c10 > 127) {
            throw new zzsx("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        byte b10 = this.zzg[c10];
        if (b10 != -1) {
            return b10;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new zzsx("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        throw new zzsx("Unrecognized character: " + c10);
    }

    final boolean zzd(int i10) {
        return this.zzh[i10 % this.zzc];
    }

    public final boolean zze(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzsu(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zztd.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zztd.zza(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }
}
