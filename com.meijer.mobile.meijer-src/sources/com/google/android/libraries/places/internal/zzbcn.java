package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class zzbcn {
    private static final zzbcn zza = new zzbcn(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzbcn(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzbcn zza() {
        return zza;
    }

    static zzbcn zzb() {
        return new zzbcn(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbcn)) {
            return false;
        }
        zzbcn zzbcnVar = (zzbcn) obj;
        int i10 = this.zzb;
        if (i10 == zzbcnVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzbcnVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzbcnVar.zzd;
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

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzf(zzbcz zzbczVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzbczVar.zzv(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    final void zzj(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzbbn.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    private zzbcn() {
        this(0, new int[8], new Object[8], true);
    }

    static zzbcn zzc(zzbcn zzbcnVar, zzbcn zzbcnVar2) {
        int i10 = zzbcnVar.zzb + zzbcnVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzbcnVar.zzc, i10);
        System.arraycopy(zzbcnVar2.zzc, 0, iArrCopyOf, zzbcnVar.zzb, zzbcnVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzbcnVar.zzd, i10);
        System.arraycopy(zzbcnVar2.zzd, 0, objArrCopyOf, zzbcnVar.zzb, zzbcnVar2.zzb);
        return new zzbcn(i10, iArrCopyOf, objArrCopyOf, true);
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

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzg(zzbcz zzbczVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzbczVar.zzc(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzbczVar.zzj(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzbczVar.zzn(i13, (zzayz) obj);
                } else if (i12 == 3) {
                    zzbczVar.zzt(i13);
                    ((zzbcn) obj).zzg(zzbczVar);
                    zzbczVar.zzu(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzbaq("Protocol message tag had invalid wire type."));
                    }
                    zzbczVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzz = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzayz zzayzVar = (zzayz) this.zzd[i11];
            int iZzz2 = zzazi.zzz(8);
            int iZzz3 = zzazi.zzz(16) + zzazi.zzz(i12);
            int iZzz4 = zzazi.zzz(24);
            int iZzc = zzayzVar.zzc();
            iZzz += iZzz2 + iZzz2 + iZzz3 + iZzz4 + zzazi.zzz(iZzc) + iZzc;
        }
        this.zze = iZzz;
        return iZzz;
    }

    public final int zzi() {
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
                    iZzz2 = zzazi.zzz(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    zzayz zzayzVar = (zzayz) this.zzd[i12];
                    int iZzz3 = zzazi.zzz(i16);
                    int iZzc = zzayzVar.zzc();
                    iZzz2 = iZzz3 + zzazi.zzz(iZzc) + iZzc;
                } else if (i15 == 3) {
                    int iZzz4 = zzazi.zzz(i14 << 3);
                    iZzz = iZzz4 + iZzz4;
                    iZzA = ((zzbcn) this.zzd[i12]).zzi();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzbaq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i12]).getClass();
                    iZzz2 = zzazi.zzz(i14 << 3) + 4;
                }
                i11 += iZzz2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.zzd[i12]).longValue();
                iZzz = zzazi.zzz(i17);
                iZzA = zzazi.zzA(jLongValue);
            }
            iZzz2 = iZzz + iZzA;
            i11 += iZzz2;
        }
        this.zze = i11;
        return i11;
    }

    final zzbcn zzl(zzbcn zzbcnVar) {
        if (zzbcnVar.equals(zza)) {
            return this;
        }
        zze();
        int i10 = this.zzb + zzbcnVar.zzb;
        zzm(i10);
        System.arraycopy(zzbcnVar.zzc, 0, this.zzc, this.zzb, zzbcnVar.zzb);
        System.arraycopy(zzbcnVar.zzd, 0, this.zzd, this.zzb, zzbcnVar.zzb);
        this.zzb = i10;
        return this;
    }

    final void zzk(int i10, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }
}
