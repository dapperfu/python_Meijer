package com.google.android.libraries.places.internal;

import De.j;
import De.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public class zzbna extends zzbfi {
    private static final zzbfi zzj;
    private final ScheduledFuture zza;
    private final Executor zzb;
    private final zzbgd zzc;
    private volatile boolean zzd;
    private zzbfh zze;
    private zzbfi zzf;
    private zzbjv zzg;
    private List zzh = new ArrayList();
    private zzbmz zzi;

    private final void zzl(zzbjv zzbjvVar, boolean z10) {
        zzbfh zzbfhVar;
        boolean z11;
        synchronized (this) {
            try {
                if (this.zzf == null) {
                    zzo(zzj);
                    zzbfhVar = this.zze;
                    this.zzg = zzbjvVar;
                    z11 = false;
                } else {
                    if (z10) {
                        return;
                    }
                    zzbfhVar = null;
                    z11 = true;
                }
                if (z11) {
                    zzm(new zzbmp(this, zzbjvVar));
                } else {
                    if (zzbfhVar != null) {
                        this.zzb.execute(new zzbmu(this, zzbfhVar, zzbjvVar));
                    }
                    zzi();
                }
                zzg();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzm(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.zzd) {
                    runnable.run();
                } else {
                    this.zzh.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Runnable zzf(zzbfi zzbfiVar) {
        synchronized (this) {
            try {
                if (this.zzf != null) {
                    return null;
                }
                zzo((zzbfi) p.r(zzbfiVar, "call"));
                return new zzbml(this, this.zzc);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void zzg() {
    }

    final /* synthetic */ void zzh(zzbjv zzbjvVar, boolean z10) {
        zzl(zzbjvVar, true);
    }

    final /* synthetic */ zzbgd zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbfi zzk() {
        return this.zzf;
    }

    static {
        Logger.getLogger(zzbna.class.getName());
        zzj = new zzbmt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.zzh     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.zzh = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.zzd = r0     // Catch: java.lang.Throwable -> L24
            com.google.android.libraries.places.internal.zzbmz r0 = r3.zzi     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.zzb
            com.google.android.libraries.places.internal.zzbmn r2 = new com.google.android.libraries.places.internal.zzbmn
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.zzh     // Catch: java.lang.Throwable -> L24
            r3.zzh = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbna.zzi():void");
    }

    private final void zzo(zzbfi zzbfiVar) {
        zzbfi zzbfiVar2 = this.zzf;
        p.z(zzbfiVar2 == null, "realCall already set to %s", zzbfiVar2);
        ScheduledFuture scheduledFuture = this.zza;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzf = zzbfiVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, zzbip zzbipVar) {
        zzbjv zzbjvVar;
        boolean z10;
        p.x(this.zze == null, "already started");
        synchronized (this) {
            try {
                this.zze = (zzbfh) p.r(zzbfhVar, "listener");
                zzbjvVar = this.zzg;
                z10 = this.zzd;
                if (!z10) {
                    zzbmz zzbmzVar = new zzbmz(zzbfhVar);
                    this.zzi = zzbmzVar;
                    zzbfhVar = zzbmzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zzbjvVar != null) {
            this.zzb.execute(new zzbmu(this, zzbfhVar, zzbjvVar));
        } else if (z10) {
            this.zzf.zza(zzbfhVar, zzbipVar);
        } else {
            zzm(new zzbmo(this, zzbfhVar, zzbipVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzb(Object obj) {
        if (this.zzd) {
            this.zzf.zzb(obj);
        } else {
            zzm(new zzbmq(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzc(int i10) {
        if (this.zzd) {
            this.zzf.zzc(i10);
        } else {
            zzm(new zzbmr(this, i10));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zzd() {
        zzm(new zzbms(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public final void zze(String str, Throwable th2) {
        zzbjv zzbjvVar = zzbjv.zzb;
        zzbjv zzbjvVarZze = str != null ? zzbjvVar.zze(str) : zzbjvVar.zze("Call cancelled without message");
        if (th2 != null) {
            zzbjvVarZze = zzbjvVarZze.zzd(th2);
        }
        zzl(zzbjvVarZze, false);
    }

    protected zzbna(Executor executor, ScheduledExecutorService scheduledExecutorService, zzbgg zzbggVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        this.zzb = (Executor) p.r(executor, "callExecutor");
        p.r(scheduledExecutorService, "scheduler");
        this.zzc = zzbgd.zza();
        if (zzbggVar == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jZzc = zzbggVar.zzc(timeUnit);
            long jAbs = Math.abs(jZzc);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jZzc) % timeUnit2.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            if (jZzc < 0) {
                sb2.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline CallOptions will be exceeded in ");
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new zzbmm(this, sb2), jZzc, timeUnit);
        }
        this.zza = scheduledFutureSchedule;
    }

    public final String toString() {
        return j.c(this).d("realCall", this.zzf).toString();
    }
}
