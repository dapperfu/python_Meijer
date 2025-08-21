package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbzh implements zzcbz {
    int zza;
    byte zzb;
    int zzc;
    int zzd;
    short zze;
    private final zzcbl zzf;

    public zzbzh(zzcbl zzcblVar) {
        this.zzf = zzcblVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcbz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.libraries.places.internal.zzcbz
    public final long zza(zzcbj zzcbjVar, long j10) throws IOException {
        int i10;
        int iZzm;
        do {
            int i11 = this.zzd;
            if (i11 == 0) {
                zzcbl zzcblVar = this.zzf;
                zzcblVar.zzt(this.zze);
                this.zze = (short) 0;
                if ((this.zzb & 4) == 0) {
                    i10 = this.zzc;
                    int iZzf = zzbzl.zzf(zzcblVar);
                    this.zzd = iZzf;
                    this.zza = iZzf;
                    int iZzj = zzcblVar.zzj() & 255;
                    this.zzb = (byte) (zzcblVar.zzj() & 255);
                    Logger logger = zzbzl.zza;
                    Level level = Level.FINE;
                    byte b10 = (byte) iZzj;
                    if (logger.isLoggable(level)) {
                        zzbzl.zza.logp(level, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", zzbzi.zza(true, this.zzc, this.zza, b10, this.zzb));
                    }
                    iZzm = zzcblVar.zzm() & a.e.API_PRIORITY_OTHER;
                    this.zzc = iZzm;
                    if (b10 != 9) {
                        throw zzbzl.zzi("%s != TYPE_CONTINUATION", Byte.valueOf(b10));
                    }
                }
            } else {
                long jZza = this.zzf.zza(zzcbjVar, Math.min(j10, i11));
                if (jZza != -1) {
                    this.zzd -= (int) jZza;
                    return jZza;
                }
            }
            return -1L;
        } while (iZzm == i10);
        throw zzbzl.zzi("TYPE_CONTINUATION streamId changed", new Object[0]);
    }
}
