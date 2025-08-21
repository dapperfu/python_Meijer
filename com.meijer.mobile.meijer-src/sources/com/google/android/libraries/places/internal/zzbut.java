package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbut extends zzbfp {
    long zzb;
    final /* synthetic */ zzbvl zzc;
    private final zzbvj zzd;

    @Override // com.google.android.libraries.places.internal.zzbjz
    public final void zza(long j10) {
        zzbvl zzbvlVar = this.zzc;
        if (zzbvlVar.zzQ().zzf != null) {
            return;
        }
        synchronized (zzbvlVar.zzK()) {
            try {
                if (zzbvlVar.zzQ().zzf == null) {
                    zzbvj zzbvjVar = this.zzd;
                    if (!zzbvjVar.zzb) {
                        long j11 = this.zzb + j10;
                        this.zzb = j11;
                        if (j11 <= zzbvlVar.zzW()) {
                            return;
                        }
                        if (j11 > zzbvlVar.zzM()) {
                            zzbvjVar.zzc = true;
                        } else {
                            long jZza = zzbvlVar.zzL().zza(j11 - zzbvlVar.zzW());
                            zzbvlVar.zzX(this.zzb);
                            if (jZza > zzbvlVar.zzN()) {
                                zzbvjVar.zzc = true;
                            }
                        }
                        Runnable runnableZzo = zzbvjVar.zzc ? zzbvlVar.zzo(zzbvjVar) : null;
                        if (runnableZzo != null) {
                            runnableZzo.run();
                        }
                    }
                }
            } finally {
            }
        }
    }

    zzbut(zzbvl zzbvlVar, zzbvj zzbvjVar) {
        Objects.requireNonNull(zzbvlVar);
        this.zzc = zzbvlVar;
        this.zzd = zzbvjVar;
    }
}
