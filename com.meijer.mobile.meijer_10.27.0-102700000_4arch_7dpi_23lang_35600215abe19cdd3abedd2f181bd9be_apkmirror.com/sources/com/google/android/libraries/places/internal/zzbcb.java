package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class zzbcb {
    public static final /* synthetic */ int zza = 0;
    private static final zzbcm zzb;

    public static zzbcm zzA() {
        return zzb;
    }

    static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static {
        int i10 = zzbbv.zza;
        zzb = new zzbco();
    }

    static void zzC(zzazq zzazqVar, Object obj, Object obj2) {
        zzazu zzazuVar = ((zzbab) obj2).zzb;
        if (zzazuVar.zza.isEmpty()) {
            return;
        }
        zzazqVar.zza(obj).zzi(zzazuVar);
    }

    static void zzD(zzbcm zzbcmVar, Object obj, Object obj2) {
        zzbae zzbaeVar = (zzbae) obj;
        zzbcn zzbcnVarZzc = zzbaeVar.zzc;
        zzbcn zzbcnVar = ((zzbae) obj2).zzc;
        if (!zzbcn.zza().equals(zzbcnVar)) {
            if (zzbcn.zza().equals(zzbcnVarZzc)) {
                zzbcnVarZzc = zzbcn.zzc(zzbcnVarZzc, zzbcnVar);
            } else {
                zzbcnVarZzc.zzl(zzbcnVar);
            }
        }
        zzbaeVar.zzc = zzbcnVarZzc;
    }

    static Object zzE(Object obj, int i10, List list, zzbak zzbakVar, Object obj2, zzbcm zzbcmVar) {
        if (zzbakVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzbakVar.zza(iIntValue)) {
                    obj2 = zzF(obj, i10, iIntValue, obj2, zzbcmVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (zzbakVar.zza(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = zzF(obj, i10, iIntValue2, obj2, zzbcmVar);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    static Object zzF(Object obj, int i10, int i11, Object obj2, zzbcm zzbcmVar) {
        if (obj2 == null) {
            obj2 = zzbcmVar.zzh(obj);
        }
        zzbcmVar.zza(obj2, i10, i11);
        return obj2;
    }

    public static void zza(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzC(i10, list, z10);
    }

    public static void zzb(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzB(i10, list, z10);
    }

    public static void zzc(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzy(i10, list, z10);
    }

    public static void zzd(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzz(i10, list, z10);
    }

    public static void zze(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzL(i10, list, z10);
    }

    public static void zzf(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzA(i10, list, z10);
    }

    public static void zzg(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzJ(i10, list, z10);
    }

    public static void zzh(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzw(i10, list, z10);
    }

    public static void zzi(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzH(i10, list, z10);
    }

    public static void zzj(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzK(i10, list, z10);
    }

    public static void zzk(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzx(i10, list, z10);
    }

    public static void zzl(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzI(i10, list, z10);
    }

    public static void zzm(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzD(i10, list, z10);
    }

    public static void zzn(int i10, List list, zzbcz zzbczVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbczVar.zzE(i10, list, z10);
    }

    static int zzz(int i10, Object obj, zzbbz zzbbzVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzbaw)) {
            return zzazi.zzz(i11) + zzazi.zzD((zzbbl) obj, zzbbzVar);
        }
        int iZzz = zzazi.zzz(i11);
        int iZzb = ((zzbaw) obj).zzb();
        return iZzz + zzazi.zzz(iZzb) + iZzb;
    }

    static int zzo(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbba) {
            zzbba zzbbaVar = (zzbba) list;
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzazi.zzA(zzbbaVar.zze(i10));
                i10++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzazi.zzA(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iZzA2;
    }

    static int zzp(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbba) {
            zzbba zzbbaVar = (zzbba) list;
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzazi.zzA(zzbbaVar.zze(i10));
                i10++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzazi.zzA(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iZzA2;
    }

    static int zzq(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbba) {
            zzbba zzbbaVar = (zzbba) list;
            int iZzA = 0;
            while (i10 < size) {
                long jZze = zzbbaVar.zze(i10);
                iZzA += zzazi.zzA((jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i10 < size) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iZzA2 += zzazi.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i10++;
        }
        return iZzA2;
    }

    static int zzr(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbaf) {
            zzbaf zzbafVar = (zzbaf) list;
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzazi.zzA(zzbafVar.zzf(i10));
                i10++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzazi.zzA(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iZzA2;
    }

    static int zzs(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbaf) {
            zzbaf zzbafVar = (zzbaf) list;
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzazi.zzA(zzbafVar.zzf(i10));
                i10++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzazi.zzA(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iZzA2;
    }

    static int zzt(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbaf) {
            zzbaf zzbafVar = (zzbaf) list;
            int iZzz = 0;
            while (i10 < size) {
                iZzz += zzazi.zzz(zzbafVar.zzf(i10));
                i10++;
            }
            return iZzz;
        }
        int iZzz2 = 0;
        while (i10 < size) {
            iZzz2 += zzazi.zzz(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iZzz2;
    }

    static int zzu(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbaf) {
            zzbaf zzbafVar = (zzbaf) list;
            int iZzz = 0;
            while (i10 < size) {
                int iZzf = zzbafVar.zzf(i10);
                iZzz += zzazi.zzz((iZzf >> 31) ^ (iZzf + iZzf));
                i10++;
            }
            return iZzz;
        }
        int iZzz2 = 0;
        while (i10 < size) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iZzz2 += zzazi.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i10++;
        }
        return iZzz2;
    }

    static int zzv(List list) {
        return list.size() * 4;
    }

    static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzazi.zzz(i10 << 3) + 4);
    }

    static int zzx(List list) {
        return list.size() * 8;
    }

    static int zzy(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzazi.zzz(i10 << 3) + 8);
    }
}
