package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
final class zzazj implements zzbcz {
    private final zzazi zza;

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzG(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzl(i10, (zzayz) list.get(i11));
        }
    }

    public static zzazj zza(zzazi zzaziVar) {
        zzazj zzazjVar = zzaziVar.zze;
        return zzazjVar != null ? zzazjVar : new zzazj(zzaziVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbba)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzi(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzaziVar.zzr(i12);
            while (i11 < list.size()) {
                zzaziVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzbba zzbbaVar = (zzbba) list;
        if (!z10) {
            while (i11 < zzbbaVar.size()) {
                this.zza.zzi(i10, zzbbaVar.zze(i11));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzbbaVar.size(); i15++) {
            zzbbaVar.zze(i15);
            i14 += 8;
        }
        zzaziVar2.zzr(i14);
        while (i11 < zzbbaVar.size()) {
            zzaziVar2.zzu(zzbbaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzazw)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzN(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            zzaziVar.zzr(i12);
            while (i11 < list.size()) {
                zzaziVar.zzs(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzazw zzazwVar = (zzazw) list;
        if (!z10) {
            while (i11 < zzazwVar.size()) {
                this.zza.zzN(i10, Float.floatToRawIntBits(zzazwVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzazwVar.size(); i15++) {
            zzazwVar.zze(i15);
            i14 += 4;
        }
        zzaziVar2.zzr(i14);
        while (i11 < zzazwVar.size()) {
            zzaziVar2.zzs(Float.floatToRawIntBits(zzazwVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzazk)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzi(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            zzaziVar.zzr(i12);
            while (i11 < list.size()) {
                zzaziVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzazk zzazkVar = (zzazk) list;
        if (!z10) {
            while (i11 < zzazkVar.size()) {
                this.zza.zzi(i10, Double.doubleToRawLongBits(zzazkVar.zze(i11)));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzazkVar.size(); i15++) {
            zzazkVar.zze(i15);
            i14 += 8;
        }
        zzaziVar2.zzr(i14);
        while (i11 < zzazkVar.size()) {
            zzaziVar2.zzu(Double.doubleToRawLongBits(zzazkVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzL(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzazi.zzA(((Integer) list.get(i12)).intValue());
            }
            zzaziVar.zzr(iZzA);
            while (i11 < list.size()) {
                zzaziVar.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z10) {
            while (i11 < zzbafVar.size()) {
                this.zza.zzL(i10, zzbafVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzbafVar.size(); i13++) {
            iZzA2 += zzazi.zzA(zzbafVar.zzf(i13));
        }
        zzaziVar2.zzr(iZzA2);
        while (i11 < zzbafVar.size()) {
            zzaziVar2.zzq(zzbafVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzayr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            zzaziVar.zzr(i12);
            while (i11 < list.size()) {
                zzaziVar.zzp(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzayr zzayrVar = (zzayr) list;
        if (!z10) {
            while (i11 < zzayrVar.size()) {
                this.zza.zzj(i10, zzayrVar.zze(i11));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzayrVar.size(); i15++) {
            zzayrVar.zze(i15);
            i14++;
        }
        zzaziVar2.zzr(i14);
        while (i11 < zzayrVar.size()) {
            zzaziVar2.zzp(zzayrVar.zze(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzF(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbax)) {
            while (i11 < list.size()) {
                this.zza.zzk(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzbax zzbaxVar = (zzbax) list;
        while (i11 < list.size()) {
            Object objZzc = zzbaxVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzk(i10, (String) objZzc);
            } else {
                this.zza.zzl(i10, (zzayz) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzH(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzM(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzazi.zzz(((Integer) list.get(i12)).intValue());
            }
            zzaziVar.zzr(iZzz);
            while (i11 < list.size()) {
                zzaziVar.zzr(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z10) {
            while (i11 < zzbafVar.size()) {
                this.zza.zzM(i10, zzbafVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzbafVar.size(); i13++) {
            iZzz2 += zzazi.zzz(zzbafVar.zzf(i13));
        }
        zzaziVar2.zzr(iZzz2);
        while (i11 < zzbafVar.size()) {
            zzaziVar2.zzr(zzbafVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzN(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzaziVar.zzr(i12);
            while (i11 < list.size()) {
                zzaziVar.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z10) {
            while (i11 < zzbafVar.size()) {
                this.zza.zzN(i10, zzbafVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzbafVar.size(); i15++) {
            zzbafVar.zzf(i15);
            i14 += 4;
        }
        zzaziVar2.zzr(i14);
        while (i11 < zzbafVar.size()) {
            zzaziVar2.zzs(zzbafVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbba)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzi(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            zzaziVar.zzr(i12);
            while (i11 < list.size()) {
                zzaziVar.zzu(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzbba zzbbaVar = (zzbba) list;
        if (!z10) {
            while (i11 < zzbbaVar.size()) {
                this.zza.zzi(i10, zzbbaVar.zze(i11));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzbbaVar.size(); i15++) {
            zzbbaVar.zze(i15);
            i14 += 8;
        }
        zzaziVar2.zzr(i14);
        while (i11 < zzbbaVar.size()) {
            zzaziVar2.zzu(zzbbaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzazi zzaziVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzaziVar.zzM(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            zzazi zzaziVar2 = this.zza;
            zzaziVar2.zzK(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzz += zzazi.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzaziVar2.zzr(iZzz);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzaziVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z10) {
            while (i11 < zzbafVar.size()) {
                zzazi zzaziVar3 = this.zza;
                int iZzf = zzbafVar.zzf(i11);
                zzaziVar3.zzM(i10, (iZzf >> 31) ^ (iZzf + iZzf));
                i11++;
            }
            return;
        }
        zzazi zzaziVar4 = this.zza;
        zzaziVar4.zzK(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzbafVar.size(); i13++) {
            int iZzf2 = zzbafVar.zzf(i13);
            iZzz2 += zzazi.zzz((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzaziVar4.zzr(iZzz2);
        while (i11 < zzbafVar.size()) {
            int iZzf3 = zzbafVar.zzf(i11);
            zzaziVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbba)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzazi zzaziVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzaziVar.zzO(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            zzazi zzaziVar2 = this.zza;
            zzaziVar2.zzK(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzA += zzazi.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzaziVar2.zzr(iZzA);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzaziVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzbba zzbbaVar = (zzbba) list;
        if (!z10) {
            while (i11 < zzbbaVar.size()) {
                zzazi zzaziVar3 = this.zza;
                long jZze = zzbbaVar.zze(i11);
                zzaziVar3.zzO(i10, (jZze >> 63) ^ (jZze + jZze));
                i11++;
            }
            return;
        }
        zzazi zzaziVar4 = this.zza;
        zzaziVar4.zzK(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzbbaVar.size(); i13++) {
            long jZze2 = zzbbaVar.zze(i13);
            iZzA2 += zzazi.zzA((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        zzaziVar4.zzr(iZzA2);
        while (i11 < zzbbaVar.size()) {
            long jZze3 = zzbbaVar.zze(i11);
            zzaziVar4.zzt((jZze3 >> 63) ^ (jZze3 + jZze3));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzb(int i10, int i11) throws IOException {
        this.zza.zzN(i10, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzc(int i10, long j10) throws IOException {
        this.zza.zzO(i10, j10);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzd(int i10, long j10) throws IOException {
        this.zza.zzi(i10, j10);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zze(int i10, float f10) throws IOException {
        this.zza.zzN(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzi(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzg(int i10, int i11) throws IOException {
        this.zza.zzL(i10, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzh(int i10, long j10) throws IOException {
        this.zza.zzO(i10, j10);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzL(i10, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzj(int i10, long j10) throws IOException {
        this.zza.zzi(i10, j10);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzN(i10, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzl(int i10, boolean z10) throws IOException {
        this.zza.zzj(i10, z10);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzm(int i10, String str) throws IOException {
        this.zza.zzk(i10, str);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzn(int i10, zzayz zzayzVar) throws IOException {
        this.zza.zzl(i10, zzayzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzo(int i10, int i11) throws IOException {
        this.zza.zzM(i10, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzp(int i10, int i11) throws IOException {
        this.zza.zzM(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzq(int i10, long j10) throws IOException {
        this.zza.zzO(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzr(int i10, Object obj, zzbbz zzbbzVar) throws IOException {
        this.zza.zzm(i10, (zzbbl) obj, zzbbzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzs(int i10, Object obj, zzbbz zzbbzVar) throws IOException {
        zzazi zzaziVar = this.zza;
        zzaziVar.zzK(i10, 3);
        zzbbzVar.zzf((zzbbl) obj, zzaziVar.zze);
        zzaziVar.zzK(i10, 4);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    @Deprecated
    public final void zzt(int i10) throws IOException {
        this.zza.zzK(i10, 3);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    @Deprecated
    public final void zzu(int i10) throws IOException {
        this.zza.zzK(i10, 4);
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzv(int i10, Object obj) throws IOException {
        if (obj instanceof zzayz) {
            this.zza.zzo(i10, (zzayz) obj);
        } else {
            this.zza.zzn(i10, (zzbbl) obj);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzw(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzL(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzazi.zzA(((Integer) list.get(i12)).intValue());
            }
            zzaziVar.zzr(iZzA);
            while (i11 < list.size()) {
                zzaziVar.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z10) {
            while (i11 < zzbafVar.size()) {
                this.zza.zzL(i10, zzbafVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzbafVar.size(); i13++) {
            iZzA2 += zzazi.zzA(zzbafVar.zzf(i13));
        }
        zzaziVar2.zzr(iZzA2);
        while (i11 < zzbafVar.size()) {
            zzaziVar2.zzq(zzbafVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzx(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbaf)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzN(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            zzaziVar.zzr(i12);
            while (i11 < list.size()) {
                zzaziVar.zzs(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzbaf zzbafVar = (zzbaf) list;
        if (!z10) {
            while (i11 < zzbafVar.size()) {
                this.zza.zzN(i10, zzbafVar.zzf(i11));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzbafVar.size(); i15++) {
            zzbafVar.zzf(i15);
            i14 += 4;
        }
        zzaziVar2.zzr(i14);
        while (i11 < zzbafVar.size()) {
            zzaziVar2.zzs(zzbafVar.zzf(i11));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbba)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzO(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzazi.zzA(((Long) list.get(i12)).longValue());
            }
            zzaziVar.zzr(iZzA);
            while (i11 < list.size()) {
                zzaziVar.zzt(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzbba zzbbaVar = (zzbba) list;
        if (!z10) {
            while (i11 < zzbbaVar.size()) {
                this.zza.zzO(i10, zzbbaVar.zze(i11));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzbbaVar.size(); i13++) {
            iZzA2 += zzazi.zzA(zzbbaVar.zze(i13));
        }
        zzaziVar2.zzr(iZzA2);
        while (i11 < zzbbaVar.size()) {
            zzaziVar2.zzt(zzbbaVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcz
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzbba)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzO(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            zzazi zzaziVar = this.zza;
            zzaziVar.zzK(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzazi.zzA(((Long) list.get(i12)).longValue());
            }
            zzaziVar.zzr(iZzA);
            while (i11 < list.size()) {
                zzaziVar.zzt(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzbba zzbbaVar = (zzbba) list;
        if (!z10) {
            while (i11 < zzbbaVar.size()) {
                this.zza.zzO(i10, zzbbaVar.zze(i11));
                i11++;
            }
            return;
        }
        zzazi zzaziVar2 = this.zza;
        zzaziVar2.zzK(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzbbaVar.size(); i13++) {
            iZzA2 += zzazi.zzA(zzbbaVar.zze(i13));
        }
        zzaziVar2.zzr(iZzA2);
        while (i11 < zzbbaVar.size()) {
            zzaziVar2.zzt(zzbbaVar.zze(i11));
            i11++;
        }
    }

    private zzazj(zzazi zzaziVar) {
        byte[] bArr = zzbap.zzb;
        this.zza = zzaziVar;
        zzaziVar.zze = this;
    }
}
