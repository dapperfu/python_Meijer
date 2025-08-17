package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class zzbye {
    final /* synthetic */ zzbyh zza;
    private final zzcbj zzb;
    private final int zzc;
    private int zzd;
    private int zze;
    private final zzbyd zzf;
    private boolean zzg;

    final int zza() {
        return this.zzd;
    }

    final void zzb(int i10) {
        this.zze += i10;
    }

    final int zzc() {
        return this.zze;
    }

    final void zze() {
        this.zze = 0;
    }

    final boolean zzh() {
        return this.zzb.zzb() > 0;
    }

    final void zzk(zzcbj zzcbjVar, int i10, boolean z10) {
        this.zzb.zzc(zzcbjVar, i10);
        this.zzg |= z10;
    }

    final int zzd() {
        return Math.max(0, Math.min(this.zzd, (int) this.zzb.zzb())) - this.zze;
    }

    final int zzf(int i10) {
        if (i10 <= 0 || a.e.API_PRIORITY_OTHER - i10 >= this.zzd) {
            int i11 = this.zzd + i10;
            this.zzd = i11;
            return i11;
        }
        int i12 = this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 33);
        sb2.append("Window size overflow for stream: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }

    final int zzg() {
        return Math.min(this.zzd, this.zza.zzh().zzd);
    }

    final void zzj(zzcbj zzcbjVar, int i10, boolean z10) {
        do {
            zzbyh zzbyhVar = this.zza;
            int iMin = Math.min(i10, zzbyhVar.zzg().zzg());
            int i11 = -iMin;
            zzbyhVar.zzh().zzf(i11);
            zzf(i11);
            try {
                boolean z11 = false;
                if (zzcbjVar.zzb() == iMin && z10) {
                    z11 = true;
                }
                zzbyhVar.zzg().zzh(z11, this.zzc, zzcbjVar, iMin);
                this.zzf.zzt(iMin);
                i10 -= iMin;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } while (i10 > 0);
    }

    zzbye(zzbyh zzbyhVar, int i10, int i11, zzbyd zzbydVar) {
        Objects.requireNonNull(zzbyhVar);
        this.zza = zzbyhVar;
        this.zzb = new zzcbj();
        this.zzg = false;
        this.zzc = i10;
        this.zzd = i11;
        this.zzf = zzbydVar;
    }

    final int zzi(int i10, zzbyg zzbygVar) {
        int iMin = Math.min(i10, zzg());
        int iZzb = 0;
        while (zzh() && iMin > 0) {
            zzcbj zzcbjVar = this.zzb;
            if (iMin >= zzcbjVar.zzb()) {
                iZzb += (int) zzcbjVar.zzb();
                zzj(zzcbjVar, (int) zzcbjVar.zzb(), this.zzg);
            } else {
                iZzb += iMin;
                zzj(zzcbjVar, iMin, false);
            }
            zzbygVar.zza++;
            iMin = Math.min(i10 - iZzb, zzg());
        }
        return iZzb;
    }
}
