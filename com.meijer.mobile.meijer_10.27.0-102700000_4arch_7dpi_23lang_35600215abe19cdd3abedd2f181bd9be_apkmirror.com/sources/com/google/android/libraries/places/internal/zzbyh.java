package com.google.android.libraries.places.internal;

import Be.p;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes6.dex */
final class zzbyh {
    private final zzbyf zza;
    private final zzbzc zzb;
    private int zzc = 65535;
    private final zzbye zzd = new zzbye(this, 0, 65535, null);

    final /* synthetic */ zzbzc zzg() {
        return this.zzb;
    }

    final /* synthetic */ zzbye zzh() {
        return this.zzd;
    }

    public final boolean zza(int i10) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 29);
            sb2.append("Invalid initial window size: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i11 = i10 - this.zzc;
        this.zzc = i10;
        for (zzbye zzbyeVar : this.zza.zzm()) {
            zzbyeVar.zzf(i11);
        }
        return i11 > 0;
    }

    public final int zzb(zzbye zzbyeVar, int i10) {
        if (zzbyeVar == null) {
            int iZzf = this.zzd.zzf(i10);
            zzf();
            return iZzf;
        }
        int iZzf2 = zzbyeVar.zzf(i10);
        zzbyg zzbygVar = new zzbyg(null);
        zzbyeVar.zzi(zzbyeVar.zzg(), zzbygVar);
        if (!zzbygVar.zza()) {
            return iZzf2;
        }
        zzd();
        return iZzf2;
    }

    public final void zzc(boolean z10, zzbye zzbyeVar, zzcbj zzcbjVar, boolean z11) {
        p.r(zzcbjVar, "source");
        int iZzg = zzbyeVar.zzg();
        boolean zZzh = zzbyeVar.zzh();
        int iZzb = (int) zzcbjVar.zzb();
        if (zZzh || iZzg < iZzb) {
            if (!zZzh && iZzg > 0) {
                zzbyeVar.zzj(zzcbjVar, iZzg, false);
            }
            zzbyeVar.zzk(zzcbjVar, (int) zzcbjVar.zzb(), z10);
        } else {
            zzbyeVar.zzj(zzcbjVar, iZzb, z10);
        }
        if (z11) {
            zzd();
        }
    }

    public final void zzd() {
        try {
            this.zzb.zze();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final zzbye zze(zzbyd zzbydVar, int i10) {
        return new zzbye(this, i10, this.zzc, (zzbyd) p.r(zzbydVar, "stream"));
    }

    public final void zzf() {
        int i10;
        zzbyf zzbyfVar = this.zza;
        zzbye[] zzbyeVarArrZzm = zzbyfVar.zzm();
        Collections.shuffle(Arrays.asList(zzbyeVarArrZzm));
        int length = zzbyeVarArrZzm.length;
        int iZza = this.zzd.zza();
        while (true) {
            i10 = 0;
            if (length <= 0 || iZza <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(iZza / length);
            for (int i11 = 0; i11 < length && iZza > 0; i11++) {
                zzbye zzbyeVar = zzbyeVarArrZzm[i11];
                int iMin = Math.min(iZza, Math.min(zzbyeVar.zzd(), iCeil));
                if (iMin > 0) {
                    zzbyeVar.zzb(iMin);
                    iZza -= iMin;
                }
                if (zzbyeVar.zzd() > 0) {
                    zzbyeVarArrZzm[i10] = zzbyeVar;
                    i10++;
                }
            }
            length = i10;
        }
        zzbyg zzbygVar = new zzbyg(null);
        zzbye[] zzbyeVarArrZzm2 = zzbyfVar.zzm();
        int length2 = zzbyeVarArrZzm2.length;
        while (i10 < length2) {
            zzbye zzbyeVar2 = zzbyeVarArrZzm2[i10];
            zzbyeVar2.zzi(zzbyeVar2.zzc(), zzbygVar);
            zzbyeVar2.zze();
            i10++;
        }
        if (zzbygVar.zza()) {
            zzd();
        }
    }

    public zzbyh(zzbyf zzbyfVar, zzbzc zzbzcVar) {
        this.zza = (zzbyf) p.r(zzbyfVar, "transport");
        this.zzb = (zzbzc) p.r(zzbzcVar, "frameWriter");
    }
}
