package com.google.ads.interactivemedia.v3.internal;

import android.os.RemoteException;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public final class zzpi {
    final /* synthetic */ zzpj zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzpi(zzpj zzpjVar, byte[] bArr, zzph zzphVar) {
        this.zza = zzpjVar;
        this.zzb = bArr;
    }

    public final zzpi zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzpi zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzpj zzpjVar = this.zza;
            if (zzpjVar.zzb) {
                zzpjVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e10) {
            FS.log_d("GASS", "Clearcut log failed", e10);
        }
    }
}
