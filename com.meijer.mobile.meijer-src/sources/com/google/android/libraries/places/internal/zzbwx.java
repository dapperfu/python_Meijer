package com.google.android.libraries.places.internal;

import De.p;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes6.dex */
final class zzbwx implements zzcbx {
    private final zzbvw zzc;
    private final zzbwy zzd;
    private zzcbx zzh;
    private Socket zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private final Object zza = new Object();
    private final zzcbj zzb = new zzcbj();
    private boolean zze = false;
    private boolean zzf = false;
    private boolean zzg = false;

    final /* synthetic */ Object zzd() {
        return this.zza;
    }

    final /* synthetic */ zzcbj zze() {
        return this.zzb;
    }

    final /* synthetic */ zzbwy zzf() {
        return this.zzd;
    }

    final /* synthetic */ void zzg(boolean z10) {
        this.zze = false;
    }

    final /* synthetic */ void zzh(boolean z10) {
        this.zzf = false;
    }

    final /* synthetic */ zzcbx zzi() {
        return this.zzh;
    }

    final /* synthetic */ Socket zzj() {
        return this.zzi;
    }

    final /* synthetic */ int zzk() {
        return this.zzk;
    }

    final /* synthetic */ void zzl(int i10) {
        this.zzk = i10;
    }

    final /* synthetic */ int zzm() {
        return this.zzl;
    }

    final /* synthetic */ void zzn(int i10) {
        this.zzl = i10;
    }

    static zzbwx zza(zzbvw zzbvwVar, zzbwy zzbwyVar, int i10) {
        return new zzbwx(zzbvwVar, zzbwyVar, 10000);
    }

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        this.zzc.execute(new zzbwu(this));
    }

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzg) {
            throw new IOException("closed");
        }
        int i10 = zzcba.zza;
        synchronized (this.zza) {
            try {
                if (this.zzf) {
                    return;
                }
                this.zzf = true;
                this.zzc.execute(new zzbwt(this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void zzb(zzcbx zzcbxVar, Socket socket) {
        p.x(this.zzh == null, "AsyncSink's becomeConnected should only be called once.");
        this.zzh = (zzcbx) p.r(zzcbxVar, "sink");
        this.zzi = (Socket) p.r(socket, "socket");
    }

    @Override // com.google.android.libraries.places.internal.zzcbx
    public final void zzc(zzcbj zzcbjVar, long j10) throws IOException {
        p.r(zzcbjVar, "source");
        if (this.zzg) {
            throw new IOException("closed");
        }
        int i10 = zzcba.zza;
        synchronized (this.zza) {
            try {
                zzcbj zzcbjVar2 = this.zzb;
                zzcbjVar2.zzc(zzcbjVar, j10);
                int i11 = this.zzl + this.zzk;
                this.zzl = i11;
                boolean z10 = false;
                this.zzk = 0;
                if (this.zzj || i11 <= 10000) {
                    if (!this.zze && !this.zzf && zzcbjVar2.zzi() > 0) {
                        this.zze = true;
                    }
                    return;
                }
                this.zzj = true;
                z10 = true;
                if (!z10) {
                    this.zzc.execute(new zzbws(this));
                    return;
                }
                try {
                    this.zzi.close();
                } catch (IOException e10) {
                    this.zzd.zzg(e10);
                }
            } finally {
            }
        }
    }

    private zzbwx(zzbvw zzbvwVar, zzbwy zzbwyVar, int i10) {
        this.zzc = (zzbvw) p.r(zzbvwVar, "executor");
        this.zzd = (zzbwy) p.r(zzbwyVar, "exceptionHandler");
    }
}
