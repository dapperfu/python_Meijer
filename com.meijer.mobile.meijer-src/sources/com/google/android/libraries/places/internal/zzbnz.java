package com.google.android.libraries.places.internal;

import De.p;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
class zzbnz implements zzblr {
    private volatile boolean zza;
    private zzblt zzb;
    private zzblr zzc;
    private zzbjv zzd;
    private zzbny zzf;
    private long zzg;
    private long zzh;
    private List zze = new ArrayList();
    private List zzi = new ArrayList();

    @Override // com.google.android.libraries.places.internal.zzblr
    public final zzbez zzam() {
        throw null;
    }

    protected void zze(zzbjv zzbjvVar) {
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public void zzn(zzbpl zzbplVar) {
        synchronized (this) {
            try {
                if (this.zzb == null) {
                    return;
                }
                if (this.zzc != null) {
                    zzbplVar.zzb("buffered_nanos", Long.valueOf(this.zzh - this.zzg));
                    this.zzc.zzn(zzbplVar);
                } else {
                    zzbplVar.zzb("buffered_nanos", Long.valueOf(System.nanoTime() - this.zzg));
                    zzbplVar.zza("waiting_for_connection");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final Runnable zzo(zzblr zzblrVar) {
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    zzj((zzblr) p.r(zzblrVar, "stream"));
                    zzblt zzbltVar = this.zzb;
                    if (zzbltVar == null) {
                        this.zze = null;
                        this.zza = true;
                    }
                    if (zzbltVar != null) {
                        zzi(zzbltVar);
                        return new zzbnp(this);
                    }
                }
            } finally {
            }
        }
        return null;
    }

    final /* synthetic */ zzblr zzq() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzp() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.zze     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.zze = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.zza = r0     // Catch: java.lang.Throwable -> L1d
            com.google.android.libraries.places.internal.zzbny r0 = r3.zzf     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.zze()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.zze     // Catch: java.lang.Throwable -> L1d
            r3.zze = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbnz.zzp():void");
    }

    private final void zzh(Runnable runnable) {
        p.x(this.zzb != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.zza) {
                    runnable.run();
                } else {
                    this.zze.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzi(zzblt zzbltVar) {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.zzi = null;
        this.zzc.zzf(zzbltVar);
    }

    private final void zzj(zzblr zzblrVar) {
        zzblr zzblrVar2 = this.zzc;
        p.z(zzblrVar2 == null, "realStream already set to %s", zzblrVar2);
        this.zzc = zzblrVar;
        this.zzh = System.nanoTime();
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zza(zzbgg zzbggVar) {
        p.x(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzbno(this, zzbggVar));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzb(int i10) {
        p.x(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzbnn(this, i10));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzc(int i10) {
        p.x(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzbnm(this, i10));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzd(zzbgj zzbgjVar) {
        p.x(this.zzb == null, "May only be called before start");
        p.r(zzbgjVar, "decompressorRegistry");
        this.zzi.add(new zzbnl(this, zzbgjVar));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzf(zzblt zzbltVar) {
        zzbjv zzbjvVar;
        boolean z10;
        p.r(zzbltVar, "listener");
        p.x(this.zzb == null, "already started");
        synchronized (this) {
            try {
                zzbjvVar = this.zzd;
                z10 = this.zza;
                if (!z10) {
                    zzbny zzbnyVar = new zzbny(zzbltVar);
                    this.zzf = zzbnyVar;
                    zzbltVar = zzbnyVar;
                }
                this.zzb = zzbltVar;
                this.zzg = System.nanoTime();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zzbjvVar != null) {
            zzbltVar.zzc(zzbjvVar, zzbls.PROCESSED, new zzbip());
        } else if (z10) {
            zzi(zzbltVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public final void zzk() {
        p.x(this.zzb != null, "May only be called after start");
        zzh(new zzbnt(this));
    }

    @Override // com.google.android.libraries.places.internal.zzblr
    public void zzl(zzbjv zzbjvVar) {
        boolean z10 = false;
        p.x(this.zzb != null, "May only be called after start");
        p.r(zzbjvVar, "reason");
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    zzj(zzbst.zza);
                    this.zzd = zzbjvVar;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            zzh(new zzbns(this, zzbjvVar));
            return;
        }
        zzp();
        zze(zzbjvVar);
        this.zzb.zzc(zzbjvVar, zzbls.PROCESSED, new zzbip());
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final boolean zzm() {
        if (this.zza) {
            return this.zzc.zzm();
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzr() {
        p.x(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzbnj(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzs(int i10) {
        p.x(this.zzb != null, "May only be called after start");
        if (this.zza) {
            this.zzc.zzs(i10);
        } else {
            zzh(new zzbni(this, i10));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzt(InputStream inputStream) {
        p.x(this.zzb != null, "May only be called after start");
        p.r(inputStream, "message");
        if (this.zza) {
            this.zzc.zzt(inputStream);
        } else {
            zzh(new zzbnq(this, inputStream));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzu() {
        p.x(this.zzb != null, "May only be called after start");
        if (this.zza) {
            this.zzc.zzu();
        } else {
            zzh(new zzbnr(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwh
    public final void zzv(zzbfu zzbfuVar) {
        p.x(this.zzb == null, "May only be called before start");
        p.r(zzbfuVar, "compressor");
        this.zzi.add(new zzbnk(this, zzbfuVar));
    }

    zzbnz() {
    }
}
