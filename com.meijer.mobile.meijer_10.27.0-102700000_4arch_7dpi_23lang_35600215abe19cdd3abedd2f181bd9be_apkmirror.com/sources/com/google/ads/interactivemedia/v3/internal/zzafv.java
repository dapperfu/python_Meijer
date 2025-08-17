package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zzafv {
    public static final /* synthetic */ int zza = 0;
    private static final zzagh zzb;

    static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static zzagh zzm() {
        return zzb;
    }

    static {
        int i10 = zzafi.zza;
        zzb = new zzagj();
    }

    public static void zzA(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzA(i10, list, z10);
    }

    public static void zzB(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzC(i10, list, z10);
    }

    public static void zzC(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzE(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzJ(i10, list, z10);
    }

    public static void zzE(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzL(i10, list, z10);
    }

    static int zzh(int i10, Object obj, zzaft zzaftVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzaem)) {
            return zzadf.zzz(i11) + zzadf.zzx((zzafb) obj, zzaftVar);
        }
        int iZzz = zzadf.zzz(i11);
        int iZza = ((zzaem) obj).zza();
        return iZzz + zzadf.zzz(iZza) + iZza;
    }

    static Object zzn(Object obj, int i10, List list, zzaeb zzaebVar, Object obj2, zzagh zzaghVar) {
        if (zzaebVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzaebVar.zza(iIntValue)) {
                    obj2 = zzo(obj, i10, iIntValue, obj2, zzaghVar);
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
            if (zzaebVar.zza(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = zzo(obj, i10, iIntValue2, obj2, zzaghVar);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    static Object zzo(Object obj, int i10, int i11, Object obj2, zzagh zzaghVar) {
        if (obj2 == null) {
            obj2 = zzaghVar.zza(obj);
        }
        zzaghVar.zzh(obj2, i10, i11);
        return obj2;
    }

    static void zzp(zzadl zzadlVar, Object obj, Object obj2) {
        if (((zzadv) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzq(zzagh zzaghVar, Object obj, Object obj2) {
        zzady zzadyVar = (zzady) obj;
        zzagi zzagiVarZze = zzadyVar.zzc;
        zzagi zzagiVar = ((zzady) obj2).zzc;
        if (!zzagi.zzc().equals(zzagiVar)) {
            if (zzagi.zzc().equals(zzagiVarZze)) {
                zzagiVarZze = zzagi.zze(zzagiVarZze, zzagiVar);
            } else {
                zzagiVarZze.zzd(zzagiVar);
            }
        }
        zzadyVar.zzc = zzagiVarZze;
    }

    public static void zzr(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzc(i10, list, z10);
    }

    public static void zzs(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzg(i10, list, z10);
    }

    public static void zzt(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzj(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzl(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzn(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzp(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzs(i10, list, z10);
    }

    public static void zzy(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzu(i10, list, z10);
    }

    public static void zzz(int i10, List list, zzagu zzaguVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaguVar.zzy(i10, list, z10);
    }

    static int zza(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzadf.zzA(zzadzVar.zze(i10));
                i10++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzadf.zzA(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iZzA2;
    }

    static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzadf.zzz(i10 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzadf.zzz(i10 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzadf.zzA(zzadzVar.zze(i10));
                i10++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzadf.zzA(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iZzA2;
    }

    static int zzg(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzadf.zzA(zzaeqVar.zze(i10));
                i10++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzadf.zzA(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iZzA2;
    }

    static int zzi(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            int iZzz = 0;
            while (i10 < size) {
                int iZze = zzadzVar.zze(i10);
                iZzz += zzadf.zzz((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
            return iZzz;
        }
        int iZzz2 = 0;
        while (i10 < size) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iZzz2 += zzadf.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i10++;
        }
        return iZzz2;
    }

    static int zzj(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            int iZzA = 0;
            while (i10 < size) {
                long jZze = zzaeqVar.zze(i10);
                iZzA += zzadf.zzA((jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i10 < size) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iZzA2 += zzadf.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i10++;
        }
        return iZzA2;
    }

    static int zzk(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            int iZzz = 0;
            while (i10 < size) {
                iZzz += zzadf.zzz(zzadzVar.zze(i10));
                i10++;
            }
            return iZzz;
        }
        int iZzz2 = 0;
        while (i10 < size) {
            iZzz2 += zzadf.zzz(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iZzz2;
    }

    static int zzl(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) list;
            int iZzA = 0;
            while (i10 < size) {
                iZzA += zzadf.zzA(zzaeqVar.zze(i10));
                i10++;
            }
            return iZzA;
        }
        int iZzA2 = 0;
        while (i10 < size) {
            iZzA2 += zzadf.zzA(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iZzA2;
    }
}
