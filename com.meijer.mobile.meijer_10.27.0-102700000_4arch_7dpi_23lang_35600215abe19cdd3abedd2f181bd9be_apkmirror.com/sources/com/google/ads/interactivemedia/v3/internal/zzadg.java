package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
final class zzadg implements zzagu {
    private final zzadf zza;

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzacw) list.get(i11));
        }
    }

    public static zzadg zza(zzadf zzadfVar) {
        zzadg zzadgVar = zzadfVar.zza;
        return zzadgVar != null ? zzadgVar : new zzadg(zzadfVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z10) {
            while (i11 < zzaeqVar.size()) {
                this.zza.zzh(i10, zzaeqVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzaeqVar.size(); i15++) {
            zzaeqVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzt(i14);
        while (i11 < zzaeqVar.size()) {
            this.zza.zzi(zzaeqVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzB(int i10, int i11) throws IOException {
        this.zza.zzs(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzadf zzadfVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzadfVar.zzs(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzz += zzadf.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzz);
            while (i11 < list.size()) {
                zzadf zzadfVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzadfVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzadz zzadzVar = (zzadz) list;
        if (!z10) {
            while (i11 < zzadzVar.size()) {
                zzadf zzadfVar3 = this.zza;
                int iZze = zzadzVar.zze(i11);
                zzadfVar3.zzs(i10, (iZze >> 31) ^ (iZze + iZze));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzadzVar.size(); i13++) {
            int iZze2 = zzadzVar.zze(i13);
            iZzz2 += zzadf.zzz((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzz2);
        while (i11 < zzadzVar.size()) {
            zzadf zzadfVar4 = this.zza;
            int iZze3 = zzadzVar.zze(i11);
            zzadfVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzD(int i10, long j10) throws IOException {
        this.zza.zzu(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzadf zzadfVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzadfVar.zzu(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzA += zzadf.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                zzadf zzadfVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzadfVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z10) {
            while (i11 < zzaeqVar.size()) {
                zzadf zzadfVar3 = this.zza;
                long jZze = zzaeqVar.zze(i11);
                zzadfVar3.zzu(i10, (jZze >> 63) ^ (jZze + jZze));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzaeqVar.size(); i13++) {
            long jZze2 = zzaeqVar.zze(i13);
            iZzA2 += zzadf.zzA((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzaeqVar.size()) {
            zzadf zzadfVar4 = this.zza;
            long jZze3 = zzaeqVar.zze(i11);
            zzadfVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    @Deprecated
    public final void zzF(int i10) throws IOException {
        this.zza.zzr(i10, 3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzG(int i10, String str) throws IOException {
        this.zza.zzp(i10, str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzH(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaen)) {
            while (i11 < list.size()) {
                this.zza.zzp(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzaen zzaenVar = (zzaen) list;
        while (i11 < list.size()) {
            Object objZzb = zzaenVar.zzb();
            if (objZzb instanceof String) {
                this.zza.zzp(i10, (String) objZzb);
            } else {
                this.zza.zze(i10, (zzacw) objZzb);
            }
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzI(int i10, int i11) throws IOException {
        this.zza.zzs(i10, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzs(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzz = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzz += zzadf.zzz(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(iZzz);
            while (i11 < list.size()) {
                this.zza.zzt(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzadz zzadzVar = (zzadz) list;
        if (!z10) {
            while (i11 < zzadzVar.size()) {
                this.zza.zzs(i10, zzadzVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzz2 = 0;
        for (int i13 = 0; i13 < zzadzVar.size(); i13++) {
            iZzz2 += zzadf.zzz(zzadzVar.zze(i13));
        }
        this.zza.zzt(iZzz2);
        while (i11 < zzadzVar.size()) {
            this.zza.zzt(zzadzVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzK(int i10, long j10) throws IOException {
        this.zza.zzu(i10, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzu(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzadf.zzA(((Long) list.get(i12)).longValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z10) {
            while (i11 < zzaeqVar.size()) {
                this.zza.zzu(i10, zzaeqVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzaeqVar.size(); i13++) {
            iZzA2 += zzadf.zzA(zzaeqVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzaeqVar.size()) {
            this.zza.zzv(zzaeqVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzb(int i10, boolean z10) throws IOException {
        this.zza.zzd(i10, z10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzacn)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzacn zzacnVar = (zzacn) list;
        if (!z10) {
            while (i11 < zzacnVar.size()) {
                this.zza.zzd(i10, zzacnVar.zzf(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzacnVar.size(); i15++) {
            zzacnVar.zzf(i15);
            i14++;
        }
        this.zza.zzt(i14);
        while (i11 < zzacnVar.size()) {
            this.zza.zzb(zzacnVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzd(int i10, zzacw zzacwVar) throws IOException {
        this.zza.zze(i10, zzacwVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzf(int i10, double d10) throws IOException {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadh)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzadh zzadhVar = (zzadh) list;
        if (!z10) {
            while (i11 < zzadhVar.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(zzadhVar.zze(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzadhVar.size(); i15++) {
            zzadhVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzt(i14);
        while (i11 < zzadhVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzadhVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.zza.zzr(i10, 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzi(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzadf.zzA(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzadz zzadzVar = (zzadz) list;
        if (!z10) {
            while (i11 < zzadzVar.size()) {
                this.zza.zzj(i10, zzadzVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzadzVar.size(); i13++) {
            iZzA2 += zzadf.zzA(zzadzVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzadzVar.size()) {
            this.zza.zzk(zzadzVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzk(int i10, int i11) throws IOException {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzadz zzadzVar = (zzadz) list;
        if (!z10) {
            while (i11 < zzadzVar.size()) {
                this.zza.zzf(i10, zzadzVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzadzVar.size(); i15++) {
            zzadzVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzt(i14);
        while (i11 < zzadzVar.size()) {
            this.zza.zzg(zzadzVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzm(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z10) {
            while (i11 < zzaeqVar.size()) {
                this.zza.zzh(i10, zzaeqVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzaeqVar.size(); i15++) {
            zzaeqVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzt(i14);
        while (i11 < zzaeqVar.size()) {
            this.zza.zzi(zzaeqVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzo(int i10, float f10) throws IOException {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzadr zzadrVar = (zzadr) list;
        if (!z10) {
            while (i11 < zzadrVar.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(zzadrVar.zze(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzadrVar.size(); i15++) {
            zzadrVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzt(i14);
        while (i11 < zzadrVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzadrVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzq(int i10, Object obj, zzaft zzaftVar) throws IOException {
        zzadf zzadfVar = this.zza;
        zzadfVar.zzr(i10, 3);
        zzaftVar.zzj((zzafb) obj, zzadfVar.zza);
        zzadfVar.zzr(i10, 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzr(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzadf.zzA(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzadz zzadzVar = (zzadz) list;
        if (!z10) {
            while (i11 < zzadzVar.size()) {
                this.zza.zzj(i10, zzadzVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzadzVar.size(); i13++) {
            iZzA2 += zzadf.zzA(zzadzVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzadzVar.size()) {
            this.zza.zzk(zzadzVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzt(int i10, long j10) throws IOException {
        this.zza.zzu(i10, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzu(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int iZzA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzA += zzadf.zzA(((Long) list.get(i12)).longValue());
            }
            this.zza.zzt(iZzA);
            while (i11 < list.size()) {
                this.zza.zzv(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z10) {
            while (i11 < zzaeqVar.size()) {
                this.zza.zzu(i10, zzaeqVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int iZzA2 = 0;
        for (int i13 = 0; i13 < zzaeqVar.size(); i13++) {
            iZzA2 += zzadf.zzA(zzaeqVar.zze(i13));
        }
        this.zza.zzt(iZzA2);
        while (i11 < zzaeqVar.size()) {
            this.zza.zzv(zzaeqVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzv(int i10, Object obj, zzaft zzaftVar) throws IOException {
        this.zza.zzm(i10, (zzafb) obj, zzaftVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzw(int i10, Object obj) throws IOException {
        if (obj instanceof zzacw) {
            this.zza.zzo(i10, (zzacw) obj);
        } else {
            this.zza.zzn(i10, (zzafb) obj);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzx(int i10, int i11) throws IOException {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzadz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzr(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.zza.zzt(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzadz zzadzVar = (zzadz) list;
        if (!z10) {
            while (i11 < zzadzVar.size()) {
                this.zza.zzf(i10, zzadzVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzr(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzadzVar.size(); i15++) {
            zzadzVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzt(i14);
        while (i11 < zzadzVar.size()) {
            this.zza.zzg(zzadzVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagu
    public final void zzz(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    private zzadg(zzadf zzadfVar) {
        byte[] bArr = zzaee.zzb;
        this.zza = zzadfVar;
        zzadfVar.zza = this;
    }
}
