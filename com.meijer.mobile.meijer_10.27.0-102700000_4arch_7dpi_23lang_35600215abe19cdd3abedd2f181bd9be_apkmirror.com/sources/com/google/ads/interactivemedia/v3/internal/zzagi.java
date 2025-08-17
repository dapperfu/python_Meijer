package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzagi {
    private static final zzagi zza = new zzagi(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzagi(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzagi zzc() {
        return zza;
    }

    static zzagi zzf() {
        return new zzagi(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzagi)) {
            return false;
        }
        zzagi zzagiVar = (zzagi) obj;
        int i10 = this.zzb;
        if (i10 == zzagiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzagiVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzagiVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzafd.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    final void zzk(zzagu zzaguVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzaguVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    private zzagi() {
        this(0, new int[8], new Object[8], true);
    }

    static zzagi zze(zzagi zzagiVar, zzagi zzagiVar2) {
        int i10 = zzagiVar.zzb + zzagiVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzagiVar.zzc, i10);
        System.arraycopy(zzagiVar2.zzc, 0, iArrCopyOf, zzagiVar.zzb, zzagiVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzagiVar.zzd, i10);
        System.arraycopy(zzagiVar2.zzd, 0, objArrCopyOf, zzagiVar.zzb, zzagiVar2.zzb);
        return new zzagi(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.zzd[i12]).getClass();
                    iZzz2 = zzadf.zzz(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    zzacw zzacwVar = (zzacw) this.zzd[i12];
                    int iZzz3 = zzadf.zzz(i16);
                    int iZzd = zzacwVar.zzd();
                    iZzz2 = iZzz3 + zzadf.zzz(iZzd) + iZzd;
                } else if (i15 == 3) {
                    int iZzz4 = zzadf.zzz(i14 << 3);
                    iZzz = iZzz4 + iZzz4;
                    iZzA = ((zzagi) this.zzd[i12]).zza();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzaef("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i12]).getClass();
                    iZzz2 = zzadf.zzz(i14 << 3) + 4;
                }
                i11 += iZzz2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.zzd[i12]).longValue();
                iZzz = zzadf.zzz(i17);
                iZzA = zzadf.zzA(jLongValue);
            }
            iZzz2 = iZzz + iZzA;
            i11 += iZzz2;
        }
        this.zze = i11;
        return i11;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzz = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzacw zzacwVar = (zzacw) this.zzd[i11];
            int iZzz2 = zzadf.zzz(8);
            int iZzz3 = zzadf.zzz(16) + zzadf.zzz(i12);
            int iZzz4 = zzadf.zzz(24);
            int iZzd = zzacwVar.zzd();
            iZzz += iZzz2 + iZzz2 + iZzz3 + iZzz4 + zzadf.zzz(iZzd) + iZzd;
        }
        this.zze = iZzz;
        return iZzz;
    }

    final zzagi zzd(zzagi zzagiVar) {
        if (zzagiVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzagiVar.zzb;
        zzm(i10);
        System.arraycopy(zzagiVar.zzc, 0, this.zzc, this.zzb, zzagiVar.zzb);
        System.arraycopy(zzagiVar.zzd, 0, this.zzd, this.zzb, zzagiVar.zzb);
        this.zzb = i10;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzl(zzagu zzaguVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzaguVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzaguVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzaguVar.zzd(i13, (zzacw) obj);
                } else if (i12 == 3) {
                    zzaguVar.zzF(i13);
                    ((zzagi) obj).zzl(zzaguVar);
                    zzaguVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzaef("Protocol message tag had invalid wire type."));
                    }
                    zzaguVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }
}
