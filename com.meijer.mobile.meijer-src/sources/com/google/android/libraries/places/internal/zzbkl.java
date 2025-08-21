package com.google.android.libraries.places.internal;

import De.p;
import java.util.logging.Level;

/* loaded from: classes6.dex */
public abstract class zzbkl extends zzbkp {
    private final zzbwg zza;
    private boolean zzb;
    private zzblt zzc;
    private zzbgj zzd;
    private boolean zze;
    private Runnable zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private boolean zzi;

    protected final boolean zzc() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbkp
    protected final /* synthetic */ zzbwj zzh() {
        return this.zzc;
    }

    final /* synthetic */ void zzj() {
        this.zzg = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzk(zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        if (this.zzb) {
            return;
        }
        this.zzb = true;
        this.zza.zze(zzbjvVar);
        if (zzu() != null) {
            zzu().zzb(zzbjvVar.zzj());
        }
        this.zzc.zzc(zzbjvVar, zzblsVar, zzbipVar);
    }

    public final void zza(zzblt zzbltVar) {
        p.x(this.zzc == null, "Already called setListener");
        this.zzc = (zzblt) p.r(zzbltVar, "listener");
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public void zzb(boolean z10) {
        p.x(this.zzh, "status should have been reported on deframer closed");
        this.zze = true;
        if (this.zzi && z10) {
            zzg(zzbjv.zzh.zze("Encountered end-of-stream mid-frame"), zzbls.PROCESSED, true, new zzbip());
        }
        Runnable runnable = this.zzf;
        if (runnable != null) {
            runnable.run();
            this.zzf = null;
        }
    }

    protected final void zzd(zzbip zzbipVar) {
        p.x(!this.zzh, "Received headers on closed stream");
        this.zza.zzc(zzbipVar);
        String str = (String) zzbipVar.zzb(zzbpf.zzb);
        if (str != null) {
            zzbgh zzbghVarZzc = this.zzd.zzc(str);
            if (zzbghVarZzc == null) {
                zzE(new zzbjy(zzbjv.zzh.zze(String.format("Can't find decompressor for %s", str)), null));
                return;
            } else if (zzbghVarZzc != zzbfs.zza) {
                zzq(zzbghVarZzc);
            }
        }
        this.zzc.zza(zzbipVar);
    }

    protected final void zze(zzbtu zzbtuVar) throws Throwable {
        p.r(zzbtuVar, "frame");
        boolean z10 = true;
        try {
            if (this.zzh) {
                zzbkm.zzb.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                zzbtuVar.close();
                return;
            }
            try {
                zzp(zzbtuVar);
            } catch (Throwable th2) {
                th = th2;
                z10 = false;
                if (z10) {
                    zzbtuVar.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    protected final void zzf(zzbip zzbipVar, zzbjv zzbjvVar) {
        p.r(zzbjvVar, "status");
        p.r(zzbipVar, "trailers");
        if (!this.zzh) {
            this.zza.zzd(zzbipVar);
            zzg(zzbjvVar, zzbls.PROCESSED, false, zzbipVar);
        } else {
            int i10 = zzbkm.zza;
            zzbkm.zzb.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{zzbjvVar, zzbipVar});
        }
    }

    public final void zzg(zzbjv zzbjvVar, zzbls zzblsVar, boolean z10, zzbip zzbipVar) {
        p.r(zzbjvVar, "status");
        p.r(zzbipVar, "trailers");
        if (this.zzh) {
            if (!z10) {
                return;
            } else {
                z10 = true;
            }
        }
        this.zzh = true;
        this.zzi = zzbjvVar.zzj();
        zzs();
        if (this.zze) {
            this.zzf = null;
            zzk(zzbjvVar, zzblsVar, zzbipVar);
        } else {
            this.zzf = new zzbkk(this, zzbjvVar, zzblsVar, zzbipVar);
            zzo(z10);
        }
    }

    final /* synthetic */ void zzi(zzbgj zzbgjVar) {
        p.x(this.zzc == null, "Already called start");
        this.zzd = (zzbgj) p.r(zzbgjVar, "decompressorRegistry");
    }

    protected zzbkl(int i10, zzbwg zzbwgVar, zzbwp zzbwpVar, zzbfd zzbfdVar) {
        super(i10, zzbwgVar, zzbwpVar);
        this.zzd = zzbgj.zza();
        this.zze = false;
        this.zza = (zzbwg) p.r(zzbwgVar, "statsTraceCtx");
    }
}
