package com.google.android.libraries.places.internal;

import De.j;
import De.p;
import com.google.common.util.concurrent.u;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzblq extends zzbfi {
    private static final Logger zza = Logger.getLogger(zzblq.class.getName());
    private static final double zzb;
    private final zzbiu zzc;
    private final Executor zzd;
    private final boolean zze;
    private final zzblh zzf;
    private final zzbgd zzg;
    private zzblk zzh;
    private final boolean zzi;
    private zzbfd zzj;
    private zzblr zzk;
    private boolean zzl;
    private boolean zzm;
    private final ScheduledExecutorService zzn;
    private zzbgj zzo = zzbgj.zza();
    private final zzbqx zzp;

    final zzblq zzf(zzbgj zzbgjVar) {
        this.zzo = zzbgjVar;
        return this;
    }

    final /* synthetic */ zzbiu zzi() {
        return this.zzc;
    }

    final /* synthetic */ Executor zzj() {
        return this.zzd;
    }

    final /* synthetic */ zzblh zzk() {
        return this.zzf;
    }

    final /* synthetic */ zzbgd zzl() {
        return this.zzg;
    }

    final /* synthetic */ zzblk zzm() {
        return this.zzh;
    }

    final /* synthetic */ zzbfd zzn() {
        return this.zzj;
    }

    final /* synthetic */ zzblr zzo() {
        return this.zzk;
    }

    final /* synthetic */ ScheduledExecutorService zzp() {
        return this.zzn;
    }

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        zzb = TimeUnit.SECONDS.toNanos(1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzbgg zzg() {
        zzbgg zzbggVarZzb = this.zzj.zzb();
        if (zzbggVarZzb == null) {
            return null;
        }
        return zzbggVarZzb;
    }

    private final void zzs(Object obj) {
        p.x(this.zzk != null, "Not started");
        p.x(!this.zzl, "call was cancelled");
        p.x(!this.zzm, "call was half-closed");
        try {
            zzblr zzblrVar = this.zzk;
            if (zzblrVar instanceof zzbvl) {
                ((zzbvl) zzblrVar).zzi(obj);
            } else {
                zzblrVar.zzt(this.zzc.zze(obj));
            }
            if (this.zzi) {
                return;
            }
            this.zzk.zzu();
        } catch (Error e10) {
            this.zzk.zzl(zzbjv.zzb.zze("Client sendMessage() failed with Error"));
            throw e10;
        } catch (RuntimeException e11) {
            this.zzk.zzl(zzbjv.zzb.zzd(e11).zze("Failed to stream message"));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, zzbip zzbipVar) {
        zzblr zzbqwVar;
        int i10 = zzcba.zza;
        p.x(this.zzk == null, "Already started");
        p.x(!this.zzl, "call was cancelled");
        p.r(zzbfhVar, "observer");
        p.r(zzbipVar, "headers");
        zzbgd zzbgdVar = this.zzg;
        zzbfd zzbfdVar = this.zzj;
        zzbfc zzbfcVar = zzbsf.zza;
        zzbsf zzbsfVar = (zzbsf) zzbfdVar.zzi(zzbfcVar);
        if (zzbsfVar != null) {
            Long l10 = zzbsfVar.zzb;
            if (l10 != null) {
                zzbgg zzbggVarZza = zzbgg.zza(l10.longValue(), TimeUnit.NANOSECONDS);
                zzbgg zzbggVarZzb = this.zzj.zzb();
                if (zzbggVarZzb == null || zzbggVarZza.compareTo(zzbggVarZzb) < 0) {
                    this.zzj = this.zzj.zza(zzbggVarZza);
                }
            }
            Boolean bool = zzbsfVar.zzc;
            if (bool != null) {
                this.zzj = bool.booleanValue() ? this.zzj.zzc() : this.zzj.zzd();
            }
            Integer num = zzbsfVar.zzd;
            if (num != null) {
                Integer numZzn = this.zzj.zzn();
                if (numZzn != null) {
                    this.zzj = this.zzj.zzl(Math.min(numZzn.intValue(), num.intValue()));
                } else {
                    this.zzj = this.zzj.zzl(num.intValue());
                }
            }
            Integer num2 = zzbsfVar.zze;
            if (num2 != null) {
                Integer numZzo = this.zzj.zzo();
                if (numZzo != null) {
                    this.zzj = this.zzj.zzm(Math.min(numZzo.intValue(), num2.intValue()));
                } else {
                    this.zzj = this.zzj.zzm(num2.intValue());
                }
            }
        }
        zzbft zzbftVar = zzbfs.zza;
        zzbgj zzbgjVar = this.zzo;
        zzbipVar.zzd(zzbpf.zzf);
        zzbipVar.zzd(zzbpf.zzb);
        zzbil zzbilVar = zzbpf.zzc;
        zzbipVar.zzd(zzbilVar);
        byte[] bArrZza = zzbhd.zza(zzbgjVar);
        if (bArrZza.length != 0) {
            zzbipVar.zzc(zzbilVar, bArrZza);
        }
        zzbipVar.zzd(zzbpf.zzd);
        zzbipVar.zzd(zzbpf.zze);
        zzbgg zzbggVarZzg = zzg();
        boolean z10 = zzbggVarZzg != null && zzbggVarZzg.equals(null);
        zzblk zzblkVar = new zzblk(this, zzbggVarZzg, z10);
        this.zzh = zzblkVar;
        if (zzbggVarZzg == null || zzblkVar.zzd() > 0) {
            zzbpg zzbpgVar = null;
            zzbqx zzbqxVar = this.zzp;
            zzbiu zzbiuVar = this.zzc;
            zzbfd zzbfdVar2 = this.zzj;
            zzbrx zzbrxVar = zzbqxVar.zzb;
            if (zzbrxVar.zzag()) {
                zzbsf zzbsfVar2 = (zzbsf) zzbfdVar2.zzi(zzbfcVar);
                zzbvm zzbvmVar = zzbsfVar2 == null ? null : zzbsfVar2.zzf;
                if (zzbsfVar2 != null) {
                    zzbpgVar = zzbsfVar2.zzg;
                }
                zzbqwVar = new zzbqw(zzbqxVar, zzbiuVar, zzbipVar, zzbfdVar2, zzbvmVar, zzbpgVar, zzbgdVar);
            } else {
                zzbfp[] zzbfpVarArrZzf = zzbpf.zzf(zzbfdVar2, zzbipVar, 0, false);
                zzbgd zzbgdVarZzb = zzbgdVar.zzb();
                try {
                    zzbqwVar = zzbrxVar.zzK().zzb(zzbiuVar, zzbipVar, zzbfdVar2, zzbfpVarArrZzf);
                } finally {
                    zzbgdVar.zzc(zzbgdVarZzb);
                }
            }
            this.zzk = zzbqwVar;
        } else {
            zzbfp[] zzbfpVarArrZzf2 = zzbpf.zzf(this.zzj, zzbipVar, 0, false);
            String str = true != z10 ? "CallOptions" : "Context";
            Long l11 = (Long) this.zzj.zzi(zzbfp.zza);
            double dZzd = this.zzh.zzd();
            double d10 = zzb;
            this.zzk = new zzboo(zzbjv.zzd.zze(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dZzd / d10), Double.valueOf(l11 == null ? 0.0d : l11.longValue() / d10))), zzbls.PROCESSED, zzbfpVarArrZzf2);
        }
        if (this.zze) {
            this.zzk.zzr();
        }
        if (this.zzj.zzn() != null) {
            this.zzk.zzc(this.zzj.zzn().intValue());
        }
        if (this.zzj.zzo() != null) {
            this.zzk.zzb(this.zzj.zzo().intValue());
        }
        if (zzbggVarZzg != null) {
            this.zzk.zza(zzbggVarZzg);
        }
        this.zzk.zzv(zzbftVar);
        this.zzk.zzd(this.zzo);
        this.zzf.zza();
        this.zzk.zzf(new zzblp(this, zzbfhVar));
        this.zzh.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzb(Object obj) {
        int i10 = zzcba.zza;
        zzs(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzc(int i10) {
        int i11 = zzcba.zza;
        p.x(this.zzk != null, "Not started");
        p.e(true, "Number requested must be non-negative");
        this.zzk.zzs(i10);
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzd() {
        int i10 = zzcba.zza;
        p.x(this.zzk != null, "Not started");
        p.x(!this.zzl, "call was cancelled");
        p.x(!this.zzm, "call already half-closed");
        this.zzm = true;
        this.zzk.zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zze(String str, Throwable th2) {
        int i10 = zzcba.zza;
        if (str == null && th2 == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th2 = cancellationException;
        }
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        try {
            if (this.zzk != null) {
                zzbjv zzbjvVar = zzbjv.zzb;
                zzbjv zzbjvVarZze = str != null ? zzbjvVar.zze(str) : zzbjvVar.zze("Call cancelled without message");
                if (th2 != null) {
                    zzbjvVarZze = zzbjvVarZze.zzd(th2);
                }
                this.zzk.zzl(zzbjvVarZze);
            }
            zzblk zzblkVar = this.zzh;
            if (zzblkVar != null) {
                zzblkVar.zzb();
            }
        } finally {
        }
    }

    zzblq(zzbiu zzbiuVar, Executor executor, zzbfd zzbfdVar, zzbqx zzbqxVar, ScheduledExecutorService scheduledExecutorService, zzblh zzblhVar, zzbhb zzbhbVar) {
        int i10 = zzbfv.zza;
        this.zzc = zzbiuVar;
        zzbiuVar.zzb();
        System.identityHashCode(this);
        int i11 = zzcba.zza;
        if (executor == u.a()) {
            this.zzd = new zzbvs();
            this.zze = true;
        } else {
            this.zzd = new zzbvw(executor);
            this.zze = false;
        }
        this.zzf = zzblhVar;
        this.zzg = zzbgd.zza();
        this.zzi = zzbiuVar.zza() == zzbis.UNARY || zzbiuVar.zza() == zzbis.SERVER_STREAMING;
        this.zzj = zzbfdVar;
        this.zzp = zzbqxVar;
        this.zzn = scheduledExecutorService;
    }

    static final /* synthetic */ void zzq(zzbfh zzbfhVar, zzbjv zzbjvVar, zzbip zzbipVar) {
        try {
            zzbfhVar.zzc(zzbjvVar, zzbipVar);
        } catch (RuntimeException e10) {
            zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e10);
        }
    }

    public final String toString() {
        return j.c(this).d("method", this.zzc).toString();
    }
}
