package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzhw implements Runnable {
    final /* synthetic */ zzhx zza;

    zzhw(zzhx zzhxVar) {
        this.zza = zzhxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzn) {
            if (this.zza.zzo) {
                return;
            }
            this.zza.zzo = true;
            try {
                zzhx.zzj(this.zza);
            } catch (Exception e10) {
                this.zza.zzh.zzc(2023, -1L, e10);
            }
            synchronized (this.zza.zzn) {
                this.zza.zzo = false;
            }
        }
    }
}
