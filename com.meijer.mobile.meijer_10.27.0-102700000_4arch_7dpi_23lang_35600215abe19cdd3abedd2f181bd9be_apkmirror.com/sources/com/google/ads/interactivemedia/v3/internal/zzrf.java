package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzrf extends AbstractMap implements Serializable, zzqs {
    transient Object[] zza;
    transient Object[] zzb;
    transient int zzc;
    transient int zzd;
    private transient int[] zze;
    private transient int[] zzf;
    private transient int[] zzg;
    private transient int[] zzh;
    private transient int zzi;
    private transient int zzj;
    private transient int[] zzk;
    private transient int[] zzl;
    private transient Set zzm;
    private transient Set zzn;
    private transient Set zzo;
    private transient zzqs zzp;

    private final void zzp(int i10, int i11) {
        zzqh.zzd(i10 != -1);
        int iZzo = zzo(i11);
        int[] iArr = this.zze;
        int i12 = iArr[iZzo];
        if (i12 == i10) {
            int[] iArr2 = this.zzg;
            iArr[iZzo] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.zzg[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(this.zza[i10])));
            }
            if (i12 == i10) {
                int[] iArr3 = this.zzg;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.zzg[i12];
        }
    }

    private final void zzq(int i10, int i11) {
        zzqh.zzd(i10 != -1);
        int iZzo = zzo(i11);
        int[] iArr = this.zzf;
        int i12 = iArr[iZzo];
        if (i12 == i10) {
            int[] iArr2 = this.zzh;
            iArr[iZzo] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.zzh[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(this.zzb[i10])));
            }
            if (i12 == i10) {
                int[] iArr3 = this.zzh;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.zzh[i12];
        }
    }

    private final void zzs(int i10, int i11) {
        zzqh.zzd(i10 != -1);
        int iZzo = zzo(i11);
        int[] iArr = this.zzg;
        int[] iArr2 = this.zze;
        iArr[i10] = iArr2[iZzo];
        iArr2[iZzo] = i10;
    }

    private final void zzt(int i10, int i11) {
        zzqh.zzd(i10 != -1);
        int iZzo = zzo(i11);
        int[] iArr = this.zzh;
        int[] iArr2 = this.zzf;
        iArr[i10] = iArr2[iZzo];
        iArr2[iZzo] = i10;
    }

    private final void zzu(int i10, int i11, int i12) {
        int i13;
        int i14;
        zzqh.zzd(i10 != -1);
        zzp(i10, i11);
        zzq(i10, i12);
        zzx(this.zzk[i10], this.zzl[i10]);
        int i15 = this.zzc - 1;
        if (i15 != i10) {
            int i16 = this.zzk[i15];
            int i17 = this.zzl[i15];
            zzx(i16, i10);
            zzx(i10, i17);
            Object[] objArr = this.zza;
            Object obj = objArr[i15];
            Object[] objArr2 = this.zzb;
            Object obj2 = objArr2[i15];
            objArr[i10] = obj;
            objArr2[i10] = obj2;
            int iZzo = zzo(zzrg.zzc(obj));
            int[] iArr = this.zze;
            int i18 = iArr[iZzo];
            if (i18 == i15) {
                iArr[iZzo] = i10;
            } else {
                int i19 = this.zzg[i18];
                while (true) {
                    i13 = i18;
                    i18 = i19;
                    if (i18 == i15) {
                        break;
                    } else {
                        i19 = this.zzg[i18];
                    }
                }
                this.zzg[i13] = i10;
            }
            int[] iArr2 = this.zzg;
            iArr2[i10] = iArr2[i15];
            iArr2[i15] = -1;
            int iZzo2 = zzo(zzrg.zzc(obj2));
            int[] iArr3 = this.zzf;
            int i20 = iArr3[iZzo2];
            if (i20 == i15) {
                iArr3[iZzo2] = i10;
            } else {
                int i21 = this.zzh[i20];
                while (true) {
                    i14 = i20;
                    i20 = i21;
                    if (i20 == i15) {
                        break;
                    } else {
                        i21 = this.zzh[i20];
                    }
                }
                this.zzh[i14] = i10;
            }
            int[] iArr4 = this.zzh;
            iArr4[i10] = iArr4[i15];
            iArr4[i15] = -1;
        }
        Object[] objArr3 = this.zza;
        int i22 = this.zzc - 1;
        objArr3[i22] = null;
        this.zzb[i22] = null;
        this.zzc = i22;
        this.zzd++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(int i10, Object obj, boolean z10) {
        zzqh.zzd(i10 != -1);
        int iZzc = zzc(obj, zzrg.zzc(obj));
        int i11 = this.zzj;
        if (iZzc != -1) {
            throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(obj)));
        }
        if (i11 == i10) {
            i11 = this.zzk[i10];
        } else if (i11 == this.zzc) {
            i11 = iZzc;
        }
        if (i10 == -2) {
            iZzc = this.zzl[-2];
        } else if (this.zzc != -2) {
            iZzc = -2;
        }
        zzx(this.zzk[i10], this.zzl[i10]);
        zzp(i10, zzrg.zzc(this.zza[i10]));
        this.zza[i10] = obj;
        zzs(i10, zzrg.zzc(obj));
        zzx(i11, i10);
        zzx(i10, iZzc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(int i10, Object obj, boolean z10) {
        zzqh.zzd(i10 != -1);
        int iZzc = zzrg.zzc(obj);
        if (zzd(obj, iZzc) != -1) {
            throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(obj)));
        }
        zzq(i10, zzrg.zzc(this.zzb[i10]));
        this.zzb[i10] = obj;
        zzt(i10, iZzc);
    }

    private final void zzx(int i10, int i11) {
        if (i10 == -2) {
            this.zzi = i11;
        } else {
            this.zzl[i10] = i11;
        }
        if (i11 == -2) {
            this.zzj = i10;
        } else {
            this.zzk[i11] = i10;
        }
    }

    private static int[] zzz(int[] iArr, int i10) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        Arrays.fill(iArrCopyOf, length, i10, -1);
        return iArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zzg(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc;
    }

    public static zzrf zzf(int i10) {
        return new zzrf(2);
    }

    private final int zzo(int i10) {
        return i10 & (this.zze.length - 1);
    }

    private final void zzr(int i10) {
        int length = this.zzg.length;
        if (length < i10) {
            int iZza = zzrh.zza(length, i10);
            this.zza = Arrays.copyOf(this.zza, iZza);
            this.zzb = Arrays.copyOf(this.zzb, iZza);
            this.zzg = zzz(this.zzg, iZza);
            this.zzh = zzz(this.zzh, iZza);
            this.zzk = zzz(this.zzk, iZza);
            this.zzl = zzz(this.zzl, iZza);
        }
        if (this.zze.length < i10) {
            int iZza2 = zzrg.zza(i10, 1.0d);
            this.zze = zzy(iZza2);
            this.zzf = zzy(iZza2);
            for (int i11 = 0; i11 < this.zzc; i11++) {
                int iZzo = zzo(zzrg.zzc(this.zza[i11]));
                int[] iArr = this.zzg;
                int[] iArr2 = this.zze;
                iArr[i11] = iArr2[iZzo];
                iArr2[iZzo] = i11;
                int iZzo2 = zzo(zzrg.zzc(this.zzb[i11]));
                int[] iArr3 = this.zzh;
                int[] iArr4 = this.zzf;
                iArr3[i11] = iArr4[iZzo2];
                iArr4[iZzo2] = i11;
            }
        }
    }

    private static int[] zzy(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.zza, 0, this.zzc, (Object) null);
        Arrays.fill(this.zzb, 0, this.zzc, (Object) null);
        Arrays.fill(this.zze, -1);
        Arrays.fill(this.zzf, -1);
        Arrays.fill(this.zzg, 0, this.zzc, -1);
        Arrays.fill(this.zzh, 0, this.zzc, -1);
        Arrays.fill(this.zzk, 0, this.zzc, -1);
        Arrays.fill(this.zzl, 0, this.zzc, -1);
        this.zzc = 0;
        this.zzi = -2;
        this.zzj = -2;
        this.zzd++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzo;
        if (set != null) {
            return set;
        }
        zzqy zzqyVar = new zzqy(this);
        this.zzo = zzqyVar;
        return zzqyVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzm;
        if (set != null) {
            return set;
        }
        zzrb zzrbVar = new zzrb(this);
        this.zzm = zzrbVar;
        return zzrbVar;
    }

    final int zzc(Object obj, int i10) {
        return zzb(obj, i10, this.zze, this.zzg, this.zza);
    }

    final int zzd(Object obj, int i10) {
        return zzb(obj, i10, this.zzf, this.zzh, this.zzb);
    }

    public final zzqs zze() {
        zzqs zzqsVar = this.zzp;
        if (zzqsVar != null) {
            return zzqsVar;
        }
        zzqz zzqzVar = new zzqz(this);
        this.zzp = zzqzVar;
        return zzqzVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.zzn;
        if (set != null) {
            return set;
        }
        zzrc zzrcVar = new zzrc(this);
        this.zzn = zzrcVar;
        return zzrcVar;
    }

    final void zzl(int i10, int i11) {
        zzu(i10, i11, zzrg.zzc(this.zzb[i10]));
    }

    final void zzm(int i10, int i11) {
        zzu(i10, zzrg.zzc(this.zza[i10]), i11);
    }

    private zzrf(int i10) {
        int iZza = zzrg.zza(2, 1.0d);
        this.zzc = 0;
        this.zza = new Object[2];
        this.zzb = new Object[2];
        this.zze = zzy(iZza);
        this.zzf = zzy(iZza);
        this.zzg = zzy(2);
        this.zzh = zzy(2);
        this.zzi = -2;
        this.zzj = -2;
        this.zzk = zzy(2);
        this.zzl = zzy(2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (zzc(obj, zzrg.zzc(obj)) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (zzd(obj, zzrg.zzc(obj)) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iZzc = zzc(obj, zzrg.zzc(obj));
        if (iZzc == -1) {
            return null;
        }
        return this.zzb[iZzc];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iZzc = zzrg.zzc(obj);
        int iZzc2 = zzc(obj, iZzc);
        if (iZzc2 == -1) {
            return null;
        }
        Object obj2 = this.zzb[iZzc2];
        zzl(iZzc2, iZzc);
        return obj2;
    }

    final int zzb(Object obj, int i10, int[] iArr, int[] iArr2, Object[] objArr) {
        int i11 = iArr[zzo(i10)];
        while (i11 != -1) {
            if (zzqe.zza(objArr[i11], obj)) {
                return i11;
            }
            i11 = iArr2[i11];
        }
        return -1;
    }

    final Object zzg(Object obj, Object obj2, boolean z10) {
        int iZzc = zzrg.zzc(obj);
        int iZzc2 = zzc(obj, iZzc);
        boolean z11 = false;
        if (iZzc2 != -1) {
            Object obj3 = this.zzb[iZzc2];
            if (zzqe.zza(obj3, obj2)) {
                return obj2;
            }
            zzw(iZzc2, obj2, false);
            return obj3;
        }
        int iZzc3 = zzrg.zzc(obj2);
        if (zzd(obj2, iZzc3) == -1) {
            z11 = true;
        }
        zzqh.zzg(z11, "Value already present: %s", obj2);
        zzr(this.zzc + 1);
        Object[] objArr = this.zza;
        int i10 = this.zzc;
        objArr[i10] = obj;
        this.zzb[i10] = obj2;
        zzs(i10, iZzc);
        zzt(this.zzc, iZzc3);
        zzx(this.zzj, this.zzc);
        zzx(this.zzc, -2);
        this.zzc++;
        this.zzd++;
        return null;
    }

    final Object zzh(Object obj, Object obj2, boolean z10) {
        int i10;
        int iZzc = zzrg.zzc(obj);
        int iZzd = zzd(obj, iZzc);
        boolean z11 = false;
        if (iZzd != -1) {
            Object obj3 = this.zza[iZzd];
            if (zzqe.zza(obj3, obj2)) {
                return obj2;
            }
            zzv(iZzd, obj2, false);
            return obj3;
        }
        int i11 = this.zzj;
        int iZzc2 = zzrg.zzc(obj2);
        if (zzc(obj2, iZzc2) == -1) {
            z11 = true;
        }
        zzqh.zzg(z11, "Key already present: %s", obj2);
        zzr(this.zzc + 1);
        Object[] objArr = this.zza;
        int i12 = this.zzc;
        objArr[i12] = obj2;
        this.zzb[i12] = obj;
        zzs(i12, iZzc2);
        zzt(this.zzc, iZzc);
        if (i11 == -2) {
            i10 = this.zzi;
        } else {
            i10 = this.zzl[i11];
        }
        zzx(i11, this.zzc);
        zzx(this.zzc, i10);
        this.zzc++;
        this.zzd++;
        return null;
    }
}
