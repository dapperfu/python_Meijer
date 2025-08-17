package com.google.android.libraries.places.internal;

import Be.p;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbwz implements zzbzc {
    private static final Logger zza = Logger.getLogger(zzbxt.class.getName());
    private final zzbwy zzb;
    private final zzbzc zzc;
    private final zzbxw zzd = new zzbxw(Level.FINE, zzbxt.class);

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzc(boolean z10, int i10, int i11) {
        long j10 = (i10 << 32) | (i11 & 4294967295L);
        if (z10) {
            this.zzd.zzg(2, j10);
        } else {
            this.zzd.zzf(2, j10);
        }
        try {
            this.zzc.zzc(z10, i10, i11);
        } catch (IOException e10) {
            this.zzb.zzg(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (IOException e10) {
            zza.logp(e10.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zza(zzbzo zzbzoVar) {
        this.zzd.zzd(2);
        try {
            this.zzc.zza(zzbzoVar);
        } catch (IOException e10) {
            this.zzb.zzg(e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzb(int i10, zzbyz zzbyzVar) {
        this.zzd.zzc(2, i10, zzbyzVar);
        try {
            this.zzc.zzb(i10, zzbyzVar);
        } catch (IOException e10) {
            this.zzb.zzg(e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzd() {
        try {
            this.zzc.zzd();
        } catch (IOException e10) {
            this.zzb.zzg(e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zze() {
        try {
            this.zzc.zze();
        } catch (IOException e10) {
            this.zzb.zzg(e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzf(boolean z10, boolean z11, int i10, int i11, List list) {
        try {
            this.zzc.zzf(false, false, i10, 0, list);
        } catch (IOException e10) {
            this.zzb.zzg(e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final int zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzh(boolean z10, int i10, zzcbj zzcbjVar, int i11) {
        this.zzd.zza(2, i10, zzcbjVar, i11, z10);
        try {
            this.zzc.zzh(z10, i10, zzcbjVar, i11);
        } catch (IOException e10) {
            this.zzb.zzg(e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzi(zzbzo zzbzoVar) {
        this.zzd.zze(2, zzbzoVar);
        try {
            this.zzc.zzi(zzbzoVar);
        } catch (IOException e10) {
            this.zzb.zzg(e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzj(int i10, zzbyz zzbyzVar, byte[] bArr) {
        zzcbn zzcbnVar = zzcbn.zza;
        this.zzd.zzi(2, 0, zzbyzVar, zzcbm.zzb(bArr));
        try {
            zzbzc zzbzcVar = this.zzc;
            zzbzcVar.zzj(0, zzbyzVar, bArr);
            zzbzcVar.zze();
        } catch (IOException e10) {
            this.zzb.zzg(e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzk(int i10, long j10) {
        this.zzd.zzj(2, i10, j10);
        try {
            this.zzc.zzk(i10, j10);
        } catch (IOException e10) {
            this.zzb.zzg(e10);
        }
    }

    zzbwz(zzbwy zzbwyVar, zzbzc zzbzcVar) {
        this.zzb = (zzbwy) p.r(zzbwyVar, "transportExceptionHandler");
        this.zzc = (zzbzc) p.r(zzbzcVar, "frameWriter");
    }
}
