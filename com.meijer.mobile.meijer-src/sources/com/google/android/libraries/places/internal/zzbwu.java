package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbwu implements Runnable {
    final /* synthetic */ zzbwx zza;

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            zzbwx zzbwxVar = this.zza;
            if (zzbwxVar.zzi() != null && zzbwxVar.zze().zzb() > 0) {
                zzbwxVar.zzi().zzc(zzbwxVar.zze(), zzbwxVar.zze().zzb());
            }
        } catch (IOException e10) {
            this.zza.zzf().zzg(e10);
        }
        try {
            zzbwx zzbwxVar2 = this.zza;
            if (zzbwxVar2.zzi() != null) {
                zzbwxVar2.zzi().close();
            }
        } catch (IOException e11) {
            this.zza.zzf().zzg(e11);
        }
        try {
            zzbwx zzbwxVar3 = this.zza;
            if (zzbwxVar3.zzj() != null) {
                zzbwxVar3.zzj().close();
            }
        } catch (IOException e12) {
            this.zza.zzf().zzg(e12);
        }
    }

    zzbwu(zzbwx zzbwxVar) {
        Objects.requireNonNull(zzbwxVar);
        this.zza = zzbwxVar;
    }
}
