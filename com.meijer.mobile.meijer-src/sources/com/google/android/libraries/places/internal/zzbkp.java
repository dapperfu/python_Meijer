package com.google.android.libraries.places.internal;

import De.p;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class zzbkp implements zzbks, zzbsk {
    private zzbmk zzr;
    private final Object zzs = new Object();
    private final zzbwp zzt;
    private final zzbsn zzu;
    private int zzv;
    private boolean zzw;
    private boolean zzx;
    private final int zzy;

    protected abstract zzbwj zzh();

    protected final zzbwp zzu() {
        return this.zzt;
    }

    final /* synthetic */ zzbmk zzx() {
        return this.zzr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final boolean zzv() {
        boolean z10;
        synchronized (this.zzs) {
            try {
                z10 = false;
                if (this.zzw && this.zzv < this.zzy && !this.zzx) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    private final void zzc() {
        boolean zZzv;
        synchronized (this.zzs) {
            try {
                zZzv = zzv();
                if (!zZzv) {
                    Logger logger = zzbkq.zza;
                    Level level = Level.FINEST;
                    if (logger.isLoggable(level)) {
                        zzbkq.zza.logp(level, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.zzw), Integer.valueOf(this.zzv), Integer.valueOf(this.zzy), Boolean.valueOf(this.zzx)});
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zZzv) {
            zzh().zzd();
        }
    }

    final void zzl() {
        zzbsn zzbsnVar = this.zzu;
        zzbsnVar.zzf(this);
        this.zzr = zzbsnVar;
    }

    final void zzm(int i10) {
        this.zzr.zza(i10);
    }

    protected final void zzo(boolean z10) {
        if (z10) {
            this.zzr.close();
        } else {
            this.zzr.zze();
        }
    }

    protected final void zzp(zzbtu zzbtuVar) {
        try {
            this.zzr.zzd(zzbtuVar);
        } catch (Throwable th2) {
            zzE(th2);
        }
    }

    protected final void zzq(zzbgh zzbghVar) {
        this.zzr.zzb(zzbghVar);
    }

    protected final void zzs() {
        synchronized (this.zzs) {
            this.zzx = true;
        }
    }

    public final void zzt(int i10) {
        boolean z10;
        synchronized (this.zzs) {
            p.x(this.zzw, "onStreamAllocated was not called, but it seems the stream is active");
            int i11 = this.zzv;
            int i12 = this.zzy;
            int i13 = i11 - i10;
            this.zzv = i13;
            z10 = false;
            if (i11 >= i12 && i13 < i12) {
                z10 = true;
            }
        }
        if (z10) {
            zzc();
        }
    }

    final /* synthetic */ void zzw(int i10) {
        synchronized (this.zzs) {
            this.zzv += i10;
        }
    }

    protected zzbkp(int i10, zzbwg zzbwgVar, zzbwp zzbwpVar) {
        this.zzt = (zzbwp) p.r(zzbwpVar, "transportTracer");
        zzbsn zzbsnVar = new zzbsn(this, zzbfs.zza, i10, zzbwgVar, zzbwpVar);
        this.zzu = zzbsnVar;
        this.zzr = zzbsnVar;
        this.zzy = 32768;
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public final void zzn(zzbwi zzbwiVar) {
        zzh().zzb(zzbwiVar);
    }

    protected final void zzr() {
        boolean z10;
        if (zzh() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p.w(z10);
        synchronized (this.zzs) {
            p.x(!this.zzw, "Already allocated");
            this.zzw = true;
        }
        zzc();
    }
}
