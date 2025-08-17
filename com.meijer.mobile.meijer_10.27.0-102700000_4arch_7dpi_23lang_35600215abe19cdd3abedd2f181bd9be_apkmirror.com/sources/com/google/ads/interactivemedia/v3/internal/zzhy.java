package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzhy implements Runnable {
    final /* synthetic */ zzhz zza;

    zzhy(zzhz zzhzVar) {
        this.zza = zzhzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.zza.zzb != null) {
            return;
        }
        synchronized (zzhz.zzc) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) zzmj.zzi.zzc()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzhz.zza = zzpj.zzb(this.zza.zze.zza, "ADSHIELD", null);
                    z10 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z10 = zBooleanValue;
            }
            this.zza.zzb = Boolean.valueOf(z10);
            zzhz.zzc.open();
        }
    }
}
