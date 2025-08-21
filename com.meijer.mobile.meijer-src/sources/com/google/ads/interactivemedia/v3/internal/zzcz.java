package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzcz implements zzcs {
    private static zzcz zza;
    private float zzb = 0.0f;
    private zzcn zzc;
    private zzcr zzd;

    public zzcz(zzco zzcoVar, zzcm zzcmVar) {
    }

    public static zzcz zzb() {
        if (zza == null) {
            zza = new zzcz(new zzco(), new zzcm());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcs
    public final void zzc(boolean z10) {
        if (z10) {
            zzdz.zzd().zzi();
        } else {
            zzdz.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zzc = new zzcn(new Handler(), context, new zzcl(), this);
    }

    public final void zze(float f10) {
        this.zzb = f10;
        if (this.zzd == null) {
            this.zzd = zzcr.zza();
        }
        Iterator it = this.zzd.zzb().iterator();
        while (it.hasNext()) {
            ((com.google.ads.interactivemedia.omid.library.adsession.zze) it.next()).zzh().zzl(f10);
        }
    }

    public final void zzf() {
        zzcq.zza().zze(this);
        zzcq.zza().zzf();
        zzdz.zzd().zzi();
        this.zzc.zza();
    }

    public final void zzg() {
        zzdz.zzd().zzj();
        zzcq.zza().zzg();
        this.zzc.zzb();
    }
}
